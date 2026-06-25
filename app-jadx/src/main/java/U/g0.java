package U;

import Td.InterfaceC2158i;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5499m;
import s0.C6385r0;
import s0.InterfaceC6389t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a */
    public static final g0 f18344a = new g0();

    /* JADX INFO: renamed from: b */
    private static final float f18345b = C5015h.n(56);

    /* JADX INFO: renamed from: c */
    private static final float f18346c = C5015h.n(280);

    /* JADX INFO: renamed from: d */
    private static final float f18347d;

    /* JADX INFO: renamed from: e */
    private static final float f18348e;

    /* JADX INFO: renamed from: f */
    private static final float f18349f;

    /* JADX INFO: renamed from: g */
    private static final float f18350g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC6389t0, InterfaceC5499m {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5082a f18351a;

        a(InterfaceC5082a interfaceC5082a) {
            this.f18351a = interfaceC5082a;
        }

        @Override // s0.InterfaceC6389t0
        public final /* synthetic */ long a() {
            return ((C6385r0) this.f18351a.invoke()).A();
        }

        @Override // kotlin.jvm.internal.InterfaceC5499m
        public final InterfaceC2158i b() {
            return this.f18351a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC6389t0) && (obj instanceof InterfaceC5499m)) {
                return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static {
        float fN = C5015h.n(1);
        f18347d = fN;
        float fN2 = C5015h.n(2);
        f18348e = fN2;
        f18349f = fN;
        f18350g = fN2;
    }

    private g0() {
    }

    public static /* synthetic */ C.A b(g0 g0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = W.j.r();
        }
        if ((i10 & 2) != 0) {
            f11 = W.j.q();
        }
        if ((i10 & 4) != 0) {
            f12 = W.j.r();
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.n(0);
        }
        return g0Var.a(f10, f11, f12, f13);
    }

    public final C.A a(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.p.d(f10, f11, f12, f13);
    }
}
