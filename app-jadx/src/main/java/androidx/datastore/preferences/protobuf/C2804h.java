package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2817v;
import androidx.datastore.preferences.protobuf.m0;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2804h implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2803g f29322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29325d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29326a;

        static {
            int[] iArr = new int[m0.b.values().length];
            f29326a = iArr;
            try {
                iArr[m0.b.f29387j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29326a[m0.b.f29391n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29326a[m0.b.f29380c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29326a[m0.b.f29393p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29326a[m0.b.f29386i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29326a[m0.b.f29385h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29326a[m0.b.f29381d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29326a[m0.b.f29384g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29326a[m0.b.f29382e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29326a[m0.b.f29390m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29326a[m0.b.f29394q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29326a[m0.b.f29395r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29326a[m0.b.f29396s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29326a[m0.b.f29397t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29326a[m0.b.f29388k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29326a[m0.b.f29392o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29326a[m0.b.f29383f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C2804h(AbstractC2803g abstractC2803g) {
        AbstractC2803g abstractC2803g2 = (AbstractC2803g) AbstractC2816u.b(abstractC2803g, "input");
        this.f29322a = abstractC2803g2;
        abstractC2803g2.f29302d = this;
    }

    public static C2804h O(AbstractC2803g abstractC2803g) {
        C2804h c2804h = abstractC2803g.f29302d;
        return c2804h != null ? c2804h : new C2804h(abstractC2803g);
    }

    private void P(Object obj, a0 a0Var, C2809m c2809m) {
        int i10 = this.f29324c;
        this.f29324c = m0.c(m0.a(this.f29323b), 4);
        try {
            a0Var.g(obj, this, c2809m);
            if (this.f29323b == this.f29324c) {
            } else {
                throw C2817v.h();
            }
        } finally {
            this.f29324c = i10;
        }
    }

    private void Q(Object obj, a0 a0Var, C2809m c2809m) throws C2817v {
        int iD = this.f29322a.D();
        AbstractC2803g abstractC2803g = this.f29322a;
        if (abstractC2803g.f29299a >= abstractC2803g.f29300b) {
            throw C2817v.i();
        }
        int iM = abstractC2803g.m(iD);
        this.f29322a.f29299a++;
        a0Var.g(obj, this, c2809m);
        this.f29322a.a(0);
        r5.f29299a--;
        this.f29322a.l(iM);
    }

    private Object R(m0.b bVar, Class cls, C2809m c2809m) {
        switch (a.f29326a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(o());
            case 9:
                return Long.valueOf(H());
            case 10:
                return U(cls, c2809m);
            case 11:
                return Integer.valueOf(E());
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object S(a0 a0Var, C2809m c2809m) {
        Object objB = a0Var.b();
        P(objB, a0Var, c2809m);
        a0Var.c(objB);
        return objB;
    }

    private Object T(a0 a0Var, C2809m c2809m) throws C2817v {
        Object objB = a0Var.b();
        Q(objB, a0Var, c2809m);
        a0Var.c(objB);
        return objB;
    }

    private void W(int i10) throws C2817v {
        if (this.f29322a.e() != i10) {
            throw C2817v.m();
        }
    }

    private void X(int i10) throws C2817v.a {
        if (m0.b(this.f29323b) != i10) {
            throw C2817v.e();
        }
    }

    private void Y(int i10) throws C2817v {
        if ((i10 & 3) != 0) {
            throw C2817v.h();
        }
    }

    private void Z(int i10) throws C2817v {
        if ((i10 & 7) != 0) {
            throw C2817v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int A() {
        int i10 = this.f29325d;
        if (i10 != 0) {
            this.f29323b = i10;
            this.f29325d = 0;
        } else {
            this.f29323b = this.f29322a.C();
        }
        int i11 = this.f29323b;
        if (i11 == 0 || i11 == this.f29324c) {
            return Integer.MAX_VALUE;
        }
        return m0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void B(List list) throws C2817v.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void C(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 2) {
            int iD = this.f29322a.D();
            Y(iD);
            int iE = this.f29322a.e() + iD;
            do {
                list.add(Float.valueOf(this.f29322a.t()));
            } while (this.f29322a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2817v.e();
        }
        do {
            list.add(Float.valueOf(this.f29322a.t()));
            if (this.f29322a.f()) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == this.f29323b);
        this.f29325d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean D() {
        int i10;
        if (this.f29322a.f() || (i10 = this.f29323b) == this.f29324c) {
            return false;
        }
        return this.f29322a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int E() throws C2817v.a {
        X(5);
        return this.f29322a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void F(List list) throws C2817v.a {
        int iC;
        if (m0.b(this.f29323b) != 2) {
            throw C2817v.e();
        }
        do {
            list.add(n());
            if (this.f29322a.f()) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == this.f29323b);
        this.f29325d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void G(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f29322a.p()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iD = this.f29322a.D();
        Z(iD);
        int iE = this.f29322a.e() + iD;
        do {
            list.add(Double.valueOf(this.f29322a.p()));
        } while (this.f29322a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long H() throws C2817v.a {
        X(0);
        return this.f29322a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public String I() throws C2817v.a {
        X(2);
        return this.f29322a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void J(Object obj, a0 a0Var, C2809m c2809m) throws C2817v {
        X(2);
        Q(obj, a0Var, c2809m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void K(List list, a0 a0Var, C2809m c2809m) throws C2817v.a {
        int iC;
        if (m0.b(this.f29323b) != 2) {
            throw C2817v.e();
        }
        int i10 = this.f29323b;
        do {
            list.add(T(a0Var, c2809m));
            if (this.f29322a.f() || this.f29325d != 0) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == i10);
        this.f29325d = iC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f29322a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(java.util.Map r8, androidx.datastore.preferences.protobuf.D.a r9, androidx.datastore.preferences.protobuf.C2809m r10) throws androidx.datastore.preferences.protobuf.C2817v.a {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f29322a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.g r2 = r7.f29322a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.f29213b
            java.lang.Object r3 = r9.f29215d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f29322a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.m0$b r4 = r9.f29214c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            java.lang.Object r5 = r9.f29215d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.m0$b r4 = r9.f29212a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C2817v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.f29322a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.f29322a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2804h.L(java.util.Map, androidx.datastore.preferences.protobuf.D$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void M(Object obj, a0 a0Var, C2809m c2809m) throws C2817v.a {
        X(3);
        P(obj, a0Var, c2809m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void N(List list, a0 a0Var, C2809m c2809m) throws C2817v.a {
        int iC;
        if (m0.b(this.f29323b) != 3) {
            throw C2817v.e();
        }
        int i10 = this.f29323b;
        do {
            list.add(S(a0Var, c2809m));
            if (this.f29322a.f() || this.f29325d != 0) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == i10);
        this.f29325d = iC;
    }

    public Object U(Class cls, C2809m c2809m) throws C2817v.a {
        X(2);
        return T(W.a().c(cls), c2809m);
    }

    public void V(List list, boolean z10) throws C2817v.a {
        int iC;
        if (m0.b(this.f29323b) != 2) {
            throw C2817v.e();
        }
        do {
            list.add(z10 ? I() : z());
            if (this.f29322a.f()) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == this.f29323b);
        this.f29325d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long a() throws C2817v.a {
        X(1);
        return this.f29322a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void b(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 2) {
            int iD = this.f29322a.D();
            Y(iD);
            int iE = this.f29322a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f29322a.w()));
            } while (this.f29322a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2817v.e();
        }
        do {
            list.add(Integer.valueOf(this.f29322a.w()));
            if (this.f29322a.f()) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == this.f29323b);
        this.f29325d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void c(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f29322a.z()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Long.valueOf(this.f29322a.z()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean d() throws C2817v.a {
        X(0);
        return this.f29322a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long e() throws C2817v.a {
        X(1);
        return this.f29322a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void f(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f29322a.E()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Long.valueOf(this.f29322a.E()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int g() throws C2817v.a {
        X(0);
        return this.f29322a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void h(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f29322a.v()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Long.valueOf(this.f29322a.v()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void i(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f29322a.q()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Integer.valueOf(this.f29322a.q()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int j() throws C2817v.a {
        X(0);
        return this.f29322a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int k() throws C2817v.a {
        X(0);
        return this.f29322a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void l(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f29322a.n()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Boolean.valueOf(this.f29322a.n()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void m(List list) throws C2817v.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public AbstractC2802f n() throws C2817v.a {
        X(2);
        return this.f29322a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int o() throws C2817v.a {
        X(0);
        return this.f29322a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void p(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f29322a.s()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iD = this.f29322a.D();
        Z(iD);
        int iE = this.f29322a.e() + iD;
        do {
            list.add(Long.valueOf(this.f29322a.s()));
        } while (this.f29322a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int q() {
        return this.f29323b;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void r(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f29322a.y()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Integer.valueOf(this.f29322a.y()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public double readDouble() throws C2817v.a {
        X(1);
        return this.f29322a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public float readFloat() throws C2817v.a {
        X(5);
        return this.f29322a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long s() throws C2817v.a {
        X(0);
        return this.f29322a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void t(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f29322a.D()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Integer.valueOf(this.f29322a.D()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int u() throws C2817v.a {
        X(5);
        return this.f29322a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void v(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f29322a.x()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iD = this.f29322a.D();
        Z(iD);
        int iE = this.f29322a.e() + iD;
        do {
            list.add(Long.valueOf(this.f29322a.x()));
        } while (this.f29322a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void w(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f29322a.u()));
                if (this.f29322a.f()) {
                    return;
                } else {
                    iC = this.f29322a.C();
                }
            } while (iC == this.f29323b);
            this.f29325d = iC;
            return;
        }
        if (iB != 2) {
            throw C2817v.e();
        }
        int iE = this.f29322a.e() + this.f29322a.D();
        do {
            list.add(Integer.valueOf(this.f29322a.u()));
        } while (this.f29322a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void x(List list) throws C2817v {
        int iC;
        int iB = m0.b(this.f29323b);
        if (iB == 2) {
            int iD = this.f29322a.D();
            Y(iD);
            int iE = this.f29322a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f29322a.r()));
            } while (this.f29322a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C2817v.e();
        }
        do {
            list.add(Integer.valueOf(this.f29322a.r()));
            if (this.f29322a.f()) {
                return;
            } else {
                iC = this.f29322a.C();
            }
        } while (iC == this.f29323b);
        this.f29325d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long y() throws C2817v.a {
        X(0);
        return this.f29322a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public String z() throws C2817v.a {
        X(2);
        return this.f29322a.A();
    }
}
