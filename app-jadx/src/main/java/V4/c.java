package V4;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f19735a = o5.l.g(20);

    c() {
    }

    abstract l a();

    l b() {
        l lVar = (l) this.f19735a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f19735a.size() < 20) {
            this.f19735a.offer(lVar);
        }
    }
}
