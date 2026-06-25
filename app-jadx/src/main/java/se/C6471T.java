package se;

import ie.InterfaceC5082a;
import se.C6475X;

/* JADX INFO: renamed from: se.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6471T implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6475X.a f59418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6475X f59419b;

    public C6471T(C6475X.a aVar, C6475X c6475x) {
        this.f59418a = aVar;
        this.f59419b = c6475x;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return C6475X.a.W(this.f59418a, this.f59419b);
    }
}
