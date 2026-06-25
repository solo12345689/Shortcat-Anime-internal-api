package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f7540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1623n f7541b;

    public U0(K k10, InterfaceC1623n interfaceC1623n) {
        this.f7540a = k10;
        this.f7541b = interfaceC1623n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7541b.N(this.f7540a, Td.L.f17438a);
    }
}
