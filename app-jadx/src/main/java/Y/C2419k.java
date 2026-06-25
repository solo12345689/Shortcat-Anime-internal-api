package Y;

/* JADX INFO: renamed from: Y.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2419k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22352a;

    public C2419k(String str) {
        this.f22352a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f22352a;
    }
}
