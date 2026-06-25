package F2;

import B2.K1;
import F2.A;
import F2.InterfaceC1558m;
import F2.t;
import M2.C1934y;
import Q2.k;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import q2.AbstractC6096k;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6628o;
import t2.InterfaceC6627n;
import t2.a0;
import z2.InterfaceC7277b;

/* JADX INFO: renamed from: F2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C1552g implements InterfaceC1558m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f6169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f6171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f6175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C6628o f6176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q2.k f6177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final K1 f6178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M f6179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f6180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f6181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f6182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f6185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f6186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC7277b f6187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC1558m.a f6188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f6189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f6190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private A.a f6191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private A.d f6192y;

    /* JADX INFO: renamed from: F2.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(C1552g c1552g);

        void b(Exception exc, boolean z10);

        void c();
    }

    /* JADX INFO: renamed from: F2.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(C1552g c1552g, int i10);

        void b(C1552g c1552g, int i10);
    }

    /* JADX INFO: renamed from: F2.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6193a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, N n10) {
            d dVar = (d) message.obj;
            if (!dVar.f6196b) {
                return false;
            }
            int i10 = dVar.f6199e + 1;
            dVar.f6199e = i10;
            if (i10 > C1552g.this.f6177j.a(3)) {
                return false;
            }
            long jC = C1552g.this.f6177j.c(new k.c(new C1934y(dVar.f6195a, n10.f6161a, n10.f6162b, n10.f6163c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f6197c, n10.f6164d), new M2.B(3), n10.getCause() instanceof IOException ? (IOException) n10.getCause() : new f(n10.getCause()), dVar.f6199e));
            if (jC == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f6193a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jC);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C1934y.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f6193a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objA = C1552g.this.f6179l.a(C1552g.this.f6180m, (A.d) dVar.f6198d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objA = C1552g.this.f6179l.b(C1552g.this.f6180m, (A.a) dVar.f6198d);
                }
            } catch (N e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC6635w.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            C1552g.this.f6177j.d(dVar.f6195a);
            synchronized (this) {
                try {
                    if (!this.f6193a) {
                        C1552g.this.f6182o.obtainMessage(message.what, Pair.create(dVar.f6198d, objA)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: F2.g$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f6198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6199e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f6195a = j10;
            this.f6196b = z10;
            this.f6197c = j11;
            this.f6198d = obj;
        }
    }

    /* JADX INFO: renamed from: F2.g$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C1552g.this.D(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                C1552g.this.x(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: F2.g$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C1552g(UUID uuid, A a10, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, M m10, Looper looper, Q2.k kVar, K1 k12) {
        if (i10 == 1 || i10 == 3) {
            AbstractC6614a.e(bArr);
        }
        this.f6180m = uuid;
        this.f6170c = aVar;
        this.f6171d = bVar;
        this.f6169b = a10;
        this.f6172e = i10;
        this.f6173f = z10;
        this.f6174g = z11;
        if (bArr != null) {
            this.f6190w = bArr;
            this.f6168a = null;
        } else {
            this.f6168a = Collections.unmodifiableList((List) AbstractC6614a.e(list));
        }
        this.f6175h = map;
        this.f6179l = m10;
        this.f6176i = new C6628o();
        this.f6177j = kVar;
        this.f6178k = k12;
        this.f6183p = 2;
        this.f6181n = looper;
        this.f6182o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Object obj, Object obj2) {
        if (obj == this.f6192y) {
            if (this.f6183p == 2 || v()) {
                this.f6192y = null;
                if (obj2 instanceof Exception) {
                    this.f6170c.b((Exception) obj2, false);
                    return;
                }
                try {
                    this.f6169b.g((byte[]) obj2);
                    this.f6170c.c();
                } catch (Exception e10) {
                    this.f6170c.b(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean E() {
        /*
            r4 = this;
            boolean r0 = r4.v()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            F2.A r0 = r4.f6169b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.e()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f6189v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            F2.A r2 = r4.f6169b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            B2.K1 r3 = r4.f6178k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.n(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            F2.A r0 = r4.f6169b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f6189v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            z2.b r0 = r0.i(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f6187t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f6183p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            F2.b r2 = new F2.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.r(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f6189v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            t2.AbstractC6614a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = F2.x.d(r0)
            if (r2 == 0) goto L41
            F2.g$a r0 = r4.f6170c
            r0.a(r4)
            goto L4a
        L41:
            r4.w(r0, r1)
            goto L4a
        L45:
            F2.g$a r0 = r4.f6170c
            r0.a(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C1552g.E():boolean");
    }

    private void F(byte[] bArr, int i10, boolean z10) {
        try {
            this.f6191x = this.f6169b.m(bArr, this.f6168a, i10, this.f6175h);
            ((c) a0.l(this.f6186s)).b(2, AbstractC6614a.e(this.f6191x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, true);
        }
    }

    private boolean H() {
        try {
            this.f6169b.f(this.f6189v, this.f6190w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            w(e10, 1);
            return false;
        }
    }

    private void I() {
        if (Thread.currentThread() != this.f6181n.getThread()) {
            AbstractC6635w.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f6181n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(InterfaceC6627n interfaceC6627n) {
        Iterator it = this.f6176i.a1().iterator();
        while (it.hasNext()) {
            interfaceC6627n.accept((t.a) it.next());
        }
    }

    private void s(boolean z10) {
        if (this.f6174g) {
            return;
        }
        byte[] bArr = (byte[]) a0.l(this.f6189v);
        int i10 = this.f6172e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f6190w == null || H()) {
                    F(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            AbstractC6614a.e(this.f6190w);
            AbstractC6614a.e(this.f6189v);
            F(this.f6190w, 3, z10);
            return;
        }
        if (this.f6190w == null) {
            F(bArr, 1, z10);
            return;
        }
        if (this.f6183p == 4 || H()) {
            long jT = t();
            if (this.f6172e != 0 || jT > 60) {
                if (jT <= 0) {
                    w(new L(), 2);
                    return;
                } else {
                    this.f6183p = 4;
                    r(new InterfaceC6627n() { // from class: F2.f
                        @Override // t2.InterfaceC6627n
                        public final void accept(Object obj) {
                            ((t.a) obj).j();
                        }
                    });
                    return;
                }
            }
            AbstractC6635w.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            F(bArr, 2, z10);
        }
    }

    private long t() {
        if (!AbstractC6096k.f56896d.equals(this.f6180m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC6614a.e(P.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f6183p;
        return i10 == 3 || i10 == 4;
    }

    private void w(final Throwable th2, int i10) {
        this.f6188u = new InterfaceC1558m.a(th2, x.b(th2, i10));
        AbstractC6635w.e("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            r(new InterfaceC6627n() { // from class: F2.e
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!x.e(th2) && !x.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f6183p != 4) {
            this.f6183p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj, Object obj2) {
        if (obj == this.f6191x && v()) {
            this.f6191x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                y((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f6172e == 3) {
                    this.f6169b.l((byte[]) a0.l(this.f6190w), bArr);
                    r(new InterfaceC6627n() { // from class: F2.c
                        @Override // t2.InterfaceC6627n
                        public final void accept(Object obj3) {
                            ((t.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrL = this.f6169b.l(this.f6189v, bArr);
                int i10 = this.f6172e;
                if ((i10 == 2 || (i10 == 0 && this.f6190w != null)) && bArrL != null && bArrL.length != 0) {
                    this.f6190w = bArrL;
                }
                this.f6183p = 4;
                r(new InterfaceC6627n() { // from class: F2.d
                    @Override // t2.InterfaceC6627n
                    public final void accept(Object obj3) {
                        ((t.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                y(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                y(e, true);
            }
        }
    }

    private void y(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || x.d(th2)) {
            this.f6170c.a(this);
        } else {
            w(th2, z10 ? 1 : 2);
        }
    }

    private void z() {
        if (this.f6172e == 0 && this.f6183p == 4) {
            a0.l(this.f6189v);
            s(false);
        }
    }

    void A(int i10) {
        if (i10 != 2) {
            return;
        }
        z();
    }

    void B() {
        if (E()) {
            s(true);
        }
    }

    void C(Exception exc, boolean z10) {
        w(exc, z10 ? 1 : 3);
    }

    void G() {
        this.f6192y = this.f6169b.c();
        ((c) a0.l(this.f6186s)).b(1, AbstractC6614a.e(this.f6192y), true);
    }

    @Override // F2.InterfaceC1558m
    public final UUID a() {
        I();
        return this.f6180m;
    }

    @Override // F2.InterfaceC1558m
    public boolean b() {
        I();
        return this.f6173f;
    }

    @Override // F2.InterfaceC1558m
    public final InterfaceC1558m.a c() {
        I();
        if (this.f6183p == 1) {
            return this.f6188u;
        }
        return null;
    }

    @Override // F2.InterfaceC1558m
    public final InterfaceC7277b d() {
        I();
        return this.f6187t;
    }

    @Override // F2.InterfaceC1558m
    public Map f() {
        I();
        byte[] bArr = this.f6189v;
        if (bArr == null) {
            return null;
        }
        return this.f6169b.b(bArr);
    }

    @Override // F2.InterfaceC1558m
    public void g(t.a aVar) {
        I();
        if (this.f6184q < 0) {
            AbstractC6635w.d("DefaultDrmSession", "Session reference count less than zero: " + this.f6184q);
            this.f6184q = 0;
        }
        if (aVar != null) {
            this.f6176i.b(aVar);
        }
        int i10 = this.f6184q + 1;
        this.f6184q = i10;
        if (i10 == 1) {
            AbstractC6614a.g(this.f6183p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f6185r = handlerThread;
            handlerThread.start();
            this.f6186s = new c(this.f6185r.getLooper());
            if (E()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f6176i.c(aVar) == 1) {
            aVar.k(this.f6183p);
        }
        this.f6171d.a(this, this.f6184q);
    }

    @Override // F2.InterfaceC1558m
    public final int getState() {
        I();
        return this.f6183p;
    }

    @Override // F2.InterfaceC1558m
    public void h(t.a aVar) {
        I();
        int i10 = this.f6184q;
        if (i10 <= 0) {
            AbstractC6635w.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f6184q = i11;
        if (i11 == 0) {
            this.f6183p = 0;
            ((e) a0.l(this.f6182o)).removeCallbacksAndMessages(null);
            ((c) a0.l(this.f6186s)).c();
            this.f6186s = null;
            ((HandlerThread) a0.l(this.f6185r)).quit();
            this.f6185r = null;
            this.f6187t = null;
            this.f6188u = null;
            this.f6191x = null;
            this.f6192y = null;
            byte[] bArr = this.f6189v;
            if (bArr != null) {
                this.f6169b.k(bArr);
                this.f6189v = null;
            }
        }
        if (aVar != null) {
            this.f6176i.d(aVar);
            if (this.f6176i.c(aVar) == 0) {
                aVar.m();
            }
        }
        this.f6171d.b(this, this.f6184q);
    }

    @Override // F2.InterfaceC1558m
    public boolean i(String str) {
        I();
        return this.f6169b.j((byte[]) AbstractC6614a.i(this.f6189v), str);
    }

    public boolean u(byte[] bArr) {
        I();
        return Arrays.equals(this.f6189v, bArr);
    }
}
