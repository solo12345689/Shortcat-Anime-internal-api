package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r0.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6226h {

    /* JADX INFO: renamed from: e */
    public static final a f58334e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final C6226h f58335f = new C6226h(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    private final float f58336a;

    /* JADX INFO: renamed from: b */
    private final float f58337b;

    /* JADX INFO: renamed from: c */
    private final float f58338c;

    /* JADX INFO: renamed from: d */
    private final float f58339d;

    /* JADX INFO: renamed from: r0.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6226h a() {
            return C6226h.f58335f;
        }

        private a() {
        }
    }

    public C6226h(float f10, float f11, float f12, float f13) {
        this.f58336a = f10;
        this.f58337b = f11;
        this.f58338c = f12;
        this.f58339d = f13;
    }

    public static /* synthetic */ C6226h d(C6226h c6226h, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c6226h.f58336a;
        }
        if ((i10 & 2) != 0) {
            f11 = c6226h.f58337b;
        }
        if ((i10 & 4) != 0) {
            f12 = c6226h.f58338c;
        }
        if ((i10 & 8) != 0) {
            f13 = c6226h.f58339d;
        }
        return c6226h.c(f10, f11, f12, f13);
    }

    public final boolean b(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat >= this.f58336a) & (fIntBitsToFloat < this.f58338c) & (fIntBitsToFloat2 >= this.f58337b) & (fIntBitsToFloat2 < this.f58339d);
    }

    public final C6226h c(float f10, float f11, float f12, float f13) {
        return new C6226h(f10, f11, f12, f13);
    }

    public final float e() {
        return this.f58339d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6226h)) {
            return false;
        }
        C6226h c6226h = (C6226h) obj;
        return Float.compare(this.f58336a, c6226h.f58336a) == 0 && Float.compare(this.f58337b, c6226h.f58337b) == 0 && Float.compare(this.f58338c, c6226h.f58338c) == 0 && Float.compare(this.f58339d, c6226h.f58339d) == 0;
    }

    public final long f() {
        float f10 = this.f58338c;
        return C6224f.e((((long) Float.floatToRawIntBits(this.f58339d)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final long g() {
        float fJ = this.f58336a + ((j() - i()) / 2.0f);
        return C6224f.e((((long) Float.floatToRawIntBits(this.f58337b + ((e() - l()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
    }

    public final float h() {
        return e() - l();
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f58336a) * 31) + Float.hashCode(this.f58337b)) * 31) + Float.hashCode(this.f58338c)) * 31) + Float.hashCode(this.f58339d);
    }

    public final float i() {
        return this.f58336a;
    }

    public final float j() {
        return this.f58338c;
    }

    public final long k() {
        float fJ = j() - i();
        return C6230l.d((((long) Float.floatToRawIntBits(e() - l())) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
    }

    public final float l() {
        return this.f58337b;
    }

    public final long m() {
        float f10 = this.f58336a;
        return C6224f.e((((long) Float.floatToRawIntBits(this.f58337b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float n() {
        return j() - i();
    }

    public final C6226h o(float f10, float f11, float f12, float f13) {
        return new C6226h(Math.max(this.f58336a, f10), Math.max(this.f58337b, f11), Math.min(this.f58338c, f12), Math.min(this.f58339d, f13));
    }

    public final C6226h p(C6226h c6226h) {
        return new C6226h(Math.max(this.f58336a, c6226h.f58336a), Math.max(this.f58337b, c6226h.f58337b), Math.min(this.f58338c, c6226h.f58338c), Math.min(this.f58339d, c6226h.f58339d));
    }

    public final boolean q() {
        return (this.f58336a >= this.f58338c) | (this.f58337b >= this.f58339d);
    }

    public final boolean r(C6226h c6226h) {
        return (this.f58336a < c6226h.f58338c) & (c6226h.f58336a < this.f58338c) & (this.f58337b < c6226h.f58339d) & (c6226h.f58337b < this.f58339d);
    }

    public final C6226h s(float f10, float f11) {
        return new C6226h(this.f58336a + f10, this.f58337b + f11, this.f58338c + f10, this.f58339d + f11);
    }

    public final C6226h t(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new C6226h(this.f58336a + Float.intBitsToFloat(i10), this.f58337b + Float.intBitsToFloat(i11), this.f58338c + Float.intBitsToFloat(i10), this.f58339d + Float.intBitsToFloat(i11));
    }

    public String toString() {
        return "Rect.fromLTRB(" + AbstractC6221c.a(this.f58336a, 1) + ", " + AbstractC6221c.a(this.f58337b, 1) + ", " + AbstractC6221c.a(this.f58338c, 1) + ", " + AbstractC6221c.a(this.f58339d, 1) + ')';
    }
}
