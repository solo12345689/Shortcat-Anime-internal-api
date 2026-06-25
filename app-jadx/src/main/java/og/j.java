package og;

import Ud.AbstractC2279u;
import dg.C4618A;
import dg.EnumC4619B;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rg.C6324a;
import tg.C6683h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a */
    public static final a f55583a;

    /* JADX INFO: renamed from: b */
    private static volatile j f55584b;

    /* JADX INFO: renamed from: c */
    private static final Logger f55585c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final j d() {
            pg.e.f56078a.b();
            j jVarA = C5897a.f55553e.a();
            if (jVarA != null) {
                return jVarA;
            }
            j jVarA2 = C5898b.f55556f.a();
            AbstractC5504s.e(jVarA2);
            return jVarA2;
        }

        private final j e() {
            i iVarA;
            C5899c c5899cA;
            C5900d c5900dB;
            if (j() && (c5900dB = C5900d.f55565e.b()) != null) {
                return c5900dB;
            }
            if (i() && (c5899cA = C5899c.f55562e.a()) != null) {
                return c5899cA;
            }
            if (k() && (iVarA = i.f55580e.a()) != null) {
                return iVarA;
            }
            h hVarA = h.f55578d.a();
            if (hVarA != null) {
                return hVarA;
            }
            j jVarA = e.f55569i.a();
            return jVarA != null ? jVarA : new j();
        }

        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return AbstractC5504s.c("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return AbstractC5504s.c("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return AbstractC5504s.c("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List protocols) {
            AbstractC5504s.h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC4619B) obj) != EnumC4619B.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC4619B) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            AbstractC5504s.h(protocols, "protocols");
            C6683h c6683h = new C6683h();
            for (String str : b(protocols)) {
                c6683h.writeByte(str.length());
                c6683h.s0(str);
            }
            return c6683h.e1();
        }

        public final j g() {
            return j.f55584b;
        }

        public final boolean h() {
            return AbstractC5504s.c("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f55583a = aVar;
        f55584b = aVar.f();
        f55585c = Logger.getLogger(C4618A.class.getName());
    }

    public static /* synthetic */ void l(j jVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        jVar.k(str, i10, th2);
    }

    public void b(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
    }

    public rg.c c(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        return new C6324a(d(trustManager));
    }

    public rg.e d(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC5504s.g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new rg.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC5504s.h(socket, "socket");
        AbstractC5504s.h(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        AbstractC5504s.h(closer, "closer");
        if (f55585c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        AbstractC5504s.h(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th2) {
        AbstractC5504s.h(message, "message");
        f55585c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void m(String message, Object obj) {
        AbstractC5504s.h(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC5504s.g(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            AbstractC5504s.g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC5504s.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC5504s.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC5504s.g(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC5504s.g(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
