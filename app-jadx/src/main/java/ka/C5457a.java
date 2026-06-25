package ka;

import java.util.List;

/* JADX INFO: renamed from: ka.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5457a extends w {

    /* JADX INFO: renamed from: a */
    private final String f52152a;

    /* JADX INFO: renamed from: b */
    private final List f52153b;

    C5457a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f52152a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f52153b = list;
    }

    @Override // ka.w
    public List b() {
        return this.f52153b;
    }

    @Override // ka.w
    public String c() {
        return this.f52152a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f52152a.equals(wVar.c()) && this.f52153b.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f52152a.hashCode() ^ 1000003) * 1000003) ^ this.f52153b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f52152a + ", usedDates=" + this.f52153b + "}";
    }
}
