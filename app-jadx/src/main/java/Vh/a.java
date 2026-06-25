package Vh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20387b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f20386a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.f20387b != 0) {
            this.f20386a.append('\n');
        }
        this.f20386a.append(charSequence);
        this.f20387b++;
    }

    public String b() {
        return this.f20386a.toString();
    }
}
