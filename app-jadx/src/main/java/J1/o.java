package J1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f9234a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f9235b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f9236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f9237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f9238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f9239f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f9240b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f9241a;

        private a(boolean z10) {
            this.f9241a = z10;
        }

        @Override // J1.o.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = o.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f9241a) {
                        return 1;
                    }
                } else if (this.f9241a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f9241a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f9242a = new b();

        private b() {
        }

        @Override // J1.o.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = o.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f9243a;

        d(c cVar) {
            this.f9243a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f9243a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // J1.n
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f9243a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9244b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f9244b = z10;
        }

        @Override // J1.o.d
        protected boolean a() {
            return this.f9244b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f9245b = new f();

        f() {
            super(null);
        }

        @Override // J1.o.d
        protected boolean a() {
            return p.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f9242a;
        f9236c = new e(bVar, false);
        f9237d = new e(bVar, true);
        f9238e = new e(a.f9240b, false);
        f9239f = f.f9245b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
