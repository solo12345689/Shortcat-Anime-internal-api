package G5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum e {
    YES,
    NO,
    UNSET;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7391a;

        static {
            int[] iArr = new int[e.values().length];
            f7391a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7391a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7391a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e c(boolean z10) {
        return z10 ? YES : NO;
    }

    public boolean a() {
        int i10 = a.f7391a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean b() {
        return this != UNSET;
    }
}
