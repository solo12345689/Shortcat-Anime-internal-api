package R5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15197c;

    public d() {
        a();
    }

    public void a() {
        this.f15195a = false;
        this.f15196b = 4;
        c();
    }

    public void b() {
        this.f15197c++;
    }

    public void c() {
        this.f15197c = 0;
    }

    public void d(boolean z10) {
        this.f15195a = z10;
    }

    public boolean e() {
        return this.f15195a && this.f15197c < this.f15196b;
    }
}
