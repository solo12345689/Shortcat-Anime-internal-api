package Be;

import java.util.Collections;
import java.util.List;
import ye.InterfaceC7235m;
import ye.c0;
import ye.h0;
import ye.u0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class X extends AbstractC1119n implements u0 {

    /* JADX INFO: renamed from: e */
    protected qf.S f1760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, qf.S s10, h0 h0Var) {
        super(interfaceC7235m, interfaceC7374h, fVar, h0Var);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (fVar == null) {
            T(2);
        }
        if (h0Var == null) {
            T(3);
        }
        this.f1760e = s10;
    }

    private static /* synthetic */ void T(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void H0(qf.S s10) {
        this.f1760e = s10;
    }

    public c0 K() {
        return null;
    }

    public c0 O() {
        return null;
    }

    public qf.S getReturnType() {
        qf.S type = getType();
        if (type == null) {
            T(10);
        }
        return type;
    }

    @Override // ye.s0
    public qf.S getType() {
        qf.S s10 = this.f1760e;
        if (s10 == null) {
            T(4);
        }
        return s10;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(8);
        }
        return list;
    }

    @Override // ye.InterfaceC7223a
    public boolean i0() {
        return false;
    }

    @Override // ye.InterfaceC7223a
    public List j() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(6);
        }
        return list;
    }
}
