package p8;

/* JADX INFO: renamed from: p8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5938c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f55821a;

    private C5938c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f55821a = str;
    }

    public static C5938c b(String str) {
        return new C5938c(str);
    }

    public String a() {
        return this.f55821a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5938c) {
            return this.f55821a.equals(((C5938c) obj).f55821a);
        }
        return false;
    }

    public int hashCode() {
        return this.f55821a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f55821a + "\"}";
    }
}
