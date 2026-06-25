package K1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10843b;

    public c(Object obj, Object obj2) {
        this.f10842a = obj;
        this.f10843b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f10842a, this.f10842a) && b.a(cVar.f10843b, this.f10843b);
    }

    public int hashCode() {
        Object obj = this.f10842a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10843b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f10842a + " " + this.f10843b + "}";
    }
}
