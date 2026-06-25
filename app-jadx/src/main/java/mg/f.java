package mg;

import Td.L;
import fg.AbstractC4807e;
import ie.InterfaceC5082a;
import ig.AbstractC5097a;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mg.h;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: C */
    public static final b f53540C = new b(null);

    /* JADX INFO: renamed from: D */
    private static final m f53541D;

    /* JADX INFO: renamed from: A */
    private final d f53542A;

    /* JADX INFO: renamed from: B */
    private final Set f53543B;

    /* JADX INFO: renamed from: a */
    private final boolean f53544a;

    /* JADX INFO: renamed from: b */
    private final c f53545b;

    /* JADX INFO: renamed from: c */
    private final Map f53546c;

    /* JADX INFO: renamed from: d */
    private final String f53547d;

    /* JADX INFO: renamed from: e */
    private int f53548e;

    /* JADX INFO: renamed from: f */
    private int f53549f;

    /* JADX INFO: renamed from: g */
    private boolean f53550g;

    /* JADX INFO: renamed from: h */
    private final ig.e f53551h;

    /* JADX INFO: renamed from: i */
    private final ig.d f53552i;

    /* JADX INFO: renamed from: j */
    private final ig.d f53553j;

    /* JADX INFO: renamed from: k */
    private final ig.d f53554k;

    /* JADX INFO: renamed from: l */
    private final mg.l f53555l;

    /* JADX INFO: renamed from: m */
    private long f53556m;

    /* JADX INFO: renamed from: n */
    private long f53557n;

    /* JADX INFO: renamed from: o */
    private long f53558o;

    /* JADX INFO: renamed from: p */
    private long f53559p;

    /* JADX INFO: renamed from: q */
    private long f53560q;

    /* JADX INFO: renamed from: r */
    private long f53561r;

    /* JADX INFO: renamed from: s */
    private final m f53562s;

    /* JADX INFO: renamed from: t */
    private m f53563t;

    /* JADX INFO: renamed from: u */
    private long f53564u;

    /* JADX INFO: renamed from: v */
    private long f53565v;

    /* JADX INFO: renamed from: w */
    private long f53566w;

    /* JADX INFO: renamed from: x */
    private long f53567x;

    /* JADX INFO: renamed from: y */
    private final Socket f53568y;

    /* JADX INFO: renamed from: z */
    private final mg.j f53569z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f53570a;

        /* JADX INFO: renamed from: b */
        private final ig.e f53571b;

        /* JADX INFO: renamed from: c */
        public Socket f53572c;

        /* JADX INFO: renamed from: d */
        public String f53573d;

        /* JADX INFO: renamed from: e */
        public InterfaceC6685j f53574e;

        /* JADX INFO: renamed from: f */
        public InterfaceC6684i f53575f;

        /* JADX INFO: renamed from: g */
        private c f53576g;

        /* JADX INFO: renamed from: h */
        private mg.l f53577h;

        /* JADX INFO: renamed from: i */
        private int f53578i;

        public a(boolean z10, ig.e taskRunner) {
            AbstractC5504s.h(taskRunner, "taskRunner");
            this.f53570a = z10;
            this.f53571b = taskRunner;
            this.f53576g = c.f53580b;
            this.f53577h = mg.l.f53682b;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f53570a;
        }

        public final String c() {
            String str = this.f53573d;
            if (str != null) {
                return str;
            }
            AbstractC5504s.u("connectionName");
            return null;
        }

        public final c d() {
            return this.f53576g;
        }

        public final int e() {
            return this.f53578i;
        }

        public final mg.l f() {
            return this.f53577h;
        }

        public final InterfaceC6684i g() {
            InterfaceC6684i interfaceC6684i = this.f53575f;
            if (interfaceC6684i != null) {
                return interfaceC6684i;
            }
            AbstractC5504s.u("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f53572c;
            if (socket != null) {
                return socket;
            }
            AbstractC5504s.u("socket");
            return null;
        }

        public final InterfaceC6685j i() {
            InterfaceC6685j interfaceC6685j = this.f53574e;
            if (interfaceC6685j != null) {
                return interfaceC6685j;
            }
            AbstractC5504s.u("source");
            return null;
        }

        public final ig.e j() {
            return this.f53571b;
        }

        public final a k(c listener) {
            AbstractC5504s.h(listener, "listener");
            this.f53576g = listener;
            return this;
        }

        public final a l(int i10) {
            this.f53578i = i10;
            return this;
        }

        public final void m(String str) {
            AbstractC5504s.h(str, "<set-?>");
            this.f53573d = str;
        }

        public final void n(InterfaceC6684i interfaceC6684i) {
            AbstractC5504s.h(interfaceC6684i, "<set-?>");
            this.f53575f = interfaceC6684i;
        }

        public final void o(Socket socket) {
            AbstractC5504s.h(socket, "<set-?>");
            this.f53572c = socket;
        }

        public final void p(InterfaceC6685j interfaceC6685j) {
            AbstractC5504s.h(interfaceC6685j, "<set-?>");
            this.f53574e = interfaceC6685j;
        }

        public final a q(Socket socket, String peerName, InterfaceC6685j source, InterfaceC6684i sink) {
            String str;
            AbstractC5504s.h(socket, "socket");
            AbstractC5504s.h(peerName, "peerName");
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(sink, "sink");
            o(socket);
            if (this.f53570a) {
                str = AbstractC4807e.f47070i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return f.f53541D;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public static final b f53579a = new b(null);

        /* JADX INFO: renamed from: b */
        public static final c f53580b = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends c {
            a() {
            }

            @Override // mg.f.c
            public void b(mg.i stream) {
                AbstractC5504s.h(stream, "stream");
                stream.d(mg.b.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public void a(f connection, m settings) {
            AbstractC5504s.h(connection, "connection");
            AbstractC5504s.h(settings, "settings");
        }

        public abstract void b(mg.i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53593e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53594f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C6683h f53595g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f53596h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f53597i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, f fVar, int i10, C6683h c6683h, int i11, boolean z11) {
            super(str, z10);
            this.f53593e = fVar;
            this.f53594f = i10;
            this.f53595g = c6683h;
            this.f53596h = i11;
            this.f53597i = z11;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            try {
                boolean zD = this.f53593e.f53555l.d(this.f53594f, this.f53595g, this.f53596h, this.f53597i);
                if (zD) {
                    this.f53593e.u1().w(this.f53594f, mg.b.CANCEL);
                }
                if (!zD && !this.f53597i) {
                    return -1L;
                }
                synchronized (this.f53593e) {
                    this.f53593e.f53543B.remove(Integer.valueOf(this.f53594f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: mg.f$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0835f extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53598e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53599f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ List f53600g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f53601h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0835f(String str, boolean z10, f fVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f53598e = fVar;
            this.f53599f = i10;
            this.f53600g = list;
            this.f53601h = z11;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            boolean zC = this.f53598e.f53555l.c(this.f53599f, this.f53600g, this.f53601h);
            if (zC) {
                try {
                    this.f53598e.u1().w(this.f53599f, mg.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zC && !this.f53601h) {
                return -1L;
            }
            synchronized (this.f53598e) {
                this.f53598e.f53543B.remove(Integer.valueOf(this.f53599f));
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53602e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53603f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ List f53604g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, f fVar, int i10, List list) {
            super(str, z10);
            this.f53602e = fVar;
            this.f53603f = i10;
            this.f53604g = list;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            if (!this.f53602e.f53555l.b(this.f53603f, this.f53604g)) {
                return -1L;
            }
            try {
                this.f53602e.u1().w(this.f53603f, mg.b.CANCEL);
                synchronized (this.f53602e) {
                    this.f53602e.f53543B.remove(Integer.valueOf(this.f53603f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53605e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53606f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ mg.b f53607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, f fVar, int i10, mg.b bVar) {
            super(str, z10);
            this.f53605e = fVar;
            this.f53606f = i10;
            this.f53607g = bVar;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            this.f53605e.f53555l.a(this.f53606f, this.f53607g);
            synchronized (this.f53605e) {
                this.f53605e.f53543B.remove(Integer.valueOf(this.f53606f));
                L l10 = L.f17438a;
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53608e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, f fVar) {
            super(str, z10);
            this.f53608e = fVar;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            this.f53608e.l2(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53609e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f53610f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j10) {
            super(str, false, 2, null);
            this.f53609e = fVar;
            this.f53610f = j10;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            boolean z10;
            synchronized (this.f53609e) {
                if (this.f53609e.f53557n < this.f53609e.f53556m) {
                    z10 = true;
                } else {
                    this.f53609e.f53556m++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f53609e.Y(null);
                return -1L;
            }
            this.f53609e.l2(false, 1, 0);
            return this.f53610f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53611e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53612f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ mg.b f53613g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, f fVar, int i10, mg.b bVar) {
            super(str, z10);
            this.f53611e = fVar;
            this.f53612f = i10;
            this.f53613g = bVar;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            try {
                this.f53611e.m2(this.f53612f, this.f53613g);
                return -1L;
            } catch (IOException e10) {
                this.f53611e.Y(e10);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends AbstractC5097a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ f f53614e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f53615f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f53616g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, f fVar, int i10, long j10) {
            super(str, z10);
            this.f53614e = fVar;
            this.f53615f = i10;
            this.f53616g = j10;
        }

        @Override // ig.AbstractC5097a
        public long f() {
            try {
                this.f53614e.u1().C(this.f53615f, this.f53616g);
                return -1L;
            } catch (IOException e10) {
                this.f53614e.Y(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f53541D = mVar;
    }

    public f(a builder) {
        AbstractC5504s.h(builder, "builder");
        boolean zB = builder.b();
        this.f53544a = zB;
        this.f53545b = builder.d();
        this.f53546c = new LinkedHashMap();
        String strC = builder.c();
        this.f53547d = strC;
        this.f53549f = builder.b() ? 3 : 2;
        ig.e eVarJ = builder.j();
        this.f53551h = eVarJ;
        ig.d dVarI = eVarJ.i();
        this.f53552i = dVarI;
        this.f53553j = eVarJ.i();
        this.f53554k = eVarJ.i();
        this.f53555l = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, 16777216);
        }
        this.f53562s = mVar;
        this.f53563t = f53541D;
        this.f53567x = r2.c();
        this.f53568y = builder.h();
        this.f53569z = new mg.j(builder.g(), zB);
        this.f53542A = new d(this, new mg.h(builder.i(), zB));
        this.f53543B = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    private final mg.i A1(int i10, List list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.f53569z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f53549f > 1073741823) {
                                try {
                                    f2(mg.b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.f53550g) {
                                    throw new C5695a();
                                }
                                int i11 = this.f53549f;
                                this.f53549f = i11 + 2;
                                mg.i iVar = new mg.i(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f53566w >= this.f53567x || iVar.r() >= iVar.q();
                                if (iVar.u()) {
                                    this.f53546c.put(Integer.valueOf(i11), iVar);
                                }
                                L l10 = L.f17438a;
                                if (i10 == 0) {
                                    this.f53569z.l(z11, i11, list);
                                } else {
                                    if (this.f53544a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f53569z.q(i10, i11, list);
                                }
                                if (z12) {
                                    this.f53569z.flush();
                                }
                                return iVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public final void Y(IOException iOException) {
        mg.b bVar = mg.b.PROTOCOL_ERROR;
        S(bVar, bVar, iOException);
    }

    public static /* synthetic */ void h2(f fVar, boolean z10, ig.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = ig.e.f48893i;
        }
        fVar.g2(z10, eVar);
    }

    public final c B0() {
        return this.f53545b;
    }

    public final mg.i D1(List requestHeaders, boolean z10) {
        AbstractC5504s.h(requestHeaders, "requestHeaders");
        return A1(0, requestHeaders, z10);
    }

    public final int F0() {
        return this.f53549f;
    }

    public final m G0() {
        return this.f53562s;
    }

    public final m M0() {
        return this.f53563t;
    }

    public final void O1(int i10, InterfaceC6685j source, int i11, boolean z10) {
        AbstractC5504s.h(source, "source");
        C6683h c6683h = new C6683h();
        long j10 = i11;
        source.R0(j10);
        source.N0(c6683h, j10);
        this.f53553j.i(new e(this.f53547d + '[' + i10 + "] onData", true, this, i10, c6683h, i11, z10), 0L);
    }

    public final void S(mg.b connectionCode, mg.b streamCode, IOException iOException) {
        int i10;
        Object[] array;
        AbstractC5504s.h(connectionCode, "connectionCode");
        AbstractC5504s.h(streamCode, "streamCode");
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            f2(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f53546c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f53546c.values().toArray(new mg.i[0]);
                    this.f53546c.clear();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mg.i[] iVarArr = (mg.i[]) array;
        if (iVarArr != null) {
            for (mg.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f53569z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f53568y.close();
        } catch (IOException unused4) {
        }
        this.f53552i.n();
        this.f53553j.n();
        this.f53554k.n();
    }

    public final void S1(int i10, List requestHeaders, boolean z10) {
        AbstractC5504s.h(requestHeaders, "requestHeaders");
        this.f53553j.i(new C0835f(this.f53547d + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    public final void Y1(int i10, List requestHeaders) throws Throwable {
        Throwable th2;
        AbstractC5504s.h(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f53543B.contains(Integer.valueOf(i10))) {
                    this.f53543B.add(Integer.valueOf(i10));
                    this.f53553j.i(new g(this.f53547d + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
                    return;
                }
                try {
                    n2(i10, mg.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
            throw th2;
        }
    }

    public final void Z1(int i10, mg.b errorCode) {
        AbstractC5504s.h(errorCode, "errorCode");
        this.f53553j.i(new h(this.f53547d + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    public final synchronized mg.i a1(int i10) {
        return (mg.i) this.f53546c.get(Integer.valueOf(i10));
    }

    public final boolean a2(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized mg.i b2(int i10) {
        mg.i iVar;
        iVar = (mg.i) this.f53546c.remove(Integer.valueOf(i10));
        AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final void c2() {
        synchronized (this) {
            long j10 = this.f53559p;
            long j11 = this.f53558o;
            if (j10 < j11) {
                return;
            }
            this.f53558o = j11 + 1;
            this.f53561r = System.nanoTime() + ((long) 1000000000);
            L l10 = L.f17438a;
            this.f53552i.i(new i(this.f53547d + " ping", true, this), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        S(mg.b.NO_ERROR, mg.b.CANCEL, null);
    }

    public final void d2(int i10) {
        this.f53548e = i10;
    }

    public final void e2(m mVar) {
        AbstractC5504s.h(mVar, "<set-?>");
        this.f53563t = mVar;
    }

    public final void f2(mg.b statusCode) {
        AbstractC5504s.h(statusCode, "statusCode");
        synchronized (this.f53569z) {
            kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
            synchronized (this) {
                if (this.f53550g) {
                    return;
                }
                this.f53550g = true;
                int i10 = this.f53548e;
                l10.f52257a = i10;
                L l11 = L.f17438a;
                this.f53569z.k(i10, statusCode, AbstractC4807e.f47062a);
            }
        }
    }

    public final void flush() {
        this.f53569z.flush();
    }

    public final void g2(boolean z10, ig.e taskRunner) {
        AbstractC5504s.h(taskRunner, "taskRunner");
        if (z10) {
            this.f53569z.b();
            this.f53569z.z(this.f53562s);
            if (this.f53562s.c() != 65535) {
                this.f53569z.C(0, r5 - 65535);
            }
        }
        taskRunner.i().i(new ig.c(this.f53547d, true, this.f53542A), 0L);
    }

    public final boolean h0() {
        return this.f53544a;
    }

    public final synchronized void i2(long j10) {
        long j11 = this.f53564u + j10;
        this.f53564u = j11;
        long j12 = j11 - this.f53565v;
        if (j12 >= this.f53562s.c() / 2) {
            o2(0, j12);
            this.f53565v += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f53569z.m());
        r6 = r2;
        r8.f53566w += r6;
        r4 = Td.L.f17438a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j2(int r9, boolean r10, tg.C6683h r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            mg.j r12 = r8.f53569z
            r12.g(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f53566w     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.f53567x     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.f53546c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.AbstractC5504s.f(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            mg.j r4 = r8.f53569z     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.m()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f53566w     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f53566w = r4     // Catch: java.lang.Throwable -> L2f
            Td.L r4 = Td.L.f17438a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            mg.j r4 = r8.f53569z
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.g(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.f.j2(int, boolean, tg.h, long):void");
    }

    public final String k0() {
        return this.f53547d;
    }

    public final void k2(int i10, boolean z10, List alternating) {
        AbstractC5504s.h(alternating, "alternating");
        this.f53569z.l(z10, i10, alternating);
    }

    public final void l2(boolean z10, int i10, int i11) {
        try {
            this.f53569z.o(z10, i10, i11);
        } catch (IOException e10) {
            Y(e10);
        }
    }

    public final void m2(int i10, mg.b statusCode) {
        AbstractC5504s.h(statusCode, "statusCode");
        this.f53569z.w(i10, statusCode);
    }

    public final void n2(int i10, mg.b errorCode) {
        AbstractC5504s.h(errorCode, "errorCode");
        this.f53552i.i(new k(this.f53547d + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final void o2(int i10, long j10) {
        this.f53552i.i(new l(this.f53547d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final int p0() {
        return this.f53548e;
    }

    public final Map q1() {
        return this.f53546c;
    }

    public final long t1() {
        return this.f53567x;
    }

    public final mg.j u1() {
        return this.f53569z;
    }

    public final synchronized boolean y1(long j10) {
        if (this.f53550g) {
            return false;
        }
        if (this.f53559p < this.f53558o) {
            if (j10 >= this.f53561r) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class d implements h.c, InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        private final mg.h f53581a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ f f53582b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends AbstractC5097a {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ f f53583e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ N f53584f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, f fVar, N n10) {
                super(str, z10);
                this.f53583e = fVar;
                this.f53584f = n10;
            }

            @Override // ig.AbstractC5097a
            public long f() {
                this.f53583e.B0().a(this.f53583e, (m) this.f53584f.f52259a);
                return -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5097a {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ f f53585e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ mg.i f53586f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, f fVar, mg.i iVar) {
                super(str, z10);
                this.f53585e = fVar;
                this.f53586f = iVar;
            }

            @Override // ig.AbstractC5097a
            public long f() {
                try {
                    this.f53585e.B0().b(this.f53586f);
                    return -1L;
                } catch (IOException e10) {
                    og.j.f55583a.g().k("Http2Connection.Listener failure for " + this.f53585e.k0(), 4, e10);
                    try {
                        this.f53586f.d(mg.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends AbstractC5097a {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ f f53587e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f53588f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f53589g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, f fVar, int i10, int i11) {
                super(str, z10);
                this.f53587e = fVar;
                this.f53588f = i10;
                this.f53589g = i11;
            }

            @Override // ig.AbstractC5097a
            public long f() {
                this.f53587e.l2(true, this.f53588f, this.f53589g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: mg.f$d$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0834d extends AbstractC5097a {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ d f53590e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ boolean f53591f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ m f53592g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0834d(String str, boolean z10, d dVar, boolean z11, m mVar) {
                super(str, z10);
                this.f53590e = dVar;
                this.f53591f = z11;
                this.f53592g = mVar;
            }

            @Override // ig.AbstractC5097a
            public long f() {
                this.f53590e.p(this.f53591f, this.f53592g);
                return -1L;
            }
        }

        public d(f fVar, mg.h reader) {
            AbstractC5504s.h(reader, "reader");
            this.f53582b = fVar;
            this.f53581a = reader;
        }

        @Override // mg.h.c
        public void a(boolean z10, int i10, int i11, List headerBlock) {
            AbstractC5504s.h(headerBlock, "headerBlock");
            if (this.f53582b.a2(i10)) {
                this.f53582b.S1(i10, headerBlock, z10);
                return;
            }
            f fVar = this.f53582b;
            synchronized (fVar) {
                mg.i iVarA1 = fVar.a1(i10);
                if (iVarA1 != null) {
                    L l10 = L.f17438a;
                    iVarA1.x(AbstractC4807e.Q(headerBlock), z10);
                    return;
                }
                if (fVar.f53550g) {
                    return;
                }
                if (i10 <= fVar.p0()) {
                    return;
                }
                if (i10 % 2 == fVar.F0() % 2) {
                    return;
                }
                mg.i iVar = new mg.i(i10, fVar, false, z10, AbstractC4807e.Q(headerBlock));
                fVar.d2(i10);
                fVar.q1().put(Integer.valueOf(i10), iVar);
                fVar.f53551h.i().i(new b(fVar.k0() + '[' + i10 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // mg.h.c
        public void b(int i10, long j10) {
            if (i10 == 0) {
                f fVar = this.f53582b;
                synchronized (fVar) {
                    fVar.f53567x = fVar.t1() + j10;
                    AbstractC5504s.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    L l10 = L.f17438a;
                }
                return;
            }
            mg.i iVarA1 = this.f53582b.a1(i10);
            if (iVarA1 != null) {
                synchronized (iVarA1) {
                    iVarA1.a(j10);
                    L l11 = L.f17438a;
                }
            }
        }

        @Override // mg.h.c
        public void c(int i10, mg.b errorCode, C6686k debugData) {
            int i11;
            Object[] array;
            AbstractC5504s.h(errorCode, "errorCode");
            AbstractC5504s.h(debugData, "debugData");
            debugData.K();
            f fVar = this.f53582b;
            synchronized (fVar) {
                array = fVar.q1().values().toArray(new mg.i[0]);
                fVar.f53550g = true;
                L l10 = L.f17438a;
            }
            for (mg.i iVar : (mg.i[]) array) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(mg.b.REFUSED_STREAM);
                    this.f53582b.b2(iVar.j());
                }
            }
        }

        @Override // mg.h.c
        public void e(boolean z10, int i10, InterfaceC6685j source, int i11) {
            AbstractC5504s.h(source, "source");
            if (this.f53582b.a2(i10)) {
                this.f53582b.O1(i10, source, i11, z10);
                return;
            }
            mg.i iVarA1 = this.f53582b.a1(i10);
            if (iVarA1 == null) {
                this.f53582b.n2(i10, mg.b.PROTOCOL_ERROR);
                long j10 = i11;
                this.f53582b.i2(j10);
                source.skip(j10);
                return;
            }
            iVarA1.w(source, i11);
            if (z10) {
                iVarA1.x(AbstractC4807e.f47063b, true);
            }
        }

        @Override // mg.h.c
        public void f(int i10, int i11, List requestHeaders) throws Throwable {
            AbstractC5504s.h(requestHeaders, "requestHeaders");
            this.f53582b.Y1(i11, requestHeaders);
        }

        @Override // mg.h.c
        public void h(int i10, mg.b errorCode) {
            AbstractC5504s.h(errorCode, "errorCode");
            if (this.f53582b.a2(i10)) {
                this.f53582b.Z1(i10, errorCode);
                return;
            }
            mg.i iVarB2 = this.f53582b.b2(i10);
            if (iVarB2 != null) {
                iVarB2.y(errorCode);
            }
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            r();
            return L.f17438a;
        }

        @Override // mg.h.c
        public void j(boolean z10, m settings) {
            AbstractC5504s.h(settings, "settings");
            this.f53582b.f53552i.i(new C0834d(this.f53582b.k0() + " applyAndAckSettings", true, this, z10, settings), 0L);
        }

        @Override // mg.h.c
        public void k(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f53582b.f53552i.i(new c(this.f53582b.k0() + " ping", true, this.f53582b, i10, i11), 0L);
                return;
            }
            f fVar = this.f53582b;
            synchronized (fVar) {
                try {
                    if (i10 == 1) {
                        fVar.f53557n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f53560q++;
                            AbstractC5504s.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        L l10 = L.f17438a;
                    } else {
                        fVar.f53559p++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void p(boolean z10, m settings) {
            long jC;
            int i10;
            mg.i[] iVarArr;
            AbstractC5504s.h(settings, "settings");
            N n10 = new N();
            mg.j jVarU1 = this.f53582b.u1();
            f fVar = this.f53582b;
            synchronized (jVarU1) {
                synchronized (fVar) {
                    try {
                        m mVarM0 = fVar.M0();
                        if (!z10) {
                            m mVar = new m();
                            mVar.g(mVarM0);
                            mVar.g(settings);
                            settings = mVar;
                        }
                        n10.f52259a = settings;
                        jC = ((long) settings.c()) - ((long) mVarM0.c());
                        iVarArr = (jC == 0 || fVar.q1().isEmpty()) ? null : (mg.i[]) fVar.q1().values().toArray(new mg.i[0]);
                        fVar.e2((m) n10.f52259a);
                        fVar.f53554k.i(new a(fVar.k0() + " onSettings", true, fVar, n10), 0L);
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    fVar.u1().a((m) n10.f52259a);
                } catch (IOException e10) {
                    fVar.Y(e10);
                }
                L l11 = L.f17438a;
            }
            if (iVarArr != null) {
                for (mg.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        L l12 = L.f17438a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [mg.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, mg.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void r() throws Throwable {
            mg.b bVar;
            mg.b bVar2;
            mg.b bVar3 = mg.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f53581a.g(this);
                    while (this.f53581a.b(false, this)) {
                    }
                    bVar2 = mg.b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    this.f53582b.S(bVar, bVar3, e10);
                    AbstractC4807e.m(this.f53581a);
                    throw th;
                }
                try {
                    this.f53582b.S(bVar2, mg.b.CANCEL, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    mg.b bVar4 = mg.b.PROTOCOL_ERROR;
                    f fVar = this.f53582b;
                    fVar.S(bVar4, bVar4, e10);
                    bVar = fVar;
                }
                bVar3 = this.f53581a;
                AbstractC4807e.m(bVar3);
            } catch (Throwable th3) {
                th = th3;
                this.f53582b.S(bVar, bVar3, e10);
                AbstractC4807e.m(this.f53581a);
                throw th;
            }
        }

        @Override // mg.h.c
        public void i() {
        }

        @Override // mg.h.c
        public void n(int i10, int i11, int i12, boolean z10) {
        }
    }
}
