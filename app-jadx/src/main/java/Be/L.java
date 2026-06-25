package Be;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7237o;
import ye.Z;
import ye.a0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class L extends J implements a0 {

    /* JADX INFO: renamed from: m */
    private qf.S f1732m;

    /* JADX INFO: renamed from: n */
    private final a0 f1733n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Z z10, InterfaceC7374h interfaceC7374h, ye.E e10, AbstractC7242u abstractC7242u, boolean z11, boolean z12, boolean z13, InterfaceC7224b.a aVar, a0 a0Var, h0 h0Var) {
        super(e10, abstractC7242u, z10, interfaceC7374h, Xe.f.q("<get-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
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
        this.f1733n = a0Var != null ? a0Var : this;
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: O0 */
    public a0 a() {
        a0 a0Var = this.f1733n;
        if (a0Var == null) {
            T(8);
        }
        return a0Var;
    }

    public void P0(qf.S s10) {
        if (s10 == null) {
            s10 = W().getType();
        }
        this.f1732m = s10;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.i(this, obj);
    }

    @Override // ye.InterfaceC7247z, ye.InterfaceC7224b
    public Collection e() {
        Collection collectionK0 = super.K0(true);
        if (collectionK0 == null) {
            T(6);
        }
        return collectionK0;
    }

    @Override // ye.InterfaceC7223a
    public qf.S getReturnType() {
        return this.f1732m;
    }

    @Override // ye.InterfaceC7223a
    public List j() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(7);
        }
        return list;
    }
}
