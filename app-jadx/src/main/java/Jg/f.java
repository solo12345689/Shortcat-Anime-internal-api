package jg;

import Ud.AbstractC2279u;
import dg.C;
import dg.C4618A;
import dg.C4620a;
import dg.C4626g;
import dg.E;
import dg.EnumC4619B;
import dg.G;
import dg.InterfaceC4624e;
import dg.InterfaceC4629j;
import dg.l;
import dg.r;
import dg.s;
import dg.u;
import fg.AbstractC4807e;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kg.InterfaceC5481d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.C5695a;
import mg.f;
import mg.m;
import mg.n;
import sg.d;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;
import tg.K;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends f.c implements InterfaceC4629j {

    /* JADX INFO: renamed from: t */
    public static final a f51877t = new a(null);

    /* JADX INFO: renamed from: c */
    private final g f51878c;

    /* JADX INFO: renamed from: d */
    private final G f51879d;

    /* JADX INFO: renamed from: e */
    private Socket f51880e;

    /* JADX INFO: renamed from: f */
    private Socket f51881f;

    /* JADX INFO: renamed from: g */
    private s f51882g;

    /* JADX INFO: renamed from: h */
    private EnumC4619B f51883h;

    /* JADX INFO: renamed from: i */
    private mg.f f51884i;

    /* JADX INFO: renamed from: j */
    private InterfaceC6685j f51885j;

    /* JADX INFO: renamed from: k */
    private InterfaceC6684i f51886k;

    /* JADX INFO: renamed from: l */
    private boolean f51887l;

    /* JADX INFO: renamed from: m */
    private boolean f51888m;

    /* JADX INFO: renamed from: n */
    private int f51889n;

    /* JADX INFO: renamed from: o */
    private int f51890o;

    /* JADX INFO: renamed from: p */
    private int f51891p;

    /* JADX INFO: renamed from: q */
    private int f51892q;

    /* JADX INFO: renamed from: r */
    private final List f51893r;

    /* JADX INFO: renamed from: s */
    private long f51894s;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51895a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51895a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4626g f51896a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ s f51897b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4620a f51898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4626g c4626g, s sVar, C4620a c4620a) {
            super(0);
            this.f51896a = c4626g;
            this.f51897b = sVar;
            this.f51898c = c4620a;
        }

        @Override // ie.InterfaceC5082a
        public final List invoke() {
            rg.c cVarD = this.f51896a.d();
            AbstractC5504s.e(cVarD);
            return cVarD.a(this.f51897b.d(), this.f51898c.l().h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {
        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final List invoke() {
            s sVar = f.this.f51882g;
            AbstractC5504s.e(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listD, 10));
            for (Certificate certificate : listD) {
                AbstractC5504s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends d.AbstractC0900d {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ jg.c f51900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6685j interfaceC6685j, InterfaceC6684i interfaceC6684i, jg.c cVar) {
            super(true, interfaceC6685j, interfaceC6684i);
            this.f51900d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f51900d.a(-1L, true, true, null);
        }
    }

    public f(g connectionPool, G route) {
        AbstractC5504s.h(connectionPool, "connectionPool");
        AbstractC5504s.h(route, "route");
        this.f51878c = connectionPool;
        this.f51879d = route;
        this.f51892q = 1;
        this.f51893r = new ArrayList();
        this.f51894s = Long.MAX_VALUE;
    }

    private final boolean B(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G g10 = (G) it.next();
            Proxy.Type type = g10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f51879d.b().type() == type2 && AbstractC5504s.c(this.f51879d.d(), g10.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i10) throws SocketException {
        Socket socket = this.f51881f;
        AbstractC5504s.e(socket);
        InterfaceC6685j interfaceC6685j = this.f51885j;
        AbstractC5504s.e(interfaceC6685j);
        InterfaceC6684i interfaceC6684i = this.f51886k;
        AbstractC5504s.e(interfaceC6684i);
        socket.setSoTimeout(0);
        mg.f fVarA = new f.a(true, ig.e.f48893i).q(socket, this.f51879d.a().l().h(), interfaceC6685j, interfaceC6684i).k(this).l(i10).a();
        this.f51884i = fVarA;
        this.f51892q = mg.f.f53540C.a().d();
        mg.f.h2(fVarA, false, null, 3, null);
    }

    private final boolean G(u uVar) {
        s sVar;
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        u uVarL = this.f51879d.a().l();
        if (uVar.m() != uVarL.m()) {
            return false;
        }
        if (AbstractC5504s.c(uVar.h(), uVarL.h())) {
            return true;
        }
        if (!this.f51888m && (sVar = this.f51882g) != null) {
            AbstractC5504s.e(sVar);
            if (e(uVar, sVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean e(u uVar, s sVar) {
        List listD = sVar.d();
        if (!listD.isEmpty()) {
            rg.d dVar = rg.d.f58816a;
            String strH = uVar.h();
            Object obj = listD.get(0);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i10, int i11, InterfaceC4624e interfaceC4624e, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f51879d.b();
        C4620a c4620aA = this.f51879d.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : b.f51895a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c4620aA.j().createSocket();
            AbstractC5504s.e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f51880e = socketCreateSocket;
        rVar.j(interfaceC4624e, this.f51879d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            og.j.f55583a.g().f(socketCreateSocket, this.f51879d.d(), i10);
            try {
                this.f51885j = K.d(K.l(socketCreateSocket));
                this.f51886k = K.c(K.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC5504s.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f51879d.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

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
    private final void i(C5402b c5402b) throws Throwable {
        C4620a c4620aA = this.f51879d.a();
        SSLSocketFactory sSLSocketFactoryK = c4620aA.k();
        SSLSocket sSLSocket = null;
        try {
            AbstractC5504s.e(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f51880e, c4620aA.l().h(), c4620aA.l().m(), true);
            AbstractC5504s.f(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = c5402b.a(sSLSocket2);
                if (lVarA.h()) {
                    og.j.f55583a.g().e(sSLSocket2, c4620aA.l().h(), c4620aA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f45572e;
                AbstractC5504s.g(sslSocketSession, "sslSocketSession");
                s sVarB = aVar.b(sslSocketSession);
                HostnameVerifier hostnameVerifierE = c4620aA.e();
                AbstractC5504s.e(hostnameVerifierE);
                if (hostnameVerifierE.verify(c4620aA.l().h(), sslSocketSession)) {
                    C4626g c4626gA = c4620aA.a();
                    AbstractC5504s.e(c4626gA);
                    this.f51882g = new s(sVarB.e(), sVarB.a(), sVarB.c(), new c(c4626gA, sVarB, c4620aA));
                    c4626gA.b(c4620aA.l().h(), new d());
                    String strH = lVarA.h() ? og.j.f55583a.g().h(sSLSocket2) : null;
                    this.f51881f = sSLSocket2;
                    this.f51885j = K.d(K.l(sSLSocket2));
                    this.f51886k = K.c(K.h(sSLSocket2));
                    this.f51883h = strH != null ? EnumC4619B.f45242b.a(strH) : EnumC4619B.HTTP_1_1;
                    og.j.f55583a.g().b(sSLSocket2);
                    return;
                }
                List listD = sVarB.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c4620aA.l().h() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                AbstractC5504s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(Df.r.l("\n              |Hostname " + c4620aA.l().h() + " not verified:\n              |    certificate: " + C4626g.f45384c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + rg.d.f58816a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    og.j.f55583a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC4807e.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void j(int i10, int i11, int i12, InterfaceC4624e interfaceC4624e, r rVar) throws IOException {
        C cL = l();
        u uVarP = cL.p();
        for (int i13 = 0; i13 < 21; i13++) {
            h(i10, i11, interfaceC4624e, rVar);
            cL = k(i11, i12, cL, uVarP);
            if (cL == null) {
                return;
            }
            Socket socket = this.f51880e;
            if (socket != null) {
                AbstractC4807e.n(socket);
            }
            this.f51880e = null;
            this.f51886k = null;
            this.f51885j = null;
            rVar.h(interfaceC4624e, this.f51879d.d(), this.f51879d.b(), null);
        }
    }

    private final C k(int i10, int i11, C c10, u uVar) throws IOException {
        String str = "CONNECT " + AbstractC4807e.T(uVar, true) + " HTTP/1.1";
        while (true) {
            InterfaceC6685j interfaceC6685j = this.f51885j;
            AbstractC5504s.e(interfaceC6685j);
            InterfaceC6684i interfaceC6684i = this.f51886k;
            AbstractC5504s.e(interfaceC6684i);
            lg.b bVar = new lg.b(null, this, interfaceC6685j, interfaceC6684i);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC6685j.t().g(i10, timeUnit);
            interfaceC6684i.t().g(i11, timeUnit);
            bVar.A(c10.i(), str);
            bVar.a();
            E.a aVarE = bVar.e(false);
            AbstractC5504s.e(aVarE);
            E eC = aVarE.s(c10).c();
            bVar.z(eC);
            int iO = eC.o();
            if (iO == 200) {
                if (interfaceC6685j.s().f1() && interfaceC6684i.s().f1()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iO != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + eC.o());
            }
            C cA = this.f51879d.a().h().a(this.f51879d, eC);
            if (cA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (Df.r.B("close", E.D(eC, "Connection", null, 2, null), true)) {
                return cA;
            }
            c10 = cA;
        }
    }

    private final C l() {
        C cB = new C.a().l(this.f51879d.a().l()).g("CONNECT", null).e("Host", AbstractC4807e.T(this.f51879d.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.12.0").b();
        C cA = this.f51879d.a().h().a(this.f51879d, new E.a().s(cB).p(EnumC4619B.HTTP_1_1).g(407).m("Preemptive Authenticate").b(AbstractC4807e.f47064c).t(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return cA == null ? cB : cA;
    }

    private final void m(C5402b c5402b, int i10, InterfaceC4624e interfaceC4624e, r rVar) throws Throwable {
        if (this.f51879d.a().k() != null) {
            rVar.C(interfaceC4624e);
            i(c5402b);
            rVar.B(interfaceC4624e, this.f51882g);
            if (this.f51883h == EnumC4619B.HTTP_2) {
                F(i10);
                return;
            }
            return;
        }
        List listF = this.f51879d.a().f();
        EnumC4619B enumC4619B = EnumC4619B.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(enumC4619B)) {
            this.f51881f = this.f51880e;
            this.f51883h = EnumC4619B.HTTP_1_1;
        } else {
            this.f51881f = this.f51880e;
            this.f51883h = enumC4619B;
            F(i10);
        }
    }

    public G A() {
        return this.f51879d;
    }

    public final void C(long j10) {
        this.f51894s = j10;
    }

    public final void D(boolean z10) {
        this.f51887l = z10;
    }

    public Socket E() {
        Socket socket = this.f51881f;
        AbstractC5504s.e(socket);
        return socket;
    }

    public final synchronized void H(jg.e call, IOException iOException) {
        try {
            AbstractC5504s.h(call, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f53687a == mg.b.REFUSED_STREAM) {
                    int i10 = this.f51891p + 1;
                    this.f51891p = i10;
                    if (i10 > 1) {
                        this.f51887l = true;
                        this.f51889n++;
                    }
                } else if (((n) iOException).f53687a != mg.b.CANCEL || !call.u1()) {
                    this.f51887l = true;
                    this.f51889n++;
                }
            } else if (!v() || (iOException instanceof C5695a)) {
                this.f51887l = true;
                if (this.f51890o == 0) {
                    if (iOException != null) {
                        g(call.k(), this.f51879d, iOException);
                    }
                    this.f51889n++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // mg.f.c
    public synchronized void a(mg.f connection, m settings) {
        AbstractC5504s.h(connection, "connection");
        AbstractC5504s.h(settings, "settings");
        this.f51892q = settings.d();
    }

    @Override // mg.f.c
    public void b(mg.i stream) {
        AbstractC5504s.h(stream, "stream");
        stream.d(mg.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f51880e;
        if (socket != null) {
            AbstractC4807e.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r13, int r14, int r15, int r16, boolean r17, dg.InterfaceC4624e r18, dg.r r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.f.f(int, int, int, int, boolean, dg.e, dg.r):void");
    }

    public final void g(C4618A client, G failedRoute, IOException failure) {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(failedRoute, "failedRoute");
        AbstractC5504s.h(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C4620a c4620aA = failedRoute.a();
            c4620aA.i().connectFailed(c4620aA.l().r(), failedRoute.b().address(), failure);
        }
        client.A().b(failedRoute);
    }

    public final List n() {
        return this.f51893r;
    }

    public final long o() {
        return this.f51894s;
    }

    public final boolean p() {
        return this.f51887l;
    }

    public final int q() {
        return this.f51889n;
    }

    public s r() {
        return this.f51882g;
    }

    public final synchronized void s() {
        this.f51890o++;
    }

    public final boolean t(C4620a address, List list) {
        AbstractC5504s.h(address, "address");
        if (AbstractC4807e.f47069h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f51893r.size() >= this.f51892q || this.f51887l || !this.f51879d.a().d(address)) {
            return false;
        }
        if (AbstractC5504s.c(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f51884i == null || list == null || !B(list) || address.e() != rg.d.f58816a || !G(address.l())) {
            return false;
        }
        try {
            C4626g c4626gA = address.a();
            AbstractC5504s.e(c4626gA);
            String strH = address.l().h();
            s sVarR = r();
            AbstractC5504s.e(sVarR);
            c4626gA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f51879d.a().l().h());
        sb2.append(':');
        sb2.append(this.f51879d.a().l().m());
        sb2.append(", proxy=");
        sb2.append(this.f51879d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f51879d.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f51882g;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb2.append(objA);
        sb2.append(" protocol=");
        sb2.append(this.f51883h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
        if (AbstractC4807e.f47069h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f51880e;
        AbstractC5504s.e(socket);
        Socket socket2 = this.f51881f;
        AbstractC5504s.e(socket2);
        InterfaceC6685j interfaceC6685j = this.f51885j;
        AbstractC5504s.e(interfaceC6685j);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        mg.f fVar = this.f51884i;
        if (fVar != null) {
            return fVar.y1(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f51894s;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return AbstractC4807e.G(socket2, interfaceC6685j);
    }

    public final boolean v() {
        return this.f51884i != null;
    }

    public final InterfaceC5481d w(C4618A client, kg.g chain) throws SocketException {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(chain, "chain");
        Socket socket = this.f51881f;
        AbstractC5504s.e(socket);
        InterfaceC6685j interfaceC6685j = this.f51885j;
        AbstractC5504s.e(interfaceC6685j);
        InterfaceC6684i interfaceC6684i = this.f51886k;
        AbstractC5504s.e(interfaceC6684i);
        mg.f fVar = this.f51884i;
        if (fVar != null) {
            return new mg.g(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.j());
        a0 a0VarT = interfaceC6685j.t();
        long jG = chain.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a0VarT.g(jG, timeUnit);
        interfaceC6684i.t().g(chain.i(), timeUnit);
        return new lg.b(client, this, interfaceC6685j, interfaceC6684i);
    }

    public final d.AbstractC0900d x(jg.c exchange) throws SocketException {
        AbstractC5504s.h(exchange, "exchange");
        Socket socket = this.f51881f;
        AbstractC5504s.e(socket);
        InterfaceC6685j interfaceC6685j = this.f51885j;
        AbstractC5504s.e(interfaceC6685j);
        InterfaceC6684i interfaceC6684i = this.f51886k;
        AbstractC5504s.e(interfaceC6684i);
        socket.setSoTimeout(0);
        z();
        return new e(interfaceC6685j, interfaceC6684i, exchange);
    }

    public final synchronized void y() {
        this.f51888m = true;
    }

    public final synchronized void z() {
        this.f51887l = true;
    }
}
