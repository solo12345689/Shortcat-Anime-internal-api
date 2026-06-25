package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.Collections;
import java.util.List;
import jf.C5383g;
import jf.C5396t;
import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import qf.E0;
import qf.G0;
import qf.J0;
import rf.AbstractC6317g;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7237o;
import ye.c0;
import ye.l0;

/* JADX INFO: renamed from: Be.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1106a extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.f f1764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final InterfaceC6044i f1765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f1766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6044i f1767e;

    /* JADX INFO: renamed from: Be.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0019a implements InterfaceC5082a {

        /* JADX INFO: renamed from: Be.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0020a implements Function1 {
            C0020a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC6183d0 invoke(AbstractC6317g abstractC6317g) {
                InterfaceC7230h interfaceC7230hF = abstractC6317g.f(AbstractC1106a.this);
                return interfaceC7230hF == null ? (AbstractC6183d0) AbstractC1106a.this.f1765c.invoke() : interfaceC7230hF instanceof l0 ? qf.V.c((l0) interfaceC7230hF, J0.g(interfaceC7230hF.l().getParameters())) : interfaceC7230hF instanceof z ? J0.u(interfaceC7230hF.l().o(abstractC6317g), ((z) interfaceC7230hF).j0(abstractC6317g), this) : interfaceC7230hF.p();
            }
        }

        C0019a() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6183d0 invoke() {
            AbstractC1106a abstractC1106a = AbstractC1106a.this;
            return J0.v(abstractC1106a, abstractC1106a.X(), new C0020a());
        }
    }

    /* JADX INFO: renamed from: Be.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements InterfaceC5082a {
        b() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5387k invoke() {
            return new C5383g(AbstractC1106a.this.X());
        }
    }

    /* JADX INFO: renamed from: Be.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements InterfaceC5082a {
        c() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 invoke() {
            return new C1124t(AbstractC1106a.this);
        }
    }

    public AbstractC1106a(pf.n nVar, Xe.f fVar) {
        if (nVar == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        this.f1764b = fVar;
        this.f1765c = nVar.c(new C0019a());
        this.f1766d = nVar.c(new b());
        this.f1767e = nVar.c(new c());
    }

    private static /* synthetic */ void F0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ye.j0
    /* JADX INFO: renamed from: H0 */
    public InterfaceC7227e c(G0 g02) {
        if (g02 == null) {
            F0(18);
        }
        return g02.k() ? this : new C1129y(this, g02);
    }

    @Override // ye.InterfaceC7227e
    public c0 J0() {
        c0 c0Var = (c0) this.f1767e.invoke();
        if (c0Var == null) {
            F0(5);
        }
        return c0Var;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k L(E0 e02) {
        if (e02 == null) {
            F0(15);
        }
        InterfaceC5387k interfaceC5387kT = T(e02, ff.e.r(bf.i.g(this)));
        if (interfaceC5387kT == null) {
            F0(16);
        }
        return interfaceC5387kT;
    }

    @Override // Be.z
    public InterfaceC5387k T(E0 e02, AbstractC6317g abstractC6317g) {
        if (e02 == null) {
            F0(10);
        }
        if (abstractC6317g == null) {
            F0(11);
        }
        if (!e02.f()) {
            return new C5396t(j0(abstractC6317g), G0.g(e02));
        }
        InterfaceC5387k interfaceC5387kJ0 = j0(abstractC6317g);
        if (interfaceC5387kJ0 == null) {
            F0(12);
        }
        return interfaceC5387kJ0;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k U() {
        InterfaceC5387k interfaceC5387k = (InterfaceC5387k) this.f1766d.invoke();
        if (interfaceC5387k == null) {
            F0(4);
        }
        return interfaceC5387k;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC5387k X() {
        InterfaceC5387k interfaceC5387kJ0 = j0(ff.e.r(bf.i.g(this)));
        if (interfaceC5387kJ0 == null) {
            F0(17);
        }
        return interfaceC5387kJ0;
    }

    @Override // ye.InterfaceC7227e
    public List Z() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(6);
        }
        return list;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.l(this, obj);
    }

    @Override // ye.J
    public Xe.f getName() {
        Xe.f fVar = this.f1764b;
        if (fVar == null) {
            F0(2);
        }
        return fVar;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7230h
    public AbstractC6183d0 p() {
        AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) this.f1765c.invoke();
        if (abstractC6183d0 == null) {
            F0(20);
        }
        return abstractC6183d0;
    }

    @Override // ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public InterfaceC7227e a() {
        return this;
    }
}
