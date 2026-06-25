package i1;

import Td.C2160k;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5009b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48540b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48541a;

    /* JADX INFO: renamed from: i1.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        AbstractC5010c.m(i15);
                        throw new C2160k();
                    }
                    i14 = 8190;
                }
            }
            return AbstractC5010c.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long b(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        AbstractC5010c.m(i15);
                        throw new C2160k();
                    }
                    i14 = 8190;
                }
            }
            return AbstractC5010c.a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
        }

        public final long c(int i10, int i11) {
            if (!((i11 >= 0) & (i10 >= 0))) {
                AbstractC5020m.a("width and height must be >= 0");
            }
            return AbstractC5010c.h(i10, i10, i11, i11);
        }

        public final long d(int i10) {
            if (!(i10 >= 0)) {
                AbstractC5020m.a("height must be >= 0");
            }
            return AbstractC5010c.h(0, Integer.MAX_VALUE, i10, i10);
        }

        public final long e(int i10) {
            if (!(i10 >= 0)) {
                AbstractC5020m.a("width must be >= 0");
            }
            return AbstractC5010c.h(i10, i10, 0, Integer.MAX_VALUE);
        }

        private a() {
        }
    }

    private /* synthetic */ C5009b(long j10) {
        this.f48541a = j10;
    }

    public static final /* synthetic */ C5009b a(long j10) {
        return new C5009b(j10);
    }

    public static final long c(long j10, int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10 && i13 >= i12 && i10 >= 0 && i12 >= 0)) {
            AbstractC5020m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC5010c.h(i10, i11, i12, i13);
    }

    public static /* synthetic */ long d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = k(j10);
        }
        return c(j10, i15, i16, i17, i13);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C5009b) && j10 == ((C5009b) obj).r();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean h(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean j(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int m(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int n(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    public static String q(long j10) {
        int iL = l(j10);
        String strValueOf = iL == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iL);
        int iK = k(j10);
        return "Constraints(minWidth = " + n(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + m(j10) + ", maxHeight = " + (iK != Integer.MAX_VALUE ? String.valueOf(iK) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f48541a, obj);
    }

    public int hashCode() {
        return o(this.f48541a);
    }

    public final /* synthetic */ long r() {
        return this.f48541a;
    }

    public String toString() {
        return q(this.f48541a);
    }

    public static long b(long j10) {
        return j10;
    }
}
