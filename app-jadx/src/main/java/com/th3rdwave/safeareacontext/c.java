package com.th3rdwave.safeareacontext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f44851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f44852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f44853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f44854d;

    public c(float f10, float f11, float f12, float f13) {
        this.f44851a = f10;
        this.f44852b = f11;
        this.f44853c = f12;
        this.f44854d = f13;
    }

    public final float a() {
        return this.f44854d;
    }

    public final float b() {
        return this.f44853c;
    }

    public final float c() {
        return this.f44851a;
    }

    public final float d() {
        return this.f44852b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f44851a, cVar.f44851a) == 0 && Float.compare(this.f44852b, cVar.f44852b) == 0 && Float.compare(this.f44853c, cVar.f44853c) == 0 && Float.compare(this.f44854d, cVar.f44854d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f44851a) * 31) + Float.hashCode(this.f44852b)) * 31) + Float.hashCode(this.f44853c)) * 31) + Float.hashCode(this.f44854d);
    }

    public String toString() {
        return "Rect(x=" + this.f44851a + ", y=" + this.f44852b + ", width=" + this.f44853c + ", height=" + this.f44854d + ")";
    }
}
