package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.adjust.sdk.Constants;
import java.text.AttributedCharacterIterator;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f35903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f35904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f35905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f35906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f35907g;

        static {
            int[] iArr = new int[d.values().length];
            f35907g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35907g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0602c.values().length];
            f35906f = iArr2;
            try {
                iArr2[EnumC0602c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35906f[EnumC0602c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35906f[EnumC0602c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35906f[EnumC0602c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f35905e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35905e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35905e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f35904d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35904d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35904d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35904d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f35903c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35903c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f35902b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35902b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35902b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35902b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f35901a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35901a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35901a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35901a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35903c[ordinal()];
            if (i10 == 1) {
                return "short";
            }
            if (i10 == 2) {
                return Constants.LONG;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum EnumC0602c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int b() {
            return a.f35906f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35906f[ordinal()];
            if (i10 == 1) {
                return "symbol";
            }
            if (i10 == 2) {
                return "narrowSymbol";
            }
            if (i10 == 3) {
                return "code";
            }
            if (i10 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35907g[ordinal()];
            if (i10 == 1) {
                return "accounting";
            }
            if (i10 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35902b[ordinal()];
            if (i10 == 1) {
                return "standard";
            }
            if (i10 == 2) {
                return "scientific";
            }
            if (i10 == 3) {
                return "engineering";
            }
            if (i10 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35904d[ordinal()];
            if (i10 == 1) {
                return "auto";
            }
            if (i10 == 2) {
                return "always";
            }
            if (i10 == 3) {
                return "never";
            }
            if (i10 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int b(e eVar, d dVar) throws o6.f {
            int i10 = a.f35901a[ordinal()];
            if (i10 == 2) {
                return 2;
            }
            if (i10 != 3) {
                return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == d.ACCOUNTING) {
                return 7;
            }
            if (dVar == d.STANDARD) {
                return 1;
            }
            throw new o6.f("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35901a[ordinal()];
            if (i10 == 1) {
                return "decimal";
            }
            if (i10 == 2) {
                return "percent";
            }
            if (i10 == 3) {
                return com.amazon.a.a.o.b.f34634a;
            }
            if (i10 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth b() {
            int i10 = a.f35905e[ordinal()];
            return i10 != 2 ? i10 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE : MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f35905e[ordinal()];
            if (i10 == 1) {
                return "short";
            }
            if (i10 == 2) {
                return "narrow";
            }
            if (i10 == 3) {
                return Constants.LONG;
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d10);

    String b(InterfaceC5833b interfaceC5833b);

    String c(double d10);

    c d(InterfaceC5833b interfaceC5833b, String str, h hVar, d dVar, e eVar, b bVar);

    c e(String str, EnumC0602c enumC0602c);

    c f(f fVar, int i10, int i11);

    c g(int i10);

    c h(boolean z10);

    c i(f fVar, int i10, int i11);

    c j(String str, i iVar);

    c k(g gVar);

    String l(AttributedCharacterIterator.Attribute attribute, double d10);
}
