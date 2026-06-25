package Nf;

import Gf.AbstractC1633s0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f extends AbstractC1633s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f12866h = c2();

    public f(int i10, int i11, long j10, String str) {
        this.f12862d = i10;
        this.f12863e = i11;
        this.f12864f = j10;
        this.f12865g = str;
    }

    private final a c2() {
        return new a(this.f12862d, this.f12863e, this.f12864f, this.f12865g);
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        a.o(this.f12866h, runnable, false, false, 6, null);
    }

    @Override // Gf.K
    public void O1(Zd.i iVar, Runnable runnable) {
        a.o(this.f12866h, runnable, false, true, 2, null);
    }

    @Override // Gf.AbstractC1633s0
    public Executor b2() {
        return this.f12866h;
    }

    public final void d2(Runnable runnable, boolean z10, boolean z11) {
        this.f12866h.l(runnable, z10, z11);
    }
}
