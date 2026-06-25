package E3;

import E3.A;
import E3.AbstractC1466t;
import E3.B2;
import F3.e;
import F3.j;
import F3.n;
import F3.v;
import P9.AbstractC2011u;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.C6105t;
import q2.InterfaceC6084P;
import q2.Y;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6634v;
import t2.InterfaceC6621h;
import t2.InterfaceC6623j;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class B2 implements A.d {

    /* JADX INFO: renamed from: a */
    final Context f4333a;

    /* JADX INFO: renamed from: b */
    private final A f4334b;

    /* JADX INFO: renamed from: c */
    private final Y6 f4335c;

    /* JADX INFO: renamed from: d */
    private final C6634v f4336d;

    /* JADX INFO: renamed from: e */
    private final c f4337e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6621h f4338f;

    /* JADX INFO: renamed from: h */
    private final Bundle f4340h;

    /* JADX INFO: renamed from: i */
    private final long f4341i;

    /* JADX INFO: renamed from: j */
    private F3.j f4342j;

    /* JADX INFO: renamed from: k */
    private F3.e f4343k;

    /* JADX INFO: renamed from: l */
    private boolean f4344l;

    /* JADX INFO: renamed from: m */
    private boolean f4345m;

    /* JADX INFO: renamed from: p */
    private boolean f4348p;

    /* JADX INFO: renamed from: n */
    private e f4346n = new e();

    /* JADX INFO: renamed from: o */
    private e f4347o = new e();

    /* JADX INFO: renamed from: q */
    private d f4349q = new d();

    /* JADX INFO: renamed from: r */
    private long f4350r = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    private long f4351s = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    private final AbstractC2011u f4339g = AbstractC2011u.A();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ResultReceiver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.w f4352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Handler handler, com.google.common.util.concurrent.w wVar) {
            super(handler);
            this.f4352a = wVar;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            com.google.common.util.concurrent.w wVar = this.f4352a;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            wVar.F(new X6(i10, bundle));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends e.b {
        private b() {
        }

        @Override // F3.e.b
        public void a() {
            F3.e eVarP1 = B2.this.P1();
            if (eVarP1 != null) {
                B2.this.H1(eVarP1.c());
            }
        }

        @Override // F3.e.b
        public void b() {
            B2.this.Q1().a();
        }

        @Override // F3.e.b
        public void c() {
            B2.this.Q1().a();
        }

        /* synthetic */ b(B2 b22, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c extends j.a {

        /* JADX INFO: renamed from: d */
        private final Handler f4355d;

        public c(Looper looper) {
            this.f4355d = new Handler(looper, new Handler.Callback() { // from class: E3.D2
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return B2.c.o(this.f4402a, message);
                }
            });
        }

        public static /* synthetic */ boolean o(c cVar, Message message) {
            cVar.getClass();
            if (message.what == 1) {
                B2 b22 = B2.this;
                b22.U1(false, b22.f4347o);
            }
            return true;
        }

        public static /* synthetic */ void p(c cVar, String str, Bundle bundle, A.c cVar2) {
            A aQ1 = B2.this.Q1();
            Bundle bundle2 = Bundle.EMPTY;
            T6 t62 = new T6(str, bundle2);
            if (bundle == null) {
                bundle = bundle2;
            }
            B2.W1(cVar2.q0(aQ1, t62, bundle));
        }

        public static /* synthetic */ void q(c cVar, boolean z10, A.c cVar2) {
            cVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z10);
            B2.W1(cVar2.q0(B2.this.Q1(), new T6("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle));
        }

        private void s() {
            if (this.f4355d.hasMessages(1)) {
                return;
            }
            this.f4355d.sendEmptyMessageDelayed(1, B2.this.f4341i);
        }

        @Override // F3.j.a
        public void a(j.e eVar) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.c(eVar);
            s();
        }

        @Override // F3.j.a
        public void b(final boolean z10) {
            B2.this.Q1().i1(new InterfaceC6627n() { // from class: E3.C2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    B2.c.q(this.f4385a, z10, (A.c) obj);
                }
            });
        }

        @Override // F3.j.a
        public void c(Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.h(bundle);
            B2.this.f4348p = true;
            s();
        }

        @Override // F3.j.a
        public void d(F3.m mVar) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.b(mVar);
            s();
        }

        @Override // F3.j.a
        public void e(F3.v vVar) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.d(B2.J1(vVar));
            s();
        }

        @Override // F3.j.a
        public void f(List list) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.e(B2.I1(list));
            s();
        }

        @Override // F3.j.a
        public void g(CharSequence charSequence) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.f(charSequence);
            s();
        }

        @Override // F3.j.a
        public void h(int i10) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.g(i10);
            s();
        }

        @Override // F3.j.a
        public void i() {
            B2.this.Q1().a();
        }

        @Override // F3.j.a
        public void j(final String str, final Bundle bundle) {
            if (str == null) {
                return;
            }
            B2.this.Q1().i1(new InterfaceC6627n() { // from class: E3.E2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    B2.c.p(this.f4416a, str, bundle, (A.c) obj);
                }
            });
        }

        @Override // F3.j.a
        public void k() {
            if (!B2.this.f4345m) {
                B2.this.Z1();
                return;
            }
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.a(B2.J1(B2.this.f4342j.j()), B2.this.f4342j.n(), B2.this.f4342j.o());
            b(B2.this.f4342j.q());
            this.f4355d.removeMessages(1);
            B2 b23 = B2.this;
            b23.U1(false, b23.f4347o);
        }

        @Override // F3.j.a
        public void l(int i10) {
            B2 b22 = B2.this;
            b22.f4347o = b22.f4347o.i(i10);
            s();
        }

        public void r() {
            this.f4355d.removeCallbacksAndMessages(null);
        }
    }

    public B2(Context context, A a10, Y6 y62, Bundle bundle, Looper looper, InterfaceC6621h interfaceC6621h, long j10) {
        this.f4336d = new C6634v(looper, InterfaceC6623j.f60596a, new C6634v.b() { // from class: E3.u2
            @Override // t2.C6634v.b
            public final void a(Object obj, C6105t c6105t) {
                ((InterfaceC6084P.d) obj).X(this.f5540a.Q1(), new InterfaceC6084P.c(c6105t));
            }
        });
        this.f4333a = context;
        this.f4334b = a10;
        this.f4337e = new c(looper);
        this.f4335c = y62;
        this.f4340h = bundle;
        this.f4338f = interfaceC6621h;
        this.f4341i = j10;
    }

    private void B1(final List list, final int i10) {
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() { // from class: E3.v2
            @Override // java.lang.Runnable
            public final void run() {
                B2.i1(this.f5551a, atomicInteger, list, arrayList, i10);
            }
        };
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = ((C6071C) list.get(i11)).f56331e.f56528k;
            if (bArr == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.p pVarC = this.f4338f.c(bArr);
                arrayList.add(pVarC);
                Handler handler = Q1().f4304e;
                Objects.requireNonNull(handler);
                pVarC.k(runnable, new C2.V(handler));
            }
        }
    }

    private static d C1(boolean z10, e eVar, d dVar, e eVar2, String str, long j10, boolean z11, int i10, long j11, String str2, boolean z12, Context context) {
        int iN1;
        C6077I c6077i;
        U6 u6U;
        AbstractC2011u abstractC2011uS;
        int iK;
        List list = eVar.f4366d;
        List list2 = eVar2.f4366d;
        boolean z13 = list != list2;
        O6 o6F = z13 ? O6.F(list2) : ((O6) dVar.f4357a.f4675j).y();
        boolean z14 = eVar.f4365c != eVar2.f4365c || z10;
        long jO1 = O1(eVar.f4364b);
        long jO12 = O1(eVar2.f4364b);
        boolean z15 = jO1 != jO12 || z10;
        long j12 = AbstractC1466t.j(eVar2.f4365c);
        boolean z16 = z13;
        if (z14 || z15 || z16) {
            boolean z17 = z14;
            iN1 = N1(eVar2.f4366d, jO12);
            F3.m mVar = eVar2.f4365c;
            boolean z18 = mVar != null;
            C6077I c6077iC = (z18 && z17) ? AbstractC1466t.C(mVar, i10) : (z18 || !z15) ? dVar.f4357a.f4691z : iN1 == -1 ? C6077I.f56472K : AbstractC1466t.A(((n.h) eVar2.f4366d.get(iN1)).c(), i10);
            if (iN1 != -1 || !z17) {
                if (iN1 != -1) {
                    o6F = o6F.z();
                    if (z18) {
                        o6F = o6F.C(iN1, AbstractC1466t.y(((C6071C) AbstractC6614a.e(o6F.G(iN1))).f56327a, eVar2.f4365c, i10), j12);
                    }
                } else {
                    iN1 = 0;
                }
                c6077i = c6077iC;
            } else if (z18) {
                AbstractC6635w.i("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                o6F = o6F.A(AbstractC1466t.w(eVar2.f4365c, i10), j12);
                iN1 = o6F.t() - 1;
                c6077i = c6077iC;
            } else {
                o6F = o6F.z();
                iN1 = 0;
                c6077i = c6077iC;
            }
        } else {
            M6 m62 = dVar.f4357a;
            iN1 = m62.f4668c.f5042a.f56619c;
            c6077i = m62.f4691z;
        }
        O6 o62 = o6F;
        int i11 = iN1;
        j.e eVar3 = eVar2.f4363a;
        InterfaceC6084P.b bVarO = AbstractC1466t.O(eVar2.f4364b, eVar3 != null ? eVar3.e() : 0, j10, z11);
        CharSequence charSequence = eVar.f4367e;
        CharSequence charSequence2 = eVar2.f4367e;
        C6077I c6077iD = charSequence == charSequence2 ? dVar.f4357a.f4678m : AbstractC1466t.D(charSequence2);
        int iT = AbstractC1466t.T(eVar2.f4368f);
        boolean zY = AbstractC1466t.Y(eVar2.f4369g);
        F3.v vVar = eVar.f4364b;
        F3.v vVar2 = eVar2.f4364b;
        if (vVar != vVar2 || z12) {
            u6U = AbstractC1466t.U(vVar2, z11);
            abstractC2011uS = AbstractC1466t.s(eVar2.f4364b, bVarO, eVar2.f4370h);
        } else {
            u6U = dVar.f4358b;
            abstractC2011uS = dVar.f4360d;
        }
        U6 u62 = u6U;
        AbstractC2011u abstractC2011u = abstractC2011uS;
        C6082N c6082nH = AbstractC1466t.H(eVar2.f4364b, context);
        V6 v6W = AbstractC1466t.W(eVar2.f4364b, context);
        long jG = AbstractC1466t.g(eVar2.f4364b, eVar2.f4365c, j11);
        long jE = AbstractC1466t.e(eVar2.f4364b, eVar2.f4365c, j11);
        int iD = AbstractC1466t.d(eVar2.f4364b, eVar2.f4365c, j11);
        long jZ = AbstractC1466t.Z(eVar2.f4364b, eVar2.f4365c, j11);
        boolean zP = AbstractC1466t.p(eVar2.f4365c);
        C6083O c6083oJ = AbstractC1466t.J(eVar2.f4364b);
        C6088c c6088cB = AbstractC1466t.b(eVar2.f4363a);
        boolean zG = AbstractC1466t.G(eVar2.f4364b);
        try {
            iK = AbstractC1466t.K(eVar2.f4364b, eVar2.f4365c, j11);
        } catch (AbstractC1466t.b unused) {
            AbstractC6635w.d("MCImplLegacy", String.format("Received invalid playback state %s from package %s. Keeping the previous state.", Integer.valueOf(eVar2.f4364b.o()), str));
            iK = dVar.f4357a.f4690y;
        }
        int i12 = iK;
        boolean zO = AbstractC1466t.o(eVar2.f4364b);
        C6101p c6101pH = AbstractC1466t.h(eVar2.f4363a, str2);
        int i13 = AbstractC1466t.i(eVar2.f4363a);
        boolean zM = AbstractC1466t.m(eVar2.f4363a);
        M6 m63 = dVar.f4357a;
        return K1(o62, c6077i, i11, c6077iD, iT, zY, u62, bVarO, abstractC2011u, eVar2.f4370h, c6082nH, v6W, j12, jG, jE, iD, jZ, zP, c6083oJ, c6088cB, zG, i12, zO, c6101pH, i13, zM, m63.f4661A, m63.f4662B, m63.f4663C);
    }

    private static int D1(int i10, int i11, int i12) {
        return i10 < i11 ? i10 : i10 + i12;
    }

    private static int E1(int i10, int i11, int i12) {
        int i13 = i12 - i11;
        if (i10 < i11) {
            return i10;
        }
        if (i10 < i12) {
            return -1;
        }
        return i10 - i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair F1(E3.B2.e r5, E3.B2.d r6, E3.B2.e r7, E3.B2.d r8, long r9) {
        /*
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            E3.M6 r2 = r6.f4357a
            q2.Y r2 = r2.f4675j
            boolean r2 = r2.u()
            E3.M6 r3 = r8.f4357a
            q2.Y r3 = r3.f4675j
            boolean r3 = r3.u()
            r4 = 0
            if (r2 == 0) goto L22
            if (r3 == 0) goto L22
        L1f:
            r0 = r4
            r1 = r0
            goto L86
        L22:
            if (r2 == 0) goto L27
            if (r3 != 0) goto L27
            goto L86
        L27:
            E3.M6 r6 = r6.f4357a
            q2.C r6 = r6.C()
            java.lang.Object r6 = t2.AbstractC6614a.i(r6)
            q2.C r6 = (q2.C6071C) r6
            E3.M6 r2 = r8.f4357a
            q2.Y r2 = r2.f4675j
            E3.O6 r2 = (E3.O6) r2
            boolean r2 = r2.x(r6)
            if (r2 != 0) goto L45
            r5 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L86
        L45:
            E3.M6 r0 = r8.f4357a
            q2.C r0 = r0.C()
            boolean r6 = r6.equals(r0)
            r0 = 1
            if (r6 == 0) goto L82
            F3.v r6 = r5.f4364b
            F3.m r5 = r5.f4365c
            long r5 = E3.AbstractC1466t.g(r6, r5, r9)
            F3.v r2 = r7.f4364b
            F3.m r7 = r7.f4365c
            long r9 = E3.AbstractC1466t.g(r2, r7, r9)
            r2 = 0
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 != 0) goto L70
            E3.M6 r7 = r8.f4357a
            int r7 = r7.f4673h
            if (r7 != r0) goto L70
            r0 = r1
            goto L86
        L70:
            long r5 = r5 - r9
            long r5 = java.lang.Math.abs(r5)
            r7 = 100
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L1f
            r5 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = r4
            goto L86
        L82:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L86:
            android.util.Pair r5 = android.util.Pair.create(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.B2.F1(E3.B2$e, E3.B2$d, E3.B2$e, E3.B2$d, long):android.util.Pair");
    }

    private void G1() {
        Q1().k1(new Runnable() { // from class: E3.q2
            @Override // java.lang.Runnable
            public final void run() {
                B2.f(this.f5493a);
            }
        });
    }

    public void H1(final n.j jVar) {
        Q1().k1(new Runnable() { // from class: E3.j2
            @Override // java.lang.Runnable
            public final void run() {
                B2.h(this.f5359a, jVar);
            }
        });
        Q1().f4304e.postDelayed(new Runnable() { // from class: E3.t2
            @Override // java.lang.Runnable
            public final void run() {
                B2.o(this.f5532a);
            }
        }, 500L);
    }

    public static List I1(List list) {
        return list == null ? Collections.EMPTY_LIST : L6.h(list);
    }

    public static F3.v J1(F3.v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar.k() > 0.0f) {
            return vVar;
        }
        AbstractC6635w.i("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        return new v.c(vVar).h(vVar.o(), vVar.m(), 1.0f, vVar.j()).b();
    }

    private static d K1(O6 o62, C6077I c6077i, int i10, C6077I c6077i2, int i11, boolean z10, U6 u62, InterfaceC6084P.b bVar, AbstractC2011u abstractC2011u, Bundle bundle, C6082N c6082n, V6 v62, long j10, long j11, long j12, int i12, long j13, boolean z11, C6083O c6083o, C6088c c6088c, boolean z12, int i13, boolean z13, C6101p c6101p, int i14, boolean z14, long j14, long j15, long j16) {
        W6 w62 = new W6(L1(i10, o62.G(i10), j11, z11), z11, SystemClock.elapsedRealtime(), j10, j12, i12, j13, -9223372036854775807L, j10, j12);
        InterfaceC6084P.e eVar = W6.f5030k;
        return new d(new M6(c6082n, 0, w62, eVar, eVar, 0, c6083o, i11, z10, q2.l0.f56919e, o62, 0, c6077i2, 1.0f, c6088c, C6407e.f59083d, c6101p, i14, z14, z12, 1, 0, i13, z13, false, c6077i, j14, j15, j16, q2.h0.f56877b, q2.d0.f56766F), u62, bVar, abstractC2011u, bundle, v62);
    }

    private static InterfaceC6084P.e L1(int i10, C6071C c6071c, long j10, boolean z10) {
        return new InterfaceC6084P.e(null, i10, c6071c, null, i10, j10, j10, z10 ? 0 : -1, z10 ? 0 : -1);
    }

    private static W6 M1(InterfaceC6084P.e eVar, boolean z10, long j10, long j11, int i10, long j12) {
        return new W6(eVar, z10, SystemClock.elapsedRealtime(), j10, j11, i10, j12, -9223372036854775807L, j10, j11);
    }

    private static int N1(List list, long j10) {
        if (list != null && j10 != -1) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((n.h) list.get(i10)).d() == j10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static long O1(F3.v vVar) {
        if (vVar == null) {
            return -1L;
        }
        return vVar.c();
    }

    private static Bundle R1(Bundle bundle) {
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    private static String S1(F3.j jVar) {
        MediaController.PlaybackInfo playbackInfo;
        if (Build.VERSION.SDK_INT >= 30 && (playbackInfo = ((MediaController) jVar.f()).getPlaybackInfo()) != null) {
            return playbackInfo.getVolumeControlId();
        }
        return null;
    }

    private void T1(List list, List list2, int i10) {
        Bitmap bitmap;
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) list.get(i11);
            if (pVar != null) {
                try {
                    bitmap = (Bitmap) com.google.common.util.concurrent.j.b(pVar);
                } catch (CancellationException | ExecutionException e10) {
                    AbstractC6635w.c("MCImplLegacy", "Failed to get bitmap", e10);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            this.f4342j.a(AbstractC1466t.t((C6071C) list2.get(i11), bitmap), i10 + i11);
        }
    }

    public void U1(boolean z10, final e eVar) {
        if (this.f4344l || !this.f4345m) {
            return;
        }
        d dVarC1 = C1(z10, this.f4346n, this.f4349q, eVar, this.f4342j.h(), this.f4342j.e(), this.f4342j.r(), this.f4342j.m(), Q1().f1(), S1(this.f4342j), this.f4348p, this.f4333a);
        Pair pairF1 = F1(this.f4346n, this.f4349q, eVar, dVarC1, Q1().f1());
        d2(z10, eVar, true, dVarC1, (Integer) pairF1.first, (Integer) pairF1.second);
        if (this.f4348p) {
            this.f4348p = false;
            Q1().i1(new InterfaceC6627n() { // from class: E3.s2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((A.c) obj).a0(this.f5520a.Q1(), eVar.f4370h);
                }
            });
        }
    }

    private boolean V1() {
        return !this.f4349q.f4357a.f4675j.u();
    }

    private void X1() {
        Y.d dVar = new Y.d();
        AbstractC6614a.g(Y1() && V1());
        M6 m62 = this.f4349q.f4357a;
        O6 o62 = (O6) m62.f4675j;
        int i10 = m62.f4668c.f5042a.f56619c;
        C6071C c6071c = o62.r(i10, dVar).f56680c;
        if (o62.H(i10) == -1) {
            C6071C.i iVar = c6071c.f56334h;
            if (iVar.f56443a != null) {
                if (this.f4349q.f4357a.f4685t) {
                    j.f fVarP = this.f4342j.p();
                    C6071C.i iVar2 = c6071c.f56334h;
                    fVarP.f(iVar2.f56443a, R1(iVar2.f56445c));
                } else {
                    j.f fVarP2 = this.f4342j.p();
                    C6071C.i iVar3 = c6071c.f56334h;
                    fVarP2.j(iVar3.f56443a, R1(iVar3.f56445c));
                }
            } else if (iVar.f56444b != null) {
                if (this.f4349q.f4357a.f4685t) {
                    j.f fVarP3 = this.f4342j.p();
                    C6071C.i iVar4 = c6071c.f56334h;
                    fVarP3.e(iVar4.f56444b, R1(iVar4.f56445c));
                } else {
                    j.f fVarP4 = this.f4342j.p();
                    C6071C.i iVar5 = c6071c.f56334h;
                    fVarP4.i(iVar5.f56444b, R1(iVar5.f56445c));
                }
            } else if (this.f4349q.f4357a.f4685t) {
                this.f4342j.p().d(c6071c.f56327a, R1(c6071c.f56334h.f56445c));
            } else {
                this.f4342j.p().h(c6071c.f56327a, R1(c6071c.f56334h.f56445c));
            }
        } else if (this.f4349q.f4357a.f4685t) {
            this.f4342j.p().c();
        } else {
            this.f4342j.p().g();
        }
        if (this.f4349q.f4357a.f4668c.f5042a.f56623g != 0) {
            this.f4342j.p().l(this.f4349q.f4357a.f4668c.f5042a.f56623g);
        }
        if (p0().c(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < o62.t(); i11++) {
                if (i11 != i10 && o62.H(i11) == -1) {
                    arrayList.add(o62.r(i11, dVar).f56680c);
                }
            }
            B1(arrayList, 0);
        }
    }

    private boolean Y1() {
        return this.f4349q.f4357a.f4690y != 1;
    }

    private void a2(int i10, long j10) {
        Integer num;
        Integer num2;
        int i11;
        long j11;
        long j12;
        long j13;
        int i12 = i10;
        long j14 = j10;
        AbstractC6614a.a(i12 >= 0);
        int iK0 = K0();
        q2.Y y10 = this.f4349q.f4357a.f4675j;
        if ((y10.u() || i12 < y10.t()) && !D()) {
            if (i12 != iK0) {
                long jH = ((O6) this.f4349q.f4357a.f4675j).H(i12);
                if (jH != -1) {
                    this.f4342j.p().s(jH);
                    num = 2;
                } else {
                    AbstractC6635w.i("MCImplLegacy", "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=" + i12);
                    i12 = iK0;
                    num = null;
                }
            } else {
                i12 = iK0;
                num = null;
            }
            long currentPosition = getCurrentPosition();
            if (j14 == -9223372036854775807L) {
                num2 = null;
                j14 = currentPosition;
            } else {
                this.f4342j.p().l(j14);
                num2 = 1;
            }
            if (num == null) {
                long jI0 = I0();
                long duration = getDuration();
                long jMax = j14 < currentPosition ? j14 : Math.max(j14, jI0);
                j11 = jMax;
                i11 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j12 = jMax - j14;
                j13 = duration;
            } else {
                i11 = 0;
                j11 = 0;
                j12 = 0;
                j13 = -9223372036854775807L;
            }
            M6 m6S = this.f4349q.f4357a.s(M1(L1(i12, !y10.u() ? y10.r(i12, new Y.d()).f56680c : null, j14, false), false, j13, j11, i11, j12));
            if (m6S.f4690y != 1) {
                m6S = m6S.l(2, null);
            }
            M6 m62 = m6S;
            d dVar = this.f4349q;
            e2(new d(m62, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), num2, num);
        }
    }

    public static /* synthetic */ void d1(B2 b22, d dVar, A.c cVar) {
        W1(cVar.O(b22.Q1(), dVar.f4360d));
        cVar.K(b22.Q1(), dVar.f4360d);
        cVar.G(b22.Q1(), dVar.f4360d);
    }

    private void d2(boolean z10, e eVar, boolean z11, final d dVar, final Integer num, final Integer num2) {
        e eVar2 = this.f4346n;
        final d dVar2 = this.f4349q;
        if (eVar2 != eVar) {
            this.f4346n = new e(eVar);
        }
        if (z11) {
            this.f4347o = this.f4346n;
        }
        this.f4349q = dVar;
        if (z10) {
            Q1().h1();
            if (dVar2.f4360d.equals(dVar.f4360d)) {
                return;
            }
            Q1().f4304e.post(new Runnable() { // from class: E3.w2
                @Override // java.lang.Runnable
                public final void run() {
                    B2 b22 = this.f5578a;
                    b22.Q1().i1(new InterfaceC6627n() { // from class: E3.r2
                        @Override // t2.InterfaceC6627n
                        public final void accept(Object obj) {
                            B2.r(this.f5506a, dVar, (A.c) obj);
                        }
                    });
                }
            });
            return;
        }
        if (!dVar2.f4357a.f4675j.equals(dVar.f4357a.f4675j)) {
            this.f4336d.h(0, new C6634v.a() { // from class: E3.f2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    B2.o1(dVar, (InterfaceC6084P.d) obj);
                }
            });
        }
        if (!Objects.equals(eVar2.f4367e, eVar.f4367e)) {
            this.f4336d.h(15, new C6634v.a() { // from class: E3.h2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).c0(dVar.f4357a.f4678m);
                }
            });
        }
        if (num != null) {
            this.f4336d.h(11, new C6634v.a() { // from class: E3.i2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).m0(dVar2.f4357a.f4668c.f5042a, dVar.f4357a.f4668c.f5042a, num.intValue());
                }
            });
        }
        if (num2 != null) {
            this.f4336d.h(1, new C6634v.a() { // from class: E3.k2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).E(dVar.f4357a.C(), num2.intValue());
                }
            });
        }
        if (!L6.a(eVar2.f4364b, eVar.f4364b)) {
            final C6082N c6082nH = AbstractC1466t.H(eVar.f4364b, this.f4333a);
            this.f4336d.h(10, new C6634v.a() { // from class: E3.l2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).t0(c6082nH);
                }
            });
            if (c6082nH != null) {
                this.f4336d.h(10, new C6634v.a() { // from class: E3.m2
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).H(c6082nH);
                    }
                });
            }
        }
        if (eVar2.f4365c != eVar.f4365c) {
            this.f4336d.h(14, new C6634v.a() { // from class: E3.n2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).V(this.f5437a.f4349q.f4357a.f4691z);
                }
            });
        }
        if (dVar2.f4357a.f4690y != dVar.f4357a.f4690y) {
            this.f4336d.h(4, new C6634v.a() { // from class: E3.o2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).J(dVar.f4357a.f4690y);
                }
            });
        }
        if (dVar2.f4357a.f4685t != dVar.f4357a.f4685t) {
            this.f4336d.h(5, new C6634v.a() { // from class: E3.p2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).s0(dVar.f4357a.f4685t, 4);
                }
            });
        }
        if (dVar2.f4357a.f4687v != dVar.f4357a.f4687v) {
            this.f4336d.h(7, new C6634v.a() { // from class: E3.x2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).y0(dVar.f4357a.f4687v);
                }
            });
        }
        if (!dVar2.f4357a.f4672g.equals(dVar.f4357a.f4672g)) {
            this.f4336d.h(12, new C6634v.a() { // from class: E3.y2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n(dVar.f4357a.f4672g);
                }
            });
        }
        if (dVar2.f4357a.f4673h != dVar.f4357a.f4673h) {
            this.f4336d.h(8, new C6634v.a() { // from class: E3.z2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).F(dVar.f4357a.f4673h);
                }
            });
        }
        if (dVar2.f4357a.f4674i != dVar.f4357a.f4674i) {
            this.f4336d.h(9, new C6634v.a() { // from class: E3.A2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).M(dVar.f4357a.f4674i);
                }
            });
        }
        if (!dVar2.f4357a.f4680o.equals(dVar.f4357a.f4680o)) {
            this.f4336d.h(20, new C6634v.a() { // from class: E3.Z1
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).e0(dVar.f4357a.f4680o);
                }
            });
        }
        if (!dVar2.f4357a.f4682q.equals(dVar.f4357a.f4682q)) {
            this.f4336d.h(29, new C6634v.a() { // from class: E3.a2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n0(dVar.f4357a.f4682q);
                }
            });
        }
        M6 m62 = dVar2.f4357a;
        int i10 = m62.f4683r;
        M6 m63 = dVar.f4357a;
        if (i10 != m63.f4683r || m62.f4684s != m63.f4684s) {
            this.f4336d.h(30, new C6634v.a() { // from class: E3.b2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    B2.m(dVar, (InterfaceC6084P.d) obj);
                }
            });
        }
        if (!dVar2.f4359c.equals(dVar.f4359c)) {
            this.f4336d.h(13, new C6634v.a() { // from class: E3.c2
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).I(dVar.f4359c);
                }
            });
        }
        if (!dVar2.f4358b.equals(dVar.f4358b)) {
            Q1().i1(new InterfaceC6627n() { // from class: E3.d2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((A.c) obj).i0(this.f5186a.Q1(), dVar.f4358b);
                }
            });
        }
        if (!dVar2.f4360d.equals(dVar.f4360d)) {
            Q1().i1(new InterfaceC6627n() { // from class: E3.e2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    B2.d1(this.f5206a, dVar, (A.c) obj);
                }
            });
        }
        if (dVar.f4362f != null) {
            Q1().i1(new InterfaceC6627n() { // from class: E3.g2
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((A.c) obj).U(this.f5252a.Q1(), dVar.f4362f);
                }
            });
        }
        this.f4336d.f();
    }

    private void e2(d dVar, Integer num, Integer num2) {
        d2(false, this.f4346n, false, dVar, num, num2);
    }

    public static /* synthetic */ void f(B2 b22) {
        b22.getClass();
        F3.e eVar = new F3.e(b22.f4333a, b22.f4335c.b(), new b(b22, null), b22.f4334b.d1());
        b22.f4343k = eVar;
        eVar.a();
    }

    public static /* synthetic */ void h(B2 b22, n.j jVar) {
        F3.j jVar2 = new F3.j(b22.f4333a, jVar);
        b22.f4342j = jVar2;
        jVar2.s(b22.f4337e, b22.Q1().f4304e);
    }

    public static /* synthetic */ void i1(B2 b22, AtomicInteger atomicInteger, List list, List list2, int i10) {
        b22.getClass();
        if (atomicInteger.incrementAndGet() == list.size()) {
            b22.T1(list2, list, i10);
        }
    }

    public static /* synthetic */ void m(d dVar, InterfaceC6084P.d dVar2) {
        M6 m62 = dVar.f4357a;
        dVar2.P(m62.f4683r, m62.f4684s);
    }

    public static /* synthetic */ void o(B2 b22) {
        if (b22.f4344l || b22.f4342j.r()) {
            return;
        }
        b22.Z1();
    }

    public static /* synthetic */ void o1(d dVar, InterfaceC6084P.d dVar2) {
        M6 m62 = dVar.f4357a;
        dVar2.S(m62.f4675j, m62.f4676k);
    }

    public static /* synthetic */ void r(B2 b22, d dVar, A.c cVar) {
        W1(cVar.O(b22.Q1(), dVar.f4360d));
        cVar.K(b22.Q1(), dVar.f4360d);
        cVar.G(b22.Q1(), dVar.f4360d);
    }

    @Override // E3.A.d
    public boolean A() {
        return this.f4345m;
    }

    @Override // E3.A.d
    public boolean A0() {
        return this.f4345m;
    }

    @Override // E3.A.d
    public void B(Surface surface) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support setting Surface");
    }

    @Override // E3.A.d
    public int B0() {
        return -1;
    }

    @Override // E3.A.d
    public void C(C6077I c6077i) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // E3.A.d
    public void C0(int i10, C6071C c6071c) {
        Q(i10, i10 + 1, AbstractC2011u.B(c6071c));
    }

    @Override // E3.A.d
    public boolean D() {
        return this.f4349q.f4357a.f4668c.f5043b;
    }

    @Override // E3.A.d
    public void D0(List list, int i10, long j10) {
        if (list.isEmpty()) {
            G();
            return;
        }
        M6 m6W = this.f4349q.f4357a.w(O6.f4766g.D(0, list), M1(L1(i10, (C6071C) list.get(i10), j10 == -9223372036854775807L ? 0L : j10, false), false, -9223372036854775807L, 0L, 0, 0L), 0);
        d dVar = this.f4349q;
        e2(new d(m6W, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (Y1()) {
            X1();
        }
    }

    @Override // E3.A.d
    public long E() {
        return this.f4349q.f4357a.f4668c.f5048g;
    }

    @Override // E3.A.d
    public void E0(int i10) {
        a2(i10, 0L);
    }

    @Override // E3.A.d
    public void F(boolean z10, int i10) {
        if (z10 != P0()) {
            M6 m6D = this.f4349q.f4357a.d(m0(), z10);
            d dVar = this.f4349q;
            e2(new d(m6D, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.b(z10 ? -100 : 100, i10);
    }

    @Override // E3.A.d
    public long F0() {
        return this.f4349q.f4357a.f4662B;
    }

    @Override // E3.A.d
    public void G() {
        T(0, Integer.MAX_VALUE);
    }

    @Override // E3.A.d
    public long G0() {
        return getCurrentPosition();
    }

    @Override // E3.A.d
    public void H(InterfaceC6084P.d dVar) {
        this.f4336d.j(dVar);
    }

    @Override // E3.A.d
    public void H0(int i10, List list) {
        AbstractC6614a.a(i10 >= 0);
        if (list.isEmpty()) {
            return;
        }
        O6 o62 = (O6) this.f4349q.f4357a.f4675j;
        if (o62.u()) {
            c2(list);
            return;
        }
        int iMin = Math.min(i10, h0().t());
        M6 m6V = this.f4349q.f4357a.v(o62.D(iMin, list), D1(K0(), iMin, list.size()), 0);
        d dVar = this.f4349q;
        e2(new d(m6V, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (Y1()) {
            B1(list, iMin);
        }
    }

    @Override // E3.A.d
    public int I() {
        return this.f4349q.f4357a.f4668c.f5047f;
    }

    @Override // E3.A.d
    public long I0() {
        return this.f4349q.f4357a.f4668c.f5046e;
    }

    @Override // E3.A.d
    public void J() {
        this.f4342j.p().r();
    }

    @Override // E3.A.d
    public C6077I J0() {
        return this.f4349q.f4357a.f4678m;
    }

    @Override // E3.A.d
    public void K() {
        a2(K0(), 0L);
    }

    @Override // E3.A.d
    public int K0() {
        return this.f4349q.f4357a.f4668c.f5042a.f56619c;
    }

    @Override // E3.A.d
    public void L(List list, boolean z10) {
        c2(list);
    }

    @Override // E3.A.d
    public void L0(SurfaceView surfaceView) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override // E3.A.d
    public void M() {
        X(1);
    }

    @Override // E3.A.d
    public void M0(int i10, int i11) {
        N0(i10, i10 + 1, i11);
    }

    @Override // E3.A.d
    public void N(int i10) {
        int iM0 = m0();
        int i11 = getDeviceInfo().f56935c;
        if (i11 == 0 || iM0 + 1 <= i11) {
            M6 m6D = this.f4349q.f4357a.d(iM0 + 1, P0());
            d dVar = this.f4349q;
            e2(new d(m6D, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.b(1, i10);
    }

    @Override // E3.A.d
    public void N0(int i10, int i11, int i12) {
        AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i12 >= 0);
        O6 o62 = (O6) this.f4349q.f4357a.f4675j;
        int iT = o62.t();
        int iMin = Math.min(i11, iT);
        int i13 = iMin - i10;
        int i14 = iT - i13;
        int i15 = i14 - 1;
        int iMin2 = Math.min(i12, i14);
        if (i10 >= iT || i10 == iMin || i10 == iMin2) {
            return;
        }
        int iE1 = E1(K0(), i10, iMin);
        if (iE1 == -1) {
            iE1 = t2.a0.r(i10, 0, i15);
            AbstractC6635w.i("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + iE1 + " would be the new current item");
        }
        M6 m6V = this.f4349q.f4357a.v(o62.B(i10, iMin, iMin2), D1(iE1, iMin2, i13), 0);
        d dVar = this.f4349q;
        e2(new d(m6V, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (Y1()) {
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < i13; i16++) {
                arrayList.add((n.h) this.f4346n.f4366d.get(i10));
                this.f4342j.t(((n.h) this.f4346n.f4366d.get(i10)).c());
            }
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                this.f4342j.a(((n.h) arrayList.get(i17)).c(), i17 + iMin2);
            }
        }
    }

    @Override // E3.A.d
    public void O(SurfaceView surfaceView) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    @Override // E3.A.d
    public void O0(List list) {
        H0(Integer.MAX_VALUE, list);
    }

    @Override // E3.A.d
    public boolean P0() {
        M6 m62 = this.f4349q.f4357a;
        if (m62.f4682q.f56933a == 1) {
            return m62.f4684s;
        }
        F3.j jVar = this.f4342j;
        return jVar != null && AbstractC1466t.m(jVar.i());
    }

    public F3.e P1() {
        return this.f4343k;
    }

    @Override // E3.A.d
    public void Q(int i10, int i11, List list) {
        AbstractC6614a.a(i10 >= 0 && i10 <= i11);
        int iT = ((O6) this.f4349q.f4357a.f4675j).t();
        if (i10 > iT) {
            return;
        }
        int iMin = Math.min(i11, iT);
        H0(iMin, list);
        T(i10, iMin);
    }

    @Override // E3.A.d
    public boolean Q0() {
        return this.f4349q.f4357a.f4674i;
    }

    A Q1() {
        return this.f4334b;
    }

    @Override // E3.A.d
    public void R(int i10) {
        T(i10, i10 + 1);
    }

    @Override // E3.A.d
    public long R0() {
        return I0();
    }

    @Override // E3.A.d
    public void S() {
        if (this.f4335c.h() == 0) {
            H1((n.j) AbstractC6614a.i(this.f4335c.a()));
        } else {
            G1();
        }
    }

    @Override // E3.A.d
    public void S0(int i10) {
        z0(i10, 1);
    }

    @Override // E3.A.d
    public void T(int i10, int i11) {
        AbstractC6614a.a(i10 >= 0 && i11 >= i10);
        int iT = h0().t();
        int iMin = Math.min(i11, iT);
        if (i10 >= iT || i10 == iMin) {
            return;
        }
        O6 o6E = ((O6) this.f4349q.f4357a.f4675j).E(i10, iMin);
        int iE1 = E1(K0(), i10, iMin);
        if (iE1 == -1) {
            iE1 = t2.a0.r(i10, 0, o6E.t() - 1);
            AbstractC6635w.i("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iE1 + " is the new current item");
        }
        M6 m6V = this.f4349q.f4357a.v(o6E, iE1, 0);
        d dVar = this.f4349q;
        e2(new d(m6V, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (Y1()) {
            while (i10 < iMin && i10 < this.f4346n.f4366d.size()) {
                this.f4342j.t(((n.h) this.f4346n.f4366d.get(i10)).c());
                i10++;
            }
        }
    }

    @Override // E3.A.d
    public void T0() {
        this.f4342j.p().a();
    }

    @Override // E3.A.d
    public void U() {
        this.f4342j.p().r();
    }

    @Override // E3.A.d
    public void U0() {
        this.f4342j.p().k();
    }

    @Override // E3.A.d
    public void V(boolean z10) {
        M6 m62 = this.f4349q.f4357a;
        if (m62.f4685t == z10) {
            return;
        }
        this.f4350r = L6.e(m62, this.f4350r, this.f4351s, Q1().f1());
        this.f4351s = SystemClock.elapsedRealtime();
        M6 m6J = this.f4349q.f4357a.j(z10, 1, 0);
        d dVar = this.f4349q;
        e2(new d(m6J, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (Y1() && V1()) {
            if (z10) {
                this.f4342j.p().c();
            } else {
                this.f4342j.p().b();
            }
        }
    }

    @Override // E3.A.d
    public C6077I V0() {
        C6071C c6071cC = this.f4349q.f4357a.C();
        return c6071cC == null ? C6077I.f56472K : c6071cC.f56331e;
    }

    @Override // E3.A.d
    public void W() {
        this.f4342j.p().q();
    }

    @Override // E3.A.d
    public void W0(C6088c c6088c, boolean z10) {
        AbstractC6635w.i("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // E3.A.d
    public void X(int i10) {
        int iM0 = m0() - 1;
        if (iM0 >= getDeviceInfo().f56934b) {
            M6 m6D = this.f4349q.f4357a.d(iM0, P0());
            d dVar = this.f4349q;
            e2(new d(m6D, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.b(-1, i10);
    }

    @Override // E3.A.d
    public long X0() {
        return this.f4349q.f4357a.f4661A;
    }

    @Override // E3.A.d
    public q2.h0 Y() {
        return q2.h0.f56877b;
    }

    @Override // E3.A.d
    public U6 Y0() {
        return this.f4349q.f4358b;
    }

    @Override // E3.A.d
    public boolean Z() {
        return this.f4345m;
    }

    @Override // E3.A.d
    public com.google.common.util.concurrent.p Z0(T6 t62, Bundle bundle) {
        if (this.f4349q.f4358b.c(t62)) {
            this.f4342j.p().m(t62.f4975b, bundle);
            return com.google.common.util.concurrent.j.d(new X6(0));
        }
        com.google.common.util.concurrent.w wVarJ = com.google.common.util.concurrent.w.J();
        this.f4342j.u(t62.f4975b, bundle, new a(Q1().f4304e, wVarJ));
        return wVarJ;
    }

    void Z1() {
        if (this.f4344l || this.f4345m) {
            return;
        }
        this.f4345m = true;
        U1(true, new e(this.f4342j.i(), J1(this.f4342j.j()), this.f4342j.g(), I1(this.f4342j.k()), this.f4342j.l(), this.f4342j.n(), this.f4342j.o(), this.f4342j.d()));
    }

    @Override // E3.A.d
    public void a() {
        if (this.f4344l) {
            return;
        }
        this.f4344l = true;
        F3.e eVar = this.f4343k;
        if (eVar != null) {
            eVar.b();
            this.f4343k = null;
        }
        F3.j jVar = this.f4342j;
        if (jVar != null) {
            jVar.w(this.f4337e);
            this.f4337e.r();
            this.f4342j = null;
        }
        this.f4345m = false;
        this.f4336d.i();
    }

    @Override // E3.A.d
    public void a0(InterfaceC6084P.d dVar) {
        this.f4336d.c(dVar);
    }

    @Override // E3.A.d
    public Bundle a1() {
        return this.f4340h;
    }

    @Override // E3.A.d
    public C6407e b0() {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support getting Cue");
        return C6407e.f59083d;
    }

    public void b2(C6071C c6071c) {
        f0(c6071c, -9223372036854775807L);
    }

    @Override // E3.A.d
    public C6083O c() {
        return this.f4349q.f4357a.f4672g;
    }

    @Override // E3.A.d
    public int c0() {
        return -1;
    }

    public void c2(List list) {
        D0(list, 0, -9223372036854775807L);
    }

    @Override // E3.A.d
    public void d0(C6071C c6071c, boolean z10) {
        b2(c6071c);
    }

    @Override // E3.A.d
    public void e(C6083O c6083o) {
        if (!c6083o.equals(c())) {
            M6 m6K = this.f4349q.f4357a.k(c6083o);
            d dVar = this.f4349q;
            e2(new d(m6K, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.p().n(c6083o.f56601a);
    }

    @Override // E3.A.d
    public void e0(boolean z10) {
        F(z10, 1);
    }

    @Override // E3.A.d
    public void f0(C6071C c6071c, long j10) {
        D0(AbstractC2011u.B(c6071c), 0, j10);
    }

    @Override // E3.A.d
    public int g0() {
        return 0;
    }

    @Override // E3.A.d
    public long getCurrentPosition() {
        long jE = L6.e(this.f4349q.f4357a, this.f4350r, this.f4351s, Q1().f1());
        this.f4350r = jE;
        return jE;
    }

    @Override // E3.A.d
    public C6101p getDeviceInfo() {
        return this.f4349q.f4357a.f4682q;
    }

    @Override // E3.A.d
    public long getDuration() {
        return this.f4349q.f4357a.f4668c.f5045d;
    }

    @Override // E3.A.d
    public q2.Y h0() {
        return this.f4349q.f4357a.f4675j;
    }

    @Override // E3.A.d
    public void i0() {
        N(1);
    }

    @Override // E3.A.d
    public boolean isPlaying() {
        return this.f4349q.f4357a.f4687v;
    }

    @Override // E3.A.d
    public q2.d0 j0() {
        return q2.d0.f56766F;
    }

    @Override // E3.A.d
    public void k0() {
        this.f4342j.p().q();
    }

    @Override // E3.A.d
    public void l0(TextureView textureView) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override // E3.A.d
    public int m0() {
        M6 m62 = this.f4349q.f4357a;
        if (m62.f4682q.f56933a == 1) {
            return m62.f4683r;
        }
        F3.j jVar = this.f4342j;
        if (jVar != null) {
            return AbstractC1466t.i(jVar.i());
        }
        return 0;
    }

    @Override // E3.A.d
    public long n0() {
        return -9223372036854775807L;
    }

    @Override // E3.A.d
    public void o0(int i10, long j10) {
        a2(i10, j10);
    }

    @Override // E3.A.d
    public int p() {
        return this.f4349q.f4357a.f4690y;
    }

    @Override // E3.A.d
    public InterfaceC6084P.b p0() {
        return this.f4349q.f4359c;
    }

    @Override // E3.A.d
    public void pause() {
        V(false);
    }

    @Override // E3.A.d
    public boolean q() {
        return false;
    }

    @Override // E3.A.d
    public boolean q0() {
        return this.f4349q.f4357a.f4685t;
    }

    @Override // E3.A.d
    public void r0(boolean z10) {
        if (z10 != Q0()) {
            M6 m6T = this.f4349q.f4357a.t(z10);
            d dVar = this.f4349q;
            e2(new d(m6T, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.p().p(AbstractC1466t.M(z10));
    }

    @Override // E3.A.d
    public void s() {
        M6 m62 = this.f4349q.f4357a;
        if (m62.f4690y != 1) {
            return;
        }
        M6 m6L = m62.l(m62.f4675j.u() ? 4 : 2, null);
        d dVar = this.f4349q;
        e2(new d(m6L, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        if (V1()) {
            X1();
        }
    }

    @Override // E3.A.d
    public long s0() {
        return this.f4349q.f4357a.f4663C;
    }

    @Override // E3.A.d
    public void stop() {
        M6 m62 = this.f4349q.f4357a;
        if (m62.f4690y == 1) {
            return;
        }
        W6 w62 = m62.f4668c;
        InterfaceC6084P.e eVar = w62.f5042a;
        long j10 = w62.f5045d;
        long j11 = eVar.f56623g;
        M6 m6S = m62.s(M1(eVar, false, j10, j11, L6.c(j11, j10), 0L));
        M6 m63 = this.f4349q.f4357a;
        if (m63.f4690y != 1) {
            m6S = m6S.l(1, m63.f4666a);
        }
        M6 m64 = m6S;
        d dVar = this.f4349q;
        e2(new d(m64, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        this.f4342j.p().t();
    }

    @Override // E3.A.d
    public void t(float f10) {
        if (f10 != c().f56601a) {
            M6 m6K = this.f4349q.f4357a.k(new C6083O(f10));
            d dVar = this.f4349q;
            e2(new d(m6K, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.p().n(f10);
    }

    @Override // E3.A.d
    public long t0() {
        return getDuration();
    }

    @Override // E3.A.d
    public void u() {
        V(true);
    }

    @Override // E3.A.d
    public int u0() {
        return K0();
    }

    @Override // E3.A.d
    public void v(int i10) {
        if (i10 != x()) {
            M6 m6P = this.f4349q.f4357a.p(i10);
            d dVar = this.f4349q;
            e2(new d(m6P, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.p().o(AbstractC1466t.L(i10));
    }

    @Override // E3.A.d
    public void v0(TextureView textureView) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    @Override // E3.A.d
    public void w(float f10) {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // E3.A.d
    public q2.l0 w0() {
        AbstractC6635w.i("MCImplLegacy", "Session doesn't support getting VideoSize");
        return q2.l0.f56919e;
    }

    @Override // E3.A.d
    public int x() {
        return this.f4349q.f4357a.f4673h;
    }

    @Override // E3.A.d
    public float x0() {
        return 1.0f;
    }

    @Override // E3.A.d
    public C6082N y() {
        return this.f4349q.f4357a.f4666a;
    }

    @Override // E3.A.d
    public C6088c y0() {
        return this.f4349q.f4357a.f4680o;
    }

    @Override // E3.A.d
    public void z(long j10) {
        a2(K0(), j10);
    }

    @Override // E3.A.d
    public void z0(int i10, int i11) {
        C6101p deviceInfo = getDeviceInfo();
        int i12 = deviceInfo.f56934b;
        int i13 = deviceInfo.f56935c;
        if (i12 <= i10 && (i13 == 0 || i10 <= i13)) {
            M6 m6D = this.f4349q.f4357a.d(i10, P0());
            d dVar = this.f4349q;
            e2(new d(m6D, dVar.f4358b, dVar.f4359c, dVar.f4360d, dVar.f4361e, null), null, null);
        }
        this.f4342j.v(i10, i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {

        /* JADX INFO: renamed from: a */
        public final M6 f4357a;

        /* JADX INFO: renamed from: b */
        public final U6 f4358b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC6084P.b f4359c;

        /* JADX INFO: renamed from: d */
        public final AbstractC2011u f4360d;

        /* JADX INFO: renamed from: e */
        public final Bundle f4361e;

        /* JADX INFO: renamed from: f */
        public final V6 f4362f;

        public d() {
            this.f4357a = M6.f4628F.u(O6.f4766g);
            this.f4358b = U6.f4986b;
            this.f4359c = InterfaceC6084P.b.f56604b;
            this.f4360d = AbstractC2011u.A();
            this.f4361e = Bundle.EMPTY;
            this.f4362f = null;
        }

        public d(M6 m62, U6 u62, InterfaceC6084P.b bVar, AbstractC2011u abstractC2011u, Bundle bundle, V6 v62) {
            this.f4357a = m62;
            this.f4358b = u62;
            this.f4359c = bVar;
            this.f4360d = abstractC2011u;
            this.f4361e = bundle == null ? Bundle.EMPTY : bundle;
            this.f4362f = v62;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e {

        /* JADX INFO: renamed from: a */
        public final j.e f4363a;

        /* JADX INFO: renamed from: b */
        public final F3.v f4364b;

        /* JADX INFO: renamed from: c */
        public final F3.m f4365c;

        /* JADX INFO: renamed from: d */
        public final List f4366d;

        /* JADX INFO: renamed from: e */
        public final CharSequence f4367e;

        /* JADX INFO: renamed from: f */
        public final int f4368f;

        /* JADX INFO: renamed from: g */
        public final int f4369g;

        /* JADX INFO: renamed from: h */
        public final Bundle f4370h;

        public e() {
            this.f4363a = null;
            this.f4364b = null;
            this.f4365c = null;
            this.f4366d = Collections.EMPTY_LIST;
            this.f4367e = null;
            this.f4368f = 0;
            this.f4369g = 0;
            this.f4370h = Bundle.EMPTY;
        }

        public e a(F3.v vVar, int i10, int i11) {
            return new e(this.f4363a, vVar, this.f4365c, this.f4366d, this.f4367e, i10, i11, this.f4370h);
        }

        public e b(F3.m mVar) {
            return new e(this.f4363a, this.f4364b, mVar, this.f4366d, this.f4367e, this.f4368f, this.f4369g, this.f4370h);
        }

        public e c(j.e eVar) {
            return new e(eVar, this.f4364b, this.f4365c, this.f4366d, this.f4367e, this.f4368f, this.f4369g, this.f4370h);
        }

        public e d(F3.v vVar) {
            return new e(this.f4363a, vVar, this.f4365c, this.f4366d, this.f4367e, this.f4368f, this.f4369g, this.f4370h);
        }

        public e e(List list) {
            return new e(this.f4363a, this.f4364b, this.f4365c, list, this.f4367e, this.f4368f, this.f4369g, this.f4370h);
        }

        public e f(CharSequence charSequence) {
            return new e(this.f4363a, this.f4364b, this.f4365c, this.f4366d, charSequence, this.f4368f, this.f4369g, this.f4370h);
        }

        public e g(int i10) {
            return new e(this.f4363a, this.f4364b, this.f4365c, this.f4366d, this.f4367e, i10, this.f4369g, this.f4370h);
        }

        public e h(Bundle bundle) {
            return new e(this.f4363a, this.f4364b, this.f4365c, this.f4366d, this.f4367e, this.f4368f, this.f4369g, bundle);
        }

        public e i(int i10) {
            return new e(this.f4363a, this.f4364b, this.f4365c, this.f4366d, this.f4367e, this.f4368f, i10, this.f4370h);
        }

        public e(j.e eVar, F3.v vVar, F3.m mVar, List list, CharSequence charSequence, int i10, int i11, Bundle bundle) {
            this.f4363a = eVar;
            this.f4364b = vVar;
            this.f4365c = mVar;
            this.f4366d = (List) AbstractC6614a.e(list);
            this.f4367e = charSequence;
            this.f4368f = i10;
            this.f4369g = i11;
            this.f4370h = bundle == null ? Bundle.EMPTY : bundle;
        }

        public e(e eVar) {
            this.f4363a = eVar.f4363a;
            this.f4364b = eVar.f4364b;
            this.f4365c = eVar.f4365c;
            this.f4366d = eVar.f4366d;
            this.f4367e = eVar.f4367e;
            this.f4368f = eVar.f4368f;
            this.f4369g = eVar.f4369g;
            this.f4370h = eVar.f4370h;
        }
    }

    public static void W1(Future future) {
    }

    @Override // E3.A.d
    public void P(q2.d0 d0Var) {
    }
}
