package b4;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2984a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0557a f33090b = new C0557a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2984a f33091c = new C2984a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2984a f33092d = new C2984a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2984a f33093e = new C2984a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33094a;

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0557a {
        public /* synthetic */ C0557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2984a a(float f10) {
            if (f10 >= 0.0f) {
                return f10 < 480.0f ? C2984a.f33091c : f10 < 900.0f ? C2984a.f33092d : C2984a.f33093e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f10).toString());
        }

        private C0557a() {
        }
    }

    private C2984a(int i10) {
        this.f33094a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2984a.class == obj.getClass() && this.f33094a == ((C2984a) obj).f33094a;
    }

    public int hashCode() {
        return this.f33094a;
    }

    public String toString() {
        return "WindowHeightSizeClass: " + (AbstractC5504s.c(this, f33091c) ? "COMPACT" : AbstractC5504s.c(this, f33092d) ? "MEDIUM" : AbstractC5504s.c(this, f33093e) ? "EXPANDED" : "UNKNOWN");
    }
}
