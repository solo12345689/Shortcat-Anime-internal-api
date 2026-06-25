package com.facebook.react;

import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import h7.C4921i;
import j7.C5337a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC3242g extends Service implements j7.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36879b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static PowerManager.WakeLock f36880c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f36881a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.facebook.react.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            PowerManager.WakeLock wakeLock;
            AbstractC5504s.h(context, "context");
            if (AbstractServiceC3242g.f36880c == null || !((wakeLock = AbstractServiceC3242g.f36880c) == null || wakeLock.isHeld())) {
                Object systemService = context.getSystemService("power");
                AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, AbstractServiceC3242g.class.getCanonicalName());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                AbstractServiceC3242g.f36880c = wakeLockNewWakeLock;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5337a f36883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactHost f36884c;

        b(C5337a c5337a, ReactHost reactHost) {
            this.f36883b = c5337a;
            this.f36884c = reactHost;
        }

        @Override // com.facebook.react.z
        public void a(ReactContext context) {
            AbstractC5504s.h(context, "context");
            AbstractServiceC3242g.this.m(context, this.f36883b);
            this.f36884c.removeReactInstanceEventListener(this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5337a f36886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f36887c;

        c(C5337a c5337a, H h10) {
            this.f36886b = c5337a;
            this.f36887c = h10;
        }

        @Override // com.facebook.react.z
        public void a(ReactContext context) {
            AbstractC5504s.h(context, "context");
            AbstractServiceC3242g.this.m(context, this.f36886b);
            this.f36887c.l0(this);
        }
    }

    public static final void g(Context context) {
        f36879b.a(context);
    }

    private final void h(C5337a c5337a) {
        if (!C4921i.a()) {
            H hC = k().c();
            AbstractC5504s.g(hC, "getReactInstanceManager(...)");
            hC.r(new c(c5337a, hC));
            hC.y();
            return;
        }
        ReactHost reactHostJ = j();
        if (reactHostJ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostJ.addReactInstanceEventListener(new b(c5337a, reactHostJ));
        reactHostJ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ReactContext reactContext, final C5337a c5337a) {
        final j7.e eVarA = j7.e.f51674g.a(reactContext);
        eVarA.e(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC3242g.n(eVarA, c5337a, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(j7.e eVar, C5337a c5337a, AbstractServiceC3242g abstractServiceC3242g) {
        abstractServiceC3242g.f36881a.add(Integer.valueOf(eVar.q(c5337a)));
    }

    @Override // j7.f
    public void b(int i10) {
        this.f36881a.remove(Integer.valueOf(i10));
        if (this.f36881a.isEmpty()) {
            stopSelf();
        }
    }

    protected final ReactContext i() {
        if (!C4921i.a()) {
            H hC = k().c();
            AbstractC5504s.g(hC, "getReactInstanceManager(...)");
            return hC.B();
        }
        ReactHost reactHostJ = j();
        if (reactHostJ != null) {
            return reactHostJ.getCurrentReactContext();
        }
        throw new IllegalStateException("ReactHost is not initialized in New Architecture");
    }

    protected ReactHost j() {
        ComponentCallbacks2 application = getApplication();
        AbstractC5504s.f(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactHost();
    }

    protected N k() {
        ComponentCallbacks2 application = getApplication();
        AbstractC5504s.f(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactNativeHost();
    }

    protected abstract C5337a l(Intent intent);

    protected final void o(C5337a taskConfig) {
        AbstractC5504s.h(taskConfig, "taskConfig");
        UiThreadUtil.assertOnUiThread();
        f36879b.a(this);
        ReactContext reactContextI = i();
        if (reactContextI == null) {
            h(taskConfig);
        } else {
            m(reactContextI, taskConfig);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext reactContextI = i();
        if (reactContextI != null) {
            j7.e.f51674g.a(reactContextI).k(this);
        }
        PowerManager.WakeLock wakeLock = f36880c;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        C5337a c5337aL = l(intent);
        if (c5337aL == null) {
            return 2;
        }
        o(c5337aL);
        return 3;
    }

    @Override // j7.f
    public void a(int i10) {
    }
}
