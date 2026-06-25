package aa;

import ma.InterfaceC5654a;
import ma.InterfaceC5655b;

/* JADX INFO: renamed from: aa.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C2589B implements InterfaceC5655b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC5654a f23833c = new InterfaceC5654a() { // from class: aa.z
        @Override // ma.InterfaceC5654a
        public final void a(InterfaceC5655b interfaceC5655b) {
            C2589B.b(interfaceC5655b);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC5655b f23834d = new InterfaceC5655b() { // from class: aa.A
        @Override // ma.InterfaceC5655b
        public final Object get() {
            return C2589B.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5654a f23835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceC5655b f23836b;

    private C2589B(InterfaceC5654a interfaceC5654a, InterfaceC5655b interfaceC5655b) {
        this.f23835a = interfaceC5654a;
        this.f23836b = interfaceC5655b;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    static C2589B c() {
        return new C2589B(f23833c, f23834d);
    }

    void d(InterfaceC5655b interfaceC5655b) {
        InterfaceC5654a interfaceC5654a;
        if (this.f23836b != f23834d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC5654a = this.f23835a;
            this.f23835a = null;
            this.f23836b = interfaceC5655b;
        }
        interfaceC5654a.a(interfaceC5655b);
    }

    @Override // ma.InterfaceC5655b
    public Object get() {
        return this.f23836b.get();
    }

    public static /* synthetic */ void b(InterfaceC5655b interfaceC5655b) {
    }
}
