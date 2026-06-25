package pg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f56098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f56099b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a socketAdapterFactory) {
        AbstractC5504s.h(socketAdapterFactory, "socketAdapterFactory");
        this.f56098a = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f56099b == null && this.f56098a.a(sSLSocket)) {
                this.f56099b = this.f56098a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56099b;
    }

    @Override // pg.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return this.f56098a.a(sslSocket);
    }

    @Override // pg.m
    public boolean b() {
        return true;
    }

    @Override // pg.m
    public String c(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            return mVarE.c(sslSocket);
        }
        return null;
    }

    @Override // pg.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            mVarE.d(sslSocket, str, protocols);
        }
    }
}
