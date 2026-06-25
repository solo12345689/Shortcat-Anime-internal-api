package g1;

import i1.AbstractC5030w;
import i1.C5029v;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47309c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s f47310d = new s(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47312b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            return s.f47310d;
        }

        private a() {
        }
    }

    public /* synthetic */ s(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long b() {
        return this.f47311a;
    }

    public final long c() {
        return this.f47312b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C5029v.e(this.f47311a, sVar.f47311a) && C5029v.e(this.f47312b, sVar.f47312b);
    }

    public int hashCode() {
        return (C5029v.i(this.f47311a) * 31) + C5029v.i(this.f47312b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) C5029v.j(this.f47311a)) + ", restLine=" + ((Object) C5029v.j(this.f47312b)) + ')';
    }

    private s(long j10, long j11) {
        this.f47311a = j10;
        this.f47312b = j11;
    }

    public /* synthetic */ s(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5030w.f(0) : j10, (i10 & 2) != 0 ? AbstractC5030w.f(0) : j11, null);
    }
}
