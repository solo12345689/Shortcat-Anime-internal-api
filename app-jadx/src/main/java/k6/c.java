package K6;

import G6.e;
import K6.b;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y5.k;
import y6.f;
import y6.g;
import y6.h;
import z6.C7306u;
import z6.EnumC7300n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f10920t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f10934n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10938r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f10921a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.c f10922b = b.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10923c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f10924d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f10925e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y6.d f10926f = y6.d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.EnumC0172b f10927g = b.EnumC0172b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10928h = C7306u.J().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10929i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10930j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f10931k = f.f64864d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f10932l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f10933m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private y6.b f10935o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f10936p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private EnumC7300n f10937q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f10939s = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c B(int i10) {
        this.f10923c = i10;
        if (this.f10927g != b.EnumC0172b.DYNAMIC) {
            this.f10939s = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return x(bVar.v()).F(bVar.h()).z(bVar.b()).A(bVar.c()).H(bVar.j()).G(bVar.i()).I(bVar.k()).B(bVar.d()).J(bVar.l()).K(bVar.p()).M(bVar.o()).N(bVar.r()).L(bVar.q()).P(bVar.t()).Q(bVar.z()).C(bVar.e()).D(bVar.f()).E(bVar.g()).O(bVar.s());
    }

    public static boolean s(Uri uri) {
        Set set = f10920t;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c x(Uri uri) {
        return new c().R(uri);
    }

    public c A(b.EnumC0172b enumC0172b) {
        this.f10927g = enumC0172b;
        return this;
    }

    public c C(int i10) {
        this.f10938r = i10;
        return this;
    }

    public c D(String str) {
        this.f10939s = str;
        return this;
    }

    public c E(EnumC7300n enumC7300n) {
        this.f10937q = enumC7300n;
        return this;
    }

    public c F(y6.d dVar) {
        this.f10926f = dVar;
        return this;
    }

    public c G(boolean z10) {
        this.f10930j = z10;
        return this;
    }

    public c H(boolean z10) {
        this.f10929i = z10;
        return this;
    }

    public c I(b.c cVar) {
        this.f10922b = cVar;
        return this;
    }

    public c J(d dVar) {
        this.f10932l = dVar;
        return this;
    }

    public c K(boolean z10) {
        this.f10928h = z10;
        return this;
    }

    public c L(e eVar) {
        this.f10934n = eVar;
        return this;
    }

    public c M(f fVar) {
        this.f10931k = fVar;
        return this;
    }

    public c N(g gVar) {
        this.f10924d = gVar;
        return this;
    }

    public c O(Boolean bool) {
        this.f10936p = bool;
        return this;
    }

    public c P(h hVar) {
        this.f10925e = hVar;
        return this;
    }

    public c Q(Boolean bool) {
        this.f10933m = bool;
        return this;
    }

    public c R(Uri uri) {
        k.g(uri);
        this.f10921a = uri;
        return this;
    }

    public Boolean S() {
        return this.f10933m;
    }

    protected void T() {
        Uri uri = this.f10921a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (G5.f.m(uri)) {
            if (!this.f10921a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f10921a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f10921a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (G5.f.h(this.f10921a) && !this.f10921a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public b a() {
        T();
        return new b(this);
    }

    public y6.b c() {
        return this.f10935o;
    }

    public b.EnumC0172b d() {
        return this.f10927g;
    }

    public int e() {
        return this.f10923c;
    }

    public int f() {
        return this.f10938r;
    }

    public String g() {
        return this.f10939s;
    }

    public EnumC7300n h() {
        return this.f10937q;
    }

    public y6.d i() {
        return this.f10926f;
    }

    public boolean j() {
        return this.f10930j;
    }

    public b.c k() {
        return this.f10922b;
    }

    public d l() {
        return this.f10932l;
    }

    public e m() {
        return this.f10934n;
    }

    public f n() {
        return this.f10931k;
    }

    public g o() {
        return this.f10924d;
    }

    public Boolean p() {
        return this.f10936p;
    }

    public h q() {
        return this.f10925e;
    }

    public Uri r() {
        return this.f10921a;
    }

    public boolean t() {
        if ((this.f10923c & 48) == 0) {
            return G5.f.n(this.f10921a) || s(this.f10921a);
        }
        return false;
    }

    public boolean u() {
        return this.f10929i;
    }

    public boolean v() {
        return (this.f10923c & 15) == 0;
    }

    public boolean w() {
        return this.f10928h;
    }

    public c y(boolean z10) {
        return z10 ? P(h.c()) : P(h.e());
    }

    public c z(y6.b bVar) {
        this.f10935o = bVar;
        return this;
    }
}
