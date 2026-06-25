package dg;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import dg.InterfaceC4624e;
import dg.r;
import fg.AbstractC4807e;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og.j;
import qg.C6216a;
import rg.c;

/* JADX INFO: renamed from: dg.A */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C4618A implements Cloneable, InterfaceC4624e.a {

    /* JADX INFO: renamed from: E */
    public static final b f45179E = new b(null);

    /* JADX INFO: renamed from: F */
    private static final List f45180F = AbstractC4807e.w(EnumC4619B.HTTP_2, EnumC4619B.HTTP_1_1);

    /* JADX INFO: renamed from: G */
    private static final List f45181G = AbstractC4807e.w(l.f45522i, l.f45524k);

    /* JADX INFO: renamed from: A */
    private final int f45182A;

    /* JADX INFO: renamed from: B */
    private final int f45183B;

    /* JADX INFO: renamed from: C */
    private final long f45184C;

    /* JADX INFO: renamed from: D */
    private final jg.h f45185D;

    /* JADX INFO: renamed from: a */
    private final p f45186a;

    /* JADX INFO: renamed from: b */
    private final k f45187b;

    /* JADX INFO: renamed from: c */
    private final List f45188c;

    /* JADX INFO: renamed from: d */
    private final List f45189d;

    /* JADX INFO: renamed from: e */
    private final r.c f45190e;

    /* JADX INFO: renamed from: f */
    private final boolean f45191f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC4621b f45192g;

    /* JADX INFO: renamed from: h */
    private final boolean f45193h;

    /* JADX INFO: renamed from: i */
    private final boolean f45194i;

    /* JADX INFO: renamed from: j */
    private final n f45195j;

    /* JADX INFO: renamed from: k */
    private final C4622c f45196k;

    /* JADX INFO: renamed from: l */
    private final q f45197l;

    /* JADX INFO: renamed from: m */
    private final Proxy f45198m;

    /* JADX INFO: renamed from: n */
    private final ProxySelector f45199n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC4621b f45200o;

    /* JADX INFO: renamed from: p */
    private final SocketFactory f45201p;

    /* JADX INFO: renamed from: q */
    private final SSLSocketFactory f45202q;

    /* JADX INFO: renamed from: r */
    private final X509TrustManager f45203r;

    /* JADX INFO: renamed from: s */
    private final List f45204s;

    /* JADX INFO: renamed from: t */
    private final List f45205t;

    /* JADX INFO: renamed from: u */
    private final HostnameVerifier f45206u;

    /* JADX INFO: renamed from: v */
    private final C4626g f45207v;

    /* JADX INFO: renamed from: w */
    private final rg.c f45208w;

    /* JADX INFO: renamed from: x */
    private final int f45209x;

    /* JADX INFO: renamed from: y */
    private final int f45210y;

    /* JADX INFO: renamed from: z */
    private final int f45211z;

    /* JADX INFO: renamed from: dg.A$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return C4618A.f45181G;
        }

        public final List b() {
            return C4618A.f45180F;
        }

        private b() {
        }
    }

    public C4618A(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorG;
        AbstractC5504s.h(builder, "builder");
        this.f45186a = builder.t();
        this.f45187b = builder.q();
        this.f45188c = AbstractC4807e.V(builder.z());
        this.f45189d = AbstractC4807e.V(builder.B());
        this.f45190e = builder.v();
        this.f45191f = builder.I();
        this.f45192g = builder.k();
        this.f45193h = builder.w();
        this.f45194i = builder.x();
        this.f45195j = builder.s();
        this.f45196k = builder.l();
        this.f45197l = builder.u();
        this.f45198m = builder.E();
        if (builder.E() != null) {
            proxySelectorG = C6216a.f58130a;
        } else {
            proxySelectorG = builder.G();
            proxySelectorG = proxySelectorG == null ? ProxySelector.getDefault() : proxySelectorG;
            if (proxySelectorG == null) {
                proxySelectorG = C6216a.f58130a;
            }
        }
        this.f45199n = proxySelectorG;
        this.f45200o = builder.F();
        this.f45201p = builder.K();
        List listR = builder.r();
        this.f45204s = listR;
        this.f45205t = builder.D();
        this.f45206u = builder.y();
        this.f45209x = builder.m();
        this.f45210y = builder.p();
        this.f45211z = builder.H();
        this.f45182A = builder.M();
        this.f45183B = builder.C();
        this.f45184C = builder.A();
        jg.h hVarJ = builder.J();
        this.f45185D = hVarJ == null ? new jg.h() : hVarJ;
        if (listR == null || !listR.isEmpty()) {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.L() != null) {
                        this.f45202q = builder.L();
                        rg.c cVarN = builder.n();
                        AbstractC5504s.e(cVarN);
                        this.f45208w = cVarN;
                        X509TrustManager x509TrustManagerN = builder.N();
                        AbstractC5504s.e(x509TrustManagerN);
                        this.f45203r = x509TrustManagerN;
                        C4626g c4626gO = builder.o();
                        AbstractC5504s.e(cVarN);
                        this.f45207v = c4626gO.e(cVarN);
                    } else {
                        j.a aVar = og.j.f55583a;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f45203r = x509TrustManagerP;
                        og.j jVarG = aVar.g();
                        AbstractC5504s.e(x509TrustManagerP);
                        this.f45202q = jVarG.o(x509TrustManagerP);
                        c.a aVar2 = rg.c.f58815a;
                        AbstractC5504s.e(x509TrustManagerP);
                        rg.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f45208w = cVarA;
                        C4626g c4626gO2 = builder.o();
                        AbstractC5504s.e(cVarA);
                        this.f45207v = c4626gO2.e(cVarA);
                    }
                }
            }
            this.f45202q = null;
            this.f45208w = null;
            this.f45203r = null;
            this.f45207v = C4626g.f45385d;
        } else {
            this.f45202q = null;
            this.f45208w = null;
            this.f45203r = null;
            this.f45207v = C4626g.f45385d;
        }
        Q();
    }

    private final void Q() {
        List list = this.f45188c;
        AbstractC5504s.f(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f45188c).toString());
        }
        List list2 = this.f45189d;
        AbstractC5504s.f(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f45189d).toString());
        }
        List list3 = this.f45204s;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f45202q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f45208w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f45203r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f45202q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f45208w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f45203r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC5504s.c(this.f45207v, C4626g.f45385d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final jg.h A() {
        return this.f45185D;
    }

    public final HostnameVerifier B() {
        return this.f45206u;
    }

    public final List C() {
        return this.f45188c;
    }

    public final long D() {
        return this.f45184C;
    }

    public final List E() {
        return this.f45189d;
    }

    public a F() {
        return new a(this);
    }

    public I G(C request, J listener) {
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(listener, "listener");
        sg.d dVar = new sg.d(ig.e.f48893i, request, listener, new Random(), this.f45183B, null, this.f45184C);
        dVar.o(this);
        return dVar;
    }

    public final int H() {
        return this.f45183B;
    }

    public final List I() {
        return this.f45205t;
    }

    public final Proxy J() {
        return this.f45198m;
    }

    public final InterfaceC4621b K() {
        return this.f45200o;
    }

    public final ProxySelector L() {
        return this.f45199n;
    }

    public final int M() {
        return this.f45211z;
    }

    public final boolean N() {
        return this.f45191f;
    }

    public final SocketFactory O() {
        return this.f45201p;
    }

    public final SSLSocketFactory P() {
        SSLSocketFactory sSLSocketFactory = this.f45202q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int R() {
        return this.f45182A;
    }

    public final X509TrustManager S() {
        return this.f45203r;
    }

    @Override // dg.InterfaceC4624e.a
    public InterfaceC4624e a(C request) {
        AbstractC5504s.h(request, "request");
        return new jg.e(this, request, false);
    }

    public final int c() {
        return this.f45209x;
    }

    public Object clone() {
        return super.clone();
    }

    public final n d() {
        return this.f45195j;
    }

    public final p e() {
        return this.f45186a;
    }

    public final InterfaceC4621b i() {
        return this.f45192g;
    }

    public final C4622c j() {
        return this.f45196k;
    }

    public final int k() {
        return this.f45209x;
    }

    public final rg.c m() {
        return this.f45208w;
    }

    public final C4626g n() {
        return this.f45207v;
    }

    public final int p() {
        return this.f45210y;
    }

    public final k q() {
        return this.f45187b;
    }

    public final List r() {
        return this.f45204s;
    }

    public final n s() {
        return this.f45195j;
    }

    public final p t() {
        return this.f45186a;
    }

    public final q u() {
        return this.f45197l;
    }

    public final r.c v() {
        return this.f45190e;
    }

    public final boolean x() {
        return this.f45193h;
    }

    public final boolean y() {
        return this.f45194i;
    }

    /* JADX INFO: renamed from: dg.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: A */
        private int f45212A;

        /* JADX INFO: renamed from: B */
        private int f45213B;

        /* JADX INFO: renamed from: C */
        private long f45214C;

        /* JADX INFO: renamed from: D */
        private jg.h f45215D;

        /* JADX INFO: renamed from: a */
        private p f45216a;

        /* JADX INFO: renamed from: b */
        private k f45217b;

        /* JADX INFO: renamed from: c */
        private final List f45218c;

        /* JADX INFO: renamed from: d */
        private final List f45219d;

        /* JADX INFO: renamed from: e */
        private r.c f45220e;

        /* JADX INFO: renamed from: f */
        private boolean f45221f;

        /* JADX INFO: renamed from: g */
        private InterfaceC4621b f45222g;

        /* JADX INFO: renamed from: h */
        private boolean f45223h;

        /* JADX INFO: renamed from: i */
        private boolean f45224i;

        /* JADX INFO: renamed from: j */
        private n f45225j;

        /* JADX INFO: renamed from: k */
        private C4622c f45226k;

        /* JADX INFO: renamed from: l */
        private q f45227l;

        /* JADX INFO: renamed from: m */
        private Proxy f45228m;

        /* JADX INFO: renamed from: n */
        private ProxySelector f45229n;

        /* JADX INFO: renamed from: o */
        private InterfaceC4621b f45230o;

        /* JADX INFO: renamed from: p */
        private SocketFactory f45231p;

        /* JADX INFO: renamed from: q */
        private SSLSocketFactory f45232q;

        /* JADX INFO: renamed from: r */
        private X509TrustManager f45233r;

        /* JADX INFO: renamed from: s */
        private List f45234s;

        /* JADX INFO: renamed from: t */
        private List f45235t;

        /* JADX INFO: renamed from: u */
        private HostnameVerifier f45236u;

        /* JADX INFO: renamed from: v */
        private C4626g f45237v;

        /* JADX INFO: renamed from: w */
        private rg.c f45238w;

        /* JADX INFO: renamed from: x */
        private int f45239x;

        /* JADX INFO: renamed from: y */
        private int f45240y;

        /* JADX INFO: renamed from: z */
        private int f45241z;

        public a() {
            this.f45216a = new p();
            this.f45217b = new k();
            this.f45218c = new ArrayList();
            this.f45219d = new ArrayList();
            this.f45220e = AbstractC4807e.g(r.f45571b);
            this.f45221f = true;
            InterfaceC4621b interfaceC4621b = InterfaceC4621b.f45325b;
            this.f45222g = interfaceC4621b;
            this.f45223h = true;
            this.f45224i = true;
            this.f45225j = n.f45557b;
            this.f45227l = q.f45568b;
            this.f45230o = interfaceC4621b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC5504s.g(socketFactory, "getDefault()");
            this.f45231p = socketFactory;
            b bVar = C4618A.f45179E;
            this.f45234s = bVar.a();
            this.f45235t = bVar.b();
            this.f45236u = rg.d.f58816a;
            this.f45237v = C4626g.f45385d;
            this.f45240y = ColorExtractionConstants.MAX_PIXEL_SAMPLES;
            this.f45241z = ColorExtractionConstants.MAX_PIXEL_SAMPLES;
            this.f45212A = ColorExtractionConstants.MAX_PIXEL_SAMPLES;
            this.f45214C = 1024L;
        }

        public final long A() {
            return this.f45214C;
        }

        public final List B() {
            return this.f45219d;
        }

        public final int C() {
            return this.f45213B;
        }

        public final List D() {
            return this.f45235t;
        }

        public final Proxy E() {
            return this.f45228m;
        }

        public final InterfaceC4621b F() {
            return this.f45230o;
        }

        public final ProxySelector G() {
            return this.f45229n;
        }

        public final int H() {
            return this.f45241z;
        }

        public final boolean I() {
            return this.f45221f;
        }

        public final jg.h J() {
            return this.f45215D;
        }

        public final SocketFactory K() {
            return this.f45231p;
        }

        public final SSLSocketFactory L() {
            return this.f45232q;
        }

        public final int M() {
            return this.f45212A;
        }

        public final X509TrustManager N() {
            return this.f45233r;
        }

        public final a O(List protocols) {
            AbstractC5504s.h(protocols, "protocols");
            List listD1 = AbstractC2279u.d1(protocols);
            EnumC4619B enumC4619B = EnumC4619B.H2_PRIOR_KNOWLEDGE;
            if (!listD1.contains(enumC4619B) && !listD1.contains(EnumC4619B.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listD1).toString());
            }
            if (listD1.contains(enumC4619B) && listD1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listD1).toString());
            }
            if (listD1.contains(EnumC4619B.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listD1).toString());
            }
            AbstractC5504s.f(listD1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listD1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listD1.remove(EnumC4619B.SPDY_3);
            if (!AbstractC5504s.c(listD1, this.f45235t)) {
                this.f45215D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listD1);
            AbstractC5504s.g(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f45235t = listUnmodifiableList;
            return this;
        }

        public final a P(long j10, TimeUnit unit) {
            AbstractC5504s.h(unit, "unit");
            this.f45241z = AbstractC4807e.k("timeout", j10, unit);
            return this;
        }

        public final a Q(long j10, TimeUnit unit) {
            AbstractC5504s.h(unit, "unit");
            this.f45212A = AbstractC4807e.k("timeout", j10, unit);
            return this;
        }

        public final a a(v interceptor) {
            AbstractC5504s.h(interceptor, "interceptor");
            this.f45218c.add(interceptor);
            return this;
        }

        public final a b(v interceptor) {
            AbstractC5504s.h(interceptor, "interceptor");
            this.f45219d.add(interceptor);
            return this;
        }

        public final C4618A c() {
            return new C4618A(this);
        }

        public final a d(C4622c c4622c) {
            this.f45226k = c4622c;
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            AbstractC5504s.h(unit, "unit");
            this.f45239x = AbstractC4807e.k("timeout", j10, unit);
            return this;
        }

        public final a f(long j10, TimeUnit unit) {
            AbstractC5504s.h(unit, "unit");
            this.f45240y = AbstractC4807e.k("timeout", j10, unit);
            return this;
        }

        public final a g(n cookieJar) {
            AbstractC5504s.h(cookieJar, "cookieJar");
            this.f45225j = cookieJar;
            return this;
        }

        public final a h(r eventListener) {
            AbstractC5504s.h(eventListener, "eventListener");
            this.f45220e = AbstractC4807e.g(eventListener);
            return this;
        }

        public final a i(boolean z10) {
            this.f45223h = z10;
            return this;
        }

        public final a j(boolean z10) {
            this.f45224i = z10;
            return this;
        }

        public final InterfaceC4621b k() {
            return this.f45222g;
        }

        public final C4622c l() {
            return this.f45226k;
        }

        public final int m() {
            return this.f45239x;
        }

        public final rg.c n() {
            return this.f45238w;
        }

        public final C4626g o() {
            return this.f45237v;
        }

        public final int p() {
            return this.f45240y;
        }

        public final k q() {
            return this.f45217b;
        }

        public final List r() {
            return this.f45234s;
        }

        public final n s() {
            return this.f45225j;
        }

        public final p t() {
            return this.f45216a;
        }

        public final q u() {
            return this.f45227l;
        }

        public final r.c v() {
            return this.f45220e;
        }

        public final boolean w() {
            return this.f45223h;
        }

        public final boolean x() {
            return this.f45224i;
        }

        public final HostnameVerifier y() {
            return this.f45236u;
        }

        public final List z() {
            return this.f45218c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C4618A okHttpClient) {
            this();
            AbstractC5504s.h(okHttpClient, "okHttpClient");
            this.f45216a = okHttpClient.t();
            this.f45217b = okHttpClient.q();
            AbstractC2279u.D(this.f45218c, okHttpClient.C());
            AbstractC2279u.D(this.f45219d, okHttpClient.E());
            this.f45220e = okHttpClient.v();
            this.f45221f = okHttpClient.N();
            this.f45222g = okHttpClient.i();
            this.f45223h = okHttpClient.x();
            this.f45224i = okHttpClient.y();
            this.f45225j = okHttpClient.s();
            this.f45226k = okHttpClient.j();
            this.f45227l = okHttpClient.u();
            this.f45228m = okHttpClient.J();
            this.f45229n = okHttpClient.L();
            this.f45230o = okHttpClient.K();
            this.f45231p = okHttpClient.O();
            this.f45232q = okHttpClient.f45202q;
            this.f45233r = okHttpClient.S();
            this.f45234s = okHttpClient.r();
            this.f45235t = okHttpClient.I();
            this.f45236u = okHttpClient.B();
            this.f45237v = okHttpClient.n();
            this.f45238w = okHttpClient.m();
            this.f45239x = okHttpClient.k();
            this.f45240y = okHttpClient.p();
            this.f45241z = okHttpClient.M();
            this.f45212A = okHttpClient.R();
            this.f45213B = okHttpClient.H();
            this.f45214C = okHttpClient.D();
            this.f45215D = okHttpClient.A();
        }
    }

    public C4618A() {
        this(new a());
    }
}
