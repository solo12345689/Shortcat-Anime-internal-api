package zd;

import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.M0;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import com.facebook.react.ReactHost;
import ie.InterfaceC5082a;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pd.C5998c;
import pd.C5999d;
import vd.C6860a;
import vd.InterfaceC6861b;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: renamed from: zd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7361f extends AbstractC7365j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f66113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final expo.modules.updates.d f66114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7136g f66115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5998c f66116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f66117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd.g f66118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bd.h f66119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC5082a f66120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Function1 f66121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f66122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Ad.d f66123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC6861b.a f66124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O f66125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f66126o;

    /* JADX INFO: renamed from: zd.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f66127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f66128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f66129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f66130d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f66132f;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66130d = obj;
            this.f66132f |= Integer.MIN_VALUE;
            return C7361f.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: zd.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66133a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactHost f66135c;

        /* JADX INFO: renamed from: zd.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f66136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7361f f66137b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ReactHost f66138c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7361f c7361f, ReactHost reactHost, Zd.e eVar) {
                super(2, eVar);
                this.f66137b = c7361f;
                this.f66138c = reactHost;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f66137b, this.f66138c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f66136a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                Ad.d dVar = this.f66137b.f66123l;
                if (dVar != null) {
                    WeakReference weakReference = this.f66137b.f66113b;
                    dVar.i(weakReference != null ? (Activity) weakReference.get() : null);
                }
                ReactHost reactHost = this.f66138c;
                WeakReference weakReference2 = this.f66137b.f66113b;
                AbstractC7362g.b(reactHost, weakReference2 != null ? (Activity) weakReference2.get() : null, "Restart from RelaunchProcedure");
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactHost reactHost, Zd.e eVar) {
            super(2, eVar);
            this.f66135c = reactHost;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7361f.this.new b(this.f66135c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f66133a;
            if (i10 == 0) {
                v.b(obj);
                M0 m0C = C1608f0.c();
                a aVar = new a(C7361f.this, this.f66135c, null);
                this.f66133a = 1;
                if (AbstractC1613i.g(m0C, aVar, this) == objF) {
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

    /* JADX INFO: renamed from: zd.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66139a;

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7361f.this.new c(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f66139a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                C5999d.a(C7361f.this.f66114c, C7361f.this.f66116e.c(), C7361f.this.f66117f, ((InterfaceC6861b) C7361f.this.f66120i.invoke()).d(), C7361f.this.f66119h);
            } catch (Exception e10) {
                C7361f.this.f66115d.f("Could not run Reaper.", e10, EnumC7131b.f64350l);
            }
            return L.f17438a;
        }
    }

    public C7361f(Context context, WeakReference weakReference, expo.modules.updates.d updatesConfiguration, C7136g logger, C5998c databaseHolder, File updatesDirectory, wd.g fileDownloader, Bd.h selectionPolicy, InterfaceC5082a getCurrentLauncher, Function1 setCurrentLauncher, boolean z10, Ad.d dVar, InterfaceC6861b.a callback, O procedureScope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(databaseHolder, "databaseHolder");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(getCurrentLauncher, "getCurrentLauncher");
        AbstractC5504s.h(setCurrentLauncher, "setCurrentLauncher");
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(procedureScope, "procedureScope");
        this.f66112a = context;
        this.f66113b = weakReference;
        this.f66114c = updatesConfiguration;
        this.f66115d = logger;
        this.f66116e = databaseHolder;
        this.f66117f = updatesDirectory;
        this.f66118g = fileDownloader;
        this.f66119h = selectionPolicy;
        this.f66120i = getCurrentLauncher;
        this.f66121j = setCurrentLauncher;
        this.f66122k = z10;
        this.f66123l = dVar;
        this.f66124m = callback;
        this.f66125n = procedureScope;
        this.f66126o = "timer-relaunch";
    }

    private final Object k(C6860a c6860a, Zd.e eVar) throws Exception {
        Object objI = c6860a.i(this.f66116e.c(), eVar);
        return objI == AbstractC2605b.f() ? objI : L.f17438a;
    }

    private final void l() {
        AbstractC1617k.d(this.f66125n, null, null, new c(null), 3, null);
    }

    @Override // zd.AbstractC7365j
    public String a() {
        return this.f66126o;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // zd.AbstractC7365j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(zd.AbstractC7365j.a r19, Zd.e r20) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C7361f.b(zd.j$a, Zd.e):java.lang.Object");
    }
}
