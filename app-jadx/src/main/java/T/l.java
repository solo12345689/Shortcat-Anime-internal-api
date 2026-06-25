package T;

import K0.InterfaceC1794j;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import i1.C5015h;
import ie.InterfaceC5082a;
import s0.C6385r0;
import s0.InterfaceC6389t0;
import w.AbstractC6877F;
import w.InterfaceC6904i;
import w.r0;
import x.InterfaceC6987G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a */
    private static final r0 f16740a = new r0(15, 0, AbstractC6877F.e(), 2, null);

    public static final InterfaceC1794j c(B.k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a) {
        return o.d(kVar, z10, f10, interfaceC6389t0, interfaceC5082a);
    }

    public static final InterfaceC6904i d(B.j jVar) {
        return jVar instanceof B.g ? f16740a : jVar instanceof B.d ? new r0(45, 0, AbstractC6877F.e(), 2, null) : jVar instanceof B.b ? new r0(45, 0, AbstractC6877F.e(), 2, null) : f16740a;
    }

    public static final InterfaceC6904i e(B.j jVar) {
        return jVar instanceof B.g ? f16740a : jVar instanceof B.d ? f16740a : jVar instanceof B.b ? new r0(150, 0, AbstractC6877F.e(), 2, null) : f16740a;
    }

    public static final InterfaceC6987G f(boolean z10, float f10, long j10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i11 & 4) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        h2 h2VarO = U1.o(C6385r0.m(j10), interfaceC2425m, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.a(z10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !interfaceC2425m.b(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objD = interfaceC2425m.D();
        if (z13 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new b(z10, f10, h2VarO, null);
            interfaceC2425m.u(objD);
        }
        b bVar = (b) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return bVar;
    }
}
