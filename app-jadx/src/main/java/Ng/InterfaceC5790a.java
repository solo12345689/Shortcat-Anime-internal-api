package ng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import tg.K;
import tg.L;
import tg.X;
import tg.Z;

/* JADX INFO: renamed from: ng.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0841a f54133a = C0841a.f54135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC5790a f54134b = new C0841a.C0842a();

    /* JADX INFO: renamed from: ng.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0841a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0841a f54135a = new C0841a();

        /* JADX INFO: renamed from: ng.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0842a implements InterfaceC5790a {
            @Override // ng.InterfaceC5790a
            public void a(File directory) throws IOException {
                AbstractC5504s.h(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        AbstractC5504s.g(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // ng.InterfaceC5790a
            public boolean b(File file) {
                AbstractC5504s.h(file, "file");
                return file.exists();
            }

            @Override // ng.InterfaceC5790a
            public X c(File file) {
                AbstractC5504s.h(file, "file");
                try {
                    return K.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return K.a(file);
                }
            }

            @Override // ng.InterfaceC5790a
            public long d(File file) {
                AbstractC5504s.h(file, "file");
                return file.length();
            }

            @Override // ng.InterfaceC5790a
            public Z e(File file) {
                AbstractC5504s.h(file, "file");
                return K.j(file);
            }

            @Override // ng.InterfaceC5790a
            public X f(File file) {
                AbstractC5504s.h(file, "file");
                try {
                    return L.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return L.g(file, false, 1, null);
                }
            }

            @Override // ng.InterfaceC5790a
            public void g(File from, File to) throws IOException {
                AbstractC5504s.h(from, "from");
                AbstractC5504s.h(to, "to");
                h(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // ng.InterfaceC5790a
            public void h(File file) throws IOException {
                AbstractC5504s.h(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0841a() {
        }
    }

    void a(File file);

    boolean b(File file);

    X c(File file);

    long d(File file);

    Z e(File file);

    X f(File file);

    void g(File file, File file2);

    void h(File file);
}
