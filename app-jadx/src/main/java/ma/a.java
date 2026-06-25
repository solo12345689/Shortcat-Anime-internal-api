package Ma;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final int f12312a;

    /* JADX INFO: renamed from: b */
    private final int f12313b;

    public a(int i10, int i11) {
        this.f12312a = i10;
        this.f12313b = i11;
    }

    public final int a() {
        return c.c(this.f12312a, this.f12313b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12312a == aVar.f12312a && this.f12313b == aVar.f12313b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f12312a) * 31) + Integer.hashCode(this.f12313b);
    }

    public String toString() {
        return "ColorProperties(color=" + this.f12312a + ", tone=" + this.f12313b + ")";
    }
}
