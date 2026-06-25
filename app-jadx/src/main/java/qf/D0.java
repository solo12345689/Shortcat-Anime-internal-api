package qf;

import rf.AbstractC6317g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class D0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0 f57964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f57965b;

    public D0(N0 n02, S s10) {
        if (n02 == null) {
            c(0);
        }
        if (s10 == null) {
            c(1);
        }
        this.f57964a = n02;
        this.f57965b = s10;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // qf.B0
    public boolean a() {
        return false;
    }

    @Override // qf.B0
    public N0 b() {
        N0 n02 = this.f57964a;
        if (n02 == null) {
            c(4);
        }
        return n02;
    }

    @Override // qf.B0
    public S getType() {
        S s10 = this.f57965b;
        if (s10 == null) {
            c(5);
        }
        return s10;
    }

    @Override // qf.B0
    public B0 o(AbstractC6317g abstractC6317g) {
        if (abstractC6317g == null) {
            c(6);
        }
        return new D0(this.f57964a, abstractC6317g.a(this.f57965b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D0(S s10) {
        this(N0.f57999e, s10);
        if (s10 == null) {
            c(2);
        }
    }
}
