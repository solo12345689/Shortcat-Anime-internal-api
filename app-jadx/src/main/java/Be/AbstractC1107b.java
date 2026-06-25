package Be;

import qf.N0;
import ye.InterfaceC7235m;
import ye.h0;
import ye.k0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1107b extends AbstractC1113h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1107b(pf.n nVar, InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, N0 n02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(nVar, interfaceC7235m, interfaceC7374h, fVar, n02, z10, i10, h0Var, k0Var);
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
    }

    private static /* synthetic */ void T(int i10) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Be.AbstractC1118m
    public String toString() {
        String str = "";
        String str2 = y() ? "reified " : "";
        if (m() != N0.f57999e) {
            str = m() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
