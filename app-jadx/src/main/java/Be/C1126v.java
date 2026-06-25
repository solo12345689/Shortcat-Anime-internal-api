package Be;

import ie.InterfaceC5082a;

/* JADX INFO: renamed from: Be.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C1126v implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1128x f1884a;

    public C1126v(C1128x c1128x) {
        this.f1884a = c1128x;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return Boolean.valueOf(C1128x.L0(this.f1884a));
    }
}
