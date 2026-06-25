package E2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4253e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f4249a = str;
        this.f4250b = str2;
        this.f4251c = str3;
        this.f4252d = str4;
        this.f4253e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f4249a, hVar.f4249a) && Objects.equals(this.f4250b, hVar.f4250b) && Objects.equals(this.f4251c, hVar.f4251c) && Objects.equals(this.f4252d, hVar.f4252d) && Objects.equals(this.f4253e, hVar.f4253e);
    }

    public int hashCode() {
        String str = this.f4249a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4250b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4251c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f4252d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4253e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
