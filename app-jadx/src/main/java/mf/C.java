package mf;

import ie.InterfaceC5082a;

/* JADX INFO: loaded from: classes5.dex */
class C implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f53333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Se.o f53334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.N f53335c;

    public C(K k10, Se.o oVar, of.N n10) {
        this.f53333a = k10;
        this.f53334b = oVar;
        this.f53335c = n10;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return K.v(this.f53333a, this.f53334b, this.f53335c);
    }
}
