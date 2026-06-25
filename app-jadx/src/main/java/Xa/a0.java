package xa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a0 extends Y {
    a0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void n(Object obj, Z z10) {
        ((AbstractC7090p) obj).f64247c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Z p(Z z10) {
        z10.f();
        return z10;
    }

    @Override // xa.Y
    void h(Object obj) {
        g(obj).f();
    }

    @Override // xa.Y
    boolean o(Q q10) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void a(Z z10, int i10, int i11) {
        z10.l(e0.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void b(Z z10, int i10, long j10) {
        z10.l(e0.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(Z z10, int i10, Z z11) {
        z10.l(e0.c(i10, 3), z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(Z z10, int i10, AbstractC7079e abstractC7079e) {
        z10.l(e0.c(i10, 2), abstractC7079e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void e(Z z10, int i10, long j10) {
        z10.l(e0.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Z f(Object obj) {
        Z zG = g(obj);
        if (zG != Z.c()) {
            return zG;
        }
        Z zI = Z.i();
        n(obj, zI);
        return zI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Z g(Object obj) {
        return ((AbstractC7090p) obj).f64247c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Z i(Z z10, Z z11) {
        return Z.c().equals(z11) ? z10 : Z.c().equals(z10) ? Z.h(z10, z11) : z10.g(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Z l() {
        return Z.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // xa.Y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m(Object obj, Z z10) {
        n(obj, z10);
    }
}
