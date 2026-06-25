package androidx.compose.foundation.layout;

import C.EnumC1152x;
import I0.A;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import i1.C5009b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1152x f26171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26172b;

    public m(EnumC1152x enumC1152x, boolean z10) {
        this.f26171a = enumC1152x;
        this.f26172b = z10;
    }

    @Override // androidx.compose.foundation.layout.l
    public long E1(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        int iL0 = this.f26171a == EnumC1152x.Min ? a10.l0(C5009b.k(j10)) : a10.q0(C5009b.k(j10));
        if (iL0 < 0) {
            iL0 = 0;
        }
        return C5009b.f48540b.e(iL0);
    }

    @Override // androidx.compose.foundation.layout.l
    public boolean F1() {
        return this.f26172b;
    }

    public void G1(boolean z10) {
        this.f26172b = z10;
    }

    public final void H1(EnumC1152x enumC1152x) {
        this.f26171a = enumC1152x;
    }

    @Override // androidx.compose.foundation.layout.l, K0.E
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26171a == EnumC1152x.Min ? interfaceC1686l.l0(i10) : interfaceC1686l.q0(i10);
    }

    @Override // androidx.compose.foundation.layout.l, K0.E
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return this.f26171a == EnumC1152x.Min ? interfaceC1686l.l0(i10) : interfaceC1686l.q0(i10);
    }
}
