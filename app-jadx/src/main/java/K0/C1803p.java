package K0;

/* JADX INFO: renamed from: K0.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803p {

    /* JADX INFO: renamed from: a */
    private final C1801n f10793a;

    /* JADX INFO: renamed from: b */
    private final C1801n f10794b;

    /* JADX INFO: renamed from: c */
    private final C1801n f10795c;

    /* JADX INFO: renamed from: K0.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10796a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.f10391a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.f10392b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B.f10393c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[B.f10394d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10796a = iArr;
        }
    }

    public C1803p(boolean z10) {
        this.f10793a = new C1801n(z10);
        this.f10794b = new C1801n(z10);
        this.f10795c = new C1801n(z10);
    }

    public final void d(J j10, B b10) {
        int i10 = a.f10796a[b10.ordinal()];
        if (i10 == 1) {
            this.f10793a.a(j10);
            this.f10795c.a(j10);
            return;
        }
        if (i10 == 2) {
            this.f10794b.a(j10);
            this.f10795c.a(j10);
            return;
        }
        if (i10 == 3) {
            if (j10.j0() != null) {
                this.f10795c.a(j10);
                return;
            } else {
                this.f10793a.a(j10);
                return;
            }
        }
        if (i10 != 4) {
            throw new Td.r();
        }
        if (j10.j0() != null) {
            this.f10795c.a(j10);
        } else {
            this.f10794b.a(j10);
        }
    }

    public final boolean e(J j10) {
        return this.f10793a.b(j10) || this.f10794b.b(j10) || this.f10795c.b(j10);
    }

    public final boolean f(J j10, boolean z10) {
        boolean z11 = j10.j0() == null;
        boolean z12 = this.f10793a.b(j10) || this.f10794b.b(j10);
        return z10 ? !z11 && z12 : (z11 && z12) || this.f10795c.b(j10);
    }

    public final boolean g() {
        return (this.f10795c.c() || this.f10793a.c()) ? false : true;
    }

    public final boolean h() {
        return this.f10793a.c() && this.f10795c.c() && this.f10794b.c();
    }

    public final boolean i() {
        return !h();
    }

    public final boolean j(J j10) {
        return this.f10795c.e(j10) || this.f10793a.e(j10) || this.f10794b.e(j10);
    }
}
