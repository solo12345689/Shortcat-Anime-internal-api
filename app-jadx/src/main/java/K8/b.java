package K8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10943a = 1;

    public b a(Object obj) {
        this.f10943a = (this.f10943a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f10943a;
    }

    public final b c(boolean z10) {
        this.f10943a = (this.f10943a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
