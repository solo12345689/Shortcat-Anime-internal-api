package s3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import r3.j;
import r3.o;
import r3.p;
import s2.C6403a;
import s3.C6417c;
import t2.AbstractC6614a;
import t2.AbstractC6624k;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: renamed from: s3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6417c extends AbstractC6419e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C6609I f59142h = new C6609I();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6608H f59143i = new C6608H();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f59144j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f59145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f59146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f59147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f59148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f59149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f59150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0895c f59151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f59152r;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f59153c = new Comparator() { // from class: s3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((C6417c.a) obj2).f59155b, ((C6417c.a) obj).f59155b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6403a f59154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59155b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C6403a.b bVarN = new C6403a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f59154a = bVarN.a();
            this.f59155b = i14;
        }
    }

    /* JADX INFO: renamed from: s3.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static final int[] f59156A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static final boolean[] f59157B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final int[] f59158C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final int[] f59159D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final int[] f59160E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final int[] f59161F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f59162v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f59163w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f59164x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f59165y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f59166z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f59167a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f59168b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f59169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f59170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f59172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59173g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f59174h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f59175i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f59176j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f59177k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f59178l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f59179m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f59180n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f59181o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f59182p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f59183q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f59184r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f59185s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f59186t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f59187u;

        static {
            int iH = h(0, 0, 0, 0);
            f59163w = iH;
            int iH2 = h(0, 0, 0, 3);
            f59164x = iH2;
            f59165y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f59166z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f59156A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f59157B = new boolean[]{false, false, false, true, true, true, false};
            f59158C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f59159D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f59160E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f59161F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                t2.AbstractC6614a.c(r4, r0, r1)
                t2.AbstractC6614a.c(r5, r0, r1)
                t2.AbstractC6614a.c(r6, r0, r1)
                t2.AbstractC6614a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.C6417c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f59168b.append(c10);
                return;
            }
            this.f59167a.add(d());
            this.f59168b.clear();
            if (this.f59181o != -1) {
                this.f59181o = 0;
            }
            if (this.f59182p != -1) {
                this.f59182p = 0;
            }
            if (this.f59183q != -1) {
                this.f59183q = 0;
            }
            if (this.f59185s != -1) {
                this.f59185s = 0;
            }
            while (true) {
                if (this.f59167a.size() < this.f59176j && this.f59167a.size() < 15) {
                    this.f59187u = this.f59167a.size();
                    return;
                }
                this.f59167a.remove(0);
            }
        }

        public void b() {
            int length = this.f59168b.length();
            if (length > 0) {
                this.f59168b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            float f12;
            int i11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f59167a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f59167a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i13 = this.f59177k;
            int i14 = 2;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f59177k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f59172f) {
                f10 = this.f59174h / 99.0f;
                f11 = this.f59173g / 99.0f;
            } else {
                f10 = this.f59174h / 209.0f;
                f11 = this.f59173g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f59175i;
            if (i15 / 3 == 0) {
                i10 = i15;
                f12 = f13;
                i11 = 0;
            } else if (i15 / 3 == 1) {
                i10 = i15;
                f12 = f13;
                i11 = 1;
            } else {
                i10 = i15;
                f12 = f13;
                i11 = 2;
            }
            if (i10 % 3 == 0) {
                i14 = 0;
            } else if (i10 % 3 == 1) {
                i14 = 1;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, this.f59180n != f59163w, this.f59180n, this.f59171e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f59168b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f59181o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f59181o, length, 33);
                }
                if (this.f59182p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f59182p, length, 33);
                }
                if (this.f59183q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f59184r), this.f59183q, length, 33);
                }
                if (this.f59185s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f59186t), this.f59185s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f59167a.clear();
            this.f59168b.clear();
            this.f59181o = -1;
            this.f59182p = -1;
            this.f59183q = -1;
            this.f59185s = -1;
            this.f59187u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f59169c = true;
            this.f59170d = z10;
            this.f59171e = i10;
            this.f59172f = z11;
            this.f59173g = i11;
            this.f59174h = i12;
            this.f59175i = i14;
            int i17 = i13 + 1;
            if (this.f59176j != i17) {
                this.f59176j = i17;
                while (true) {
                    if (this.f59167a.size() < this.f59176j && this.f59167a.size() < 15) {
                        break;
                    } else {
                        this.f59167a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f59178l != i15) {
                this.f59178l = i15;
                int i18 = i15 - 1;
                q(f59158C[i18], f59164x, f59157B[i18], 0, f59166z[i18], f59156A[i18], f59165y[i18]);
            }
            if (i16 == 0 || this.f59179m == i16) {
                return;
            }
            this.f59179m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f59160E[i19], f59159D[i19]);
            n(f59162v, f59161F[i19], f59163w);
        }

        public boolean i() {
            return this.f59169c;
        }

        public boolean j() {
            if (i()) {
                return this.f59167a.isEmpty() && this.f59168b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f59170d;
        }

        public void l() {
            e();
            this.f59169c = false;
            this.f59170d = false;
            this.f59171e = 4;
            this.f59172f = false;
            this.f59173g = 0;
            this.f59174h = 0;
            this.f59175i = 0;
            this.f59176j = 15;
            this.f59177k = 0;
            this.f59178l = 0;
            this.f59179m = 0;
            int i10 = f59163w;
            this.f59180n = i10;
            this.f59184r = f59162v;
            this.f59186t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f59181o != -1) {
                if (!z10) {
                    this.f59168b.setSpan(new StyleSpan(2), this.f59181o, this.f59168b.length(), 33);
                    this.f59181o = -1;
                }
            } else if (z10) {
                this.f59181o = this.f59168b.length();
            }
            if (this.f59182p == -1) {
                if (z11) {
                    this.f59182p = this.f59168b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f59168b.setSpan(new UnderlineSpan(), this.f59182p, this.f59168b.length(), 33);
                this.f59182p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f59183q != -1 && this.f59184r != i10) {
                this.f59168b.setSpan(new ForegroundColorSpan(this.f59184r), this.f59183q, this.f59168b.length(), 33);
            }
            if (i10 != f59162v) {
                this.f59183q = this.f59168b.length();
                this.f59184r = i10;
            }
            if (this.f59185s != -1 && this.f59186t != i11) {
                this.f59168b.setSpan(new BackgroundColorSpan(this.f59186t), this.f59185s, this.f59168b.length(), 33);
            }
            if (i11 != f59163w) {
                this.f59185s = this.f59168b.length();
                this.f59186t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f59187u != i10) {
                a('\n');
            }
            this.f59187u = i10;
        }

        public void p(boolean z10) {
            this.f59170d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f59180n = i10;
            this.f59177k = i15;
        }
    }

    /* JADX INFO: renamed from: s3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0895c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f59190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f59191d = 0;

        public C0895c(int i10, int i11) {
            this.f59188a = i10;
            this.f59189b = i11;
            this.f59190c = new byte[(i11 * 2) - 1];
        }
    }

    public C6417c(int i10, List list) {
        this.f59146l = i10 == -1 ? 1 : i10;
        this.f59145k = list != null && AbstractC6624k.A(list);
        this.f59147m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f59147m[i11] = new b();
        }
        this.f59148n = this.f59147m[0];
    }

    private void A(int i10) {
        if (i10 == 32) {
            this.f59148n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f59148n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f59148n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f59148n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f59148n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f59148n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f59148n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f59148n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f59148n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f59148n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f59148n.a((char) 9608);
                break;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                this.f59148n.a((char) 8216);
                break;
            case 50:
                this.f59148n.a((char) 8217);
                break;
            case 51:
                this.f59148n.a((char) 8220);
                break;
            case 52:
                this.f59148n.a((char) 8221);
                break;
            case 53:
                this.f59148n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f59148n.a((char) 8539);
                        break;
                    case 119:
                        this.f59148n.a((char) 8540);
                        break;
                    case 120:
                        this.f59148n.a((char) 8541);
                        break;
                    case 121:
                        this.f59148n.a((char) 8542);
                        break;
                    case 122:
                        this.f59148n.a((char) 9474);
                        break;
                    case 123:
                        this.f59148n.a((char) 9488);
                        break;
                    case 124:
                        this.f59148n.a((char) 9492);
                        break;
                    case 125:
                        this.f59148n.a((char) 9472);
                        break;
                    case 126:
                        this.f59148n.a((char) 9496);
                        break;
                    case 127:
                        this.f59148n.a((char) 9484);
                        break;
                    default:
                        AbstractC6635w.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    private void B(int i10) {
        if (i10 == 160) {
            this.f59148n.a((char) 13252);
            return;
        }
        AbstractC6635w.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f59148n.a('_');
    }

    private void C() {
        this.f59148n.m(this.f59143i.h(4), this.f59143i.h(2), this.f59143i.h(2), this.f59143i.g(), this.f59143i.g(), this.f59143i.h(3), this.f59143i.h(3));
    }

    private void D() {
        int iH = b.h(this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2));
        int iH2 = b.h(this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2));
        this.f59143i.r(2);
        this.f59148n.n(iH, iH2, b.g(this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2)));
    }

    private void E() {
        this.f59143i.r(4);
        int iH = this.f59143i.h(4);
        this.f59143i.r(2);
        this.f59148n.o(iH, this.f59143i.h(6));
    }

    private void F() {
        int iH = b.h(this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2));
        int iH2 = this.f59143i.h(2);
        int iG = b.g(this.f59143i.h(2), this.f59143i.h(2), this.f59143i.h(2));
        if (this.f59143i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f59143i.g();
        int iH3 = this.f59143i.h(2);
        int iH4 = this.f59143i.h(2);
        int iH5 = this.f59143i.h(2);
        this.f59143i.r(8);
        this.f59148n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void G() {
        C0895c c0895c = this.f59151q;
        if (c0895c.f59191d != (c0895c.f59189b * 2) - 1) {
            AbstractC6635w.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f59151q.f59189b * 2) - 1) + ", but current index is " + this.f59151q.f59191d + " (sequence number " + this.f59151q.f59188a + ");");
        }
        C6608H c6608h = this.f59143i;
        C0895c c0895c2 = this.f59151q;
        c6608h.o(c0895c2.f59190c, c0895c2.f59191d);
        boolean z10 = false;
        while (true) {
            if (this.f59143i.b() <= 0) {
                break;
            }
            int iH = this.f59143i.h(3);
            int iH2 = this.f59143i.h(5);
            if (iH == 7) {
                this.f59143i.r(2);
                iH = this.f59143i.h(6);
                if (iH < 7) {
                    AbstractC6635w.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    AbstractC6635w.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f59146l) {
                this.f59143i.s(iH2);
            } else {
                int iE = this.f59143i.e() + (iH2 * 8);
                while (this.f59143i.e() < iE) {
                    int iH3 = this.f59143i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f59143i.h(8);
                        if (iH4 <= 31) {
                            v(iH4);
                        } else {
                            if (iH4 <= 127) {
                                A(iH4);
                            } else if (iH4 <= 159) {
                                w(iH4);
                            } else if (iH4 <= 255) {
                                B(iH4);
                            } else {
                                AbstractC6635w.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        t(iH3);
                    } else {
                        if (iH3 <= 127) {
                            y(iH3);
                        } else if (iH3 <= 159) {
                            u(iH3);
                        } else if (iH3 <= 255) {
                            z(iH3);
                        } else {
                            AbstractC6635w.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f59149o = s();
        }
    }

    private void H() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f59147m[i10].l();
        }
    }

    private void r() {
        if (this.f59151q == null) {
            return;
        }
        G();
        this.f59151q = null;
    }

    private List s() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f59147m[i10].j() && this.f59147m[i10].k() && (aVarC = this.f59147m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f59153c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f59154a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void t(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f59149o = s();
                return;
            }
            if (i10 == 8) {
                this.f59148n.b();
                return;
            }
            switch (i10) {
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    H();
                    break;
                case 13:
                    this.f59148n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        AbstractC6635w.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f59143i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        AbstractC6635w.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f59143i.r(16);
                    } else {
                        AbstractC6635w.i("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void u(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f59152r != i12) {
                    this.f59152r = i12;
                    this.f59148n = this.f59147m[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f59143i.g()) {
                        this.f59147m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f59143i.g()) {
                        this.f59147m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f59143i.g()) {
                        this.f59147m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f59143i.g()) {
                        this.f59147m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f59143i.g()) {
                        this.f59147m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f59143i.r(8);
                break;
            case 142:
                break;
            case 143:
                H();
                break;
            case 144:
                if (this.f59148n.i()) {
                    C();
                } else {
                    this.f59143i.r(16);
                }
                break;
            case 145:
                if (this.f59148n.i()) {
                    D();
                } else {
                    this.f59143i.r(24);
                }
                break;
            case 146:
                if (this.f59148n.i()) {
                    E();
                } else {
                    this.f59143i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC6635w.i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f59148n.i()) {
                    F();
                } else {
                    this.f59143i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                x(i15);
                if (this.f59152r != i15) {
                    this.f59152r = i15;
                    this.f59148n = this.f59147m[i15];
                }
                break;
        }
    }

    private void v(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f59143i.r(8);
        } else if (i10 <= 23) {
            this.f59143i.r(16);
        } else if (i10 <= 31) {
            this.f59143i.r(24);
        }
    }

    private void w(int i10) {
        if (i10 <= 135) {
            this.f59143i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f59143i.r(40);
        } else if (i10 <= 159) {
            this.f59143i.r(2);
            this.f59143i.r(this.f59143i.h(6) * 8);
        }
    }

    private void x(int i10) {
        b bVar = this.f59147m[i10];
        this.f59143i.r(2);
        boolean zG = this.f59143i.g();
        this.f59143i.r(2);
        int iH = this.f59143i.h(3);
        boolean zG2 = this.f59143i.g();
        int iH2 = this.f59143i.h(7);
        int iH3 = this.f59143i.h(8);
        int iH4 = this.f59143i.h(4);
        int iH5 = this.f59143i.h(4);
        this.f59143i.r(2);
        this.f59143i.r(6);
        this.f59143i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f59143i.h(3), this.f59143i.h(3));
    }

    private void y(int i10) {
        if (i10 == 127) {
            this.f59148n.a((char) 9835);
        } else {
            this.f59148n.a((char) (i10 & 255));
        }
    }

    private void z(int i10) {
        this.f59148n.a((char) (i10 & 255));
    }

    @Override // s3.AbstractC6419e, z2.InterfaceC7279d
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // s3.AbstractC6419e, r3.k
    public /* bridge */ /* synthetic */ void c(long j10) {
        super.c(j10);
    }

    @Override // s3.AbstractC6419e, z2.InterfaceC7279d
    public void flush() {
        super.flush();
        this.f59149o = null;
        this.f59150p = null;
        this.f59152r = 0;
        this.f59148n = this.f59147m[0];
        H();
        this.f59151q = null;
    }

    @Override // s3.AbstractC6419e
    protected j h() {
        List list = this.f59149o;
        this.f59150p = list;
        return new C6420f((List) AbstractC6614a.e(list));
    }

    @Override // s3.AbstractC6419e
    protected void i(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(oVar.f65555d);
        this.f59142h.Z(byteBuffer.array(), byteBuffer.limit());
        while (this.f59142h.a() >= 3) {
            int iM = this.f59142h.M();
            int i10 = iM & 3;
            boolean z10 = (iM & 4) == 4;
            byte bM = (byte) this.f59142h.M();
            byte bM2 = (byte) this.f59142h.M();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        r();
                        int i11 = (bM & 192) >> 6;
                        int i12 = this.f59144j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            H();
                            AbstractC6635w.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f59144j + " current=" + i11);
                        }
                        this.f59144j = i11;
                        int i13 = bM & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0895c c0895c = new C0895c(i11, i13);
                        this.f59151q = c0895c;
                        byte[] bArr = c0895c.f59190c;
                        int i14 = c0895c.f59191d;
                        c0895c.f59191d = i14 + 1;
                        bArr[i14] = bM2;
                    } else {
                        AbstractC6614a.a(i10 == 2);
                        C0895c c0895c2 = this.f59151q;
                        if (c0895c2 == null) {
                            AbstractC6635w.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0895c2.f59190c;
                            int i15 = c0895c2.f59191d;
                            int i16 = i15 + 1;
                            c0895c2.f59191d = i16;
                            bArr2[i15] = bM;
                            c0895c2.f59191d = i15 + 2;
                            bArr2[i16] = bM2;
                        }
                    }
                    C0895c c0895c3 = this.f59151q;
                    if (c0895c3.f59191d == (c0895c3.f59189b * 2) - 1) {
                        r();
                    }
                }
            }
        }
    }

    @Override // s3.AbstractC6419e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ o g() {
        return super.g();
    }

    @Override // s3.AbstractC6419e
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ p b() {
        return super.b();
    }

    @Override // s3.AbstractC6419e
    protected boolean n() {
        return this.f59149o != this.f59150p;
    }

    @Override // s3.AbstractC6419e
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void e(o oVar) {
        super.e(oVar);
    }
}
