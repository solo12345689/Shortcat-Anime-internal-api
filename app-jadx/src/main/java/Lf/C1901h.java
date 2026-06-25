package Lf;

/* JADX INFO: renamed from: Lf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1901h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Zd.i f11569a;

    public C1901h(Zd.i iVar) {
        this.f11569a = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f11569a);
    }
}
