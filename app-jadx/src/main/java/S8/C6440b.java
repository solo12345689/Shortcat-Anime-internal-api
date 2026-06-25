package s8;

import s8.g;

/* JADX INFO: renamed from: s8.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6440b extends g {

    /* JADX INFO: renamed from: a */
    private final g.a f59270a;

    /* JADX INFO: renamed from: b */
    private final long f59271b;

    C6440b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f59270a = aVar;
        this.f59271b = j10;
    }

    @Override // s8.g
    public long b() {
        return this.f59271b;
    }

    @Override // s8.g
    public g.a c() {
        return this.f59270a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f59270a.equals(gVar.c()) && this.f59271b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f59270a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f59271b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f59270a + ", nextRequestWaitMillis=" + this.f59271b + "}";
    }
}
