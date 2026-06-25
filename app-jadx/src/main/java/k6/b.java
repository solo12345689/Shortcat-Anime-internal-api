package K6;

import android.net.Uri;
import android.os.Build;
import java.io.File;
import s5.InterfaceC6433d;
import y5.e;
import y5.i;
import y5.k;
import y6.f;
import y6.g;
import y6.h;
import z6.EnumC7300n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: A */
    public static final e f10883A = new a();

    /* JADX INFO: renamed from: y */
    private static boolean f10884y;

    /* JADX INFO: renamed from: z */
    private static boolean f10885z;

    /* JADX INFO: renamed from: a */
    private int f10886a;

    /* JADX INFO: renamed from: b */
    private final EnumC0172b f10887b;

    /* JADX INFO: renamed from: c */
    private final Uri f10888c;

    /* JADX INFO: renamed from: d */
    private final int f10889d;

    /* JADX INFO: renamed from: e */
    private File f10890e;

    /* JADX INFO: renamed from: f */
    private final boolean f10891f;

    /* JADX INFO: renamed from: g */
    private final boolean f10892g;

    /* JADX INFO: renamed from: h */
    private final boolean f10893h;

    /* JADX INFO: renamed from: i */
    private final y6.d f10894i;

    /* JADX INFO: renamed from: j */
    private final g f10895j;

    /* JADX INFO: renamed from: k */
    private final h f10896k;

    /* JADX INFO: renamed from: l */
    private final y6.b f10897l;

    /* JADX INFO: renamed from: m */
    private final f f10898m;

    /* JADX INFO: renamed from: n */
    private final c f10899n;

    /* JADX INFO: renamed from: o */
    protected int f10900o;

    /* JADX INFO: renamed from: p */
    private final boolean f10901p;

    /* JADX INFO: renamed from: q */
    private final boolean f10902q;

    /* JADX INFO: renamed from: r */
    private final Boolean f10903r;

    /* JADX INFO: renamed from: s */
    private final d f10904s;

    /* JADX INFO: renamed from: t */
    private final G6.e f10905t;

    /* JADX INFO: renamed from: u */
    private final Boolean f10906u;

    /* JADX INFO: renamed from: v */
    private final EnumC7300n f10907v;

    /* JADX INFO: renamed from: w */
    private final String f10908w;

    /* JADX INFO: renamed from: x */
    private final int f10909x;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements e {
        a() {
        }

        @Override // y5.e
        /* JADX INFO: renamed from: a */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.v();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: K6.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0172b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: a */
        private int f10919a;

        c(int i10) {
            this.f10919a = i10;
        }

        public static c a(c cVar, c cVar2) {
            return cVar.b() > cVar2.b() ? cVar : cVar2;
        }

        public int b() {
            return this.f10919a;
        }
    }

    protected b(K6.c cVar) {
        this.f10887b = cVar.d();
        Uri uriR = cVar.r();
        this.f10888c = uriR;
        this.f10889d = x(uriR);
        this.f10891f = cVar.w();
        this.f10892g = cVar.u();
        this.f10893h = cVar.j();
        this.f10894i = cVar.i();
        this.f10895j = cVar.o();
        this.f10896k = cVar.q() == null ? h.c() : cVar.q();
        this.f10897l = cVar.c();
        this.f10898m = cVar.n();
        this.f10899n = cVar.k();
        boolean zT = cVar.t();
        this.f10901p = zT;
        int iE = cVar.e();
        this.f10900o = zT ? iE : iE | 48;
        this.f10902q = cVar.v();
        this.f10903r = cVar.S();
        this.f10904s = cVar.l();
        this.f10905t = cVar.m();
        this.f10906u = cVar.p();
        this.f10907v = cVar.h();
        this.f10909x = cVar.f();
        this.f10908w = cVar.g();
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return K6.c.x(uri).a();
    }

    private static int x(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (G5.f.n(uri)) {
            return 0;
        }
        if (uri.getPath() != null && G5.f.l(uri)) {
            return A5.a.c(A5.a.b(uri.getPath())) ? 2 : 3;
        }
        if (G5.f.k(uri)) {
            return 4;
        }
        if (G5.f.h(uri)) {
            return 5;
        }
        if (G5.f.m(uri)) {
            return 6;
        }
        if (G5.f.g(uri)) {
            return 7;
        }
        return G5.f.o(uri) ? 8 : -1;
    }

    public y6.b b() {
        return this.f10897l;
    }

    public EnumC0172b c() {
        return this.f10887b;
    }

    public int d() {
        return this.f10900o;
    }

    public int e() {
        return this.f10909x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (f10884y) {
            int i10 = this.f10886a;
            int i11 = bVar.f10886a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
        }
        if (this.f10892g == bVar.f10892g && this.f10901p == bVar.f10901p && this.f10902q == bVar.f10902q && i.a(this.f10888c, bVar.f10888c) && i.a(this.f10887b, bVar.f10887b) && i.a(this.f10908w, bVar.f10908w) && i.a(this.f10890e, bVar.f10890e) && i.a(this.f10897l, bVar.f10897l) && i.a(this.f10894i, bVar.f10894i) && i.a(this.f10895j, bVar.f10895j) && i.a(this.f10898m, bVar.f10898m) && i.a(this.f10899n, bVar.f10899n) && i.a(Integer.valueOf(this.f10900o), Integer.valueOf(bVar.f10900o)) && i.a(this.f10903r, bVar.f10903r) && i.a(this.f10906u, bVar.f10906u) && i.a(this.f10907v, bVar.f10907v) && i.a(this.f10896k, bVar.f10896k) && this.f10893h == bVar.f10893h) {
            d dVar = this.f10904s;
            InterfaceC6433d interfaceC6433dB = dVar != null ? dVar.b() : null;
            d dVar2 = bVar.f10904s;
            if (i.a(interfaceC6433dB, dVar2 != null ? dVar2.b() : null) && this.f10909x == bVar.f10909x) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f10908w;
    }

    public EnumC7300n g() {
        return this.f10907v;
    }

    public y6.d h() {
        return this.f10894i;
    }

    public int hashCode() {
        boolean z10 = f10885z;
        int i10 = z10 ? this.f10886a : 0;
        if (i10 != 0) {
            return i10;
        }
        d dVar = this.f10904s;
        int iA = R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(R6.a.a(0, this.f10887b), this.f10888c), Boolean.valueOf(this.f10892g)), this.f10897l), this.f10898m), this.f10899n), Integer.valueOf(this.f10900o)), Boolean.valueOf(this.f10901p)), Boolean.valueOf(this.f10902q)), this.f10894i), this.f10903r), this.f10895j), this.f10896k), dVar != null ? dVar.b() : null), this.f10906u), this.f10907v), Integer.valueOf(this.f10909x)), Boolean.valueOf(this.f10893h));
        if (z10) {
            this.f10886a = iA;
        }
        return iA;
    }

    public boolean i() {
        return Build.VERSION.SDK_INT >= 29 && this.f10893h;
    }

    public boolean j() {
        return this.f10892g;
    }

    public c k() {
        return this.f10899n;
    }

    public d l() {
        return this.f10904s;
    }

    public int m() {
        g gVar = this.f10895j;
        if (gVar != null) {
            return gVar.f64869b;
        }
        return 2048;
    }

    public int n() {
        g gVar = this.f10895j;
        if (gVar != null) {
            return gVar.f64868a;
        }
        return 2048;
    }

    public f o() {
        return this.f10898m;
    }

    public boolean p() {
        return this.f10891f;
    }

    public G6.e q() {
        return this.f10905t;
    }

    public g r() {
        return this.f10895j;
    }

    public Boolean s() {
        return this.f10906u;
    }

    public h t() {
        return this.f10896k;
    }

    public String toString() {
        return i.b(this).b("uri", this.f10888c).b("cacheChoice", this.f10887b).b("decodeOptions", this.f10894i).b("postprocessor", this.f10904s).b("priority", this.f10898m).b("resizeOptions", this.f10895j).b("rotationOptions", this.f10896k).b("bytesRange", this.f10897l).b("resizingAllowedOverride", this.f10906u).b("downsampleOverride", this.f10907v).c("progressiveRenderingEnabled", this.f10891f).c("localThumbnailPreviewsEnabled", this.f10892g).c("loadThumbnailOnly", this.f10893h).b("lowestPermittedRequestLevel", this.f10899n).a("cachesDisabled", this.f10900o).c("isDiskCacheEnabled", this.f10901p).c("isMemoryCacheEnabled", this.f10902q).b("decodePrefetches", this.f10903r).a("delayMs", this.f10909x).toString();
    }

    public synchronized File u() {
        try {
            if (this.f10890e == null) {
                k.g(this.f10888c.getPath());
                this.f10890e = new File(this.f10888c.getPath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10890e;
    }

    public Uri v() {
        return this.f10888c;
    }

    public int w() {
        return this.f10889d;
    }

    public boolean y(int i10) {
        return (i10 & d()) == 0;
    }

    public Boolean z() {
        return this.f10903r;
    }
}
