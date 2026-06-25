package q8;

/* JADX INFO: renamed from: q8.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6155h extends AbstractC6161n {

    /* JADX INFO: renamed from: a */
    private final long f57785a;

    C6155h(long j10) {
        this.f57785a = j10;
    }

    @Override // q8.AbstractC6161n
    public long c() {
        return this.f57785a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC6161n) && this.f57785a == ((AbstractC6161n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f57785a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f57785a + "}";
    }
}
