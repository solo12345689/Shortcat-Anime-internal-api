package v;

import i1.InterfaceC5011d;
import w.InterfaceC6880I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC6880I {

    /* JADX INFO: renamed from: a */
    private final o f61691a;

    public z(InterfaceC5011d interfaceC5011d) {
        this.f61691a = new o(AbstractC6778A.a(), interfaceC5011d);
    }

    private final float f(float f10) {
        return this.f61691a.b(f10) * Math.signum(f10);
    }

    @Override // w.InterfaceC6880I
    public float a() {
        return 0.0f;
    }

    @Override // w.InterfaceC6880I
    public float b(long j10, float f10, float f11) {
        return this.f61691a.d(f11).b(j10 / 1000000);
    }

    @Override // w.InterfaceC6880I
    public long c(float f10, float f11) {
        return this.f61691a.c(f11) * 1000000;
    }

    @Override // w.InterfaceC6880I
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // w.InterfaceC6880I
    public float e(long j10, float f10, float f11) {
        return f10 + this.f61691a.d(f11).a(j10 / 1000000);
    }
}
