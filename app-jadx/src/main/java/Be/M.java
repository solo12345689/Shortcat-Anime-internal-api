package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import qf.AbstractC6183d0;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7237o;
import ye.Z;
import ye.b0;
import ye.h0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class M extends J implements b0 {

    /* JADX INFO: renamed from: m */
    private t0 f1734m;

    /* JADX INFO: renamed from: n */
    private final b0 f1735n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Z z10, InterfaceC7374h interfaceC7374h, ye.E e10, AbstractC7242u abstractC7242u, boolean z11, boolean z12, boolean z13, InterfaceC7224b.a aVar, b0 b0Var, h0 h0Var) {
        super(e10, abstractC7242u, z10, interfaceC7374h, Xe.f.q("<set-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
        if (z10 == null) {
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
        if (aVar == null) {
            T(4);
        }
        if (h0Var == null) {
            T(5);
        }
        this.f1735n = b0Var != null ? b0Var : this;
    }

    public static V O0(b0 b0Var, qf.S s10, InterfaceC7374h interfaceC7374h) {
        if (b0Var == null) {
            T(7);
        }
        if (s10 == null) {
            T(8);
        }
        if (interfaceC7374h == null) {
            T(9);
        }
        return new V(b0Var, null, 0, interfaceC7374h, Xe.h.f21794o, s10, false, false, false, null, h0.f65112a);
    }

    private static /* synthetic */ void T(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: P0 */
    public b0 a() {
        b0 b0Var = this.f1735n;
        if (b0Var == null) {
            T(13);
        }
        return b0Var;
    }

    public void Q0(t0 t0Var) {
        if (t0Var == null) {
            T(6);
        }
        this.f1734m = t0Var;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.g(this, obj);
    }

    @Override // ye.InterfaceC7247z, ye.InterfaceC7224b
    public Collection e() {
        Collection collectionK0 = super.K0(false);
        if (collectionK0 == null) {
            T(10);
        }
        return collectionK0;
    }

    @Override // ye.InterfaceC7223a
    public qf.S getReturnType() {
        AbstractC6183d0 abstractC6183d0A0 = ff.e.m(this).a0();
        if (abstractC6183d0A0 == null) {
            T(12);
        }
        return abstractC6183d0A0;
    }

    @Override // ye.InterfaceC7223a
    public List j() {
        t0 t0Var = this.f1734m;
        if (t0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(t0Var);
        if (listSingletonList == null) {
            T(11);
        }
        return listSingletonList;
    }
}
