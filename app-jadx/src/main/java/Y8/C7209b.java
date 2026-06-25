package y8;

import java.util.Map;

/* JADX INFO: renamed from: y8.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7209b extends f {

    /* JADX INFO: renamed from: a */
    private final B8.a f64913a;

    /* JADX INFO: renamed from: b */
    private final Map f64914b;

    C7209b(B8.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f64913a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f64914b = map;
    }

    @Override // y8.f
    B8.a e() {
        return this.f64913a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f64913a.equals(fVar.e()) && this.f64914b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // y8.f
    Map h() {
        return this.f64914b;
    }

    public int hashCode() {
        return ((this.f64913a.hashCode() ^ 1000003) * 1000003) ^ this.f64914b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f64913a + ", values=" + this.f64914b + "}";
    }
}
