package Be;

import kf.C5473e;
import kf.InterfaceC5475g;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1124t extends AbstractC1108c {

    /* JADX INFO: renamed from: c */
    private final InterfaceC7227e f1881c;

    /* JADX INFO: renamed from: d */
    private final C5473e f1882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124t(InterfaceC7227e interfaceC7227e) {
        super(InterfaceC7374h.f66223k0.b());
        if (interfaceC7227e == null) {
            T(0);
        }
        this.f1881c = interfaceC7227e;
        this.f1882d = new C5473e(interfaceC7227e, null);
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ye.InterfaceC7235m
    public InterfaceC7235m b() {
        InterfaceC7227e interfaceC7227e = this.f1881c;
        if (interfaceC7227e == null) {
            T(2);
        }
        return interfaceC7227e;
    }

    @Override // ye.c0
    public InterfaceC5475g getValue() {
        C5473e c5473e = this.f1882d;
        if (c5473e == null) {
            T(1);
        }
        return c5473e;
    }

    @Override // Be.AbstractC1118m
    public String toString() {
        return "class " + this.f1881c.getName() + "::this";
    }
}
