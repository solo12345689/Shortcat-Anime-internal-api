package tg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC5504s;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class J extends C6698x {
    private final Long v(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // tg.C6698x, tg.AbstractC6690o
    public void c(P source, P target) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(target, "target");
        try {
            Files.move(source.t(), target.t(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // tg.C6698x, tg.AbstractC6690o
    public C6689n m(P path) {
        AbstractC5504s.h(path, "path");
        return u(path.t());
    }

    @Override // tg.C6698x
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final C6689n u(Path nioPath) {
        AbstractC5504s.h(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) Eb.c.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            P pF = symbolicLink != null ? P.a.f(P.f60968b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lV = fileTimeCreationTime != null ? v(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lV2 = fileTimeLastModifiedTime != null ? v(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C6689n(zIsRegularFile, zIsDirectory, pF, lValueOf, lV, lV2, fileTimeLastAccessTime != null ? v(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
