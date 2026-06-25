package Be;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kf.C5477i;
import qf.G0;
import qf.N0;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7227e;
import ye.InterfaceC7237o;
import ye.c0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1108c extends AbstractC1118m implements c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1108c(InterfaceC7374h interfaceC7374h) {
        super(interfaceC7374h, Xe.h.f21788i);
        if (interfaceC7374h == null) {
            T(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // ye.InterfaceC7223a
    public c0 K() {
        return null;
    }

    @Override // ye.InterfaceC7223a
    public c0 O() {
        return null;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.a(this, obj);
    }

    @Override // ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            T(8);
        }
        return set;
    }

    @Override // ye.InterfaceC7223a
    public qf.S getReturnType() {
        return getType();
    }

    @Override // ye.s0
    public qf.S getType() {
        qf.S type = getValue().getType();
        if (type == null) {
            T(6);
        }
        return type;
    }

    @Override // ye.InterfaceC7223a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(5);
        }
        return list;
    }

    @Override // ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = AbstractC7241t.f65125f;
        if (abstractC7242u == null) {
            T(9);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7223a
    public boolean i0() {
        return false;
    }

    @Override // ye.InterfaceC7223a
    public List j() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            T(7);
        }
        return list;
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        h0 h0Var = h0.f65112a;
        if (h0Var == null) {
            T(11);
        }
        return h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1108c(InterfaceC7374h interfaceC7374h, Xe.f fVar) {
        super(interfaceC7374h, fVar);
        if (interfaceC7374h == null) {
            T(1);
        }
        if (fVar == null) {
            T(2);
        }
    }

    @Override // ye.j0
    public c0 c(G0 g02) {
        if (g02 == null) {
            T(3);
        }
        if (!g02.k()) {
            qf.S sP = b() instanceof InterfaceC7227e ? g02.p(getType(), N0.f58001g) : g02.p(getType(), N0.f57999e);
            if (sP == null) {
                return null;
            }
            if (sP != getType()) {
                return new N(b(), new C5477i(sP), getAnnotations());
            }
        }
        return this;
    }

    @Override // Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public ye.W a() {
        return this;
    }
}
