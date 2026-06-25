package u2;

import q2.C6078J;

/* JADX INFO: renamed from: u2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6722d implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61225a;

    public C6722d(int i10) {
        this.f61225a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6722d) && this.f61225a == ((C6722d) obj).f61225a;
    }

    public int hashCode() {
        return this.f61225a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f61225a;
    }
}
