package x5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: x5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0963c extends FileNotFoundException {
        public C0963c(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d extends IOException {
        public d(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static void a(File file) throws a {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) throws d {
        k.g(file);
        k.g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new C0963c(file.getAbsolutePath()) : new b(file2.getAbsolutePath()));
    }
}
