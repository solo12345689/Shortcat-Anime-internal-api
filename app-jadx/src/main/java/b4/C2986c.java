package b4;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2986c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33098b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2986c f33099c = new C2986c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2986c f33100d = new C2986c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2986c f33101e = new C2986c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33102a;

    /* JADX INFO: renamed from: b4.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2986c a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 600.0f ? C2986c.f33099c : f10 < 840.0f ? C2986c.f33100d : C2986c.f33101e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f10).toString());
        }

        private a() {
        }
    }

    private C2986c(int i10) {
        this.f33102a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2986c.class == obj.getClass() && this.f33102a == ((C2986c) obj).f33102a;
    }

    public int hashCode() {
        return this.f33102a;
    }

    public String toString() {
        return "WindowWidthSizeClass: " + (AbstractC5504s.c(this, f33099c) ? "COMPACT" : AbstractC5504s.c(this, f33100d) ? "MEDIUM" : AbstractC5504s.c(this, f33101e) ? "EXPANDED" : "UNKNOWN");
    }
}
