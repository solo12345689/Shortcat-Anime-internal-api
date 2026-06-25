package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.InterfaceC5387k;
import qf.C6210u;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.h0;
import ye.r0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class G extends AbstractC1115j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EnumC7228f f1677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f1678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ye.E f1679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC7242u f1680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0 f1681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f1682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Collection f1683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final pf.n f1684p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC7235m interfaceC7235m, EnumC7228f enumC7228f, boolean z10, boolean z11, Xe.f fVar, h0 h0Var, pf.n nVar) {
        super(nVar, interfaceC7235m, fVar, h0Var, z11);
        if (interfaceC7235m == null) {
            F0(0);
        }
        if (enumC7228f == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (h0Var == null) {
            F0(3);
        }
        if (nVar == null) {
            F0(4);
        }
        this.f1683o = new ArrayList();
        this.f1684p = nVar;
        this.f1677i = enumC7228f;
        this.f1678j = z10;
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return this.f1678j;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return null;
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return false;
    }

    public void K0() {
        this.f1681m = new C6210u(this, this.f1682n, this.f1683o, this.f1684p);
        Iterator it = i().iterator();
        while (it.hasNext()) {
            ((C1114i) ((InterfaceC7247z) it.next())).g1(p());
        }
    }

    @Override // ye.InterfaceC7227e
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Set i() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            F0(13);
        }
        return set;
    }

    public void M0(ye.E e10) {
        if (e10 == null) {
            F0(6);
        }
        this.f1679k = e10;
    }

    public void N0(List list) {
        if (list == null) {
            F0(14);
        }
        if (this.f1682n == null) {
            this.f1682n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(AbstractC7242u abstractC7242u) {
        if (abstractC7242u == null) {
            F0(9);
        }
        this.f1680l = abstractC7242u;
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
        InterfaceC7374h interfaceC7374hB = InterfaceC7374h.f66223k0.b();
        if (interfaceC7374hB == null) {
            F0(5);
        }
        return interfaceC7374hB;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = this.f1680l;
        if (abstractC7242u == null) {
            F0(10);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        EnumC7228f enumC7228f = this.f1677i;
        if (enumC7228f == null) {
            F0(8);
        }
        return enumC7228f;
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return false;
    }

    @Override // Be.z
    public InterfaceC5387k j0(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            F0(16);
        }
        InterfaceC5387k.b bVar = InterfaceC5387k.b.f51800b;
        if (bVar == null) {
            F0(17);
        }
        return bVar;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        v0 v0Var = this.f1681m;
        if (v0Var == null) {
            F0(11);
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
            F0(18);
        }
        return bVar;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7227e p0() {
        return null;
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7231i
    public List q() {
        List list = this.f1682n;
        if (list == null) {
            F0(15);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        ye.E e10 = this.f1679k;
        if (e10 == null) {
            F0(7);
        }
        return e10;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return false;
    }

    public String toString() {
        return AbstractC1118m.j0(this);
    }

    @Override // ye.InterfaceC7227e
    public Collection z() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            F0(19);
        }
        return list;
    }
}
