package p1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f55703c;

    public h(String str, AbstractC5915c abstractC5915c) {
        super(str);
        this.f55701a = str;
        if (abstractC5915c != null) {
            this.f55703c = abstractC5915c.n();
            this.f55702b = abstractC5915c.i();
        } else {
            this.f55703c = "unknown";
            this.f55702b = 0;
        }
    }

    public String a() {
        return this.f55701a + " (" + this.f55703c + " at line " + this.f55702b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
