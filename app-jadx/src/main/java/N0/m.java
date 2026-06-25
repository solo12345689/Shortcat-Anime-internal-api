package n0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f53825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N0.f f53826d;

    public m(int i10, long j10, n nVar, N0.f fVar) {
        this.f53823a = i10;
        this.f53824b = j10;
        this.f53825c = nVar;
        this.f53826d = fVar;
    }

    public final int a() {
        return this.f53823a;
    }

    public final N0.f b() {
        return this.f53826d;
    }

    public final n c() {
        return this.f53825c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f53823a == mVar.f53823a && this.f53824b == mVar.f53824b && this.f53825c == mVar.f53825c && AbstractC5504s.c(this.f53826d, mVar.f53826d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f53823a) * 31) + Long.hashCode(this.f53824b)) * 31) + this.f53825c.hashCode()) * 31;
        N0.f fVar = this.f53826d;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f53823a + ", timestamp=" + this.f53824b + ", type=" + this.f53825c + ", structureCompat=" + this.f53826d + ')';
    }
}
