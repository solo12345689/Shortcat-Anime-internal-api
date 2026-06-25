package Q5;

import l6.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends G6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.b f14368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f14369b;

    public a(F5.b bVar, j jVar) {
        this.f14368a = bVar;
        this.f14369b = jVar;
    }

    @Override // G6.e
    public void b(K6.b bVar, String str, Throwable th2, boolean z10) {
        this.f14369b.J(this.f14368a.now());
        this.f14369b.I(bVar);
        this.f14369b.P(str);
        this.f14369b.O(z10);
    }

    @Override // G6.e
    public void e(K6.b bVar, Object obj, String str, boolean z10) {
        this.f14369b.K(this.f14368a.now());
        this.f14369b.I(bVar);
        this.f14369b.y(obj);
        this.f14369b.P(str);
        this.f14369b.O(z10);
    }

    @Override // G6.e
    public void i(K6.b bVar, String str, boolean z10) {
        this.f14369b.J(this.f14368a.now());
        this.f14369b.I(bVar);
        this.f14369b.P(str);
        this.f14369b.O(z10);
    }

    @Override // G6.e
    public void k(String str) {
        this.f14369b.J(this.f14368a.now());
        this.f14369b.P(str);
    }
}
