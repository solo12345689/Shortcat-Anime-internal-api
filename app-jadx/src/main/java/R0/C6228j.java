package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: r0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6228j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f58340i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C6228j f58341j = AbstractC6229k.c(0.0f, 0.0f, 0.0f, 0.0f, AbstractC6219a.f58323a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f58342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f58343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f58344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f58345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f58346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f58347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f58348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f58349h;

    /* JADX INFO: renamed from: r0.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C6228j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f58345d;
    }

    public final long b() {
        return this.f58349h;
    }

    public final long c() {
        return this.f58348g;
    }

    public final float d() {
        return this.f58345d - this.f58343b;
    }

    public final float e() {
        return this.f58342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6228j)) {
            return false;
        }
        C6228j c6228j = (C6228j) obj;
        return Float.compare(this.f58342a, c6228j.f58342a) == 0 && Float.compare(this.f58343b, c6228j.f58343b) == 0 && Float.compare(this.f58344c, c6228j.f58344c) == 0 && Float.compare(this.f58345d, c6228j.f58345d) == 0 && AbstractC6219a.c(this.f58346e, c6228j.f58346e) && AbstractC6219a.c(this.f58347f, c6228j.f58347f) && AbstractC6219a.c(this.f58348g, c6228j.f58348g) && AbstractC6219a.c(this.f58349h, c6228j.f58349h);
    }

    public final float f() {
        return this.f58344c;
    }

    public final float g() {
        return this.f58343b;
    }

    public final long h() {
        return this.f58346e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f58342a) * 31) + Float.hashCode(this.f58343b)) * 31) + Float.hashCode(this.f58344c)) * 31) + Float.hashCode(this.f58345d)) * 31) + AbstractC6219a.f(this.f58346e)) * 31) + AbstractC6219a.f(this.f58347f)) * 31) + AbstractC6219a.f(this.f58348g)) * 31) + AbstractC6219a.f(this.f58349h);
    }

    public final long i() {
        return this.f58347f;
    }

    public final float j() {
        return this.f58344c - this.f58342a;
    }

    public String toString() {
        long j10 = this.f58346e;
        long j11 = this.f58347f;
        long j12 = this.f58348g;
        long j13 = this.f58349h;
        String str = AbstractC6221c.a(this.f58342a, 1) + ", " + AbstractC6221c.a(this.f58343b, 1) + ", " + AbstractC6221c.a(this.f58344c, 1) + ", " + AbstractC6221c.a(this.f58345d, 1);
        if (!AbstractC6219a.c(j10, j11) || !AbstractC6219a.c(j11, j12) || !AbstractC6219a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC6219a.g(j10)) + ", topRight=" + ((Object) AbstractC6219a.g(j11)) + ", bottomRight=" + ((Object) AbstractC6219a.g(j12)) + ", bottomLeft=" + ((Object) AbstractC6219a.g(j13)) + ')';
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC6221c.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC6221c.a(Float.intBitsToFloat(i10), 1) + ", y=" + AbstractC6221c.a(Float.intBitsToFloat(i11), 1) + ')';
    }

    private C6228j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f58342a = f10;
        this.f58343b = f11;
        this.f58344c = f12;
        this.f58345d = f13;
        this.f58346e = j10;
        this.f58347f = j11;
        this.f58348g = j12;
        this.f58349h = j13;
    }
}
