package s3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r3.j;
import r3.o;
import r3.p;
import s2.C6403a;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6415a extends AbstractC6419e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f59114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f59115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f59116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f59117l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f59120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f59121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f59122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f59123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f59124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f59125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f59126u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f59127v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f59129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f59130y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f59112z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f59105A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int[] f59106B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int[] f59107C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, JfifUtil.MARKER_APP1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f59108D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f59109E = {193, RCHTTPStatusCodes.CREATED, 211, JfifUtil.MARKER_SOS, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, JfifUtil.MARKER_SOFn, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, JfifUtil.MARKER_EOI, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f59110F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, JfifUtil.MARKER_SOI, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final boolean[] f59111G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6609I f59113h = new C6609I();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f59118m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0893a f59119n = new C0893a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f59128w = 0;

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0893a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f59131a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f59132b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f59133c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f59134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f59136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f59138h;

        /* JADX INFO: renamed from: s3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0894a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f59140b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f59141c;

            public C0894a(int i10, boolean z10, int i11) {
                this.f59139a = i10;
                this.f59140b = z10;
                this.f59141c = i11;
            }
        }

        public C0893a(int i10, int i11) {
            j(i10);
            this.f59138h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f59133c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f59131a.size()) {
                C0894a c0894a = (C0894a) this.f59131a.get(i14);
                boolean z11 = c0894a.f59140b;
                int i16 = c0894a.f59139a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = C6415a.f59106B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0894a.f59141c;
                i14++;
                if (i17 != (i14 < this.f59131a.size() ? ((C0894a) this.f59131a.get(i14)).f59141c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f59133c.length() < 32) {
                this.f59133c.append(c10);
            }
        }

        public void f() {
            int length = this.f59133c.length();
            if (length > 0) {
                this.f59133c.delete(length - 1, length);
                for (int size = this.f59131a.size() - 1; size >= 0; size--) {
                    C0894a c0894a = (C0894a) this.f59131a.get(size);
                    int i10 = c0894a.f59141c;
                    if (i10 != length) {
                        return;
                    }
                    c0894a.f59141c = i10 - 1;
                }
            }
        }

        public C6403a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f59132b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f59132b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f59135e + this.f59136f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f59137g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f59137g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f59134d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f59137g == 1) {
                i14 -= this.f59138h - 1;
            }
            return new C6403a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f59131a.isEmpty() && this.f59132b.isEmpty() && this.f59133c.length() == 0;
        }

        public void j(int i10) {
            this.f59137g = i10;
            this.f59131a.clear();
            this.f59132b.clear();
            this.f59133c.setLength(0);
            this.f59134d = 15;
            this.f59135e = 0;
            this.f59136f = 0;
        }

        public void k() {
            this.f59132b.add(h());
            this.f59133c.setLength(0);
            this.f59131a.clear();
            int iMin = Math.min(this.f59138h, this.f59134d);
            while (this.f59132b.size() >= iMin) {
                this.f59132b.remove(0);
            }
        }

        public void l(int i10) {
            this.f59137g = i10;
        }

        public void m(int i10) {
            this.f59138h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f59131a.add(new C0894a(i10, z10, this.f59133c.length()));
        }
    }

    public C6415a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            AbstractC6614a.a(j10 >= 16000);
            this.f59117l = j10 * 1000;
        } else {
            this.f59117l = -9223372036854775807L;
        }
        this.f59114i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f59116k = 0;
            this.f59115j = 0;
        } else if (i10 == 2) {
            this.f59116k = 1;
            this.f59115j = 0;
        } else if (i10 == 3) {
            this.f59116k = 0;
            this.f59115j = 1;
        } else if (i10 != 4) {
            AbstractC6635w.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f59116k = 0;
            this.f59115j = 0;
        } else {
            this.f59116k = 1;
            this.f59115j = 1;
        }
        P(0);
        O();
        this.f59129x = true;
        this.f59130y = -9223372036854775807L;
    }

    private void A(byte b10) {
        if (b10 == 32) {
            P(2);
            return;
        }
        if (b10 == 41) {
            P(3);
            return;
        }
        switch (b10) {
            case 37:
                P(1);
                Q(2);
                break;
            case 38:
                P(1);
                Q(3);
                break;
            case 39:
                P(1);
                Q(4);
                break;
            default:
                int i10 = this.f59122q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f59120o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    O();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f59119n.i()) {
                                    this.f59119n.k();
                                    break;
                                }
                                break;
                            case 46:
                                O();
                                break;
                            case 47:
                                this.f59120o = u();
                                O();
                                break;
                        }
                    } else {
                        this.f59119n.f();
                        break;
                    }
                }
                break;
        }
    }

    private void B(byte b10, byte b11) {
        int i10 = f59112z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f59119n.f59134d) {
            if (this.f59122q != 1 && !this.f59119n.i()) {
                C0893a c0893a = new C0893a(this.f59122q, this.f59123r);
                this.f59119n = c0893a;
                this.f59118m.add(c0893a);
            }
            this.f59119n.f59134d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f59119n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f59119n.f59135e = f59105A[i11];
        }
    }

    private static boolean C(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean G(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean H(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean I(boolean z10, byte b10, byte b11) {
        if (!z10 || !H(b10)) {
            this.f59125t = false;
        } else {
            if (this.f59125t && this.f59126u == b10 && this.f59127v == b11) {
                this.f59125t = false;
                return true;
            }
            this.f59125t = true;
            this.f59126u = b10;
            this.f59127v = b11;
        }
        return false;
    }

    private static boolean J(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean L(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean M(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void N(byte b10, byte b11) {
        if (M(b10)) {
            this.f59129x = false;
            return;
        }
        if (J(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f59129x = false;
                                break;
                        }
                        return;
                }
            }
            this.f59129x = true;
        }
    }

    private void O() {
        this.f59119n.j(this.f59122q);
        this.f59118m.clear();
        this.f59118m.add(this.f59119n);
    }

    private void P(int i10) {
        int i11 = this.f59122q;
        if (i11 == i10) {
            return;
        }
        this.f59122q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f59118m.size(); i12++) {
                ((C0893a) this.f59118m.get(i12)).l(i10);
            }
            return;
        }
        O();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f59120o = Collections.EMPTY_LIST;
        }
    }

    private void Q(int i10) {
        this.f59123r = i10;
        this.f59119n.m(i10);
    }

    private boolean R() {
        return (this.f59117l == -9223372036854775807L || this.f59130y == -9223372036854775807L || m() - this.f59130y < this.f59117l) ? false : true;
    }

    private boolean S(byte b10) {
        if (C(b10)) {
            this.f59128w = t(b10);
        }
        return this.f59128w == this.f59116k;
    }

    private static char s(byte b10) {
        return (char) f59107C[(b10 & 127) - 32];
    }

    private static int t(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List u() {
        int size = this.f59118m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C6403a c6403aG = ((C0893a) this.f59118m.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(c6403aG);
            if (c6403aG != null) {
                iMin = Math.min(iMin, c6403aG.f59054i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C6403a c6403a = (C6403a) arrayList.get(i11);
            if (c6403a != null) {
                if (c6403a.f59054i != iMin) {
                    c6403a = (C6403a) AbstractC6614a.e(((C0893a) this.f59118m.get(i11)).g(iMin));
                }
                arrayList2.add(c6403a);
            }
        }
        return arrayList2;
    }

    private static char v(byte b10) {
        return (char) f59109E[b10 & 31];
    }

    private static char w(byte b10) {
        return (char) f59110F[b10 & 31];
    }

    private static char x(byte b10, byte b11) {
        return (b10 & 1) == 0 ? v(b11) : w(b11);
    }

    private static char y(byte b10) {
        return (char) f59108D[b10 & 15];
    }

    private void z(byte b10) {
        this.f59119n.e(' ');
        this.f59119n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    @Override // s3.AbstractC6419e, r3.k
    public /* bridge */ /* synthetic */ void c(long j10) {
        super.c(j10);
    }

    @Override // s3.AbstractC6419e, z2.InterfaceC7279d
    public void flush() {
        super.flush();
        this.f59120o = null;
        this.f59121p = null;
        P(0);
        Q(4);
        O();
        this.f59124s = false;
        this.f59125t = false;
        this.f59126u = (byte) 0;
        this.f59127v = (byte) 0;
        this.f59128w = 0;
        this.f59129x = true;
        this.f59130y = -9223372036854775807L;
    }

    @Override // s3.AbstractC6419e
    protected j h() {
        List list = this.f59120o;
        this.f59121p = list;
        return new C6420f((List) AbstractC6614a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // s3.AbstractC6419e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void i(r3.o r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C6415a.i(r3.o):void");
    }

    @Override // s3.AbstractC6419e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ o g() {
        return super.g();
    }

    @Override // s3.AbstractC6419e, z2.InterfaceC7279d, I2.b
    /* JADX INFO: renamed from: k */
    public p b() {
        p pVarL;
        p pVarB = super.b();
        if (pVarB != null) {
            return pVarB;
        }
        if (!R() || (pVarL = l()) == null) {
            return null;
        }
        this.f59120o = Collections.EMPTY_LIST;
        this.f59130y = -9223372036854775807L;
        pVarL.x(m(), h(), Long.MAX_VALUE);
        return pVarL;
    }

    @Override // s3.AbstractC6419e
    protected boolean n() {
        return this.f59120o != this.f59121p;
    }

    @Override // s3.AbstractC6419e
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void e(o oVar) {
        super.e(oVar);
    }

    @Override // s3.AbstractC6419e, z2.InterfaceC7279d
    public void a() {
    }
}
