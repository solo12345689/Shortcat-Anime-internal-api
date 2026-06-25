package androidx.window.layout.adapter.sidecar;

import Td.L;
import Ud.AbstractC2279u;
import a4.C2576k;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c4.j;
import f4.C4771a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y1.InterfaceC7196d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32620f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SidecarInterface f32621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4771a f32622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f32624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f32625e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "LTd/L;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceH;
            AbstractC5504s.h(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f32623c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f32620f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceH = sidecarCompat.h()) != null) {
                    windowLayoutInfo = sidecarInterfaceH.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f32625e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f32622b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            AbstractC5504s.h(windowToken, "windowToken");
            AbstractC5504s.h(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f32623c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C4771a c4771a = SidecarCompat.this.f32622b;
            SidecarInterface sidecarInterfaceH = SidecarCompat.this.h();
            if (sidecarInterfaceH == null || (sidecarDeviceState = sidecarInterfaceH.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j jVarE = c4771a.e(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.f32625e;
            if (bVar != null) {
                bVar.a(activity, jVarE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            AbstractC5504s.h(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final C2576k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return C2576k.f23792f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements a.InterfaceC0543a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0543a f32627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantLock f32628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakHashMap f32629c;

        public b(a.InterfaceC0543a callbackInterface) {
            AbstractC5504s.h(callbackInterface, "callbackInterface");
            this.f32627a = callbackInterface;
            this.f32628b = new ReentrantLock();
            this.f32629c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0543a
        public void a(Activity activity, j newLayout) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f32628b;
            reentrantLock.lock();
            try {
                if (AbstractC5504s.c(newLayout, (j) this.f32629c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f32627a.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            ReentrantLock reentrantLock = this.f32628b;
            reentrantLock.lock();
            try {
                this.f32629c.put(activity, null);
                L l10 = L.f17438a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SidecarCompat f32630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f32631b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            AbstractC5504s.h(sidecarCompat, "sidecarCompat");
            AbstractC5504s.h(activity, "activity");
            this.f32630a = sidecarCompat;
            this.f32631b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC5504s.h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f32631b.get();
            IBinder iBinderA = SidecarCompat.f32620f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f32630a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC5504s.h(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C4771a sidecarAdapter) {
        AbstractC5504s.h(sidecarAdapter, "sidecarAdapter");
        this.f32621a = sidecarInterface;
        this.f32622b = sidecarAdapter;
        this.f32623c = new LinkedHashMap();
        this.f32624d = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k(final Activity activity) {
        if (this.f32624d.get(activity) == null && (activity instanceof InterfaceC7196d)) {
            K1.a aVar = new K1.a() { // from class: f4.b
                @Override // K1.a
                public final void accept(Object obj) {
                    SidecarCompat.l(this.f46850a, activity, (Configuration) obj);
                }
            };
            this.f32624d.put(activity, aVar);
            ((InterfaceC7196d) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SidecarCompat this$0, Activity activity, Configuration configuration) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(activity, "$activity");
        b bVar = this$0.f32625e;
        if (bVar != null) {
            bVar.a(activity, this$0.i(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(Activity activity) {
        K1.a aVar = (K1.a) this.f32624d.get(activity);
        if (aVar == null) {
            return;
        }
        if (activity instanceof InterfaceC7196d) {
            ((InterfaceC7196d) activity).removeOnConfigurationChangedListener(aVar);
        }
        this.f32624d.remove(activity);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0543a extensionCallback) {
        AbstractC5504s.h(extensionCallback, "extensionCallback");
        this.f32625e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f32621a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f32622b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        IBinder iBinderA = f32620f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC5504s.h(activity, "activity");
        IBinder iBinderA = f32620f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f32621a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        m(activity);
        b bVar = this.f32625e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z10 = this.f32623c.size() == 1;
        this.f32623c.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.f32621a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.f32621a;
    }

    public final j i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        AbstractC5504s.h(activity, "activity");
        IBinder iBinderA = f32620f.a(activity);
        if (iBinderA == null) {
            return new j(AbstractC2279u.m());
        }
        SidecarInterface sidecarInterface = this.f32621a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        C4771a c4771a = this.f32622b;
        SidecarInterface sidecarInterface2 = this.f32621a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c4771a.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC5504s.h(windowToken, "windowToken");
        AbstractC5504s.h(activity, "activity");
        this.f32623c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f32621a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f32623c.size() == 1 && (sidecarInterface = this.f32621a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f32625e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f32621a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!AbstractC5504s.c(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f32621a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f32621a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f32621a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!AbstractC5504s.c(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f32621a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!AbstractC5504s.c(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f32621a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!AbstractC5504s.c(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            AbstractC5504s.g(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                AbstractC5504s.f(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (AbstractC5504s.c(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f32620f.b(context), new C4771a(null, 1, null));
        AbstractC5504s.h(context, "context");
    }
}
