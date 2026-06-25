package U4;

import p5.AbstractC5933a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class u implements v, AbstractC5933a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K1.d f19320e = AbstractC5933a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p5.c f19321a = p5.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f19322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19324d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AbstractC5933a.d {
        a() {
        }

        @Override // p5.AbstractC5933a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void b(v vVar) {
        this.f19324d = false;
        this.f19323c = true;
        this.f19322b = vVar;
    }

    static u c(v vVar) {
        u uVar = (u) o5.k.e((u) f19320e.b());
        uVar.b(vVar);
        return uVar;
    }

    private void d() {
        this.f19322b = null;
        f19320e.a(this);
    }

    @Override // U4.v
    public Class a() {
        return this.f19322b.a();
    }

    synchronized void e() {
        this.f19321a.c();
        if (!this.f19323c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f19323c = false;
        if (this.f19324d) {
            recycle();
        }
    }

    @Override // U4.v
    public Object get() {
        return this.f19322b.get();
    }

    @Override // U4.v
    public int getSize() {
        return this.f19322b.getSize();
    }

    @Override // p5.AbstractC5933a.f
    public p5.c h() {
        return this.f19321a;
    }

    @Override // U4.v
    public synchronized void recycle() {
        this.f19321a.c();
        this.f19324d = true;
        if (!this.f19323c) {
            this.f19322b.recycle();
            d();
        }
    }
}
