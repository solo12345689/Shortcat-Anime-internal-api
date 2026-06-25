package w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f62358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f62359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A0 f62360c;

    private G0(float f10, float f11, InterfaceC6914s interfaceC6914s) {
        this.f62358a = f10;
        this.f62359b = f11;
        this.f62360c = new A0(interfaceC6914s);
    }

    @Override // w.z0, w.v0
    public boolean a() {
        return this.f62360c.a();
    }

    @Override // w.v0
    public long b(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62360c.b(abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62360c.d(j10, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62360c.e(j10, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    @Override // w.v0
    public AbstractC6913q g(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62360c.g(abstractC6913q, abstractC6913q2, abstractC6913q3);
    }

    public G0(float f10, float f11, AbstractC6913q abstractC6913q) {
        this(f10, f11, w0.c(abstractC6913q, f10, f11));
    }
}
