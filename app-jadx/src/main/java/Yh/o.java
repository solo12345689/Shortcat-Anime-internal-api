package Yh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class o extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f23009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f23010h;

    public o(String str, String str2) {
        this.f23009g = str;
        this.f23010h = str2;
    }

    @Override // Yh.s
    protected String l() {
        return "destination=" + this.f23009g + ", title=" + this.f23010h;
    }

    public String n() {
        return this.f23009g;
    }
}
