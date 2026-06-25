package z3;

import P9.AbstractC2011u;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.amazon.a.a.o.b.f;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import r3.d;
import r3.r;
import s2.C6403a;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: renamed from: z3.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7280a implements r {

    /* JADX INFO: renamed from: a */
    private final C6609I f65581a = new C6609I();

    /* JADX INFO: renamed from: b */
    private final C6609I f65582b = new C6609I();

    /* JADX INFO: renamed from: c */
    private final b f65583c;

    /* JADX INFO: renamed from: d */
    private Inflater f65584d;

    /* JADX INFO: renamed from: z3.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: b */
        private boolean f65586b;

        /* JADX INFO: renamed from: c */
        private boolean f65587c;

        /* JADX INFO: renamed from: d */
        private int[] f65588d;

        /* JADX INFO: renamed from: e */
        private int f65589e;

        /* JADX INFO: renamed from: f */
        private int f65590f;

        /* JADX INFO: renamed from: g */
        private Rect f65591g;

        /* JADX INFO: renamed from: a */
        private final int[] f65585a = new int[4];

        /* JADX INFO: renamed from: h */
        private int f65592h = -1;

        /* JADX INFO: renamed from: i */
        private int f65593i = -1;

        /* JADX INFO: renamed from: z3.a$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0993a {

            /* JADX INFO: renamed from: a */
            public int f65594a;

            /* JADX INFO: renamed from: b */
            public int f65595b;

            private C0993a() {
            }

            /* synthetic */ C0993a(C0992a c0992a) {
                this();
            }
        }

        private static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, C6609I c6609i, int i10) {
            while (c6609i.g() < i10 && c6609i.a() > 0) {
                switch (c6609i.M()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!g(iArr, c6609i)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!e(c6609i)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!f(c6609i)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!h(c6609i)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean e(C6609I c6609i) {
            if (c6609i.a() < 2 || !this.f65587c) {
                return false;
            }
            int iM = c6609i.M();
            int iM2 = c6609i.M();
            int[] iArr = this.f65585a;
            iArr[3] = n(iArr[3], iM >> 4);
            int[] iArr2 = this.f65585a;
            iArr2[2] = n(iArr2[2], iM & 15);
            int[] iArr3 = this.f65585a;
            iArr3[1] = n(iArr3[1], iM2 >> 4);
            int[] iArr4 = this.f65585a;
            iArr4[0] = n(iArr4[0], iM2 & 15);
            return true;
        }

        private boolean f(C6609I c6609i) {
            if (c6609i.a() < 6) {
                return false;
            }
            int iM = c6609i.M();
            int iM2 = c6609i.M();
            int i10 = (iM << 4) | (iM2 >> 4);
            int iM3 = ((iM2 & 15) << 8) | c6609i.M();
            int iM4 = c6609i.M();
            int iM5 = c6609i.M();
            this.f65591g = new Rect(i10, (iM4 << 4) | (iM5 >> 4), iM3 + 1, (c6609i.M() | ((iM5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, C6609I c6609i) {
            if (c6609i.a() < 2) {
                return false;
            }
            int iM = c6609i.M();
            int iM2 = c6609i.M();
            this.f65585a[3] = b(iArr, iM >> 4);
            this.f65585a[2] = b(iArr, iM & 15);
            this.f65585a[1] = b(iArr, iM2 >> 4);
            this.f65585a[0] = b(iArr, iM2 & 15);
            this.f65587c = true;
            return true;
        }

        private boolean h(C6609I c6609i) {
            if (c6609i.a() < 4) {
                return false;
            }
            this.f65592h = c6609i.U();
            this.f65593i = c6609i.U();
            return true;
        }

        private void j(C6608H c6608h, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C0993a c0993a = new C0993a();
            while (true) {
                int i12 = 0;
                do {
                    k(c6608h, iWidth, c0993a);
                    int iMin = Math.min(c0993a.f65595b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f65585a[c0993a.f65594a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                c6608h.c();
            }
        }

        private static void k(C6608H c6608h, int i10, C0993a c0993a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (c6608h.b() < 4) {
                    c0993a.f65594a = -1;
                    c0993a.f65595b = 0;
                    return;
                }
                iH = (iH << 4) | c6608h.h(4);
            }
            c0993a.f65594a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c0993a.f65595b = i10;
        }

        private static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public C6403a a(C6609I c6609i) {
            Rect rect;
            if (this.f65588d == null || !this.f65586b || !this.f65587c || (rect = this.f65591g) == null || this.f65592h == -1 || this.f65593i == -1 || rect.width() < 2 || this.f65591g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f65591g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            C6608H c6608h = new C6608H();
            c6609i.b0(this.f65592h);
            c6608h.m(c6609i);
            j(c6608h, true, rect2, iArr);
            c6609i.b0(this.f65593i);
            c6608h.m(c6609i);
            j(c6608h, false, rect2, iArr);
            return new C6403a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f65589e).l(0).h(rect2.top / this.f65590f, 0).i(0).n(rect2.width() / this.f65589e).g(rect2.height() / this.f65590f).a();
        }

        public void i(String str) {
            for (String str2 : a0.v1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrV1 = a0.v1(str2.substring(9), f.f34694a);
                    this.f65588d = new int[strArrV1.length];
                    for (int i10 = 0; i10 < strArrV1.length; i10++) {
                        this.f65588d[i10] = c(strArrV1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrV12 = a0.v1(str2.substring(6).trim(), "x");
                    if (strArrV12.length == 2) {
                        try {
                            this.f65589e = Integer.parseInt(strArrV12[0]);
                            this.f65590f = Integer.parseInt(strArrV12[1]);
                            this.f65586b = true;
                        } catch (RuntimeException e10) {
                            AbstractC6635w.j("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public void l(C6609I c6609i) {
            int[] iArr = this.f65588d;
            if (iArr == null || !this.f65586b) {
                return;
            }
            c6609i.c0(c6609i.U() - 2);
            d(iArr, c6609i, c6609i.U());
        }

        public void m() {
            this.f65587c = false;
            this.f65591g = null;
            this.f65592h = -1;
            this.f65593i = -1;
        }
    }

    public C7280a(List list) {
        b bVar = new b();
        this.f65583c = bVar;
        bVar.i(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    private C6403a d() {
        if (this.f65584d == null) {
            this.f65584d = new Inflater();
        }
        if (a0.S0(this.f65581a, this.f65582b, this.f65584d)) {
            this.f65581a.Z(this.f65582b.f(), this.f65582b.j());
        }
        this.f65583c.m();
        int iA = this.f65581a.a();
        if (iA < 2 || this.f65581a.U() != iA) {
            return null;
        }
        this.f65583c.l(this.f65581a);
        return this.f65583c.a(this.f65581a);
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        this.f65581a.Z(bArr, i11 + i10);
        this.f65581a.b0(i10);
        C6403a c6403aD = d();
        interfaceC6627n.accept(new d(c6403aD != null ? AbstractC2011u.B(c6403aD) : AbstractC2011u.A(), -9223372036854775807L, 5000000L));
    }

    @Override // r3.r
    public int c() {
        return 2;
    }
}
