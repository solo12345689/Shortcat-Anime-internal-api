package com.th3rdwave.safeareacontext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f44844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f44845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f44846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f44847d;

    public a(float f10, float f11, float f12, float f13) {
        this.f44844a = f10;
        this.f44845b = f11;
        this.f44846c = f12;
        this.f44847d = f13;
    }

    public final float a() {
        return this.f44846c;
    }

    public final float b() {
        return this.f44847d;
    }

    public final float c() {
        return this.f44845b;
    }

    public final float d() {
        return this.f44844a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f44844a, aVar.f44844a) == 0 && Float.compare(this.f44845b, aVar.f44845b) == 0 && Float.compare(this.f44846c, aVar.f44846c) == 0 && Float.compare(this.f44847d, aVar.f44847d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f44844a) * 31) + Float.hashCode(this.f44845b)) * 31) + Float.hashCode(this.f44846c)) * 31) + Float.hashCode(this.f44847d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f44844a + ", right=" + this.f44845b + ", bottom=" + this.f44846c + ", left=" + this.f44847d + ")";
    }
}
