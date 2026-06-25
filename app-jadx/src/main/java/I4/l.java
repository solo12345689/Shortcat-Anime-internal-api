package i4;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f48678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0773b f48679b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f48680a;

            public a(Throwable th2) {
                this.f48680a = th2;
            }

            public Throwable a() {
                return this.f48680a;
            }

            public String toString() {
                return "FAILURE (" + this.f48680a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: i4.l$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0773b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0773b() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends b {
            public String toString() {
                return HybridPurchaseLogicBridge.RESULT_SUCCESS;
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f48678a = new b.c();
        f48679b = new b.C0773b();
    }
}
