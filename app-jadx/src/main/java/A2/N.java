package A2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f147c = new N(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149b;

    public N(int i10, boolean z10) {
        this.f148a = i10;
        this.f149b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n10 = (N) obj;
            if (this.f148a == n10.f148a && this.f149b == n10.f149b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f148a << 1) + (this.f149b ? 1 : 0);
    }
}
