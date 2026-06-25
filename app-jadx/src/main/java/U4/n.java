package U4;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class n implements S4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f19292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f19293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final S4.f f19294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S4.h f19296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19297j;

    n(Object obj, S4.f fVar, int i10, int i11, Map map, Class cls, Class cls2, S4.h hVar) {
        this.f19289b = o5.k.e(obj);
        this.f19294g = (S4.f) o5.k.f(fVar, "Signature must not be null");
        this.f19290c = i10;
        this.f19291d = i11;
        this.f19295h = (Map) o5.k.e(map);
        this.f19292e = (Class) o5.k.f(cls, "Resource class must not be null");
        this.f19293f = (Class) o5.k.f(cls2, "Transcode class must not be null");
        this.f19296i = (S4.h) o5.k.e(hVar);
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f19289b.equals(nVar.f19289b) && this.f19294g.equals(nVar.f19294g) && this.f19291d == nVar.f19291d && this.f19290c == nVar.f19290c && this.f19295h.equals(nVar.f19295h) && this.f19292e.equals(nVar.f19292e) && this.f19293f.equals(nVar.f19293f) && this.f19296i.equals(nVar.f19296i)) {
                return true;
            }
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        if (this.f19297j == 0) {
            int iHashCode = this.f19289b.hashCode();
            this.f19297j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f19294g.hashCode()) * 31) + this.f19290c) * 31) + this.f19291d;
            this.f19297j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f19295h.hashCode();
            this.f19297j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f19292e.hashCode();
            this.f19297j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f19293f.hashCode();
            this.f19297j = iHashCode5;
            this.f19297j = (iHashCode5 * 31) + this.f19296i.hashCode();
        }
        return this.f19297j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19289b + ", width=" + this.f19290c + ", height=" + this.f19291d + ", resourceClass=" + this.f19292e + ", transcodeClass=" + this.f19293f + ", signature=" + this.f19294g + ", hashCode=" + this.f19297j + ", transformations=" + this.f19295h + ", options=" + this.f19296i + '}';
    }
}
