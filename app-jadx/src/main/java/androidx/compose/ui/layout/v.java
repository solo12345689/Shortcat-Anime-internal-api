package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class v implements u {

    /* JADX INFO: renamed from: b */
    private final String f27014b;

    /* JADX INFO: renamed from: c */
    private E f27015c = new E();

    /* JADX INFO: renamed from: d */
    private C2674c f27016d = new C2674c();

    /* JADX INFO: renamed from: e */
    private E f27017e = new E();

    /* JADX INFO: renamed from: f */
    private C2674c f27018f = new C2674c();

    public v(String str) {
        this.f27014b = str;
    }

    @Override // androidx.compose.ui.layout.u
    public E a() {
        return this.f27015c;
    }

    @Override // androidx.compose.ui.layout.u
    public C2674c b() {
        return this.f27016d;
    }

    @Override // androidx.compose.ui.layout.u
    public E c() {
        return this.f27017e;
    }

    @Override // androidx.compose.ui.layout.u
    public C2674c d() {
        return this.f27018f;
    }

    public String toString() {
        if (this.f27014b == null) {
            return super.toString();
        }
        return "RectRulers(" + this.f27014b + ')';
    }
}
