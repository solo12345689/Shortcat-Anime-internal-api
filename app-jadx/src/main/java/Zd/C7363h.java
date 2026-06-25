package zd;

import Cd.e;
import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.r;
import Td.z;
import Ud.S;
import ae.AbstractC2605b;
import android.content.Context;
import expo.modules.updates.d;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pd.C5998c;
import rd.C6306a;
import td.C6664c;
import td.InterfaceC6665d;
import vd.C6862c;
import vd.InterfaceC6861b;
import wd.i;
import wd.o;
import wd.s;
import wd.u;
import wd.v;
import wd.w;
import xd.C7136g;
import xd.EnumC7131b;
import yd.n;
import yd.q;
import zd.AbstractC7365j;
import zd.C7363h;

/* JADX INFO: renamed from: zd.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7363h extends AbstractC7365j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f66142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5998c f66143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f66144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wd.g f66145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bd.h f66146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C7136g f66147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f66148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f66149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f66150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC7365j.a f66151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC6861b f66152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Exception f66153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C6664c f66154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC6665d.a f66155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o f66156p;

    /* JADX INFO: renamed from: zd.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();

        void b(boolean z10, InterfaceC6861b.a aVar);
    }

    /* JADX INFO: renamed from: zd.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6665d {

        /* JADX INFO: renamed from: zd.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f66158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f66159b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7363h f66160c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, C7363h c7363h, Zd.e eVar) {
                super(2, eVar);
                this.f66159b = sVar;
                this.f66160c = c7363h;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i.e i(C7363h c7363h, v vVar) {
                q qVarA;
                w.a aVarA = vVar.a();
                u uVarA = aVarA != null ? aVarA.a() : null;
                if (uVarA != null) {
                    if ((uVarA instanceof u.c) || (uVarA instanceof u.b)) {
                        return new i.e(false);
                    }
                    throw new r();
                }
                w.b bVarB = vVar.b();
                if (bVarB == null || (qVarA = bVarB.a()) == null) {
                    return new i.e(false);
                }
                Bd.h hVar = c7363h.f66146f;
                rd.d dVarC = qVarA.c();
                rd.d dVarX = c7363h.x();
                n nVarC = vVar.c();
                return new i.e(hVar.c(dVarC, dVarX, nVarC != null ? nVarC.d() : null));
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f66159b, this.f66160c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f66158a;
                try {
                    if (i10 == 0) {
                        Td.v.b(obj);
                        s sVar = this.f66159b;
                        final C7363h c7363h = this.f66160c;
                        Function1 function1 = new Function1() { // from class: zd.i
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return C7363h.b.a.i(c7363h, (v) obj2);
                            }
                        };
                        this.f66158a = 1;
                        obj = sVar.k(function1, this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    i.d dVar = (i.d) obj;
                    this.f66160c.G((dVar.b() != null || (dVar.a() instanceof u.c)) ? InterfaceC6665d.a.f60879c : InterfaceC6665d.a.f60877a);
                } catch (Exception e10) {
                    C7136g c7136g = this.f66160c.f66147g;
                    EnumC7131b enumC7131b = EnumC7131b.f64346h;
                    rd.d dVarX = this.f66160c.x();
                    c7136g.g("UpdatesController loadRemoteUpdate onFailure", e10, enumC7131b, dVarX != null ? dVarX.h() : null, null);
                    this.f66160c.G(InterfaceC6665d.a.f60877a);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: zd.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0999b extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f66161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7363h f66162b;

            /* JADX INFO: renamed from: zd.h$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f66163a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f66164b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ rd.d f66165c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(rd.d dVar, Zd.e eVar) {
                    super(2, eVar);
                    this.f66165c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(UpdatesDatabase updatesDatabase, Zd.e eVar) {
                    return ((a) create(updatesDatabase, eVar)).invokeSuspend(L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    a aVar = new a(this.f66165c, eVar);
                    aVar.f66164b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC2605b.f();
                    if (this.f66163a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                    ((UpdatesDatabase) this.f66164b).Q().c(this.f66165c);
                    return L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0999b(C7363h c7363h, Zd.e eVar) {
                super(2, eVar);
                this.f66162b = c7363h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0999b(this.f66162b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0999b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f66161a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    rd.d dVarX = this.f66162b.x();
                    if (dVarX == null) {
                        return L.f17438a;
                    }
                    C5998c c5998c = this.f66162b.f66143c;
                    a aVar = new a(dVarX, null);
                    this.f66161a = 1;
                    if (c5998c.d(aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: zd.h$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f66166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7363h f66167b;

            /* JADX INFO: renamed from: zd.h$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f66168a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f66169b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ rd.d f66170c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(rd.d dVar, Zd.e eVar) {
                    super(2, eVar);
                    this.f66170c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(UpdatesDatabase updatesDatabase, Zd.e eVar) {
                    return ((a) create(updatesDatabase, eVar)).invokeSuspend(L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    a aVar = new a(this.f66170c, eVar);
                    aVar.f66169b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC2605b.f();
                    if (this.f66168a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                    ((UpdatesDatabase) this.f66169b).Q().e(this.f66170c);
                    return L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C7363h c7363h, Zd.e eVar) {
                super(2, eVar);
                this.f66167b = c7363h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new c(this.f66167b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f66166a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    rd.d dVarX = this.f66167b.x();
                    if (dVarX == null) {
                        return L.f17438a;
                    }
                    C5998c c5998c = this.f66167b.f66143c;
                    a aVar = new a(dVarX, null);
                    this.f66166a = 1;
                    if (c5998c.d(aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return L.f17438a;
            }
        }

        b() {
        }

        @Override // td.InterfaceC6665d
        public void a() {
            if (C7363h.this.f66156p.j()) {
                return;
            }
            C7363h.this.f66155o = InterfaceC6665d.a.f60878b;
            AbstractC1617k.d(C7363h.this.f66149i, null, null, new a(new s(C7363h.this.f66141a, C7363h.this.f66142b, C7363h.this.f66147g, C7363h.this.f66143c.c(), C7363h.this.f66145e, C7363h.this.f66144d, C7363h.this.x()), C7363h.this, null), 3, null);
        }

        @Override // td.InterfaceC6665d
        public void b() {
            if (C7363h.this.v() != null) {
                return;
            }
            AbstractC1617k.d(C7363h.this.f66149i, null, null, new c(C7363h.this, null), 3, null);
        }

        @Override // td.InterfaceC6665d
        public void c(InterfaceC6861b.a callback) {
            AbstractC5504s.h(callback, "callback");
            C7363h.this.f66148h.b(false, callback);
        }

        @Override // td.InterfaceC6665d
        public void d(Exception exception) throws Exception {
            AbstractC5504s.h(exception, "exception");
            throw exception;
        }

        @Override // td.InterfaceC6665d
        public int e() {
            rd.d dVarX = C7363h.this.x();
            if (dVarX != null) {
                return dVarX.n();
            }
            return 0;
        }

        @Override // td.InterfaceC6665d
        public void f() {
            if (C7363h.this.v() != null) {
                return;
            }
            AbstractC1617k.d(C7363h.this.f66149i, null, null, new C0999b(C7363h.this, null), 3, null);
        }

        @Override // td.InterfaceC6665d
        public InterfaceC6665d.a g() {
            return C7363h.this.f66155o;
        }

        @Override // td.InterfaceC6665d
        public d.a h() {
            return C7363h.this.f66142b.e();
        }
    }

    /* JADX INFO: renamed from: zd.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements o.b {

        /* JADX INFO: renamed from: zd.h$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f66173b;

            static {
                int[] iArr = new int[Cd.h.values().length];
                try {
                    iArr[Cd.h.f3069b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cd.h.f3070c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f66172a = iArr;
                int[] iArr2 = new int[o.e.values().length];
                try {
                    iArr2[o.e.f63102a.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[o.e.f63104c.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[o.e.f63103b.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f66173b = iArr2;
            }
        }

        c() {
        }

        @Override // wd.o.b
        public void a() {
            AbstractC7365j.a aVar = C7363h.this.f66151k;
            if (aVar == null) {
                AbstractC5504s.u("procedureContext");
                aVar = null;
            }
            aVar.a(new e.a());
        }

        @Override // wd.o.b
        public void b(q update) {
            AbstractC5504s.h(update, "update");
            C7363h.this.f66155o = InterfaceC6665d.a.f60878b;
        }

        @Override // wd.o.b
        public boolean c(rd.d update) {
            AbstractC5504s.h(update, "update");
            return true;
        }

        @Override // wd.o.b
        public void d() {
            AbstractC7365j.a aVar = C7363h.this.f66151k;
            if (aVar == null) {
                AbstractC5504s.u("procedureContext");
                aVar = null;
            }
            aVar.a(new e.f());
        }

        @Override // wd.o.b
        public void e(o.c result) {
            Cd.e cVar;
            Cd.e bVar;
            AbstractC5504s.h(result, "result");
            if (result instanceof o.c.a) {
                bVar = new e.b();
            } else {
                if (result instanceof o.c.d) {
                    cVar = new e.d(((o.c.d) result).a());
                } else {
                    if (!(result instanceof o.c.b)) {
                        throw new r();
                    }
                    cVar = new e.c(((o.c.b) result).a());
                }
                bVar = cVar;
            }
            AbstractC7365j.a aVar = C7363h.this.f66151k;
            if (aVar == null) {
                AbstractC5504s.u("procedureContext");
                aVar = null;
            }
            aVar.a(bVar);
        }

        @Override // wd.o.b
        public void f(o.e status, rd.d dVar, Exception exc) {
            AbstractC5504s.h(status, "status");
            int i10 = a.f66173b[status.ordinal()];
            AbstractC7365j.a aVar = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new r();
                    }
                    C7363h.this.f66155o = InterfaceC6665d.a.f60877a;
                    C7363h.this.f66147g.i("UpdatesController onBackgroundUpdateFinished: No update available", EnumC7131b.f64341c);
                    AbstractC7365j.a aVar2 = C7363h.this.f66151k;
                    if (aVar2 == null) {
                        AbstractC5504s.u("procedureContext");
                        aVar2 = null;
                    }
                    if (aVar2.d() == Cd.h.f3071d) {
                        AbstractC7365j.a aVar3 = C7363h.this.f66151k;
                        if (aVar3 == null) {
                            AbstractC5504s.u("procedureContext");
                        } else {
                            aVar = aVar3;
                        }
                        aVar.a(new e.g());
                    }
                } else {
                    if (dVar == null) {
                        throw new AssertionError("Background update with error status must have a nonnull update object");
                    }
                    C7363h.this.f66155o = InterfaceC6665d.a.f60879c;
                    C7363h.this.f66147g.i("UpdatesController onBackgroundUpdateFinished: Update available", EnumC7131b.f64340b);
                    AbstractC7365j.a aVar4 = C7363h.this.f66151k;
                    if (aVar4 == null) {
                        AbstractC5504s.u("procedureContext");
                    } else {
                        aVar = aVar4;
                    }
                    aVar.a(new e.i(dVar.i()));
                }
            } else {
                if (exc == null) {
                    throw new AssertionError("Background update with error status must have a nonnull exception object");
                }
                C7363h.this.f66147g.f("UpdatesController onBackgroundUpdateFinished", exc, EnumC7131b.f64350l);
                C7363h.this.f66155o = InterfaceC6665d.a.f60877a;
                AbstractC7365j.a aVar5 = C7363h.this.f66151k;
                if (aVar5 == null) {
                    AbstractC5504s.u("procedureContext");
                    aVar5 = null;
                }
                int i11 = a.f66172a[aVar5.d().ordinal()];
                if (i11 == 1) {
                    AbstractC7365j.a aVar6 = C7363h.this.f66151k;
                    if (aVar6 == null) {
                        AbstractC5504s.u("procedureContext");
                        aVar6 = null;
                    }
                    aVar6.a(new e.f());
                    AbstractC7365j.a aVar7 = C7363h.this.f66151k;
                    if (aVar7 == null) {
                        AbstractC5504s.u("procedureContext");
                    } else {
                        aVar = aVar7;
                    }
                    String message = exc.getMessage();
                    aVar.a(new e.j(message != null ? message : ""));
                } else if (i11 != 2) {
                    AbstractC7365j.a aVar8 = C7363h.this.f66151k;
                    if (aVar8 == null) {
                        AbstractC5504s.u("procedureContext");
                    } else {
                        aVar = aVar8;
                    }
                    String message2 = exc.getMessage();
                    aVar.a(new e.j(message2 != null ? message2 : ""));
                } else {
                    AbstractC7365j.a aVar9 = C7363h.this.f66151k;
                    if (aVar9 == null) {
                        AbstractC5504s.u("procedureContext");
                    } else {
                        aVar = aVar9;
                    }
                    String message3 = exc.getMessage();
                    aVar.a(new e.C0035e(message3 != null ? message3 : ""));
                }
            }
            C7363h.this.f66154n.i(C7363h.this.f66155o);
        }

        @Override // wd.o.b
        public void g() {
            AbstractC7365j.a aVar = C7363h.this.f66151k;
            AbstractC7365j.a aVar2 = null;
            if (aVar == null) {
                AbstractC5504s.u("procedureContext");
                aVar = null;
            }
            aVar.a(new e.l());
            AbstractC7365j.a aVar3 = C7363h.this.f66151k;
            if (aVar3 == null) {
                AbstractC5504s.u("procedureContext");
            } else {
                aVar2 = aVar3;
            }
            aVar2.c();
        }

        @Override // wd.o.b
        public void h(double d10) {
            AbstractC7365j.a aVar = C7363h.this.f66151k;
            if (aVar == null) {
                AbstractC5504s.u("procedureContext");
                aVar = null;
            }
            aVar.a(new e.k(d10));
        }

        @Override // wd.o.b
        public void i(InterfaceC6861b launcher, boolean z10) {
            AbstractC5504s.h(launcher, "launcher");
            if (C7363h.this.f66155o == InterfaceC6665d.a.f60878b && z10) {
                C7363h.this.f66155o = InterfaceC6665d.a.f60877a;
            }
            C7363h.this.f66152l = launcher;
            C7363h.this.C();
        }

        @Override // wd.o.b
        public void j(C6306a asset, int i10, int i11, int i12) {
            AbstractC5504s.h(asset, "asset");
            Map mapF = S.f(z.a("assetInfo", S.l(z.a("name", asset.b()), z.a("successfulAssetCount", Integer.valueOf(i10)), z.a("failedAssetCount", Integer.valueOf(i11)), z.a("totalAssetCount", Integer.valueOf(i12)))));
            C7363h.this.f66147g.j("AppController appLoaderTask didLoadAsset: " + mapF, EnumC7131b.f64340b, null, asset.c());
        }

        @Override // wd.o.b
        public void onFailure(Exception e10) {
            AbstractC5504s.h(e10, "e");
            C7363h.this.f66147g.f("UpdatesController loaderTask onFailure", e10, EnumC7131b.f64340b);
            C7363h.this.f66152l = new C6862c(C7363h.this.f66141a, C7363h.this.f66147g, e10, C7363h.this.f66149i);
            C7363h.this.f66153m = e10;
            C7363h.this.C();
        }
    }

    public C7363h(Context context, expo.modules.updates.d updatesConfiguration, C5998c databaseHolder, File updatesDirectory, wd.g fileDownloader, Bd.h selectionPolicy, C7136g logger, a callback, O procedureScope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(databaseHolder, "databaseHolder");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(procedureScope, "procedureScope");
        this.f66141a = context;
        this.f66142b = updatesConfiguration;
        this.f66143c = databaseHolder;
        this.f66144d = updatesDirectory;
        this.f66145e = fileDownloader;
        this.f66146f = selectionPolicy;
        this.f66147g = logger;
        this.f66148h = callback;
        this.f66149i = procedureScope;
        this.f66150j = "timer-startup";
        this.f66154n = new C6664c(logger);
        this.f66155o = InterfaceC6665d.a.f60877a;
        this.f66156p = new o(context, updatesConfiguration, databaseHolder, updatesDirectory, fileDownloader, selectionPolicy, logger, new c(), procedureScope);
    }

    private final void A() {
        this.f66154n.h(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        if (this.f66152l == null) {
            throw new AssertionError("UpdatesController.notifyController was called with a null launcher, which is an error. This method should only be called when an update is ready to launch.");
        }
        this.f66148h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(InterfaceC6665d.a aVar) {
        this.f66155o = aVar;
        this.f66154n.i(aVar);
    }

    public final boolean B() {
        InterfaceC6861b interfaceC6861b = this.f66152l;
        if (interfaceC6861b != null) {
            return interfaceC6861b.e();
        }
        return false;
    }

    public final void D(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        if (this.f66153m != null) {
            return;
        }
        this.f66154n.n(devSupportManager);
    }

    public final void E(Exception exception) {
        AbstractC5504s.h(exception, "exception");
        this.f66154n.j(exception);
    }

    public final void F(InterfaceC6861b launcher) {
        AbstractC5504s.h(launcher, "launcher");
        this.f66152l = launcher;
    }

    @Override // zd.AbstractC7365j
    public String a() {
        return this.f66150j;
    }

    @Override // zd.AbstractC7365j
    public Object b(AbstractC7365j.a aVar, Zd.e eVar) {
        this.f66151k = aVar;
        aVar.a(new e.n());
        A();
        Object objS = this.f66156p.s(eVar);
        return objS == AbstractC2605b.f() ? objS : L.f17438a;
    }

    public final String u() {
        InterfaceC6861b interfaceC6861b = this.f66152l;
        if (interfaceC6861b != null) {
            return interfaceC6861b.c();
        }
        return null;
    }

    public final Exception v() {
        return this.f66153m;
    }

    public final String w() {
        InterfaceC6861b interfaceC6861b = this.f66152l;
        if (interfaceC6861b != null) {
            return interfaceC6861b.b();
        }
        return null;
    }

    public final rd.d x() {
        InterfaceC6861b interfaceC6861b = this.f66152l;
        if (interfaceC6861b != null) {
            return interfaceC6861b.d();
        }
        return null;
    }

    public final InterfaceC6861b y() {
        return this.f66152l;
    }

    public final Map z() {
        InterfaceC6861b interfaceC6861b = this.f66152l;
        if (interfaceC6861b != null) {
            return interfaceC6861b.a();
        }
        return null;
    }
}
