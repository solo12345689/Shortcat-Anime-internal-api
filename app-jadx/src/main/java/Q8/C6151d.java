package q8;

import java.util.List;

/* JADX INFO: renamed from: q8.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6151d extends AbstractC6157j {

    /* JADX INFO: renamed from: a */
    private final List f57752a;

    C6151d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f57752a = list;
    }

    @Override // q8.AbstractC6157j
    public List c() {
        return this.f57752a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6157j) {
            return this.f57752a.equals(((AbstractC6157j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f57752a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f57752a + "}";
    }
}
