package i3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48624d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f48622b = str;
        this.f48623c = str2;
        this.f48624d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f48623c, kVar.f48623c) && Objects.equals(this.f48622b, kVar.f48622b) && Objects.equals(this.f48624d, kVar.f48624d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f48622b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48623c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48624d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": domain=" + this.f48622b + ", description=" + this.f48623c;
    }
}
