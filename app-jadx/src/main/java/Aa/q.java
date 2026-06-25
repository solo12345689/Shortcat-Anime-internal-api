package aa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2591D f23894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23896c;

    private q(Class cls, int i10, int i11) {
        this(C2591D.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(C2591D c2591d) {
        return new q(c2591d, 0, 1);
    }

    public static q i(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q j(C2591D c2591d) {
        return new q(c2591d, 1, 0);
    }

    public static q k(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public C2591D b() {
        return this.f23894a;
    }

    public boolean c() {
        return this.f23896c == 2;
    }

    public boolean d() {
        return this.f23896c == 0;
    }

    public boolean e() {
        return this.f23895b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f23894a.equals(qVar.f23894a) && this.f23895b == qVar.f23895b && this.f23896c == qVar.f23896c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f23895b == 2;
    }

    public int hashCode() {
        return ((((this.f23894a.hashCode() ^ 1000003) * 1000003) ^ this.f23895b) * 1000003) ^ this.f23896c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f23894a);
        sb2.append(", type=");
        int i10 = this.f23895b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f23896c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(C2591D c2591d, int i10, int i11) {
        this.f23894a = (C2591D) AbstractC2590C.c(c2591d, "Null dependency anInterface.");
        this.f23895b = i10;
        this.f23896c = i11;
    }
}
