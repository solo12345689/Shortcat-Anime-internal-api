package o5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f54547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f54548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f54549c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f54547a = cls;
        this.f54548b = cls2;
        this.f54549c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f54547a.equals(jVar.f54547a) && this.f54548b.equals(jVar.f54548b) && l.e(this.f54549c, jVar.f54549c);
    }

    public int hashCode() {
        int iHashCode = ((this.f54547a.hashCode() * 31) + this.f54548b.hashCode()) * 31;
        Class cls = this.f54549c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f54547a + ", second=" + this.f54548b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
