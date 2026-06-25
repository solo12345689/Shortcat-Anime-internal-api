package androidx.compose.ui.layout;

import K0.p0;
import androidx.compose.ui.layout.s;
import i1.EnumC5027t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class r extends s.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f27002b;

    public r(p0 p0Var) {
        this.f27002b = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.s.a
    public int B() {
        return this.f27002b.getRoot().F0();
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f27002b.getDensity().getDensity();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f27002b.getDensity().j1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.s.a
    public EnumC5027t z() {
        return this.f27002b.getLayoutDirection();
    }
}
