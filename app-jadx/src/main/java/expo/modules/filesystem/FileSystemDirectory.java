package expo.modules.filesystem;

import Cb.l;
import Cb.o;
import Cb.s;
import Df.r;
import Eb.k;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.net.Uri;
import expo.modules.filesystem.FileSystemDirectory;
import expo.modules.kotlin.services.FilePermissionService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lexpo/modules/filesystem/FileSystemDirectory;", "Lexpo/modules/filesystem/FileSystemPath;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "fileName", "LTd/L;", "g2", "(Ljava/lang/String;)V", "h2", "()V", "u1", "Lexpo/modules/filesystem/DirectoryInfo;", "d2", "()Lexpo/modules/filesystem/DirectoryInfo;", "Lexpo/modules/filesystem/CreateOptions;", "options", "Y1", "(Lexpo/modules/filesystem/CreateOptions;)V", "mimeType", "Lexpo/modules/filesystem/FileSystemFile;", "a2", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemFile;", "Z1", "(Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemDirectory;", "", "", "", "e2", "()Ljava/util/List;", "S1", "()Ljava/lang/String;", "", "f2", "(Lexpo/modules/filesystem/CreateOptions;)Z", "b2", "()Z", "exists", "", "c2", "()J", "size", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(Uri uri) {
        super(uri);
        AbstractC5504s.h(uri, "uri");
    }

    public static final boolean D1(k it) {
        AbstractC5504s.h(it, "it");
        return it.isFile();
    }

    public static final long O1(k it) {
        AbstractC5504s.h(it, "it");
        return it.length();
    }

    private final void g2(String fileName) throws IOException, s {
        l.d(fileName);
        if (l.b(getUri()) || l.a(getUri())) {
            return;
        }
        File canonicalFile = k0().getCanonicalFile();
        File parentFile = new File(canonicalFile, fileName).getCanonicalFile().getParentFile();
        if (!AbstractC5504s.c(parentFile != null ? parentFile.getCanonicalPath() : null, canonicalFile.getCanonicalPath())) {
            throw new s("child path escapes parent directory");
        }
    }

    public final String S1() {
        String string = h0().c().toString();
        AbstractC5504s.g(string, "toString(...)");
        if (r.A(string, "/", false, 2, null)) {
            return string;
        }
        return string + "/";
    }

    public final void Y1(CreateOptions options) throws s, o {
        AbstractC5504s.h(options, "options");
        u1();
        t1(FilePermissionService.a.f46180b);
        if (f2(options)) {
            if (l.b(getUri())) {
                throw new s("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
            }
            q1(options);
            if (options.getOverwrite() && h0().exists()) {
                h0().delete();
            }
            if (!(options.getIntermediates() ? k0().mkdirs() : k0().mkdir())) {
                throw new s("directory already exists or could not be created");
            }
        }
    }

    public final FileSystemDirectory Z1(String fileName) throws IOException, s, o {
        AbstractC5504s.h(fileName, "fileName");
        u1();
        t1(FilePermissionService.a.f46180b);
        g2(fileName);
        k kVarO = h0().O(fileName);
        if (kVarO != null) {
            return new FileSystemDirectory(kVarO.c());
        }
        throw new s("directory could not be created");
    }

    public final FileSystemFile a2(String mimeType, String fileName) throws IOException, s, o {
        AbstractC5504s.h(fileName, "fileName");
        u1();
        t1(FilePermissionService.a.f46180b);
        g2(fileName);
        k kVarH0 = h0();
        if (mimeType == null) {
            mimeType = "text/plain";
        }
        k kVarM = kVarH0.M(mimeType, fileName);
        if (kVarM != null) {
            return new FileSystemFile(kVarM.c());
        }
        throw new s("file could not be created");
    }

    public final boolean b2() {
        if (J(FilePermissionService.a.f46179a)) {
            return h0().isDirectory();
        }
        return false;
    }

    public final long c2() throws o {
        t1(FilePermissionService.a.f46179a);
        u1();
        return Cf.l.P(Cf.l.K(Cf.l.z(h0().N(), new Function1() { // from class: Cb.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileSystemDirectory.D1((Eb.k) obj));
            }
        }), new Function1() { // from class: Cb.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(FileSystemDirectory.O1((Eb.k) obj));
            }
        }));
    }

    public final DirectoryInfo d2() throws o {
        u1();
        t1(FilePermissionService.a.f46179a);
        if (!h0().exists()) {
            return new DirectoryInfo(false, l.c(h0().c().toString()), null, null, null, null, null, 124, null);
        }
        String strC = l.c(h0().c().toString());
        List listQ = h0().Q();
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            String fileName = ((k) it.next()).getFileName();
            if (fileName != null) {
                arrayList.add(fileName);
            }
        }
        return new DirectoryInfo(true, strC, arrayList, null, Long.valueOf(c2()), p0(), Y(), 8, null);
    }

    public final List e2() throws o {
        u1();
        t1(FilePermissionService.a.f46179a);
        List<k> listQ = h0().Q();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listQ, 10));
        for (k kVar : listQ) {
            String string = kVar.c().toString();
            AbstractC5504s.g(string, "toString(...)");
            boolean zIsDirectory = kVar.isDirectory();
            Pair pairA = z.a("isDirectory", Boolean.valueOf(zIsDirectory));
            if (zIsDirectory && !r.A(string, "/", false, 2, null)) {
                string = string + "/";
            }
            arrayList.add(S.l(pairA, z.a("uri", string)));
        }
        return arrayList;
    }

    public final boolean f2(CreateOptions options) {
        AbstractC5504s.h(options, "options");
        return (h0().exists() && options.getIdempotent()) ? false : true;
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public void u1() throws o {
        if (h0().exists() && !h0().isDirectory()) {
            throw new o();
        }
    }

    public final void h2() {
    }
}
