package mf;

import ie.InterfaceC5082a;

/* JADX INFO: loaded from: classes5.dex */
class G implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f53345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.p f53346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC5673d f53347c;

    public G(K k10, Ze.p pVar, EnumC5673d enumC5673d) {
        this.f53345a = k10;
        this.f53346b = pVar;
        this.f53347c = enumC5673d;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return K.p(this.f53345a, this.f53346b, this.f53347c);
    }
}
