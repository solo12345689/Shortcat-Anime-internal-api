package og;

import Ud.AbstractC2279u;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
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
import pg.n;

/* JADX INFO: renamed from: og.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5898b extends j {

    /* JADX INFO: renamed from: f */
    public static final a f55556f = new a(null);

    /* JADX INFO: renamed from: g */
    private static final boolean f55557g;

    /* JADX INFO: renamed from: d */
    private final List f55558d;

    /* JADX INFO: renamed from: e */
    private final pg.j f55559e;

    /* JADX INFO: renamed from: og.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            if (b()) {
                return new C5898b();
            }
            return null;
        }

        public final boolean b() {
            return C5898b.f55557g;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: og.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0852b implements rg.e {

        /* JADX INFO: renamed from: a */
        private final X509TrustManager f55560a;

        /* JADX INFO: renamed from: b */
        private final Method f55561b;

        public C0852b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC5504s.h(trustManager, "trustManager");
            AbstractC5504s.h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f55560a = trustManager;
            this.f55561b = findByIssuerAndSignatureMethod;
        }

        @Override // rg.e
        public X509Certificate a(X509Certificate cert) {
            AbstractC5504s.h(cert, "cert");
            try {
                Object objInvoke = this.f55561b.invoke(this.f55560a, cert);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0852b)) {
                return false;
            }
            C0852b c0852b = (C0852b) obj;
            return AbstractC5504s.c(this.f55560a, c0852b.f55560a) && AbstractC5504s.c(this.f55561b, c0852b.f55561b);
        }

        public int hashCode() {
            return (this.f55560a.hashCode() * 31) + this.f55561b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f55560a + ", findByIssuerAndSignatureMethod=" + this.f55561b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (j.f55583a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f55557g = z10;
    }

    public C5898b() {
        List listR = AbstractC2279u.r(n.a.b(n.f56100j, null, 1, null), new l(pg.h.f56082f.d()), new l(k.f56096a.a()), new l(pg.i.f56090a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f55558d = arrayList;
        this.f55559e = pg.j.f56092d.a();
    }

    @Override // og.j
    public rg.c c(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        pg.d dVarA = pg.d.f56075d.a(trustManager);
        return dVarA != null ? dVarA : super.c(trustManager);
    }

    @Override // og.j
    public rg.e d(X509TrustManager trustManager) {
        AbstractC5504s.h(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            AbstractC5504s.g(method, "method");
            return new C0852b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        Iterator it = this.f55558d.iterator();
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
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC5504s.h(socket, "socket");
        AbstractC5504s.h(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        Object next;
        AbstractC5504s.h(sslSocket, "sslSocket");
        Iterator it = this.f55558d.iterator();
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
    public Object i(String closer) {
        AbstractC5504s.h(closer, "closer");
        return this.f55559e.a(closer);
    }

    @Override // og.j
    public boolean j(String hostname) {
        AbstractC5504s.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // og.j
    public void m(String message, Object obj) {
        AbstractC5504s.h(message, "message");
        if (this.f55559e.b(obj)) {
            return;
        }
        j.l(this, message, 5, null, 4, null);
    }
}
