package ca;

import Gf.AbstractC1615j;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import T1.C2140d;
import T1.InterfaceC2145i;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import Ud.S;
import W1.i;
import X1.f;
import X1.g;
import X1.j;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.O;
import le.InterfaceC5592c;
import pe.InterfaceC6023m;

/* JADX INFO: renamed from: ca.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3090c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f33574f = {O.l(new H(C3090c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f33577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5592c f33578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2145i f33579e;

    /* JADX INFO: renamed from: ca.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33580a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f33582c;

        /* JADX INFO: renamed from: ca.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0570a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f33584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f33585c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0570a(Function1 function1, e eVar) {
                super(2, eVar);
                this.f33585c = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(X1.c cVar, e eVar) {
                return ((C0570a) create(cVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0570a c0570a = new C0570a(this.f33585c, eVar);
                c0570a.f33584b = obj;
                return c0570a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f33583a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f33585c.invoke((X1.c) this.f33584b);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, e eVar) {
            super(2, eVar);
            this.f33582c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C3090c.this.new a(this.f33582c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f33580a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    if (AbstractC5504s.c(C3090c.this.f33577c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    C3090c.this.f33577c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC2145i interfaceC2145i = C3090c.this.f33579e;
                    C0570a c0570a = new C0570a(this.f33582c, null);
                    this.f33580a = 1;
                    obj = j.a(interfaceC2145i, c0570a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return (f) obj;
            } finally {
                C3090c.this.f33577c.set(kotlin.coroutines.jvm.internal.b.a(false));
            }
        }
    }

    /* JADX INFO: renamed from: ca.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33586a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C3090c.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map mapA;
            Object objF = AbstractC2605b.f();
            int i10 = this.f33586a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1742e interfaceC1742eE = C3090c.this.f33579e.e();
                this.f33586a = 1;
                obj = AbstractC1744g.p(interfaceC1742eE, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? S.i() : mapA;
        }
    }

    /* JADX INFO: renamed from: ca.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0571c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33588a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f33590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f33591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0571c(f.a aVar, Object obj, e eVar) {
            super(2, eVar);
            this.f33590c = aVar;
            this.f33591d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C3090c.this.new C0571c(this.f33590c, this.f33591d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((C0571c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = AbstractC2605b.f();
            int i10 = this.f33588a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1742e interfaceC1742eE = C3090c.this.f33579e.e();
                this.f33588a = 1;
                obj = AbstractC1744g.p(interfaceC1742eE, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objB = fVar.b(this.f33590c)) == null) ? this.f33591d : objB;
        }
    }

    /* JADX INFO: renamed from: ca.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33592a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f33594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f33595d;

        /* JADX INFO: renamed from: ca.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f33597b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f33598c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f33599d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, Object obj, e eVar) {
                super(2, eVar);
                this.f33598c = aVar;
                this.f33599d = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(X1.c cVar, e eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                a aVar = new a(this.f33598c, this.f33599d, eVar);
                aVar.f33597b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f33596a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                ((X1.c) this.f33597b).i(this.f33598c, this.f33599d);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a aVar, Object obj, e eVar) {
            super(2, eVar);
            this.f33594c = aVar;
            this.f33595d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C3090c.this.new d(this.f33594c, this.f33595d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f33592a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            InterfaceC2145i interfaceC2145i = C3090c.this.f33579e;
            a aVar = new a(this.f33594c, this.f33595d, null);
            this.f33592a = 1;
            Object objA = j.a(interfaceC2145i, aVar, this);
            return objA == objF ? objF : objA;
        }
    }

    public C3090c(Context context, String name) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        this.f33575a = context;
        this.f33576b = name;
        this.f33577c = new ThreadLocal();
        this.f33578d = W1.a.b(name, new U1.b(new Function1() { // from class: ca.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3090c.e(this.f33572a, (C2140d) obj);
            }
        }), new Function1() { // from class: ca.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3090c.f(this.f33573a, (Context) obj);
            }
        }, null, 8, null);
        this.f33579e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(C3090c c3090c, C2140d ex) {
        AbstractC5504s.h(ex, "ex");
        Log.w(O.b(C3090c.class).v(), "CorruptionException in " + c3090c.f33576b + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(C3090c c3090c, Context it) {
        AbstractC5504s.h(it, "it");
        return AbstractC2279u.e(i.b(it, c3090c.f33576b, null, 4, null));
    }

    private final InterfaceC2145i i(Context context) {
        return (InterfaceC2145i) this.f33578d.a(context, f33574f[0]);
    }

    public final f g(Function1 transform) {
        AbstractC5504s.h(transform, "transform");
        return (f) AbstractC1615j.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) AbstractC1615j.b(null, new b(null), 1, null);
    }

    public final Object j(f.a key, Object obj) {
        AbstractC5504s.h(key, "key");
        return AbstractC1615j.b(null, new C0571c(key, obj, null), 1, null);
    }

    public final f k(f.a key, Object obj) {
        AbstractC5504s.h(key, "key");
        return (f) AbstractC1615j.b(null, new d(key, obj, null), 1, null);
    }
}
