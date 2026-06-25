package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jf.AbstractC5388l;
import jf.C5380d;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import pf.InterfaceC6042g;
import pf.InterfaceC6044i;
import qf.C6210u;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.h0;
import ye.r0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1122q extends AbstractC1115j {

    /* JADX INFO: renamed from: i */
    private final v0 f1811i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC5387k f1812j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC6044i f1813k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC7374h f1814l;

    /* JADX INFO: renamed from: Be.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC5388l {

        /* JADX INFO: renamed from: b */
        private final InterfaceC6042g f1815b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC6042g f1816c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC6044i f1817d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C1122q f1818e;

        /* JADX INFO: renamed from: Be.q$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0021a implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1122q f1819a;

            C0021a(C1122q c1122q) {
                this.f1819a = c1122q;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public Collection invoke(Xe.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* JADX INFO: renamed from: Be.q$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1122q f1821a;

            b(C1122q c1122q) {
                this.f1821a = c1122q;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public Collection invoke(Xe.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* JADX INFO: renamed from: Be.q$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1122q f1823a;

            c(C1122q c1122q) {
                this.f1823a = c1122q;
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* JADX INFO: renamed from: Be.q$a$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class d extends bf.m {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Set f1825a;

            d(Set set) {
                this.f1825a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // bf.n
            public void a(InterfaceC7224b interfaceC7224b) {
                if (interfaceC7224b == null) {
                    f(0);
                }
                bf.o.K(interfaceC7224b, null);
                this.f1825a.add(interfaceC7224b);
            }

            @Override // bf.m
            protected void e(InterfaceC7224b interfaceC7224b, InterfaceC7224b interfaceC7224b2) {
                if (interfaceC7224b == null) {
                    f(1);
                }
                if (interfaceC7224b2 == null) {
                    f(2);
                }
            }
        }

        public a(C1122q c1122q, pf.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f1818e = c1122q;
            this.f1815b = nVar.h(new C0021a(c1122q));
            this.f1816c = nVar.h(new b(c1122q));
            this.f1817d = nVar.c(new c(c1122q));
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Be.C1122q.a.h(int):void");
        }

        public Collection l() {
            HashSet hashSet = new HashSet();
            for (Xe.f fVar : (Set) this.f1818e.f1813k.invoke()) {
                Ge.d dVar = Ge.d.f7470p;
                hashSet.addAll(c(fVar, dVar));
                hashSet.addAll(a(fVar, dVar));
            }
            return hashSet;
        }

        public Collection m(Xe.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().c(fVar, Ge.d.f7470p));
        }

        public Collection n(Xe.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().a(fVar, Ge.d.f7470p));
        }

        private InterfaceC5387k o() {
            InterfaceC5387k interfaceC5387kO = ((qf.S) this.f1818e.l().k().iterator().next()).o();
            if (interfaceC5387kO == null) {
                h(9);
            }
            return interfaceC5387kO;
        }

        private Collection p(Xe.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            bf.o.f33312f.v(fVar, collection, Collections.EMPTY_SET, this.f1818e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Collection a(Xe.f fVar, Ge.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f1816c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set b() {
            Set set = (Set) this.f1818e.f1813k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Collection c(Xe.f fVar, Ge.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f1815b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set d() {
            Set set = (Set) this.f1818e.f1813k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set f() {
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5390n
        public Collection g(C5380d c5380d, Function1 function1) {
            if (c5380d == null) {
                h(13);
            }
            if (function1 == null) {
                h(14);
            }
            Collection collection = (Collection) this.f1817d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1122q(pf.n nVar, InterfaceC7227e interfaceC7227e, qf.S s10, Xe.f fVar, InterfaceC6044i interfaceC6044i, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        super(nVar, interfaceC7227e, fVar, h0Var, false);
        if (nVar == null) {
            F0(6);
        }
        if (interfaceC7227e == null) {
            F0(7);
        }
        if (s10 == null) {
            F0(8);
        }
        if (fVar == null) {
            F0(9);
        }
        if (interfaceC6044i == null) {
            F0(10);
        }
        if (interfaceC7374h == null) {
            F0(11);
        }
        if (h0Var == null) {
            F0(12);
        }
        this.f1814l = interfaceC7374h;
        this.f1811i = new C6210u(this, Collections.EMPTY_LIST, Collections.singleton(s10), nVar);
        this.f1812j = new a(this, nVar);
        this.f1813k = interfaceC6044i;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C1122q L0(pf.n nVar, InterfaceC7227e interfaceC7227e, Xe.f fVar, InterfaceC6044i interfaceC6044i, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        if (nVar == null) {
            F0(0);
        }
        if (interfaceC7227e == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (interfaceC6044i == null) {
            F0(3);
        }
        if (interfaceC7374h == null) {
            F0(4);
        }
        if (h0Var == null) {
            F0(5);
        }
        return new C1122q(nVar, interfaceC7227e, interfaceC7227e.p(), fVar, interfaceC6044i, interfaceC7374h, h0Var);
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public r0 V() {
        return null;
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean c0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public boolean g0() {
        return false;
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        InterfaceC7374h interfaceC7374h = this.f1814l;
        if (interfaceC7374h == null) {
            F0(21);
        }
        return interfaceC7374h;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = AbstractC7241t.f65124e;
        if (abstractC7242u == null) {
            F0(20);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        EnumC7228f enumC7228f = EnumC7228f.f65100e;
        if (enumC7228f == null) {
            F0(18);
        }
        return enumC7228f;
    }

    @Override // ye.InterfaceC7227e
    public Collection i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(16);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return false;
    }

    @Override // Be.z
    public InterfaceC5387k j0(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            F0(13);
        }
        InterfaceC5387k interfaceC5387k = this.f1812j;
        if (interfaceC5387k == null) {
            F0(14);
        }
        return interfaceC5387k;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        v0 v0Var = this.f1811i;
        if (v0Var == null) {
            F0(17);
        }
        return v0Var;
    }

    @Override // ye.D
    public boolean m0() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k o0() {
        InterfaceC5387k.b bVar = InterfaceC5387k.b.f51800b;
        if (bVar == null) {
            F0(15);
        }
        return bVar;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7227e p0() {
        return null;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(22);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        ye.E e10 = ye.E.f65060b;
        if (e10 == null) {
            F0(19);
        }
        return e10;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // ye.InterfaceC7227e
    public Collection z() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(23);
        }
        return list;
    }
}
