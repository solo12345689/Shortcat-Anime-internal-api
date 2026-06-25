package aa;

/* JADX INFO: renamed from: aa.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2591D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f23837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f23838b;

    /* JADX INFO: renamed from: aa.D$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private @interface a {
    }

    public C2591D(Class cls, Class cls2) {
        this.f23837a = cls;
        this.f23838b = cls2;
    }

    public static C2591D a(Class cls, Class cls2) {
        return new C2591D(cls, cls2);
    }

    public static C2591D b(Class cls) {
        return new C2591D(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2591D.class != obj.getClass()) {
            return false;
        }
        C2591D c2591d = (C2591D) obj;
        if (this.f23838b.equals(c2591d.f23838b)) {
            return this.f23837a.equals(c2591d.f23837a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23838b.hashCode() * 31) + this.f23837a.hashCode();
    }

    public String toString() {
        if (this.f23837a == a.class) {
            return this.f23838b.getName();
        }
        return "@" + this.f23837a.getName() + " " + this.f23838b.getName();
    }
}
