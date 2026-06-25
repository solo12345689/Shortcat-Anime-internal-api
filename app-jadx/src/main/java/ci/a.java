package ci;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class a implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f33703a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f33704b;

    a(c cVar) {
        this.f33704b = cVar;
    }

    @Override // ci.l
    public void a(q qVar, Object obj) {
        this.f33703a.a(j.a(qVar, obj));
        this.f33704b.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarB = this.f33703a.b();
        if (jVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f33704b.g(jVarB);
    }
}
