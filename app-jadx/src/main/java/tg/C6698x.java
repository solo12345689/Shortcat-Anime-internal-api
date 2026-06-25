package tg;

import Ud.AbstractC2279u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.x */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6698x extends AbstractC6690o {
    private final List r(P p10, boolean z10) throws IOException {
        File file = p10.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                AbstractC5504s.e(str);
                arrayList.add(p10.q(str));
            }
            AbstractC2279u.A(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + p10);
        }
        throw new FileNotFoundException("no such file: " + p10);
    }

    private final void s(P p10) throws IOException {
        if (j(p10)) {
            throw new IOException(p10 + " already exists.");
        }
    }

    private final void t(P p10) throws IOException {
        if (j(p10)) {
            return;
        }
        throw new IOException(p10 + " doesn't exist.");
    }

    @Override // tg.AbstractC6690o
    public X b(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        if (z10) {
            t(file);
        }
        return K.f(file.toFile(), true);
    }

    @Override // tg.AbstractC6690o
    public void c(P source, P target) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // tg.AbstractC6690o
    public void g(P dir, boolean z10) throws IOException {
        AbstractC5504s.h(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C6689n c6689nM = m(dir);
        if (c6689nM == null || !c6689nM.f()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // tg.AbstractC6690o
    public void i(P path, boolean z10) throws IOException {
        AbstractC5504s.h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // tg.AbstractC6690o
    public List k(P dir) throws IOException {
        AbstractC5504s.h(dir, "dir");
        List listR = r(dir, true);
        AbstractC5504s.e(listR);
        return listR;
    }

    @Override // tg.AbstractC6690o
    public C6689n m(P path) {
        AbstractC5504s.h(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C6689n(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // tg.AbstractC6690o
    public AbstractC6688m n(P file) {
        AbstractC5504s.h(file, "file");
        return new C6697w(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // tg.AbstractC6690o
    public X p(P file, boolean z10) throws IOException {
        AbstractC5504s.h(file, "file");
        if (z10) {
            s(file);
        }
        return L.g(file.toFile(), false, 1, null);
    }

    @Override // tg.AbstractC6690o
    public Z q(P file) {
        AbstractC5504s.h(file, "file");
        return K.j(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
