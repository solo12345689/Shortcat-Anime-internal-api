package og;

import Ud.AbstractC2279u;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.k;
import pg.l;
import pg.m;

/* JADX INFO: renamed from: og.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5897a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0851a f55553e = new C0851a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f55554f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f55555d;

    /* JADX INFO: renamed from: og.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0851a {
        public /* synthetic */ C0851a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            if (b()) {
                return new C5897a();
            }
            return null;
        }

        public final boolean b() {
            return C5897a.f55554f;
        }

        private C0851a() {
        }
    }

    static {
        f55554f = j.f55583a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public C5897a() {
        List listR = AbstractC2279u.r(pg.c.f56074a.a(), new l(pg.h.f56082f.d()), new l(k.f56096a.a()), new l(pg.i.f56090a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f55555d = arrayList;
    }

    @Override // og.j
    public rg.c c(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        pg.d dVarA = pg.d.f56075d.a(trustManager);
        return dVarA != null ? dVarA : super.c(trustManager);
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        Iterator it = this.f55555d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((m) next).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC5504s.h(sslSocket, "sslSocket");
        Iterator it = this.f55555d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((m) next).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            return mVar.c(sslSocket);
        }
        return null;
    }

    @Override // og.j
    public boolean j(String hostname) {
        AbstractC5504s.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
