package io.invertase.notifee;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import app.notifee.core.EventSubscriber;
import com.facebook.react.N;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import j7.C5337a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.invertase.notifee.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5102b {

    /* JADX INFO: renamed from: f */
    private static final AtomicInteger f48991f = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    private final List f48992a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f48993b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f48994c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f48995d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f48996e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: io.invertase.notifee.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0779b implements com.facebook.react.z {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f48998a;

        C0779b(Object obj) {
            this.f48998a = obj;
        }

        @Override // com.facebook.react.z
        public void a(ReactContext reactContext) {
            C5102b.this.f48993b.set(true);
            C5102b.this.f(reactContext);
            try {
                this.f48998a.getClass().getMethod("removeReactInstanceEventListener", com.facebook.react.z.class).invoke(this.f48998a, this);
            } catch (Exception e10) {
                Log.e("NotifeeHeadlessJS", "reflection error A: " + e10, e10);
            }
        }
    }

    /* JADX INFO: renamed from: io.invertase.notifee.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements com.facebook.react.z {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ com.facebook.react.H f49000a;

        c(com.facebook.react.H h10) {
            this.f49000a = h10;
        }

        @Override // com.facebook.react.z
        public void a(ReactContext reactContext) {
            C5102b.this.f48993b.set(true);
            C5102b.this.f(reactContext);
            this.f49000a.l0(this);
        }
    }

    /* JADX INFO: renamed from: io.invertase.notifee.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void call();
    }

    /* JADX INFO: renamed from: io.invertase.notifee.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e {

        /* JADX INFO: renamed from: a */
        private final String f49002a;

        /* JADX INFO: renamed from: b */
        private final long f49003b;

        /* JADX INFO: renamed from: c */
        private final d f49004c;

        /* JADX INFO: renamed from: d */
        private final int f49005d;

        /* JADX INFO: renamed from: e */
        private int f49006e;

        /* JADX INFO: renamed from: f */
        private final WritableMap f49007f;

        public e(String str, long j10, WritableMap writableMap, d dVar) {
            this.f49002a = str;
            this.f49003b = j10;
            this.f49004c = dVar;
            int iG = C5102b.g();
            this.f49005d = iG;
            writableMap.putInt("taskId", iG);
            this.f49007f = writableMap;
        }

        public d b() {
            return this.f49004c;
        }

        public int c() {
            return this.f49006e;
        }

        public C5337a d() {
            return new C5337a(this.f49002a, this.f49007f, this.f49003b, true);
        }

        public int e() {
            return this.f49005d;
        }

        public void f(int i10) {
            this.f49006e = i10;
        }
    }

    private void e(Context context) {
        ReactContext reactContextH = h(context);
        if (reactContextH != null && !this.f48995d.get()) {
            this.f48993b.set(true);
            f(reactContextH);
            return;
        }
        if (this.f48995d.compareAndSet(false, true)) {
            Log.d("NotifeeHeadlessJS", "initialize ReactContext");
            Object objI = i(context);
            if (!l()) {
                com.facebook.react.H hC = j(context).c();
                hC.r(new c(hC));
                hC.y();
                return;
            }
            try {
                objI.getClass().getMethod("addReactInstanceEventListener", com.facebook.react.z.class).invoke(objI, new C0779b(objI));
                objI.getClass().getMethod("start", null).invoke(objI, null);
            } catch (Exception e10) {
                Log.e("NotifeeHeadlessJS", "reflection error ReactHost start: " + e10.getMessage(), e10);
            }
        }
    }

    public void f(final ReactContext reactContext) {
        if (this.f48994c.compareAndSet(false, true)) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: io.invertase.notifee.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48989a.m(reactContext);
                }
            }, 500L);
        }
    }

    static synchronized int g() {
        return f48991f.incrementAndGet();
    }

    public static ReactContext h(Context context) {
        if (l()) {
            Object objI = i(context);
            Q6.a.d(objI, "getReactHost() is null in New Architecture");
            try {
                return (ReactContext) objI.getClass().getMethod("getCurrentReactContext", null).invoke(objI, null);
            } catch (Exception e10) {
                Log.e("NotifeeHeadlessJS", "Reflection error getCurrentReactContext: " + e10.getMessage(), e10);
            }
        }
        return j(context).c().B();
    }

    public static Object i(Context context) {
        Context applicationContext = context.getApplicationContext();
        try {
            return applicationContext.getClass().getMethod("getReactHost", null).invoke(applicationContext, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static N j(Context context) {
        return ((ReactApplication) context.getApplicationContext()).getReactNativeHost();
    }

    private synchronized void k(ReactContext reactContext, e eVar) {
        if (eVar.f49006e > 0) {
            Log.w("NotifeeHeadlessJS", "Task already invoked <IGNORED>: " + this);
            return;
        }
        j7.e eVarH = j7.e.h(reactContext);
        try {
            if (this.f48996e.compareAndSet(false, true)) {
                eVarH.e(new a());
            }
            int iQ = eVarH.q(eVar.d());
            eVar.f(iQ);
            Log.d("NotifeeHeadlessJS", "taskId: " + iQ);
        } catch (IllegalStateException e10) {
            Log.e("NotifeeHeadlessJS", e10.getMessage(), e10);
        }
    }

    public static boolean l() {
        try {
            DefaultNewArchitectureEntryPoint defaultNewArchitectureEntryPoint = DefaultNewArchitectureEntryPoint.INSTANCE;
            return DefaultNewArchitectureEntryPoint.class.getMethod("getBridgelessEnabled", null).invoke(null, null) == Boolean.TRUE;
        } catch (Exception unused) {
            return false;
        }
    }

    public /* synthetic */ void m(ReactContext reactContext) {
        synchronized (this.f48992a) {
            try {
                Iterator it = this.f48992a.iterator();
                while (it.hasNext()) {
                    k(reactContext, (e) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(int i10) {
        e eVar;
        if (!this.f48993b.get()) {
            Log.w("NotifeeHeadlessJS", i10 + " found no ReactContext");
            return;
        }
        ReactContext reactContextH = h(EventSubscriber.getContext());
        if (reactContextH == null) {
            Log.w("NotifeeHeadlessJS", "Failed to finishHeadlessTask: " + i10 + " -- HeadlessTask onFinishHeadlessTask failed to find a ReactContext.  This is unexpected");
            return;
        }
        synchronized (this.f48992a) {
            try {
                Iterator it = this.f48992a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    } else {
                        eVar = (e) it.next();
                        if (eVar.e() == i10) {
                            break;
                        }
                    }
                }
                if (eVar != null) {
                    j7.e.h(reactContextH).f(eVar.c());
                } else {
                    Log.w("NotifeeHeadlessJS", "Failed to find task: " + i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(Context context, e eVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f48992a) {
            this.f48992a.add(eVar);
        }
        if (this.f48993b.get()) {
            k(h(context), eVar);
        } else {
            e(context);
        }
    }

    public void p() {
        Iterator it = this.f48992a.iterator();
        while (it.hasNext()) {
            n(((e) it.next()).e());
        }
    }

    /* JADX INFO: renamed from: io.invertase.notifee.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements j7.f {
        a() {
        }

        @Override // j7.f
        public void b(int i10) {
            e eVar;
            synchronized (C5102b.this.f48992a) {
                try {
                    if (C5102b.this.f48992a.isEmpty()) {
                        return;
                    }
                    Iterator it = C5102b.this.f48992a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            eVar = null;
                            break;
                        } else {
                            eVar = (e) it.next();
                            if (eVar.c() == i10) {
                                break;
                            }
                        }
                    }
                    if (eVar != null) {
                        Log.d("NotifeeHeadlessJS", "taskId: " + eVar.e());
                        C5102b.this.f48992a.remove(eVar);
                        if (eVar.b() != null) {
                            eVar.b().call();
                        }
                    } else {
                        Log.w("NotifeeHeadlessJS", "Failed to find taskId: " + i10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // j7.f
        public void a(int i10) {
        }
    }
}
