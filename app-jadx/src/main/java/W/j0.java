package w;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f62534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62535b;

    public j0(v0 v0Var, long j10) {
        this.f62534a = v0Var;
        this.f62535b = j10;
    }

    @Override // w.v0
    public boolean a() {
        return this.f62534a.a();
    }

    @Override // w.v0
    public long b(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62534a.b(abstractC6913q, abstractC6913q2, abstractC6913q3) + this.f62535b;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        long j11 = this.f62535b;
        return j10 < j11 ? abstractC6913q : this.f62534a.d(j10 - j11, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        long j11 = this.f62535b;
        return j10 < j11 ? abstractC6913q3 : this.f62534a.e(j10 - j11, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return j0Var.f62535b == this.f62535b && AbstractC5504s.c(j0Var.f62534a, this.f62534a);
    }

    public int hashCode() {
        return (this.f62534a.hashCode() * 31) + Long.hashCode(this.f62535b);
    }
}
