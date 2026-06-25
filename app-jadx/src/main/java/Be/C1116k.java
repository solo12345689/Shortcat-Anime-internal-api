package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jf.InterfaceC5387k;
import qf.C6210u;
import qf.v0;
import rf.AbstractC6317g;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.h0;
import ye.r0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1116k extends AbstractC1115j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ye.E f1800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final EnumC7228f f1801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final v0 f1802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC5387k f1803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f1804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC7226d f1805n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1116k(InterfaceC7235m interfaceC7235m, Xe.f fVar, ye.E e10, EnumC7228f enumC7228f, Collection collection, h0 h0Var, boolean z10, pf.n nVar) {
        super(nVar, interfaceC7235m, fVar, h0Var, z10);
        if (interfaceC7235m == null) {
            F0(0);
        }
        if (fVar == null) {
            F0(1);
        }
        if (e10 == null) {
            F0(2);
        }
        if (enumC7228f == null) {
            F0(3);
        }
        if (collection == null) {
            F0(4);
        }
        if (h0Var == null) {
            F0(5);
        }
        if (nVar == null) {
            F0(6);
        }
        this.f1800i = e10;
        this.f1801j = enumC7228f;
        this.f1802k = new C6210u(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void F0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // ye.InterfaceC7231i
    public boolean A() {
        return false;
    }

    @Override // ye.InterfaceC7227e
    public InterfaceC7226d D() {
        return this.f1805n;
    }

    @Override // ye.InterfaceC7227e
    public boolean I0() {
        return false;
    }

    public final void K0(InterfaceC5387k interfaceC5387k, Set set, InterfaceC7226d interfaceC7226d) {
        if (interfaceC5387k == null) {
            F0(7);
        }
        if (set == null) {
            F0(8);
        }
        this.f1803l = interfaceC5387k;
        this.f1804m = set;
        this.f1805n = interfaceC7226d;
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
            F0(9);
        }
        return interfaceC7374hB;
    }

    @Override // ye.InterfaceC7227e, ye.D, ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = AbstractC7241t.f65124e;
        if (abstractC7242u == null) {
            F0(17);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7227e
    public EnumC7228f h() {
        EnumC7228f enumC7228f = this.f1801j;
        if (enumC7228f == null) {
            F0(15);
        }
        return enumC7228f;
    }

    @Override // ye.InterfaceC7227e
    public Collection i() {
        Set set = this.f1804m;
        if (set == null) {
            F0(11);
        }
        return set;
    }

    @Override // ye.InterfaceC7227e
    public boolean isInline() {
        return false;
    }

    @Override // Be.z
    public InterfaceC5387k j0(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            F0(12);
        }
        InterfaceC5387k interfaceC5387k = this.f1803l;
        if (interfaceC5387k == null) {
            F0(13);
        }
        return interfaceC5387k;
    }

    @Override // ye.InterfaceC7230h
    public v0 l() {
        v0 v0Var = this.f1802k;
        if (v0Var == null) {
            F0(10);
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
            F0(14);
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
            F0(18);
        }
        return list;
    }

    @Override // ye.InterfaceC7227e, ye.D
    public ye.E r() {
        ye.E e10 = this.f1800i;
        if (e10 == null) {
            F0(16);
        }
        return e10;
    }

    @Override // ye.InterfaceC7227e
    public boolean s() {
        return false;
    }

    public String toString() {
        return "class " + getName();
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
