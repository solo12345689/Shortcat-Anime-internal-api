package H1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7653h;

    public f(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f7649d;
    }

    public int c() {
        return this.f7650e;
    }

    String d() {
        return this.f7653h;
    }

    public String e() {
        return this.f7646a;
    }

    public String f() {
        return this.f7647b;
    }

    public String g() {
        return this.f7648c;
    }

    public String h() {
        return this.f7651f;
    }

    public String i() {
        return this.f7652g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f7646a + ", mProviderPackage: " + this.f7647b + ", mQuery: " + this.f7648c + ", mSystemFont: " + this.f7651f + ", mVariationSettings: " + this.f7652g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f7649d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f7649d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f7650e);
        return sb2.toString();
    }

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        this.f7646a = (String) K1.f.g(str);
        this.f7647b = (String) K1.f.g(str2);
        this.f7648c = (String) K1.f.g(str3);
        this.f7649d = (List) K1.f.g(list);
        this.f7650e = 0;
        this.f7651f = str4;
        this.f7652g = str5;
        this.f7653h = a(str, str2, str3, str4, str5);
    }

    public f(String str, String str2, String str3, int i10) {
        this.f7646a = (String) K1.f.g(str);
        this.f7647b = (String) K1.f.g(str2);
        this.f7648c = (String) K1.f.g(str3);
        this.f7649d = null;
        K1.f.a(i10 != 0);
        this.f7650e = i10;
        this.f7651f = null;
        this.f7652g = null;
        this.f7653h = a(str, str2, str3, null, null);
    }
}
