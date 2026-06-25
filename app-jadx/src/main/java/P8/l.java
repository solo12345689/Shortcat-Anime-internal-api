package P8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O8.c f13570a;

    public l(O8.c cVar) {
        this.f13570a = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f13570a));
    }
}
