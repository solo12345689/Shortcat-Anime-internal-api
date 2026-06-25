package Eb;

import Cf.l;
import Ef.a;
import Ud.AbstractC2279u;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import y1.AbstractC7195c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends File implements k {

    /* JADX INFO: renamed from: a */
    private final Uri f5881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Uri uri) {
        super(URI.create(uri.toString()));
        AbstractC5504s.h(uri, "uri");
        this.f5881a = uri;
    }

    public static final h b(File it) {
        AbstractC5504s.h(it, "it");
        return new h(Uri.fromFile(it));
    }

    @Override // Eb.k
    public InputStream L() {
        return new FileInputStream(this);
    }

    @Override // Eb.k
    public k M(String mimeType, String displayName) throws IOException {
        AbstractC5504s.h(mimeType, "mimeType");
        AbstractC5504s.h(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.createNewFile();
        return new h(Uri.fromFile(file));
    }

    @Override // Eb.k
    public Cf.i N() {
        return l.K(fe.k.q(this, fe.j.f47036a), new Function1() { // from class: Eb.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.b((File) obj);
            }
        });
    }

    @Override // Eb.k
    public k O(String displayName) {
        AbstractC5504s.h(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.mkdir();
        return new h(Uri.fromFile(file));
    }

    @Override // Eb.k
    public OutputStream P(boolean z10) {
        return new FileOutputStream(this, z10);
    }

    @Override // Eb.k
    public List Q() {
        File[] fileArrListFiles = super.listFiles();
        if (fileArrListFiles == null) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            AbstractC5504s.e(file);
            arrayList.add(new h(Uri.fromFile(file)));
        }
        return arrayList;
    }

    @Override // Eb.k
    public boolean R() {
        File[] fileArrListFiles;
        if (isDirectory() && (fileArrListFiles = listFiles()) != null) {
            for (File file : fileArrListFiles) {
                AbstractC5504s.e(file);
                fe.k.z(file);
            }
        }
        return super.delete();
    }

    @Override // Eb.k
    public /* bridge */ /* synthetic */ Long S() {
        return Long.valueOf(lastModified());
    }

    @Override // Eb.k
    public Uri T(Ub.d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        Uri uriH = AbstractC7195c.h(appContext.F().getApplication(), appContext.F().getApplication().getPackageName() + ".FileSystemFileProvider", this);
        AbstractC5504s.g(uriH, "getUriForFile(...)");
        return uriH;
    }

    @Override // Eb.k
    public Uri c() {
        return this.f5881a;
    }

    @Override // Eb.k
    public Long getCreationTime() throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String path = getPath();
        AbstractC5504s.g(path, "getPath(...)");
        Path path2 = Paths.get(path, new String[0]);
        AbstractC5504s.g(path2, "get(...)");
        BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) c.a(), (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
        AbstractC5504s.g(attributes, "readAttributes(...)");
        a.C0060a c0060a = Ef.a.f5961b;
        return Long.valueOf(Ef.a.w(Ef.c.t(attributes.creationTime().toMillis(), Ef.d.f5970d)));
    }

    @Override // Eb.k
    public String getFileName() {
        return super.getName();
    }

    @Override // Eb.k
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }
}
