package pg;

import Df.C1271d;
import Df.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og.C5898b;
import pg.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class h implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f56082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l.a f56083g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f56084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f56085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f56086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f56087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f56088e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: pg.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0862a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f56089a;

            C0862a(String str) {
                this.f56089a = str;
            }

            @Override // pg.l.a
            public boolean a(SSLSocket sslSocket) {
                AbstractC5504s.h(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                AbstractC5504s.g(name, "sslSocket.javaClass.name");
                return r.Q(name, this.f56089a + com.amazon.a.a.o.c.a.b.f34706a, false, 2, null);
            }

            @Override // pg.l.a
            public m b(SSLSocket sslSocket) {
                AbstractC5504s.h(sslSocket, "sslSocket");
                return h.f56082f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC5504s.c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC5504s.e(superclass);
            return new h(superclass);
        }

        public final l.a c(String packageName) {
            AbstractC5504s.h(packageName, "packageName");
            return new C0862a(packageName);
        }

        public final l.a d() {
            return h.f56083g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f56082f = aVar;
        f56083g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class sslSocketClass) throws NoSuchMethodException {
        AbstractC5504s.h(sslSocketClass, "sslSocketClass");
        this.f56084a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC5504s.g(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f56085b = declaredMethod;
        this.f56086c = sslSocketClass.getMethod("setHostname", String.class);
        this.f56087d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f56088e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // pg.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        return this.f56084a.isInstance(sslSocket);
    }

    @Override // pg.m
    public boolean b() {
        return C5898b.f55556f.b();
    }

    @Override // pg.m
    public String c(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f56087d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, C1271d.f3718b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC5504s.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // pg.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f56085b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f56086c.invoke(sslSocket, str);
                }
                this.f56088e.invoke(sslSocket, og.j.f55583a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
