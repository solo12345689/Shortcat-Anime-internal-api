package E3;

import E3.C1363g;
import E3.C1375h3;
import E3.I6;
import E3.M6;
import E3.r;
import F3.q;
import P9.AbstractC2011u;
import P9.r;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import q2.BinderC6095j;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.InterfaceC6084P;
import q2.d0;
import q2.h0;
import t2.AbstractC6614a;
import t2.AbstractC6622i;
import t2.AbstractC6635w;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class I6 extends r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f4529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1363g f4530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f4531c = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P9.r f4532d = P9.r.v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4533e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements C1375h3.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1443q f4534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4535b;

        public a(InterfaceC1443q interfaceC1443q, int i10) {
            this.f4534a = interfaceC1443q;
            this.f4535b = i10;
        }

        @Override // E3.C1375h3.f
        public void F(int i10, T6 t62, Bundle bundle) {
            this.f4534a.w2(i10, t62.b(), bundle);
        }

        public IBinder H() {
            return this.f4534a.asBinder();
        }

        @Override // E3.C1375h3.f
        public void a(int i10, W6 w62, boolean z10, boolean z11, int i11) {
            this.f4534a.u2(i10, w62.a(z10, z11).c(i11));
        }

        @Override // E3.C1375h3.f
        public void b(int i10) {
            a7.a(this.f4534a);
        }

        @Override // E3.C1375h3.f
        public void d(int i10) {
            this.f4534a.d(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            return Objects.equals(H(), ((a) obj).H());
        }

        public int hashCode() {
            return K1.b.b(H());
        }

        @Override // E3.C1375h3.f
        public void l(int i10, X6 x62) {
            this.f4534a.G1(i10, x62.b());
        }

        @Override // E3.C1375h3.f
        public void o(int i10, Bundle bundle) {
            this.f4534a.m3(i10, bundle);
        }

        @Override // E3.C1375h3.f
        public void s(int i10, InterfaceC6084P.b bVar) {
            this.f4534a.o2(i10, bVar.h());
        }

        @Override // E3.C1375h3.f
        public void v(int i10, C1490w c1490w) {
            this.f4534a.H0(i10, c1490w.e());
        }

        @Override // E3.C1375h3.f
        public void z(int i10, M6 m62, InterfaceC6084P.b bVar, boolean z10, boolean z11) {
            AbstractC6614a.g(this.f4535b != 0);
            boolean z12 = z10 || !bVar.c(17);
            boolean z13 = z11 || !bVar.c(30);
            if (this.f4535b < 2) {
                this.f4534a.u3(i10, m62.A(bVar, z10, true).E(this.f4535b), z12);
            } else {
                M6 m6A = m62.A(bVar, z10, z11);
                this.f4534a.y2(i10, this.f4534a instanceof X2 ? m6A.F() : m6A.E(this.f4535b), new M6.c(z12, z13).b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(N6 n62, C1375h3.g gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        void a(N6 n62, C1375h3.g gVar, List list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
        void a(N6 n62, C1375h3.i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface e {
        Object a(I3 i32, C1375h3.g gVar, int i10);
    }

    public I6(I3 i32) {
        this.f4529a = new WeakReference(i32);
        this.f4530b = new C1363g(i32);
    }

    private q2.d0 A5(q2.d0 d0Var) {
        if (d0Var.f56805D.isEmpty()) {
            return d0Var;
        }
        d0.c cVarH = d0Var.I().H();
        P9.X it = d0Var.f56805D.values().iterator();
        while (it.hasNext()) {
            q2.b0 b0Var = (q2.b0) it.next();
            q2.a0 a0Var = (q2.a0) this.f4532d.u().get(b0Var.f56743a.f56703b);
            if (a0Var == null || b0Var.f56743a.f56702a != a0Var.f56702a) {
                cVarH.F(b0Var);
            } else {
                cVarH.F(new q2.b0(a0Var, b0Var.f56744b));
            }
        }
        return cVarH.G();
    }

    public static /* synthetic */ void B4(I6 i62, C1375h3.g gVar, I3 i32, InterfaceC1443q interfaceC1443q) throws Throwable {
        InterfaceC1443q interfaceC1443q2;
        InterfaceC6084P.b bVar;
        i62.getClass();
        boolean z10 = false;
        try {
            i62.f4531c.remove(gVar);
            if (i32.t0()) {
                a7.a(interfaceC1443q);
                return;
            }
            IBinder iBinderH = ((a) AbstractC6614a.i((a) gVar.c())).H();
            C1375h3.e eVarX0 = i32.x0(gVar);
            if (!eVarX0.f5318a && !gVar.h()) {
                a7.a(interfaceC1443q);
                return;
            }
            if (!eVarX0.f5318a) {
                eVarX0 = C1375h3.e.a(U6.f4986b, InterfaceC6084P.b.f56604b);
            }
            if (i62.f4530b.p(gVar)) {
                AbstractC6635w.i("MediaSessionStub", "Controller " + gVar + " has sent connection request multiple times");
            }
            i62.f4530b.e(iBinderH, gVar, eVarX0.f5319b, eVarX0.f5320c);
            S6 s6N = i62.f4530b.n(gVar);
            if (s6N == null) {
                AbstractC6635w.i("MediaSessionStub", "Ignoring connection request from unknown controller info");
                a7.a(interfaceC1443q);
                return;
            }
            N6 n6J0 = i32.j0();
            M6 m6I0 = i32.i0();
            C6082N c6082nH0 = i32.h0();
            if (c6082nH0 == null) {
                bVar = eVarX0.f5320c;
            } else {
                i62.f4530b.v(gVar, c6082nH0, eVarX0.f5320c);
                m6I0 = I3.Q(m6I0, c6082nH0);
                bVar = (InterfaceC6084P.b) AbstractC6614a.e(I3.P(eVarX0.f5320c));
            }
            InterfaceC6084P.b bVar2 = bVar;
            M6 m6D5 = i62.d5(m6I0);
            MediaSession.Token tokenG0 = i32.g0();
            PendingIntent pendingIntentK0 = eVarX0.f5324g;
            if (pendingIntentK0 == null) {
                pendingIntentK0 = i32.k0();
            }
            AbstractC2011u abstractC2011uB0 = eVarX0.f5321d;
            if (abstractC2011uB0 == null) {
                abstractC2011uB0 = i32.b0();
            }
            AbstractC2011u abstractC2011uE0 = eVarX0.f5322e;
            if (abstractC2011uE0 == null) {
                abstractC2011uE0 = i32.e0();
            }
            AbstractC2011u abstractC2011uZ = i32.Z();
            U6 u62 = eVarX0.f5319b;
            InterfaceC6084P.b bVarP0 = n6J0.p0();
            Bundle bundleC = i32.m0().c();
            Bundle bundleL0 = eVarX0.f5323f;
            if (bundleL0 == null) {
                bundleL0 = i32.l0();
            }
            interfaceC1443q2 = interfaceC1443q;
            try {
                C1411m c1411m = new C1411m(1008000300, 5, i62, pendingIntentK0, abstractC2011uB0, abstractC2011uE0, abstractC2011uZ, u62, bVar2, bVarP0, bundleC, bundleL0, m6D5, tokenG0);
                if (i32.t0()) {
                    a7.a(interfaceC1443q2);
                    return;
                }
                try {
                    interfaceC1443q2.k0(s6N.c(), interfaceC1443q2 instanceof X2 ? c1411m.f() : c1411m.e(gVar.e()));
                    z10 = true;
                } catch (RemoteException unused) {
                }
                if (z10) {
                    i32.G0(gVar);
                }
                if (z10) {
                    return;
                }
                a7.a(interfaceC1443q2);
            } catch (Throwable th2) {
                th = th2;
                if (!z10) {
                    a7.a(interfaceC1443q2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC1443q2 = interfaceC1443q;
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.p I4(List list, int i10, long j10, I3 i32, C1375h3.g gVar, int i11) {
        int iK0 = i10 == -1 ? i32.j0().K0() : i10;
        if (i10 == -1) {
            j10 = i32.j0().getCurrentPosition();
        }
        return i32.H0(gVar, list, iK0, j10);
    }

    public static /* synthetic */ com.google.common.util.concurrent.p J4(String str, Z2 z22, C1375h3.g gVar, int i10) {
        throw null;
    }

    public static /* synthetic */ com.google.common.util.concurrent.p K3(String str, Y2 y22, Z2 z22, C1375h3.g gVar, int i10) {
        throw null;
    }

    public static /* synthetic */ com.google.common.util.concurrent.p K4(String str, int i10, int i11, Y2 y22, Z2 z22, C1375h3.g gVar, int i12) {
        throw null;
    }

    public static /* synthetic */ void M3(C1375h3.g gVar, int i10, com.google.common.util.concurrent.p pVar) {
        C1490w c1490wC;
        try {
            c1490wC = (C1490w) AbstractC6614a.f((C1490w) pVar.get(), "LibraryResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            AbstractC6635w.j("MediaSessionStub", "Library operation failed", e);
            c1490wC = C1490w.c(-1);
        } catch (CancellationException e11) {
            AbstractC6635w.j("MediaSessionStub", "Library operation cancelled", e11);
            c1490wC = C1490w.c(1);
        } catch (ExecutionException e12) {
            e = e12;
            AbstractC6635w.j("MediaSessionStub", "Library operation failed", e);
            c1490wC = C1490w.c(-1);
        }
        t5(gVar, i10, c1490wC);
    }

    public static /* synthetic */ com.google.common.util.concurrent.p P3(Y2 y22, Z2 z22, C1375h3.g gVar, int i10) {
        throw null;
    }

    public static /* synthetic */ void Q3(I3 i32, d dVar, C1375h3.i iVar) {
        if (i32.t0()) {
            return;
        }
        dVar.a(i32.j0(), iVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.p T4(b bVar, I3 i32, C1375h3.g gVar, int i10) {
        if (i32.t0()) {
            return com.google.common.util.concurrent.j.e();
        }
        bVar.a(i32.j0(), gVar);
        v5(i32, gVar, i10, new X6(0));
        return com.google.common.util.concurrent.j.e();
    }

    public static /* synthetic */ void U4(I6 i62, C1375h3.g gVar, N6 n62) {
        I3 i32 = (I3) i62.f4529a.get();
        if (i32 == null || i32.t0()) {
            return;
        }
        i32.p0(gVar, false);
    }

    public static /* synthetic */ com.google.common.util.concurrent.p V3(e eVar, final d dVar, final I3 i32, final C1375h3.g gVar, int i10) {
        return i32.t0() ? com.google.common.util.concurrent.j.d(new X6(-100)) : t2.a0.D1((com.google.common.util.concurrent.p) eVar.a(i32, gVar, i10), new com.google.common.util.concurrent.d() { // from class: E3.w6
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                I3 i33 = i32;
                return t2.a0.h1(i33.X(), i33.L(gVar, new Runnable() { // from class: E3.E6
                    @Override // java.lang.Runnable
                    public final void run() {
                        I6.Q3(i33, dVar, iVar);
                    }
                }), new X6(0));
            }
        });
    }

    public static /* synthetic */ void X4(I3 i32, c cVar, C1375h3.g gVar, List list) {
        if (i32.t0()) {
            return;
        }
        cVar.a(i32.j0(), gVar, list);
    }

    public static /* synthetic */ void Y4(I3 i32, com.google.common.util.concurrent.w wVar, InterfaceC6627n interfaceC6627n, com.google.common.util.concurrent.p pVar) {
        if (i32.t0()) {
            wVar.F(null);
            return;
        }
        try {
            interfaceC6627n.accept(pVar);
            wVar.F(null);
        } catch (Throwable th2) {
            wVar.G(th2);
        }
    }

    private void a5(InterfaceC1443q interfaceC1443q, int i10, int i11, e eVar) {
        b5(interfaceC1443q, i10, null, i11, eVar);
    }

    private void b5(InterfaceC1443q interfaceC1443q, final int i10, final T6 t62, final int i11, final e eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final I3 i32 = (I3) this.f4529a.get();
            if (i32 != null && !i32.t0()) {
                final C1375h3.g gVarK = this.f4530b.k(interfaceC1443q.asBinder());
                if (gVarK == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    t2.a0.g1(i32.X(), new Runnable() { // from class: E3.n6
                        @Override // java.lang.Runnable
                        public final void run() {
                            I6.e(this.f5443a, gVarK, t62, i32, i10, i11, eVar);
                        }
                    });
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private void c5(InterfaceC1443q interfaceC1443q, int i10, T6 t62, e eVar) {
        b5(interfaceC1443q, i10, t62, 0, eVar);
    }

    public static /* synthetic */ void d4(I6 i62, int i10, N6 n62, C1375h3.g gVar, List list) {
        i62.getClass();
        if (list.size() == 1) {
            n62.C0(i62.j5(gVar, n62, i10), (C6071C) list.get(0));
        } else {
            n62.Q(i62.j5(gVar, n62, i10), i62.j5(gVar, n62, i10 + 1), list);
        }
    }

    public static /* synthetic */ void e(I6 i62, C1375h3.g gVar, T6 t62, I3 i32, int i10, int i11, e eVar) {
        if (i62.f4530b.p(gVar)) {
            if (t62 != null) {
                if (!i62.f4530b.s(gVar, t62)) {
                    v5(i32, gVar, i10, new X6(-4));
                    return;
                }
            } else if (!i62.f4530b.r(gVar, i11)) {
                v5(i32, gVar, i10, new X6(-4));
                return;
            }
            eVar.a(i32, gVar, i10);
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.p e4(e eVar, final c cVar, final I3 i32, final C1375h3.g gVar, int i10) {
        return i32.t0() ? com.google.common.util.concurrent.j.d(new X6(-100)) : t2.a0.D1((com.google.common.util.concurrent.p) eVar.a(i32, gVar, i10), new com.google.common.util.concurrent.d() { // from class: E3.B6
            @Override // com.google.common.util.concurrent.d
            public final com.google.common.util.concurrent.p apply(Object obj) {
                I3 i33 = i32;
                C1375h3.g gVar2 = gVar;
                return t2.a0.h1(i33.X(), i33.L(gVar2, new Runnable() { // from class: E3.F6
                    @Override // java.lang.Runnable
                    public final void run() {
                        I6.X4(i33, cVar, gVar2, list);
                    }
                }), new X6(0));
            }
        });
    }

    private String e5(q2.a0 a0Var) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f4533e;
        this.f4533e = i10 + 1;
        sb2.append(t2.a0.H0(i10));
        sb2.append("-");
        sb2.append(a0Var.f56703b);
        return sb2.toString();
    }

    private static e g5(final e eVar, final c cVar) {
        return new e() { // from class: E3.u6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i10) {
                return I6.e4(eVar, cVar, i32, gVar, i10);
            }
        };
    }

    private static e h5(final e eVar, final d dVar) {
        return new e() { // from class: E3.q6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i10) {
                return I6.V3(eVar, dVar, i32, gVar, i10);
            }
        };
    }

    public static /* synthetic */ com.google.common.util.concurrent.p i4(e eVar, I3 i32, C1375h3.g gVar, int i10) {
        return (com.google.common.util.concurrent.p) eVar.a(i32, gVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.util.concurrent.p i5(final I3 i32, C1375h3.g gVar, int i10, e eVar, final InterfaceC6627n interfaceC6627n) {
        if (i32.t0()) {
            return com.google.common.util.concurrent.j.e();
        }
        final com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) eVar.a(i32, gVar, i10);
        final com.google.common.util.concurrent.w wVarJ = com.google.common.util.concurrent.w.J();
        pVar.k(new Runnable() { // from class: E3.D6
            @Override // java.lang.Runnable
            public final void run() {
                I6.Y4(i32, wVarJ, interfaceC6627n, pVar);
            }
        }, com.google.common.util.concurrent.s.a());
        return wVarJ;
    }

    private int j5(C1375h3.g gVar, N6 n62, int i10) {
        return (n62.k(17) && !this.f4530b.q(gVar, 17) && this.f4530b.q(gVar, 16)) ? i10 + n62.K0() : i10;
    }

    public static /* synthetic */ com.google.common.util.concurrent.p k4(String str, Z2 z22, C1375h3.g gVar, int i10) {
        throw null;
    }

    private void m5(InterfaceC1443q interfaceC1443q, int i10, int i11, e eVar) {
        C1375h3.g gVarK = this.f4530b.k(interfaceC1443q.asBinder());
        if (gVarK != null) {
            n5(gVarK, i10, i11, eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void n4(E3.I3 r2, E3.C1375h3.g r3, int r4, com.google.common.util.concurrent.p r5) {
        /*
            java.lang.String r0 = "MediaSessionStub"
            java.lang.Object r5 = r5.get()     // Catch: java.lang.InterruptedException -> L11 java.util.concurrent.ExecutionException -> L13 java.util.concurrent.CancellationException -> L15
            E3.X6 r5 = (E3.X6) r5     // Catch: java.lang.InterruptedException -> L11 java.util.concurrent.ExecutionException -> L13 java.util.concurrent.CancellationException -> L15
            java.lang.String r1 = "SessionResult must not be null"
            java.lang.Object r5 = t2.AbstractC6614a.f(r5, r1)     // Catch: java.lang.InterruptedException -> L11 java.util.concurrent.ExecutionException -> L13 java.util.concurrent.CancellationException -> L15
            E3.X6 r5 = (E3.X6) r5     // Catch: java.lang.InterruptedException -> L11 java.util.concurrent.ExecutionException -> L13 java.util.concurrent.CancellationException -> L15
            goto L39
        L11:
            r5 = move-exception
            goto L17
        L13:
            r5 = move-exception
            goto L17
        L15:
            r5 = move-exception
            goto L2e
        L17:
            java.lang.String r1 = "Session operation failed"
            t2.AbstractC6635w.j(r0, r1, r5)
            E3.X6 r0 = new E3.X6
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.UnsupportedOperationException
            if (r5 == 0) goto L28
            r5 = -6
            goto L29
        L28:
            r5 = -1
        L29:
            r0.<init>(r5)
            r5 = r0
            goto L39
        L2e:
            java.lang.String r1 = "Session operation cancelled"
            t2.AbstractC6635w.j(r0, r1, r5)
            E3.X6 r5 = new E3.X6
            r0 = 1
            r5.<init>(r0)
        L39:
            v5(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.I6.n4(E3.I3, E3.h3$g, int, com.google.common.util.concurrent.p):void");
    }

    private void n5(final C1375h3.g gVar, final int i10, final int i11, final e eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final I3 i32 = (I3) this.f4529a.get();
            if (i32 != null && !i32.t0()) {
                t2.a0.g1(i32.X(), new Runnable() { // from class: E3.o6
                    @Override // java.lang.Runnable
                    public final void run() {
                        I6.y4(this.f5475a, gVar, i11, i32, i10, eVar);
                    }
                });
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private static void t5(C1375h3.g gVar, int i10, C1490w c1490w) {
        try {
            ((C1375h3.f) AbstractC6614a.i(gVar.c())).v(i10, c1490w);
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionStub", "Failed to send result to browser " + gVar, e10);
        }
    }

    private static e u5(final e eVar) {
        return new e() { // from class: E3.s6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i10) {
                I6.e eVar2 = eVar;
                android.support.v4.media.session.b.a(i32);
                return I6.i5(null, gVar, i10, eVar2, new InterfaceC6627n() { // from class: E3.v6
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        I6.M3(gVar, i10, (com.google.common.util.concurrent.p) obj);
                    }
                });
            }
        };
    }

    public static /* synthetic */ com.google.common.util.concurrent.p v4(String str, Y2 y22, Z2 z22, C1375h3.g gVar, int i10) {
        throw null;
    }

    private static void v5(I3 i32, C1375h3.g gVar, int i10, X6 x62) {
        try {
            ((C1375h3.f) AbstractC6614a.i(gVar.c())).l(i10, x62);
            i32.T0();
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionStub", "Failed to send result to controller " + gVar, e10);
        }
    }

    private static e w5(final b bVar) {
        return new e() { // from class: E3.m6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i10) {
                return I6.T4(bVar, i32, gVar, i10);
            }
        };
    }

    public static /* synthetic */ com.google.common.util.concurrent.p x4(String str, int i10, int i11, Y2 y22, Z2 z22, C1375h3.g gVar, int i12) {
        throw null;
    }

    private static e x5(final InterfaceC6627n interfaceC6627n) {
        return w5(new b() { // from class: E3.r6
            @Override // E3.I6.b
            public final void a(N6 n62, C1375h3.g gVar) {
                interfaceC6627n.accept(n62);
            }
        });
    }

    public static /* synthetic */ void y4(I6 i62, final C1375h3.g gVar, int i10, final I3 i32, final int i11, final e eVar) {
        if (!i62.f4530b.q(gVar, i10)) {
            v5(i32, gVar, i11, new X6(-4));
            return;
        }
        int iE0 = i32.E0(gVar, i10);
        if (iE0 != 0) {
            v5(i32, gVar, i11, new X6(iE0));
        } else if (i10 != 27) {
            i62.f4530b.f(gVar, i10, new C1363g.a() { // from class: E3.z6
                @Override // E3.C1363g.a
                public final com.google.common.util.concurrent.p run() {
                    return I6.i4(eVar, i32, gVar, i11);
                }
            });
        } else {
            i32.L(gVar, new Runnable() { // from class: E3.x6
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.a(i32, gVar, i11);
                }
            }).run();
            i62.f4530b.f(gVar, i10, new C1363g.a() { // from class: E3.y6
                @Override // E3.C1363g.a
                public final com.google.common.util.concurrent.p run() {
                    return com.google.common.util.concurrent.j.e();
                }
            });
        }
    }

    private static e y5(final e eVar) {
        return new e() { // from class: E3.t6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i10) {
                return I6.i5(i32, gVar, i10, eVar, new InterfaceC6627n() { // from class: E3.C6
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        I6.n4(i32, gVar, i10, (com.google.common.util.concurrent.p) obj);
                    }
                });
            }
        };
    }

    @Override // E3.r
    public void A1(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder) {
        Q2(interfaceC1443q, i10, iBinder, true);
    }

    @Override // E3.r
    public void B2(InterfaceC1443q interfaceC1443q, int i10, final int i11, final int i12, final int i13) {
        if (interfaceC1443q == null || i11 < 0 || i12 < i11 || i13 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 20, x5(new InterfaceC6627n() { // from class: E3.G5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).N0(i11, i12, i13);
            }
        }));
    }

    @Override // E3.r
    public void B3(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 4, x5(new InterfaceC6627n() { // from class: E3.e6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).K();
            }
        }));
    }

    @Override // E3.r
    public void C2(InterfaceC1443q interfaceC1443q, int i10, final int i11, final int i12, IBinder iBinder) {
        if (interfaceC1443q == null || iBinder == null || i11 < 0 || i12 < i11) {
            return;
        }
        try {
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new C1474u(), BinderC6095j.a(iBinder));
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.f5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i13) {
                    return i32.w0(gVar, abstractC2011uD);
                }
            }, new c() { // from class: E3.g5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    I6 i62 = this.f5276a;
                    n62.Q(i62.j5(gVar, n62, i11), i62.j5(gVar, n62, i12), list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void E0(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 20, x5(new InterfaceC6627n() { // from class: E3.k6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).G();
            }
        }));
    }

    @Override // E3.r
    public void F3(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        k5(gVarK, i10);
    }

    @Override // E3.r
    public void G2(InterfaceC1443q interfaceC1443q, int i10, final int i11, final int i12) {
        if (interfaceC1443q == null || i11 < 0 || i12 < i11) {
            return;
        }
        m5(interfaceC1443q, i10, 20, w5(new b() { // from class: E3.b5
            @Override // E3.I6.b
            public final void a(N6 n62, C1375h3.g gVar) {
                I6 i62 = this.f5165a;
                n62.T(i62.j5(gVar, n62, i11), i62.j5(gVar, n62, i12));
            }
        }));
    }

    @Override // E3.r
    public void I(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null || i11 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 20, w5(new b() { // from class: E3.p6
            @Override // E3.I6.b
            public final void a(N6 n62, C1375h3.g gVar) {
                n62.R(this.f5488a.j5(gVar, n62, i11));
            }
        }));
    }

    @Override // E3.r
    public void I1(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 8, x5(new InterfaceC6627n() { // from class: E3.p5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).W();
            }
        }));
    }

    @Override // E3.r
    public void J2(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 26, x5(new InterfaceC6627n() { // from class: E3.q5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).i0();
            }
        }));
    }

    @Override // E3.r
    public void K0(InterfaceC1443q interfaceC1443q, int i10, final int i11, final int i12) {
        if (interfaceC1443q == null || i11 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 33, x5(new InterfaceC6627n() { // from class: E3.N5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).z0(i11, i12);
            }
        }));
    }

    @Override // E3.r
    public void M1(InterfaceC1443q interfaceC1443q, int i10, final String str) {
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
        } else {
            a5(interfaceC1443q, i10, 50002, u5(new e() { // from class: E3.c5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    String str2 = str;
                    android.support.v4.media.session.b.a(i32);
                    return I6.k4(str2, null, gVar, i11);
                }
            }));
        }
    }

    @Override // E3.r
    public void N(InterfaceC1443q interfaceC1443q, int i10, final int i11, final int i12) {
        if (interfaceC1443q == null || i11 < 0 || i12 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 20, x5(new InterfaceC6627n() { // from class: E3.h6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).M0(i11, i12);
            }
        }));
    }

    @Override // E3.r
    public void N0(InterfaceC1443q interfaceC1443q) {
        if (interfaceC1443q == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            I3 i32 = (I3) this.f4529a.get();
            if (i32 != null && !i32.t0()) {
                final C1375h3.g gVarK = this.f4530b.k(interfaceC1443q.asBinder());
                if (gVarK != null) {
                    t2.a0.g1(i32.X(), new Runnable() { // from class: E3.E5
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4422a.f4530b.h(gVarK);
                        }
                    });
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // E3.r
    public void N2(InterfaceC1443q interfaceC1443q, int i10, final int i11, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null || i11 < 0) {
            return;
        }
        try {
            final C6071C c6071cB = C6071C.b(bundle);
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.n5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i12) {
                    return i32.w0(gVar, AbstractC2011u.B(c6071cB));
                }
            }, new c() { // from class: E3.o5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    n62.H0(this.f5473a.j5(gVar, n62, i11), list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void O0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            C1371h c1371hA = C1371h.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c1371hA.f5290d;
            }
            try {
                q.b bVar = new q.b(c1371hA.f5289c, callingPid, callingUid);
                I3 i32 = (I3) this.f4529a.get();
                boolean z10 = i32 != null && F3.q.a(i32.a0()).b(bVar);
                int i11 = c1371hA.f5287a;
                int i12 = c1371hA.f5288b;
                Z4(interfaceC1443q, new C1375h3.g(bVar, i11, i12, z10, new a(interfaceC1443q, i12), c1371hA.f5291e, c1371hA.f5292f));
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e10);
        }
    }

    @Override // E3.r
    public void O1(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        s5(gVarK, i10);
    }

    @Override // E3.r
    public void P(InterfaceC1443q interfaceC1443q, int i10, final String str) {
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "getItem(): Ignoring empty mediaId");
        } else {
            a5(interfaceC1443q, i10, 50004, u5(new e() { // from class: E3.J5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    String str2 = str;
                    android.support.v4.media.session.b.a(i32);
                    return I6.J4(str2, null, gVar, i11);
                }
            }));
        }
    }

    @Override // E3.r
    public void Q0(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 34, x5(new InterfaceC6627n() { // from class: E3.x5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).X(i11);
            }
        }));
    }

    @Override // E3.r
    public void Q2(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, final boolean z10) {
        if (interfaceC1443q == null || iBinder == null) {
            return;
        }
        try {
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new C1474u(), BinderC6095j.a(iBinder));
            m5(interfaceC1443q, i10, 20, y5(h5(new e() { // from class: E3.A6
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    List list = abstractC2011uD;
                    boolean z11 = z10;
                    return i32.H0(gVar, list, z11 ? -1 : i32.j0().K0(), z11 ? -9223372036854775807L : i32.j0().getCurrentPosition());
                }
            }, new G6())));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void R2(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 34, x5(new InterfaceC6627n() { // from class: E3.D5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).N(i11);
            }
        }));
    }

    @Override // E3.r
    public void S1(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        z5(gVarK, i10);
    }

    @Override // E3.r
    public void T0(InterfaceC1443q interfaceC1443q, int i10, final String str, final int i11, final int i12, Bundle bundle) {
        final Y2 y2A;
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "getSearchResult(): Ignoring empty query");
            return;
        }
        if (i11 < 0) {
            AbstractC6635w.i("MediaSessionStub", "getSearchResult(): Ignoring negative page");
            return;
        }
        if (i12 < 1) {
            AbstractC6635w.i("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        a5(interfaceC1443q, i10, 50006, u5(new e() { // from class: E3.V5
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i13) {
                String str2 = str;
                int i14 = i11;
                int i15 = i12;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(i32);
                return I6.K4(str2, i14, i15, y22, null, gVar, i13);
            }
        }));
    }

    @Override // E3.r
    public void T2(InterfaceC1443q interfaceC1443q, int i10, final int i11, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null || i11 < 0) {
            return;
        }
        try {
            final C6071C c6071cB = C6071C.b(bundle);
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.r5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i12) {
                    return i32.w0(gVar, AbstractC2011u.B(c6071cB));
                }
            }, new c() { // from class: E3.s5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    I6.d4(this.f5524a, i11, n62, gVar, list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void U(InterfaceC1443q interfaceC1443q, int i10, final boolean z10, final int i11) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 34, x5(new InterfaceC6627n() { // from class: E3.c6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).F(z10, i11);
            }
        }));
    }

    @Override // E3.r
    public void V(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null) {
            return;
        }
        if (i11 == 2 || i11 == 0 || i11 == 1) {
            m5(interfaceC1443q, i10, 15, x5(new InterfaceC6627n() { // from class: E3.O5
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((N6) obj).v(i11);
                }
            }));
        }
    }

    @Override // E3.r
    public void V1(InterfaceC1443q interfaceC1443q, int i10, final boolean z10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 14, x5(new InterfaceC6627n() { // from class: E3.X5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).r0(z10);
            }
        }));
    }

    @Override // E3.r
    public void V2(final InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            I3 i32 = (I3) this.f4529a.get();
            if (i32 != null && !i32.t0()) {
                t2.a0.g1(i32.X(), new Runnable() { // from class: E3.e5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5214a.f4530b.u(interfaceC1443q.asBinder());
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // E3.r
    public void W(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder) {
        if (interfaceC1443q == null || iBinder == null) {
            return;
        }
        try {
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new C1474u(), BinderC6095j.a(iBinder));
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.Q5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.w0(gVar, abstractC2011uD);
                }
            }, new c() { // from class: E3.R5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    n62.O0(list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void W1(InterfaceC1443q interfaceC1443q, int i10, final String str, final int i11, final int i12, Bundle bundle) {
        final Y2 y2A;
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "getChildren(): Ignoring empty parentId");
            return;
        }
        if (i11 < 0) {
            AbstractC6635w.i("MediaSessionStub", "getChildren(): Ignoring negative page");
            return;
        }
        if (i12 < 1) {
            AbstractC6635w.i("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        a5(interfaceC1443q, i10, 50003, u5(new e() { // from class: E3.d5
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i13) {
                String str2 = str;
                int i14 = i11;
                int i15 = i12;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(i32);
                return I6.x4(str2, i14, i15, y22, null, gVar, i13);
            }
        }));
    }

    @Override // E3.r
    public void X0(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        p5(gVarK, i10);
    }

    @Override // E3.r
    public void X1(InterfaceC1443q interfaceC1443q, int i10, final String str, Bundle bundle) {
        if (interfaceC1443q == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            final q2.S sA = q2.S.a(bundle);
            a5(interfaceC1443q, i10, 40010, y5(new e() { // from class: E3.M5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.I0(gVar, str, sA);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for Rating", e10);
        }
    }

    @Override // E3.r
    public void X2(InterfaceC1443q interfaceC1443q, int i10, final int i11, final long j10) {
        if (interfaceC1443q == null || i11 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 10, w5(new b() { // from class: E3.k5
            @Override // E3.I6.b
            public final void a(N6 n62, C1375h3.g gVar) {
                n62.o0(this.f5377a.j5(gVar, n62, i11), j10);
            }
        }));
    }

    @Override // E3.r
    public void Y(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, final boolean z10) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6071C c6071cB = C6071C.b(bundle);
            m5(interfaceC1443q, i10, 31, y5(h5(new e() { // from class: E3.y5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    C6071C c6071c = c6071cB;
                    boolean z11 = z10;
                    return i32.H0(gVar, AbstractC2011u.B(c6071c), z11 ? -1 : i32.j0().K0(), z11 ? -9223372036854775807L : i32.j0().getCurrentPosition());
                }
            }, new G6())));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void Y0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6071C c6071cB = C6071C.b(bundle);
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.S5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.w0(gVar, AbstractC2011u.B(c6071cB));
                }
            }, new c() { // from class: E3.U5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    n62.O0(list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void Z(InterfaceC1443q interfaceC1443q, int i10, final Surface surface) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 27, x5(new InterfaceC6627n() { // from class: E3.Z5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).B(surface);
            }
        }));
    }

    @Override // E3.r
    public void Z0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            X6 x6A = X6.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                S6 s6O = this.f4530b.o(interfaceC1443q.asBinder());
                if (s6O == null) {
                    return;
                }
                s6O.e(i10, x6A);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e10);
        }
    }

    @Override // E3.r
    public void Z1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, final Bundle bundle2) {
        if (interfaceC1443q == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            final T6 t6A = T6.a(bundle);
            c5(interfaceC1443q, i10, t6A, y5(new e() { // from class: E3.v5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.y0(gVar, t6A, bundle2);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e10);
        }
    }

    public void Z4(final InterfaceC1443q interfaceC1443q, final C1375h3.g gVar) {
        if (interfaceC1443q == null || gVar == null) {
            a7.a(interfaceC1443q);
            return;
        }
        final I3 i32 = (I3) this.f4529a.get();
        if (i32 == null || i32.t0()) {
            a7.a(interfaceC1443q);
        } else {
            this.f4531c.add(gVar);
            t2.a0.g1(i32.X(), new Runnable() { // from class: E3.I5
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    I6.B4(this.f4525a, gVar, i32, interfaceC1443q);
                }
            });
        }
    }

    @Override // E3.r
    public void b1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        Y(interfaceC1443q, i10, bundle, true);
    }

    @Override // E3.r
    public void b3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, final long j10) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6071C c6071cB = C6071C.b(bundle);
            m5(interfaceC1443q, i10, 31, y5(h5(new e() { // from class: E3.f6
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.H0(gVar, AbstractC2011u.B(c6071cB), 0, j10);
                }
            }, new G6())));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void c0(InterfaceC1443q interfaceC1443q, int i10, final boolean z10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 26, x5(new InterfaceC6627n() { // from class: E3.u5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).e0(z10);
            }
        }));
    }

    @Override // E3.r
    public void c3(InterfaceC1443q interfaceC1443q, int i10, final int i11, IBinder iBinder) {
        if (interfaceC1443q == null || iBinder == null || i11 < 0) {
            return;
        }
        try {
            final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new C1474u(), BinderC6095j.a(iBinder));
            m5(interfaceC1443q, i10, 20, y5(g5(new e() { // from class: E3.A5
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i12) {
                    return i32.w0(gVar, abstractC2011uD);
                }
            }, new c() { // from class: E3.B5
                @Override // E3.I6.c
                public final void a(N6 n62, C1375h3.g gVar, List list) {
                    n62.H0(this.f4377a.j5(gVar, n62, i11), list);
                }
            })));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
        }
    }

    @Override // E3.r
    public void d1(InterfaceC1443q interfaceC1443q, int i10, final float f10) {
        if (interfaceC1443q == null || f10 <= 0.0f) {
            return;
        }
        m5(interfaceC1443q, i10, 13, x5(new InterfaceC6627n() { // from class: E3.j5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).t(f10);
            }
        }));
    }

    @Override // E3.r
    public void d2(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        r5(gVarK, i10);
    }

    M6 d5(M6 m62) {
        AbstractC2011u abstractC2011uB = m62.f4664D.b();
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        r.a aVarQ = P9.r.q();
        for (int i10 = 0; i10 < abstractC2011uB.size(); i10++) {
            h0.a aVar = (h0.a) abstractC2011uB.get(i10);
            q2.a0 a0VarC = aVar.c();
            String strE5 = (String) this.f4532d.get(a0VarC);
            if (strE5 == null) {
                strE5 = e5(a0VarC);
            }
            aVarQ.f(a0VarC, strE5);
            aVarT.a(aVar.a(strE5));
        }
        this.f4532d = aVarQ.c();
        M6 m6B = m62.b(new q2.h0(aVarT.k()));
        if (m6B.f4665E.f56805D.isEmpty()) {
            return m6B;
        }
        d0.c cVarH = m6B.f4665E.I().H();
        P9.X it = m6B.f4665E.f56805D.values().iterator();
        while (it.hasNext()) {
            q2.b0 b0Var = (q2.b0) it.next();
            q2.a0 a0Var = b0Var.f56743a;
            String str = (String) this.f4532d.get(a0Var);
            if (str != null) {
                cVarH.F(new q2.b0(a0Var.a(str), b0Var.f56744b));
            } else {
                cVarH.F(b0Var);
            }
        }
        return m6B.x(cVarH.G());
    }

    @Override // E3.r
    public void e0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6077I c6077iB = C6077I.b(bundle);
            m5(interfaceC1443q, i10, 19, x5(new InterfaceC6627n() { // from class: E3.d6
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((N6) obj).C(c6077iB);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e10);
        }
    }

    @Override // E3.r
    public void f3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, final boolean z10) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6088c c6088cA = C6088c.a(bundle);
            m5(interfaceC1443q, i10, 35, x5(new InterfaceC6627n() { // from class: E3.P5
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((N6) obj).W0(c6088cA, z10);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e10);
        }
    }

    public C1363g f5() {
        return this.f4530b;
    }

    @Override // E3.r
    public void g3(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null || i11 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 10, w5(new b() { // from class: E3.h5
            @Override // E3.I6.b
            public final void a(N6 n62, C1375h3.g gVar) {
                n62.E0(this.f5342a.j5(gVar, n62, i11));
            }
        }));
    }

    @Override // E3.r
    public void h1(InterfaceC1443q interfaceC1443q, int i10, final float f10) {
        if (interfaceC1443q == null || f10 < 0.0f || f10 > 1.0f) {
            return;
        }
        m5(interfaceC1443q, i10, 24, x5(new InterfaceC6627n() { // from class: E3.W5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).w(f10);
            }
        }));
    }

    @Override // E3.r
    public void h2(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final q2.S sA = q2.S.a(bundle);
            a5(interfaceC1443q, i10, 40010, y5(new e() { // from class: E3.H6
                @Override // E3.I6.e
                public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                    return i32.J0(gVar, sA);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for Rating", e10);
        }
    }

    @Override // E3.r
    public void h3(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, final int i11, final long j10) {
        if (interfaceC1443q == null || iBinder == null) {
            return;
        }
        if (i11 == -1 || i11 >= 0) {
            try {
                final AbstractC2011u abstractC2011uD = AbstractC6622i.d(new C1474u(), BinderC6095j.a(iBinder));
                m5(interfaceC1443q, i10, 20, y5(h5(new e() { // from class: E3.H5
                    @Override // E3.I6.e
                    public final Object a(I3 i32, C1375h3.g gVar, int i12) {
                        return I6.I4(abstractC2011uD, i11, j10, i32, gVar, i12);
                    }
                }, new G6())));
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e10);
            }
        }
    }

    @Override // E3.r
    public void i0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final q2.d0 d0VarJ = q2.d0.J(bundle);
            m5(interfaceC1443q, i10, 29, x5(new InterfaceC6627n() { // from class: E3.m5
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((N6) obj).P(this.f5429a.A5(d0VarJ));
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e10);
        }
    }

    @Override // E3.r
    public void i1(InterfaceC1443q interfaceC1443q, int i10, final int i11) {
        if (interfaceC1443q == null || i11 < 0) {
            return;
        }
        m5(interfaceC1443q, i10, 25, x5(new InterfaceC6627n() { // from class: E3.i6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).S0(i11);
            }
        }));
    }

    @Override // E3.r
    public void j2(InterfaceC1443q interfaceC1443q, int i10, final String str, Bundle bundle) {
        final Y2 y2A;
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "search(): Ignoring empty query");
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        a5(interfaceC1443q, i10, 50005, u5(new e() { // from class: E3.l6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                String str2 = str;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(i32);
                return I6.K3(str2, y22, null, gVar, i11);
            }
        }));
    }

    public void k5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 1, x5(new InterfaceC6627n() { // from class: E3.l5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).pause();
            }
        }));
    }

    public void l5(final C1375h3.g gVar, int i10) {
        n5(gVar, i10, 1, x5(new InterfaceC6627n() { // from class: E3.C5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                I6.U4(this.f4391a, gVar, (N6) obj);
            }
        }));
    }

    @Override // E3.r
    public void m1(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 26, x5(new InterfaceC6627n() { // from class: E3.T5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).M();
            }
        }));
    }

    @Override // E3.r
    public void n2(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        q5(gVarK, i10);
    }

    public void o5() {
        for (C1375h3.g gVar : this.f4530b.j()) {
            this.f4530b.t(gVar);
            C1375h3.f fVarC = gVar.c();
            if (fVarC != null) {
                fVarC.b(0);
            }
        }
        Iterator it = this.f4531c.iterator();
        while (it.hasNext()) {
            C1375h3.f fVarC2 = ((C1375h3.g) it.next()).c();
            if (fVarC2 != null) {
                fVarC2.b(0);
            }
        }
        this.f4531c.clear();
        this.f4529a.clear();
    }

    public void p5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 11, x5(new InterfaceC6627n() { // from class: E3.t5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).U0();
            }
        }));
    }

    @Override // E3.r
    public void q0(InterfaceC1443q interfaceC1443q, int i10, final String str, Bundle bundle) {
        final Y2 y2A;
        if (interfaceC1443q == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC6635w.i("MediaSessionStub", "subscribe(): Ignoring empty parentId");
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        a5(interfaceC1443q, i10, 50001, u5(new e() { // from class: E3.g6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                String str2 = str;
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(i32);
                return I6.v4(str2, y22, null, gVar, i11);
            }
        }));
    }

    @Override // E3.r
    public void q1(InterfaceC1443q interfaceC1443q, int i10) {
        C1375h3.g gVarK;
        if (interfaceC1443q == null || (gVarK = this.f4530b.k(interfaceC1443q.asBinder())) == null) {
            return;
        }
        l5(gVarK, i10);
    }

    @Override // E3.r
    public void q3(InterfaceC1443q interfaceC1443q, int i10, final boolean z10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 1, x5(new InterfaceC6627n() { // from class: E3.i5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).V(z10);
            }
        }));
    }

    public void q5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 12, x5(new InterfaceC6627n() { // from class: E3.K5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).T0();
            }
        }));
    }

    @Override // E3.r
    public void r2(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 6, x5(new InterfaceC6627n() { // from class: E3.F5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).J();
            }
        }));
    }

    @Override // E3.r
    public void r3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        if (interfaceC1443q == null || bundle == null) {
            return;
        }
        try {
            final C6083O c6083oA = C6083O.a(bundle);
            m5(interfaceC1443q, i10, 13, x5(new InterfaceC6627n() { // from class: E3.w5
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((N6) obj).e(c6083oA);
                }
            }));
        } catch (RuntimeException e10) {
            AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e10);
        }
    }

    public void r5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 9, x5(new InterfaceC6627n() { // from class: E3.L5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).k0();
            }
        }));
    }

    public void s5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 7, x5(new InterfaceC6627n() { // from class: E3.z5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).U();
            }
        }));
    }

    @Override // E3.r
    public void t0(InterfaceC1443q interfaceC1443q, int i10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 2, x5(new InterfaceC6627n() { // from class: E3.b6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).s();
            }
        }));
    }

    @Override // E3.r
    public void v1(InterfaceC1443q interfaceC1443q, int i10, final long j10) {
        if (interfaceC1443q == null) {
            return;
        }
        m5(interfaceC1443q, i10, 5, x5(new InterfaceC6627n() { // from class: E3.j6
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).z(j10);
            }
        }));
    }

    @Override // E3.r
    public void x1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
        final Y2 y2A;
        if (interfaceC1443q == null) {
            return;
        }
        if (bundle == null) {
            y2A = null;
        } else {
            try {
                y2A = Y2.a(bundle);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e10);
                return;
            }
        }
        a5(interfaceC1443q, i10, 50000, u5(new e() { // from class: E3.a6
            @Override // E3.I6.e
            public final Object a(I3 i32, C1375h3.g gVar, int i11) {
                Y2 y22 = y2A;
                android.support.v4.media.session.b.a(i32);
                return I6.P3(y22, null, gVar, i11);
            }
        }));
    }

    public void z5(C1375h3.g gVar, int i10) {
        n5(gVar, i10, 3, x5(new InterfaceC6627n() { // from class: E3.Y5
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                ((N6) obj).stop();
            }
        }));
    }
}
