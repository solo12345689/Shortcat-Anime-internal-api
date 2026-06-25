package pg;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends h {

    /* JADX INFO: renamed from: j */
    public static final a f56100j = new a(null);

    /* JADX INFO: renamed from: h */
    private final Class f56101h;

    /* JADX INFO: renamed from: i */
    private final Class f56102i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String packageName) {
            AbstractC5504s.h(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                AbstractC5504s.f(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                AbstractC5504s.f(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC5504s.g(paramsClass, "paramsClass");
                return new n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                og.j.f55583a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC5504s.h(sslSocketClass, "sslSocketClass");
        AbstractC5504s.h(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC5504s.h(paramClass, "paramClass");
        this.f56101h = sslSocketFactoryClass;
        this.f56102i = paramClass;
    }
}
