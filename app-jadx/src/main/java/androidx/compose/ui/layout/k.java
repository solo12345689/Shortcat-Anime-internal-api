package androidx.compose.ui.layout;

import K0.T;
import androidx.compose.ui.layout.s;
import i1.EnumC5027t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class k extends s.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f26996b;

    public k(T t10) {
        this.f26996b = t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.s.a
    public int B() {
        return this.f26996b.S0();
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f26996b.getDensity();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f26996b.j1();
    }

    @Override // androidx.compose.ui.layout.s.a
    public float q(y yVar, float f10) {
        return yVar.b() != null ? ((Number) yVar.b().invoke(this, Float.valueOf(f10))).floatValue() : this.f26996b.I1(yVar, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.s.a
    public EnumC5027t z() {
        return this.f26996b.getLayoutDirection();
    }
}
