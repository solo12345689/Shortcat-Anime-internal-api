package og;

import Df.r;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class h extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55578d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f55579e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f55579e;
        }

        private a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numR = property != null ? r.r(property) : null;
        boolean z10 = false;
        if (numR == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numR.intValue() >= 9) {
            z10 = true;
        }
        f55579e = z10;
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) j.f55583a.b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : AbstractC5504s.c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
