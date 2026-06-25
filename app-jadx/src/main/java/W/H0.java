package w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6875D f62363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f62364d;

    public H0(int i10, int i11, InterfaceC6875D interfaceC6875D) {
        this.f62361a = i10;
        this.f62362b = i11;
        this.f62363c = interfaceC6875D;
        this.f62364d = new A0(new C6882K(c(), f(), interfaceC6875D));
    }

    @Override // w.y0
    public int c() {
        return this.f62361a;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62364d.d(j10, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62364d.e(j10, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.y0
    public int f() {
        return this.f62362b;
    }
}
