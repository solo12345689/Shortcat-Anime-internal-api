package u2;

import q2.C6078J;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: u2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6724f implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f61231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f61232b;

    public C6724f(float f10, float f11) {
        AbstractC6614a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f61231a = f10;
        this.f61232b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6724f.class == obj.getClass()) {
            C6724f c6724f = (C6724f) obj;
            if (this.f61231a == c6724f.f61231a && this.f61232b == c6724f.f61232b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + S9.c.a(this.f61231a)) * 31) + S9.c.a(this.f61232b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f61231a + ", longitude=" + this.f61232b;
    }
}
