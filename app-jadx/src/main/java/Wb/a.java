package Wb;

import Gf.AbstractC1617k;
import Gf.C1627p;
import Gf.C1639v0;
import Gf.InterfaceC1623n;
import Gf.O;
import Td.L;
import Td.u;
import Td.v;
import ae.AbstractC2605b;
import android.content.Intent;
import ic.InterfaceC5068b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Wb.c, Vb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f20792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f20793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vb.d f20794c;

    /* JADX INFO: renamed from: Wb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0365a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20797c;

        /* JADX INFO: renamed from: Wb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0366a implements Vb.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1623n f20799a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Vb.a f20800b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f20801c;

            public C0366a(InterfaceC1623n interfaceC1623n, Vb.a aVar, a aVar2) {
                this.f20799a = interfaceC1623n;
                this.f20800b = aVar;
                this.f20801c = aVar2;
            }

            @Override // Vb.e
            public void a(androidx.appcompat.app.c activity) {
                Object objB;
                AbstractC5504s.h(activity, "activity");
                if (this.f20799a.b()) {
                    this.f20800b.b(this);
                    InterfaceC1623n interfaceC1623n = this.f20799a;
                    try {
                        u.a aVar = u.f17466b;
                        this.f20801c.f20792a.p(activity);
                        objB = u.b(L.f17438a);
                    } catch (Throwable th2) {
                        u.a aVar2 = u.f17466b;
                        objB = u.b(v.a(th2));
                    }
                    interfaceC1623n.resumeWith(objB);
                }
            }
        }

        /* JADX INFO: renamed from: Wb.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Vb.a f20802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0366a f20803b;

            public b(Vb.a aVar, C0366a c0366a) {
                this.f20802a = aVar;
                this.f20803b = c0366a;
            }

            public final void a(Throwable th2) {
                this.f20802a.b(this.f20803b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return L.f17438a;
            }
        }

        C0365a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new C0365a(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0365a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f20797c;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                this.f20795a = aVar;
                this.f20796b = aVar;
                this.f20797c = 1;
                C1627p c1627p = new C1627p(AbstractC2605b.c(this), 1);
                c1627p.C();
                C0366a c0366a = new C0366a(c1627p, aVar, aVar);
                aVar.a(c0366a);
                c1627p.p(new b(aVar, c0366a));
                Object objV = c1627p.v();
                if (objV == AbstractC2605b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Vb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f20804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vb.a f20805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f20806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f20807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f20808e;

        public b(InterfaceC1623n interfaceC1623n, Vb.a aVar, a aVar2, d dVar, e eVar) {
            this.f20804a = interfaceC1623n;
            this.f20805b = aVar;
            this.f20806c = aVar2;
            this.f20807d = dVar;
            this.f20808e = eVar;
        }

        @Override // Vb.e
        public void a(androidx.appcompat.app.c activity) {
            Object objB;
            AbstractC5504s.h(activity, "activity");
            if (this.f20804a.b()) {
                this.f20805b.b(this);
                InterfaceC1623n interfaceC1623n = this.f20804a;
                try {
                    u.a aVar = u.f17466b;
                    objB = u.b(this.f20806c.f20792a.n("AppContext_rq#" + this.f20806c.f20793b.getAndIncrement(), activity, this.f20807d, this.f20808e));
                } catch (Throwable th2) {
                    u.a aVar2 = u.f17466b;
                    objB = u.b(v.a(th2));
                }
                interfaceC1623n.resumeWith(objB);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Vb.a f20809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f20810b;

        public c(Vb.a aVar, b bVar) {
            this.f20809a = aVar;
            this.f20810b = bVar;
        }

        public final void a(Throwable th2) {
            this.f20809a.b(this.f20810b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L.f17438a;
        }
    }

    public a(InterfaceC5068b currentActivityProvider) {
        AbstractC5504s.h(currentActivityProvider, "currentActivityProvider");
        this.f20792a = new i(currentActivityProvider);
        this.f20793b = new AtomicInteger();
        this.f20794c = new Vb.d();
        AbstractC1617k.d(C1639v0.f7613a, null, null, new C0365a(null), 3, null);
    }

    @Override // Vb.a
    public void a(Vb.e listener) {
        AbstractC5504s.h(listener, "listener");
        this.f20794c.a(listener);
    }

    @Override // Vb.a
    public void b(Vb.e listener) {
        AbstractC5504s.h(listener, "listener");
        this.f20794c.b(listener);
    }

    @Override // Wb.c
    public Object c(d dVar, e eVar, Zd.e eVar2) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar2), 1);
        c1627p.C();
        b bVar = new b(c1627p, this, this, dVar, eVar);
        a(bVar);
        c1627p.p(new c(this, bVar));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar2);
        }
        return objV;
    }

    public final void f(int i10, int i11, Intent intent) {
        this.f20792a.g(i10, i11, intent);
    }

    public final void g(androidx.appcompat.app.c activity) {
        AbstractC5504s.h(activity, "activity");
        this.f20792a.m(activity);
    }

    public final void h(androidx.appcompat.app.c activity) {
        AbstractC5504s.h(activity, "activity");
        this.f20794c.f(activity);
    }
}
