package se;

import ie.InterfaceC5082a;
import se.C6475X;

/* JADX INFO: renamed from: se.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6472U implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6475X.a f59423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6475X f59424b;

    public C6472U(C6475X.a aVar, C6475X c6475x) {
        this.f59423a = aVar;
        this.f59424b = c6475x;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return C6475X.a.d0(this.f59423a, this.f59424b);
    }
}
