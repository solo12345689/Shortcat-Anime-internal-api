package ye;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kf.InterfaceC5475g;
import kf.InterfaceC5476h;
import xf.InterfaceC7160l;
import ye.w0;

/* JADX INFO: renamed from: ye.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7241t {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7242u f65120a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC7242u f65121b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC7242u f65122c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC7242u f65123d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC7242u f65124e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC7242u f65125f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC7242u f65126g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC7242u f65127h;

    /* JADX INFO: renamed from: i */
    public static final AbstractC7242u f65128i;

    /* JADX INFO: renamed from: j */
    public static final Set f65129j;

    /* JADX INFO: renamed from: k */
    private static final Map f65130k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC7242u f65131l;

    /* JADX INFO: renamed from: m */
    private static final InterfaceC5475g f65132m;

    /* JADX INFO: renamed from: n */
    public static final InterfaceC5475g f65133n;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC5475g f65134o;

    /* JADX INFO: renamed from: p */
    private static final InterfaceC7160l f65135p;

    /* JADX INFO: renamed from: q */
    private static final Map f65136q;

    /* JADX INFO: renamed from: ye.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC5475g {
        a() {
        }

        @Override // kf.InterfaceC5475g
        public qf.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ye.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements InterfaceC5475g {
        b() {
        }

        @Override // kf.InterfaceC5475g
        public qf.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ye.t$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements InterfaceC5475g {
        c() {
        }

        @Override // kf.InterfaceC5475g
        public qf.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: ye.t$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d extends r {
        d(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC7235m interfaceC7235m) {
            if (interfaceC7235m == null) {
                g(0);
            }
            return bf.i.j(interfaceC7235m) != i0.f65113a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == 0) {
                g(1);
            }
            if (interfaceC7235m == null) {
                g(2);
            }
            if (bf.i.J(interfaceC7239q) && h(interfaceC7235m)) {
                return AbstractC7241t.f(interfaceC7239q, interfaceC7235m);
            }
            if (interfaceC7239q instanceof InterfaceC7234l) {
                InterfaceC7231i interfaceC7231iB = ((InterfaceC7234l) interfaceC7239q).b();
                if (z10 && bf.i.G(interfaceC7231iB) && bf.i.J(interfaceC7231iB) && (interfaceC7235m instanceof InterfaceC7234l) && bf.i.J(interfaceC7235m.b()) && AbstractC7241t.f(interfaceC7239q, interfaceC7235m)) {
                    return true;
                }
            }
            while (interfaceC7239q != 0) {
                interfaceC7239q = interfaceC7239q.b();
                if (((interfaceC7239q instanceof InterfaceC7227e) && !bf.i.x(interfaceC7239q)) || (interfaceC7239q instanceof N)) {
                    break;
                }
            }
            if (interfaceC7239q == 0) {
                return false;
            }
            while (interfaceC7235m != null) {
                if (interfaceC7239q == interfaceC7235m) {
                    return true;
                }
                if (interfaceC7235m instanceof N) {
                    return (interfaceC7239q instanceof N) && ((N) interfaceC7239q).f().equals(((N) interfaceC7235m).f()) && bf.i.b(interfaceC7235m, interfaceC7239q);
                }
                interfaceC7235m = interfaceC7235m.b();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ye.t$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e extends r {
        e(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            InterfaceC7235m interfaceC7235mQ;
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            if (AbstractC7241t.f65120a.e(interfaceC5475g, interfaceC7239q, interfaceC7235m, z10)) {
                if (interfaceC5475g == AbstractC7241t.f65133n) {
                    return true;
                }
                if (interfaceC5475g != AbstractC7241t.f65132m && (interfaceC7235mQ = bf.i.q(interfaceC7239q, InterfaceC7227e.class)) != null && (interfaceC5475g instanceof InterfaceC5476h)) {
                    return ((InterfaceC5476h) interfaceC5475g).u().a().equals(interfaceC7235mQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ye.t$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f extends r {
        f(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7227e interfaceC7227e) {
            if (interfaceC7239q == null) {
                g(2);
            }
            if (interfaceC7227e == null) {
                g(3);
            }
            if (interfaceC5475g == AbstractC7241t.f65134o) {
                return false;
            }
            if (!(interfaceC7239q instanceof InterfaceC7224b) || (interfaceC7239q instanceof InterfaceC7234l) || interfaceC5475g == AbstractC7241t.f65133n) {
                return true;
            }
            if (interfaceC5475g == AbstractC7241t.f65132m || interfaceC5475g == null) {
                return false;
            }
            qf.S type = interfaceC5475g.getType();
            return bf.i.I(type, interfaceC7227e) || qf.E.a(type);
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            InterfaceC7227e interfaceC7227e;
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            InterfaceC7227e interfaceC7227e2 = (InterfaceC7227e) bf.i.q(interfaceC7239q, InterfaceC7227e.class);
            InterfaceC7227e interfaceC7227e3 = (InterfaceC7227e) bf.i.r(interfaceC7235m, InterfaceC7227e.class, false);
            if (interfaceC7227e3 == null) {
                return false;
            }
            if (interfaceC7227e2 != null && bf.i.x(interfaceC7227e2) && (interfaceC7227e = (InterfaceC7227e) bf.i.q(interfaceC7227e2, InterfaceC7227e.class)) != null && bf.i.H(interfaceC7227e3, interfaceC7227e)) {
                return true;
            }
            InterfaceC7239q interfaceC7239qM = bf.i.M(interfaceC7239q);
            InterfaceC7227e interfaceC7227e4 = (InterfaceC7227e) bf.i.q(interfaceC7239qM, InterfaceC7227e.class);
            if (interfaceC7227e4 == null) {
                return false;
            }
            if (bf.i.H(interfaceC7227e3, interfaceC7227e4) && h(interfaceC5475g, interfaceC7239qM, interfaceC7227e3)) {
                return true;
            }
            return e(interfaceC5475g, interfaceC7239q, interfaceC7227e3.b(), z10);
        }
    }

    /* JADX INFO: renamed from: ye.t$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g extends r {
        g(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            if (bf.i.g(interfaceC7235m).x0(bf.i.g(interfaceC7239q))) {
                return AbstractC7241t.f65135p.a(interfaceC7239q, interfaceC7235m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ye.t$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class h extends r {
        h(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ye.t$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i extends r {
        i(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: ye.t$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class j extends r {
        j(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: ye.t$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k extends r {
        k(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ye.t$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class l extends r {
        l(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ye.AbstractC7242u
        public boolean e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
            if (interfaceC7239q == null) {
                g(0);
            }
            if (interfaceC7235m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(w0.e.f65145c);
        f65120a = dVar;
        e eVar = new e(w0.f.f65146c);
        f65121b = eVar;
        f fVar = new f(w0.g.f65147c);
        f65122c = fVar;
        g gVar = new g(w0.b.f65142c);
        f65123d = gVar;
        h hVar = new h(w0.h.f65148c);
        f65124e = hVar;
        i iVar = new i(w0.d.f65144c);
        f65125f = iVar;
        j jVar = new j(w0.a.f65141c);
        f65126g = jVar;
        k kVar = new k(w0.c.f65143c);
        f65127h = kVar;
        l lVar = new l(w0.i.f65149c);
        f65128i = lVar;
        f65129j = Collections.unmodifiableSet(Ud.a0.h(dVar, eVar, gVar, iVar));
        HashMap mapE = Af.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f65130k = Collections.unmodifiableMap(mapE);
        f65131l = hVar;
        f65132m = new a();
        f65133n = new b();
        f65134o = new c();
        Iterator it = ServiceLoader.load(InterfaceC7160l.class, InterfaceC7160l.class.getClassLoader()).iterator();
        f65135p = it.hasNext() ? (InterfaceC7160l) it.next() : InterfaceC7160l.a.f64495a;
        f65136q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.AbstractC7241t.a(int):void");
    }

    public static Integer d(AbstractC7242u abstractC7242u, AbstractC7242u abstractC7242u2) {
        if (abstractC7242u == null) {
            a(12);
        }
        if (abstractC7242u2 == null) {
            a(13);
        }
        Integer numA = abstractC7242u.a(abstractC7242u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC7242u2.a(abstractC7242u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC7239q e(InterfaceC5475g interfaceC5475g, InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
        InterfaceC7239q interfaceC7239qE;
        if (interfaceC7239q == null) {
            a(8);
        }
        if (interfaceC7235m == null) {
            a(9);
        }
        for (InterfaceC7239q interfaceC7239q2 = (InterfaceC7239q) interfaceC7239q.a(); interfaceC7239q2 != null && interfaceC7239q2.getVisibility() != f65125f; interfaceC7239q2 = (InterfaceC7239q) bf.i.q(interfaceC7239q2, InterfaceC7239q.class)) {
            if (!interfaceC7239q2.getVisibility().e(interfaceC5475g, interfaceC7239q2, interfaceC7235m, z10)) {
                return interfaceC7239q2;
            }
        }
        if (!(interfaceC7239q instanceof Be.Q) || (interfaceC7239qE = e(interfaceC5475g, ((Be.Q) interfaceC7239q).R(), interfaceC7235m, z10)) == null) {
            return null;
        }
        return interfaceC7239qE;
    }

    public static boolean f(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        if (interfaceC7235m == null) {
            a(6);
        }
        if (interfaceC7235m2 == null) {
            a(7);
        }
        i0 i0VarJ = bf.i.j(interfaceC7235m2);
        if (i0VarJ != i0.f65113a) {
            return i0VarJ.equals(bf.i.j(interfaceC7235m));
        }
        return false;
    }

    public static boolean g(AbstractC7242u abstractC7242u) {
        if (abstractC7242u == null) {
            a(14);
        }
        return abstractC7242u == f65120a || abstractC7242u == f65121b;
    }

    public static boolean h(InterfaceC7239q interfaceC7239q, InterfaceC7235m interfaceC7235m, boolean z10) {
        if (interfaceC7239q == null) {
            a(2);
        }
        if (interfaceC7235m == null) {
            a(3);
        }
        return e(f65133n, interfaceC7239q, interfaceC7235m, z10) == null;
    }

    private static void i(AbstractC7242u abstractC7242u) {
        f65136q.put(abstractC7242u.b(), abstractC7242u);
    }

    public static AbstractC7242u j(x0 x0Var) {
        if (x0Var == null) {
            a(15);
        }
        AbstractC7242u abstractC7242u = (AbstractC7242u) f65136q.get(x0Var);
        if (abstractC7242u != null) {
            return abstractC7242u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x0Var);
    }
}
