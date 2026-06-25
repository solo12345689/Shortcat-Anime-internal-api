package H6;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f7999a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f8000b = new SparseIntArray(0);

    private n() {
    }

    public static final E a() {
        return new E(0, f7999a.b(), f8000b);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
