package Be;

import ye.InterfaceC7235m;
import ze.AbstractC7368b;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1118m extends AbstractC7368b implements InterfaceC7235m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.f f1808b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1118m(InterfaceC7374h interfaceC7374h, Xe.f fVar) {
        super(interfaceC7374h);
        if (interfaceC7374h == null) {
            T(0);
        }
        if (fVar == null) {
            T(1);
        }
        this.f1808b = fVar;
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String j0(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            T(4);
        }
        try {
            String str = af.n.f23996k.M(interfaceC7235m) + "[" + interfaceC7235m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC7235m)) + "]";
            if (str == null) {
                T(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC7235m.getClass().getSimpleName() + " " + interfaceC7235m.getName();
            if (str2 == null) {
                T(6);
            }
            return str2;
        }
    }

    @Override // ye.J
    public Xe.f getName() {
        Xe.f fVar = this.f1808b;
        if (fVar == null) {
            T(2);
        }
        return fVar;
    }

    public String toString() {
        return j0(this);
    }

    public InterfaceC7235m a() {
        return this;
    }
}
