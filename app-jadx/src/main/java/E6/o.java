package E6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f5692d = d(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f5693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f5694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f5695c;

    private o(int i10, boolean z10, boolean z11) {
        this.f5693a = i10;
        this.f5694b = z10;
        this.f5695c = z11;
    }

    public static p d(int i10, boolean z10, boolean z11) {
        return new o(i10, z10, z11);
    }

    @Override // E6.p
    public boolean a() {
        return this.f5695c;
    }

    @Override // E6.p
    public boolean b() {
        return this.f5694b;
    }

    @Override // E6.p
    public int c() {
        return this.f5693a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f5693a == oVar.f5693a && this.f5694b == oVar.f5694b && this.f5695c == oVar.f5695c;
    }

    public int hashCode() {
        return (this.f5693a ^ (this.f5694b ? 4194304 : 0)) ^ (this.f5695c ? 8388608 : 0);
    }
}
