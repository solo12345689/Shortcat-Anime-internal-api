package pg;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56074a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return og.j.f55583a.h() && Build.VERSION.SDK_INT >= 29;
        }

        private a() {
        }
    }

    @Override // pg.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // pg.m
    public boolean b() {
        return f56074a.b();
    }

    @Override // pg.m
    public String c(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC5504s.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // pg.m
    public void d(SSLSocket sslSocket, String str, List protocols) throws IOException {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) og.j.f55583a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
