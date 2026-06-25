package Xa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21726a = 3;

    private final boolean b(int i10) {
        return i10 % 10 == 1;
    }

    private final void c() {
        int i10 = this.f21726a + 2;
        this.f21726a = i10;
        if (b(i10)) {
            this.f21726a += 2;
        }
    }

    @Override // Xa.h
    public int a() {
        int i10 = this.f21726a;
        c();
        return i10;
    }
}
