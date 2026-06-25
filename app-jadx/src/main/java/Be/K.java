package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kf.C5471c;
import kf.C5472d;
import kf.InterfaceC5474f;
import qf.E0;
import qf.G0;
import qf.N0;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.InterfaceC7244w;
import ye.InterfaceC7247z;
import ye.Z;
import ye.a0;
import ye.b0;
import ye.c0;
import ye.h0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class K extends Y implements Z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private InterfaceC7244w f1699A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private InterfaceC7244w f1700B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ye.E f1701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC7242u f1702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Collection f1703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Z f1704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC7224b.a f1705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f1707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f1708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f1709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f1710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f1711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f1712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c0 f1713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c0 f1714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f1715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private L f1716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b0 f1717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1718z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC7235m f1719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ye.E f1720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC7242u f1721c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC7224b.a f1724f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c0 f1727i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Xe.f f1729k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private qf.S f1730l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Z f1722d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1723e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E0 f1725g = E0.f57967b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f1726h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f1728j = null;

        public a() {
            this.f1719a = K.this.b();
            this.f1720b = K.this.r();
            this.f1721c = K.this.getVisibility();
            this.f1724f = K.this.h();
            this.f1727i = K.this.f1713u;
            this.f1729k = K.this.getName();
            this.f1730l = K.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public Z n() {
            return K.this.Q0(this);
        }

        a0 o() {
            Z z10 = this.f1722d;
            if (z10 == null) {
                return null;
            }
            return z10.d();
        }

        b0 p() {
            Z z10 = this.f1722d;
            if (z10 == null) {
                return null;
            }
            return z10.g();
        }

        public a q(boolean z10) {
            this.f1726h = z10;
            return this;
        }

        public a r(InterfaceC7224b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f1724f = aVar;
            return this;
        }

        public a s(ye.E e10) {
            if (e10 == null) {
                a(6);
            }
            this.f1720b = e10;
            return this;
        }

        public a t(InterfaceC7224b interfaceC7224b) {
            this.f1722d = (Z) interfaceC7224b;
            return this;
        }

        public a u(InterfaceC7235m interfaceC7235m) {
            if (interfaceC7235m == null) {
                a(0);
            }
            this.f1719a = interfaceC7235m;
            return this;
        }

        public a v(E0 e02) {
            if (e02 == null) {
                a(15);
            }
            this.f1725g = e02;
            return this;
        }

        public a w(AbstractC7242u abstractC7242u) {
            if (abstractC7242u == null) {
                a(8);
            }
            this.f1721c = abstractC7242u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected K(InterfaceC7235m interfaceC7235m, Z z10, InterfaceC7374h interfaceC7374h, ye.E e10, AbstractC7242u abstractC7242u, boolean z11, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(interfaceC7235m, interfaceC7374h, fVar, null, z11, h0Var);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (e10 == null) {
            T(2);
        }
        if (abstractC7242u == null) {
            T(3);
        }
        if (fVar == null) {
            T(4);
        }
        if (aVar == null) {
            T(5);
        }
        if (h0Var == null) {
            T(6);
        }
        this.f1703k = null;
        this.f1712t = Collections.EMPTY_LIST;
        this.f1701i = e10;
        this.f1702j = abstractC7242u;
        this.f1704l = z10 == null ? this : z10;
        this.f1705m = aVar;
        this.f1706n = z12;
        this.f1707o = z13;
        this.f1708p = z14;
        this.f1709q = z15;
        this.f1710r = z16;
        this.f1711s = z17;
    }

    public static K O0(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, ye.E e10, AbstractC7242u abstractC7242u, boolean z10, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (interfaceC7235m == null) {
            T(7);
        }
        if (interfaceC7374h == null) {
            T(8);
        }
        if (e10 == null) {
            T(9);
        }
        if (abstractC7242u == null) {
            T(10);
        }
        if (fVar == null) {
            T(11);
        }
        if (aVar == null) {
            T(12);
        }
        if (h0Var == null) {
            T(13);
        }
        return new K(interfaceC7235m, null, interfaceC7374h, e10, abstractC7242u, z10, fVar, aVar, h0Var, z11, z12, z13, z14, z15, z16);
    }

    private h0 S0(boolean z10, Z z11) {
        h0 h0VarK;
        if (z10) {
            if (z11 == null) {
                z11 = a();
            }
            h0VarK = z11.k();
        } else {
            h0VarK = h0.f65112a;
        }
        if (h0VarK == null) {
            T(28);
        }
        return h0VarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void T(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Be.K.T(int):void");
    }

    private static InterfaceC7247z T0(G0 g02, ye.Y y10) {
        if (g02 == null) {
            T(30);
        }
        if (y10 == null) {
            T(31);
        }
        if (y10.t0() != null) {
            return y10.t0().c(g02);
        }
        return null;
    }

    private static AbstractC7242u Y0(AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar) {
        return (aVar == InterfaceC7224b.a.FAKE_OVERRIDE && AbstractC7241t.g(abstractC7242u.f())) ? AbstractC7241t.f65127h : abstractC7242u;
    }

    private static c0 d1(G0 g02, Z z10, c0 c0Var) {
        qf.S sP = g02.p(c0Var.getType(), N0.f58000f);
        if (sP == null) {
            return null;
        }
        return new N(z10, new C5471c(z10, sP, ((InterfaceC5474f) c0Var.getValue()).a(), c0Var.getValue()), c0Var.getAnnotations());
    }

    private static c0 e1(G0 g02, Z z10, c0 c0Var) {
        qf.S sP = g02.p(c0Var.getType(), N0.f58000f);
        if (sP == null) {
            return null;
        }
        return new N(z10, new C5472d(z10, sP, c0Var.getValue()), c0Var.getAnnotations());
    }

    @Override // ye.v0
    public boolean B() {
        return this.f1711s;
    }

    @Override // ye.InterfaceC7224b
    public void E0(Collection collection) {
        if (collection == null) {
            T(40);
        }
        this.f1703k = collection;
    }

    @Override // Be.X, ye.InterfaceC7223a
    public c0 K() {
        return this.f1713u;
    }

    @Override // ye.InterfaceC7224b
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Z l0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, boolean z10) {
        Z zN = X0().u(interfaceC7235m).t(null).s(e10).w(abstractC7242u).r(aVar).q(z10).n();
        if (zN == null) {
            T(42);
        }
        return zN;
    }

    @Override // Be.X, ye.InterfaceC7223a
    public c0 O() {
        return this.f1714v;
    }

    @Override // ye.Z
    public InterfaceC7244w P() {
        return this.f1700B;
    }

    protected K P0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, Z z10, InterfaceC7224b.a aVar, Xe.f fVar, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(32);
        }
        if (e10 == null) {
            T(33);
        }
        if (abstractC7242u == null) {
            T(34);
        }
        if (aVar == null) {
            T(35);
        }
        if (fVar == null) {
            T(36);
        }
        if (h0Var == null) {
            T(37);
        }
        return new K(interfaceC7235m, z10, getAnnotations(), e10, abstractC7242u, N(), fVar, aVar, h0Var, z0(), d0(), m0(), Y(), isExternal(), B());
    }

    protected Z Q0(a aVar) {
        c0 c0Var;
        InterfaceC5082a interfaceC5082a;
        if (aVar == null) {
            T(29);
        }
        K kP0 = P0(aVar.f1719a, aVar.f1720b, aVar.f1721c, aVar.f1722d, aVar.f1724f, aVar.f1729k, S0(aVar.f1723e, aVar.f1722d));
        List typeParameters = aVar.f1728j == null ? getTypeParameters() : aVar.f1728j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0B = qf.C.b(typeParameters, aVar.f1725g, kP0, arrayList);
        qf.S s10 = aVar.f1730l;
        qf.S sP = g0B.p(s10, N0.f58001g);
        if (sP == null) {
            return null;
        }
        qf.S sP2 = g0B.p(s10, N0.f58000f);
        if (sP2 != null) {
            kP0.Z0(sP2);
        }
        c0 c0Var2 = aVar.f1727i;
        if (c0Var2 != null) {
            c0 c0VarC = c0Var2.c(g0B);
            if (c0VarC == null) {
                return null;
            }
            c0Var = c0VarC;
        } else {
            c0Var = null;
        }
        c0 c0Var3 = this.f1714v;
        c0 c0VarE1 = c0Var3 != null ? e1(g0B, kP0, c0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f1712t.iterator();
        while (it.hasNext()) {
            c0 c0VarD1 = d1(g0B, kP0, (c0) it.next());
            if (c0VarD1 != null) {
                arrayList2.add(c0VarD1);
            }
        }
        kP0.b1(sP, arrayList, c0Var, c0VarE1, arrayList2);
        L l10 = this.f1716x == null ? null : new L(kP0, this.f1716x.getAnnotations(), aVar.f1720b, Y0(this.f1716x.getVisibility(), aVar.f1724f), this.f1716x.F(), this.f1716x.isExternal(), this.f1716x.isInline(), aVar.f1724f, aVar.o(), h0.f65112a);
        if (l10 != null) {
            qf.S returnType = this.f1716x.getReturnType();
            l10.M0(T0(g0B, this.f1716x));
            l10.P0(returnType != null ? g0B.p(returnType, N0.f58001g) : null);
        }
        M m10 = this.f1717y == null ? null : new M(kP0, this.f1717y.getAnnotations(), aVar.f1720b, Y0(this.f1717y.getVisibility(), aVar.f1724f), this.f1717y.F(), this.f1717y.isExternal(), this.f1717y.isInline(), aVar.f1724f, aVar.p(), h0.f65112a);
        if (m10 != null) {
            List listP0 = AbstractC1123s.P0(m10, this.f1717y.j(), g0B, false, false, null);
            if (listP0 == null) {
                kP0.a1(true);
                listP0 = Collections.singletonList(M.O0(m10, ff.e.m(aVar.f1719a).I(), ((t0) this.f1717y.j().get(0)).getAnnotations()));
            }
            if (listP0.size() != 1) {
                throw new IllegalStateException();
            }
            m10.M0(T0(g0B, this.f1717y));
            m10.Q0((t0) listP0.get(0));
        }
        InterfaceC7244w interfaceC7244w = this.f1699A;
        r rVar = interfaceC7244w == null ? null : new r(interfaceC7244w.getAnnotations(), kP0);
        InterfaceC7244w interfaceC7244w2 = this.f1700B;
        kP0.V0(l10, m10, rVar, interfaceC7244w2 == null ? null : new r(interfaceC7244w2.getAnnotations(), kP0));
        if (aVar.f1726h) {
            Af.k kVarD = Af.k.d();
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                kVarD.add(((Z) it2.next()).c(g0B));
            }
            kP0.E0(kVarD);
        }
        if (d0() && (interfaceC5082a = this.f1763h) != null) {
            kP0.K0(this.f1762g, interfaceC5082a);
        }
        return kP0;
    }

    @Override // ye.Z
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public L d() {
        return this.f1716x;
    }

    public void U0(L l10, b0 b0Var) {
        V0(l10, b0Var, null, null);
    }

    public void V0(L l10, b0 b0Var, InterfaceC7244w interfaceC7244w, InterfaceC7244w interfaceC7244w2) {
        this.f1716x = l10;
        this.f1717y = b0Var;
        this.f1699A = interfaceC7244w;
        this.f1700B = interfaceC7244w2;
    }

    public boolean W0() {
        return this.f1718z;
    }

    public a X0() {
        return new a();
    }

    @Override // ye.D
    public boolean Y() {
        return this.f1709q;
    }

    public void Z0(qf.S s10) {
        if (s10 == null) {
            T(14);
        }
    }

    public void a1(boolean z10) {
        this.f1718z = z10;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.c(this, obj);
    }

    public void b1(qf.S s10, List list, c0 c0Var, c0 c0Var2, List list2) {
        if (s10 == null) {
            T(17);
        }
        if (list == null) {
            T(18);
        }
        if (list2 == null) {
            T(19);
        }
        H0(s10);
        this.f1715w = new ArrayList(list);
        this.f1714v = c0Var2;
        this.f1713u = c0Var;
        this.f1712t = list2;
    }

    public void c1(AbstractC7242u abstractC7242u) {
        if (abstractC7242u == null) {
            T(20);
        }
        this.f1702j = abstractC7242u;
    }

    @Override // ye.u0
    public boolean d0() {
        return this.f1707o;
    }

    @Override // ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public Collection e() {
        Collection collection = this.f1703k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            T(41);
        }
        return collection;
    }

    @Override // ye.Z
    public b0 g() {
        return this.f1717y;
    }

    @Override // Be.X, ye.InterfaceC7223a
    public qf.S getReturnType() {
        qf.S type = getType();
        if (type == null) {
            T(23);
        }
        return type;
    }

    @Override // Be.X, ye.InterfaceC7223a
    public List getTypeParameters() {
        List list = this.f1715w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = this.f1702j;
        if (abstractC7242u == null) {
            T(25);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7224b
    public InterfaceC7224b.a h() {
        InterfaceC7224b.a aVar = this.f1705m;
        if (aVar == null) {
            T(39);
        }
        return aVar;
    }

    @Override // ye.D
    public boolean isExternal() {
        return this.f1710r;
    }

    @Override // ye.D
    public boolean m0() {
        return this.f1708p;
    }

    @Override // ye.InterfaceC7223a
    public Object n0(InterfaceC7223a.InterfaceC0983a interfaceC0983a) {
        return null;
    }

    @Override // ye.D
    public ye.E r() {
        ye.E e10 = this.f1701i;
        if (e10 == null) {
            T(24);
        }
        return e10;
    }

    @Override // ye.Z
    public List w() {
        ArrayList arrayList = new ArrayList(2);
        L l10 = this.f1716x;
        if (l10 != null) {
            arrayList.add(l10);
        }
        b0 b0Var = this.f1717y;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    @Override // ye.Z
    public InterfaceC7244w w0() {
        return this.f1699A;
    }

    @Override // ye.InterfaceC7223a
    public List y0() {
        List list = this.f1712t;
        if (list == null) {
            T(22);
        }
        return list;
    }

    @Override // ye.u0
    public boolean z0() {
        return this.f1706n;
    }

    @Override // ye.j0
    public Z c(G0 g02) {
        if (g02 == null) {
            T(27);
        }
        return g02.k() ? this : X0().v(g02.j()).t(a()).n();
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public Z a() {
        Z z10 = this.f1704l;
        Z zA = z10 == this ? this : z10.a();
        if (zA == null) {
            T(38);
        }
        return zA;
    }
}
