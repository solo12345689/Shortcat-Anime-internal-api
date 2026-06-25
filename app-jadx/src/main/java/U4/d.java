package U4;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d implements S4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S4.f f19140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S4.f f19141c;

    d(S4.f fVar, S4.f fVar2) {
        this.f19140b = fVar;
        this.f19141c = fVar2;
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        this.f19140b.b(messageDigest);
        this.f19141c.b(messageDigest);
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f19140b.equals(dVar.f19140b) && this.f19141c.equals(dVar.f19141c)) {
                return true;
            }
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        return (this.f19140b.hashCode() * 31) + this.f19141c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f19140b + ", signature=" + this.f19141c + '}';
    }
}
