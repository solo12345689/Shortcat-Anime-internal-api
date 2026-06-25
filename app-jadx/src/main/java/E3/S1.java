package E3;

import E3.A;
import E3.InterfaceC1458s;
import E3.M6;
import E3.S1;
import E3.S6;
import E3.r;
import P9.AbstractC2011u;
import P9.AbstractC2012v;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import q2.BinderC6095j;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6087b;
import q2.C6088c;
import q2.C6101p;
import q2.C6105t;
import q2.InterfaceC6084P;
import q2.Y;
import s2.C6407e;
import t.C6552b;
import t2.AbstractC6614a;
import t2.AbstractC6622i;
import t2.AbstractC6635w;
import t2.C6611K;
import t2.C6634v;
import t2.InterfaceC6623j;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class S1 implements A.d {

    /* JADX INFO: renamed from: A */
    private Surface f4906A;

    /* JADX INFO: renamed from: B */
    private SurfaceHolder f4907B;

    /* JADX INFO: renamed from: C */
    private TextureView f4908C;

    /* JADX INFO: renamed from: E */
    private r f4910E;

    /* JADX INFO: renamed from: F */
    private MediaController f4911F;

    /* JADX INFO: renamed from: G */
    private long f4912G;

    /* JADX INFO: renamed from: H */
    private long f4913H;

    /* JADX INFO: renamed from: I */
    private M6 f4914I;

    /* JADX INFO: renamed from: J */
    private Bundle f4915J;

    /* JADX INFO: renamed from: a */
    private final A f4916a;

    /* JADX INFO: renamed from: b */
    protected final S6 f4917b;

    /* JADX INFO: renamed from: c */
    protected final X2 f4918c;

    /* JADX INFO: renamed from: d */
    private final Context f4919d;

    /* JADX INFO: renamed from: e */
    private final Y6 f4920e;

    /* JADX INFO: renamed from: f */
    private final Bundle f4921f;

    /* JADX INFO: renamed from: g */
    private final IBinder.DeathRecipient f4922g;

    /* JADX INFO: renamed from: h */
    private final f f4923h;

    /* JADX INFO: renamed from: i */
    private final C6634v f4924i;

    /* JADX INFO: renamed from: j */
    private final b f4925j;

    /* JADX INFO: renamed from: k */
    private final C6552b f4926k;

    /* JADX INFO: renamed from: l */
    private final Handler f4927l;

    /* JADX INFO: renamed from: m */
    private Y6 f4928m;

    /* JADX INFO: renamed from: n */
    private e f4929n;

    /* JADX INFO: renamed from: o */
    private boolean f4930o;

    /* JADX INFO: renamed from: q */
    private PendingIntent f4932q;

    /* JADX INFO: renamed from: x */
    private InterfaceC6084P.b f4939x;

    /* JADX INFO: renamed from: y */
    private InterfaceC6084P.b f4940y;

    /* JADX INFO: renamed from: z */
    private InterfaceC6084P.b f4941z;

    /* JADX INFO: renamed from: p */
    private M6 f4931p = M6.f4628F;

    /* JADX INFO: renamed from: D */
    private C6611K f4909D = C6611K.f60536c;

    /* JADX INFO: renamed from: w */
    private U6 f4938w = U6.f4986b;

    /* JADX INFO: renamed from: r */
    private AbstractC2011u f4933r = AbstractC2011u.A();

    /* JADX INFO: renamed from: s */
    private AbstractC2011u f4934s = AbstractC2011u.A();

    /* JADX INFO: renamed from: t */
    private AbstractC2011u f4935t = AbstractC2011u.A();

    /* JADX INFO: renamed from: u */
    private AbstractC2011u f4936u = AbstractC2011u.A();

    /* JADX INFO: renamed from: v */
    private AbstractC2012v f4937v = AbstractC2012v.k();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b {

        /* JADX INFO: renamed from: a */
        private final Handler f4942a;

        public b(Looper looper) {
            this.f4942a = new Handler(looper, new Handler.Callback() { // from class: E3.T1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f4962a.c(message);
                }
            });
        }

        private void b() {
            try {
                S1.this.f4910E.N0(S1.this.f4918c);
            } catch (RemoteException unused) {
                AbstractC6635w.i("MCImplBase", "Error in sending flushCommandQueue");
            }
        }

        public boolean c(Message message) {
            if (message.what == 1) {
                b();
            }
            return true;
        }

        public void d() {
            if (this.f4942a.hasMessages(1)) {
                b();
            }
            this.f4942a.removeCallbacksAndMessages(null);
        }

        public void e() {
            if (S1.this.f4910E == null || this.f4942a.hasMessages(1)) {
                return;
            }
            this.f4942a.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a */
        private final int f4944a;

        /* JADX INFO: renamed from: b */
        private final long f4945b;

        public c(int i10, long j10) {
            this.f4944a = i10;
            this.f4945b = j10;
        }

        static /* synthetic */ int a(c cVar) {
            return cVar.f4944a;
        }

        static /* synthetic */ long b(c cVar) {
            return cVar.f4945b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
        void a(r rVar, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        private final Bundle f4946a;

        public e(Bundle bundle) {
            this.f4946a = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            A aZ3 = S1.this.z3();
            A aZ32 = S1.this.z3();
            Objects.requireNonNull(aZ32);
            aZ3.k1(new RunnableC1372h0(aZ32));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            A aZ3;
            RunnableC1372h0 runnableC1372h0;
            try {
                try {
                    if (S1.this.f4920e.e().equals(componentName.getPackageName())) {
                        InterfaceC1458s interfaceC1458sC = InterfaceC1458s.a.c(iBinder);
                        if (interfaceC1458sC != null) {
                            interfaceC1458sC.s3(S1.this.f4918c, new C1371h(S1.this.x3().getPackageName(), Process.myPid(), this.f4946a, S1.this.f4916a.e1()).b());
                            return;
                        } else {
                            AbstractC6635w.d("MCImplBase", "Service interface is missing.");
                            aZ3 = S1.this.z3();
                            A aZ32 = S1.this.z3();
                            Objects.requireNonNull(aZ32);
                            runnableC1372h0 = new RunnableC1372h0(aZ32);
                        }
                    } else {
                        AbstractC6635w.d("MCImplBase", "Expected connection to " + S1.this.f4920e.e() + " but is connected to " + componentName);
                        aZ3 = S1.this.z3();
                        A aZ33 = S1.this.z3();
                        Objects.requireNonNull(aZ33);
                        runnableC1372h0 = new RunnableC1372h0(aZ33);
                    }
                } catch (RemoteException unused) {
                    AbstractC6635w.i("MCImplBase", "Service " + componentName + " has died prematurely");
                    aZ3 = S1.this.z3();
                    A aZ34 = S1.this.z3();
                    Objects.requireNonNull(aZ34);
                    runnableC1372h0 = new RunnableC1372h0(aZ34);
                }
                aZ3.k1(runnableC1372h0);
            } catch (Throwable th2) {
                A aZ35 = S1.this.z3();
                A aZ36 = S1.this.z3();
                Objects.requireNonNull(aZ36);
                aZ35.k1(new RunnableC1372h0(aZ36));
                throw th2;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            A aZ3 = S1.this.z3();
            A aZ32 = S1.this.z3();
            Objects.requireNonNull(aZ32);
            aZ3.k1(new RunnableC1372h0(aZ32));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private f() {
        }

        public static /* synthetic */ void a(f fVar, r rVar, int i10) {
            S1 s12 = S1.this;
            rVar.Z(s12.f4918c, i10, s12.f4906A);
        }

        public static /* synthetic */ void b(f fVar, r rVar, int i10) {
            S1 s12 = S1.this;
            rVar.Z(s12.f4918c, i10, s12.f4906A);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (S1.this.f4908C == null || S1.this.f4908C.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            S1.this.f4906A = new Surface(surfaceTexture);
            S1.this.t3(new d() { // from class: E3.W1
                @Override // E3.S1.d
                public final void a(r rVar, int i12) {
                    S1.f.a(this.f5015a, rVar, i12);
                }
            });
            S1.this.P3(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (S1.this.f4908C != null && S1.this.f4908C.getSurfaceTexture() == surfaceTexture) {
                S1.this.f4906A = null;
                S1.this.t3(new d() { // from class: E3.X1
                    @Override // E3.S1.d
                    public final void a(r rVar, int i10) {
                        rVar.Z(S1.this.f4918c, i10, null);
                    }
                });
                S1.this.P3(0, 0);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            if (S1.this.f4908C == null || S1.this.f4908C.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            S1.this.P3(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (S1.this.f4907B != surfaceHolder) {
                return;
            }
            S1.this.P3(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (S1.this.f4907B != surfaceHolder) {
                return;
            }
            S1.this.f4906A = surfaceHolder.getSurface();
            S1.this.t3(new d() { // from class: E3.U1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    S1.f.b(this.f4981a, rVar, i10);
                }
            });
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            S1.this.P3(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (S1.this.f4907B != surfaceHolder) {
                return;
            }
            S1.this.f4906A = null;
            S1.this.t3(new d() { // from class: E3.V1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.Z(S1.this.f4918c, i10, null);
                }
            });
            S1.this.P3(0, 0);
        }

        /* synthetic */ f(S1 s12, a aVar) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public S1(Context context, A a10, Y6 y62, Bundle bundle, Looper looper) {
        InterfaceC6084P.b bVar = InterfaceC6084P.b.f56604b;
        this.f4939x = bVar;
        this.f4940y = bVar;
        this.f4941z = n3(bVar, bVar);
        this.f4924i = new C6634v(looper, InterfaceC6623j.f60596a, new C6634v.b() { // from class: E3.b0
            @Override // t2.C6634v.b
            public final void a(Object obj, C6105t c6105t) {
                ((InterfaceC6084P.d) obj).X(this.f5159a.z3(), new InterfaceC6084P.c(c6105t));
            }
        });
        this.f4927l = new Handler(looper);
        this.f4916a = a10;
        AbstractC6614a.f(context, "context must not be null");
        AbstractC6614a.f(y62, "token must not be null");
        this.f4919d = context;
        this.f4917b = new S6();
        this.f4918c = new X2(this);
        this.f4926k = new C6552b();
        this.f4920e = y62;
        this.f4921f = bundle;
        this.f4922g = new IBinder.DeathRecipient() { // from class: E3.c0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                S1.k1(this.f5171a);
            }
        };
        this.f4923h = new f();
        this.f4915J = Bundle.EMPTY;
        this.f4929n = y62.h() != 0 ? new e(bundle) : null;
        this.f4925j = new b(looper);
        this.f4912G = -9223372036854775807L;
        this.f4913H = -9223372036854775807L;
    }

    private static int A3(q2.Y y10, int i10, int i11, int i12) {
        if (i10 == -1) {
            return i10;
        }
        while (i11 < i12) {
            Y.d dVar = new Y.d();
            y10.r(i11, dVar);
            i10 -= (dVar.f56692o - dVar.f56691n) + 1;
            i11++;
        }
        return i10;
    }

    public static /* synthetic */ void B2(S1 s12, com.google.common.util.concurrent.p pVar, int i10) {
        X6 x62;
        s12.getClass();
        try {
            x62 = (X6) AbstractC6614a.f((X6) pVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            AbstractC6635w.j("MCImplBase", "Session operation failed", e);
            x62 = new X6(-1);
        } catch (CancellationException e11) {
            AbstractC6635w.j("MCImplBase", "Session operation cancelled", e11);
            x62 = new X6(1);
        } catch (ExecutionException e12) {
            e = e12;
            AbstractC6635w.j("MCImplBase", "Session operation failed", e);
            x62 = new X6(-1);
        }
        s12.o4(i10, x62);
    }

    private c C3(q2.Y y10, int i10, long j10) {
        if (y10.u()) {
            return null;
        }
        Y.d dVar = new Y.d();
        Y.b bVar = new Y.b();
        if (i10 == -1 || i10 >= y10.t()) {
            i10 = y10.e(Q0());
            j10 = y10.r(i10, dVar).c();
        }
        return D3(y10, dVar, bVar, i10, t2.a0.V0(j10));
    }

    private static c D3(q2.Y y10, Y.d dVar, Y.b bVar, int i10, long j10) {
        AbstractC6614a.c(i10, 0, y10.t());
        y10.r(i10, dVar);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.d();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f56691n;
        y10.j(i11, bVar);
        while (i11 < dVar.f56692o && bVar.f56655e != j10) {
            int i12 = i11 + 1;
            if (y10.j(i12, bVar).f56655e > j10) {
                break;
            }
            i11 = i12;
        }
        y10.j(i11, bVar);
        return new c(i11, j10 - bVar.f56655e);
    }

    private static Y.b E3(q2.Y y10, int i10, int i11) {
        Y.b bVar = new Y.b();
        y10.j(i10, bVar);
        bVar.f56653c = i11;
        return bVar;
    }

    public static /* synthetic */ void G1(S1 s12, List list, int i10, int i11, r rVar, int i12) {
        s12.getClass();
        BinderC6095j binderC6095j = new BinderC6095j(AbstractC6622i.i(list, new T()));
        if (((Y6) AbstractC6614a.e(s12.f4928m)).d() >= 2) {
            rVar.C2(s12.f4918c, i12, i10, i11, binderC6095j);
        } else {
            rVar.c3(s12.f4918c, i12, i11, binderC6095j);
            rVar.G2(s12.f4918c, i12, i10, i11);
        }
    }

    public static /* synthetic */ void I1(S1 s12, boolean z10, boolean z11, int i10, A.c cVar) {
        com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) AbstractC6614a.f(cVar.O(s12.z3(), s12.f4936u), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z10) {
            cVar.K(s12.z3(), s12.f4936u);
        }
        if (z11) {
            cVar.G(s12.z3(), s12.f4935t);
        }
        s12.p4(i10, pVar);
    }

    private boolean I3(int i10) {
        if (this.f4941z.c(i10)) {
            return true;
        }
        AbstractC6635w.i("MCImplBase", "Controller isn't allowed to call command= " + i10);
        return false;
    }

    private static M6 K3(M6 m62, int i10, List list, long j10, long j11) {
        int size;
        q2.Y y10 = m62.f4675j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < y10.t(); i12++) {
            arrayList.add(y10.r(i12, new Y.d()));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            arrayList.add(i13 + i10, q3((C6071C) list.get(i13)));
        }
        e4(y10, arrayList, arrayList2);
        q2.Y yO3 = o3(arrayList, arrayList2);
        if (m62.f4675j.u()) {
            size = 0;
        } else {
            int size2 = m62.f4668c.f5042a.f56619c;
            if (size2 >= i10) {
                size2 += list.size();
            }
            i11 = size2;
            size = m62.f4668c.f5042a.f56622f;
            if (size >= i10) {
                size += list.size();
            }
        }
        return N3(m62, yO3, i11, size, j10, j11, 5);
    }

    public static /* synthetic */ void L2(final S1 s12, int i10) {
        s12.f4926k.remove(Integer.valueOf(i10));
        Y6 y62 = s12.f4928m;
        if (y62 == null || y62.d() >= 5 || !s12.f4926k.isEmpty()) {
            return;
        }
        s12.f4927l.postDelayed(new Runnable() { // from class: E3.K1
            @Override // java.lang.Runnable
            public final void run() {
                S1.j(this.f4550a);
            }
        }, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static E3.M6 L3(E3.M6 r34, int r35, int r36, boolean r37, long r38, long r40) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.S1.L3(E3.M6, int, int, boolean, long, long):E3.M6");
    }

    private M6 M3(M6 m62, q2.Y y10, c cVar) {
        int i10 = m62.f4668c.f5042a.f56622f;
        int i11 = cVar.f4944a;
        Y.b bVar = new Y.b();
        y10.j(i10, bVar);
        Y.b bVar2 = new Y.b();
        y10.j(i11, bVar2);
        boolean z10 = i10 != i11;
        long j10 = cVar.f4945b;
        long jV0 = t2.a0.V0(getCurrentPosition()) - bVar.o();
        if (!z10 && j10 == jV0) {
            return m62;
        }
        AbstractC6614a.g(m62.f4668c.f5042a.f56625i == -1);
        InterfaceC6084P.e eVar = new InterfaceC6084P.e(null, bVar.f56653c, m62.f4668c.f5042a.f56620d, null, i10, t2.a0.F1(bVar.f56655e + jV0), t2.a0.F1(bVar.f56655e + jV0), -1, -1);
        y10.j(i11, bVar2);
        Y.d dVar = new Y.d();
        y10.r(bVar2.f56653c, dVar);
        long jF1 = t2.a0.F1(bVar2.f56655e + j10);
        InterfaceC6084P.e eVar2 = new InterfaceC6084P.e(null, bVar2.f56653c, dVar.f56680c, null, i11, jF1, jF1, -1, -1);
        M6 m6O = m62.o(eVar, eVar2, 1);
        if (z10 || j10 < jV0) {
            return m6O.s(new W6(eVar2, false, SystemClock.elapsedRealtime(), dVar.e(), jF1, L6.c(jF1, dVar.e()), 0L, -9223372036854775807L, -9223372036854775807L, jF1));
        }
        long jMax = Math.max(0L, t2.a0.V0(m6O.f4668c.f5048g) - (j10 - jV0));
        long jF12 = t2.a0.F1(bVar2.f56655e + j10 + jMax);
        return m6O.s(new W6(eVar2, false, SystemClock.elapsedRealtime(), dVar.e(), jF12, L6.c(jF12, dVar.e()), t2.a0.F1(jMax), -9223372036854775807L, -9223372036854775807L, jF12));
    }

    private static M6 N3(M6 m62, q2.Y y10, int i10, int i11, long j10, long j11, int i12) {
        C6071C c6071c = y10.r(i10, new Y.d()).f56680c;
        InterfaceC6084P.e eVar = m62.f4668c.f5042a;
        InterfaceC6084P.e eVar2 = new InterfaceC6084P.e(null, i10, c6071c, null, i11, j10, j11, eVar.f56625i, eVar.f56626j);
        boolean z10 = m62.f4668c.f5043b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        W6 w62 = m62.f4668c;
        return O3(m62, y10, eVar2, new W6(eVar2, z10, jElapsedRealtime, w62.f5045d, w62.f5046e, w62.f5047f, w62.f5048g, w62.f5049h, w62.f5050i, w62.f5051j), i12);
    }

    private static M6 O3(M6 m62, q2.Y y10, InterfaceC6084P.e eVar, W6 w62, int i10) {
        return new M6.b(m62).B(y10).o(m62.f4668c.f5042a).n(eVar).z(w62).h(i10).a();
    }

    public void P3(final int i10, final int i11) {
        if (this.f4909D.b() == i10 && this.f4909D.a() == i11) {
            return;
        }
        this.f4909D = new C6611K(i10, i11);
        this.f4924i.k(24, new C6634v.a() { // from class: E3.w1
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC6084P.d) obj).W(i10, i11);
            }
        });
    }

    private void Q3(int i10, int i11, int i12) {
        int i13;
        int i14;
        q2.Y y10 = this.f4931p.f4675j;
        int iT = y10.t();
        int iMin = Math.min(i11, iT);
        int i15 = iMin - i10;
        int iMin2 = Math.min(i12, iT - i15);
        if (i10 >= iT || i10 == iMin || i10 == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < iT; i16++) {
            arrayList.add(y10.r(i16, new Y.d()));
        }
        t2.a0.U0(arrayList, i10, iMin, iMin2);
        e4(y10, arrayList, arrayList2);
        q2.Y yO3 = o3(arrayList, arrayList2);
        if (yO3.u()) {
            return;
        }
        int iK0 = K0();
        if (iK0 >= i10 && iK0 < iMin) {
            i14 = (iK0 - i10) + iMin2;
        } else if (iMin <= iK0 && iMin2 > iK0) {
            i14 = iK0 - i15;
        } else {
            if (iMin <= iK0 || iMin2 > iK0) {
                i13 = iK0;
                Y.d dVar = new Y.d();
                u4(N3(this.f4931p, yO3, i13, yO3.r(i13, dVar).f56691n + (this.f4931p.f4668c.f5042a.f56622f - y10.r(iK0, dVar).f56691n), getCurrentPosition(), G0(), 5), 0, null, null, null);
            }
            i14 = iK0 + i15;
        }
        i13 = i14;
        Y.d dVar2 = new Y.d();
        u4(N3(this.f4931p, yO3, i13, yO3.r(i13, dVar2).f56691n + (this.f4931p.f4668c.f5042a.f56622f - y10.r(iK0, dVar2).f56691n), getCurrentPosition(), G0(), 5), 0, null, null, null);
    }

    private void S3(M6 m62, final M6 m63, final Integer num, final Integer num2, final Integer num3, final Integer num4) {
        if (num != null) {
            this.f4924i.h(0, new C6634v.a() { // from class: E3.w0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).S(m63.f4675j, num.intValue());
                }
            });
        }
        if (num3 != null) {
            this.f4924i.h(11, new C6634v.a() { // from class: E3.I0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    M6 m64 = m63;
                    ((InterfaceC6084P.d) obj).m0(m64.f4669d, m64.f4670e, num3.intValue());
                }
            });
        }
        final C6071C c6071cC = m63.C();
        if (num4 != null) {
            this.f4924i.h(1, new C6634v.a() { // from class: E3.R0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).E(c6071cC, num4.intValue());
                }
            });
        }
        C6082N c6082n = m62.f4666a;
        final C6082N c6082n2 = m63.f4666a;
        if (c6082n != c6082n2 && (c6082n == null || !c6082n.c(c6082n2))) {
            this.f4924i.h(10, new C6634v.a() { // from class: E3.S0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).t0(c6082n2);
                }
            });
            if (c6082n2 != null) {
                this.f4924i.h(10, new C6634v.a() { // from class: E3.T0
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).H(c6082n2);
                    }
                });
            }
        }
        if (!m62.f4664D.equals(m63.f4664D)) {
            this.f4924i.h(2, new C6634v.a() { // from class: E3.U0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).g0(m63.f4664D);
                }
            });
        }
        if (!m62.f4691z.equals(m63.f4691z)) {
            this.f4924i.h(14, new C6634v.a() { // from class: E3.V0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).V(m63.f4691z);
                }
            });
        }
        if (m62.f4688w != m63.f4688w) {
            this.f4924i.h(3, new C6634v.a() { // from class: E3.W0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).b0(m63.f4688w);
                }
            });
        }
        if (m62.f4690y != m63.f4690y) {
            this.f4924i.h(4, new C6634v.a() { // from class: E3.X0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).J(m63.f4690y);
                }
            });
        }
        if (num2 != null) {
            this.f4924i.h(5, new C6634v.a() { // from class: E3.Y0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).s0(m63.f4685t, num2.intValue());
                }
            });
        }
        if (m62.f4689x != m63.f4689x) {
            this.f4924i.h(6, new C6634v.a() { // from class: E3.x0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).C(m63.f4689x);
                }
            });
        }
        if (m62.f4687v != m63.f4687v) {
            this.f4924i.h(7, new C6634v.a() { // from class: E3.y0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).y0(m63.f4687v);
                }
            });
        }
        if (!m62.f4672g.equals(m63.f4672g)) {
            this.f4924i.h(12, new C6634v.a() { // from class: E3.z0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n(m63.f4672g);
                }
            });
        }
        if (m62.f4673h != m63.f4673h) {
            this.f4924i.h(8, new C6634v.a() { // from class: E3.A0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).F(m63.f4673h);
                }
            });
        }
        if (m62.f4674i != m63.f4674i) {
            this.f4924i.h(9, new C6634v.a() { // from class: E3.B0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).M(m63.f4674i);
                }
            });
        }
        if (!m62.f4678m.equals(m63.f4678m)) {
            this.f4924i.h(15, new C6634v.a() { // from class: E3.C0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).c0(m63.f4678m);
                }
            });
        }
        if (m62.f4679n != m63.f4679n) {
            this.f4924i.h(22, new C6634v.a() { // from class: E3.E0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).d0(m63.f4679n);
                }
            });
        }
        if (!m62.f4680o.equals(m63.f4680o)) {
            this.f4924i.h(20, new C6634v.a() { // from class: E3.F0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).e0(m63.f4680o);
                }
            });
        }
        if (!m62.f4681p.f59086a.equals(m63.f4681p.f59086a)) {
            this.f4924i.h(27, new C6634v.a() { // from class: E3.G0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).p(m63.f4681p.f59086a);
                }
            });
            this.f4924i.h(27, new C6634v.a() { // from class: E3.H0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).t(m63.f4681p);
                }
            });
        }
        if (!m62.f4682q.equals(m63.f4682q)) {
            this.f4924i.h(29, new C6634v.a() { // from class: E3.J0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n0(m63.f4682q);
                }
            });
        }
        if (m62.f4683r != m63.f4683r || m62.f4684s != m63.f4684s) {
            this.f4924i.h(30, new C6634v.a() { // from class: E3.K0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    M6 m64 = m63;
                    ((InterfaceC6084P.d) obj).P(m64.f4683r, m64.f4684s);
                }
            });
        }
        if (!m62.f4677l.equals(m63.f4677l)) {
            this.f4924i.h(25, new C6634v.a() { // from class: E3.L0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).b(m63.f4677l);
                }
            });
        }
        if (m62.f4661A != m63.f4661A) {
            this.f4924i.h(16, new C6634v.a() { // from class: E3.M0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).R(m63.f4661A);
                }
            });
        }
        if (m62.f4662B != m63.f4662B) {
            this.f4924i.h(17, new C6634v.a() { // from class: E3.N0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).l0(m63.f4662B);
                }
            });
        }
        if (m62.f4663C != m63.f4663C) {
            this.f4924i.h(18, new C6634v.a() { // from class: E3.P0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).r0(m63.f4663C);
                }
            });
        }
        if (!m62.f4665E.equals(m63.f4665E)) {
            this.f4924i.h(19, new C6634v.a() { // from class: E3.Q0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).Z(m63.f4665E);
                }
            });
        }
        this.f4924i.f();
    }

    public static /* synthetic */ void b(S1 s12, int i10, C6071C c6071c, r rVar, int i11) {
        if (((Y6) AbstractC6614a.e(s12.f4928m)).d() >= 2) {
            rVar.T2(s12.f4918c, i11, i10, c6071c.g());
        } else {
            rVar.N2(s12.f4918c, i11, i10 + 1, c6071c.g());
            rVar.I(s12.f4918c, i11, i10);
        }
    }

    private static void e4(q2.Y y10, List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Y.d dVar = (Y.d) list.get(i10);
            int i11 = dVar.f56691n;
            int i12 = dVar.f56692o;
            if (i11 == -1 || i12 == -1) {
                dVar.f56691n = list2.size();
                dVar.f56692o = list2.size();
                list2.add(p3(i10));
            } else {
                dVar.f56691n = list2.size();
                dVar.f56692o = list2.size() + (i12 - i11);
                while (i11 <= i12) {
                    list2.add(E3(y10, i11, i10));
                    i11++;
                }
            }
        }
    }

    private void f4(int i10, int i11) {
        int iT = this.f4931p.f4675j.t();
        int iMin = Math.min(i11, iT);
        if (i10 >= iT || i10 == iMin || iT == 0) {
            return;
        }
        boolean z10 = K0() >= i10 && K0() < iMin;
        M6 m6L3 = L3(this.f4931p, i10, iMin, false, getCurrentPosition(), G0());
        int i12 = this.f4931p.f4668c.f5042a.f56619c;
        u4(m6L3, 0, null, z10 ? 4 : null, i12 >= i10 && i12 < iMin ? 3 : null);
    }

    private void g4(int i10, int i11, List list) {
        int iT = this.f4931p.f4675j.t();
        if (i10 > iT) {
            return;
        }
        if (this.f4931p.f4675j.u()) {
            r4(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i11, iT);
        M6 m6L3 = L3(K3(this.f4931p, iMin, list, getCurrentPosition(), G0()), i10, iMin, true, getCurrentPosition(), G0());
        int i12 = this.f4931p.f4668c.f5042a.f56619c;
        boolean z10 = i12 >= i10 && i12 < iMin;
        u4(m6L3, 0, null, z10 ? 4 : null, z10 ? 3 : null);
    }

    private boolean h4() {
        int i10 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
        Intent intent = new Intent("androidx.media3.session.MediaSessionService");
        intent.setClassName(this.f4920e.e(), this.f4920e.g());
        try {
            if (this.f4919d.bindService(intent, this.f4929n, i10)) {
                return true;
            }
            AbstractC6635w.i("MCImplBase", "bind to " + this.f4920e + " failed");
            return false;
        } catch (SecurityException e10) {
            AbstractC6635w.j("MCImplBase", "bind to " + this.f4920e + " not allowed", e10);
            return false;
        }
    }

    private void i3(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f4931p.f4675j.u()) {
            r4(list, -1, -9223372036854775807L, false);
        } else {
            u4(K3(this.f4931p, Math.min(i10, this.f4931p.f4675j.t()), list, getCurrentPosition(), G0()), 0, null, null, this.f4931p.f4675j.u() ? 3 : null);
        }
    }

    private boolean i4(Bundle bundle) {
        try {
            r.a.c((IBinder) AbstractC6614a.i(this.f4920e.a())).O0(this.f4918c, this.f4917b.c(), new C1371h(this.f4919d.getPackageName(), Process.myPid(), bundle, this.f4916a.e1()).b());
            return true;
        } catch (RemoteException e10) {
            AbstractC6635w.j("MCImplBase", "Failed to call connection request.", e10);
            return false;
        }
    }

    public static /* synthetic */ void j(S1 s12) {
        M6 m62 = s12.f4914I;
        if (m62 != null) {
            s12.Z3(m62, M6.c.f4723c);
        }
    }

    private void j3() {
        TextureView textureView = this.f4908C;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.f4908C = null;
        }
        SurfaceHolder surfaceHolder = this.f4907B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f4923h);
            this.f4907B = null;
        }
        if (this.f4906A != null) {
            this.f4906A = null;
        }
    }

    private static AbstractC2011u j4(List list, List list2, Bundle bundle, U6 u62, InterfaceC6084P.b bVar) {
        if (!list2.isEmpty()) {
            return C1323b.d(list2, u62, bVar);
        }
        boolean z10 = false;
        boolean z11 = (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bVar.d(6, 7)) ? false : true;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT") && !bVar.d(8, 9)) {
            z10 = true;
        }
        return C1323b.f(list, z11, z10);
    }

    public static /* synthetic */ void k1(S1 s12) {
        A aZ3 = s12.z3();
        A aZ32 = s12.z3();
        Objects.requireNonNull(aZ32);
        aZ3.k1(new RunnableC1372h0(aZ32));
    }

    private static AbstractC2011u k4(List list, List list2, U6 u62, InterfaceC6084P.b bVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = C1323b.i(list2, bVar, bundle);
        }
        return C1323b.d(list, u62, bVar);
    }

    private static int l4(int i10, boolean z10, int i11, q2.Y y10, int i12, int i13) {
        int iT = y10.t();
        for (int i14 = 0; i14 < iT && (i11 = y10.i(i11, i10, z10)) != -1; i14++) {
            if (i11 < i12 || i11 >= i13) {
                return i11;
            }
        }
        return -1;
    }

    public static /* synthetic */ void m1(S1 s12, Bundle bundle, boolean z10, boolean z11, A.c cVar) {
        cVar.a0(s12.z3(), bundle);
        if (z10) {
            cVar.K(s12.z3(), s12.f4936u);
        }
        if (z11) {
            cVar.G(s12.z3(), s12.f4935t);
        }
    }

    private static int m3(int i10) {
        if (i10 == 1) {
            return 0;
        }
        return i10;
    }

    private void m4(int i10, long j10) {
        int i11;
        int i12;
        M6 m6M3;
        q2.Y y10 = this.f4931p.f4675j;
        if ((y10.u() || i10 < y10.t()) && !D()) {
            int i13 = p() == 1 ? 1 : 2;
            M6 m62 = this.f4931p;
            M6 m6L = m62.l(i13, m62.f4666a);
            c cVarC3 = C3(y10, i10, j10);
            if (cVarC3 == null) {
                i11 = 1;
                i12 = 2;
                InterfaceC6084P.e eVar = new InterfaceC6084P.e(null, i10, null, null, i10, j10 == -9223372036854775807L ? 0L : j10, j10 == -9223372036854775807L ? 0L : j10, -1, -1);
                M6 m63 = this.f4931p;
                q2.Y y11 = m63.f4675j;
                boolean z10 = this.f4931p.f4668c.f5043b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                W6 w62 = this.f4931p.f4668c;
                m6M3 = O3(m63, y11, eVar, new W6(eVar, z10, jElapsedRealtime, w62.f5045d, j10 == -9223372036854775807L ? 0L : j10, 0, 0L, w62.f5049h, w62.f5050i, j10 == -9223372036854775807L ? 0L : j10), 1);
            } else {
                i11 = 1;
                i12 = 2;
                m6M3 = M3(m6L, y10, cVarC3);
            }
            int i14 = (this.f4931p.f4675j.u() || m6M3.f4668c.f5042a.f56619c == this.f4931p.f4668c.f5042a.f56619c) ? 0 : i11;
            if (i14 == 0 && m6M3.f4668c.f5042a.f56623g == this.f4931p.f4668c.f5042a.f56623g) {
                return;
            }
            u4(m6M3, null, null, Integer.valueOf(i11), i14 != 0 ? Integer.valueOf(i12) : null);
        }
    }

    private static InterfaceC6084P.b n3(InterfaceC6084P.b bVar, InterfaceC6084P.b bVar2) {
        InterfaceC6084P.b bVarF = L6.f(bVar, bVar2);
        return bVarF.c(32) ? bVarF : bVarF.b().a(32).f();
    }

    private void n4(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m4(K0(), Math.max(currentPosition, 0L));
    }

    private static q2.Y o3(List list, List list2) {
        return new Y.c(new AbstractC2011u.a().j(list).k(), new AbstractC2011u.a().j(list2).k(), L6.d(list.size()));
    }

    private void o4(int i10, X6 x62) {
        r rVar = this.f4910E;
        if (rVar == null) {
            return;
        }
        try {
            rVar.Z0(this.f4918c, i10, x62.b());
        } catch (RemoteException unused) {
            AbstractC6635w.i("MCImplBase", "Error in sending");
        }
    }

    private static Y.b p3(int i10) {
        return new Y.b().u(null, null, i10, -9223372036854775807L, 0L, C6087b.f56707g, true);
    }

    public void p4(final int i10, final com.google.common.util.concurrent.p pVar) {
        pVar.k(new Runnable() { // from class: E3.U
            @Override // java.lang.Runnable
            public final void run() {
                S1.B2(this.f4977a, pVar, i10);
            }
        }, com.google.common.util.concurrent.s.a());
    }

    private static Y.d q3(C6071C c6071c) {
        return new Y.d().h(0, c6071c, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
    }

    public static /* synthetic */ void r2(S1 s12, boolean z10, boolean z11, int i10, A.c cVar) {
        com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) AbstractC6614a.f(cVar.O(s12.z3(), s12.f4936u), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z10) {
            cVar.K(s12.z3(), s12.f4936u);
        }
        if (z11) {
            cVar.G(s12.z3(), s12.f4935t);
        }
        s12.p4(i10, pVar);
    }

    private com.google.common.util.concurrent.p r3(r rVar, d dVar, boolean z10) {
        if (rVar == null) {
            return com.google.common.util.concurrent.j.d(new X6(-4));
        }
        S6.a aVarA = this.f4917b.a(new X6(1));
        int iL = aVarA.L();
        if (z10) {
            if (this.f4926k.isEmpty()) {
                this.f4914I = this.f4931p;
            }
            this.f4926k.add(Integer.valueOf(iL));
        }
        try {
            dVar.a(rVar, iL);
            return aVarA;
        } catch (RemoteException e10) {
            AbstractC6635w.j("MCImplBase", "Cannot connect to the service or the session is gone", e10);
            this.f4926k.remove(Integer.valueOf(iL));
            this.f4917b.e(iL, new X6(-100));
            return aVarA;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:q2.P$e) from 0x0133: CONSTRUCTOR (r25v0 ?? I:E3.W6) = 
          (r26v0 ?? I:q2.P$e)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(q2.P$e, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: E3.W6.<init>(q2.P$e, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void r4(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:q2.P$e) from 0x0133: CONSTRUCTOR (r25v0 ?? I:E3.W6) = 
          (r26v0 ?? I:q2.P$e)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(q2.P$e, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: E3.W6.<init>(q2.P$e, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private void s3(d dVar) {
        this.f4925j.e();
        r3(this.f4910E, dVar, true);
    }

    private void s4(boolean z10, int i10) {
        int iG0 = g0();
        if (iG0 == 1) {
            iG0 = 0;
        }
        M6 m62 = this.f4931p;
        if (m62.f4685t == z10 && m62.f4689x == iG0) {
            return;
        }
        this.f4912G = L6.e(m62, this.f4912G, this.f4913H, z3().f1());
        this.f4913H = SystemClock.elapsedRealtime();
        u4(this.f4931p.j(z10, i10, iG0), null, Integer.valueOf(i10), null, null);
    }

    public void t3(d dVar) {
        this.f4925j.e();
        com.google.common.util.concurrent.p pVarR3 = r3(this.f4910E, dVar, true);
        try {
            AbstractC1466t.f0(pVarR3, 3000L);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10);
        } catch (TimeoutException e11) {
            if (pVarR3 instanceof S6.a) {
                int iL = ((S6.a) pVarR3).L();
                this.f4926k.remove(Integer.valueOf(iL));
                this.f4917b.e(iL, new X6(-1));
            }
            AbstractC6635w.j("MCImplBase", "Synchronous command takes too long on the session side.", e11);
        }
    }

    private com.google.common.util.concurrent.p u3(T6 t62, d dVar) {
        return v3(0, t62, dVar);
    }

    private void u4(M6 m62, Integer num, Integer num2, Integer num3, Integer num4) {
        M6 m63 = this.f4931p;
        this.f4931p = m62;
        S3(m63, m62, num, num2, num3, num4);
    }

    private com.google.common.util.concurrent.p v3(int i10, T6 t62, d dVar) {
        return r3(t62 != null ? H3(t62) : G3(i10), dVar, false);
    }

    private void v4(W6 w62) {
        if (this.f4926k.isEmpty()) {
            W6 w63 = this.f4931p.f4668c;
            if (w63.f5044c >= w62.f5044c || !L6.b(w62, w63)) {
                return;
            }
            this.f4931p = this.f4931p.s(w62);
        }
    }

    private static int y3(M6 m62) {
        int i10 = m62.f4668c.f5042a.f56619c;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static /* synthetic */ void z1(S1 s12) {
        e eVar = s12.f4929n;
        if (eVar != null) {
            s12.f4919d.unbindService(eVar);
            s12.f4929n = null;
        }
        s12.f4918c.V3();
    }

    @Override // E3.A.d
    public boolean A() {
        return this.f4910E != null;
    }

    @Override // E3.A.d
    public boolean A0() {
        return F3() != -1;
    }

    @Override // E3.A.d
    public void B(final Surface surface) {
        if (I3(27)) {
            j3();
            this.f4906A = surface;
            t3(new d() { // from class: E3.q0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.Z(this.f5491a.f4918c, i10, surface);
                }
            });
            int i10 = surface == null ? 0 : -1;
            P3(i10, i10);
        }
    }

    @Override // E3.A.d
    public int B0() {
        return this.f4931p.f4668c.f5042a.f56626j;
    }

    public int B3() {
        if (this.f4931p.f4675j.u()) {
            return -1;
        }
        return this.f4931p.f4675j.i(K0(), m3(this.f4931p.f4673h), this.f4931p.f4674i);
    }

    @Override // E3.A.d
    public void C(final C6077I c6077i) {
        if (I3(19)) {
            s3(new d() { // from class: E3.u0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.e0(this.f5537a.f4918c, i10, c6077i.e());
                }
            });
            if (this.f4931p.f4678m.equals(c6077i)) {
                return;
            }
            this.f4931p = this.f4931p.n(c6077i);
            this.f4924i.h(15, new C6634v.a() { // from class: E3.v0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).c0(c6077i);
                }
            });
            this.f4924i.f();
        }
    }

    @Override // E3.A.d
    public void C0(final int i10, final C6071C c6071c) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0);
            s3(new d() { // from class: E3.W
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    S1.b(this.f5011a, i10, c6071c, rVar, i11);
                }
            });
            g4(i10, i10 + 1, AbstractC2011u.B(c6071c));
        }
    }

    @Override // E3.A.d
    public boolean D() {
        return this.f4931p.f4668c.f5043b;
    }

    @Override // E3.A.d
    public void D0(final List list, final int i10, final long j10) {
        if (I3(20)) {
            s3(new d() { // from class: E3.M1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.h3(this.f4576a.f4918c, i11, new BinderC6095j(AbstractC6622i.i(list, new T())), i10, j10);
                }
            });
            r4(list, i10, j10, false);
        }
    }

    @Override // E3.A.d
    public long E() {
        return this.f4931p.f4668c.f5048g;
    }

    @Override // E3.A.d
    public void E0(final int i10) {
        if (I3(10)) {
            AbstractC6614a.a(i10 >= 0);
            s3(new d() { // from class: E3.H1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.g3(this.f4458a.f4918c, i11, i10);
                }
            });
            m4(i10, -9223372036854775807L);
        }
    }

    @Override // E3.A.d
    public void F(final boolean z10, final int i10) {
        if (I3(34)) {
            s3(new d() { // from class: E3.f1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.U(this.f5223a.f4918c, i11, z10, i10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4684s != z10) {
                this.f4931p = m62.d(m62.f4683r, z10);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.g1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(this.f5250a.f4931p.f4683r, z10);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public long F0() {
        return this.f4931p.f4662B;
    }

    public int F3() {
        if (this.f4931p.f4675j.u()) {
            return -1;
        }
        return this.f4931p.f4675j.p(K0(), m3(this.f4931p.f4673h), this.f4931p.f4674i);
    }

    @Override // E3.A.d
    public void G() {
        if (I3(20)) {
            s3(new d() { // from class: E3.i1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.E0(this.f5347a.f4918c, i10);
                }
            });
            f4(0, Integer.MAX_VALUE);
        }
    }

    @Override // E3.A.d
    public long G0() {
        W6 w62 = this.f4931p.f4668c;
        return !w62.f5043b ? getCurrentPosition() : w62.f5042a.f56624h;
    }

    r G3(int i10) {
        AbstractC6614a.a(i10 != 0);
        if (this.f4938w.b(i10)) {
            return this.f4910E;
        }
        AbstractC6635w.i("MCImplBase", "Controller isn't allowed to call command, commandCode=" + i10);
        return null;
    }

    @Override // E3.A.d
    public void H(InterfaceC6084P.d dVar) {
        this.f4924i.j(dVar);
    }

    @Override // E3.A.d
    public void H0(final int i10, final List list) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0);
            s3(new d() { // from class: E3.V
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.c3(this.f4990a.f4918c, i11, i10, new BinderC6095j(AbstractC6622i.i(list, new T())));
                }
            });
            i3(i10, list);
        }
    }

    r H3(T6 t62) {
        AbstractC6614a.a(t62.f4974a == 0);
        if (this.f4938w.c(t62)) {
            return this.f4910E;
        }
        AbstractC6635w.i("MCImplBase", "Controller isn't allowed to call custom session command:" + t62.f4975b);
        return null;
    }

    @Override // E3.A.d
    public int I() {
        return this.f4931p.f4668c.f5047f;
    }

    @Override // E3.A.d
    public long I0() {
        return this.f4931p.f4668c.f5046e;
    }

    @Override // E3.A.d
    public void J() {
        if (I3(6)) {
            s3(new d() { // from class: E3.p0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.r2(this.f5481a.f4918c, i10);
                }
            });
            if (F3() != -1) {
                m4(F3(), -9223372036854775807L);
            }
        }
    }

    @Override // E3.A.d
    public C6077I J0() {
        return this.f4931p.f4678m;
    }

    boolean J3() {
        return this.f4930o;
    }

    @Override // E3.A.d
    public void K() {
        if (I3(4)) {
            s3(new d() { // from class: E3.P
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.B3(this.f4773a.f4918c, i10);
                }
            });
            m4(K0(), -9223372036854775807L);
        }
    }

    @Override // E3.A.d
    public int K0() {
        return y3(this.f4931p);
    }

    @Override // E3.A.d
    public void L(final List list, final boolean z10) {
        if (I3(20)) {
            s3(new d() { // from class: E3.P1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.Q2(this.f4775a.f4918c, i10, new BinderC6095j(AbstractC6622i.i(list, new T())), z10);
                }
            });
            r4(list, -1, -9223372036854775807L, z10);
        }
    }

    @Override // E3.A.d
    public void L0(SurfaceView surfaceView) {
        if (I3(27)) {
            l3(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // E3.A.d
    public void M() {
        if (I3(26)) {
            s3(new d() { // from class: E3.C1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.m1(this.f4384a.f4918c, i10);
                }
            });
            final int i10 = this.f4931p.f4683r - 1;
            if (i10 >= getDeviceInfo().f56934b) {
                M6 m62 = this.f4931p;
                this.f4931p = m62.d(i10, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.D1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i10, this.f4400a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void M0(final int i10, final int i11) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0 && i11 >= 0);
            s3(new d() { // from class: E3.y1
                @Override // E3.S1.d
                public final void a(r rVar, int i12) {
                    rVar.N(this.f5604a.f4918c, i12, i10, i11);
                }
            });
            Q3(i10, i10 + 1, i11);
        }
    }

    @Override // E3.A.d
    public void N(final int i10) {
        if (I3(34)) {
            s3(new d() { // from class: E3.n1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.R2(this.f5435a.f4918c, i11, i10);
                }
            });
            final int i11 = this.f4931p.f4683r + 1;
            int i12 = getDeviceInfo().f56935c;
            if (i12 == 0 || i11 <= i12) {
                M6 m62 = this.f4931p;
                this.f4931p = m62.d(i11, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.o1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i11, this.f5463a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void N0(final int i10, final int i11, final int i12) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0 && i10 <= i11 && i12 >= 0);
            s3(new d() { // from class: E3.h1
                @Override // E3.S1.d
                public final void a(r rVar, int i13) {
                    rVar.B2(this.f5294a.f4918c, i13, i10, i11, i12);
                }
            });
            Q3(i10, i11, i12);
        }
    }

    @Override // E3.A.d
    public void O(SurfaceView surfaceView) {
        if (I3(27)) {
            t4(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // E3.A.d
    public void O0(final List list) {
        if (I3(20)) {
            s3(new d() { // from class: E3.X
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.W(this.f5052a.f4918c, i10, new BinderC6095j(AbstractC6622i.i(list, new T())));
                }
            });
            i3(h0().t(), list);
        }
    }

    @Override // E3.A.d
    public void P(final q2.d0 d0Var) {
        if (I3(29)) {
            s3(new d() { // from class: E3.l0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.i0(this.f5381a.f4918c, i10, d0Var.K());
                }
            });
            M6 m62 = this.f4931p;
            if (d0Var != m62.f4665E) {
                this.f4931p = m62.x(d0Var);
                this.f4924i.h(19, new C6634v.a() { // from class: E3.m0
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).Z(d0Var);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public boolean P0() {
        return this.f4931p.f4684s;
    }

    @Override // E3.A.d
    public void Q(final int i10, final int i11, final List list) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0 && i10 <= i11);
            s3(new d() { // from class: E3.S
                @Override // E3.S1.d
                public final void a(r rVar, int i12) {
                    S1.G1(this.f4901a, list, i10, i11, rVar, i12);
                }
            });
            g4(i10, i11, list);
        }
    }

    @Override // E3.A.d
    public boolean Q0() {
        return this.f4931p.f4674i;
    }

    @Override // E3.A.d
    public void R(final int i10) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0);
            s3(new d() { // from class: E3.J1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.I(this.f4539a.f4918c, i11, i10);
                }
            });
            f4(i10, i10 + 1);
        }
    }

    @Override // E3.A.d
    public long R0() {
        return this.f4931p.f4668c.f5051j;
    }

    public void R3(W6 w62) {
        if (A()) {
            v4(w62);
        }
    }

    @Override // E3.A.d
    public void S() {
        boolean zH4;
        if (this.f4920e.h() == 0) {
            this.f4929n = null;
            zH4 = i4(this.f4921f);
        } else {
            this.f4929n = new e(this.f4921f);
            zH4 = h4();
        }
        if (zH4) {
            return;
        }
        A aZ3 = z3();
        A aZ32 = z3();
        Objects.requireNonNull(aZ32);
        aZ3.k1(new RunnableC1372h0(aZ32));
    }

    @Override // E3.A.d
    public void S0(final int i10) {
        if (I3(25)) {
            s3(new d() { // from class: E3.A1
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.i1(this.f4319a.f4918c, i11, i10);
                }
            });
            C6101p deviceInfo = getDeviceInfo();
            M6 m62 = this.f4931p;
            if (m62.f4683r == i10 || deviceInfo.f56934b > i10) {
                return;
            }
            int i11 = deviceInfo.f56935c;
            if (i11 == 0 || i10 <= i11) {
                this.f4931p = m62.d(i10, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.B1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i10, this.f4331a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void T(final int i10, final int i11) {
        if (I3(20)) {
            AbstractC6614a.a(i10 >= 0 && i11 >= i10);
            s3(new d() { // from class: E3.I1
                @Override // E3.S1.d
                public final void a(r rVar, int i12) {
                    rVar.G2(this.f4475a.f4918c, i12, i10, i11);
                }
            });
            f4(i10, i11);
        }
    }

    @Override // E3.A.d
    public void T0() {
        if (I3(12)) {
            s3(new d() { // from class: E3.k1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.n2(this.f5371a.f4918c, i10);
                }
            });
            n4(F0());
        }
    }

    public void T3(InterfaceC6084P.b bVar) {
        boolean z10;
        boolean z11;
        if (A() && !Objects.equals(this.f4940y, bVar)) {
            this.f4940y = bVar;
            InterfaceC6084P.b bVar2 = this.f4941z;
            InterfaceC6084P.b bVarN3 = n3(this.f4939x, bVar);
            this.f4941z = bVarN3;
            if (Objects.equals(bVarN3, bVar2)) {
                z10 = false;
                z11 = false;
            } else {
                AbstractC2011u abstractC2011u = this.f4935t;
                AbstractC2011u abstractC2011u2 = this.f4936u;
                AbstractC2011u abstractC2011uK4 = k4(this.f4934s, this.f4933r, this.f4938w, this.f4941z, this.f4915J);
                this.f4935t = abstractC2011uK4;
                this.f4936u = j4(abstractC2011uK4, this.f4933r, this.f4915J, this.f4938w, this.f4941z);
                z10 = !this.f4935t.equals(abstractC2011u);
                z11 = !this.f4936u.equals(abstractC2011u2);
                this.f4924i.k(13, new C6634v.a() { // from class: E3.M
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).I(this.f4574a.f4941z);
                    }
                });
            }
            if (z11) {
                z3().i1(new InterfaceC6627n() { // from class: E3.N
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        S1 s12 = this.f4729a;
                        ((A.c) obj).K(s12.z3(), s12.f4936u);
                    }
                });
            }
            if (z10) {
                z3().i1(new InterfaceC6627n() { // from class: E3.O
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        S1 s12 = this.f4751a;
                        ((A.c) obj).G(s12.z3(), s12.f4935t);
                    }
                });
            }
        }
    }

    @Override // E3.A.d
    public void U() {
        if (I3(7)) {
            s3(new d() { // from class: E3.a0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.O1(this.f5121a.f4918c, i10);
                }
            });
            q2.Y yH0 = h0();
            if (yH0.u() || D()) {
                return;
            }
            boolean zA0 = A0();
            Y.d dVarR = yH0.r(K0(), new Y.d());
            if (dVarR.f56686i && dVarR.g()) {
                if (zA0) {
                    m4(F3(), -9223372036854775807L);
                }
            } else if (!zA0 || getCurrentPosition() > s0()) {
                m4(K0(), 0L);
            } else {
                m4(F3(), -9223372036854775807L);
            }
        }
    }

    @Override // E3.A.d
    public void U0() {
        if (I3(11)) {
            s3(new d() { // from class: E3.d0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.X0(this.f5184a.f4918c, i10);
                }
            });
            n4(-X0());
        }
    }

    public void U3(final U6 u62, InterfaceC6084P.b bVar) {
        boolean z10;
        boolean z11;
        if (A()) {
            boolean zEquals = Objects.equals(this.f4939x, bVar);
            boolean zEquals2 = Objects.equals(this.f4938w, u62);
            if (zEquals && zEquals2) {
                return;
            }
            this.f4938w = u62;
            boolean z12 = false;
            if (zEquals) {
                z10 = false;
            } else {
                this.f4939x = bVar;
                InterfaceC6084P.b bVar2 = this.f4941z;
                InterfaceC6084P.b bVarN3 = n3(bVar, this.f4940y);
                this.f4941z = bVarN3;
                z10 = !Objects.equals(bVarN3, bVar2);
            }
            if (!zEquals2 || z10) {
                AbstractC2011u abstractC2011u = this.f4935t;
                AbstractC2011u abstractC2011u2 = this.f4936u;
                AbstractC2011u abstractC2011uK4 = k4(this.f4934s, this.f4933r, u62, this.f4941z, this.f4915J);
                this.f4935t = abstractC2011uK4;
                this.f4936u = j4(abstractC2011uK4, this.f4933r, this.f4915J, u62, this.f4941z);
                z11 = !this.f4935t.equals(abstractC2011u);
                z12 = !this.f4936u.equals(abstractC2011u2);
            } else {
                z11 = false;
            }
            if (z10) {
                this.f4924i.k(13, new C6634v.a() { // from class: E3.I
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).I(this.f4472a.f4941z);
                    }
                });
            }
            if (!zEquals2) {
                z3().i1(new InterfaceC6627n() { // from class: E3.J
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        A.c cVar = (A.c) obj;
                        cVar.i0(this.f4536a.z3(), u62);
                    }
                });
            }
            if (z12) {
                z3().i1(new InterfaceC6627n() { // from class: E3.K
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        S1 s12 = this.f4548a;
                        ((A.c) obj).K(s12.z3(), s12.f4936u);
                    }
                });
            }
            if (z11) {
                z3().i1(new InterfaceC6627n() { // from class: E3.L
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj) {
                        S1 s12 = this.f4562a;
                        ((A.c) obj).G(s12.z3(), s12.f4935t);
                    }
                });
            }
        }
    }

    @Override // E3.A.d
    public void V(final boolean z10) {
        if (I3(1)) {
            s3(new d() { // from class: E3.x1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.q3(this.f5590a.f4918c, i10, z10);
                }
            });
            s4(z10, 1);
        } else if (z10) {
            AbstractC6635w.i("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // E3.A.d
    public C6077I V0() {
        return this.f4931p.f4691z;
    }

    public void V3(C1411m c1411m) {
        if (this.f4910E != null) {
            AbstractC6635w.d("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            z3().a();
            return;
        }
        this.f4910E = c1411m.f5409c;
        this.f4932q = c1411m.f5410d;
        this.f4938w = c1411m.f5411e;
        InterfaceC6084P.b bVar = c1411m.f5412f;
        this.f4939x = bVar;
        InterfaceC6084P.b bVar2 = c1411m.f5413g;
        this.f4940y = bVar2;
        InterfaceC6084P.b bVarN3 = n3(bVar, bVar2);
        this.f4941z = bVarN3;
        AbstractC2011u abstractC2011u = c1411m.f5417k;
        this.f4933r = abstractC2011u;
        AbstractC2011u abstractC2011u2 = c1411m.f5418l;
        this.f4934s = abstractC2011u2;
        AbstractC2011u abstractC2011uK4 = k4(abstractC2011u2, abstractC2011u, this.f4938w, bVarN3, c1411m.f5415i);
        this.f4935t = abstractC2011uK4;
        this.f4936u = j4(abstractC2011uK4, this.f4933r, c1411m.f5415i, this.f4938w, this.f4941z);
        AbstractC2012v.a aVar = new AbstractC2012v.a();
        for (int i10 = 0; i10 < c1411m.f5420n.size(); i10++) {
            C1323b c1323b = (C1323b) c1411m.f5420n.get(i10);
            T6 t62 = c1323b.f5141a;
            if (t62 != null && t62.f4974a == 0) {
                aVar.f(t62.f4975b, c1323b);
            }
        }
        this.f4937v = aVar.c();
        this.f4931p = c1411m.f5416j;
        MediaSession.Token tokenF = c1411m.f5419m;
        if (tokenF == null) {
            tokenF = this.f4920e.f();
        }
        MediaSession.Token token = tokenF;
        if (token != null) {
            this.f4911F = new MediaController(this.f4919d, token);
        }
        try {
            c1411m.f5409c.asBinder().linkToDeath(this.f4922g, 0);
            this.f4928m = new Y6(this.f4920e.i(), 0, c1411m.f5407a, c1411m.f5408b, this.f4920e.e(), c1411m.f5409c, c1411m.f5414h, token);
            this.f4915J = c1411m.f5415i;
            z3().h1();
        } catch (RemoteException unused) {
            z3().a();
        }
    }

    @Override // E3.A.d
    public void W() {
        if (I3(8)) {
            s3(new d() { // from class: E3.z1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.I1(this.f5616a.f4918c, i10);
                }
            });
            if (B3() != -1) {
                m4(B3(), -9223372036854775807L);
            }
        }
    }

    @Override // E3.A.d
    public void W0(final C6088c c6088c, final boolean z10) {
        if (I3(35)) {
            s3(new d() { // from class: E3.E1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.f3(this.f4413a.f4918c, i10, c6088c.d(), z10);
                }
            });
            if (this.f4931p.f4680o.equals(c6088c)) {
                return;
            }
            this.f4931p = this.f4931p.a(c6088c);
            this.f4924i.h(20, new C6634v.a() { // from class: E3.F1
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).e0(c6088c);
                }
            });
            this.f4924i.f();
        }
    }

    public void W3(final int i10, final T6 t62, final Bundle bundle) {
        if (A()) {
            z3().i1(new InterfaceC6627n() { // from class: E3.F
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    S1 s12 = this.f4427a;
                    s12.p4(i10, (com.google.common.util.concurrent.p) AbstractC6614a.f(((A.c) obj).q0(s12.z3(), t62, bundle), "ControllerCallback#onCustomCommand() must not return null"));
                }
            });
        }
    }

    @Override // E3.A.d
    public void X(final int i10) {
        if (I3(34)) {
            s3(new d() { // from class: E3.r0
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.Q0(this.f5502a.f4918c, i11, i10);
                }
            });
            final int i11 = this.f4931p.f4683r - 1;
            if (i11 >= getDeviceInfo().f56934b) {
                M6 m62 = this.f4931p;
                this.f4931p = m62.d(i11, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.t0
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i11, this.f5528a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public long X0() {
        return this.f4931p.f4661A;
    }

    public void X3(int i10, final V6 v62) {
        if (A()) {
            z3().i1(new InterfaceC6627n() { // from class: E3.H
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    A.c cVar = (A.c) obj;
                    cVar.U(this.f4455a.z3(), v62);
                }
            });
        }
    }

    @Override // E3.A.d
    public q2.h0 Y() {
        return this.f4931p.f4664D;
    }

    @Override // E3.A.d
    public U6 Y0() {
        return this.f4938w;
    }

    public void Y3(final Bundle bundle) {
        if (A()) {
            AbstractC2011u abstractC2011u = this.f4935t;
            AbstractC2011u abstractC2011u2 = this.f4936u;
            this.f4915J = bundle;
            AbstractC2011u abstractC2011uK4 = k4(this.f4934s, this.f4933r, this.f4938w, this.f4941z, bundle);
            this.f4935t = abstractC2011uK4;
            this.f4936u = j4(abstractC2011uK4, this.f4933r, this.f4915J, this.f4938w, this.f4941z);
            final boolean z10 = !this.f4935t.equals(abstractC2011u);
            final boolean z11 = !this.f4936u.equals(abstractC2011u2);
            z3().i1(new InterfaceC6627n() { // from class: E3.N1
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    S1.m1(this.f4731a, bundle, z11, z10, (A.c) obj);
                }
            });
        }
    }

    @Override // E3.A.d
    public boolean Z() {
        return B3() != -1;
    }

    @Override // E3.A.d
    public com.google.common.util.concurrent.p Z0(final T6 t62, final Bundle bundle) {
        return u3(t62, new d() { // from class: E3.R1
            @Override // E3.S1.d
            public final void a(r rVar, int i10) {
                rVar.Z1(this.f4890a.f4918c, i10, t62.b(), bundle);
            }
        });
    }

    public void Z3(M6 m62, M6.c cVar) {
        if (A()) {
            M6 m63 = this.f4914I;
            if (m63 != null) {
                this.f4914I = L6.g(m63, m62, cVar, this.f4941z);
                if (!this.f4926k.isEmpty()) {
                    return;
                }
                m62 = this.f4914I;
                cVar = M6.c.f4723c;
                this.f4914I = null;
            }
            M6 m64 = this.f4931p;
            M6 m6G = L6.g(m64, m62, cVar, this.f4941z);
            this.f4931p = m6G;
            Integer numValueOf = (m64.f4669d.equals(m62.f4669d) && m64.f4670e.equals(m62.f4670e)) ? null : Integer.valueOf(m6G.f4671f);
            Integer numValueOf2 = !Objects.equals(m64.C(), m6G.C()) ? Integer.valueOf(m6G.f4667b) : null;
            Integer numValueOf3 = !m64.f4675j.equals(m6G.f4675j) ? Integer.valueOf(m6G.f4676k) : null;
            int i10 = m64.f4686u;
            int i11 = m6G.f4686u;
            S3(m64, m6G, numValueOf3, (i10 == i11 && m64.f4685t == m6G.f4685t) ? null : Integer.valueOf(i11), numValueOf, numValueOf2);
        }
    }

    @Override // E3.A.d
    public void a() {
        r rVar = this.f4910E;
        if (this.f4930o) {
            return;
        }
        this.f4930o = true;
        this.f4928m = null;
        this.f4927l.removeCallbacksAndMessages(null);
        this.f4925j.d();
        this.f4910E = null;
        if (rVar != null) {
            int iC = this.f4917b.c();
            try {
                rVar.asBinder().unlinkToDeath(this.f4922g, 0);
                rVar.V2(this.f4918c, iC);
            } catch (RemoteException unused) {
            }
        }
        this.f4924i.i();
        this.f4917b.b(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: E3.e1
            @Override // java.lang.Runnable
            public final void run() {
                S1.z1(this.f5205a);
            }
        });
    }

    @Override // E3.A.d
    public void a0(InterfaceC6084P.d dVar) {
        this.f4924i.c(dVar);
    }

    @Override // E3.A.d
    public Bundle a1() {
        return this.f4921f;
    }

    public void a4() {
        this.f4924i.k(26, new A2.H());
    }

    @Override // E3.A.d
    public C6407e b0() {
        return this.f4931p.f4681p;
    }

    public void b4(final int i10, List list) {
        if (A()) {
            AbstractC2011u abstractC2011u = this.f4935t;
            AbstractC2011u abstractC2011u2 = this.f4936u;
            this.f4933r = AbstractC2011u.w(list);
            AbstractC2011u abstractC2011uK4 = k4(this.f4934s, list, this.f4938w, this.f4941z, this.f4915J);
            this.f4935t = abstractC2011uK4;
            this.f4936u = j4(abstractC2011uK4, list, this.f4915J, this.f4938w, this.f4941z);
            final boolean z10 = !this.f4935t.equals(abstractC2011u);
            final boolean z11 = !this.f4936u.equals(abstractC2011u2);
            z3().i1(new InterfaceC6627n() { // from class: E3.G
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    S1.I1(this.f4442a, z11, z10, i10, (A.c) obj);
                }
            });
        }
    }

    @Override // E3.A.d
    public C6083O c() {
        return this.f4931p.f4672g;
    }

    @Override // E3.A.d
    public int c0() {
        return this.f4931p.f4668c.f5042a.f56625i;
    }

    public void c4(final int i10, List list) {
        if (A()) {
            AbstractC2011u abstractC2011u = this.f4935t;
            AbstractC2011u abstractC2011u2 = this.f4936u;
            this.f4934s = AbstractC2011u.w(list);
            AbstractC2011u abstractC2011uK4 = k4(list, this.f4933r, this.f4938w, this.f4941z, this.f4915J);
            this.f4935t = abstractC2011uK4;
            this.f4936u = j4(abstractC2011uK4, this.f4933r, this.f4915J, this.f4938w, this.f4941z);
            final boolean z10 = !this.f4935t.equals(abstractC2011u);
            final boolean z11 = !this.f4936u.equals(abstractC2011u2);
            z3().i1(new InterfaceC6627n() { // from class: E3.O1
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    S1.r2(this.f4754a, z11, z10, i10, (A.c) obj);
                }
            });
        }
    }

    @Override // E3.A.d
    public void d0(final C6071C c6071c, final boolean z10) {
        if (I3(31)) {
            s3(new d() { // from class: E3.Q
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.Y(this.f4862a.f4918c, i10, c6071c.g(), z10);
                }
            });
            r4(Collections.singletonList(c6071c), -1, -9223372036854775807L, z10);
        }
    }

    public void d4(int i10, final PendingIntent pendingIntent) {
        if (!A() || Objects.equals(this.f4932q, pendingIntent)) {
            return;
        }
        this.f4932q = pendingIntent;
        z3().i1(new InterfaceC6627n() { // from class: E3.Q1
            @Override // t2.InterfaceC6627n
            public final void accept(Object obj) {
                A.c cVar = (A.c) obj;
                cVar.j0(this.f4866a.z3(), pendingIntent);
            }
        });
    }

    @Override // E3.A.d
    public void e(final C6083O c6083o) {
        if (I3(13)) {
            s3(new d() { // from class: E3.s0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.r3(this.f5516a.f4918c, i10, c6083o.c());
                }
            });
            if (this.f4931p.f4672g.equals(c6083o)) {
                return;
            }
            this.f4931p = this.f4931p.k(c6083o);
            this.f4924i.h(12, new C6634v.a() { // from class: E3.D0
                @Override // t2.C6634v.a
                public final void invoke(Object obj) {
                    ((InterfaceC6084P.d) obj).n(c6083o);
                }
            });
            this.f4924i.f();
        }
    }

    @Override // E3.A.d
    public void e0(final boolean z10) {
        if (I3(26)) {
            s3(new d() { // from class: E3.r1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.c0(this.f5504a.f4918c, i10, z10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4684s != z10) {
                this.f4931p = m62.d(m62.f4683r, z10);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.s1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(this.f5518a.f4931p.f4683r, z10);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void f0(final C6071C c6071c, final long j10) {
        if (I3(31)) {
            s3(new d() { // from class: E3.L1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.b3(this.f4564a.f4918c, i10, c6071c.g(), j10);
                }
            });
            r4(Collections.singletonList(c6071c), -1, j10, false);
        }
    }

    @Override // E3.A.d
    public int g0() {
        return this.f4931p.f4689x;
    }

    @Override // E3.A.d
    public long getCurrentPosition() {
        long jE = L6.e(this.f4931p, this.f4912G, this.f4913H, z3().f1());
        this.f4912G = jE;
        return jE;
    }

    @Override // E3.A.d
    public C6101p getDeviceInfo() {
        return this.f4931p.f4682q;
    }

    @Override // E3.A.d
    public long getDuration() {
        return this.f4931p.f4668c.f5045d;
    }

    @Override // E3.A.d
    public q2.Y h0() {
        return this.f4931p.f4675j;
    }

    @Override // E3.A.d
    public void i0() {
        if (I3(26)) {
            s3(new d() { // from class: E3.j1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.J2(this.f5358a.f4918c, i10);
                }
            });
            final int i10 = this.f4931p.f4683r + 1;
            int i11 = getDeviceInfo().f56935c;
            if (i11 == 0 || i10 <= i11) {
                M6 m62 = this.f4931p;
                this.f4931p = m62.d(i10, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.l1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i10, this.f5383a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public boolean isPlaying() {
        return this.f4931p.f4687v;
    }

    @Override // E3.A.d
    public q2.d0 j0() {
        return this.f4931p.f4665E;
    }

    @Override // E3.A.d
    public void k0() {
        if (I3(9)) {
            s3(new d() { // from class: E3.E
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.d2(this.f4411a.f4918c, i10);
                }
            });
            q2.Y yH0 = h0();
            if (yH0.u() || D()) {
                return;
            }
            if (Z()) {
                m4(B3(), -9223372036854775807L);
                return;
            }
            Y.d dVarR = yH0.r(K0(), new Y.d());
            if (dVarR.f56686i && dVarR.g()) {
                m4(K0(), -9223372036854775807L);
            }
        }
    }

    public void k3() {
        if (I3(27)) {
            j3();
            t3(new d() { // from class: E3.Z0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.Z(this.f5089a.f4918c, i10, null);
                }
            });
            P3(0, 0);
        }
    }

    @Override // E3.A.d
    public void l0(TextureView textureView) {
        if (I3(27)) {
            if (textureView == null) {
                k3();
                return;
            }
            if (this.f4908C == textureView) {
                return;
            }
            j3();
            this.f4908C = textureView;
            textureView.setSurfaceTextureListener(this.f4923h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                t3(new d() { // from class: E3.n0
                    @Override // E3.S1.d
                    public final void a(r rVar, int i10) {
                        rVar.Z(this.f5434a.f4918c, i10, null);
                    }
                });
                P3(0, 0);
            } else {
                this.f4906A = new Surface(surfaceTexture);
                t3(new d() { // from class: E3.o0
                    @Override // E3.S1.d
                    public final void a(r rVar, int i10) {
                        S1 s12 = this.f5462a;
                        rVar.Z(s12.f4918c, i10, s12.f4906A);
                    }
                });
                P3(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    public void l3(SurfaceHolder surfaceHolder) {
        if (I3(27) && surfaceHolder != null && this.f4907B == surfaceHolder) {
            k3();
        }
    }

    @Override // E3.A.d
    public int m0() {
        return this.f4931p.f4683r;
    }

    @Override // E3.A.d
    public long n0() {
        return this.f4931p.f4668c.f5049h;
    }

    @Override // E3.A.d
    public void o0(final int i10, final long j10) {
        if (I3(10)) {
            AbstractC6614a.a(i10 >= 0);
            s3(new d() { // from class: E3.f0
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.X2(this.f5220a.f4918c, i11, i10, j10);
                }
            });
            m4(i10, j10);
        }
    }

    @Override // E3.A.d
    public int p() {
        return this.f4931p.f4690y;
    }

    @Override // E3.A.d
    public InterfaceC6084P.b p0() {
        return this.f4941z;
    }

    @Override // E3.A.d
    public void pause() {
        if (I3(1)) {
            s3(new d() { // from class: E3.e0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.F3(this.f5204a.f4918c, i10);
                }
            });
            s4(false, 1);
        }
    }

    @Override // E3.A.d
    public boolean q() {
        return this.f4931p.f4688w;
    }

    @Override // E3.A.d
    public boolean q0() {
        return this.f4931p.f4685t;
    }

    void q4(final int i10, Object obj) {
        this.f4917b.e(i10, obj);
        z3().k1(new Runnable() { // from class: E3.m1
            @Override // java.lang.Runnable
            public final void run() {
                S1.L2(this.f5423a, i10);
            }
        });
    }

    @Override // E3.A.d
    public void r0(final boolean z10) {
        if (I3(14)) {
            s3(new d() { // from class: E3.Y
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.V1(this.f5067a.f4918c, i10, z10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4674i != z10) {
                this.f4931p = m62.t(z10);
                this.f4924i.h(9, new C6634v.a() { // from class: E3.Z
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).M(z10);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void s() {
        if (I3(2)) {
            s3(new d() { // from class: E3.i0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.t0(this.f5346a.f4918c, i10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4690y == 1) {
                u4(m62.l(m62.f4675j.u() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // E3.A.d
    public long s0() {
        return this.f4931p.f4663C;
    }

    @Override // E3.A.d
    public void stop() {
        if (I3(3)) {
            s3(new d() { // from class: E3.p1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.S1(this.f5482a.f4918c, i10);
                }
            });
            M6 m62 = this.f4931p;
            W6 w62 = this.f4931p.f4668c;
            InterfaceC6084P.e eVar = w62.f5042a;
            boolean z10 = w62.f5043b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            W6 w63 = this.f4931p.f4668c;
            long j10 = w63.f5045d;
            long j11 = w63.f5042a.f56623g;
            int iC = L6.c(j11, j10);
            W6 w64 = this.f4931p.f4668c;
            M6 m6S = m62.s(new W6(eVar, z10, jElapsedRealtime, j10, j11, iC, 0L, w64.f5049h, w64.f5050i, w64.f5042a.f56623g));
            this.f4931p = m6S;
            if (m6S.f4690y != 1) {
                this.f4931p = m6S.l(1, m6S.f4666a);
                this.f4924i.h(4, new C6634v.a() { // from class: E3.q1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).J(1);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void t(final float f10) {
        if (I3(13)) {
            s3(new d() { // from class: E3.c1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.d1(this.f5172a.f4918c, i10, f10);
                }
            });
            C6083O c6083o = this.f4931p.f4672g;
            if (c6083o.f56601a != f10) {
                final C6083O c6083oD = c6083o.d(f10);
                this.f4931p = this.f4931p.k(c6083oD);
                this.f4924i.h(12, new C6634v.a() { // from class: E3.d1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).n(c6083oD);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public long t0() {
        return this.f4931p.f4668c.f5050i;
    }

    public void t4(SurfaceHolder surfaceHolder) {
        if (I3(27)) {
            if (surfaceHolder == null) {
                k3();
                return;
            }
            if (this.f4907B == surfaceHolder) {
                return;
            }
            j3();
            this.f4907B = surfaceHolder;
            surfaceHolder.addCallback(this.f4923h);
            final Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.f4906A = null;
                t3(new d() { // from class: E3.G1
                    @Override // E3.S1.d
                    public final void a(r rVar, int i10) {
                        rVar.Z(this.f4447a.f4918c, i10, null);
                    }
                });
                P3(0, 0);
            } else {
                this.f4906A = surface;
                t3(new d() { // from class: E3.v1
                    @Override // E3.S1.d
                    public final void a(r rVar, int i10) {
                        rVar.Z(this.f5549a.f4918c, i10, surface);
                    }
                });
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                P3(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // E3.A.d
    public void u() {
        MediaController mediaController;
        if (!I3(1)) {
            AbstractC6635w.i("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.f4911F) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        s3(new d() { // from class: E3.g0
            @Override // E3.S1.d
            public final void a(r rVar, int i10) {
                rVar.q1(this.f5249a.f4918c, i10);
            }
        });
        s4(true, 1);
    }

    @Override // E3.A.d
    public int u0() {
        return this.f4931p.f4668c.f5042a.f56622f;
    }

    @Override // E3.A.d
    public void v(final int i10) {
        if (I3(15)) {
            s3(new d() { // from class: E3.j0
                @Override // E3.S1.d
                public final void a(r rVar, int i11) {
                    rVar.V(this.f5356a.f4918c, i11, i10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4673h != i10) {
                this.f4931p = m62.p(i10);
                this.f4924i.h(8, new C6634v.a() { // from class: E3.k0
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).F(i10);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public void v0(TextureView textureView) {
        if (I3(27) && textureView != null && this.f4908C == textureView) {
            k3();
        }
    }

    @Override // E3.A.d
    public void w(final float f10) {
        if (I3(24)) {
            s3(new d() { // from class: E3.t1
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.h1(this.f5530a.f4918c, i10, f10);
                }
            });
            M6 m62 = this.f4931p;
            if (m62.f4679n != f10) {
                this.f4931p = m62.z(f10);
                this.f4924i.h(22, new C6634v.a() { // from class: E3.u1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        ((InterfaceC6084P.d) obj).d0(f10);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    @Override // E3.A.d
    public q2.l0 w0() {
        return this.f4931p.f4677l;
    }

    public Y6 w3() {
        return this.f4928m;
    }

    @Override // E3.A.d
    public int x() {
        return this.f4931p.f4673h;
    }

    @Override // E3.A.d
    public float x0() {
        return this.f4931p.f4679n;
    }

    public Context x3() {
        return this.f4919d;
    }

    @Override // E3.A.d
    public C6082N y() {
        return this.f4931p.f4666a;
    }

    @Override // E3.A.d
    public C6088c y0() {
        return this.f4931p.f4680o;
    }

    @Override // E3.A.d
    public void z(final long j10) {
        if (I3(5)) {
            s3(new d() { // from class: E3.O0
                @Override // E3.S1.d
                public final void a(r rVar, int i10) {
                    rVar.v1(this.f4752a.f4918c, i10, j10);
                }
            });
            m4(K0(), j10);
        }
    }

    @Override // E3.A.d
    public void z0(final int i10, final int i11) {
        if (I3(33)) {
            s3(new d() { // from class: E3.a1
                @Override // E3.S1.d
                public final void a(r rVar, int i12) {
                    rVar.K0(this.f5122a.f4918c, i12, i10, i11);
                }
            });
            C6101p deviceInfo = getDeviceInfo();
            M6 m62 = this.f4931p;
            if (m62.f4683r == i10 || deviceInfo.f56934b > i10) {
                return;
            }
            int i12 = deviceInfo.f56935c;
            if (i12 == 0 || i10 <= i12) {
                this.f4931p = m62.d(i10, m62.f4684s);
                this.f4924i.h(30, new C6634v.a() { // from class: E3.b1
                    @Override // t2.C6634v.a
                    public final void invoke(Object obj) {
                        InterfaceC6084P.d dVar = (InterfaceC6084P.d) obj;
                        dVar.P(i10, this.f5160a.f4931p.f4684s);
                    }
                });
                this.f4924i.f();
            }
        }
    }

    A z3() {
        return this.f4916a;
    }
}
