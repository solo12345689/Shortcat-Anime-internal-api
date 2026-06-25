package U0;

import U0.R0;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18757a = a.f18758a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f18758a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final R0 f18759b = new R0() { // from class: U0.O0
            @Override // U0.R0
            public final boolean a(C6226h c6226h, C6226h c6226h2) {
                return R0.a.d(c6226h, c6226h2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final R0 f18760c = new R0() { // from class: U0.P0
            @Override // U0.R0
            public final boolean a(C6226h c6226h, C6226h c6226h2) {
                return R0.a.e(c6226h, c6226h2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final R0 f18761d = new R0() { // from class: U0.Q0
            @Override // U0.R0
            public final boolean a(C6226h c6226h, C6226h c6226h2) {
                return R0.a.f(c6226h, c6226h2);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(C6226h c6226h, C6226h c6226h2) {
            return c6226h.r(c6226h2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(C6226h c6226h, C6226h c6226h2) {
            return !c6226h2.q() && c6226h.i() >= c6226h2.i() && c6226h.j() <= c6226h2.j() && c6226h.l() >= c6226h2.l() && c6226h.e() <= c6226h2.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(C6226h c6226h, C6226h c6226h2) {
            return c6226h2.b(c6226h.g());
        }

        public final R0 g() {
            return f18759b;
        }

        public final R0 h() {
            return f18761d;
        }
    }

    boolean a(C6226h c6226h, C6226h c6226h2);
}
