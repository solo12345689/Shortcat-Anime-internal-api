package com.facebook.hermes.intl;

import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class C0600a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f35807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f35808c;

        static {
            int[] iArr = new int[b.values().length];
            f35808c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35808c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35808c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f35807b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35807b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f35806a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35806a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35806a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35806a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35806a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0600a.f35808c[ordinal()];
            if (i10 == 1) {
                return "upper";
            }
            if (i10 == 2) {
                return "lower";
            }
            if (i10 == 3) {
                return com.amazon.a.a.o.b.f34641ag;
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0600a.f35806a[ordinal()];
            if (i10 == 1) {
                return "base";
            }
            if (i10 == 2) {
                return "accent";
            }
            if (i10 == 3) {
                return "case";
            }
            if (i10 == 4) {
                return "variant";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0600a.f35807b[ordinal()];
            if (i10 == 1) {
                return "sort";
            }
            if (i10 == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    int a(String str, String str2);

    c b();

    a c(boolean z10);

    a d(b bVar);

    a e(InterfaceC5833b interfaceC5833b);

    a f(boolean z10);

    a g(c cVar);
}
