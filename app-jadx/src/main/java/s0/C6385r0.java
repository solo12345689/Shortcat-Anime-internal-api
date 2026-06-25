package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t0.AbstractC6580c;
import t0.AbstractC6581d;

/* JADX INFO: renamed from: s0.r0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6385r0 {

    /* JADX INFO: renamed from: b */
    public static final a f58985b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final long f58986c = AbstractC6387s0.d(4278190080L);

    /* JADX INFO: renamed from: d */
    private static final long f58987d = AbstractC6387s0.d(4282664004L);

    /* JADX INFO: renamed from: e */
    private static final long f58988e = AbstractC6387s0.d(4287137928L);

    /* JADX INFO: renamed from: f */
    private static final long f58989f = AbstractC6387s0.d(4291611852L);

    /* JADX INFO: renamed from: g */
    private static final long f58990g = AbstractC6387s0.d(4294967295L);

    /* JADX INFO: renamed from: h */
    private static final long f58991h = AbstractC6387s0.d(4294901760L);

    /* JADX INFO: renamed from: i */
    private static final long f58992i = AbstractC6387s0.d(4278255360L);

    /* JADX INFO: renamed from: j */
    private static final long f58993j = AbstractC6387s0.d(4278190335L);

    /* JADX INFO: renamed from: k */
    private static final long f58994k = AbstractC6387s0.d(4294967040L);

    /* JADX INFO: renamed from: l */
    private static final long f58995l = AbstractC6387s0.d(4278255615L);

    /* JADX INFO: renamed from: m */
    private static final long f58996m = AbstractC6387s0.d(4294902015L);

    /* JADX INFO: renamed from: n */
    private static final long f58997n = AbstractC6387s0.b(0);

    /* JADX INFO: renamed from: o */
    private static final long f58998o = AbstractC6387s0.a(0.0f, 0.0f, 0.0f, 0.0f, t0.k.f60205a.I());

    /* JADX INFO: renamed from: a */
    private final long f58999a;

    /* JADX INFO: renamed from: s0.r0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C6385r0.f58986c;
        }

        public final long b() {
            return C6385r0.f58993j;
        }

        public final long c() {
            return C6385r0.f58995l;
        }

        public final long d() {
            return C6385r0.f58987d;
        }

        public final long e() {
            return C6385r0.f58988e;
        }

        public final long f() {
            return C6385r0.f58992i;
        }

        public final long g() {
            return C6385r0.f58989f;
        }

        public final long h() {
            return C6385r0.f58991h;
        }

        public final long i() {
            return C6385r0.f58997n;
        }

        public final long j() {
            return C6385r0.f58998o;
        }

        public final long k() {
            return C6385r0.f58990g;
        }

        public final long l() {
            return C6385r0.f58994k;
        }

        private a() {
        }
    }

    private /* synthetic */ C6385r0(long j10) {
        this.f58999a = j10;
    }

    public static final /* synthetic */ C6385r0 m(long j10) {
        return new C6385r0(j10);
    }

    public static final long o(long j10, AbstractC6580c abstractC6580c) {
        return AbstractC6581d.i(v(j10), abstractC6580c, 0, 2, null).a(j10);
    }

    public static final long p(long j10, float f10, float f11, float f12, float f13) {
        return AbstractC6387s0.a(f11, f12, f13, f10, v(j10));
    }

    public static /* synthetic */ long q(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = t(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = x(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = w(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = u(j10);
        }
        return p(j10, f14, f15, f16, f13);
    }

    public static boolean r(long j10, Object obj) {
        return (obj instanceof C6385r0) && j10 == ((C6385r0) obj).A();
    }

    public static final boolean s(long j10, long j11) {
        return Td.F.h(j10, j11);
    }

    public static final float t(long j10) {
        float fE;
        float f10;
        if (Td.F.b(63 & j10) == 0) {
            fE = (float) Td.N.e(Td.F.b(Td.F.b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fE = (float) Td.N.e(Td.F.b(Td.F.b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fE / f10;
    }

    public static final float u(long j10) {
        int i10;
        int i11;
        int i12;
        if (Td.F.b(63 & j10) == 0) {
            return ((float) Td.N.e(Td.F.b(Td.F.b(j10 >>> 32) & 255))) / 255.0f;
        }
        short sB = (short) Td.F.b(Td.F.b(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Y0.f58923a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final AbstractC6580c v(long j10) {
        t0.k kVar = t0.k.f60205a;
        return kVar.v()[(int) Td.F.b(j10 & 63)];
    }

    public static final float w(long j10) {
        int i10;
        int i11;
        int i12;
        if (Td.F.b(63 & j10) == 0) {
            return ((float) Td.N.e(Td.F.b(Td.F.b(j10 >>> 40) & 255))) / 255.0f;
        }
        short sB = (short) Td.F.b(Td.F.b(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Y0.f58923a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float x(long j10) {
        int i10;
        int i11;
        int i12;
        if (Td.F.b(63 & j10) == 0) {
            return ((float) Td.N.e(Td.F.b(Td.F.b(j10 >>> 48) & 255))) / 255.0f;
        }
        short sB = (short) Td.F.b(Td.F.b(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sB;
        int i14 = ((65535 & sB) >>> 10) & 31;
        int i15 = sB & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Y0.f58923a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int y(long j10) {
        return Td.F.k(j10);
    }

    public static String z(long j10) {
        return "Color(" + x(j10) + ", " + w(j10) + ", " + u(j10) + ", " + t(j10) + ", " + v(j10).f() + ')';
    }

    public final /* synthetic */ long A() {
        return this.f58999a;
    }

    public boolean equals(Object obj) {
        return r(this.f58999a, obj);
    }

    public int hashCode() {
        return y(this.f58999a);
    }

    public String toString() {
        return z(this.f58999a);
    }

    public static long n(long j10) {
        return j10;
    }
}
