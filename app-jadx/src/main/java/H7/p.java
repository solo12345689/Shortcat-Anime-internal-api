package H7;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f8094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f8095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f8096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f8097d;

    public p(q topLeft, q topRight, q bottomLeft, q bottomRight) {
        AbstractC5504s.h(topLeft, "topLeft");
        AbstractC5504s.h(topRight, "topRight");
        AbstractC5504s.h(bottomLeft, "bottomLeft");
        AbstractC5504s.h(bottomRight, "bottomRight");
        this.f8094a = topLeft;
        this.f8095b = topRight;
        this.f8096c = bottomLeft;
        this.f8097d = bottomRight;
    }

    public final q a() {
        return this.f8096c;
    }

    public final q b() {
        return this.f8097d;
    }

    public final q c() {
        return this.f8094a;
    }

    public final q d() {
        return this.f8095b;
    }

    public final boolean e() {
        return this.f8094a.a() > 0.0f || this.f8094a.b() > 0.0f || this.f8095b.a() > 0.0f || this.f8095b.b() > 0.0f || this.f8096c.a() > 0.0f || this.f8096c.b() > 0.0f || this.f8097d.a() > 0.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC5504s.c(this.f8094a, pVar.f8094a) && AbstractC5504s.c(this.f8095b, pVar.f8095b) && AbstractC5504s.c(this.f8096c, pVar.f8096c) && AbstractC5504s.c(this.f8097d, pVar.f8097d);
    }

    public final boolean f() {
        return AbstractC5504s.c(this.f8094a, this.f8095b) && AbstractC5504s.c(this.f8094a, this.f8096c) && AbstractC5504s.c(this.f8094a, this.f8097d);
    }

    public int hashCode() {
        return (((((this.f8094a.hashCode() * 31) + this.f8095b.hashCode()) * 31) + this.f8096c.hashCode()) * 31) + this.f8097d.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f8094a + ", topRight=" + this.f8095b + ", bottomLeft=" + this.f8096c + ", bottomRight=" + this.f8097d + ")";
    }
}
