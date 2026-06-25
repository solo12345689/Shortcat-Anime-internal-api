package z;

import r0.AbstractC6225g;
import r0.C6224f;

/* JADX INFO: renamed from: z.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7257D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f65255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65256b = C6224f.f58329b.c();

    public C7257D(q qVar) {
        this.f65255a = qVar;
    }

    private final long b(float f10) {
        if (this.f65255a == null) {
            long j10 = this.f65256b;
            return C6224f.p(this.f65256b, C6224f.r(C6224f.h(j10, C6224f.k(j10)), f10));
        }
        float fD = d(this.f65256b) - (Math.signum(d(this.f65256b)) * f10);
        float fC = c(this.f65256b);
        return this.f65255a == q.Horizontal ? AbstractC6225g.a(fD, fC) : AbstractC6225g.a(fC, fD);
    }

    public final C6224f a(E0.C c10, float f10) {
        long jQ = C6224f.q(this.f65256b, C6224f.p(c10.h(), c10.k()));
        this.f65256b = jQ;
        if ((this.f65255a == null ? C6224f.k(jQ) : Math.abs(d(jQ))) >= f10) {
            return C6224f.d(b(f10));
        }
        return null;
    }

    public final float c(long j10) {
        return this.f65255a == q.Horizontal ? C6224f.n(j10) : C6224f.m(j10);
    }

    public final float d(long j10) {
        return this.f65255a == q.Horizontal ? C6224f.m(j10) : C6224f.n(j10);
    }

    public final void e() {
        this.f65256b = C6224f.f58329b.c();
    }
}
