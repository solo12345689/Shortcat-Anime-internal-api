package E4;

import E4.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f5640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f5641b;

    public e(h hVar, i iVar) {
        this.f5640a = hVar;
        this.f5641b = iVar;
    }

    @Override // E4.c
    public void a(int i10) {
        this.f5640a.a(i10);
        this.f5641b.a(i10);
    }

    @Override // E4.c
    public c.C0055c b(c.b bVar) {
        c.C0055c c0055cB = this.f5640a.b(bVar);
        return c0055cB == null ? this.f5641b.b(bVar) : c0055cB;
    }

    @Override // E4.c
    public void c(c.b bVar, c.C0055c c0055c) {
        this.f5640a.c(c.b.b(bVar, null, L4.c.b(bVar.c()), 1, null), c0055c.a(), L4.c.b(c0055c.b()));
    }
}
