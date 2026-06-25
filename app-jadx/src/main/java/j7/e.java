package j7;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: g */
    public static final a f51674g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final WeakHashMap f51675h = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    private final WeakReference f51676a;

    /* JADX INFO: renamed from: b */
    private final Set f51677b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f51678c;

    /* JADX INFO: renamed from: d */
    private final Set f51679d;

    /* JADX INFO: renamed from: e */
    private final Map f51680e;

    /* JADX INFO: renamed from: f */
    private final SparseArray f51681f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(ReactContext context) {
            AbstractC5504s.h(context, "context");
            WeakHashMap weakHashMap = e.f51675h;
            Object eVar = weakHashMap.get(context);
            if (eVar == null) {
                eVar = new e(context, null);
                weakHashMap.put(context, eVar);
            }
            return (e) eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactContext);
    }

    public static final void g(e eVar, int i10) {
        Iterator it = eVar.f51677b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(i10);
        }
    }

    public static final e h(ReactContext reactContext) {
        return f51674g.a(reactContext);
    }

    private final void l(int i10) {
        Runnable runnable = (Runnable) this.f51681f.get(i10);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f51681f.remove(i10);
        }
    }

    public static final void n(e eVar, C5337a c5337a, int i10) {
        eVar.r(c5337a, i10);
    }

    private final void o(final int i10, long j10) {
        Runnable runnable = new Runnable() { // from class: j7.d
            @Override // java.lang.Runnable
            public final void run() {
                e.p(this.f51672a, i10);
            }
        };
        this.f51681f.append(i10, runnable);
        UiThreadUtil.runOnUiThread(runnable, j10);
    }

    public static final void p(e eVar, int i10) {
        eVar.f(i10);
    }

    private final synchronized void r(C5337a c5337a, int i10) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) Q6.a.d(this.f51676a.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.f36552c && !c5337a.e()) {
                throw new IllegalStateException(("Tried to start task " + c5337a.c() + " while in foreground, but this is not allowed.").toString());
            }
            this.f51679d.add(Integer.valueOf(i10));
            this.f51680e.put(Integer.valueOf(i10), new C5337a(c5337a));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i10, c5337a.c(), c5337a.a());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (c5337a.d() > 0) {
                o(i10, c5337a.d());
            }
            Iterator it = this.f51677b.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(f listener) {
        AbstractC5504s.h(listener, "listener");
        this.f51677b.add(listener);
        Iterator it = this.f51679d.iterator();
        while (it.hasNext()) {
            listener.a(((Number) it.next()).intValue());
        }
    }

    public final synchronized void f(final int i10) {
        boolean zRemove = this.f51679d.remove(Integer.valueOf(i10));
        this.f51680e.remove(Integer.valueOf(i10));
        l(i10);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: j7.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.g(this.f51670a, i10);
                }
            });
        }
    }

    public final boolean i() {
        return !this.f51679d.isEmpty();
    }

    public final synchronized boolean j(int i10) {
        return this.f51679d.contains(Integer.valueOf(i10));
    }

    public final void k(f listener) {
        AbstractC5504s.h(listener, "listener");
        this.f51677b.remove(listener);
    }

    public final synchronized boolean m(final int i10) {
        C5337a c5337a = (C5337a) this.f51680e.get(Integer.valueOf(i10));
        if (c5337a == null) {
            throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + i10 + ".").toString());
        }
        g gVarB = c5337a.b();
        if (gVarB != null && gVarB.a()) {
            l(i10);
            final C5337a c5337a2 = new C5337a(c5337a.c(), c5337a.a(), c5337a.d(), c5337a.e(), gVarB.c());
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: j7.b
                @Override // java.lang.Runnable
                public final void run() {
                    e.n(this.f51667a, c5337a2, i10);
                }
            }, gVarB.b());
            return true;
        }
        return false;
    }

    public final synchronized int q(C5337a taskConfig) {
        int iIncrementAndGet;
        AbstractC5504s.h(taskConfig, "taskConfig");
        iIncrementAndGet = this.f51678c.incrementAndGet();
        r(taskConfig, iIncrementAndGet);
        return iIncrementAndGet;
    }

    private e(ReactContext reactContext) {
        this.f51676a = new WeakReference(reactContext);
        this.f51677b = new CopyOnWriteArraySet();
        this.f51678c = new AtomicInteger(0);
        this.f51679d = new CopyOnWriteArraySet();
        this.f51680e = new ConcurrentHashMap();
        this.f51681f = new SparseArray();
    }
}
