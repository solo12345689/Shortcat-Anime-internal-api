package T;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16692d;

    public d(float f10, float f11, float f12, float f13) {
        this.f16689a = f10;
        this.f16690b = f11;
        this.f16691c = f12;
        this.f16692d = f13;
    }

    public final float a() {
        return this.f16689a;
    }

    public final float b() {
        return this.f16690b;
    }

    public final float c() {
        return this.f16691c;
    }

    public final float d() {
        return this.f16692d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16689a == dVar.f16689a && this.f16690b == dVar.f16690b && this.f16691c == dVar.f16691c && this.f16692d == dVar.f16692d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f16689a) * 31) + Float.hashCode(this.f16690b)) * 31) + Float.hashCode(this.f16691c)) * 31) + Float.hashCode(this.f16692d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f16689a + ", focusedAlpha=" + this.f16690b + ", hoveredAlpha=" + this.f16691c + ", pressedAlpha=" + this.f16692d + ')';
    }
}
