package Be;

import ye.InterfaceC7235m;
import ye.InterfaceC7236n;
import ye.InterfaceC7238p;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1119n extends AbstractC1118m implements InterfaceC7236n {

    /* JADX INFO: renamed from: c */
    private final InterfaceC7235m f1809c;

    /* JADX INFO: renamed from: d */
    private final h0 f1810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1119n(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, h0 h0Var) {
        super(interfaceC7374h, fVar);
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
        this.f1809c = interfaceC7235m;
        this.f1810d = h0Var;
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: F0 */
    public InterfaceC7238p a() {
        InterfaceC7238p interfaceC7238p = (InterfaceC7238p) super.a();
        if (interfaceC7238p == null) {
            T(4);
        }
        return interfaceC7238p;
    }

    public InterfaceC7235m b() {
        InterfaceC7235m interfaceC7235m = this.f1809c;
        if (interfaceC7235m == null) {
            T(5);
        }
        return interfaceC7235m;
    }

    public h0 k() {
        h0 h0Var = this.f1810d;
        if (h0Var == null) {
            T(6);
        }
        return h0Var;
    }
}
