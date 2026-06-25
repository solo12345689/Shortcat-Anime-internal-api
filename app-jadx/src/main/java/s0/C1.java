package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f58867d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1 f58868e = new C1(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f58871c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1 a() {
            return C1.f58868e;
        }

        private a() {
        }
    }

    public /* synthetic */ C1(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f58871c;
    }

    public final long c() {
        return this.f58869a;
    }

    public final long d() {
        return this.f58870b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return false;
        }
        C1 c12 = (C1) obj;
        return C6385r0.s(this.f58869a, c12.f58869a) && C6224f.j(this.f58870b, c12.f58870b) && this.f58871c == c12.f58871c;
    }

    public int hashCode() {
        return (((C6385r0.y(this.f58869a) * 31) + C6224f.o(this.f58870b)) * 31) + Float.hashCode(this.f58871c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C6385r0.z(this.f58869a)) + ", offset=" + ((Object) C6224f.s(this.f58870b)) + ", blurRadius=" + this.f58871c + ')';
    }

    private C1(long j10, long j11, float f10) {
        this.f58869a = j10;
        this.f58870b = j11;
        this.f58871c = f10;
    }

    public /* synthetic */ C1(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6387s0.d(4278190080L) : j10, (i10 & 2) != 0 ? C6224f.f58329b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
