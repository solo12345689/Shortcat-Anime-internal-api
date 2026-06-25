package Ke;

import ie.InterfaceC5082a;
import ye.InterfaceC7229g;

/* JADX INFO: loaded from: classes5.dex */
class a implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f11028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7229g f11029b;

    public a(k kVar, InterfaceC7229g interfaceC7229g) {
        this.f11028a = kVar;
        this.f11029b = interfaceC7229g;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return c.g(this.f11028a, this.f11029b);
    }
}
