package S0;

import K0.AbstractC1785e0;
import K0.AbstractC1789g0;
import K0.J;
import K0.X;
import K0.o0;
import Td.L;
import a0.C2507c;
import android.os.Trace;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import l0.h;
import r0.C6222d;
import r0.C6224f;
import s0.AbstractC6359h1;
import s0.C6356g1;
import t.AbstractC6565o;
import t.C6546L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC6565o f15615a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f15622h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.a f15616b = new S0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f15617c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6546L f15618d = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f15623i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC5082a f15624j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6222d f15625k = new C6222d(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
            b.this.f15622h = null;
            b bVar = b.this;
            Trace.beginSection("OnPositionedDispatch");
            try {
                bVar.c();
                L l10 = L.f17438a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public b(AbstractC6565o abstractC6565o) {
        this.f15615a = abstractC6565o;
    }

    private final void b(AbstractC1785e0 abstractC1785e0, C6222d c6222d) {
        while (abstractC1785e0 != null) {
            o0 o0VarH2 = abstractC1785e0.H2();
            long jP1 = abstractC1785e0.P1();
            c6222d.m(C6224f.e((((long) Float.floatToRawIntBits(C5021n.k(jP1))) << 32) | (((long) Float.floatToRawIntBits(C5021n.l(jP1))) & 4294967295L)));
            abstractC1785e0 = abstractC1785e0.P2();
            if (o0VarH2 != null) {
                float[] fArrB = o0VarH2.b();
                if (!AbstractC6359h1.a(fArrB)) {
                    C6356g1.g(fArrB, c6222d);
                }
            }
        }
    }

    private final void e(J j10, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int iY = j10.y();
        if (!z10) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            if (!this.f15616b.f(iY, i14, i15, i16, i17)) {
            }
            h();
        }
        i14 = i10;
        i15 = i11;
        i16 = i12;
        i17 = i13;
        J jA0 = j10.A0();
        this.f15616b.d(iY, i14, i15, i16, i17, jA0 != null ? jA0.y() : -1, j10.t0().q(AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)), j10.t0().q(AbstractC1789g0.a(16)));
        h();
    }

    private final void f(J j10, boolean z10) {
        AbstractC1785e0 abstractC1785e0W0 = j10.w0();
        X xL0 = j10.l0();
        int iS0 = xL0.S0();
        int iQ0 = xL0.Q0();
        C6222d c6222d = this.f15625k;
        c6222d.g(0.0f, 0.0f, iS0, iQ0);
        b(abstractC1785e0W0, c6222d);
        int iB = (int) c6222d.b();
        int iD = (int) c6222d.d();
        int iC = (int) c6222d.c();
        int iA = (int) c6222d.a();
        int iY = j10.y();
        if (z10 || !this.f15616b.i(iY, iB, iD, iC, iA)) {
            J jA0 = j10.A0();
            this.f15616b.d(iY, iB, iD, iC, iA, jA0 != null ? jA0.y() : -1, j10.t0().q(AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)), j10.t0().q(AbstractC1789g0.a(16)));
        }
        h();
    }

    private final void g(J j10) {
        C2507c c2507cI0 = j10.I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j11 = (J) objArr[i10];
            f(j11, false);
            g(j11);
        }
    }

    private final long l(J j10) {
        AbstractC1785e0 abstractC1785e0W0 = j10.w0();
        long jC = C6224f.f58329b.c();
        AbstractC1785e0 abstractC1785e0X = j10.X();
        while (abstractC1785e0X != null && abstractC1785e0X != abstractC1785e0W0) {
            o0 o0VarH2 = abstractC1785e0X.H2();
            jC = AbstractC5022o.c(jC, abstractC1785e0X.P1());
            abstractC1785e0X = abstractC1785e0X.P2();
            if (o0VarH2 != null) {
                float[] fArrB = o0VarH2.b();
                int iC = c.c(fArrB);
                if (iC == 3) {
                    continue;
                } else {
                    if ((iC & 2) == 0) {
                        return C5021n.f48560b.a();
                    }
                    jC = C6356g1.f(fArrB, jC);
                }
            }
        }
        return AbstractC5022o.d(jC);
    }

    private final void m(J j10) {
        long jX0;
        long jP1 = j10.w0().P1();
        J jA0 = j10.A0();
        if (jA0 != null) {
            if (!c.d(jA0.u0())) {
                m(jA0);
            }
            long jU0 = jA0.u0();
            if (c.d(jU0)) {
                if (jA0.y0()) {
                    jX0 = l(jA0);
                    jA0.Y1(jX0);
                    jA0.Z1(false);
                } else {
                    jX0 = jA0.x0();
                }
                jP1 = !c.d(jX0) ? C5021n.f48560b.a() : C5021n.o(C5021n.o(jU0, jX0), jP1);
            } else {
                jP1 = C5021n.f48560b.a();
            }
        }
        j10.V1(jP1);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r18 = this;
            r0 = r18
            long r7 = l0.c.b()
            boolean r1 = r0.f15619e
            r9 = 1
            r10 = 0
            if (r1 != 0) goto L13
            boolean r2 = r0.f15620f
            if (r2 == 0) goto L11
            goto L13
        L11:
            r11 = r10
            goto L14
        L13:
            r11 = r9
        L14:
            if (r1 == 0) goto La5
            r0.f15619e = r10
            t.L r1 = r0.f15618d
            java.lang.Object[] r2 = r1.f60006a
            int r1 = r1.f60007b
            r3 = r10
        L1f:
            if (r3 >= r1) goto L2b
            r4 = r2[r3]
            ie.a r4 = (ie.InterfaceC5082a) r4
            r4.invoke()
            int r3 = r3 + 1
            goto L1f
        L2b:
            S0.a r1 = r0.f15616b
            long[] r12 = r1.f15612a
            int r13 = r1.f15614c
            r14 = r10
        L32:
            int r1 = r12.length
            int r1 = r1 + (-2)
            if (r14 >= r1) goto L58
            if (r14 >= r13) goto L58
            int r1 = r14 + 2
            r1 = r12[r1]
            r3 = 61
            long r3 = r1 >> r3
            int r3 = (int) r3
            r3 = r3 & r9
            if (r3 == 0) goto L55
            r3 = r12[r14]
            int r5 = r14 + 1
            r5 = r12[r5]
            int r1 = (int) r1
            r2 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r1
            S0.d r1 = r0.f15617c
            r1.c(r2, r3, r5, r7)
        L55:
            int r14 = r14 + 3
            goto L32
        L58:
            S0.d r1 = r0.f15617c
            t.F r1 = r1.e()
            java.lang.Object[] r2 = r1.f60107c
            long[] r1 = r1.f60105a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La0
            r4 = r10
        L68:
            r5 = r1[r4]
            long r12 = ~r5
            r9 = 7
            long r12 = r12 << r9
            long r12 = r12 & r5
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L9b
            int r9 = r4 - r3
            int r9 = ~r9
            int r9 = r9 >>> 31
            r12 = 8
            int r9 = 8 - r9
            r13 = r10
        L82:
            if (r13 >= r9) goto L99
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r5
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r14 = r4 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            android.support.v4.media.session.b.a(r14)
        L95:
            long r5 = r5 >> r12
            int r13 = r13 + 1
            goto L82
        L99:
            if (r9 != r12) goto La0
        L9b:
            if (r4 == r3) goto La0
            int r4 = r4 + 1
            goto L68
        La0:
            S0.a r1 = r0.f15616b
            r1.a()
        La5:
            boolean r1 = r0.f15620f
            if (r1 == 0) goto Lb0
            r0.f15620f = r10
            S0.d r1 = r0.f15617c
            r1.b(r7)
        Lb0:
            if (r11 == 0) goto Lb7
            S0.d r1 = r0.f15617c
            r1.a(r7)
        Lb7:
            boolean r1 = r0.f15621g
            if (r1 == 0) goto Lc2
            r0.f15621g = r10
            S0.a r1 = r0.f15616b
            r1.b()
        Lc2:
            S0.d r1 = r0.f15617c
            r1.f(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.b.c():void");
    }

    public final S0.a d() {
        return this.f15616b;
    }

    public final void h() {
        this.f15619e = true;
    }

    public final void i(J j10) {
        this.f15619e = true;
        this.f15616b.e(j10.y());
        o(true);
    }

    public final void j(J j10) {
        if (h.f52329b) {
            long jL = l(j10);
            if (!c.d(jL)) {
                g(j10);
                return;
            }
            j10.Y1(jL);
            j10.Z1(false);
            C2507c c2507cI0 = j10.I0();
            Object[] objArr = c2507cI0.f23496a;
            int iP = c2507cI0.p();
            for (int i10 = 0; i10 < iP; i10++) {
                k((J) objArr[i10], false);
            }
            i(j10);
        }
    }

    public final void k(J j10, boolean z10) {
        if (h.f52329b) {
            X xL0 = j10.l0();
            int iS0 = xL0.S0();
            int iQ0 = xL0.Q0();
            long jU0 = j10.u0();
            long jC0 = j10.c0();
            int i10 = (int) (jC0 >> 32);
            int i11 = (int) (jC0 & 4294967295L);
            m(j10);
            long jU02 = j10.u0();
            if (!c.d(jU02)) {
                f(j10, z10);
                return;
            }
            j10.S1(C5025r.c((((long) iS0) << 32) | (4294967295L & ((long) iQ0))));
            int iK = C5021n.k(jU02);
            int iL = C5021n.l(jU02);
            int i12 = iK + iS0;
            int i13 = iL + iQ0;
            if (!z10 && C5021n.j(jU02, jU0) && i10 == iS0 && i11 == iQ0) {
                return;
            }
            e(j10, z10, iK, iL, i12, i13);
        }
    }

    public final void n(J j10) {
        this.f15616b.g(j10.y());
        h();
        this.f15621g = true;
    }

    public final void o(boolean z10) {
        boolean z11 = (z10 && this.f15622h == null) ? false : true;
        long jD = this.f15617c.d();
        if (jD >= 0 || !z11) {
            if (this.f15623i == jD && z11) {
                return;
            }
            Object obj = this.f15622h;
            if (obj != null) {
                l0.c.e(obj);
            }
            long jB = l0.c.b();
            long jMax = Math.max(jD, ((long) 16) + jB);
            this.f15623i = jMax;
            this.f15622h = l0.c.c(jMax - jB, this.f15624j);
        }
    }

    public final void p(J j10, boolean z10, boolean z11) {
        if (j10.b()) {
            this.f15616b.j(j10.y(), z10, z11);
        }
    }

    public final void q(long j10, long j11, float[] fArr, int i10, int i11) {
        int iC = c.c(fArr);
        d dVar = this.f15617c;
        if ((iC & 2) != 0) {
            fArr = null;
        }
        this.f15620f = dVar.g(j10, j11, fArr, i10, i11) || this.f15620f;
    }
}
