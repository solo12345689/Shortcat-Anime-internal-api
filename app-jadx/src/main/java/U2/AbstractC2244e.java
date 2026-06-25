package U2;

import U2.J;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: U2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2244e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f19009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f19010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f19011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19012d;

    /* JADX INFO: renamed from: U2.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f19013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f19016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f19017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f19018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f19019g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f19013a = dVar;
            this.f19014b = j10;
            this.f19015c = j11;
            this.f19016d = j12;
            this.f19017e = j13;
            this.f19018f = j14;
            this.f19019g = j15;
        }

        @Override // U2.J
        public J.a g(long j10) {
            return new J.a(new K(j10, c.h(this.f19013a.a(j10), this.f19015c, this.f19016d, this.f19017e, this.f19018f, this.f19019g)));
        }

        public long i(long j10) {
            return this.f19013a.a(j10);
        }

        @Override // U2.J
        public boolean k() {
            return true;
        }

        @Override // U2.J
        public long n() {
            return this.f19014b;
        }
    }

    /* JADX INFO: renamed from: U2.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f19020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f19023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f19024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f19025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f19026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f19027h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f19020a = j10;
            this.f19021b = j11;
            this.f19023d = j12;
            this.f19024e = j13;
            this.f19025f = j14;
            this.f19026g = j15;
            this.f19022c = j16;
            this.f19027h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return a0.s(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f19026g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f19025f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f19027h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f19020a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f19021b;
        }

        private void n() {
            this.f19027h = h(this.f19021b, this.f19023d, this.f19024e, this.f19025f, this.f19026g, this.f19022c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f19024e = j10;
            this.f19026g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f19023d = j10;
            this.f19025f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: U2.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: U2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0323e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0323e f19028d = new C0323e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19031c;

        private C0323e(int i10, long j10, long j11) {
            this.f19029a = i10;
            this.f19030b = j10;
            this.f19031c = j11;
        }

        public static C0323e d(long j10, long j11) {
            return new C0323e(-1, j10, j11);
        }

        public static C0323e e(long j10) {
            return new C0323e(0, -9223372036854775807L, j10);
        }

        public static C0323e f(long j10, long j11) {
            return new C0323e(-2, j10, j11);
        }
    }

    protected AbstractC2244e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f19010b = fVar;
        this.f19012d = i10;
        this.f19009a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f19009a.i(j10), this.f19009a.f19015c, this.f19009a.f19016d, this.f19009a.f19017e, this.f19009a.f19018f, this.f19009a.f19019g);
    }

    public final J b() {
        return this.f19009a;
    }

    public int c(InterfaceC2256q interfaceC2256q, I i10) {
        while (true) {
            c cVar = (c) AbstractC6614a.i(this.f19011c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f19012d) {
                e(false, j10);
                return g(interfaceC2256q, j10, i10);
            }
            if (!i(interfaceC2256q, jK)) {
                return g(interfaceC2256q, jK, i10);
            }
            interfaceC2256q.g();
            C0323e c0323eA = this.f19010b.a(interfaceC2256q, cVar.m());
            int i11 = c0323eA.f19029a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC2256q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c0323eA.f19030b, c0323eA.f19031c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC2256q, c0323eA.f19031c);
                    e(true, c0323eA.f19031c);
                    return g(interfaceC2256q, c0323eA.f19031c, i10);
                }
                cVar.o(c0323eA.f19030b, c0323eA.f19031c);
            }
        }
    }

    public final boolean d() {
        return this.f19011c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f19011c = null;
        this.f19010b.b();
        f(z10, j10);
    }

    protected final int g(InterfaceC2256q interfaceC2256q, long j10, I i10) {
        if (j10 == interfaceC2256q.getPosition()) {
            return 0;
        }
        i10.f18917a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f19011c;
        if (cVar == null || cVar.l() != j10) {
            this.f19011c = a(j10);
        }
    }

    protected final boolean i(InterfaceC2256q interfaceC2256q, long j10) {
        long position = j10 - interfaceC2256q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC2256q.m((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: U2.e$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        C0323e a(InterfaceC2256q interfaceC2256q, long j10);

        default void b() {
        }
    }

    /* JADX INFO: renamed from: U2.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements d {
        @Override // U2.AbstractC2244e.d
        public long a(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
