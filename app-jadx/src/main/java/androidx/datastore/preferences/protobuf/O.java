package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class O implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f29240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f29241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC2810n f29243d;

    private O(h0 h0Var, AbstractC2810n abstractC2810n, K k10) {
        this.f29241b = h0Var;
        this.f29242c = abstractC2810n.e(k10);
        this.f29243d = abstractC2810n;
        this.f29240a = k10;
    }

    private int j(h0 h0Var, Object obj) {
        return h0Var.i(h0Var.g(obj));
    }

    private void k(h0 h0Var, AbstractC2810n abstractC2810n, Object obj, Z z10, C2809m c2809m) throws Throwable {
        h0 h0Var2;
        AbstractC2810n abstractC2810n2;
        Z z11;
        C2809m c2809m2;
        Object objF = h0Var.f(obj);
        C2813q c2813qD = abstractC2810n.d(obj);
        while (z10.A() != Integer.MAX_VALUE) {
            try {
                h0Var2 = h0Var;
                abstractC2810n2 = abstractC2810n;
                z11 = z10;
                c2809m2 = c2809m;
            } catch (Throwable th2) {
                th = th2;
                h0Var2 = h0Var;
            }
            try {
                if (!m(z11, c2809m2, abstractC2810n2, c2813qD, h0Var2, objF)) {
                    h0Var2.o(obj, objF);
                    return;
                }
                z10 = z11;
                c2809m = c2809m2;
                abstractC2810n = abstractC2810n2;
                h0Var = h0Var2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                h0Var2.o(obj, objF);
                throw th4;
            }
        }
        h0Var.o(obj, objF);
    }

    static O l(h0 h0Var, AbstractC2810n abstractC2810n, K k10) {
        return new O(h0Var, abstractC2810n, k10);
    }

    private boolean m(Z z10, C2809m c2809m, AbstractC2810n abstractC2810n, C2813q c2813q, h0 h0Var, Object obj) throws C2817v {
        int iQ = z10.q();
        int iG = 0;
        if (iQ != m0.f29376a) {
            if (m0.b(iQ) != 2) {
                return z10.D();
            }
            Object objB = abstractC2810n.b(c2809m, this.f29240a, m0.a(iQ));
            if (objB == null) {
                return h0Var.m(obj, z10, 0);
            }
            abstractC2810n.h(z10, objB, c2809m, c2813q);
            return true;
        }
        Object objB2 = null;
        AbstractC2802f abstractC2802fN = null;
        while (z10.A() != Integer.MAX_VALUE) {
            int iQ2 = z10.q();
            if (iQ2 == m0.f29378c) {
                iG = z10.g();
                objB2 = abstractC2810n.b(c2809m, this.f29240a, iG);
            } else if (iQ2 == m0.f29379d) {
                if (objB2 != null) {
                    abstractC2810n.h(z10, objB2, c2809m, c2813q);
                } else {
                    abstractC2802fN = z10.n();
                }
            } else if (!z10.D()) {
                break;
            }
        }
        if (z10.q() != m0.f29377b) {
            throw C2817v.b();
        }
        if (abstractC2802fN != null) {
            if (objB2 != null) {
                abstractC2810n.i(abstractC2802fN, objB2, c2809m, c2813q);
            } else {
                h0Var.d(obj, iG, abstractC2802fN);
            }
        }
        return true;
    }

    private void n(h0 h0Var, Object obj, n0 n0Var) {
        h0Var.s(h0Var.g(obj), n0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void a(Object obj, Object obj2) {
        c0.F(this.f29241b, obj, obj2);
        if (this.f29242c) {
            c0.D(this.f29243d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Object b() {
        K k10 = this.f29240a;
        return k10 instanceof AbstractC2815t ? ((AbstractC2815t) k10).I() : k10.a().w();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void c(Object obj) {
        this.f29241b.j(obj);
        this.f29243d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public final boolean d(Object obj) {
        return this.f29243d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public int e(Object obj) {
        int iHashCode = this.f29241b.g(obj).hashCode();
        return this.f29242c ? (iHashCode * 53) + this.f29243d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public boolean f(Object obj, Object obj2) {
        if (!this.f29241b.g(obj).equals(this.f29241b.g(obj2))) {
            return false;
        }
        if (this.f29242c) {
            return this.f29243d.c(obj).equals(this.f29243d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void g(Object obj, Z z10, C2809m c2809m) throws Throwable {
        k(this.f29241b, this.f29243d, obj, z10, c2809m);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public int h(Object obj) {
        int iJ = j(this.f29241b, obj);
        return this.f29242c ? iJ + this.f29243d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public void i(Object obj, n0 n0Var) {
        Iterator itN = this.f29243d.c(obj).n();
        if (itN.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f29241b, obj, n0Var);
    }
}
