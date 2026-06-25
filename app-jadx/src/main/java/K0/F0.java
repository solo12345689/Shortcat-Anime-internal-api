package K0;

import i1.EnumC5027t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a */
    public static final a f10418a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final long f10419b = G0.b(0, 0, 0, 0, 14, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long d(int i10, int i11) {
            return ((long) (i10 & 32767)) << (i11 * 15);
        }

        public final int e(long j10, int i10) {
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        public final long b() {
            return F0.f10419b;
        }

        public final long c(int i10, int i11, int i12, int i13, boolean z10) {
            return d(i11, 1) | d(i10, 0) | d(i12, 2) | d(i13, 3) | (z10 ? Long.MIN_VALUE : 0L);
        }

        private a() {
        }
    }

    public static final int b(long j10, EnumC5027t enumC5027t) {
        return (!i(j10) || enumC5027t == EnumC5027t.f48573a) ? g(j10) : f(j10);
    }

    public static final int c(long j10, EnumC5027t enumC5027t) {
        return (!i(j10) || enumC5027t == EnumC5027t.f48573a) ? f(j10) : g(j10);
    }

    public static final int e(long j10) {
        return f10418a.e(j10, 3);
    }

    public static final int f(long j10) {
        return f10418a.e(j10, 2);
    }

    public static final int g(long j10) {
        return f10418a.e(j10, 0);
    }

    public static final int h(long j10) {
        return f10418a.e(j10, 1);
    }

    public static final boolean i(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }

    public static long d(long j10) {
        return j10;
    }
}
