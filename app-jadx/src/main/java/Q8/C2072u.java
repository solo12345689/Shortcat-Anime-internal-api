package Q8;

import n9.InterfaceC5760d;

/* JADX INFO: renamed from: Q8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2072u implements InterfaceC5760d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n9.j f14513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2073v f14514b;

    C2072u(C2073v c2073v, n9.j jVar) {
        this.f14514b = c2073v;
        this.f14513a = jVar;
    }

    @Override // n9.InterfaceC5760d
    public final void a(n9.i iVar) {
        this.f14514b.f14516b.remove(this.f14513a);
    }
}
