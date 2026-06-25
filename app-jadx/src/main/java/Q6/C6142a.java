package q6;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.c;

/* JADX INFO: renamed from: q6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6142a implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f57636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f57638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57639f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f57642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f57643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f57644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f57645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f57646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f57647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f57648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f57649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f57650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f57651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f57652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f57653t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0871a f57635b = new C0871a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f57640g = f.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f57641h = f.a("GIF89a");

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0871a {
        public /* synthetic */ C0871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int k(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c l(byte[] bArr, int i10) {
            if (H5.c.h(bArr, 0, i10)) {
                return H5.c.g(bArr, 0) ? b.f57661g : H5.c.f(bArr, 0) ? b.f57662h : H5.c.c(bArr, 0, i10) ? H5.c.b(bArr, 0) ? b.f57665k : H5.c.d(bArr, 0) ? b.f57664j : b.f57663i : c.f57672d;
            }
            throw new IllegalStateException("Check failed.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 >= 12 && k(bArr) >= 8 && f.b(bArr, C6142a.f57652s, 4)) {
                return f.b(bArr, C6142a.f57653t, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            return i10 >= 4 && f.c(bArr, C6142a.f57651r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            if (i10 < C6142a.f57642i.length) {
                return false;
            }
            return f.c(bArr, C6142a.f57642i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            if (i10 >= C6142a.f57650q) {
                return f.c(bArr, C6142a.f57648o) || f.c(bArr, C6142a.f57649p);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return f.c(bArr, C6142a.f57640g) || f.c(bArr, C6142a.f57641h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, C6142a.f57646m, 4)) {
                return false;
            }
            for (byte[] bArr2 : C6142a.f57647n) {
                if (f.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s(byte[] bArr, int i10) {
            if (i10 < C6142a.f57644k.length) {
                return false;
            }
            return f.c(bArr, C6142a.f57644k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(byte[] bArr, int i10) {
            return i10 >= C6142a.f57636c.length && f.c(bArr, C6142a.f57636c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(byte[] bArr, int i10) {
            return i10 >= C6142a.f57638e.length && f.c(bArr, C6142a.f57638e);
        }

        private C0871a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f57636c = bArr;
        f57637d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f57638e = bArr2;
        f57639f = bArr2.length;
        byte[] bArrA = f.a("BM");
        f57642i = bArrA;
        f57643j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f57644k = bArr3;
        f57645l = bArr3.length;
        f57646m = f.a("ftyp");
        f57647n = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f57648o = bArr4;
        f57649p = new byte[]{77, 77, 0, 42};
        f57650q = bArr4.length;
        f57651r = new byte[]{3, 0, 8, 0};
        f57652s = f.a("ftyp");
        f57653t = f.a("avif");
    }

    public C6142a() {
        Object objD0 = AbstractC2273n.D0(new Integer[]{21, 20, Integer.valueOf(f57637d), Integer.valueOf(f57639f), 6, Integer.valueOf(f57643j), Integer.valueOf(f57645l), 12, 4, 12});
        if (objD0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f57654a = ((Number) objD0).intValue();
    }

    @Override // q6.c.b
    public c a(byte[] headerBytes, int i10) {
        AbstractC5504s.h(headerBytes, "headerBytes");
        if (H5.c.h(headerBytes, 0, i10)) {
            return f57635b.l(headerBytes, i10);
        }
        C0871a c0871a = f57635b;
        return c0871a.t(headerBytes, i10) ? b.f57656b : c0871a.u(headerBytes, i10) ? b.f57657c : c0871a.q(headerBytes, i10) ? b.f57658d : c0871a.o(headerBytes, i10) ? b.f57659e : c0871a.s(headerBytes, i10) ? b.f57660f : c0871a.m(headerBytes, i10) ? b.f57669o : c0871a.r(headerBytes, i10) ? b.f57666l : c0871a.n(headerBytes, i10) ? b.f57668n : c0871a.p(headerBytes, i10) ? b.f57667m : c.f57672d;
    }

    @Override // q6.c.b
    public int b() {
        return this.f57654a;
    }
}
