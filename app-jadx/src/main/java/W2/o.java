package w2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q2.AbstractC6076H;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f62825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f62828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f62829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f62830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f62831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f62832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f62833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f62835k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f62836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f62837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f62838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f62839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f62840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f62841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f62842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f62843h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62844i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f62845j;

        public o a() {
            AbstractC6614a.j(this.f62836a, "The uri must be set.");
            return new o(this.f62836a, this.f62837b, this.f62838c, this.f62839d, this.f62840e, this.f62841f, this.f62842g, this.f62843h, this.f62844i, this.f62845j);
        }

        public b b(int i10) {
            this.f62844i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f62839d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f62838c = i10;
            return this;
        }

        public b e(Map map) {
            this.f62840e = map;
            return this;
        }

        public b f(String str) {
            this.f62843h = str;
            return this;
        }

        public b g(long j10) {
            this.f62842g = j10;
            return this;
        }

        public b h(long j10) {
            this.f62841f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f62836a = uri;
            return this;
        }

        public b j(String str) {
            this.f62836a = Uri.parse(str);
            return this;
        }

        public b k(long j10) {
            this.f62837b = j10;
            return this;
        }

        public b() {
            this.f62838c = 1;
            this.f62840e = Collections.EMPTY_MAP;
            this.f62842g = -1L;
        }

        private b(o oVar) {
            this.f62836a = oVar.f62825a;
            this.f62837b = oVar.f62826b;
            this.f62838c = oVar.f62827c;
            this.f62839d = oVar.f62828d;
            this.f62840e = oVar.f62829e;
            this.f62841f = oVar.f62831g;
            this.f62842g = oVar.f62832h;
            this.f62843h = oVar.f62833i;
            this.f62844i = oVar.f62834j;
            this.f62845j = oVar.f62835k;
        }
    }

    static {
        AbstractC6076H.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f62827c);
    }

    public boolean d(int i10) {
        return (this.f62834j & i10) == i10;
    }

    public o e(long j10) {
        long j11 = this.f62832h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public o f(long j10, long j11) {
        return (j10 == 0 && this.f62832h == j11) ? this : new o(this.f62825a, this.f62826b, this.f62827c, this.f62828d, this.f62829e, this.f62831g + j10, j11, this.f62833i, this.f62834j, this.f62835k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f62825a + ", " + this.f62831g + ", " + this.f62832h + ", " + this.f62833i + ", " + this.f62834j + "]";
    }

    public o(Uri uri) {
        this(uri, 0L, -1L);
    }

    public o(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    public o(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    private o(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        AbstractC6614a.a(j13 >= 0);
        AbstractC6614a.a(j11 >= 0);
        AbstractC6614a.a(j12 > 0 || j12 == -1);
        this.f62825a = (Uri) AbstractC6614a.e(uri);
        this.f62826b = j10;
        this.f62827c = i10;
        this.f62828d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f62829e = Collections.unmodifiableMap(new HashMap(map));
        this.f62831g = j11;
        this.f62830f = j13;
        this.f62832h = j12;
        this.f62833i = str;
        this.f62834j = i11;
        this.f62835k = obj;
    }
}
