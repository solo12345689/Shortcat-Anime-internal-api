package se;

import ie.InterfaceC5082a;
import se.AbstractC6484d0;

/* JADX INFO: renamed from: se.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6486e0 implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6484d0 f59489a;

    public C6486e0(AbstractC6484d0 abstractC6484d0) {
        this.f59489a = abstractC6484d0;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return AbstractC6484d0.b.c(this.f59489a);
    }
}
