package He;

import Td.C2161l;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8421d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C f8422e = new C(O.f8502e, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f8423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2161l f8424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f8425c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f8422e;
        }

        private a() {
        }
    }

    public C(O reportLevelBefore, C2161l c2161l, O reportLevelAfter) {
        AbstractC5504s.h(reportLevelBefore, "reportLevelBefore");
        AbstractC5504s.h(reportLevelAfter, "reportLevelAfter");
        this.f8423a = reportLevelBefore;
        this.f8424b = c2161l;
        this.f8425c = reportLevelAfter;
    }

    public final O b() {
        return this.f8425c;
    }

    public final O c() {
        return this.f8423a;
    }

    public final C2161l d() {
        return this.f8424b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f8423a == c10.f8423a && AbstractC5504s.c(this.f8424b, c10.f8424b) && this.f8425c == c10.f8425c;
    }

    public int hashCode() {
        int iHashCode = this.f8423a.hashCode() * 31;
        C2161l c2161l = this.f8424b;
        return ((iHashCode + (c2161l == null ? 0 : c2161l.hashCode())) * 31) + this.f8425c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f8423a + ", sinceVersion=" + this.f8424b + ", reportLevelAfter=" + this.f8425c + ')';
    }

    public /* synthetic */ C(O o10, C2161l c2161l, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new C2161l(1, 0) : c2161l, (i10 & 4) != 0 ? o10 : o11);
    }
}
