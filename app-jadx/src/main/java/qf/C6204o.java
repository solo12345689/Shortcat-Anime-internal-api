package qf;

import ie.InterfaceC5082a;
import qf.AbstractC6206p;

/* JADX INFO: renamed from: qf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6204o implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6206p.a f58079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6206p f58080b;

    public C6204o(AbstractC6206p.a aVar, AbstractC6206p abstractC6206p) {
        this.f58079a = aVar;
        this.f58080b = abstractC6206p;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return AbstractC6206p.a.e(this.f58079a, this.f58080b);
    }
}
