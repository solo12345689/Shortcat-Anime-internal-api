package Ke;

import ie.InterfaceC5082a;
import ze.InterfaceC7374h;

/* JADX INFO: loaded from: classes5.dex */
class b implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f11030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7374h f11031b;

    public b(k kVar, InterfaceC7374h interfaceC7374h) {
        this.f11030a = kVar;
        this.f11031b = interfaceC7374h;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return c.l(this.f11030a, this.f11031b);
    }
}
