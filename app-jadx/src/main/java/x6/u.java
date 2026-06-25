package x6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f63987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f63988b;

    public u(x xVar, z zVar) {
        this.f63987a = xVar;
        this.f63988b = zVar;
    }

    @Override // x6.x
    public void b(Object obj) {
        this.f63987a.b(obj);
    }

    @Override // x6.x
    public C5.a c(Object obj, C5.a aVar) {
        this.f63988b.c(obj);
        return this.f63987a.c(obj, aVar);
    }

    @Override // x6.x
    public boolean f(y5.l lVar) {
        return this.f63987a.f(lVar);
    }

    @Override // x6.x
    public int g(y5.l lVar) {
        return this.f63987a.g(lVar);
    }

    @Override // x6.x
    public C5.a get(Object obj) {
        C5.a aVar = this.f63987a.get(obj);
        if (aVar == null) {
            this.f63988b.b(obj);
            return aVar;
        }
        this.f63988b.a(obj);
        return aVar;
    }
}
