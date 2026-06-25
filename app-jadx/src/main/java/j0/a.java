package J0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f9198a;

    public a(j jVar) {
        super(null);
        this.f9198a = jVar;
    }

    @Override // J0.g
    public boolean a(c cVar) {
        return cVar == this.f9198a.getKey();
    }

    @Override // J0.g
    public Object b(c cVar) {
        if (!(cVar == this.f9198a.getKey())) {
            H0.a.b("Check failed.");
        }
        return this.f9198a.getValue();
    }

    public final void c(j jVar) {
        this.f9198a = jVar;
    }
}
