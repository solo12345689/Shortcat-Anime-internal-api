package se;

import ie.InterfaceC5082a;
import ye.InterfaceC7224b;

/* JADX INFO: renamed from: se.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6525y implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7224b f59581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59582b;

    public C6525y(InterfaceC7224b interfaceC7224b, int i10) {
        this.f59581a = interfaceC7224b;
        this.f59582b = i10;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return AbstractC6453A.A(this.f59581a, this.f59582b);
    }
}
