package Be;

import ye.InterfaceC7235m;
import ye.h0;

/* JADX INFO: renamed from: Be.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1115j extends AbstractC1106a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC7235m f1797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0 f1798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f1799h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1115j(pf.n nVar, InterfaceC7235m interfaceC7235m, Xe.f fVar, h0 h0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            F0(0);
        }
        if (interfaceC7235m == null) {
            F0(1);
        }
        if (fVar == null) {
            F0(2);
        }
        if (h0Var == null) {
            F0(3);
        }
        this.f1797f = interfaceC7235m;
        this.f1798g = h0Var;
        this.f1799h = z10;
    }

    private static /* synthetic */ void F0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ye.InterfaceC7227e, ye.InterfaceC7236n, ye.InterfaceC7235m
    public InterfaceC7235m b() {
        InterfaceC7235m interfaceC7235m = this.f1797f;
        if (interfaceC7235m == null) {
            F0(4);
        }
        return interfaceC7235m;
    }

    @Override // ye.D
    public boolean isExternal() {
        return this.f1799h;
    }

    @Override // ye.InterfaceC7238p
    public h0 k() {
        h0 h0Var = this.f1798g;
        if (h0Var == null) {
            F0(5);
        }
        return h0Var;
    }
}
