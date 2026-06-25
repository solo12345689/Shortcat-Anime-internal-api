package K0;

import Y.b2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f10389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y.C0 f10390b;

    public A(J j10, I0.B b10) {
        this.f10389a = j10;
        this.f10390b = b2.e(b10, null, 2, null);
    }

    private final I0.B a() {
        return (I0.B) this.f10390b.getValue();
    }

    private final void j(I0.B b10) {
        this.f10390b.setValue(b10);
    }

    public final int b(int i10) {
        return a().maxIntrinsicHeight(this.f10389a.w0(), this.f10389a.O(), i10);
    }

    public final int c(int i10) {
        return a().maxIntrinsicWidth(this.f10389a.w0(), this.f10389a.O(), i10);
    }

    public final int d(int i10) {
        return a().maxIntrinsicHeight(this.f10389a.w0(), this.f10389a.N(), i10);
    }

    public final int e(int i10) {
        return a().maxIntrinsicWidth(this.f10389a.w0(), this.f10389a.N(), i10);
    }

    public final int f(int i10) {
        return a().minIntrinsicHeight(this.f10389a.w0(), this.f10389a.O(), i10);
    }

    public final int g(int i10) {
        return a().minIntrinsicWidth(this.f10389a.w0(), this.f10389a.O(), i10);
    }

    public final int h(int i10) {
        return a().minIntrinsicHeight(this.f10389a.w0(), this.f10389a.N(), i10);
    }

    public final int i(int i10) {
        return a().minIntrinsicWidth(this.f10389a.w0(), this.f10389a.N(), i10);
    }

    public final void k(I0.B b10) {
        j(b10);
    }
}
