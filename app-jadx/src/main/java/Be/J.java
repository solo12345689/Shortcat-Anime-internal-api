package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import qf.G0;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.Z;
import ye.c0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J extends AbstractC1119n implements ye.Y {

    /* JADX INFO: renamed from: e */
    private boolean f1691e;

    /* JADX INFO: renamed from: f */
    private final boolean f1692f;

    /* JADX INFO: renamed from: g */
    private final ye.E f1693g;

    /* JADX INFO: renamed from: h */
    private final Z f1694h;

    /* JADX INFO: renamed from: i */
    private final boolean f1695i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC7224b.a f1696j;

    /* JADX INFO: renamed from: k */
    private AbstractC7242u f1697k;

    /* JADX INFO: renamed from: l */
    private InterfaceC7247z f1698l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(ye.E e10, AbstractC7242u abstractC7242u, Z z10, InterfaceC7374h interfaceC7374h, Xe.f fVar, boolean z11, boolean z12, boolean z13, InterfaceC7224b.a aVar, h0 h0Var) {
        super(z10.b(), interfaceC7374h, fVar, h0Var);
        if (e10 == null) {
            T(0);
        }
        if (abstractC7242u == null) {
            T(1);
        }
        if (z10 == null) {
            T(2);
        }
        if (interfaceC7374h == null) {
            T(3);
        }
        if (fVar == null) {
            T(4);
        }
        if (h0Var == null) {
            T(5);
        }
        this.f1698l = null;
        this.f1693g = e10;
        this.f1697k = abstractC7242u;
        this.f1694h = z10;
        this.f1691e = z11;
        this.f1692f = z12;
        this.f1695i = z13;
        this.f1696j = aVar;
    }

    private static /* synthetic */ void T(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // ye.InterfaceC7247z
    public boolean C() {
        return false;
    }

    @Override // ye.InterfaceC7247z
    public boolean D0() {
        return false;
    }

    @Override // ye.InterfaceC7224b
    public void E0(Collection collection) {
        if (collection == null) {
            T(16);
        }
    }

    @Override // ye.Y
    public boolean F() {
        return this.f1691e;
    }

    @Override // ye.InterfaceC7247z
    public boolean G0() {
        return false;
    }

    @Override // ye.InterfaceC7224b
    /* JADX INFO: renamed from: H0 */
    public ye.Y l0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // ye.InterfaceC7223a
    public c0 K() {
        return W().K();
    }

    protected Collection K0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (Z z11 : W().e()) {
            InterfaceC7247z interfaceC7247zD = z10 ? z11.d() : z11.g();
            if (interfaceC7247zD != null) {
                arrayList.add(interfaceC7247zD);
            }
        }
        return arrayList;
    }

    public void L0(boolean z10) {
        this.f1691e = z10;
    }

    public void M0(InterfaceC7247z interfaceC7247z) {
        this.f1698l = interfaceC7247z;
    }

    public void N0(AbstractC7242u abstractC7242u) {
        this.f1697k = abstractC7242u;
    }

    @Override // ye.InterfaceC7223a
    public c0 O() {
        return W().O();
    }

    @Override // ye.Y
    public Z W() {
        Z z10 = this.f1694h;
        if (z10 == null) {
            T(13);
        }
        return z10;
    }

    @Override // ye.D
    public boolean Y() {
        return false;
    }

    @Override // ye.j0
    public InterfaceC7247z c(G0 g02) {
        if (g02 == null) {
            T(7);
        }
        return this;
    }

    @Override // ye.InterfaceC7223a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(9);
        }
        return list;
    }

    @Override // ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = this.f1697k;
        if (abstractC7242u == null) {
            T(11);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7224b
    public InterfaceC7224b.a h() {
        InterfaceC7224b.a aVar = this.f1696j;
        if (aVar == null) {
            T(6);
        }
        return aVar;
    }

    @Override // ye.InterfaceC7223a
    public boolean i0() {
        return false;
    }

    @Override // ye.D
    public boolean isExternal() {
        return this.f1692f;
    }

    @Override // ye.InterfaceC7247z
    public boolean isInfix() {
        return false;
    }

    @Override // ye.InterfaceC7247z
    public boolean isInline() {
        return this.f1695i;
    }

    @Override // ye.InterfaceC7247z
    public boolean isOperator() {
        return false;
    }

    @Override // ye.InterfaceC7247z
    public boolean isSuspend() {
        return false;
    }

    @Override // ye.D
    public boolean m0() {
        return false;
    }

    @Override // ye.InterfaceC7223a
    public Object n0(InterfaceC7223a.InterfaceC0983a interfaceC0983a) {
        return null;
    }

    @Override // ye.D
    public ye.E r() {
        ye.E e10 = this.f1693g;
        if (e10 == null) {
            T(10);
        }
        return e10;
    }

    @Override // ye.InterfaceC7247z
    public InterfaceC7247z t0() {
        return this.f1698l;
    }

    @Override // ye.InterfaceC7223a
    public List y0() {
        List listY0 = W().y0();
        if (listY0 == null) {
            T(14);
        }
        return listY0;
    }
}
