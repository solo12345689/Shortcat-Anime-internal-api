package y6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64872c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f64873d = new h(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f64874e = new h(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f64875f = new h(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f64876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f64877b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f64873d;
        }

        public final h b() {
            return h.f64874e;
        }

        private a() {
        }
    }

    private h(int i10, boolean z10) {
        this.f64876a = i10;
        this.f64877b = z10;
    }

    public static final h c() {
        return f64872c.a();
    }

    public static final h e() {
        return f64872c.b();
    }

    public final boolean d() {
        return this.f64877b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f64876a == hVar.f64876a && this.f64877b == hVar.f64877b;
    }

    public final int f() {
        if (h()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f64876a;
    }

    public final boolean g() {
        return this.f64876a != -2;
    }

    public final boolean h() {
        return this.f64876a == -1;
    }

    public int hashCode() {
        return G5.b.b(Integer.valueOf(this.f64876a), Boolean.valueOf(this.f64877b));
    }

    public String toString() {
        U u10 = U.f52264a;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f64876a), Boolean.valueOf(this.f64877b)}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
