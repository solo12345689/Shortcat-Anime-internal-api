package h3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import q2.C6077I;
import q2.C6078J;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: h3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4901b implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47602f;

    public C4901b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        AbstractC6614a.a(i11 == -1 || i11 > 0);
        this.f47597a = i10;
        this.f47598b = str;
        this.f47599c = str2;
        this.f47600d = str3;
        this.f47601e = z10;
        this.f47602f = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4901b d(Map map) {
        boolean z10;
        int i10;
        C4901b c4901b;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        AbstractC6635w.i("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC6635w.i("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            String str5 = (String) list2.get(0);
            c4901b = null;
            str4 = str5;
            z10 = true;
        } else {
            c4901b = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str = (String) list3.get(0);
            z10 = true;
        } else {
            str = c4901b;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str2 = (String) list4.get(0);
            z10 = true;
        } else {
            str2 = c4901b;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str6 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str6);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        AbstractC6635w.i("IcyHeaders", "Invalid metadata interval: " + str6);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        AbstractC6635w.i("IcyHeaders", "Invalid metadata interval: " + str6);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            c4901b = new C4901b(i10, str4, str, str2, zEquals, i14);
        }
        return c4901b;
    }

    @Override // q2.C6078J.a
    public void b(C6077I.b bVar) {
        String str = this.f47599c;
        if (str != null) {
            bVar.n0(str);
        }
        String str2 = this.f47598b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4901b.class == obj.getClass()) {
            C4901b c4901b = (C4901b) obj;
            if (this.f47597a == c4901b.f47597a && Objects.equals(this.f47598b, c4901b.f47598b) && Objects.equals(this.f47599c, c4901b.f47599c) && Objects.equals(this.f47600d, c4901b.f47600d) && this.f47601e == c4901b.f47601e && this.f47602f == c4901b.f47602f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f47597a) * 31;
        String str = this.f47598b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f47599c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f47600d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f47601e ? 1 : 0)) * 31) + this.f47602f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f47599c + "\", genre=\"" + this.f47598b + "\", bitrate=" + this.f47597a + ", metadataInterval=" + this.f47602f;
    }
}
