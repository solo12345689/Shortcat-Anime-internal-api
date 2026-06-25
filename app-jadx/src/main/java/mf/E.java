package mf;

import ie.InterfaceC5082a;

/* JADX INFO: loaded from: classes5.dex */
class E implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f53339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.p f53340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC5673d f53341c;

    public E(K k10, Ze.p pVar, EnumC5673d enumC5673d) {
        this.f53339a = k10;
        this.f53340b = pVar;
        this.f53341c = enumC5673d;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return K.k(this.f53339a, this.f53340b, this.f53341c);
    }
}
