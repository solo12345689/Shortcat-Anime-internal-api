package androidx.compose.foundation.layout;

import I0.A;
import I0.C;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.C5025r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d extends e.c implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f26133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26134b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f26135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f26135a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f26135a, 0, 0, 0.0f, 4, null);
        }
    }

    public d(float f10, boolean z10) {
        this.f26133a = f10;
        this.f26134b = z10;
    }

    private final long E1(long j10) {
        if (this.f26134b) {
            long jI1 = I1(this, j10, false, 1, null);
            C5025r.a aVar = C5025r.f48570b;
            if (!C5025r.e(jI1, aVar.a())) {
                return jI1;
            }
            long jK1 = K1(this, j10, false, 1, null);
            if (!C5025r.e(jK1, aVar.a())) {
                return jK1;
            }
            long jM1 = M1(this, j10, false, 1, null);
            if (!C5025r.e(jM1, aVar.a())) {
                return jM1;
            }
            long jO1 = O1(this, j10, false, 1, null);
            if (!C5025r.e(jO1, aVar.a())) {
                return jO1;
            }
            long jH1 = H1(j10, false);
            if (!C5025r.e(jH1, aVar.a())) {
                return jH1;
            }
            long jJ1 = J1(j10, false);
            if (!C5025r.e(jJ1, aVar.a())) {
                return jJ1;
            }
            long jL1 = L1(j10, false);
            if (!C5025r.e(jL1, aVar.a())) {
                return jL1;
            }
            long jN1 = N1(j10, false);
            if (!C5025r.e(jN1, aVar.a())) {
                return jN1;
            }
        } else {
            long jK12 = K1(this, j10, false, 1, null);
            C5025r.a aVar2 = C5025r.f48570b;
            if (!C5025r.e(jK12, aVar2.a())) {
                return jK12;
            }
            long jI12 = I1(this, j10, false, 1, null);
            if (!C5025r.e(jI12, aVar2.a())) {
                return jI12;
            }
            long jO12 = O1(this, j10, false, 1, null);
            if (!C5025r.e(jO12, aVar2.a())) {
                return jO12;
            }
            long jM12 = M1(this, j10, false, 1, null);
            if (!C5025r.e(jM12, aVar2.a())) {
                return jM12;
            }
            long jJ12 = J1(j10, false);
            if (!C5025r.e(jJ12, aVar2.a())) {
                return jJ12;
            }
            long jH12 = H1(j10, false);
            if (!C5025r.e(jH12, aVar2.a())) {
                return jH12;
            }
            long jN12 = N1(j10, false);
            if (!C5025r.e(jN12, aVar2.a())) {
                return jN12;
            }
            long jL12 = L1(j10, false);
            if (!C5025r.e(jL12, aVar2.a())) {
                return jL12;
            }
        }
        return C5025r.f48570b.a();
    }

    private final long H1(long j10, boolean z10) {
        int iRound;
        int iK = C5009b.k(j10);
        if (iK != Integer.MAX_VALUE && (iRound = Math.round(iK * this.f26133a)) > 0) {
            long jA = AbstractC5026s.a(iRound, iK);
            if (!z10 || AbstractC5010c.i(j10, jA)) {
                return jA;
            }
        }
        return C5025r.f48570b.a();
    }

    static /* synthetic */ long I1(d dVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return dVar.H1(j10, z10);
    }

    private final long J1(long j10, boolean z10) {
        int iRound;
        int iL = C5009b.l(j10);
        if (iL != Integer.MAX_VALUE && (iRound = Math.round(iL / this.f26133a)) > 0) {
            long jA = AbstractC5026s.a(iL, iRound);
            if (!z10 || AbstractC5010c.i(j10, jA)) {
                return jA;
            }
        }
        return C5025r.f48570b.a();
    }

    static /* synthetic */ long K1(d dVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return dVar.J1(j10, z10);
    }

    private final long L1(long j10, boolean z10) {
        int iM = C5009b.m(j10);
        int iRound = Math.round(iM * this.f26133a);
        if (iRound > 0) {
            long jA = AbstractC5026s.a(iRound, iM);
            if (!z10 || AbstractC5010c.i(j10, jA)) {
                return jA;
            }
        }
        return C5025r.f48570b.a();
    }

    static /* synthetic */ long M1(d dVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return dVar.L1(j10, z10);
    }

    private final long N1(long j10, boolean z10) {
        int iN = C5009b.n(j10);
        int iRound = Math.round(iN / this.f26133a);
        if (iRound > 0) {
            long jA = AbstractC5026s.a(iN, iRound);
            if (!z10 || AbstractC5010c.i(j10, jA)) {
                return jA;
            }
        }
        return C5025r.f48570b.a();
    }

    static /* synthetic */ long O1(d dVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return dVar.N1(j10, z10);
    }

    public final void F1(float f10) {
        this.f26133a = f10;
    }

    public final void G1(boolean z10) {
        this.f26134b = z10;
    }

    @Override // K0.E
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f26133a) : interfaceC1686l.I(i10);
    }

    @Override // K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f26133a) : interfaceC1686l.q0(i10);
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        long jE1 = E1(j10);
        if (!C5025r.e(jE1, C5025r.f48570b.a())) {
            j10 = C5009b.f48540b.c(C5025r.g(jE1), C5025r.f(jE1));
        }
        androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
        return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new a(sVarV0), 4, null);
    }

    @Override // K0.E
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f26133a) : interfaceC1686l.Z(i10);
    }

    @Override // K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f26133a) : interfaceC1686l.l0(i10);
    }
}
