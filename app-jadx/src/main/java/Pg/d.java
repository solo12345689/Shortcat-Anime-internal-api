package pg;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends rg.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56075d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManager f56076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f56077c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            AbstractC5504s.h(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        AbstractC5504s.h(trustManager, "trustManager");
        AbstractC5504s.h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f56076b = trustManager;
        this.f56077c = x509TrustManagerExtensions;
    }

    @Override // rg.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC5504s.h(chain, "chain");
        AbstractC5504s.h(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f56077c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            AbstractC5504s.g(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f56076b == this.f56076b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f56076b);
    }
}
