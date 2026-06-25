package androidx.media3.exoplayer.hls;

import A2.J;
import M2.c0;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class h implements c0 {

    /* JADX INFO: renamed from: a */
    private final int f30926a;

    /* JADX INFO: renamed from: b */
    private final l f30927b;

    /* JADX INFO: renamed from: c */
    private int f30928c = -1;

    public h(l lVar, int i10) {
        this.f30927b = lVar;
        this.f30926a = i10;
    }

    private boolean c() {
        int i10 = this.f30928c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        AbstractC6614a.a(this.f30928c == -1);
        this.f30928c = this.f30927b.A(this.f30926a);
    }

    @Override // M2.c0
    public void b() throws G2.i {
        int i10 = this.f30928c;
        if (i10 == -2) {
            throw new G2.i(this.f30927b.s().b(this.f30926a).c(0).f57022o);
        }
        if (i10 == -1) {
            this.f30927b.X();
        } else if (i10 != -3) {
            this.f30927b.Y(i10);
        }
    }

    public void d() {
        if (this.f30928c != -1) {
            this.f30927b.t0(this.f30926a);
            this.f30928c = -1;
        }
    }

    @Override // M2.c0
    public int e(long j10) {
        if (c()) {
            return this.f30927b.s0(this.f30928c, j10);
        }
        return 0;
    }

    @Override // M2.c0
    public boolean isReady() {
        if (this.f30928c != -3) {
            return c() && this.f30927b.S(this.f30928c);
        }
        return true;
    }

    @Override // M2.c0
    public int p(J j10, z2.f fVar, int i10) {
        if (this.f30928c == -3) {
            fVar.k(4);
            return -4;
        }
        if (c()) {
            return this.f30927b.i0(this.f30928c, j10, fVar, i10);
        }
        return -3;
    }
}
