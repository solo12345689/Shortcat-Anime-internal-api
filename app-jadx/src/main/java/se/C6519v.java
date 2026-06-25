package se;

import ie.InterfaceC5082a;

/* JADX INFO: renamed from: se.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6519v implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6453A f59566a;

    public C6519v(AbstractC6453A abstractC6453A) {
        this.f59566a = abstractC6453A;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return Boolean.valueOf(AbstractC6453A.a0(this.f59566a));
    }
}
