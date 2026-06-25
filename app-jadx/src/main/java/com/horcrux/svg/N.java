package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f43619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f43620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static L f43621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static L f43622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static L f43623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static L f43624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f43625j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O f43626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    L f43627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f43628c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f43630b;

        static {
            int[] iArr = new int[EnumC3998g.values().length];
            f43630b = iArr;
            try {
                iArr[EnumC3998g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43630b[EnumC3998g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43630b[EnumC3998g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43630b[EnumC3998g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43630b[EnumC3998g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            f43629a = iArr2;
            try {
                iArr2[O.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43629a[O.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43629a[O.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private N(O o10, L l10, double d10) {
        this.f43626a = o10;
        this.f43627b = l10;
        this.f43628c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(S s10, L l10, L l11, L l12) {
        s10.f43653a = k(l11, l10);
        s10.f43654b = k(l12, l11);
        if (i(s10.f43653a)) {
            s10.f43653a = s10.f43654b;
        } else if (i(s10.f43654b)) {
            s10.f43654b = s10.f43653a;
        }
    }

    private static double c(O o10) {
        double dJ = j(f(f43623h));
        double dJ2 = j(f(f43624i));
        int i10 = a.f43629a[o10.ordinal()];
        if (i10 == 1) {
            return f43625j ? dJ2 + 180.0d : dJ2;
        }
        if (i10 == 2) {
            return a(dJ, dJ2);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static S d(H h10) {
        S s10 = new S();
        L[] lArr = h10.f43587b;
        int i10 = a.f43630b[h10.f43586a.ordinal()];
        if (i10 == 1) {
            s10.f43655c = lArr[2];
            s10.f43653a = k(lArr[0], f43621f);
            s10.f43654b = k(lArr[2], lArr[1]);
            if (i(s10.f43653a)) {
                b(s10, lArr[0], lArr[1], lArr[2]);
                return s10;
            }
            if (i(s10.f43654b)) {
                b(s10, f43621f, lArr[0], lArr[1]);
            }
        } else {
            if (i10 == 2) {
                L l10 = lArr[1];
                s10.f43655c = l10;
                b(s10, f43621f, lArr[0], l10);
                return s10;
            }
            if (i10 == 3 || i10 == 4) {
                L l11 = lArr[0];
                s10.f43655c = l11;
                s10.f43653a = k(l11, f43621f);
                s10.f43654b = k(s10.f43655c, f43621f);
                return s10;
            }
            if (i10 == 5) {
                L l12 = f43622g;
                s10.f43655c = l12;
                s10.f43653a = k(l12, f43621f);
                s10.f43654b = k(s10.f43655c, f43621f);
                return s10;
            }
        }
        return s10;
    }

    private static void e() {
        O o10 = O.kEndMarker;
        f43619d.add(new N(o10, f43621f, c(o10)));
    }

    private static double f(L l10) {
        return Math.atan2(l10.f43617b, l10.f43616a);
    }

    private static void g(H h10) {
        S sD = d(h10);
        f43624i = sD.f43653a;
        int i10 = f43620e;
        if (i10 > 0) {
            O o10 = i10 == 1 ? O.kStartMarker : O.kMidMarker;
            f43619d.add(new N(o10, f43621f, c(o10)));
        }
        f43623h = sD.f43654b;
        f43621f = sD.f43655c;
        EnumC3998g enumC3998g = h10.f43586a;
        if (enumC3998g == EnumC3998g.kCGPathElementMoveToPoint) {
            f43622g = h10.f43587b[0];
        } else if (enumC3998g == EnumC3998g.kCGPathElementCloseSubpath) {
            f43622g = new L(0.0d, 0.0d);
        }
        f43620e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f43619d = new ArrayList();
        f43620e = 0;
        f43621f = new L(0.0d, 0.0d);
        f43622g = new L(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((H) it.next());
        }
        e();
        return f43619d;
    }

    private static boolean i(L l10) {
        return l10.f43616a == 0.0d && l10.f43617b == 0.0d;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static L k(L l10, L l11) {
        return new L(l11.f43616a - l10.f43616a, l11.f43617b - l10.f43617b);
    }
}
