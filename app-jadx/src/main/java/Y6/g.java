package y6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f64867e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f64870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f64871d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f64868a = i10;
        this.f64869b = i11;
        this.f64870c = f10;
        this.f64871d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f64868a == gVar.f64868a && this.f64869b == gVar.f64869b;
    }

    public int hashCode() {
        return G5.b.a(this.f64868a, this.f64869b);
    }

    public String toString() {
        U u10 = U.f52264a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f64868a), Integer.valueOf(this.f64869b)}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}
