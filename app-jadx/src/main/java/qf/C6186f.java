package qf;

import ie.InterfaceC5082a;

/* JADX INFO: renamed from: qf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6186f implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f58047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uf.r f58048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uf.j f58049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uf.j f58050d;

    public C6186f(u0 u0Var, uf.r rVar, uf.j jVar, uf.j jVar2) {
        this.f58047a = u0Var;
        this.f58048b = rVar;
        this.f58049c = jVar;
        this.f58050d = jVar2;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return Boolean.valueOf(C6188g.y(this.f58047a, this.f58048b, this.f58049c, this.f58050d));
    }
}
