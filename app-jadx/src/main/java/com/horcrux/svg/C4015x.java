package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: renamed from: com.horcrux.svg.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4015x {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C4015x f43906p = new C4015x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f43907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f43908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b0 f43909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f43910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d0 f43911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f43913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f43914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final c0 f43915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final e0 f43916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f43917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f43918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f43919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f43920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f43921o;

    /* JADX INFO: renamed from: com.horcrux.svg.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d0[] f43922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f43923b;

        static {
            d0 d0Var = d0.w100;
            d0 d0Var2 = d0.w200;
            d0 d0Var3 = d0.w300;
            d0 d0Var4 = d0.Normal;
            d0 d0Var5 = d0.w500;
            d0 d0Var6 = d0.w600;
            d0 d0Var7 = d0.Bold;
            d0 d0Var8 = d0.w800;
            d0 d0Var9 = d0.w900;
            f43922a = new d0[]{d0Var, d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var9};
            f43923b = new int[]{400, ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD, 100, 200, 300, 400, 500, 600, ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD, 800, 900};
        }

        private static int a(int i10) {
            if (i10 < 350) {
                return 400;
            }
            if (i10 < 550) {
                return ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD;
            }
            if (i10 < 900) {
                return 900;
            }
            return i10;
        }

        static int b(d0 d0Var, C4015x c4015x) {
            return d0Var == d0.Bolder ? a(c4015x.f43912f) : d0Var == d0.Lighter ? c(c4015x.f43912f) : f43923b[d0Var.ordinal()];
        }

        private static int c(int i10) {
            if (i10 < 100) {
                return i10;
            }
            if (i10 < 550) {
                return 100;
            }
            if (i10 < 750) {
                return 400;
            }
            return ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD;
        }

        static d0 d(int i10) {
            return f43922a[Math.round(i10 / 100.0f)];
        }
    }

    private C4015x() {
        this.f43910d = null;
        this.f43908b = "";
        this.f43909c = b0.normal;
        this.f43911e = d0.Normal;
        this.f43912f = 400;
        this.f43913g = "";
        this.f43914h = "";
        this.f43915i = c0.normal;
        this.f43916j = e0.start;
        this.f43917k = f0.None;
        this.f43921o = false;
        this.f43918l = 0.0d;
        this.f43907a = 12.0d;
        this.f43919m = 0.0d;
        this.f43920n = 0.0d;
    }

    private void a(C4015x c4015x, double d10) {
        long jRound = Math.round(d10);
        if (jRound < 1 || jRound > 1000) {
            b(c4015x);
            return;
        }
        int i10 = (int) jRound;
        this.f43912f = i10;
        this.f43911e = a.d(i10);
    }

    private void b(C4015x c4015x) {
        this.f43912f = c4015x.f43912f;
        this.f43911e = c4015x.f43911e;
    }

    private double c(ReadableMap readableMap, String str, double d10, double d11, double d12) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) * d10 : M.b(readableMap.getString(str), d12, d10, d11);
    }

    C4015x(ReadableMap readableMap, C4015x c4015x, double d10) {
        String string;
        String string2;
        c0 c0VarValueOf;
        e0 e0VarValueOf;
        f0 f0VarB;
        double dC;
        double dC2;
        double d11 = c4015x.f43907a;
        if (readableMap.hasKey("fontSize")) {
            this.f43907a = c(readableMap, "fontSize", 1.0d, d11, d11);
        } else {
            this.f43907a = d11;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                a(c4015x, readableMap.getDouble("fontWeight"));
            } else {
                String string3 = readableMap.getString("fontWeight");
                if (d0.c(string3)) {
                    int iB = a.b(d0.b(string3), c4015x);
                    this.f43912f = iB;
                    this.f43911e = a.d(iB);
                } else if (string3 != null) {
                    a(c4015x, Double.parseDouble(string3));
                } else {
                    b(c4015x);
                }
            }
        } else {
            b(c4015x);
        }
        this.f43910d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c4015x.f43910d;
        this.f43908b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c4015x.f43908b;
        this.f43909c = readableMap.hasKey("fontStyle") ? b0.valueOf(readableMap.getString("fontStyle")) : c4015x.f43909c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = c4015x.f43913g;
        }
        this.f43913g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = c4015x.f43914h;
        }
        this.f43914h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            c0VarValueOf = c0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            c0VarValueOf = c4015x.f43915i;
        }
        this.f43915i = c0VarValueOf;
        if (readableMap.hasKey("textAnchor")) {
            e0VarValueOf = e0.valueOf(readableMap.getString("textAnchor"));
        } else {
            e0VarValueOf = c4015x.f43916j;
        }
        this.f43916j = e0VarValueOf;
        if (readableMap.hasKey("textDecoration")) {
            f0VarB = f0.b(readableMap.getString("textDecoration"));
        } else {
            f0VarB = c4015x.f43917k;
        }
        this.f43917k = f0VarB;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f43921o = zHasKey || c4015x.f43921o;
        this.f43918l = zHasKey ? c(readableMap, "kerning", d10, this.f43907a, 0.0d) : c4015x.f43918l;
        if (readableMap.hasKey("wordSpacing")) {
            dC = c(readableMap, "wordSpacing", d10, this.f43907a, 0.0d);
        } else {
            dC = c4015x.f43919m;
        }
        this.f43919m = dC;
        if (readableMap.hasKey("letterSpacing")) {
            dC2 = c(readableMap, "letterSpacing", d10, this.f43907a, 0.0d);
        } else {
            dC2 = c4015x.f43920n;
        }
        this.f43920n = dC2;
    }
}
