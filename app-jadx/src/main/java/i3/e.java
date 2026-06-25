package i3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48610d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f48608b = str;
        this.f48609c = str2;
        this.f48610d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f48609c, eVar.f48609c) && Objects.equals(this.f48608b, eVar.f48608b) && Objects.equals(this.f48610d, eVar.f48610d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f48608b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48609c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48610d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // i3.i
    public String toString() {
        return this.f48620a + ": language=" + this.f48608b + ", description=" + this.f48609c + ", text=" + this.f48610d;
    }
}
