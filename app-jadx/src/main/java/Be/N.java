package Be;

import kf.InterfaceC5475g;
import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class N extends AbstractC1108c {

    /* JADX INFO: renamed from: c */
    private final InterfaceC7235m f1736c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5475g f1737d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC7235m interfaceC7235m, InterfaceC5475g interfaceC5475g, InterfaceC7374h interfaceC7374h) {
        this(interfaceC7235m, interfaceC5475g, interfaceC7374h, Xe.h.f21788i);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC5475g == null) {
            T(1);
        }
        if (interfaceC7374h == null) {
            T(2);
        }
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ye.InterfaceC7235m
    public InterfaceC7235m b() {
        InterfaceC7235m interfaceC7235m = this.f1736c;
        if (interfaceC7235m == null) {
            T(8);
        }
        return interfaceC7235m;
    }

    @Override // ye.c0
    public InterfaceC5475g getValue() {
        InterfaceC5475g interfaceC5475g = this.f1737d;
        if (interfaceC5475g == null) {
            T(7);
        }
        return interfaceC5475g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC7235m interfaceC7235m, InterfaceC5475g interfaceC5475g, InterfaceC7374h interfaceC7374h, Xe.f fVar) {
        super(interfaceC7374h, fVar);
        if (interfaceC7235m == null) {
            T(3);
        }
        if (interfaceC5475g == null) {
            T(4);
        }
        if (interfaceC7374h == null) {
            T(5);
        }
        if (fVar == null) {
            T(6);
        }
        this.f1736c = interfaceC7235m;
        this.f1737d = interfaceC5475g;
    }
}
