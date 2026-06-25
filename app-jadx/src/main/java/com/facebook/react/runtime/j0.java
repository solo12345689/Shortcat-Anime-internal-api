package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.uimanager.events.EventDispatcher;
import e7.InterfaceC4656a;
import f7.InterfaceC4779a;
import h7.C4914b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements InterfaceC4779a {

    /* JADX INFO: renamed from: e */
    public static final a f37302e = new a(null);

    /* JADX INFO: renamed from: a */
    private final SurfaceHandlerBinding f37303a;

    /* JADX INFO: renamed from: b */
    private Context f37304b;

    /* JADX INFO: renamed from: c */
    private final AtomicReference f37305c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference f37306d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean e(Context context) {
            return com.facebook.react.modules.i18nmanager.a.f37029a.a().d(context);
        }

        public final float f(Context context) {
            if (C4914b.n()) {
                return context.getResources().getConfiguration().fontScale;
            }
            return 1.0f;
        }

        public final boolean g(Context context) {
            return com.facebook.react.modules.i18nmanager.a.f37029a.a().i(context);
        }

        public final j0 d(Context context, String moduleName, Bundle bundle) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(moduleName, "moduleName");
            j0 j0Var = new j0(context, moduleName, bundle);
            j0Var.d(new k0(context, j0Var));
            return j0Var;
        }

        private a() {
        }
    }

    public j0(SurfaceHandlerBinding surfaceHandler, Context context) {
        AbstractC5504s.h(surfaceHandler, "surfaceHandler");
        AbstractC5504s.h(context, "context");
        this.f37303a = surfaceHandler;
        this.f37304b = context;
        this.f37305c = new AtomicReference(null);
        this.f37306d = new AtomicReference(null);
    }

    public static final void f(j0 j0Var) {
        k0 k0VarA = j0Var.a();
        if (k0VarA != null) {
            k0VarA.removeAllViews();
            k0VarA.setId(-1);
        }
    }

    public final void c(ReactHost host) {
        AbstractC5504s.h(host, "host");
        if (!(host instanceof ReactHostImpl)) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
        if (!w.Y.a(this.f37306d, null, host)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public final void d(k0 view) {
        AbstractC5504s.h(view, "view");
        if (!w.Y.a(this.f37305c, null, view)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        Context context = view.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        this.f37304b = context;
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.i0
            @Override // java.lang.Runnable
            public final void run() {
                j0.f(this.f37298a);
            }
        });
    }

    public Context g() {
        return this.f37304b;
    }

    public final EventDispatcher h() {
        ReactHostImpl reactHostImplJ = j();
        if (reactHostImplJ != null) {
            return reactHostImplJ.getEventDispatcher$ReactAndroid_release();
        }
        return null;
    }

    public String i() {
        return this.f37303a.getModuleName();
    }

    public final ReactHostImpl j() {
        return (ReactHostImpl) this.f37306d.get();
    }

    public final SurfaceHandlerBinding k() {
        return this.f37303a;
    }

    public int l() {
        return this.f37303a.getSurfaceId();
    }

    @Override // f7.InterfaceC4779a
    /* JADX INFO: renamed from: m */
    public k0 a() {
        return (k0) this.f37305c.get();
    }

    public final boolean n() {
        return j() != null;
    }

    public boolean o() {
        return this.f37303a.isRunning();
    }

    public final synchronized void p(int i10, int i11, int i12, int i13) {
        SurfaceHandlerBinding surfaceHandlerBinding = this.f37303a;
        a aVar = f37302e;
        surfaceHandlerBinding.setLayoutConstraints(i10, i11, i12, i13, aVar.e(g()), aVar.g(g()), g().getResources().getDisplayMetrics().density, aVar.f(g()));
    }

    @Override // f7.InterfaceC4779a
    public InterfaceC4656a start() {
        if (this.f37305c.get() == null) {
            return y7.n.f64899g.q(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImplJ = j();
        return reactHostImplJ == null ? y7.n.f64899g.q(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImplJ.startSurface$ReactAndroid_release(this);
    }

    @Override // f7.InterfaceC4779a
    public InterfaceC4656a stop() {
        ReactHostImpl reactHostImplJ = j();
        return reactHostImplJ == null ? y7.n.f64899g.q(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImplJ.stopSurface$ReactAndroid_release(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(Context context, String moduleName, Bundle bundle) {
        NativeMap nativeMap;
        this(new SurfaceHandlerBinding(moduleName), context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(moduleName, "moduleName");
        if (bundle != null) {
            Object objFromBundle = Arguments.fromBundle(bundle);
            AbstractC5504s.f(objFromBundle, "null cannot be cast to non-null type com.facebook.react.bridge.NativeMap");
            nativeMap = (NativeMap) objFromBundle;
        } else {
            nativeMap = null;
        }
        this.f37303a.setProps(nativeMap);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        SurfaceHandlerBinding surfaceHandlerBinding = this.f37303a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
        a aVar = f37302e;
        surfaceHandlerBinding.setLayoutConstraints(iMakeMeasureSpec, iMakeMeasureSpec2, 0, 0, aVar.e(context), aVar.g(context), displayMetrics.density, aVar.f(context));
    }
}
