package og;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: renamed from: og.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5900d extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f55566f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f55567d;

    /* JADX INFO: renamed from: og.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final C5900d b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (c()) {
                return new C5900d(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean c() {
            return C5900d.f55566f;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: og.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55568a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f55565e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f55566f = z10;
    }

    public /* synthetic */ C5900d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) j.f55583a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.h(sslSocket);
    }

    @Override // og.j
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f55567d);
        AbstractC5504s.g(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // og.j
    public SSLSocketFactory o(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC5504s.h(trustManager, "trustManager");
        SSLContext sSLContextN = n();
        sSLContextN.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
        AbstractC5504s.g(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // og.j
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC5504s.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC5504s.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f55568a);
                return x509TrustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC5504s.g(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    private C5900d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC5504s.g(providerNewProvider, "newProvider()");
        this.f55567d = providerNewProvider;
    }
}
