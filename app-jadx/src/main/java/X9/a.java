package X9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends l {

    /* JADX INFO: renamed from: a */
    private final long f21689a;

    /* JADX INFO: renamed from: b */
    private final long f21690b;

    /* JADX INFO: renamed from: c */
    private final long f21691c;

    a(long j10, long j11, long j12) {
        this.f21689a = j10;
        this.f21690b = j11;
        this.f21691c = j12;
    }

    @Override // X9.l
    public long b() {
        return this.f21690b;
    }

    @Override // X9.l
    public long c() {
        return this.f21689a;
    }

    @Override // X9.l
    public long d() {
        return this.f21691c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f21689a == lVar.c() && this.f21690b == lVar.b() && this.f21691c == lVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21689a;
        long j11 = this.f21690b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f21691c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f21689a + ", elapsedRealtime=" + this.f21690b + ", uptimeMillis=" + this.f21691c + "}";
    }
}
