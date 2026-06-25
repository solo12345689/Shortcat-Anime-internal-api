package i3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48636c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f48635b = str2;
        this.f48636c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f48620a.equals(oVar.f48620a) && Objects.equals(this.f48635b, oVar.f48635b) && Objects.equals(this.f48636c, oVar.f48636c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f48620a.hashCode()) * 31;
        String str = this.f48635b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48636c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": url=" + this.f48636c;
    }
}
