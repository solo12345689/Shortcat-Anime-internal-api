package P2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f13265a;

    public C(A a10) {
        this.f13265a = a10;
    }

    @Override // P2.A
    public boolean a(int i10, long j10) {
        return this.f13265a.a(i10, j10);
    }

    @Override // P2.A
    public int b() {
        return this.f13265a.b();
    }

    @Override // P2.A
    public boolean c(long j10, N2.e eVar, List list) {
        return this.f13265a.c(j10, eVar, list);
    }

    @Override // P2.A
    public void disable() {
        this.f13265a.disable();
    }

    @Override // P2.A
    public void enable() {
        this.f13265a.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return this.f13265a.equals(((C) obj).f13265a);
        }
        return false;
    }

    @Override // P2.E
    public int f(int i10) {
        return this.f13265a.f(i10);
    }

    @Override // P2.A
    public boolean g(int i10, long j10) {
        return this.f13265a.g(i10, j10);
    }

    @Override // P2.A
    public void h(float f10) {
        this.f13265a.h(f10);
    }

    public int hashCode() {
        return this.f13265a.hashCode();
    }

    @Override // P2.A
    public Object i() {
        return this.f13265a.i();
    }

    @Override // P2.A
    public void j() {
        this.f13265a.j();
    }

    @Override // P2.A
    public void k(long j10, long j11, long j12, List list, N2.n[] nVarArr) {
        this.f13265a.k(j10, j11, j12, list, nVarArr);
    }

    @Override // P2.E
    public int l(int i10) {
        return this.f13265a.l(i10);
    }

    @Override // P2.E
    public int length() {
        return this.f13265a.length();
    }

    @Override // P2.A
    public void n(boolean z10) {
        this.f13265a.n(z10);
    }

    @Override // P2.A
    public int o(long j10, List list) {
        return this.f13265a.o(j10, list);
    }

    @Override // P2.A
    public int p() {
        return this.f13265a.p();
    }

    @Override // P2.A
    public int r() {
        return this.f13265a.r();
    }

    @Override // P2.A
    public void s() {
        this.f13265a.s();
    }

    public A t() {
        return this.f13265a;
    }
}
