package He;

import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7244w;
import ye.Z;

/* JADX INFO: renamed from: He.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1668o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC7224b interfaceC7224b) {
        InterfaceC7244w interfaceC7244wW0;
        if (interfaceC7224b == null) {
            a(3);
        }
        if ((interfaceC7224b instanceof Z) && (interfaceC7244wW0 = ((Z) interfaceC7224b).w0()) != null && interfaceC7244wW0.getAnnotations().k0(H.f8440b)) {
            return true;
        }
        return interfaceC7224b.getAnnotations().k0(H.f8440b);
    }

    public static boolean c(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(1);
        }
        return bf.i.x(interfaceC7235m) && bf.i.w(interfaceC7235m.b()) && !d((InterfaceC7227e) interfaceC7235m);
    }

    public static boolean d(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(2);
        }
        return ve.e.a(ve.d.f62095a, interfaceC7227e);
    }

    public static boolean e(Z z10) {
        if (z10 == null) {
            a(0);
        }
        if (z10.h() == InterfaceC7224b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(z10.b())) {
            return true;
        }
        return bf.i.x(z10.b()) && b(z10);
    }
}
