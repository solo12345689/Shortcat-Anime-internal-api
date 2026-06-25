package E6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r6.e f5669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5670e;

    public c(r6.e eVar, boolean z10) {
        this.f5669d = eVar;
        this.f5670e = z10;
    }

    @Override // E6.e
    public synchronized int A() {
        r6.e eVar;
        eVar = this.f5669d;
        return eVar == null ? 0 : eVar.d().A();
    }

    public synchronized r6.c H() {
        r6.e eVar;
        eVar = this.f5669d;
        return eVar == null ? null : eVar.d();
    }

    public synchronized r6.e J() {
        return this.f5669d;
    }

    @Override // E6.a, E6.e
    public boolean W1() {
        return this.f5670e;
    }

    @Override // E6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                r6.e eVar = this.f5669d;
                if (eVar == null) {
                    return;
                }
                this.f5669d = null;
                eVar.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // E6.e, E6.m
    public synchronized int getHeight() {
        r6.e eVar;
        eVar = this.f5669d;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // E6.e, E6.m
    public synchronized int getWidth() {
        r6.e eVar;
        eVar = this.f5669d;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    @Override // E6.e
    public synchronized boolean isClosed() {
        return this.f5669d == null;
    }
}
