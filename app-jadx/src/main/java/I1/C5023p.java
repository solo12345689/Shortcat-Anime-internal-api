package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5023p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48564e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C5023p f48565f = new C5023p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48569d;

    /* JADX INFO: renamed from: i1.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5023p a() {
            return C5023p.f48565f;
        }

        private a() {
        }
    }

    public C5023p(int i10, int i11, int i12, int i13) {
        this.f48566a = i10;
        this.f48567b = i11;
        this.f48568c = i12;
        this.f48569d = i13;
    }

    public static /* synthetic */ C5023p c(C5023p c5023p, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c5023p.f48566a;
        }
        if ((i14 & 2) != 0) {
            i11 = c5023p.f48567b;
        }
        if ((i14 & 4) != 0) {
            i12 = c5023p.f48568c;
        }
        if ((i14 & 8) != 0) {
            i13 = c5023p.f48569d;
        }
        return c5023p.b(i10, i11, i12, i13);
    }

    public final C5023p b(int i10, int i11, int i12, int i13) {
        return new C5023p(i10, i11, i12, i13);
    }

    public final int d() {
        return this.f48569d;
    }

    public final int e() {
        return this.f48569d - this.f48567b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5023p)) {
            return false;
        }
        C5023p c5023p = (C5023p) obj;
        return this.f48566a == c5023p.f48566a && this.f48567b == c5023p.f48567b && this.f48568c == c5023p.f48568c && this.f48569d == c5023p.f48569d;
    }

    public final int f() {
        return this.f48566a;
    }

    public final int g() {
        return this.f48568c;
    }

    public final int h() {
        return this.f48567b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f48566a) * 31) + Integer.hashCode(this.f48567b)) * 31) + Integer.hashCode(this.f48568c)) * 31) + Integer.hashCode(this.f48569d);
    }

    public final long i() {
        return C5021n.f((((long) this.f48567b) & 4294967295L) | (((long) this.f48566a) << 32));
    }

    public final int j() {
        return this.f48568c - this.f48566a;
    }

    public final boolean k() {
        return this.f48566a >= this.f48568c || this.f48567b >= this.f48569d;
    }

    public final C5023p l(int i10, int i11) {
        return new C5023p(this.f48566a + i10, this.f48567b + i11, this.f48568c + i10, this.f48569d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f48566a + ", " + this.f48567b + ", " + this.f48568c + ", " + this.f48569d + ')';
    }
}
