package F2;

import B2.K1;
import F2.A;
import F2.C1552g;
import F2.C1553h;
import F2.InterfaceC1558m;
import F2.t;
import F2.u;
import P9.AbstractC2011u;
import P9.AbstractC2013w;
import P9.T;
import P9.X;
import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import q2.AbstractC6079K;
import q2.AbstractC6096k;
import q2.C6102q;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: renamed from: F2.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1553h implements u {

    /* JADX INFO: renamed from: b */
    private final UUID f6201b;

    /* JADX INFO: renamed from: c */
    private final A.c f6202c;

    /* JADX INFO: renamed from: d */
    private final M f6203d;

    /* JADX INFO: renamed from: e */
    private final HashMap f6204e;

    /* JADX INFO: renamed from: f */
    private final boolean f6205f;

    /* JADX INFO: renamed from: g */
    private final int[] f6206g;

    /* JADX INFO: renamed from: h */
    private final boolean f6207h;

    /* JADX INFO: renamed from: i */
    private final g f6208i;

    /* JADX INFO: renamed from: j */
    private final Q2.k f6209j;

    /* JADX INFO: renamed from: k */
    private final C0070h f6210k;

    /* JADX INFO: renamed from: l */
    private final long f6211l;

    /* JADX INFO: renamed from: m */
    private final List f6212m;

    /* JADX INFO: renamed from: n */
    private final Set f6213n;

    /* JADX INFO: renamed from: o */
    private final Set f6214o;

    /* JADX INFO: renamed from: p */
    private int f6215p;

    /* JADX INFO: renamed from: q */
    private A f6216q;

    /* JADX INFO: renamed from: r */
    private C1552g f6217r;

    /* JADX INFO: renamed from: s */
    private C1552g f6218s;

    /* JADX INFO: renamed from: t */
    private Looper f6219t;

    /* JADX INFO: renamed from: u */
    private Handler f6220u;

    /* JADX INFO: renamed from: v */
    private int f6221v;

    /* JADX INFO: renamed from: w */
    private byte[] f6222w;

    /* JADX INFO: renamed from: x */
    private K1 f6223x;

    /* JADX INFO: renamed from: y */
    volatile d f6224y;

    /* JADX INFO: renamed from: F2.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: d */
        private boolean f6228d;

        /* JADX INFO: renamed from: a */
        private final HashMap f6225a = new HashMap();

        /* JADX INFO: renamed from: b */
        private UUID f6226b = AbstractC6096k.f56896d;

        /* JADX INFO: renamed from: c */
        private A.c f6227c = J.f6153d;

        /* JADX INFO: renamed from: e */
        private int[] f6229e = new int[0];

        /* JADX INFO: renamed from: f */
        private boolean f6230f = true;

        /* JADX INFO: renamed from: g */
        private Q2.k f6231g = new Q2.j();

        /* JADX INFO: renamed from: h */
        private long f6232h = 300000;

        public C1553h a(M m10) {
            return new C1553h(this.f6226b, this.f6227c, m10, this.f6225a, this.f6228d, this.f6229e, this.f6230f, this.f6231g, this.f6232h);
        }

        public b b(Q2.k kVar) {
            this.f6231g = (Q2.k) AbstractC6614a.e(kVar);
            return this;
        }

        public b c(boolean z10) {
            this.f6228d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f6230f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                AbstractC6614a.a(z10);
            }
            this.f6229e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, A.c cVar) {
            this.f6226b = (UUID) AbstractC6614a.e(uuid);
            this.f6227c = (A.c) AbstractC6614a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: F2.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c implements A.b {
        private c() {
        }

        @Override // F2.A.b
        public void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) AbstractC6614a.e(C1553h.this.f6224y)).obtainMessage(i10, bArr).sendToTarget();
        }

        /* synthetic */ c(C1553h c1553h, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: F2.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1552g c1552g : C1553h.this.f6212m) {
                if (c1552g.u(bArr)) {
                    c1552g.A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F2.h$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Exception {
        /* synthetic */ e(UUID uuid, a aVar) {
            this(uuid);
        }

        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: F2.h$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements u.b {

        /* JADX INFO: renamed from: b */
        private final t.a f6235b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1558m f6236c;

        /* JADX INFO: renamed from: d */
        private boolean f6237d;

        public f(t.a aVar) {
            this.f6235b = aVar;
        }

        public static /* synthetic */ void c(f fVar, C6109x c6109x) {
            if (C1553h.this.f6215p == 0 || fVar.f6237d) {
                return;
            }
            C1553h c1553h = C1553h.this;
            fVar.f6236c = c1553h.u((Looper) AbstractC6614a.e(c1553h.f6219t), fVar.f6235b, c6109x, false);
            C1553h.this.f6213n.add(fVar);
        }

        public static /* synthetic */ void d(f fVar) {
            if (fVar.f6237d) {
                return;
            }
            InterfaceC1558m interfaceC1558m = fVar.f6236c;
            if (interfaceC1558m != null) {
                interfaceC1558m.h(fVar.f6235b);
            }
            C1553h.this.f6213n.remove(fVar);
            fVar.f6237d = true;
        }

        @Override // F2.u.b
        public void a() {
            a0.g1((Handler) AbstractC6614a.e(C1553h.this.f6220u), new Runnable() { // from class: F2.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1553h.f.d(this.f6245a);
                }
            });
        }

        public void e(final C6109x c6109x) {
            ((Handler) AbstractC6614a.e(C1553h.this.f6220u)).post(new Runnable() { // from class: F2.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1553h.f.c(this.f6243a, c6109x);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F2.h$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class g implements C1552g.a {

        /* JADX INFO: renamed from: a */
        private final Set f6239a = new HashSet();

        /* JADX INFO: renamed from: b */
        private C1552g f6240b;

        public g() {
        }

        @Override // F2.C1552g.a
        public void a(C1552g c1552g) {
            this.f6239a.add(c1552g);
            if (this.f6240b != null) {
                return;
            }
            this.f6240b = c1552g;
            c1552g.G();
        }

        @Override // F2.C1552g.a
        public void b(Exception exc, boolean z10) {
            this.f6240b = null;
            AbstractC2011u abstractC2011uW = AbstractC2011u.w(this.f6239a);
            this.f6239a.clear();
            X it = abstractC2011uW.iterator();
            while (it.hasNext()) {
                ((C1552g) it.next()).C(exc, z10);
            }
        }

        @Override // F2.C1552g.a
        public void c() {
            this.f6240b = null;
            AbstractC2011u abstractC2011uW = AbstractC2011u.w(this.f6239a);
            this.f6239a.clear();
            X it = abstractC2011uW.iterator();
            while (it.hasNext()) {
                ((C1552g) it.next()).B();
            }
        }

        public void d(C1552g c1552g) {
            this.f6239a.remove(c1552g);
            if (this.f6240b == c1552g) {
                this.f6240b = null;
                if (this.f6239a.isEmpty()) {
                    return;
                }
                C1552g c1552g2 = (C1552g) this.f6239a.iterator().next();
                this.f6240b = c1552g2;
                c1552g2.G();
            }
        }
    }

    /* JADX INFO: renamed from: F2.h$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0070h implements C1552g.b {
        private C0070h() {
        }

        @Override // F2.C1552g.b
        public void a(C1552g c1552g, int i10) {
            if (C1553h.this.f6211l != -9223372036854775807L) {
                C1553h.this.f6214o.remove(c1552g);
                ((Handler) AbstractC6614a.e(C1553h.this.f6220u)).removeCallbacksAndMessages(c1552g);
            }
        }

        @Override // F2.C1552g.b
        public void b(final C1552g c1552g, int i10) {
            if (i10 == 1 && C1553h.this.f6215p > 0 && C1553h.this.f6211l != -9223372036854775807L) {
                C1553h.this.f6214o.add(c1552g);
                ((Handler) AbstractC6614a.e(C1553h.this.f6220u)).postAtTime(new Runnable() { // from class: F2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1552g.h(null);
                    }
                }, c1552g, SystemClock.uptimeMillis() + C1553h.this.f6211l);
            } else if (i10 == 0) {
                C1553h.this.f6212m.remove(c1552g);
                if (C1553h.this.f6217r == c1552g) {
                    C1553h.this.f6217r = null;
                }
                if (C1553h.this.f6218s == c1552g) {
                    C1553h.this.f6218s = null;
                }
                C1553h.this.f6208i.d(c1552g);
                if (C1553h.this.f6211l != -9223372036854775807L) {
                    ((Handler) AbstractC6614a.e(C1553h.this.f6220u)).removeCallbacksAndMessages(c1552g);
                    C1553h.this.f6214o.remove(c1552g);
                }
            }
            C1553h.this.D();
        }

        /* synthetic */ C0070h(C1553h c1553h, a aVar) {
            this();
        }
    }

    /* synthetic */ C1553h(UUID uuid, A.c cVar, M m10, HashMap map, boolean z10, int[] iArr, boolean z11, Q2.k kVar, long j10, a aVar) {
        this(uuid, cVar, m10, map, z10, iArr, z11, kVar, j10);
    }

    private synchronized void A(Looper looper) {
        try {
            Looper looper2 = this.f6219t;
            if (looper2 == null) {
                this.f6219t = looper;
                this.f6220u = new Handler(looper);
            } else {
                AbstractC6614a.g(looper2 == looper);
                AbstractC6614a.e(this.f6220u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private InterfaceC1558m B(int i10, boolean z10) {
        A a10 = (A) AbstractC6614a.e(this.f6216q);
        if ((a10.h() == 2 && B.f6147d) || a0.R0(this.f6206g, i10) == -1 || a10.h() == 1) {
            return null;
        }
        C1552g c1552g = this.f6217r;
        if (c1552g == null) {
            C1552g c1552gY = y(AbstractC2011u.A(), true, null, z10);
            this.f6212m.add(c1552gY);
            this.f6217r = c1552gY;
        } else {
            c1552g.g(null);
        }
        return this.f6217r;
    }

    private void C(Looper looper) {
        if (this.f6224y == null) {
            this.f6224y = new d(looper);
        }
    }

    public void D() {
        if (this.f6216q != null && this.f6215p == 0 && this.f6212m.isEmpty() && this.f6213n.isEmpty()) {
            ((A) AbstractC6614a.e(this.f6216q)).a();
            this.f6216q = null;
        }
    }

    private void E() {
        X it = AbstractC2013w.v(this.f6214o).iterator();
        while (it.hasNext()) {
            ((InterfaceC1558m) it.next()).h(null);
        }
    }

    private void F() {
        X it = AbstractC2013w.v(this.f6213n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void H(InterfaceC1558m interfaceC1558m, t.a aVar) {
        interfaceC1558m.h(aVar);
        if (this.f6211l != -9223372036854775807L) {
            interfaceC1558m.h(null);
        }
    }

    private void I(boolean z10) {
        if (z10 && this.f6219t == null) {
            AbstractC6635w.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC6614a.e(this.f6219t)).getThread()) {
            AbstractC6635w.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f6219t.getThread().getName(), new IllegalStateException());
        }
    }

    public InterfaceC1558m u(Looper looper, t.a aVar, C6109x c6109x, boolean z10) {
        List listZ;
        C(looper);
        C6102q c6102q = c6109x.f57026s;
        if (c6102q == null) {
            return B(AbstractC6079K.k(c6109x.f57022o), z10);
        }
        C1552g c1552g = null;
        if (this.f6222w == null) {
            listZ = z((C6102q) AbstractC6614a.e(c6102q), this.f6201b, false);
            if (listZ.isEmpty()) {
                e eVar = new e(this.f6201b);
                AbstractC6635w.e("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new InterfaceC1558m.a(eVar, 6003));
            }
        } else {
            listZ = null;
        }
        if (this.f6205f) {
            Iterator it = this.f6212m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1552g c1552g2 = (C1552g) it.next();
                if (Objects.equals(c1552g2.f6168a, listZ)) {
                    c1552g = c1552g2;
                    break;
                }
            }
        } else {
            c1552g = this.f6218s;
        }
        if (c1552g != null) {
            c1552g.g(aVar);
            return c1552g;
        }
        C1552g c1552gY = y(listZ, false, aVar, z10);
        if (!this.f6205f) {
            this.f6218s = c1552gY;
        }
        this.f6212m.add(c1552gY);
        return c1552gY;
    }

    private static boolean v(InterfaceC1558m interfaceC1558m) {
        if (interfaceC1558m.getState() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC1558m.a) AbstractC6614a.e(interfaceC1558m.c())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    private boolean w(C6102q c6102q) {
        if (this.f6222w != null) {
            return true;
        }
        if (z(c6102q, this.f6201b, true).isEmpty()) {
            if (c6102q.f56944d != 1 || !c6102q.e(0).d(AbstractC6096k.f56894b)) {
                return false;
            }
            AbstractC6635w.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f6201b);
        }
        String str = c6102q.f56943c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? Build.VERSION.SDK_INT >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private C1552g x(List list, boolean z10, t.a aVar) {
        AbstractC6614a.e(this.f6216q);
        C1552g c1552g = new C1552g(this.f6201b, this.f6216q, this.f6208i, this.f6210k, list, this.f6221v, this.f6207h | z10, z10, this.f6222w, this.f6204e, this.f6203d, (Looper) AbstractC6614a.e(this.f6219t), this.f6209j, (K1) AbstractC6614a.e(this.f6223x));
        c1552g.g(aVar);
        if (this.f6211l != -9223372036854775807L) {
            c1552g.g(null);
        }
        return c1552g;
    }

    private C1552g y(List list, boolean z10, t.a aVar, boolean z11) {
        C1552g c1552gX = x(list, z10, aVar);
        if (v(c1552gX) && !this.f6214o.isEmpty()) {
            E();
            H(c1552gX, aVar);
            c1552gX = x(list, z10, aVar);
        }
        if (!v(c1552gX) || !z11 || this.f6213n.isEmpty()) {
            return c1552gX;
        }
        F();
        if (!this.f6214o.isEmpty()) {
            E();
        }
        H(c1552gX, aVar);
        return x(list, z10, aVar);
    }

    private static List z(C6102q c6102q, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c6102q.f56944d);
        for (int i10 = 0; i10 < c6102q.f56944d; i10++) {
            C6102q.b bVarE = c6102q.e(i10);
            if ((bVarE.d(uuid) || (AbstractC6096k.f56895c.equals(uuid) && bVarE.d(AbstractC6096k.f56894b))) && (bVarE.f56949e != null || z10)) {
                arrayList.add(bVarE);
            }
        }
        return arrayList;
    }

    public void G(int i10, byte[] bArr) {
        AbstractC6614a.g(this.f6212m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            AbstractC6614a.e(bArr);
        }
        this.f6221v = i10;
        this.f6222w = bArr;
    }

    @Override // F2.u
    public final void a() {
        I(true);
        int i10 = this.f6215p - 1;
        this.f6215p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f6211l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f6212m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C1552g) arrayList.get(i11)).h(null);
            }
        }
        F();
        D();
    }

    @Override // F2.u
    public int b(C6109x c6109x) {
        I(false);
        int iH = ((A) AbstractC6614a.e(this.f6216q)).h();
        C6102q c6102q = c6109x.f57026s;
        if (c6102q == null) {
            if (a0.R0(this.f6206g, AbstractC6079K.k(c6109x.f57022o)) == -1) {
                return 0;
            }
        } else if (!w(c6102q)) {
            return 1;
        }
        return iH;
    }

    @Override // F2.u
    public u.b c(t.a aVar, C6109x c6109x) {
        AbstractC6614a.g(this.f6215p > 0);
        AbstractC6614a.i(this.f6219t);
        f fVar = new f(aVar);
        fVar.e(c6109x);
        return fVar;
    }

    @Override // F2.u
    public InterfaceC1558m d(t.a aVar, C6109x c6109x) {
        I(false);
        AbstractC6614a.g(this.f6215p > 0);
        AbstractC6614a.i(this.f6219t);
        return u(this.f6219t, aVar, c6109x, true);
    }

    @Override // F2.u
    public void e(Looper looper, K1 k12) {
        A(looper);
        this.f6223x = k12;
    }

    @Override // F2.u
    public final void s() {
        I(true);
        int i10 = this.f6215p;
        this.f6215p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f6216q == null) {
            A a10 = this.f6202c.a(this.f6201b);
            this.f6216q = a10;
            a10.d(new c());
        } else if (this.f6211l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f6212m.size(); i11++) {
                ((C1552g) this.f6212m.get(i11)).g(null);
            }
        }
    }

    private C1553h(UUID uuid, A.c cVar, M m10, HashMap map, boolean z10, int[] iArr, boolean z11, Q2.k kVar, long j10) {
        AbstractC6614a.e(uuid);
        AbstractC6614a.b(!AbstractC6096k.f56894b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6201b = uuid;
        this.f6202c = cVar;
        this.f6203d = m10;
        this.f6204e = map;
        this.f6205f = z10;
        this.f6206g = iArr;
        this.f6207h = z11;
        this.f6209j = kVar;
        this.f6208i = new g();
        this.f6210k = new C0070h();
        this.f6221v = 0;
        this.f6212m = new ArrayList();
        this.f6213n = T.h();
        this.f6214o = T.h();
        this.f6211l = j10;
    }
}
