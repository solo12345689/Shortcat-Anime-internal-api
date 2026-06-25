package xa;

/* JADX INFO: renamed from: xa.H */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7074H implements S {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7070D f64092a;

    /* JADX INFO: renamed from: b */
    private final Y f64093b;

    /* JADX INFO: renamed from: c */
    private final boolean f64094c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7085k f64095d;

    private C7074H(Y y10, AbstractC7085k abstractC7085k, InterfaceC7070D interfaceC7070D) {
        this.f64093b = y10;
        this.f64094c = abstractC7085k.d(interfaceC7070D);
        this.f64095d = abstractC7085k;
        this.f64092a = interfaceC7070D;
    }

    private void h(Y y10, AbstractC7085k abstractC7085k, Object obj, Q q10, C7084j c7084j) throws Throwable {
        Y y11;
        AbstractC7085k abstractC7085k2;
        Q q11;
        C7084j c7084j2;
        Object objF = y10.f(obj);
        AbstractC7088n abstractC7088nC = abstractC7085k.c(obj);
        while (q10.A() != Integer.MAX_VALUE) {
            try {
                y11 = y10;
                abstractC7085k2 = abstractC7085k;
                q11 = q10;
                c7084j2 = c7084j;
            } catch (Throwable th2) {
                th = th2;
                y11 = y10;
            }
            try {
                if (!j(q11, c7084j2, abstractC7085k2, abstractC7088nC, y11, objF)) {
                    y11.m(obj, objF);
                    return;
                }
                q10 = q11;
                c7084j = c7084j2;
                abstractC7085k = abstractC7085k2;
                y10 = y11;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                y11.m(obj, objF);
                throw th4;
            }
        }
        y10.m(obj, objF);
    }

    static C7074H i(Y y10, AbstractC7085k abstractC7085k, InterfaceC7070D interfaceC7070D) {
        return new C7074H(y10, abstractC7085k, interfaceC7070D);
    }

    private boolean j(Q q10, C7084j c7084j, AbstractC7085k abstractC7085k, AbstractC7088n abstractC7088n, Y y10, Object obj) throws r {
        int iQ = q10.q();
        int iG = 0;
        if (iQ != e0.f64171a) {
            if (e0.b(iQ) != 2) {
                return q10.D();
            }
            Object objA = abstractC7085k.a(c7084j, this.f64092a, e0.a(iQ));
            if (objA == null) {
                return y10.k(obj, q10, 0);
            }
            abstractC7085k.g(q10, objA, c7084j, abstractC7088n);
            return true;
        }
        Object objA2 = null;
        AbstractC7079e abstractC7079eN = null;
        while (q10.A() != Integer.MAX_VALUE) {
            int iQ2 = q10.q();
            if (iQ2 == e0.f64173c) {
                iG = q10.g();
                objA2 = abstractC7085k.a(c7084j, this.f64092a, iG);
            } else if (iQ2 == e0.f64174d) {
                if (objA2 != null) {
                    abstractC7085k.g(q10, objA2, c7084j, abstractC7088n);
                } else {
                    abstractC7079eN = q10.n();
                }
            } else if (!q10.D()) {
                break;
            }
        }
        if (q10.q() != e0.f64172b) {
            throw r.b();
        }
        if (abstractC7079eN != null) {
            if (objA2 != null) {
                abstractC7085k.h(abstractC7079eN, objA2, c7084j, abstractC7088n);
            } else {
                y10.d(obj, iG, abstractC7079eN);
            }
        }
        return true;
    }

    @Override // xa.S
    public void a(Object obj, Object obj2) {
        U.g(this.f64093b, obj, obj2);
        if (this.f64094c) {
            U.e(this.f64095d, obj, obj2);
        }
    }

    @Override // xa.S
    public Object b() {
        InterfaceC7070D interfaceC7070D = this.f64092a;
        return interfaceC7070D instanceof AbstractC7090p ? ((AbstractC7090p) interfaceC7070D).z() : interfaceC7070D.a().w();
    }

    @Override // xa.S
    public void c(Object obj) {
        this.f64093b.h(obj);
        this.f64095d.e(obj);
    }

    @Override // xa.S
    public final boolean d(Object obj) {
        return this.f64095d.b(obj).b();
    }

    @Override // xa.S
    public int e(Object obj) {
        int iHashCode = this.f64093b.g(obj).hashCode();
        return this.f64094c ? (iHashCode * 53) + this.f64095d.b(obj).hashCode() : iHashCode;
    }

    @Override // xa.S
    public boolean f(Object obj, Object obj2) {
        if (!this.f64093b.g(obj).equals(this.f64093b.g(obj2))) {
            return false;
        }
        if (this.f64094c) {
            return this.f64095d.b(obj).equals(this.f64095d.b(obj2));
        }
        return true;
    }

    @Override // xa.S
    public void g(Object obj, Q q10, C7084j c7084j) throws Throwable {
        h(this.f64093b, this.f64095d, obj, q10, c7084j);
    }
}
