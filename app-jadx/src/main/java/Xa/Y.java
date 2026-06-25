package xa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f64117a = 100;

    Y() {
    }

    private final void j(Object obj, Q q10, int i10) {
        while (q10.A() != Integer.MAX_VALUE && k(obj, q10, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC7079e abstractC7079e);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract void h(Object obj);

    abstract Object i(Object obj, Object obj2);

    final boolean k(Object obj, Q q10, int i10) throws r {
        int iQ = q10.q();
        int iA = e0.a(iQ);
        int iB = e0.b(iQ);
        if (iB == 0) {
            e(obj, iA, q10.H());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, q10.a());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, q10.n());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw r.e();
            }
            a(obj, iA, q10.u());
            return true;
        }
        Object objL = l();
        int iC = e0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f64117a) {
            throw r.i();
        }
        j(objL, q10, i11);
        if (iC != q10.q()) {
            throw r.b();
        }
        c(obj, iA, p(objL));
        return true;
    }

    abstract Object l();

    abstract void m(Object obj, Object obj2);

    abstract void n(Object obj, Object obj2);

    abstract boolean o(Q q10);

    abstract Object p(Object obj);
}
