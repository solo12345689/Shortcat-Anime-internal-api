package expo.modules.filesystem;

import Cb.a;
import Cb.c;
import Cb.l;
import Cb.m;
import Cb.s;
import Cb.t;
import Df.r;
import Eb.h;
import Eb.i;
import Eb.k;
import Ub.d;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0005R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00107\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "newName", "a1", "(Ljava/lang/String;)Landroid/net/Uri;", "LTd/L;", "S", "()V", "u1", "destination", "Ljava/io/File;", "B0", "(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;", "Lexpo/modules/kotlin/services/FilePermissionService$a;", "permission", "t1", "(Lexpo/modules/kotlin/services/FilePermissionService$a;)V", "", "J", "(Lexpo/modules/kotlin/services/FilePermissionService$a;)Z", "Lexpo/modules/filesystem/CreateOptions;", "options", "q1", "(Lexpo/modules/filesystem/CreateOptions;)V", "to", "O", "(Lexpo/modules/filesystem/FileSystemPath;)V", "G0", "M0", "(Ljava/lang/String;)V", "c", "Landroid/net/Uri;", "F0", "()Landroid/net/Uri;", "setUri", "LEb/k;", "d", "LEb/k;", "fileAdapter", "h0", "()LEb/k;", "file", "k0", "()Ljava/io/File;", "javaFile", "", "p0", "()Ljava/lang/Long;", "modificationTime", "Y", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k fileAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(Uri uri) {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC5504s.h(uri, "uri");
        this.uri = uri;
    }

    private final Uri a1(String newName) {
        String string = this.uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        String strSubstring = string.substring(0, r.o0(r.l1(string, '/'), '/', 0, false, 6, null) + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        String string2 = Uri.withAppendedPath(Uri.parse(strSubstring), newName).toString();
        AbstractC5504s.g(string2, "toString(...)");
        if (this instanceof FileSystemDirectory) {
            string2 = string2 + "/";
        }
        Uri uri = Uri.parse(string2);
        AbstractC5504s.g(uri, "parse(...)");
        return uri;
    }

    public final File B0(FileSystemPath destination) throws c, a {
        AbstractC5504s.h(destination, "destination");
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new a();
            }
            File parentFile = destination.k0().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new c();
            }
            return destination.k0();
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).b2()) {
                return new File(destination.k0(), k0().getName());
            }
            throw new c();
        }
        if (((FileSystemDirectory) destination).b2()) {
            return new File(destination.k0(), k0().getName());
        }
        File parentFile2 = destination.k0().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new c();
        }
        return destination.k0();
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final void G0(FileSystemPath to) throws c, a {
        AbstractC5504s.h(to, "to");
        u1();
        to.u1();
        FilePermissionService.a aVar = FilePermissionService.a.f46180b;
        t1(aVar);
        to.t1(aVar);
        if (Build.VERSION.SDK_INT < 26) {
            fe.k.y(k0(), B0(to), false, 0, 6, null);
            k0().delete();
            this.uri = Uri.fromFile(B0(to));
            return;
        }
        File fileB0 = B0(to);
        Path path = k0().toPath();
        AbstractC5504s.g(path, "toPath(...)");
        Path path2 = fileB0.toPath();
        AbstractC5504s.g(path2, "toPath(...)");
        AbstractC5504s.g(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
        this.uri = Uri.fromFile(fileB0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(expo.modules.kotlin.services.FilePermissionService.a r5) throws cc.i {
        /*
            r4 = this;
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            android.net.Uri r0 = r4.uri
            boolean r0 = Cb.l.b(r0)
            r1 = 1
            if (r0 == 0) goto Lf
            return r1
        Lf:
            android.net.Uri r0 = r4.uri
            boolean r0 = Cb.l.a(r0)
            if (r0 == 0) goto L18
            return r1
        L18:
            Ub.d r0 = r4.l()
            if (r0 == 0) goto L4a
            expo.modules.kotlin.services.FilePermissionService r0 = r0.s()
            if (r0 == 0) goto L4a
            Ub.d r1 = r4.l()
            if (r1 == 0) goto L44
            android.content.Context r1 = r1.B()
            if (r1 == 0) goto L44
            java.io.File r2 = r4.k0()
            java.lang.String r2 = r2.getPath()
            java.lang.String r3 = "getPath(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r2, r3)
            java.util.EnumSet r0 = r0.d(r1, r2)
            if (r0 != 0) goto L50
            goto L4a
        L44:
            cc.i r5 = new cc.i
            r5.<init>()
            throw r5
        L4a:
            java.lang.Class<expo.modules.kotlin.services.FilePermissionService$a> r0 = expo.modules.kotlin.services.FilePermissionService.a.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
        L50:
            boolean r5 = r0.contains(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemPath.J(expo.modules.kotlin.services.FilePermissionService$a):boolean");
    }

    public final void M0(String newName) throws IOException, s {
        AbstractC5504s.h(newName, "newName");
        u1();
        t1(FilePermissionService.a.f46180b);
        l.d(newName);
        File parentFile = k0().getParentFile();
        if (parentFile == null) {
            throw new s("parent directory does not exist");
        }
        String canonicalPath = parentFile.getCanonicalPath();
        File file = new File(parentFile, newName);
        File parentFile2 = file.getCanonicalFile().getParentFile();
        if (!AbstractC5504s.c(parentFile2 != null ? parentFile2.getCanonicalPath() : null, canonicalPath)) {
            throw new s("child path escapes parent directory");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Path path = k0().toPath();
            AbstractC5504s.g(path, "toPath(...)");
            Path path2 = file.toPath();
            AbstractC5504s.g(path2, "toPath(...)");
            AbstractC5504s.g(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
        } else {
            fe.k.y(k0(), file, false, 0, 6, null);
            k0().delete();
        }
        this.uri = a1(newName);
    }

    public final void O(FileSystemPath to) {
        AbstractC5504s.h(to, "to");
        u1();
        to.u1();
        t1(FilePermissionService.a.f46179a);
        to.t1(FilePermissionService.a.f46180b);
        fe.k.v(k0(), B0(to), false, null, 6, null);
    }

    public final void S() throws t {
        t1(FilePermissionService.a.f46180b);
        if (!h0().exists()) {
            throw new t("uri '" + h0().c() + "' does not exist");
        }
        if (h0().isDirectory()) {
            if (h0().R()) {
                return;
            }
            throw new t("failed to delete '" + h0().c() + "'");
        }
        if (h0().delete()) {
            return;
        }
        throw new t("failed to delete '" + h0().c() + "'");
    }

    public final Long Y() {
        return h0().getCreationTime();
    }

    public final k h0() {
        k hVar;
        Context contextB;
        Context contextB2;
        k kVar = this.fileAdapter;
        if (AbstractC5504s.c(kVar != null ? kVar.c() : null, this.uri)) {
            return kVar;
        }
        if (l.b(this.uri)) {
            d dVarL = l();
            if (dVarL == null || (contextB2 = dVarL.B()) == null) {
                throw new Exception("No context");
            }
            hVar = new i(contextB2, this.uri);
        } else if (l.a(this.uri)) {
            d dVarL2 = l();
            if (dVarL2 == null || (contextB = dVarL2.B()) == null) {
                throw new Exception("No context");
            }
            hVar = new Eb.a(contextB, this.uri);
        } else {
            hVar = new h(this.uri);
        }
        this.fileAdapter = hVar;
        return hVar;
    }

    public final File k0() throws Exception {
        if (!l.b(this.uri)) {
            Object objH0 = h0();
            AbstractC5504s.f(objH0, "null cannot be cast to non-null type java.io.File");
            return (File) objH0;
        }
        throw new Exception("This method cannot be used with content URIs: " + this.uri);
    }

    public final Long p0() {
        u1();
        return h0().S();
    }

    public final void q1(CreateOptions options) {
        AbstractC5504s.h(options, "options");
        if (!options.getOverwrite() && h0().exists()) {
            throw new s("it already exists");
        }
    }

    public final void t1(FilePermissionService.a permission) {
        AbstractC5504s.h(permission, "permission");
        if (!J(permission)) {
            throw new m(permission);
        }
    }

    public abstract void u1();
}
