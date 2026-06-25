package E2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4238c;

    public e(String str, String str2, String str3) {
        this.f4236a = str;
        this.f4237b = str2;
        this.f4238c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f4236a, eVar.f4236a) && Objects.equals(this.f4237b, eVar.f4237b) && Objects.equals(this.f4238c, eVar.f4238c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f4236a.hashCode() * 31;
        String str = this.f4237b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4238c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
