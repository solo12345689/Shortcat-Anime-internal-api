package H6;

import Td.L;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile g f7987d;

    static {
        h hVar = new h();
        f7984a = hVar;
        f7985b = hVar.b();
        f7986c = 384;
    }

    private h() {
    }

    public static final g a() {
        if (f7987d == null) {
            synchronized (h.class) {
                try {
                    if (f7987d == null) {
                        f7987d = new g(f7986c, f7985b);
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        g gVar = f7987d;
        AbstractC5504s.e(gVar);
        return gVar;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
