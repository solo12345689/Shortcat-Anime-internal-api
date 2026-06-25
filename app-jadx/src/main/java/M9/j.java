package M9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n9.j f12285a;

    j() {
        this.f12285a = null;
    }

    protected abstract void a();

    final n9.j b() {
        return this.f12285a;
    }

    public final void c(Exception exc) {
        n9.j jVar = this.f12285a;
        if (jVar != null) {
            jVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public j(n9.j jVar) {
        this.f12285a = jVar;
    }
}
