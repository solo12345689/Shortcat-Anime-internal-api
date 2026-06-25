package te;

import Td.L;
import Ud.AbstractC2273n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.T;
import te.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i implements te.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f60926e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Member f60927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f60928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f60929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f60930d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends i implements te.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f60931f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            AbstractC5504s.h(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC5504s.g(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC2273n.t(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f60931f = obj;
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(3);
            t10.a(this.f60931f);
            t10.b(args);
            t10.a(null);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            AbstractC5504s.h(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC5504s.g(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC2273n.t(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(2);
            t10.b(args);
            t10.a(null);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends i implements te.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f60932f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            AbstractC5504s.h(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC5504s.g(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f60932f = obj;
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            d(args);
            Constructor constructor = (Constructor) b();
            T t10 = new T(2);
            t10.a(this.f60932f);
            t10.b(args);
            return constructor.newInstance(t10.d(new Object[t10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            AbstractC5504s.h(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC5504s.g(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            d(args);
            return ((Constructor) b()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f extends i {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends f implements te.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Object f60933f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                AbstractC5504s.h(field, "field");
                this.f60933f = obj;
            }

            @Override // te.i.f, te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                return ((Field) b()).get(this.f60933f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends f implements te.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                AbstractC5504s.h(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                AbstractC5504s.h(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                AbstractC5504s.h(field, "field");
            }

            @Override // te.i
            public void d(Object[] args) {
                AbstractC5504s.h(args, "args");
                super.d(args);
                e(AbstractC2273n.Y(args));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                AbstractC5504s.h(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            d(args);
            return ((Field) b()).get(f() != null ? AbstractC2273n.X(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            AbstractC5504s.g(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class g extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f60934f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends g implements te.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f60935g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                AbstractC5504s.h(field, "field");
                this.f60935g = obj;
            }

            @Override // te.i.g, te.h
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC5504s.h(args, "args");
                d(args);
                ((Field) b()).set(this.f60935g, AbstractC2273n.X(args));
                return L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends g implements te.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC5504s.h(field, "field");
            }

            @Override // te.i.g, te.h
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC5504s.h(args, "args");
                d(args);
                ((Field) b()).set(null, AbstractC2273n.z0(args));
                return L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC5504s.h(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC5504s.h(field, "field");
            }

            @Override // te.i.g, te.i
            public void d(Object[] args) {
                AbstractC5504s.h(args, "args");
                super.d(args);
                e(AbstractC2273n.Y(args));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC5504s.h(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        @Override // te.h
        public Object call(Object[] args) throws IllegalAccessException {
            AbstractC5504s.h(args, "args");
            d(args);
            ((Field) b()).set(f() != null ? AbstractC2273n.X(args) : null, AbstractC2273n.z0(args));
            return L.f17438a;
        }

        @Override // te.i
        public void d(Object[] args) {
            AbstractC5504s.h(args, "args");
            super.d(args);
            if (this.f60934f && AbstractC2273n.z0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            AbstractC5504s.g(TYPE, "TYPE");
            super(field, TYPE, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f60934f = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class h extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f60936f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends h implements te.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f60937g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                AbstractC5504s.h(method, "method");
                this.f60937g = obj;
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                return g(this.f60937g, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends h implements te.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                AbstractC5504s.h(method, "method");
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                return g(null, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends h implements te.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final boolean f60938g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Object f60939h;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z10, Object obj) {
                AbstractC5504s.h(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC2273n.t(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f60938g = z10;
                this.f60939h = obj;
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                T t10 = new T(2);
                t10.a(this.f60939h);
                t10.b(args);
                return g(null, t10.d(new Object[t10.c()]));
            }

            public final Object h() {
                return this.f60939h;
            }

            public final boolean i() {
                return this.f60938g;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends h implements te.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object[] f60940g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] boundReceiverComponents) {
                AbstractC5504s.h(method, "method");
                AbstractC5504s.h(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) AbstractC2273n.T(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.f60940g = boundReceiverComponents;
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                T t10 = new T(2);
                t10.b(this.f60940g);
                t10.b(args);
                return g(null, t10.d(new Object[t10.c()]));
            }

            public final Object[] h() {
                return this.f60940g;
            }

            public final int i() {
                return this.f60940g.length;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                AbstractC5504s.h(method, "method");
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                return g(args[0], args.length <= 1 ? new Object[0] : AbstractC2273n.t(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                AbstractC5504s.h(method, "method");
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                e(AbstractC2273n.Y(args));
                return g(null, args.length <= 1 ? new Object[0] : AbstractC2273n.t(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                AbstractC5504s.h(method, "method");
            }

            @Override // te.h
            public Object call(Object[] args) {
                AbstractC5504s.h(args, "args");
                d(args);
                return g(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        protected final Object g(Object obj, Object[] args) {
            AbstractC5504s.h(args, "args");
            return this.f60936f ? L.f17438a : ((Method) b()).invoke(obj, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            AbstractC5504s.g(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f60936f = AbstractC5504s.c(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // te.h
    public List a() {
        return this.f60930d;
    }

    @Override // te.h
    public final Member b() {
        return this.f60927a;
    }

    @Override // te.h
    public boolean c() {
        return h.a.b(this);
    }

    public void d(Object[] objArr) {
        h.a.a(this, objArr);
    }

    protected final void e(Object obj) {
        if (obj == null || !this.f60927a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class f() {
        return this.f60929c;
    }

    @Override // te.h
    public final Type getReturnType() {
        return this.f60928b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f60927a = r1
            r0.f60928b = r2
            r0.f60929c = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = Ud.AbstractC2279u.p(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = Ud.AbstractC2273n.V0(r4)
        L2b:
            r0.f60930d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
