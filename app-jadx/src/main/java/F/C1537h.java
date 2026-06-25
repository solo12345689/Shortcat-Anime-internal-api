package F;

import a0.C2507c;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1537h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6045b = C2507c.f23495d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f6046a = new C2507c(new a[16], 0);

    /* JADX INFO: renamed from: F.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6048b;

        public a(int i10, int i11) {
            this.f6047a = i10;
            this.f6048b = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int a() {
            return this.f6048b;
        }

        public final int b() {
            return this.f6047a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6047a == aVar.f6047a && this.f6048b == aVar.f6048b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f6047a) * 31) + Integer.hashCode(this.f6048b);
        }

        public String toString() {
            return "Interval(start=" + this.f6047a + ", end=" + this.f6048b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f6046a.c(aVar);
        return aVar;
    }

    public final int b() {
        int iA = ((a) this.f6046a.n()).a();
        C2507c c2507c = this.f6046a;
        int iP = c2507c.p();
        if (iP > 0) {
            Object[] objArrO = c2507c.o();
            int i10 = 0;
            do {
                a aVar = (a) objArrO[i10];
                if (aVar.a() > iA) {
                    iA = aVar.a();
                }
                i10++;
            } while (i10 < iP);
        }
        return iA;
    }

    public final int c() {
        int iB = ((a) this.f6046a.n()).b();
        C2507c c2507c = this.f6046a;
        int iP = c2507c.p();
        if (iP > 0) {
            Object[] objArrO = c2507c.o();
            int i10 = 0;
            do {
                a aVar = (a) objArrO[i10];
                if (aVar.b() < iB) {
                    iB = aVar.b();
                }
                i10++;
            } while (i10 < iP);
        }
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f6046a.t();
    }

    public final void e(a aVar) {
        this.f6046a.w(aVar);
    }
}
