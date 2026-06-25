package Qa;

import android.view.VelocityTracker;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14545f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C f14546g = new C(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C f14547h = new C(1.0d, 0.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C f14548i = new C(0.0d, -1.0d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C f14549j = new C(0.0d, 1.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C f14550k = new C(1.0d, -1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C f14551l = new C(1.0d, 1.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C f14552m = new C(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C f14553n = new C(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C f14554o = new C(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f14555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f14556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f14557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f14558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f14559e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i10) {
            switch (i10) {
                case 1:
                    return C.f14547h;
                case 2:
                    return C.f14546g;
                case 3:
                case 7:
                default:
                    return C.f14554o;
                case 4:
                    return C.f14548i;
                case 5:
                    return C.f14550k;
                case 6:
                    return C.f14552m;
                case 8:
                    return C.f14549j;
                case 9:
                    return C.f14551l;
                case 10:
                    return C.f14553n;
            }
        }

        public final C b(VelocityTracker tracker) {
            AbstractC5504s.h(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new C(tracker.getXVelocity(), tracker.getYVelocity());
        }

        private a() {
        }
    }

    public C(double d10, double d11) {
        this.f14555a = d10;
        this.f14556b = d11;
        double dHypot = Math.hypot(d10, d11);
        this.f14559e = dHypot;
        boolean z10 = dHypot > 0.1d;
        this.f14557c = z10 ? d10 / dHypot : 0.0d;
        this.f14558d = z10 ? d11 / dHypot : 0.0d;
    }

    private final double j(C c10) {
        return (this.f14557c * c10.f14557c) + (this.f14558d * c10.f14558d);
    }

    public final double k() {
        return this.f14559e;
    }

    public final boolean l(C vector, double d10) {
        AbstractC5504s.h(vector, "vector");
        return j(vector) > d10;
    }
}
