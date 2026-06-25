package se;

import Ee.AbstractC1527f;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import We.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: se.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6503n {

    /* JADX INFO: renamed from: se.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6503n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f59530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f59531b;

        /* JADX INFO: renamed from: se.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0899a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Xd.a.d(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) {
            super(null);
            AbstractC5504s.h(jClass, "jClass");
            this.f59530a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            AbstractC5504s.g(declaredMethods, "getDeclaredMethods(...)");
            this.f59531b = AbstractC2273n.K0(declaredMethods, new C0899a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            AbstractC5504s.g(returnType, "getReturnType(...)");
            return AbstractC1527f.f(returnType);
        }

        @Override // se.AbstractC6503n
        public String a() {
            return AbstractC2279u.w0(this.f59531b, "", "<init>(", ")V", 0, null, C6501m.f59527a, 24, null);
        }

        public final List d() {
            return this.f59531b;
        }
    }

    /* JADX INFO: renamed from: se.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6503n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Constructor f59532a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            AbstractC5504s.h(constructor, "constructor");
            this.f59532a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            AbstractC5504s.e(cls);
            return AbstractC1527f.f(cls);
        }

        @Override // se.AbstractC6503n
        public String a() {
            Class<?>[] parameterTypes = this.f59532a.getParameterTypes();
            AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
            return AbstractC2273n.y0(parameterTypes, "", "<init>(", ")V", 0, null, C6505o.f59539a, 24, null);
        }

        public final Constructor d() {
            return this.f59532a;
        }
    }

    /* JADX INFO: renamed from: se.n$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6503n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f59533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            AbstractC5504s.h(method, "method");
            this.f59533a = method;
        }

        @Override // se.AbstractC6503n
        public String a() {
            return h1.d(this.f59533a);
        }

        public final Method b() {
            return this.f59533a;
        }
    }

    /* JADX INFO: renamed from: se.n$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC6503n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f59534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f59535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d.b signature) {
            super(null);
            AbstractC5504s.h(signature, "signature");
            this.f59534a = signature;
            this.f59535b = signature.a();
        }

        @Override // se.AbstractC6503n
        public String a() {
            return this.f59535b;
        }

        public final String b() {
            return this.f59534a.d();
        }
    }

    /* JADX INFO: renamed from: se.n$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC6503n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d.b f59536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f59537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d.b signature) {
            super(null);
            AbstractC5504s.h(signature, "signature");
            this.f59536a = signature;
            this.f59537b = signature.a();
        }

        @Override // se.AbstractC6503n
        public String a() {
            return this.f59537b;
        }

        public final String b() {
            return this.f59536a.d();
        }

        public final String c() {
            return this.f59536a.e();
        }
    }

    public /* synthetic */ AbstractC6503n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC6503n() {
    }
}
