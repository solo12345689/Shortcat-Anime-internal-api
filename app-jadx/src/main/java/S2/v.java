package S2;

import android.content.Context;
import android.view.Surface;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f15849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f15850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15852d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15855g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15858j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15863o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15853e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15854f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15856h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f15857i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f15859k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC6623j f15860l = InterfaceC6623j.f60596a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15864a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f15865b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f15864a = -9223372036854775807L;
            this.f15865b = -9223372036854775807L;
        }

        public long f() {
            return this.f15864a;
        }

        public long g() {
            return this.f15865b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        boolean B(long j10, long j11, long j12, boolean z10, boolean z11);

        boolean K(long j10, long j11, boolean z10);

        boolean z(long j10, long j11);
    }

    public v(Context context, b bVar, long j10) {
        this.f15849a = bVar;
        this.f15851c = j10;
        this.f15850b = new y(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f15859k));
        return this.f15852d ? j13 - (a0.V0(this.f15860l.c()) - j11) : j13;
    }

    private void f(int i10) {
        this.f15853e = Math.min(this.f15853e, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.f15857i
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r7.f15858j
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r7.f15853e
            if (r0 == 0) goto L54
            r4 = 1
            if (r0 == r4) goto L53
            r5 = 2
            if (r0 == r5) goto L4d
            r12 = 3
            if (r0 != r12) goto L47
            t2.j r12 = r7.f15860l
            long r12 = r12.c()
            long r12 = t2.a0.V0(r12)
            long r5 = r7.f15855g
            long r12 = r12 - r5
            boolean r0 = r7.f15852d
            if (r0 == 0) goto L46
            boolean r0 = r7.f15863o
            if (r0 != 0) goto L3d
            long r5 = r7.f15854f
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L46
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L46
        L3d:
            S2.v$b r8 = r7.f15849a
            boolean r8 = r8.z(r10, r12)
            if (r8 == 0) goto L46
            return r4
        L46:
            return r1
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L4d:
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 < 0) goto L52
            return r4
        L52:
            return r1
        L53:
            return r4
        L54:
            boolean r8 = r7.f15852d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.v.q(long, long, long):boolean");
    }

    public void a() {
        if (this.f15853e == 0) {
            this.f15853e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) {
        aVar.h();
        if (this.f15852d && this.f15854f == -9223372036854775807L) {
            this.f15854f = j11;
        }
        if (this.f15856h != j10) {
            this.f15850b.h(j10);
            this.f15856h = j10;
        }
        aVar.f15864a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f15861m) {
            this.f15862n = true;
            if (this.f15849a.B(aVar.f15864a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f15852d || aVar.f15864a >= HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) ? 5 : 3;
        }
        if (q(j11, aVar.f15864a, j13)) {
            return 0;
        }
        if (!this.f15852d || j11 == this.f15854f) {
            return 5;
        }
        long jB = this.f15860l.b();
        aVar.f15865b = this.f15850b.b((aVar.f15864a * 1000) + jB);
        aVar.f15864a = (aVar.f15865b - jB) / 1000;
        boolean z12 = (this.f15857i == -9223372036854775807L || this.f15858j) ? false : true;
        if (this.f15849a.B(aVar.f15864a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f15849a.K(aVar.f15864a, j12, z11) ? z12 ? 3 : 2 : aVar.f15864a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f15853e == 3 || (!this.f15861m && this.f15862n))) {
            this.f15857i = -9223372036854775807L;
            return true;
        }
        if (this.f15857i == -9223372036854775807L) {
            return false;
        }
        if (this.f15860l.c() < this.f15857i) {
            return true;
        }
        this.f15857i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f15858j = z10;
        this.f15857i = this.f15851c > 0 ? this.f15860l.c() + this.f15851c : -9223372036854775807L;
    }

    public boolean g() {
        boolean z10 = this.f15853e != 3;
        this.f15853e = 3;
        this.f15855g = a0.V0(this.f15860l.c());
        return z10;
    }

    public void h() {
        this.f15852d = true;
        this.f15855g = a0.V0(this.f15860l.c());
        this.f15850b.k();
    }

    public void i() {
        this.f15852d = false;
        this.f15857i = -9223372036854775807L;
        this.f15850b.l();
    }

    public void j(int i10) {
        if (i10 == 0) {
            this.f15853e = 1;
        } else if (i10 == 1) {
            this.f15853e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.f15850b.j();
        this.f15856h = -9223372036854775807L;
        this.f15854f = -9223372036854775807L;
        f(1);
        this.f15857i = -9223372036854775807L;
    }

    public void l(int i10) {
        this.f15850b.o(i10);
    }

    public void m(InterfaceC6623j interfaceC6623j) {
        this.f15860l = interfaceC6623j;
    }

    public void n(float f10) {
        this.f15850b.g(f10);
    }

    public void o(Surface surface) {
        this.f15861m = surface != null;
        this.f15862n = false;
        this.f15850b.m(surface);
        f(1);
    }

    public void p(float f10) {
        AbstractC6614a.a(f10 > 0.0f);
        if (f10 == this.f15859k) {
            return;
        }
        this.f15859k = f10;
        this.f15850b.i(f10);
    }
}
