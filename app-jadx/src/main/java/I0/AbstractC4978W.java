package i0;

/* JADX INFO: renamed from: i0.W, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4978W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f48450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC4978W f48451b;

    public AbstractC4978W(long j10) {
        this.f48450a = j10;
    }

    public abstract void c(AbstractC4978W abstractC4978W);

    public abstract AbstractC4978W d(long j10);

    public final AbstractC4978W e() {
        return this.f48451b;
    }

    public final long f() {
        return this.f48450a;
    }

    public final void g(AbstractC4978W abstractC4978W) {
        this.f48451b = abstractC4978W;
    }

    public final void h(long j10) {
        this.f48450a = j10;
    }
}
