package q2;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: q2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6097l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C6097l f56898h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C6097l f56899i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f56900j = t2.a0.H0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f56901k = t2.a0.H0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f56902l = t2.a0.H0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f56903m = t2.a0.H0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f56904n = t2.a0.H0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f56905o = t2.a0.H0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f56909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56912g;

    /* JADX INFO: renamed from: q2.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f56913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f56914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f56915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f56916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f56917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56918f;

        public C6097l a() {
            return new C6097l(this.f56913a, this.f56914b, this.f56915c, this.f56916d, this.f56917e, this.f56918f);
        }

        public b b(int i10) {
            this.f56918f = i10;
            return this;
        }

        public b c(int i10) {
            this.f56914b = i10;
            return this;
        }

        public b d(int i10) {
            this.f56913a = i10;
            return this;
        }

        public b e(int i10) {
            this.f56915c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f56916d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f56917e = i10;
            return this;
        }

        public b() {
            this.f56913a = -1;
            this.f56914b = -1;
            this.f56915c = -1;
            this.f56917e = -1;
            this.f56918f = -1;
        }

        private b(C6097l c6097l) {
            this.f56913a = c6097l.f56906a;
            this.f56914b = c6097l.f56907b;
            this.f56915c = c6097l.f56908c;
            this.f56916d = c6097l.f56909d;
            this.f56917e = c6097l.f56910e;
            this.f56918f = c6097l.f56911f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static C6097l f(Bundle bundle) {
        return new C6097l(bundle.getInt(f56900j, -1), bundle.getInt(f56901k, -1), bundle.getInt(f56902l, -1), bundle.getByteArray(f56903m), bundle.getInt(f56904n, -1), bundle.getInt(f56905o, -1));
    }

    public static boolean i(C6097l c6097l) {
        if (c6097l == null) {
            return true;
        }
        int i10 = c6097l.f56906a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c6097l.f56907b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c6097l.f56908c;
        if ((i12 != -1 && i12 != 3) || c6097l.f56909d != null) {
            return false;
        }
        int i13 = c6097l.f56911f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c6097l.f56910e;
        return i14 == -1 || i14 == 8;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int l(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String m(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6097l.class == obj.getClass()) {
            C6097l c6097l = (C6097l) obj;
            if (this.f56906a == c6097l.f56906a && this.f56907b == c6097l.f56907b && this.f56908c == c6097l.f56908c && Arrays.equals(this.f56909d, c6097l.f56909d) && this.f56910e == c6097l.f56910e && this.f56911f == c6097l.f56911f) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return (this.f56910e == -1 || this.f56911f == -1) ? false : true;
    }

    public boolean h() {
        return (this.f56906a == -1 || this.f56907b == -1 || this.f56908c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f56912g == 0) {
            this.f56912g = ((((((((((527 + this.f56906a) * 31) + this.f56907b) * 31) + this.f56908c) * 31) + Arrays.hashCode(this.f56909d)) * 31) + this.f56910e) * 31) + this.f56911f;
        }
        return this.f56912g;
    }

    public boolean j() {
        return g() || h();
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        bundle.putInt(f56900j, this.f56906a);
        bundle.putInt(f56901k, this.f56907b);
        bundle.putInt(f56902l, this.f56908c);
        bundle.putByteArray(f56903m, this.f56909d);
        bundle.putInt(f56904n, this.f56910e);
        bundle.putInt(f56905o, this.f56911f);
        return bundle;
    }

    public String o() {
        String str;
        String strI = h() ? t2.a0.I("%s/%s/%s", d(this.f56906a), c(this.f56907b), e(this.f56908c)) : "NA/NA/NA";
        if (g()) {
            str = this.f56910e + "/" + this.f56911f;
        } else {
            str = "NA/NA";
        }
        return strI + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f56906a));
        sb2.append(", ");
        sb2.append(c(this.f56907b));
        sb2.append(", ");
        sb2.append(e(this.f56908c));
        sb2.append(", ");
        sb2.append(this.f56909d != null);
        sb2.append(", ");
        sb2.append(m(this.f56910e));
        sb2.append(", ");
        sb2.append(b(this.f56911f));
        sb2.append(")");
        return sb2.toString();
    }

    private C6097l(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f56906a = i10;
        this.f56907b = i11;
        this.f56908c = i12;
        this.f56909d = bArr;
        this.f56910e = i13;
        this.f56911f = i14;
    }
}
