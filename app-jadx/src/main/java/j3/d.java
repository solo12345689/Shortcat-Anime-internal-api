package j3;

import q2.C6078J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51625b;

    public d(float f10, int i10) {
        this.f51624a = f10;
        this.f51625b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f51624a == dVar.f51624a && this.f51625b == dVar.f51625b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + S9.c.a(this.f51624a)) * 31) + this.f51625b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f51624a + ", svcTemporalLayerCount=" + this.f51625b;
    }
}
