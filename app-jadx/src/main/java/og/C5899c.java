package og;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: renamed from: og.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5899c extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f55563f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f55564d;

    /* JADX INFO: renamed from: og.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5899c a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new C5899c(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return C5899c.f55563f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f55562e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f55563f = z10;
    }

    public /* synthetic */ C5899c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return super.h(sslSocket);
    }

    @Override // og.j
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f55564d);
        AbstractC5504s.g(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // og.j
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    private C5899c() {
        this.f55564d = new BouncyCastleJsseProvider();
    }
}
