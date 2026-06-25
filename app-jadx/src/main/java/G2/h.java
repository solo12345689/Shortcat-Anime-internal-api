package G2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q2.C6078J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7006c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7012f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f7007a = i10;
            this.f7008b = i11;
            this.f7009c = str;
            this.f7010d = str2;
            this.f7011e = str3;
            this.f7012f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7007a == aVar.f7007a && this.f7008b == aVar.f7008b && TextUtils.equals(this.f7009c, aVar.f7009c) && TextUtils.equals(this.f7010d, aVar.f7010d) && TextUtils.equals(this.f7011e, aVar.f7011e) && TextUtils.equals(this.f7012f, aVar.f7012f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f7007a * 31) + this.f7008b) * 31;
            String str = this.f7009c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7010d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f7011e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f7012f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List list) {
        this.f7004a = str;
        this.f7005b = str2;
        this.f7006c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (TextUtils.equals(this.f7004a, hVar.f7004a) && TextUtils.equals(this.f7005b, hVar.f7005b) && this.f7006c.equals(hVar.f7006c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7004a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7005b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f7006c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f7004a != null) {
            str = " [" + this.f7004a + ", " + this.f7005b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
