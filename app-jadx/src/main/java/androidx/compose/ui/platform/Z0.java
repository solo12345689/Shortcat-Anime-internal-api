package androidx.compose.ui.platform;

import Y.b2;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements F1 {

    /* JADX INFO: renamed from: a */
    private InterfaceC5082a f27407a;

    /* JADX INFO: renamed from: b */
    private Y.C0 f27408b;

    /* JADX INFO: renamed from: c */
    private final Y.C0 f27409c = b2.e(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.F1
    public boolean a() {
        return ((Boolean) this.f27409c.getValue()).booleanValue();
    }

    public void c(int i10) {
        G1.f27229a.a().setValue(E0.P.a(i10));
    }

    public final void d(InterfaceC5082a interfaceC5082a) {
        if (this.f27408b == null) {
            this.f27407a = interfaceC5082a;
        }
    }

    public void e(boolean z10) {
        this.f27409c.setValue(Boolean.valueOf(z10));
    }
}
