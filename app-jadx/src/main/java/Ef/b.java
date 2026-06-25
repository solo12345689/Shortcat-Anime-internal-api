package Ef;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f5966a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f5967b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f5967b = threadLocalArr;
    }

    public static final boolean a() {
        return f5966a;
    }
}
