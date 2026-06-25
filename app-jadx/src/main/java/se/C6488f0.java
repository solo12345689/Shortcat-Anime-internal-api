package se;

import ie.InterfaceC5082a;

/* JADX INFO: renamed from: se.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6488f0 implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6494i0 f59494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59495b;

    public C6488f0(C6494i0 c6494i0, String str) {
        this.f59494a = c6494i0;
        this.f59495b = str;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return C6494i0.k0(this.f59494a, this.f59495b);
    }
}
