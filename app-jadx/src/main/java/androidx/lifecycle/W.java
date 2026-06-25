package androidx.lifecycle;

import android.app.Application;
import he.AbstractC4945a;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.AbstractC5628a;
import m2.C5631d;
import o2.C5806e;
import o2.C5809h;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: b */
    public static final b f30207b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final AbstractC5628a.c f30208c;

    /* JADX INFO: renamed from: a */
    private final C5631d f30209a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ W c(b bVar, Y y10, c cVar, AbstractC5628a abstractC5628a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = C5809h.f54235a.b(y10);
            }
            if ((i10 & 4) != 0) {
                abstractC5628a = C5809h.f54235a.a(y10);
            }
            return bVar.b(y10, cVar, abstractC5628a);
        }

        public final W a(X store, c factory, AbstractC5628a extras) {
            AbstractC5504s.h(store, "store");
            AbstractC5504s.h(factory, "factory");
            AbstractC5504s.h(extras, "extras");
            return new W(store, factory, extras);
        }

        public final W b(Y owner, c factory, AbstractC5628a extras) {
            AbstractC5504s.h(owner, "owner");
            AbstractC5504s.h(factory, "factory");
            AbstractC5504s.h(extras, "extras");
            return new W(owner.getViewModelStore(), factory, extras);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final a f30214a = a.f30215a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            static final /* synthetic */ a f30215a = new a();

            private a() {
            }
        }

        default U create(Class modelClass) {
            AbstractC5504s.h(modelClass, "modelClass");
            return C5809h.f54235a.d();
        }

        default U create(Class modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            return create(modelClass);
        }

        default U create(InterfaceC6014d modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            return create(AbstractC4945a.b(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d implements c {
        public static final a Companion = new a(null);
        public static final AbstractC5628a.c VIEW_MODEL_KEY = W.f30208c;
        private static d _instance;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d._instance == null) {
                    d._instance = new d();
                }
                d dVar = d._instance;
                AbstractC5504s.e(dVar);
                return dVar;
            }

            private a() {
            }
        }

        public static final d getInstance() {
            return Companion.a();
        }

        @Override // androidx.lifecycle.W.c
        public U create(Class modelClass) {
            AbstractC5504s.h(modelClass, "modelClass");
            return C5806e.f54230a.a(modelClass);
        }

        @Override // androidx.lifecycle.W.c
        public <T extends U> T create(Class<T> modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.W.c
        public <T extends U> T create(InterfaceC6014d modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            return (T) create(AbstractC4945a.b(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e {
        public abstract void a(U u10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements AbstractC5628a.c {
    }

    static {
        AbstractC5628a.C0826a c0826a = AbstractC5628a.f53047b;
        f30208c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(X store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(factory, "factory");
    }

    public U a(Class modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        return c(AbstractC4945a.e(modelClass));
    }

    public final U b(String key, InterfaceC6014d modelClass) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(modelClass, "modelClass");
        return this.f30209a.d(modelClass, key);
    }

    public final U c(InterfaceC6014d modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        return C5631d.e(this.f30209a, modelClass, null, 2, null);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends d {

        /* JADX INFO: renamed from: c */
        public static final C0516a f30210c = new C0516a(null);

        /* JADX INFO: renamed from: d */
        private static a f30211d;

        /* JADX INFO: renamed from: e */
        public static final AbstractC5628a.c f30212e;

        /* JADX INFO: renamed from: b */
        private final Application f30213b;

        /* JADX INFO: renamed from: androidx.lifecycle.W$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0516a {
            public /* synthetic */ C0516a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                AbstractC5504s.h(application, "application");
                if (a.f30211d == null) {
                    a.f30211d = new a(application);
                }
                a aVar = a.f30211d;
                AbstractC5504s.e(aVar);
                return aVar;
            }

            private C0516a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements AbstractC5628a.c {
        }

        static {
            AbstractC5628a.C0826a c0826a = AbstractC5628a.f53047b;
            f30212e = new b();
        }

        private a(Application application, int i10) {
            this.f30213b = application;
        }

        private final U c(Class cls, Application application) {
            if (!AbstractC2847a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                U u10 = (U) cls.getConstructor(Application.class).newInstance(application);
                AbstractC5504s.e(u10);
                return u10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.W.d, androidx.lifecycle.W.c
        public U create(Class modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            if (this.f30213b != null) {
                return create(modelClass);
            }
            Application application = (Application) extras.a(f30212e);
            if (application != null) {
                return c(modelClass, application);
            }
            if (AbstractC2847a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC5504s.h(application, "application");
        }

        @Override // androidx.lifecycle.W.d, androidx.lifecycle.W.c
        public U create(Class modelClass) {
            AbstractC5504s.h(modelClass, "modelClass");
            Application application = this.f30213b;
            if (application != null) {
                return c(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private W(C5631d c5631d) {
        this.f30209a = c5631d;
    }

    public /* synthetic */ W(X x10, c cVar, AbstractC5628a abstractC5628a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x10, cVar, (i10 & 4) != 0 ? AbstractC5628a.b.f53049c : abstractC5628a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(X store, c factory, AbstractC5628a defaultCreationExtras) {
        this(new C5631d(store, factory, defaultCreationExtras));
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(factory, "factory");
        AbstractC5504s.h(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(Y owner) {
        AbstractC5504s.h(owner, "owner");
        X viewModelStore = owner.getViewModelStore();
        C5809h c5809h = C5809h.f54235a;
        this(viewModelStore, c5809h.b(owner), c5809h.a(owner));
    }
}
