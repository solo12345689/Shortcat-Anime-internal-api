package k0;

/* JADX INFO: renamed from: k0.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5430t extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51991a;

    public C5430t(String str) {
        super(str);
        this.f51991a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f51991a;
    }
}
