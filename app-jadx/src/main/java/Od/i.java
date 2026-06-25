package od;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f55386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5863g f55387b;

    public i(j validationResult, C5863g c5863g) {
        AbstractC5504s.h(validationResult, "validationResult");
        this.f55386a = validationResult;
        this.f55387b = c5863g;
    }

    public final C5863g a() {
        return this.f55387b;
    }

    public final j b() {
        return this.f55386a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f55386a == iVar.f55386a && AbstractC5504s.c(this.f55387b, iVar.f55387b);
    }

    public int hashCode() {
        int iHashCode = this.f55386a.hashCode() * 31;
        C5863g c5863g = this.f55387b;
        return iHashCode + (c5863g == null ? 0 : c5863g.hashCode());
    }

    public String toString() {
        return "SignatureValidationResult(validationResult=" + this.f55386a + ", expoProjectInformation=" + this.f55387b + ")";
    }
}
