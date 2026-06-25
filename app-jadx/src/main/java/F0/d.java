package F0;

import F0.c;
import i1.y;
import i1.z;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final c.a f6135a;

    /* JADX INFO: renamed from: b */
    private final c f6136b;

    /* JADX INFO: renamed from: c */
    private final c f6137c;

    /* JADX INFO: renamed from: d */
    private long f6138d;

    /* JADX INFO: renamed from: e */
    private long f6139e;

    public d() {
        c.a aVar = e.i() ? c.a.f6131b : c.a.f6130a;
        this.f6135a = aVar;
        this.f6136b = new c(false, aVar, 1, null);
        this.f6137c = new c(false, aVar, 1, null);
        this.f6138d = C6224f.f58329b.c();
    }

    public final void a(long j10, long j11) {
        this.f6136b.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f6137c.a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public final long b(long j10) {
        if (!(y.h(j10) > 0.0f && y.i(j10) > 0.0f)) {
            H0.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(j10)));
        }
        return z.a(this.f6136b.d(y.h(j10)), this.f6137c.d(y.i(j10)));
    }

    public final long c() {
        return this.f6138d;
    }

    public final long d() {
        return this.f6139e;
    }

    public final void e() {
        this.f6136b.e();
        this.f6137c.e();
        this.f6139e = 0L;
    }

    public final void f(long j10) {
        this.f6138d = j10;
    }

    public final void g(long j10) {
        this.f6139e = j10;
    }
}
