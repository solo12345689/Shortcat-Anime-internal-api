package G;

import java.util.concurrent.CancellationException;
import oe.AbstractC5874j;
import r0.C6224f;

/* JADX INFO: renamed from: G.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1587a implements D0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f6785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.q f6786b;

    public C1587a(C c10, z.q qVar) {
        this.f6785a = c10;
        this.f6786b = qVar;
    }

    private final float b(long j10) {
        return this.f6786b == z.q.Horizontal ? C6224f.m(j10) : C6224f.n(j10);
    }

    @Override // D0.a
    public Object L0(long j10, long j11, Zd.e eVar) {
        return i1.y.b(a(j11, this.f6786b));
    }

    public final long a(long j10, z.q qVar) {
        return qVar == z.q.Vertical ? i1.y.e(j10, 0.0f, 0.0f, 2, null) : i1.y.e(j10, 0.0f, 0.0f, 1, null);
    }

    @Override // D0.a
    public long i1(long j10, int i10) {
        if (!D0.e.d(i10, D0.e.f3532a.b()) || Math.abs(this.f6785a.w()) <= 1.0E-6d) {
            return C6224f.f58329b.c();
        }
        float fW = this.f6785a.w() * this.f6785a.G();
        float fH = ((this.f6785a.C().h() + this.f6785a.C().j()) * (-Math.signum(this.f6785a.w()))) + fW;
        if (this.f6785a.w() > 0.0f) {
            fH = fW;
            fW = fH;
        }
        z.q qVar = this.f6786b;
        z.q qVar2 = z.q.Horizontal;
        float fN = -this.f6785a.f(-AbstractC5874j.l(qVar == qVar2 ? C6224f.m(j10) : C6224f.n(j10), fW, fH));
        float fM = this.f6786b == qVar2 ? fN : C6224f.m(j10);
        if (this.f6786b != z.q.Vertical) {
            fN = C6224f.n(j10);
        }
        return C6224f.f(j10, fM, fN);
    }

    @Override // D0.a
    public long y0(long j10, long j11, int i10) {
        if (!D0.e.d(i10, D0.e.f3532a.a()) || b(j11) == 0.0f) {
            return C6224f.f58329b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }
}
