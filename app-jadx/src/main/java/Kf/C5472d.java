package kf;

import qf.S;
import ye.InterfaceC7223a;

/* JADX INFO: renamed from: kf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C5472d extends AbstractC5469a implements InterfaceC5475g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7223a f52195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5472d(InterfaceC7223a interfaceC7223a, S s10, InterfaceC5475g interfaceC5475g) {
        super(s10, interfaceC5475g);
        if (interfaceC7223a == null) {
            b(0);
        }
        if (s10 == null) {
            b(1);
        }
        this.f52195c = interfaceC7223a;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f52195c + "}";
    }
}
