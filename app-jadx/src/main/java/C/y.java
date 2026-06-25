package C;

import K0.s0;
import androidx.compose.ui.e;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends e.c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2191b;

    public y(float f10, boolean z10) {
        this.f2190a = f10;
        this.f2191b = z10;
    }

    @Override // K0.s0
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public F b(InterfaceC5011d interfaceC5011d, Object obj) {
        F f10 = obj instanceof F ? (F) obj : null;
        if (f10 == null) {
            f10 = new F(0.0f, false, null, null, 15, null);
        }
        f10.g(this.f2190a);
        f10.f(this.f2191b);
        return f10;
    }

    public final void F1(boolean z10) {
        this.f2191b = z10;
    }

    public final void G1(float f10) {
        this.f2190a = f10;
    }
}
