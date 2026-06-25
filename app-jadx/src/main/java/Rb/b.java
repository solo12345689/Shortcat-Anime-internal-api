package Rb;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15445c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f15446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15447b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(d status, boolean z10) {
        AbstractC5504s.h(status, "status");
        this.f15446a = status;
        this.f15447b = z10;
    }

    public final boolean a() {
        return this.f15447b;
    }

    public final d b() {
        return this.f15446a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15446a == bVar.f15446a && this.f15447b == bVar.f15447b;
    }

    public int hashCode() {
        return (this.f15446a.hashCode() * 31) + Boolean.hashCode(this.f15447b);
    }

    public String toString() {
        return "PermissionsResponse(status=" + this.f15446a + ", canAskAgain=" + this.f15447b + ")";
    }
}
