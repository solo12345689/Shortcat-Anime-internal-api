package com.facebook.hermes.intl;

import com.adjust.sdk.Constants;
import java.text.AttributedCharacterIterator;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f35824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f35825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f35826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f35827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f35828g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f35829h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f35830i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f35831j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f35832k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f35833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f35834m;

        static {
            int[] iArr = new int[k.values().length];
            f35834m = iArr;
            try {
                iArr[k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35834m[k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35834m[k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35834m[k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35834m[k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0601b.values().length];
            f35833l = iArr2;
            try {
                iArr2[EnumC0601b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35833l[EnumC0601b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35833l[EnumC0601b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35833l[EnumC0601b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35833l[EnumC0601b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[l.values().length];
            f35832k = iArr3;
            try {
                iArr3[l.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35832k[l.LONGOFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35832k[l.LONGGENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35832k[l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35832k[l.SHORTOFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35832k[l.SHORTGENERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35832k[l.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[j.values().length];
            f35831j = iArr4;
            try {
                iArr4[j.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35831j[j.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35831j[j.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[h.values().length];
            f35830i = iArr5;
            try {
                iArr5[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35830i[h.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35830i[h.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[f.values().length];
            f35829h = iArr6;
            try {
                iArr6[f.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35829h[f.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35829h[f.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr7 = new int[c.values().length];
            f35828g = iArr7;
            try {
                iArr7[c.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35828g[c.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35828g[c.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr8 = new int[i.values().length];
            f35827f = iArr8;
            try {
                iArr8[i.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35827f[i.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35827f[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35827f[i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35827f[i.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35827f[i.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[n.values().length];
            f35826e = iArr9;
            try {
                iArr9[n.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f35826e[n.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f35826e[n.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr10 = new int[d.values().length];
            f35825d = iArr10;
            try {
                iArr10[d.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f35825d[d.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f35825d[d.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f35825d[d.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr11 = new int[m.values().length];
            f35824c = iArr11;
            try {
                iArr11[m.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f35824c[m.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f35824c[m.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f35824c[m.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr12 = new int[g.values().length];
            f35823b = iArr12;
            try {
                iArr12[g.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f35823b[g.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f35823b[g.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f35823b[g.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f35823b[g.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr13 = new int[e.values().length];
            f35822a = iArr13;
            try {
                iArr13[e.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f35822a[e.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0601b {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35833l[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return Constants.LONG;
            }
            if (i10 == 3) {
                return Constants.MEDIUM;
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String b() {
            int i10 = a.f35828g[ordinal()];
            if (i10 == 1) {
                return "d";
            }
            if (i10 == 2) {
                return "dd";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35828g[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String b() {
            int i10 = a.f35825d[ordinal()];
            if (i10 == 1) {
                return "GGGG";
            }
            if (i10 == 2) {
                return "GGG";
            }
            if (i10 == 3) {
                return "G5";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35825d[ordinal()];
            if (i10 == 1) {
                return Constants.LONG;
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum e {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35822a[ordinal()];
            if (i10 == 1) {
                return "best fit";
            }
            if (i10 == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum f {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String b() {
            int i10 = a.f35829h[ordinal()];
            if (i10 == 1) {
                return "h";
            }
            if (i10 == 2) {
                return "hh";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        public String c() {
            int i10 = a.f35829h[ordinal()];
            if (i10 == 1) {
                return "k";
            }
            if (i10 == 2) {
                return "kk";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35829h[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum g {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35823b[ordinal()];
            if (i10 == 1) {
                return "h11";
            }
            if (i10 == 2) {
                return "h12";
            }
            if (i10 == 3) {
                return "h23";
            }
            if (i10 == 4) {
                return "h24";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum h {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String b() {
            int i10 = a.f35830i[ordinal()];
            if (i10 == 1) {
                return "m";
            }
            if (i10 == 2) {
                return "mm";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35830i[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum i {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String b() {
            switch (a.f35827f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f35827f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return Constants.LONG;
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum j {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String b() {
            int i10 = a.f35831j[ordinal()];
            if (i10 == 1) {
                return "s";
            }
            if (i10 == 2) {
                return "ss";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35831j[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum k {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35834m[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return Constants.LONG;
            }
            if (i10 == 3) {
                return Constants.MEDIUM;
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum l {
        LONG,
        LONGOFFSET,
        LONGGENERIC,
        SHORT,
        SHORTOFFSET,
        SHORTGENERIC,
        UNDEFINED;

        public String b() {
            switch (a.f35832k[ordinal()]) {
                case 1:
                    return "zzzz";
                case 2:
                    return "OOOO";
                case 3:
                    return "vvvv";
                case 4:
                    return "z";
                case 5:
                    return "O";
                case 6:
                    return "v";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f35832k[ordinal()]) {
                case 1:
                    return Constants.LONG;
                case 2:
                    return "longOffset";
                case 3:
                    return "longGeneric";
                case 4:
                    return "short";
                case 5:
                    return "shortOffset";
                case 6:
                    return "shortGeneric";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum m {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String b() {
            int i10 = a.f35824c[ordinal()];
            if (i10 == 1) {
                return "EEEE";
            }
            if (i10 == 2) {
                return "EEE";
            }
            if (i10 == 3) {
                return "EEEEE";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35824c[ordinal()];
            if (i10 == 1) {
                return Constants.LONG;
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum n {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String b() {
            int i10 = a.f35826e[ordinal()];
            if (i10 == 1) {
                return "yyyy";
            }
            if (i10 == 2) {
                return "yy";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35826e[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d10);

    String b(InterfaceC5833b interfaceC5833b);

    String c(double d10);

    void d(InterfaceC5833b interfaceC5833b, String str, String str2, e eVar, m mVar, d dVar, n nVar, i iVar, c cVar, f fVar, h hVar, j jVar, l lVar, g gVar, Object obj, EnumC0601b enumC0601b, k kVar, Object obj2);

    String e(AttributedCharacterIterator.Attribute attribute, String str);

    g f(InterfaceC5833b interfaceC5833b);

    String g(InterfaceC5833b interfaceC5833b);

    String h(InterfaceC5833b interfaceC5833b);
}
