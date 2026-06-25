package kf;

import qf.S;

/* JADX INFO: renamed from: kf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5469a implements InterfaceC5475g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final S f52189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5475g f52190b;

    public AbstractC5469a(S s10, InterfaceC5475g interfaceC5475g) {
        if (s10 == null) {
            b(0);
        }
        this.f52189a = s10;
        this.f52190b = interfaceC5475g == null ? this : interfaceC5475g;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kf.InterfaceC5475g
    public S getType() {
        S s10 = this.f52189a;
        if (s10 == null) {
            b(1);
        }
        return s10;
    }
}
