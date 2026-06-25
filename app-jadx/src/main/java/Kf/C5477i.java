package kf;

import qf.S;

/* JADX INFO: renamed from: kf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C5477i extends AbstractC5469a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5477i(S s10) {
        this(s10, null);
        if (s10 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C5477i(S s10, InterfaceC5475g interfaceC5475g) {
        super(s10, interfaceC5475g);
        if (s10 == null) {
            b(1);
        }
    }
}
