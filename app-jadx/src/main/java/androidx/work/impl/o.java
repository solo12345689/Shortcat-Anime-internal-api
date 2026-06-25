package androidx.work.impl;

import i4.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements i4.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.A f32884c = new androidx.lifecycle.A();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f32885d = androidx.work.impl.utils.futures.c.u();

    public o() {
        a(i4.l.f48679b);
    }

    public void a(l.b bVar) {
        this.f32884c.l(bVar);
        if (bVar instanceof l.b.c) {
            this.f32885d.q((l.b.c) bVar);
        } else if (bVar instanceof l.b.a) {
            this.f32885d.r(((l.b.a) bVar).a());
        }
    }
}
