package ci;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {
        public static g a() {
            return di.a.a() ? di.a.b().f45747a : new b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements g {
        @Override // ci.g
        public void a(Level level, String str, Throwable th2) {
            System.out.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }

        @Override // ci.g
        public void b(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th2);

    void b(Level level, String str);
}
