package og;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f55569i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f55570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f55571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f55572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f55573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f55574h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f55575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f55577c;

        public a(List protocols) {
            AbstractC5504s.h(protocols, "protocols");
            this.f55575a = protocols;
        }

        public final String a() {
            return this.f55577c;
        }

        public final boolean b() {
            return this.f55576b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC5504s.h(proxy, "proxy");
            AbstractC5504s.h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC5504s.c(name, "supports") && AbstractC5504s.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC5504s.c(name, "unsupported") && AbstractC5504s.c(Void.TYPE, returnType)) {
                this.f55576b = true;
                return null;
            }
            if (AbstractC5504s.c(name, "protocols") && objArr.length == 0) {
                return this.f55575a;
            }
            if ((AbstractC5504s.c(name, "selectProtocol") || AbstractC5504s.c(name, "select")) && AbstractC5504s.c(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f55575a.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f55577c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f55575a.get(0);
                    this.f55577c = str2;
                    return str2;
                }
            }
            if ((!AbstractC5504s.c(name, "protocolSelected") && !AbstractC5504s.c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f55577c = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC5504s.g(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod(com.amazon.a.a.o.b.au, SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                AbstractC5504s.g(putMethod, "putMethod");
                AbstractC5504s.g(getMethod, "getMethod");
                AbstractC5504s.g(removeMethod, "removeMethod");
                AbstractC5504s.g(clientProviderClass, "clientProviderClass");
                AbstractC5504s.g(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        AbstractC5504s.h(putMethod, "putMethod");
        AbstractC5504s.h(getMethod, "getMethod");
        AbstractC5504s.h(removeMethod, "removeMethod");
        AbstractC5504s.h(clientProviderClass, "clientProviderClass");
        AbstractC5504s.h(serverProviderClass, "serverProviderClass");
        this.f55570d = putMethod;
        this.f55571e = getMethod;
        this.f55572f = removeMethod;
        this.f55573g = clientProviderClass;
        this.f55574h = serverProviderClass;
    }

    @Override // og.j
    public void b(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        try {
            this.f55572f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // og.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        AbstractC5504s.h(protocols, "protocols");
        try {
            this.f55570d.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f55573g, this.f55574h}, new a(j.f55583a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // og.j
    public String h(SSLSocket sslSocket) {
        AbstractC5504s.h(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f55571e.invoke(null, sslSocket));
            AbstractC5504s.f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
