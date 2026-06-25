package S2;

import A2.C1004b;
import A2.C1005c;
import A2.P;
import J2.InterfaceC1737q;
import J2.N;
import M2.D;
import P9.AbstractC2011u;
import S2.K;
import S2.L;
import S2.q;
import S2.v;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.C2907s;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import q2.AbstractC6079K;
import q2.C6109x;
import q2.Y;
import q2.j0;
import q2.l0;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.AbstractC6638z;
import t2.C6611K;
import t2.a0;

/* JADX INFO: renamed from: S2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2135k extends J2.A implements v.b {

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final int[] f15696b2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static boolean f15697c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static boolean f15698d2;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    private List f15699A1;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    private Surface f15700B1;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    private m f15701C1;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    private C6611K f15702D1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    private boolean f15703E1;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    private int f15704F1;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    private int f15705G1;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    private long f15706H1;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    private int f15707I1;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    private int f15708J1;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    private int f15709K1;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    private P f15710L1;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    private boolean f15711M1;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    private long f15712N1;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    private int f15713O1;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    private long f15714P1;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    private l0 f15715Q1;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    private l0 f15716R1;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    private int f15717S1;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    private boolean f15718T1;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    private int f15719U1;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    f f15720V1;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    private u f15721W1;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    private long f15722X1;

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    private long f15723Y1;

    /* JADX INFO: renamed from: Z1, reason: collision with root package name */
    private boolean f15724Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private int f15725a2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private final Context f15726i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private final boolean f15727j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final K.a f15728k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private final int f15729l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private final boolean f15730m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final v f15731n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private final v.a f15732o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final C2125a f15733p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private final long f15734q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private final w f15735r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private final PriorityQueue f15736s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final boolean f15737t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private e f15738u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private boolean f15739v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private boolean f15740w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private L f15741x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private boolean f15742y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private int f15743z1;

    /* JADX INFO: renamed from: S2.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements L.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1737q f15745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15747c;

        b(InterfaceC1737q interfaceC1737q, int i10, long j10) {
            this.f15745a = interfaceC1737q;
            this.f15746b = i10;
            this.f15747c = j10;
        }

        @Override // S2.L.b
        public void a(long j10) {
            C2135k.this.W2(this.f15745a, this.f15746b, this.f15747c, j10);
        }

        @Override // S2.L.b
        public void b() {
            C2135k.this.j3(this.f15745a, this.f15746b, this.f15747c);
        }
    }

    /* JADX INFO: renamed from: S2.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: S2.k$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f15749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f15750b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC1737q.b f15752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f15753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Handler f15755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private K f15756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f15757i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private L f15759k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f15760l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f15762n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private J2.E f15751c = J2.E.f9326a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f15758j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f15761m = -9223372036854775807L;

        public d(Context context) {
            this.f15749a = context;
            this.f15752d = InterfaceC1737q.b.a(context);
        }

        public C2135k n() {
            AbstractC6614a.g(!this.f15750b);
            Handler handler = this.f15755g;
            AbstractC6614a.g((handler == null && this.f15756h == null) || !(handler == null || this.f15756h == null));
            this.f15750b = true;
            return new C2135k(this);
        }

        public d o(boolean z10) {
            this.f15762n = z10;
            return this;
        }

        public d p(long j10) {
            this.f15761m = j10;
            return this;
        }

        public d q(boolean z10) {
            this.f15760l = z10;
            return this;
        }

        public d r(long j10) {
            this.f15753e = j10;
            return this;
        }

        public d s(InterfaceC1737q.b bVar) {
            this.f15752d = bVar;
            return this;
        }

        public d t(boolean z10) {
            this.f15754f = z10;
            return this;
        }

        public d u(Handler handler) {
            this.f15755g = handler;
            return this;
        }

        public d v(K k10) {
            this.f15756h = k10;
            return this;
        }

        public d w(int i10) {
            this.f15757i = i10;
            return this;
        }

        public d x(J2.E e10) {
            this.f15751c = e10;
            return this;
        }
    }

    /* JADX INFO: renamed from: S2.k$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15765c;

        public e(int i10, int i11, int i12) {
            this.f15763a = i10;
            this.f15764b = i11;
            this.f15765c = i12;
        }
    }

    /* JADX INFO: renamed from: S2.k$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class f implements InterfaceC1737q.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f15766a;

        public f(InterfaceC1737q interfaceC1737q) {
            Handler handlerD = a0.D(this);
            this.f15766a = handlerD;
            interfaceC1737q.g(this, handlerD);
        }

        private void b(long j10) {
            C2135k c2135k = C2135k.this;
            if (this != c2135k.f15720V1 || c2135k.N0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                C2135k.this.T2();
                return;
            }
            try {
                C2135k.this.S2(j10);
            } catch (C2907s e10) {
                C2135k.this.Q1(e10);
            }
        }

        @Override // J2.InterfaceC1737q.d
        public void a(InterfaceC1737q interfaceC1737q, long j10, long j11) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j10);
            } else {
                this.f15766a.sendMessageAtFrontOfQueue(Message.obtain(this.f15766a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(a0.B1(message.arg1, message.arg2));
            return true;
        }
    }

    protected C2135k(d dVar) {
        super(2, dVar.f15752d, dVar.f15751c, dVar.f15754f, dVar.f15758j);
        Context applicationContext = dVar.f15749a.getApplicationContext();
        this.f15726i1 = applicationContext;
        this.f15729l1 = dVar.f15757i;
        this.f15741x1 = dVar.f15759k;
        this.f15728k1 = new K.a(dVar.f15755g, dVar.f15756h);
        this.f15727j1 = this.f15741x1 == null;
        this.f15731n1 = new v(applicationContext, this, dVar.f15753e);
        this.f15732o1 = new v.a();
        this.f15730m1 = s2();
        this.f15702D1 = C6611K.f60536c;
        this.f15704F1 = 1;
        this.f15705G1 = 0;
        this.f15715Q1 = l0.f56919e;
        this.f15719U1 = 0;
        this.f15716R1 = null;
        this.f15717S1 = -1000;
        this.f15722X1 = -9223372036854775807L;
        this.f15723Y1 = -9223372036854775807L;
        this.f15733p1 = dVar.f15760l ? new C2125a() : null;
        this.f15736s1 = new PriorityQueue();
        if (dVar.f15761m != -9223372036854775807L) {
            this.f15734q1 = -dVar.f15761m;
            this.f15735r1 = new w(1.0f);
        } else {
            this.f15734q1 = -9223372036854775807L;
            this.f15735r1 = null;
        }
        this.f15737t1 = dVar.f15762n;
        this.f15710L1 = null;
    }

    protected static int A2(J2.t tVar, C6109x c6109x) {
        if (c6109x.f57023p == -1) {
            return w2(tVar, c6109x);
        }
        int size = c6109x.f57025r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) c6109x.f57025r.get(i10)).length;
        }
        return c6109x.f57023p + length;
    }

    private static int B2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface D2(J2.t tVar) {
        L l10 = this.f15741x1;
        if (l10 != null) {
            return l10.o();
        }
        Surface surface = this.f15700B1;
        if (surface != null) {
            return surface;
        }
        if (h3(tVar)) {
            return null;
        }
        AbstractC6614a.g(i3(tVar));
        m mVar = this.f15701C1;
        if (mVar != null && mVar.f15770a != tVar.f9415g) {
            V2();
        }
        if (this.f15701C1 == null) {
            this.f15701C1 = m.c(this.f15726i1, tVar.f9415g);
        }
        return this.f15701C1;
    }

    private boolean E2(J2.t tVar) {
        if (this.f15741x1 != null) {
            return true;
        }
        Surface surface = this.f15700B1;
        return (surface != null && surface.isValid()) || h3(tVar) || i3(tVar);
    }

    private boolean F2(z2.f fVar) {
        return fVar.f65557f < X();
    }

    private boolean G2(z2.f fVar) {
        if (i() || fVar.t() || this.f15723Y1 == -9223372036854775807L) {
            return true;
        }
        return this.f15723Y1 - (fVar.f65557f - Y0()) <= 100000;
    }

    private void I2() {
        if (this.f15707I1 > 0) {
            long jC = T().c();
            this.f15728k1.n(this.f15707I1, jC - this.f15706H1);
            this.f15707I1 = 0;
            this.f15706H1 = jC;
        }
    }

    private void J2() {
        if (!this.f15731n1.g() || this.f15700B1 == null) {
            return;
        }
        R2();
    }

    private void K2() {
        int i10 = this.f15713O1;
        if (i10 != 0) {
            this.f15728k1.r(this.f15712N1, i10);
            this.f15712N1 = 0L;
            this.f15713O1 = 0;
        }
    }

    private void L2(l0 l0Var) {
        if (l0Var.equals(l0.f56919e) || l0Var.equals(this.f15716R1)) {
            return;
        }
        this.f15716R1 = l0Var;
        this.f15728k1.t(l0Var);
    }

    private void M2() {
        Surface surface = this.f15700B1;
        if (surface == null || !this.f15703E1) {
            return;
        }
        this.f15728k1.q(surface);
    }

    private void N2() {
        l0 l0Var = this.f15716R1;
        if (l0Var != null) {
            this.f15728k1.t(l0Var);
        }
    }

    private void O2(MediaFormat mediaFormat) {
        if (this.f15741x1 == null || a0.M0(this.f15726i1)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void P2() {
        if (this.f15718T1) {
            int i10 = Build.VERSION.SDK_INT;
            InterfaceC1737q interfaceC1737qN0 = N0();
            if (interfaceC1737qN0 == null) {
                return;
            }
            this.f15720V1 = new f(interfaceC1737qN0);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                interfaceC1737qN0.d(bundle);
            }
        }
    }

    private void Q2(long j10, long j11, C6109x c6109x) {
        u uVar = this.f15721W1;
        if (uVar != null) {
            uVar.h(j10, j11, c6109x, T0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.f15728k1.q(this.f15700B1);
        this.f15703E1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2() {
        P1();
    }

    private void U2(InterfaceC1737q interfaceC1737q, int i10, long j10, C6109x c6109x) {
        C2135k c2135k;
        long jG = this.f15732o1.g();
        long jF = this.f15732o1.f();
        if (g3() && jG == this.f15714P1) {
            j3(interfaceC1737q, i10, j10);
            c2135k = this;
        } else {
            c2135k = this;
            c2135k.Q2(j10, jG, c6109x);
            c2135k.X2(interfaceC1737q, i10, j10, jG);
            jG = jG;
        }
        p3(jF);
        c2135k.f15714P1 = jG;
    }

    private void V2() {
        m mVar = this.f15701C1;
        if (mVar != null) {
            mVar.release();
            this.f15701C1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2(InterfaceC1737q interfaceC1737q, int i10, long j10, long j11) {
        X2(interfaceC1737q, i10, j10, j11);
    }

    private static void Y2(InterfaceC1737q interfaceC1737q, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC1737q.d(bundle);
    }

    private void Z2(Object obj) throws C2907s {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f15700B1 == surface) {
            if (surface != null) {
                N2();
                M2();
                return;
            }
            return;
        }
        this.f15700B1 = surface;
        if (this.f15741x1 == null) {
            this.f15731n1.o(surface);
        }
        this.f15703E1 = false;
        int state = getState();
        InterfaceC1737q interfaceC1737qN0 = N0();
        if (interfaceC1737qN0 != null && this.f15741x1 == null) {
            J2.t tVar = (J2.t) AbstractC6614a.e(P0());
            if (!E2(tVar) || this.f15739v1) {
                F1();
                n1();
            } else {
                a3(interfaceC1737qN0, D2(tVar));
            }
        }
        if (surface != null) {
            N2();
        } else {
            this.f15716R1 = null;
            L l10 = this.f15741x1;
            if (l10 != null) {
                l10.v();
            }
        }
        if (state == 2) {
            L l11 = this.f15741x1;
            if (l11 != null) {
                l11.z(true);
            } else {
                this.f15731n1.e(true);
            }
        }
        P2();
    }

    private void a3(InterfaceC1737q interfaceC1737q, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (surface != null) {
            b3(interfaceC1737q, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            r2(interfaceC1737q);
        }
    }

    private static int k3(Context context, J2.E e10, C6109x c6109x) {
        boolean z10;
        int i10 = 0;
        if (!AbstractC6079K.t(c6109x.f57022o)) {
            return O0.t(0);
        }
        boolean z11 = c6109x.f57026s != null;
        List listZ2 = z2(context, e10, c6109x, z11, false);
        if (z11 && listZ2.isEmpty()) {
            listZ2 = z2(context, e10, c6109x, false, false);
        }
        if (listZ2.isEmpty()) {
            return O0.t(1);
        }
        if (!J2.A.b2(c6109x)) {
            return O0.t(2);
        }
        J2.t tVar = (J2.t) listZ2.get(0);
        boolean zP = tVar.p(c6109x);
        if (zP) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listZ2.size(); i11++) {
                J2.t tVar2 = (J2.t) listZ2.get(i11);
                if (tVar2.p(c6109x)) {
                    z10 = false;
                    zP = true;
                    tVar = tVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zP ? 4 : 3;
        int i13 = tVar.s(c6109x) ? 16 : 8;
        int i14 = tVar.f9416h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c6109x.f57022o) && !c.a(context)) {
            i15 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (zP) {
            List listZ22 = z2(context, e10, c6109x, z11, true);
            if (!listZ22.isEmpty()) {
                J2.t tVar3 = (J2.t) N.n(listZ22, c6109x).get(0);
                if (tVar3.p(c6109x) && tVar3.s(c6109x)) {
                    i10 = 32;
                }
            }
        }
        return O0.o(i12, i13, i10, i14, i15);
    }

    private void l3() {
        InterfaceC1737q interfaceC1737qN0 = N0();
        if (interfaceC1737qN0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f15717S1));
            interfaceC1737qN0.d(bundle);
        }
    }

    private void n3(long j10) {
        int i10 = 0;
        while (true) {
            Long l10 = (Long) this.f15736s1.peek();
            if (l10 == null || l10.longValue() >= j10) {
                break;
            }
            i10++;
            this.f15736s1.poll();
        }
        m3(i10, 0);
    }

    private void o3(D.b bVar) {
        Y yB0 = b0();
        if (yB0.u()) {
            this.f15723Y1 = -9223372036854775807L;
        } else {
            this.f15723Y1 = yB0.l(((D.b) AbstractC6614a.e(bVar)).f11662a, new Y.b()).k();
        }
    }

    private void p2() {
        this.f15741x1.A(new a(), com.google.common.util.concurrent.s.a());
        u uVar = this.f15721W1;
        if (uVar != null) {
            this.f15741x1.y(uVar);
        }
        if (this.f15700B1 != null && !this.f15702D1.equals(C6611K.f60536c)) {
            this.f15741x1.j(this.f15700B1, this.f15702D1);
        }
        this.f15741x1.u(this.f15705G1);
        this.f15741x1.t(a1());
        List list = this.f15699A1;
        if (list != null) {
            this.f15741x1.k(list);
        }
    }

    private static boolean s2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean u2() {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        byte b10 = 7;
        if (i10 <= 28) {
            String str2 = Build.DEVICE;
            str2.getClass();
            switch (str2) {
            }
            return true;
        }
        if (i10 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        str = Build.MODEL;
        str.getClass();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i10 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b10 = -1;
                            }
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str.getClass();
                            if (!str.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case com.amazon.device.iap.internal.a.f34980a /* 100 */:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w2(J2.t r10, q2.C6109x r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.C2135k.w2(J2.t, q2.x):int");
    }

    private static Point x2(J2.t tVar, C6109x c6109x) {
        int i10 = c6109x.f57030w;
        int i11 = c6109x.f57029v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f15696b2) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = tVar.c(i15, i13);
            float f11 = c6109x.f57033z;
            if (pointC != null && tVar.v(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List z2(Context context, J2.E e10, C6109x c6109x, boolean z10, boolean z11) {
        String str = c6109x.f57022o;
        if (str == null) {
            return AbstractC2011u.A();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List listG = N.g(e10, c6109x, z10, z11);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return N.m(e10, c6109x, z10, z11);
    }

    @Override // J2.A
    protected J2.s A0(Throwable th2, J2.t tVar) {
        return new C2134j(th2, tVar, this.f15700B1);
    }

    @Override // S2.v.b
    public boolean B(long j10, long j11, long j12, boolean z10, boolean z11) {
        if (this.f15741x1 != null && this.f15727j1) {
            j11 -= v2();
        }
        return d3(j10, j12, z10) && H2(j11, z11);
    }

    @Override // J2.A
    protected boolean B1(long j10, long j11, InterfaceC1737q interfaceC1737q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C6109x c6109x) {
        AbstractC6614a.e(interfaceC1737q);
        long jY0 = j12 - Y0();
        n3(j12);
        L l10 = this.f15741x1;
        if (l10 != null) {
            if (!z10 || z11) {
                return l10.s(j12, new b(interfaceC1737q, i10, jY0));
            }
            j3(interfaceC1737q, i10, jY0);
            return true;
        }
        int iC = this.f15731n1.c(j12, j10, j11, Z0(), z10, z11, this.f15732o1);
        w wVar = this.f15735r1;
        if (wVar != null && iC != 5 && iC != 4) {
            wVar.b(j12, this.f15732o1.f());
        }
        if (iC == 0) {
            long jB = T().b();
            Q2(jY0, jB, c6109x);
            W2(interfaceC1737q, i10, jY0, jB);
            p3(this.f15732o1.f());
            return true;
        }
        if (iC == 1) {
            U2((InterfaceC1737q) AbstractC6614a.i(interfaceC1737q), i10, jY0, c6109x);
            return true;
        }
        if (iC == 2) {
            t2(interfaceC1737q, i10, jY0);
            p3(this.f15732o1.f());
            return true;
        }
        if (iC == 3) {
            j3(interfaceC1737q, i10, jY0);
            p3(this.f15732o1.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    protected MediaFormat C2(C6109x c6109x, String str, e eVar, float f10, boolean z10, int i10) {
        Pair pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c6109x.f57029v);
        mediaFormat.setInteger("height", c6109x.f57030w);
        AbstractC6638z.e(mediaFormat, c6109x.f57025r);
        AbstractC6638z.c(mediaFormat, "frame-rate", c6109x.f57033z);
        AbstractC6638z.d(mediaFormat, "rotation-degrees", c6109x.f56991A);
        AbstractC6638z.b(mediaFormat, c6109x.f56995E);
        if ("video/dolby-vision".equals(c6109x.f57022o) && (pairI = N.i(c6109x)) != null) {
            AbstractC6638z.d(mediaFormat, "profile", ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f15763a);
        mediaFormat.setInteger("max-height", eVar.f15764b);
        AbstractC6638z.d(mediaFormat, "max-input-size", eVar.f15765c);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f15717S1));
        }
        return mediaFormat;
    }

    @Override // J2.A
    protected void G1() {
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.i();
        }
    }

    protected boolean H2(long j10, boolean z10) throws C2907s {
        int iQ0 = q0(j10);
        if (iQ0 == 0) {
            return false;
        }
        if (z10) {
            C1004b c1004b = this.f9284Z0;
            int i10 = c1004b.f184d + iQ0;
            c1004b.f184d = i10;
            c1004b.f186f += this.f15709K1;
            c1004b.f184d = i10 + this.f15736s1.size();
        } else {
            this.f9284Z0.f190j++;
            m3(iQ0 + this.f15736s1.size(), this.f15709K1);
        }
        K0();
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.w(false);
        }
        return true;
    }

    @Override // J2.A
    protected void I1() {
        super.I1();
        this.f15736s1.clear();
        this.f15709K1 = 0;
        this.f15725a2 = 0;
        this.f15711M1 = false;
        C2125a c2125a = this.f15733p1;
        if (c2125a != null) {
            c2125a.c();
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public void J(float f10, float f11) throws C2907s {
        super.J(f10, f11);
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.t(f10);
        } else {
            this.f15731n1.p(f10);
        }
        w wVar = this.f15735r1;
        if (wVar != null) {
            wVar.e(f10);
        }
    }

    @Override // S2.v.b
    public boolean K(long j10, long j11, boolean z10) {
        return e3(j10, j11, z10);
    }

    @Override // J2.A
    protected int O0(z2.f fVar) {
        P p10;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f15737t1 || (((p10 = this.f15710L1) != null && p10.f158h) || this.f15718T1)) && F2(fVar) && !G2(fVar)) ? 32 : 0;
        }
        return 0;
    }

    @Override // J2.A
    protected boolean R0() {
        return false;
    }

    @Override // J2.A
    protected float S0(float f10, C6109x c6109x, C6109x[] c6109xArr) {
        J2.t tVarP0;
        float fMax = -1.0f;
        for (C6109x c6109x2 : c6109xArr) {
            float f11 = c6109x2.f57033z;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f15710L1 == null || (tVarP0 = P0()) == null) {
            return f12;
        }
        float fG = tVarP0.g(c6109x.f57029v, c6109x.f57030w);
        return f12 != -1.0f ? Math.max(f12, fG) : fG;
    }

    protected void S2(long j10) {
        f2(j10);
        L2(this.f15715Q1);
        this.f9284Z0.f185e++;
        J2();
        w1(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    @Override // J2.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean T1(z2.f r9) {
        /*
            r8 = this;
            boolean r0 = r8.G2(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.F2(r9)
            S2.w r2 = r8.f15735r1
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.f65557f
            long r4 = r2.c(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.f15734q1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.p()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.u()
            if (r2 == 0) goto L40
            r9.m()
        L3e:
            r1 = r3
            goto La2
        L40:
            S2.a r2 = r8.f15733p1
            if (r2 == 0) goto La2
            J2.t r2 = r8.P0()
            java.lang.Object r2 = t2.AbstractC6614a.e(r2)
            J2.t r2 = (J2.t) r2
            java.lang.String r2 = r2.f9410b
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r2 = r9.f65555d
            if (r2 == 0) goto La2
            if (r0 != 0) goto L65
            int r4 = r8.f15725a2
            if (r4 > 0) goto L63
            goto L65
        L63:
            r4 = r1
            goto L66
        L65:
            r4 = r3
        L66:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            S2.a r5 = r8.f15733p1
            int r4 = r5.d(r2, r4)
            if (r4 != 0) goto L79
            r9.m()
            goto L3e
        L79:
            int r5 = r2.limit()
            if (r4 == r5) goto La2
            S2.k$e r5 = r8.f15738u1
            java.lang.Object r5 = t2.AbstractC6614a.e(r5)
            S2.k$e r5 = (S2.C2135k.e) r5
            int r5 = r5.f15765c
            int r5 = r5 + r4
            int r2 = r2.capacity()
            if (r5 >= r2) goto La2
            boolean r2 = r9.z()
            if (r2 != 0) goto La2
            java.nio.ByteBuffer r1 = r9.f65555d
            java.lang.Object r1 = t2.AbstractC6614a.e(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.position(r4)
            goto L3e
        La2:
            if (r1 == 0) goto Lbe
            if (r0 == 0) goto Lae
            A2.b r9 = r8.f9284Z0
            int r0 = r9.f184d
            int r0 = r0 + r3
            r9.f184d = r0
            return r1
        Lae:
            java.util.PriorityQueue r0 = r8.f15736s1
            long r4 = r9.f65557f
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r0.add(r9)
            int r9 = r8.f15725a2
            int r9 = r9 + r3
            r8.f15725a2 = r9
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.C2135k.T1(z2.f):boolean");
    }

    @Override // J2.A
    protected List U0(J2.E e10, C6109x c6109x, boolean z10) {
        return N.n(z2(this.f15726i1, e10, c6109x, z10, this.f15718T1), c6109x);
    }

    @Override // J2.A
    protected final boolean U1() {
        C6109x c6109xQ0 = Q0();
        P p10 = this.f15710L1;
        if (p10 == null) {
            return super.U1();
        }
        if (!p10.f156f || this.f15711M1 || this.f15718T1) {
            return true;
        }
        return (c6109xQ0 != null && c6109xQ0.f57024q > 0) || e1() || W0() != -9223372036854775807L;
    }

    @Override // J2.A
    protected boolean V1(J2.t tVar) {
        return E2(tVar);
    }

    @Override // J2.A
    protected InterfaceC1737q.a X0(J2.t tVar, C6109x c6109x, MediaCrypto mediaCrypto, float f10) {
        String str = tVar.f9411c;
        e eVarY2 = y2(tVar, c6109x, Z());
        this.f15738u1 = eVarY2;
        MediaFormat mediaFormatC2 = C2(c6109x, str, eVarY2, f10, this.f15730m1, this.f15718T1 ? this.f15719U1 : 0);
        Surface surfaceD2 = D2(tVar);
        O2(mediaFormatC2);
        return InterfaceC1737q.a.b(tVar, mediaFormatC2, c6109x, surfaceD2, mediaCrypto);
    }

    @Override // J2.A
    protected final boolean X1() {
        J2.t tVarP0 = P0();
        if (this.f15741x1 == null || tVarP0 == null || !(tVarP0.f9409a.equals("c2.mtk.avc.decoder") || tVarP0.f9409a.equals("c2.mtk.hevc.decoder"))) {
            return super.X1();
        }
        return true;
    }

    protected void X2(InterfaceC1737q interfaceC1737q, int i10, long j10, long j11) {
        t2.P.a("releaseOutputBuffer");
        interfaceC1737q.l(i10, j11);
        t2.P.b();
        this.f9284Z0.f185e++;
        this.f15708J1 = 0;
        if (this.f15741x1 == null) {
            L2(this.f15715Q1);
            J2();
        }
    }

    @Override // J2.A
    protected int a2(J2.E e10, C6109x c6109x) {
        return k3(this.f15726i1, e10, c6109x);
    }

    protected void b3(InterfaceC1737q interfaceC1737q, Surface surface) {
        interfaceC1737q.j(surface);
    }

    @Override // J2.A
    protected void c1(z2.f fVar) {
        if (this.f15740w1) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(fVar.f65558g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        Y2((InterfaceC1737q) AbstractC6614a.e(N0()), bArr);
                    }
                }
            }
        }
    }

    public void c3(List list) {
        if (list.equals(j0.f56892a)) {
            L l10 = this.f15741x1;
            if (l10 == null || !l10.e()) {
                return;
            }
            this.f15741x1.m();
            return;
        }
        this.f15699A1 = list;
        L l11 = this.f15741x1;
        if (l11 != null) {
            l11.k(list);
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public boolean d() {
        if (!super.d()) {
            return false;
        }
        L l10 = this.f15741x1;
        return l10 == null || l10.d();
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f15716R1 = null;
        this.f15723Y1 = -9223372036854775807L;
        P2();
        this.f15703E1 = false;
        this.f15720V1 = null;
        this.f15711M1 = true;
        try {
            super.d0();
        } finally {
            this.f15728k1.m(this.f9284Z0);
            this.f15728k1.t(l0.f56919e);
        }
    }

    protected boolean d3(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        boolean z12 = U().f149b;
        AbstractC6614a.g((z12 && this.f15719U1 == 0) ? false : true);
        if (this.f15718T1 != z12) {
            this.f15718T1 = z12;
            F1();
        }
        this.f15728k1.o(this.f9284Z0);
        if (!this.f15742y1) {
            if (this.f15699A1 != null && this.f15741x1 == null) {
                q qVarQ2 = q2(this.f15726i1, this.f15731n1);
                qVarQ2.Q(1);
                this.f15741x1 = qVarQ2.D(0);
            }
            this.f15742y1 = true;
        }
        if (this.f15741x1 == null) {
            this.f15731n1.m(T());
            this.f15731n1.j(!z11 ? 1 : 0);
        } else {
            p2();
            this.f15743z1 = !z11 ? 1 : 0;
            H0();
        }
    }

    protected boolean e3(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void f0() {
        super.f0();
    }

    protected boolean f3(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public void g(long j10, long j11) throws C2907s {
        L l10 = this.f15741x1;
        if (l10 != null) {
            try {
                l10.g(j10, j11);
            } catch (L.c e10) {
                throw R(e10, e10.f15662a, 7001);
            }
        }
        super.g(j10, j11);
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) throws C2907s {
        L l10 = this.f15741x1;
        if (l10 != null && !z10) {
            l10.w(true);
        }
        super.g0(j10, z10);
        if (this.f15741x1 == null) {
            this.f15731n1.k();
        }
        w wVar = this.f15735r1;
        if (wVar != null) {
            wVar.d();
        }
        if (z10) {
            L l11 = this.f15741x1;
            if (l11 != null) {
                l11.z(false);
            } else {
                this.f15731n1.e(false);
            }
        }
        P2();
        this.f15708J1 = 0;
    }

    protected boolean g3() {
        return true;
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void h0() {
        super.h0();
        L l10 = this.f15741x1;
        if (l10 == null || !this.f15727j1) {
            return;
        }
        l10.a();
    }

    protected boolean h3(J2.t tVar) {
        return Build.VERSION.SDK_INT >= 35 && tVar.f9419k;
    }

    protected boolean i3(J2.t tVar) {
        if (this.f15718T1 || o2(tVar.f9409a)) {
            return false;
        }
        return !tVar.f9415g || m.b(this.f15726i1);
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        L l10 = this.f15741x1;
        if (l10 != null) {
            return l10.l(zIsReady);
        }
        if (zIsReady && (N0() == null || this.f15718T1)) {
            return true;
        }
        return this.f15731n1.d(zIsReady);
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void j0() {
        try {
            super.j0();
        } finally {
            this.f15742y1 = false;
            this.f15722X1 = -9223372036854775807L;
            V2();
        }
    }

    protected void j3(InterfaceC1737q interfaceC1737q, int i10, long j10) {
        t2.P.a("skipVideoBuffer");
        interfaceC1737q.p(i10, false);
        t2.P.b();
        this.f9284Z0.f186f++;
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void k0() {
        super.k0();
        this.f15707I1 = 0;
        this.f15706H1 = T().c();
        this.f15712N1 = 0L;
        this.f15713O1 = 0;
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.r();
        } else {
            this.f15731n1.h();
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void l0() {
        I2();
        K2();
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.q();
        } else {
            this.f15731n1.i();
        }
        w wVar = this.f15735r1;
        if (wVar != null) {
            wVar.d();
        }
        super.l0();
    }

    @Override // androidx.media3.exoplayer.N0
    public void m() {
        L l10 = this.f15741x1;
        if (l10 == null) {
            this.f15731n1.a();
            return;
        }
        int i10 = this.f15743z1;
        if (i10 == 0 || i10 == 1) {
            this.f15743z1 = 0;
        } else {
            l10.n();
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void m0(C6109x[] c6109xArr, long j10, long j11, D.b bVar) {
        super.m0(c6109xArr, j10, j11, bVar);
        o3(bVar);
        w wVar = this.f15735r1;
        if (wVar != null) {
            wVar.d();
        }
    }

    protected void m3(int i10, int i11) {
        C1004b c1004b = this.f9284Z0;
        c1004b.f188h += i10;
        int i12 = i10 + i11;
        c1004b.f187g += i12;
        this.f15707I1 += i12;
        int i13 = this.f15708J1 + i12;
        this.f15708J1 = i13;
        c1004b.f189i = Math.max(i13, c1004b.f189i);
        int i14 = this.f15729l1;
        if (i14 <= 0 || this.f15707I1 < i14) {
            return;
        }
        I2();
    }

    protected void n2(L l10, int i10, C6109x c6109x, int i11) {
        List listA = this.f15699A1;
        if (listA == null) {
            listA = AbstractC2011u.A();
        }
        l10.x(i10, c6109x, Z0(), i11, listA);
    }

    protected boolean o2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C2135k.class) {
            try {
                if (!f15697c2) {
                    f15698d2 = u2();
                    f15697c2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15698d2;
    }

    @Override // J2.A
    protected boolean p1(C6109x c6109x) throws C2907s {
        L l10 = this.f15741x1;
        if (l10 == null || l10.e()) {
            return true;
        }
        try {
            return this.f15741x1.p(c6109x);
        } catch (L.c e10) {
            throw R(e10, c6109x, 7000);
        }
    }

    protected void p3(long j10) {
        this.f9284Z0.a(j10);
        this.f15712N1 += j10;
        this.f15713O1++;
    }

    @Override // J2.A
    protected void q1(Exception exc) {
        AbstractC6635w.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f15728k1.s(exc);
    }

    protected q q2(Context context, v vVar) {
        return new q.b(context, vVar).h(true).g(T()).f();
    }

    @Override // J2.A
    protected void r1(String str, InterfaceC1737q.a aVar, long j10, long j11) {
        this.f15728k1.k(str, j10, j11);
        this.f15739v1 = o2(str);
        this.f15740w1 = ((J2.t) AbstractC6614a.e(P0())).q();
        P2();
    }

    protected void r2(InterfaceC1737q interfaceC1737q) {
        interfaceC1737q.f();
    }

    @Override // J2.A
    protected void s1(String str) {
        this.f15728k1.l(str);
    }

    @Override // J2.A
    protected C1005c t1(A2.J j10) throws C2907s {
        C1005c c1005cT1 = super.t1(j10);
        this.f15728k1.p((C6109x) AbstractC6614a.e(j10.f142b), c1005cT1);
        w wVar = this.f15735r1;
        if (wVar != null) {
            wVar.d();
        }
        return c1005cT1;
    }

    protected void t2(InterfaceC1737q interfaceC1737q, int i10, long j10) {
        t2.P.a("dropVideoBuffer");
        interfaceC1737q.p(i10, false);
        t2.P.b();
        m3(0, 1);
    }

    @Override // J2.A
    protected C1005c u0(J2.t tVar, C6109x c6109x, C6109x c6109x2) {
        C1005c c1005cE = tVar.e(c6109x, c6109x2);
        int i10 = c1005cE.f197e;
        e eVar = (e) AbstractC6614a.e(this.f15738u1);
        if (c6109x2.f57029v > eVar.f15763a || c6109x2.f57030w > eVar.f15764b) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (A2(tVar, c6109x2) > eVar.f15765c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1005c(tVar.f9409a, c6109x, c6109x2, i11 != 0 ? 0 : c1005cE.f196d, i11);
    }

    @Override // J2.A
    protected void u1(C6109x c6109x, MediaFormat mediaFormat) {
        int integer;
        int i10;
        InterfaceC1737q interfaceC1737qN0 = N0();
        if (interfaceC1737qN0 != null) {
            interfaceC1737qN0.h(this.f15704F1);
        }
        if (this.f15718T1) {
            i10 = c6109x.f57029v;
            integer = c6109x.f57030w;
        } else {
            AbstractC6614a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = c6109x.f56992B;
        int i11 = c6109x.f56991A;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f15715Q1 = new l0(i10, integer, f10);
        L l10 = this.f15741x1;
        if (l10 == null || !this.f15724Z1) {
            this.f15731n1.n(c6109x.f57033z);
        } else {
            n2(l10, 1, c6109x.b().F0(i10).h0(integer).u0(f10).P(), this.f15743z1);
            this.f15743z1 = 2;
        }
        this.f15724Z1 = false;
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) throws C2907s {
        if (i10 == 1) {
            Z2(obj);
            return;
        }
        if (i10 == 7) {
            u uVar = (u) AbstractC6614a.e(obj);
            this.f15721W1 = uVar;
            L l10 = this.f15741x1;
            if (l10 != null) {
                l10.y(uVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) AbstractC6614a.e(obj)).intValue();
            if (this.f15719U1 != iIntValue) {
                this.f15719U1 = iIntValue;
                if (this.f15718T1) {
                    F1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.f15704F1 = ((Integer) AbstractC6614a.e(obj)).intValue();
            InterfaceC1737q interfaceC1737qN0 = N0();
            if (interfaceC1737qN0 != null) {
                interfaceC1737qN0.h(this.f15704F1);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) AbstractC6614a.e(obj)).intValue();
            this.f15705G1 = iIntValue2;
            L l11 = this.f15741x1;
            if (l11 != null) {
                l11.u(iIntValue2);
                return;
            } else {
                this.f15731n1.l(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            c3((List) AbstractC6614a.e(obj));
            return;
        }
        if (i10 == 14) {
            C6611K c6611k = (C6611K) AbstractC6614a.e(obj);
            if (c6611k.b() == 0 || c6611k.a() == 0) {
                return;
            }
            this.f15702D1 = c6611k;
            L l12 = this.f15741x1;
            if (l12 != null) {
                l12.j((Surface) AbstractC6614a.i(this.f15700B1), c6611k);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                this.f15717S1 = ((Integer) AbstractC6614a.e(obj)).intValue();
                l3();
                break;
            case 17:
                Surface surface = this.f15700B1;
                Z2(null);
                ((C2135k) AbstractC6614a.e(obj)).v(1, surface);
                break;
            case 18:
                P p10 = this.f15710L1;
                boolean z10 = p10 != null && p10.f154d;
                P p11 = (P) obj;
                this.f15710L1 = p11;
                if (z10 != (p11 != null && p11.f154d)) {
                    c2();
                }
                break;
            default:
                super.v(i10, obj);
                break;
        }
    }

    protected long v2() {
        return -this.f15722X1;
    }

    @Override // J2.A
    protected void w1(long j10) {
        super.w1(j10);
        if (this.f15718T1) {
            return;
        }
        this.f15709K1--;
    }

    @Override // J2.A
    protected void x1() {
        super.x1();
        L l10 = this.f15741x1;
        if (l10 != null) {
            l10.i();
            if (this.f15722X1 == -9223372036854775807L) {
                this.f15722X1 = Z0();
            }
            this.f15741x1.h(v2());
        } else {
            this.f15731n1.j(2);
        }
        this.f15724Z1 = true;
        P2();
    }

    @Override // J2.A
    protected void y1(z2.f fVar) {
        ByteBuffer byteBuffer;
        if (this.f15733p1 != null && ((J2.t) AbstractC6614a.e(P0())).f9410b.equals("video/av01") && (byteBuffer = fVar.f65555d) != null) {
            this.f15733p1.b(byteBuffer);
        }
        this.f15725a2 = 0;
        int iO0 = O0(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (iO0 & 32) == 0) && !this.f15718T1) {
            this.f15709K1++;
        }
    }

    protected e y2(J2.t tVar, C6109x c6109x, C6109x[] c6109xArr) {
        int iW2;
        int iMax = c6109x.f57029v;
        int iMax2 = c6109x.f57030w;
        int iA2 = A2(tVar, c6109x);
        if (c6109xArr.length == 1) {
            if (iA2 != -1 && (iW2 = w2(tVar, c6109x)) != -1) {
                iA2 = Math.min((int) (iA2 * 1.5f), iW2);
            }
            return new e(iMax, iMax2, iA2);
        }
        int length = c6109xArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            C6109x c6109xP = c6109xArr[i10];
            if (c6109x.f56995E != null && c6109xP.f56995E == null) {
                c6109xP = c6109xP.b().V(c6109x.f56995E).P();
            }
            if (tVar.e(c6109x, c6109xP).f196d != 0) {
                int i11 = c6109xP.f57029v;
                z10 |= i11 == -1 || c6109xP.f57030w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, c6109xP.f57030w);
                iA2 = Math.max(iA2, A2(tVar, c6109xP));
            }
        }
        if (z10) {
            AbstractC6635w.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointX2 = x2(tVar, c6109x);
            if (pointX2 != null) {
                iMax = Math.max(iMax, pointX2.x);
                iMax2 = Math.max(iMax2, pointX2.y);
                iA2 = Math.max(iA2, w2(tVar, c6109x.b().F0(iMax).h0(iMax2).P()));
                AbstractC6635w.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iA2);
    }

    @Override // S2.v.b
    public boolean z(long j10, long j11) {
        return f3(j10, j11);
    }

    /* JADX INFO: renamed from: S2.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements L.a {
        a() {
        }

        @Override // S2.L.a
        public void a() {
            if (C2135k.this.f15700B1 != null) {
                C2135k.this.R2();
            }
        }

        @Override // S2.L.a
        public void c() {
            if (C2135k.this.f15700B1 != null) {
                C2135k.this.m3(0, 1);
            }
        }

        @Override // S2.L.a
        public void d() {
            N0.a aVarB1 = C2135k.this.b1();
            if (aVarB1 != null) {
                aVarB1.b();
            }
        }

        @Override // S2.L.a
        public void b(l0 l0Var) {
        }
    }
}
