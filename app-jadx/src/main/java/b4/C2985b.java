package b4;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2985b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33095c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2986c f33096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2984a f33097b;

    /* JADX INFO: renamed from: b4.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2985b a(float f10, float f11) {
            return new C2985b(C2986c.f33098b.a(f10), C2984a.f33090b.a(f11), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2985b(C2986c c2986c, C2984a c2984a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2986c, c2984a);
    }

    public final C2984a a() {
        return this.f33097b;
    }

    public final C2986c b() {
        return this.f33096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C2985b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        C2985b c2985b = (C2985b) obj;
        return AbstractC5504s.c(this.f33096a, c2985b.f33096a) && AbstractC5504s.c(this.f33097b, c2985b.f33097b);
    }

    public int hashCode() {
        return (this.f33096a.hashCode() * 31) + this.f33097b.hashCode();
    }

    public String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.f33096a + ", windowHeightSizeClass=" + this.f33097b + " }";
    }

    private C2985b(C2986c c2986c, C2984a c2984a) {
        this.f33096a = c2986c;
        this.f33097b = c2984a;
    }
}
