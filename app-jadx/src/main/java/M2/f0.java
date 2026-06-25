package M2;

import android.net.Uri;
import q2.C6071C;
import q2.Y;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q2.Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f11918r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final C6071C f11919s = new C6071C.c().d("SinglePeriodTimeline").j(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f11922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f11923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f11924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f11925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f11926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f11927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f11929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f11930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C6071C f11931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C6071C.g f11932q;

    public f0(long j10, boolean z10, boolean z11, boolean z12, Object obj, C6071C c6071c) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, c6071c);
    }

    @Override // q2.Y
    public int f(Object obj) {
        return f11918r.equals(obj) ? 0 : -1;
    }

    @Override // q2.Y
    public Y.b k(int i10, Y.b bVar, boolean z10) {
        AbstractC6614a.c(i10, 0, 1);
        return bVar.t(null, z10 ? f11918r : null, 0, this.f11923h, -this.f11925j);
    }

    @Override // q2.Y
    public int m() {
        return 1;
    }

    @Override // q2.Y
    public Object q(int i10) {
        AbstractC6614a.c(i10, 0, 1);
        return f11918r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // q2.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q2.Y.d s(int r25, q2.Y.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            t2.AbstractC6614a.c(r3, r1, r2)
            long r1 = r0.f11926k
            boolean r14 = r0.f11928m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f11929n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f11924i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = q2.Y.d.f56668q
            q2.C r5 = r0.f11931p
            java.lang.Object r6 = r0.f11930o
            long r7 = r0.f11920e
            long r9 = r0.f11921f
            long r11 = r0.f11922g
            boolean r13 = r0.f11927l
            q2.C$g r15 = r0.f11932q
            long r1 = r0.f11924i
            r21 = 0
            r18 = r1
            long r1 = r0.f11925j
            r20 = 0
            r3 = r26
            r22 = r1
            q2.Y$d r1 = r3.h(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.f0.s(int, q2.Y$d, long):q2.Y$d");
    }

    @Override // q2.Y
    public int t() {
        return 1;
    }

    public f0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, C6071C c6071c) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, c6071c, z12 ? c6071c.f56330d : null);
    }

    public f0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, C6071C c6071c, C6071C.g gVar) {
        this.f11920e = j10;
        this.f11921f = j11;
        this.f11922g = j12;
        this.f11923h = j13;
        this.f11924i = j14;
        this.f11925j = j15;
        this.f11926k = j16;
        this.f11927l = z10;
        this.f11928m = z11;
        this.f11929n = z12;
        this.f11930o = obj;
        this.f11931p = (C6071C) AbstractC6614a.e(c6071c);
        this.f11932q = gVar;
    }
}
