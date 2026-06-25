package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jf.C5385i;
import jf.C5400x;
import jf.InterfaceC5387k;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import qf.AbstractC6206p;
import qf.N0;
import qf.r0;
import qf.v0;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.h0;
import ye.k0;
import ye.m0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1113h extends AbstractC1119n implements m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N0 f1782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC6044i f1785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC6044i f1786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final pf.n f1787j;

    /* JADX INFO: renamed from: Be.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pf.n f1788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0 f1789b;

        a(pf.n nVar, k0 k0Var) {
            this.f1788a = nVar;
            this.f1789b = k0Var;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 invoke() {
            return new c(AbstractC1113h.this, this.f1788a, this.f1789b);
        }
    }

    /* JADX INFO: renamed from: Be.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Xe.f f1791a;

        /* JADX INFO: renamed from: Be.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements InterfaceC5082a {
            a() {
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC5387k invoke() {
                return C5400x.m("Scope for type parameter " + b.this.f1791a.b(), AbstractC1113h.this.getUpperBounds());
            }
        }

        b(Xe.f fVar) {
            this.f1791a = fVar;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6183d0 invoke() {
            return qf.V.m(r0.f58089b.k(), AbstractC1113h.this.l(), Collections.EMPTY_LIST, false, new C5385i(new a()));
        }
    }

    /* JADX INFO: renamed from: Be.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends AbstractC6206p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k0 f1794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1113h f1795e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC1113h abstractC1113h, pf.n nVar, k0 k0Var) {
            super(nVar);
            if (nVar == null) {
                H(0);
            }
            this.f1795e = abstractC1113h;
            this.f1794d = k0Var;
        }

        private static /* synthetic */ void H(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // qf.AbstractC6211v
        protected boolean d(InterfaceC7230h interfaceC7230h) {
            if (interfaceC7230h == null) {
                H(9);
            }
            return (interfaceC7230h instanceof m0) && bf.g.f33298a.m(this.f1795e, (m0) interfaceC7230h, true);
        }

        @Override // qf.v0
        public List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(2);
            }
            return list;
        }

        @Override // qf.v0
        public ve.i n() {
            ve.i iVarM = ff.e.m(this.f1795e);
            if (iVarM == null) {
                H(4);
            }
            return iVarM;
        }

        @Override // qf.AbstractC6211v, qf.v0
        public InterfaceC7230h p() {
            AbstractC1113h abstractC1113h = this.f1795e;
            if (abstractC1113h == null) {
                H(3);
            }
            return abstractC1113h;
        }

        @Override // qf.v0
        public boolean q() {
            return true;
        }

        @Override // qf.AbstractC6206p
        protected Collection r() {
            List listL0 = this.f1795e.L0();
            if (listL0 == null) {
                H(1);
            }
            return listL0;
        }

        @Override // qf.AbstractC6206p
        protected qf.S s() {
            return sf.l.d(sf.k.f59710u, new String[0]);
        }

        public String toString() {
            return this.f1795e.getName().toString();
        }

        @Override // qf.AbstractC6206p
        protected k0 v() {
            k0 k0Var = this.f1794d;
            if (k0Var == null) {
                H(5);
            }
            return k0Var;
        }

        @Override // qf.AbstractC6206p
        protected List x(List list) {
            if (list == null) {
                H(7);
            }
            List listH0 = this.f1795e.H0(list);
            if (listH0 == null) {
                H(8);
            }
            return listH0;
        }

        @Override // qf.AbstractC6206p
        protected void z(qf.S s10) {
            if (s10 == null) {
                H(6);
            }
            this.f1795e.K0(s10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1113h(pf.n nVar, InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(interfaceC7235m, interfaceC7374h, fVar, h0Var);
        if (nVar == null) {
            T(0);
        }
        if (interfaceC7235m == null) {
            T(1);
        }
        if (interfaceC7374h == null) {
            T(2);
        }
        if (fVar == null) {
            T(3);
        }
        if (n02 == null) {
            T(4);
        }
        if (h0Var == null) {
            T(5);
        }
        if (k0Var == null) {
            T(6);
        }
        this.f1782e = n02;
        this.f1783f = z10;
        this.f1784g = i10;
        this.f1785h = nVar.c(new a(nVar, k0Var));
        this.f1786i = nVar.c(new b(fVar));
        this.f1787j = nVar;
    }

    private static /* synthetic */ void T(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected List H0(List list) {
        if (list == null) {
            T(12);
        }
        if (list == null) {
            T(13);
        }
        return list;
    }

    protected abstract void K0(qf.S s10);

    protected abstract List L0();

    @Override // ye.m0
    public pf.n M() {
        pf.n nVar = this.f1787j;
        if (nVar == null) {
            T(14);
        }
        return nVar;
    }

    @Override // ye.m0
    public boolean Q() {
        return false;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.f(this, obj);
    }

    @Override // ye.m0
    public int getIndex() {
        return this.f1784g;
    }

    @Override // ye.m0
    public List getUpperBounds() {
        List listK = ((c) l()).k();
        if (listK == null) {
            T(8);
        }
        return listK;
    }

    @Override // ye.m0, ye.InterfaceC7230h
    public final v0 l() {
        v0 v0Var = (v0) this.f1785h.invoke();
        if (v0Var == null) {
            T(9);
        }
        return v0Var;
    }

    @Override // ye.m0
    public N0 m() {
        N0 n02 = this.f1782e;
        if (n02 == null) {
            T(7);
        }
        return n02;
    }

    @Override // ye.InterfaceC7230h
    public AbstractC6183d0 p() {
        AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) this.f1786i.invoke();
        if (abstractC6183d0 == null) {
            T(10);
        }
        return abstractC6183d0;
    }

    @Override // ye.m0
    public boolean y() {
        return this.f1783f;
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public m0 a() {
        m0 m0Var = (m0) super.a();
        if (m0Var == null) {
            T(11);
        }
        return m0Var;
    }
}
