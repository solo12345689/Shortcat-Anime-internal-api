package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f43588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f43589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f43590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f43591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f43592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList f43593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f43594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f43595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f43596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f43597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f43598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f43599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f43600m;

    private static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f43594g * 2.0f) - f43596i;
        float f15 = (f43595h * 2.0f) - f43597j;
        f43596i = f10;
        f43597j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f43594g, f11 + f43595h);
    }

    private static void C(float f10, float f11) {
        u((f43594g * 2.0f) - f43596i, (f43595h * 2.0f) - f43597j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f43594g, f14 + f43595h);
    }

    private static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = f43594g;
        float f20 = f43595h;
        float fAbs = Math.abs(f11 == 0.0f ? f10 == 0.0f ? f14 - f20 : f10 : f11);
        float fAbs2 = Math.abs(f10 == 0.0f ? f13 - f19 : f10);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f13 == f19 && f14 == f20)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((fCos * f21) / 2.0f) + ((fSin * f22) / 2.0f);
        float f24 = -fSin;
        float f25 = ((f24 * f21) / 2.0f) + ((fCos * f22) / 2.0f);
        float f26 = fAbs2 * fAbs2;
        float f27 = f26 * fAbs * fAbs;
        float f28 = (f27 - ((f26 * f25) * f25)) - (((fAbs * fAbs) * f23) * f23);
        if (f28 < 0.0f) {
            float f29 = 1.0f - (f28 / f27);
            f15 = 0.0f;
            float fSqrt = (float) Math.sqrt(f29);
            fAbs2 *= fSqrt;
            f18 = fAbs * fSqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            f15 = 0.0f;
            float fSqrt2 = (float) Math.sqrt(f28 / (r16 + r18));
            if (z10 == z11) {
                fSqrt2 = -fSqrt2;
            }
            float f30 = (((-fSqrt2) * f25) * fAbs2) / fAbs;
            float f31 = ((fSqrt2 * f23) * fAbs) / fAbs2;
            f16 = (f22 / 2.0f) + (f30 * fSin) + (f31 * fCos);
            f17 = ((fCos * f30) - (fSin * f31)) + (f21 / 2.0f);
            f18 = fAbs;
        }
        float f32 = fCos / fAbs2;
        float f33 = fSin / fAbs2;
        float f34 = f24 / f18;
        float f35 = fCos / f18;
        float f36 = -f17;
        float f37 = -f16;
        float f38 = f17;
        float fAtan2 = (float) Math.atan2((f34 * f36) + (f35 * f37), (f36 * f32) + (f33 * f37));
        float f39 = f21 - f38;
        float f40 = f22 - f16;
        float fAtan22 = (float) Math.atan2((f34 * f39) + (f35 * f40), (f32 * f39) + (f33 * f40));
        float f41 = f38 + f19;
        float f42 = f16 + f20;
        float f43 = f21 + f19;
        float f44 = f22 + f20;
        w();
        f43596i = f43;
        f43594g = f43;
        f43597j = f44;
        f43595h = f44;
        if (fAbs2 != f18 || radians != f15) {
            c(f41, f42, fAbs2, f18, fAtan2, fAtan22, z11, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan22))) % 360.0f);
        if (!z10 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z11) {
            fAbs3 = -fAbs3;
        }
        float f45 = f43588a;
        f43592e.arcTo(new RectF((f41 - fAbs2) * f45, (f42 - fAbs2) * f45, (f41 + fAbs2) * f45, (f42 + fAbs2) * f45), degrees, fAbs3);
        f43593f.add(new H(EnumC3998g.kCGPathElementAddCurveToPoint, new L[]{new L(f43, f44)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(float r23, float r24, float r25, float r26, float r27, float r28, boolean r29, float r30) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.I.c(float, float, float, float, float, float, boolean, float):void");
    }

    private static void d() {
        if (f43600m) {
            f43594g = f43598k;
            f43595h = f43599l;
            f43600m = false;
            f43592e.close();
            f43593f.add(new H(EnumC3998g.kCGPathElementCloseSubpath, new L[]{new L(f43594g, f43595h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f43594g = f14;
        f43595h = f15;
        Path path = f43592e;
        float f16 = f43588a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f43593f.add(new H(EnumC3998g.kCGPathElementAddCurveToPoint, new L[]{new L(f10, f11), new L(f12, f13), new L(f14, f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f43594g;
        float f17 = f43595h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f43596i = f12;
        f43597j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f43594g, f11 + f43595h);
    }

    private static void l(float f10, float f11) {
        w();
        f43594g = f10;
        f43596i = f10;
        f43595h = f11;
        f43597j = f11;
        Path path = f43592e;
        float f12 = f43588a;
        path.lineTo(f10 * f12, f12 * f11);
        f43593f.add(new H(EnumC3998g.kCGPathElementAddLineToPoint, new L[]{new L(f10, f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f43594g, f11 + f43595h);
    }

    private static void n(float f10, float f11) {
        f43594g = f10;
        f43596i = f10;
        f43598k = f10;
        f43595h = f11;
        f43597j = f11;
        f43599l = f11;
        Path path = f43592e;
        float f12 = f43588a;
        path.moveTo(f10 * f12, f12 * f11);
        f43593f.add(new H(EnumC3998g.kCGPathElementMoveToPoint, new L[]{new L(f10, f11)}));
    }

    static Path o(String str) {
        f43593f = new ArrayList();
        Path path = new Path();
        f43592e = path;
        if (str == null) {
            return path;
        }
        f43590c = str.length();
        f43591d = str;
        f43589b = 0;
        f43594g = 0.0f;
        f43595h = 0.0f;
        f43596i = 0.0f;
        f43597j = 0.0f;
        f43598k = 0.0f;
        f43599l = 0.0f;
        f43600m = false;
        char c10 = ' ';
        while (f43589b < f43590c) {
            y();
            int i10 = f43589b;
            if (i10 >= f43590c) {
                return f43592e;
            }
            boolean z10 = true;
            boolean z11 = c10 != ' ';
            char cCharAt = f43591d.charAt(i10);
            if (!z11 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f43589b), f43591d));
            }
            if (i(cCharAt)) {
                f43589b++;
                z10 = false;
                c10 = cCharAt;
            } else {
                if (!j(cCharAt) || !z11) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f43589b), f43591d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f43591d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? 'L' : 'l';
                } else {
                    z10 = false;
                }
            }
            boolean zH = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f43595h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f43594g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), 0.0f);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(0.0f, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f43591d));
            }
            if (z10) {
                c10 = zH ? 'M' : 'm';
            }
        }
        return f43592e;
    }

    private static boolean p() {
        y();
        char cCharAt = f43591d.charAt(f43589b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f43589b), f43591d));
        }
        int i10 = f43589b + 1;
        f43589b = i10;
        if (i10 < f43590c && f43591d.charAt(i10) == ',') {
            f43589b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f43589b == f43590c) {
            throw new Error(String.format("Unexpected end (s=%s)", f43591d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i10 = f43589b;
        if (i10 >= f43590c || f43591d.charAt(i10) != ',') {
            return;
        }
        f43589b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i10 = f43589b;
        if (i10 == f43590c) {
            throw new Error(String.format("Unexpected end (s=%s)", f43591d));
        }
        char cCharAt2 = f43591d.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f43589b + 1;
            f43589b = i11;
            cCharAt2 = f43591d.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i12 = f43589b;
            if (i12 < f43590c) {
                cCharAt2 = f43591d.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f43589b), f43591d));
        }
        if (cCharAt2 == '.') {
            f43589b++;
            x();
            int i13 = f43589b;
            if (i13 < f43590c) {
                cCharAt2 = f43591d.charAt(i13);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i14 = f43589b;
            if (i14 + 1 < f43590c && (cCharAt = f43591d.charAt(i14 + 1)) != 'm' && cCharAt != 'x') {
                int i15 = f43589b + 1;
                f43589b = i15;
                char cCharAt3 = f43591d.charAt(i15);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f43589b++;
                    x();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f43589b), f43591d));
                    }
                    x();
                }
            }
        }
        String strSubstring = f43591d.substring(i10, f43589b);
        float f10 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f43589b), f43591d));
        }
        return f10;
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f43594g;
        float f15 = f43595h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f43596i = f10;
        f43597j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f43594g + f14) / 3.0f, (f43595h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        return Math.round(d10 * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void w() {
        if (f43600m) {
            return;
        }
        f43598k = f43594g;
        f43599l = f43595h;
        f43600m = true;
    }

    private static void x() {
        while (true) {
            int i10 = f43589b;
            if (i10 >= f43590c || !Character.isDigit(f43591d.charAt(i10))) {
                return;
            } else {
                f43589b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f43589b;
            if (i10 >= f43590c || !Character.isWhitespace(f43591d.charAt(i10))) {
                return;
            } else {
                f43589b++;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f43594g;
        float f15 = f43595h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
