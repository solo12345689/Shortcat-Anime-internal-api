package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47305c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q f47306d = new q(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f47307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f47308b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f47306d;
        }

        private a() {
        }
    }

    public q(float f10, float f11) {
        this.f47307a = f10;
        this.f47308b = f11;
    }

    public final float b() {
        return this.f47307a;
    }

    public final float c() {
        return this.f47308b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f47307a == qVar.f47307a && this.f47308b == qVar.f47308b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f47307a) * 31) + Float.hashCode(this.f47308b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f47307a + ", skewX=" + this.f47308b + ')';
    }
}
