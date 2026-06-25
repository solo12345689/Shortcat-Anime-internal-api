package Y4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements S4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f22782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f22783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f22785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f22786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f22787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22788h;

    public h(URL url) {
        this(url, i.f22790b);
    }

    private byte[] d() {
        if (this.f22787g == null) {
            this.f22787g = c().getBytes(S4.f.f15942a);
        }
        return this.f22787g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f22785e)) {
            String string = this.f22784d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) o5.k.e(this.f22783c)).toString();
            }
            this.f22785e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f22785e;
    }

    private URL g() {
        if (this.f22786f == null) {
            this.f22786f = new URL(f());
        }
        return this.f22786f;
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f22784d;
        return str != null ? str : ((URL) o5.k.e(this.f22783c)).toString();
    }

    public Map e() {
        return this.f22782b.a();
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f22782b.equals(hVar.f22782b)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // S4.f
    public int hashCode() {
        if (this.f22788h == 0) {
            int iHashCode = c().hashCode();
            this.f22788h = iHashCode;
            this.f22788h = (iHashCode * 31) + this.f22782b.hashCode();
        }
        return this.f22788h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f22790b);
    }

    public h(URL url, i iVar) {
        this.f22783c = (URL) o5.k.e(url);
        this.f22784d = null;
        this.f22782b = (i) o5.k.e(iVar);
    }

    public h(String str, i iVar) {
        this.f22783c = null;
        this.f22784d = o5.k.c(str);
        this.f22782b = (i) o5.k.e(iVar);
    }
}
