package pg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og.C5899c;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import pg.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f56090a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l.a f56091b = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements l.a {
        a() {
        }

        @Override // pg.l.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC5504s.h(sslSocket, "sslSocket");
            C5899c.f55562e.b();
            return false;
        }

        @Override // pg.l.a
        public m b(SSLSocket sslSocket) {
            AbstractC5504s.h(sslSocket, "sslSocket");
            return new i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return i.f56091b;
        }

        private b() {
        }
    }

    @Override // pg.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return false;
    }

    @Override // pg.m
    public boolean b() {
        return C5899c.f55562e.b();
    }

    @Override // pg.m
    public String c(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC5504s.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // pg.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) og.j.f55583a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
