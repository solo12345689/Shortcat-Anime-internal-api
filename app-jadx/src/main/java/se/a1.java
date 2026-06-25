package se;

import ie.InterfaceC5082a;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a1 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends b implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5082a f59467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile SoftReference f59468c;

        public a(Object obj, InterfaceC5082a interfaceC5082a) {
            if (interfaceC5082a == null) {
                e(0);
            }
            this.f59468c = null;
            this.f59467b = interfaceC5082a;
            if (obj != null) {
                this.f59468c = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // se.a1.b, ie.InterfaceC5082a
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f59468c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            Object objInvoke = this.f59467b.invoke();
            this.f59468c = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Object f59469a = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {
            a() {
            }
        }

        protected Object a(Object obj) {
            return obj == null ? f59469a : obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        protected Object c(Object obj) {
            if (obj == f59469a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            a(1);
        }
        return c(null, interfaceC5082a);
    }

    public static a c(Object obj, InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a == null) {
            a(0);
        }
        return new a(obj, interfaceC5082a);
    }
}
