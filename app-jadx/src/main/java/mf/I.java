package mf;

import ie.InterfaceC5082a;

/* JADX INFO: loaded from: classes5.dex */
class I implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f53354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Se.o f53355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.N f53356c;

    public I(K k10, Se.o oVar, of.N n10) {
        this.f53354a = k10;
        this.f53355b = oVar;
        this.f53356c = n10;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return K.w(this.f53354a, this.f53355b, this.f53356c);
    }
}
