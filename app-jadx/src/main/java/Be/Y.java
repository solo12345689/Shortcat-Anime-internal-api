package Be;

import df.AbstractC4598g;
import ie.InterfaceC5082a;
import pf.InterfaceC6045j;
import ye.InterfaceC7235m;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Y extends X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected InterfaceC6045j f1762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected InterfaceC5082a f1763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, qf.S s10, boolean z10, h0 h0Var) {
        super(interfaceC7235m, interfaceC7374h, fVar, s10, h0Var);
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
        this.f1761f = z10;
    }

    private static /* synthetic */ void T(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(InterfaceC6045j interfaceC6045j, InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            T(5);
        }
        this.f1763h = interfaceC5082a;
        if (interfaceC6045j == null) {
            interfaceC6045j = (InterfaceC6045j) interfaceC5082a.invoke();
        }
        this.f1762g = interfaceC6045j;
    }

    public void L0(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            T(4);
        }
        K0(null, interfaceC5082a);
    }

    @Override // ye.u0
    public boolean N() {
        return this.f1761f;
    }

    @Override // ye.u0
    public AbstractC4598g q0() {
        InterfaceC6045j interfaceC6045j = this.f1762g;
        if (interfaceC6045j != null) {
            return (AbstractC4598g) interfaceC6045j.invoke();
        }
        return null;
    }
}
