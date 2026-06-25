package Nf;

import Gf.T;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f12869c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f12869c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12869c.run();
    }

    public String toString() {
        return "Task[" + T.a(this.f12869c) + '@' + T.b(this.f12869c) + ", " + this.f12867a + ", " + j.c(this.f12868b) + ']';
    }
}
