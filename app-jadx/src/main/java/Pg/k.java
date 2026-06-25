package pg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og.C5900d;
import org.conscrypt.Conscrypt;
import pg.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f56096a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l.a f56097b = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements l.a {
        a() {
        }

        @Override // pg.l.a
        public boolean a(SSLSocket sslSocket) {
            AbstractC5504s.h(sslSocket, "sslSocket");
            return C5900d.f55565e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // pg.l.a
        public m b(SSLSocket sslSocket) {
            AbstractC5504s.h(sslSocket, "sslSocket");
            return new k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return k.f56097b;
        }

        private b() {
        }
    }

    @Override // pg.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // pg.m
    public boolean b() {
        return C5900d.f55565e.c();
    }

    @Override // pg.m
    public String c(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // pg.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) og.j.f55583a.b(protocols).toArray(new String[0]));
        }
    }
}
