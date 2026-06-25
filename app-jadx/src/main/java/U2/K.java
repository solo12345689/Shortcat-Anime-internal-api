package U2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f18922c = new K(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18924b;

    public K(long j10, long j11) {
        this.f18923a = j10;
        this.f18924b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f18923a == k10.f18923a && this.f18924b == k10.f18924b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f18923a) * 31) + ((int) this.f18924b);
    }

    public String toString() {
        return "[timeUs=" + this.f18923a + ", position=" + this.f18924b + "]";
    }
}
