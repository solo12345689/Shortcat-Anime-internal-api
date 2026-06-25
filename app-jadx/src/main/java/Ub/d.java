package Ub;

import Gf.C1608f0;
import Gf.N;
import Gf.O;
import Gf.P;
import Gf.X0;
import Td.AbstractC2163n;
import Td.L;
import Ud.AbstractC2279u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import bc.EnumC3046e;
import bc.InterfaceC3043b;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.f0;
import expo.modules.kotlin.services.AppDirectoriesService;
import expo.modules.kotlin.services.FilePermissionService;
import ic.InterfaceC5068b;
import ie.InterfaceC5082a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import lc.C5588a;
import pb.C5957b;
import rb.C6302c;
import sb.InterfaceC6446a;
import tb.InterfaceC6658a;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements InterfaceC5068b {

    /* JADX INFO: renamed from: a */
    private final C5957b f19408a;

    /* JADX INFO: renamed from: b */
    private final C5588a f19409b;

    /* JADX INFO: renamed from: c */
    private final Lazy f19410c;

    /* JADX INFO: renamed from: d */
    private final x f19411d;

    /* JADX INFO: renamed from: e */
    private boolean f19412e;

    /* JADX INFO: renamed from: f */
    private final Hf.g f19413f;

    /* JADX INFO: renamed from: g */
    private final O f19414g;

    /* JADX INFO: renamed from: h */
    private final O f19415h;

    /* JADX INFO: renamed from: i */
    private final O f19416i;

    /* JADX INFO: renamed from: j */
    private final s f19417j;

    /* JADX INFO: renamed from: k */
    private final expo.modules.kotlin.services.a f19418k;

    /* JADX INFO: renamed from: l */
    private WeakReference f19419l;

    /* JADX INFO: renamed from: m */
    private final Wb.a f19420m;

    /* JADX INFO: renamed from: n */
    private final Wb.m f19421n;

    /* JADX INFO: renamed from: o */
    private final Lazy f19422o;

    /* JADX INFO: renamed from: p */
    private final Lazy f19423p;

    public d(t modulesProvider, C5957b legacyModuleRegistry, final WeakReference reactContextHolder) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AbstractC5504s.h(modulesProvider, "modulesProvider");
        AbstractC5504s.h(legacyModuleRegistry, "legacyModuleRegistry");
        AbstractC5504s.h(reactContextHolder, "reactContextHolder");
        this.f19408a = legacyModuleRegistry;
        this.f19409b = new C5588a(this, reactContextHolder);
        this.f19410c = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ub.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.T(this.f19404a, reactContextHolder);
            }
        });
        x xVar = new x(this);
        this.f19411d = xVar;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        Hf.g gVarC = Hf.h.c(new Handler(handlerThread.getLooper()), null, 1, null);
        this.f19413f = gVarC;
        this.f19414g = P.a(C1608f0.b().w(X0.b(null, 1, null)).w(new N("expo.modules.BackgroundCoroutineScope")));
        this.f19415h = P.a(gVarC.w(X0.b(null, 1, null)).w(new N("expo.modules.AsyncFunctionQueue")));
        this.f19416i = P.a(C1608f0.c().w(X0.b(null, 1, null)).w(new N("expo.modules.MainQueue")));
        s sVar = new s(A.a(this));
        this.f19417j = sVar;
        expo.modules.kotlin.services.a aVar = new expo.modules.kotlin.services.a(A.a(this));
        this.f19418k = aVar;
        Wb.a aVar2 = new Wb.a(this);
        this.f19420m = aVar2;
        this.f19421n = new Wb.m(aVar2);
        Object obj = reactContextHolder.get();
        if (obj == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) obj;
        legacyModuleRegistry.g(this);
        reactApplicationContext.addLifecycleEventListener(xVar);
        reactApplicationContext.addActivityEventListener(xVar);
        aVar.c(FilePermissionService.class);
        aVar.c(AppDirectoriesService.class);
        aVar.d(modulesProvider.getServices());
        sVar.F(new Zb.d(), null);
        sVar.F(new Zb.b(), null);
        sVar.D(modulesProvider);
        R();
        f.a().d("✅ AppContext was initialized");
        this.f19422o = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ub.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.h(this.f19406a);
            }
        });
        this.f19423p = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ub.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.I(this.f19407a);
            }
        });
    }

    public static final C6752d I(d dVar) {
        Object next;
        Iterator it = dVar.f19417j.t().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((r) next).g() instanceof Zb.b) {
                break;
            }
        }
        r rVar = (r) next;
        gc.c cVarG = rVar != null ? rVar.g() : null;
        if (!(cVarG instanceof Zb.b)) {
            cVarG = null;
        }
        Zb.b bVar = (Zb.b) cVarG;
        if (bVar != null) {
            return bVar.getLogger();
        }
        return null;
    }

    private final void R() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("inline.modules.ExpoInlineModulesList").getConstructor(null).newInstance(null);
            AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
            this.f19417j.D((t) objNewInstance);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static final lc.c T(d dVar, WeakReference weakReference) {
        return new lc.c(dVar, weakReference);
    }

    public static final Zb.b h(d dVar) {
        Object next;
        Iterator it = dVar.f19417j.t().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            gc.c cVarG = ((r) next).g();
            if (cVarG != null ? cVarG instanceof Zb.b : true) {
                break;
            }
        }
        r rVar = (r) next;
        gc.c cVarG2 = rVar != null ? rVar.g() : null;
        return (Zb.b) (cVarG2 instanceof Zb.b ? cVarG2 : null);
    }

    private final AppDirectoriesService n() {
        Object obj = E().a().get(AppDirectoriesService.class);
        if (!(obj instanceof AppDirectoriesService)) {
            obj = null;
        }
        AppDirectoriesService appDirectoriesService = (AppDirectoriesService) obj;
        if (appDirectoriesService != null) {
            return appDirectoriesService;
        }
        throw new IllegalStateException("AppDirectoriesService is not registered in the ServicesRegistry.");
    }

    public final File A() {
        return n().c();
    }

    public final Context B() {
        return D().j();
    }

    public final s C() {
        return this.f19417j;
    }

    public final C5588a D() {
        return this.f19409b;
    }

    public final expo.modules.kotlin.services.a E() {
        return this.f19418k;
    }

    public final Activity F() throws cc.h {
        Activity currentActivity;
        InterfaceC6446a interfaceC6446aL = l();
        if (interfaceC6446aL == null || (currentActivity = interfaceC6446aL.a()) == null) {
            Context contextB = B();
            ReactApplicationContext reactApplicationContext = contextB instanceof ReactApplicationContext ? (ReactApplicationContext) contextB : null;
            currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        }
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new cc.h();
    }

    public final lc.c G() {
        return (lc.c) this.f19410c.getValue();
    }

    public final void H() {
        D().l();
    }

    public final void J(Activity activity, int i10, int i11, Intent intent) {
        AbstractC5504s.h(activity, "activity");
        this.f19420m.f(i10, i11, intent);
        this.f19417j.z(EnumC3046e.f33274g, activity, new bc.j(i10, i11, intent));
    }

    public final void K() {
        X3.a.c("[ExpoModulesCore] AppContext.onCreate");
        try {
            C().A();
            L l10 = L.f17438a;
        } finally {
            X3.a.f();
        }
    }

    public final void L() {
        X3.a.c("[ExpoModulesCore] AppContext.onDestroy");
        try {
            ReactApplicationContext reactApplicationContextJ = D().j();
            if (reactApplicationContextJ != null) {
                reactApplicationContextJ.removeLifecycleEventListener(this.f19411d);
                reactApplicationContextJ.removeActivityEventListener(this.f19411d);
            }
            s sVarC = C();
            sVarC.w(EnumC3046e.f33269b);
            sVarC.f();
            P.c(y(), new C6302c(null, 1, null));
            P.c(x(), new C6302c(null, 1, null));
            P.c(o(), new C6302c(null, 1, null));
            D().f();
            if (this.f19410c.e()) {
                G().f();
            }
            f.a().d("✅ AppContext was destroyed");
            L l10 = L.f17438a;
            X3.a.f();
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    public final void M() {
        Activity activityA = a();
        if (activityA != null) {
            if (!(activityA instanceof androidx.appcompat.app.c)) {
                Activity activityA2 = a();
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (activityA2 != null ? activityA2.getLocalClassName() : null)).toString());
            }
            this.f19420m.g((androidx.appcompat.app.c) activityA);
        }
        this.f19417j.w(EnumC3046e.f33272e);
        this.f19412e = true;
    }

    public final void N() {
        this.f19417j.w(EnumC3046e.f33271d);
    }

    public final void O() {
        Activity activityA = a();
        if (activityA == null) {
            return;
        }
        if (activityA instanceof androidx.appcompat.app.c) {
            if (this.f19412e) {
                this.f19412e = false;
                this.f19417j.G();
            }
            this.f19420m.h((androidx.appcompat.app.c) activityA);
            this.f19417j.w(EnumC3046e.f33270c);
            return;
        }
        Activity activityA2 = a();
        throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (activityA2 != null ? activityA2.getLocalClassName() : null)).toString());
    }

    public final void P(Intent intent) {
        this.f19417j.y(EnumC3046e.f33273f, intent);
    }

    public final void Q() {
        this.f19417j.w(EnumC3046e.f33275h);
    }

    public final void S(WeakReference weakReference) {
        this.f19419l = weakReference;
    }

    @Override // ic.InterfaceC5068b
    public Activity a() {
        Activity activityA;
        InterfaceC6446a interfaceC6446aL = l();
        if (interfaceC6446aL != null && (activityA = interfaceC6446aL.a()) != null) {
            return activityA;
        }
        Context contextB = B();
        ReactApplicationContext reactApplicationContext = contextB instanceof ReactApplicationContext ? (ReactApplicationContext) contextB : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final void g() throws cc.g {
        z zVar = z.f19458a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        AbstractC5504s.g(name, "getName(...)");
        String name2 = Looper.getMainLooper().getThread().getName();
        AbstractC5504s.g(name2, "getName(...)");
        throw new cc.g(name, name2);
    }

    public final InterfaceC3043b i(gc.c module) {
        Object objB;
        AbstractC5504s.h(module, "module");
        try {
            objB = v().b(InterfaceC6658a.class);
        } catch (Exception unused) {
            objB = null;
        }
        InterfaceC6658a interfaceC6658a = (InterfaceC6658a) objB;
        if (interfaceC6658a == null) {
            return null;
        }
        r rVarN = this.f19417j.n(module);
        if (rVarN != null) {
            return new bc.h(rVarN, interfaceC6658a, D().k());
        }
        String strW0 = AbstractC2279u.w0(this.f19417j.t().keySet(), ", ", null, null, 0, null, null, 62, null);
        throw new IllegalArgumentException(("Cannot create an event emitter for module " + module.getClass() + " that isn't present in the module registry. Available modules: [" + strW0 + "].").toString());
    }

    public final void j(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        ReactApplicationContext reactApplicationContextJ = D().j();
        if (reactApplicationContextJ != null) {
            reactApplicationContextJ.runOnJSQueueThread(runnable);
        }
    }

    public final View k(int i10) {
        ReactApplicationContext reactApplicationContextJ = D().j();
        if (reactApplicationContextJ == null) {
            return null;
        }
        UIManager uIManagerI = f0.i(reactApplicationContextJ, i10);
        View viewResolveView = uIManagerI != null ? uIManagerI.resolveView(i10) : null;
        if (viewResolveView != null) {
            return viewResolveView;
        }
        return null;
    }

    public final InterfaceC6446a l() {
        Object objB;
        try {
            objB = v().b(InterfaceC6446a.class);
        } catch (Exception unused) {
            objB = null;
        }
        return (InterfaceC6446a) objB;
    }

    public final Wb.m m() {
        return this.f19421n;
    }

    public final O o() {
        return this.f19414g;
    }

    public final File p() {
        return n().a();
    }

    public final InterfaceC3043b q() {
        Object objB;
        try {
            objB = v().b(InterfaceC6658a.class);
        } catch (Exception unused) {
            objB = null;
        }
        InterfaceC6658a interfaceC6658a = (InterfaceC6658a) objB;
        if (interfaceC6658a == null) {
            return null;
        }
        return new bc.g(interfaceC6658a, D().k());
    }

    public final Zb.b r() {
        return (Zb.b) this.f19422o.getValue();
    }

    public final FilePermissionService s() {
        Object obj = E().a().get(FilePermissionService.class);
        if (!(obj instanceof FilePermissionService)) {
            obj = null;
        }
        FilePermissionService filePermissionService = (FilePermissionService) obj;
        if (filePermissionService != null) {
            return filePermissionService;
        }
        throw new IllegalStateException("FilePermissionService is not registered in the ServicesRegistry.");
    }

    public final boolean t() {
        ReactApplicationContext reactApplicationContextJ = D().j();
        return reactApplicationContextJ != null && reactApplicationContextJ.hasActiveReactInstance();
    }

    public final C6752d u() {
        return (C6752d) this.f19423p.getValue();
    }

    public final C5957b v() {
        return this.f19408a;
    }

    public final WeakReference w() {
        return this.f19419l;
    }

    public final O x() {
        return this.f19416i;
    }

    public final O y() {
        return this.f19415h;
    }

    public final Rb.a z() {
        Object objB;
        try {
            objB = v().b(Rb.a.class);
        } catch (Exception unused) {
            objB = null;
        }
        return (Rb.a) objB;
    }
}
