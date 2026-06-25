package androidx.activity;

import P3.f;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractActivityC2640j;
import androidx.core.view.C2793y;
import androidx.core.view.InterfaceC2787v;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import f.C4745a;
import f.InterfaceC4746b;
import g.AbstractC4814d;
import g.AbstractC4816f;
import g.C4818h;
import g.InterfaceC4812b;
import g.InterfaceC4813c;
import g.InterfaceC4817g;
import h.AbstractC4888a;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.AbstractC5628a;
import m2.C5629b;
import y1.InterfaceC7196d;

/* JADX INFO: renamed from: androidx.activity.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2640j extends androidx.core.app.i implements androidx.lifecycle.r, Y, InterfaceC2854h, P3.i, K, InterfaceC4817g, InterfaceC4813c, InterfaceC7196d, y1.e, androidx.core.app.r, androidx.core.app.s, InterfaceC2787v, F {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private X _viewModelStore;
    private final AbstractC4816f activityResultRegistry;
    private int contentLayoutId;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<K1.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<K1.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<K1.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<K1.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<K1.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final P3.h savedStateRegistryController;
    private final C4745a contextAwareHelper = new C4745a();
    private final C2793y menuHostHelper = new C2793y(new Runnable() { // from class: androidx.activity.d
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC2640j.w(this.f24209a);
        }
    });

    /* JADX INFO: renamed from: androidx.activity.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC2861o {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(androidx.lifecycle.r source, AbstractC2857k.a event) {
            AbstractC5504s.h(source, "source");
            AbstractC5504s.h(event, "event");
            AbstractActivityC2640j.this.v();
            AbstractActivityC2640j.this.getLifecycle().removeObserver(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f24217a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC5504s.g(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private Object f24218a;

        /* JADX INFO: renamed from: b */
        private X f24219b;

        public final Object a() {
            return this.f24218a;
        }

        public final X b() {
            return this.f24219b;
        }

        public final void c(Object obj) {
            this.f24218a = obj;
        }

        public final void d(X x10) {
            this.f24219b = x10;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface e extends Executor {
        void J(View view);

        void m();
    }

    /* JADX INFO: renamed from: androidx.activity.j$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a */
        private final long f24220a = SystemClock.uptimeMillis() + ((long) ColorExtractionConstants.MAX_PIXEL_SAMPLES);

        /* JADX INFO: renamed from: b */
        private Runnable f24221b;

        /* JADX INFO: renamed from: c */
        private boolean f24222c;

        public f() {
        }

        public static final void c(f this$0) {
            AbstractC5504s.h(this$0, "this$0");
            Runnable runnable = this$0.f24221b;
            if (runnable != null) {
                AbstractC5504s.e(runnable);
                runnable.run();
                this$0.f24221b = null;
            }
        }

        @Override // androidx.activity.AbstractActivityC2640j.e
        public void J(View view) {
            AbstractC5504s.h(view, "view");
            if (this.f24222c) {
                return;
            }
            this.f24222c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC5504s.h(runnable, "runnable");
            this.f24221b = runnable;
            View decorView = AbstractActivityC2640j.this.getWindow().getDecorView();
            AbstractC5504s.g(decorView, "window.decorView");
            if (!this.f24222c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2640j.f.c(this.f24229a);
                    }
                });
            } else if (AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.AbstractActivityC2640j.e
        public void m() {
            AbstractActivityC2640j.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC2640j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f24221b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f24220a) {
                    this.f24222c = false;
                    AbstractActivityC2640j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f24221b = null;
            if (AbstractActivityC2640j.this.getFullyDrawnReporter().c()) {
                this.f24222c = false;
                AbstractActivityC2640j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC2640j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC4816f {
        g() {
        }

        public static final void s(g this$0, int i10, AbstractC4888a.C0764a c0764a) {
            AbstractC5504s.h(this$0, "this$0");
            this$0.f(i10, c0764a.a());
        }

        public static final void t(g this$0, int i10, IntentSender.SendIntentException e10) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(e10, "$e");
            this$0.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e10));
        }

        @Override // g.AbstractC4816f
        public void i(final int i10, AbstractC4888a contract, Object obj, androidx.core.app.c cVar) {
            Bundle bundleExtra;
            final int i11;
            AbstractC5504s.h(contract, "contract");
            AbstractActivityC2640j abstractActivityC2640j = AbstractActivityC2640j.this;
            final AbstractC4888a.C0764a synchronousResult = contract.getSynchronousResult(abstractActivityC2640j, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2640j.g.s(this.f24230a, i10, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(abstractActivityC2640j, obj);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                AbstractC5504s.e(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(abstractActivityC2640j.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (AbstractC5504s.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.t(abstractActivityC2640j, stringArrayExtra, i10);
                return;
            }
            if (!AbstractC5504s.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                androidx.core.app.b.v(abstractActivityC2640j, intentCreateIntent, i10, bundle);
                return;
            }
            C4818h c4818h = (C4818h) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC5504s.e(c4818h);
                i11 = i10;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i11 = i10;
            }
            try {
                androidx.core.app.b.w(abstractActivityC2640j, c4818h.d(), i11, c4818h.a(), c4818h.b(), c4818h.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2640j.g.t(this.f24233a, i11, sendIntentException);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {
        h() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final P invoke() {
            Application application = AbstractActivityC2640j.this.getApplication();
            AbstractActivityC2640j abstractActivityC2640j = AbstractActivityC2640j.this;
            return new P(application, abstractActivityC2640j, abstractActivityC2640j.getIntent() != null ? AbstractActivityC2640j.this.getIntent().getExtras() : null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: androidx.activity.j$i$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractActivityC2640j f24227a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractActivityC2640j abstractActivityC2640j) {
                super(0);
                this.f24227a = abstractActivityC2640j;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m58invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m58invoke() {
                this.f24227a.reportFullyDrawn();
            }
        }

        i() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final E invoke() {
            return new E(AbstractActivityC2640j.this.reportFullyDrawnExecutor, new a(AbstractActivityC2640j.this));
        }
    }

    /* JADX INFO: renamed from: androidx.activity.j$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0422j extends AbstractC5506u implements InterfaceC5082a {
        C0422j() {
            super(0);
        }

        public static final void e(AbstractActivityC2640j this$0) {
            AbstractC5504s.h(this$0, "this$0");
            try {
                AbstractActivityC2640j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!AbstractC5504s.c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!AbstractC5504s.c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        public static final void f(AbstractActivityC2640j this$0, H dispatcher) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(dispatcher, "$dispatcher");
            this$0.s(dispatcher);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: c */
        public final H invoke() {
            final AbstractActivityC2640j abstractActivityC2640j = AbstractActivityC2640j.this;
            final H h10 = new H(new Runnable() { // from class: androidx.activity.n
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC2640j.C0422j.e(abstractActivityC2640j);
                }
            });
            final AbstractActivityC2640j abstractActivityC2640j2 = AbstractActivityC2640j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!AbstractC5504s.c(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC2640j.C0422j.f(abstractActivityC2640j2, h10);
                        }
                    });
                    return h10;
                }
                abstractActivityC2640j2.s(h10);
            }
            return h10;
        }
    }

    public AbstractActivityC2640j() {
        P3.h hVarB = P3.h.f13461c.b(this);
        this.savedStateRegistryController = hVarB;
        this.reportFullyDrawnExecutor = u();
        this.fullyDrawnReporter$delegate = AbstractC2163n.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().addObserver(new InterfaceC2861o() { // from class: androidx.activity.e
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
                AbstractActivityC2640j.o(this.f24210a, rVar, aVar);
            }
        });
        getLifecycle().addObserver(new InterfaceC2861o() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
                AbstractActivityC2640j.p(this.f24211a, rVar, aVar);
            }
        });
        getLifecycle().addObserver(new a());
        hVarB.c();
        androidx.lifecycle.L.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new f.b() { // from class: androidx.activity.g
            @Override // P3.f.b
            public final Bundle a() {
                return AbstractActivityC2640j.q(this.f24212a);
            }
        });
        addOnContextAvailableListener(new InterfaceC4746b() { // from class: androidx.activity.h
            @Override // f.InterfaceC4746b
            public final void a(Context context) {
                AbstractActivityC2640j.r(this.f24213a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC2163n.b(new h());
        this.onBackPressedDispatcher$delegate = AbstractC2163n.b(new C0422j());
    }

    public static final void o(AbstractActivityC2640j this$0, androidx.lifecycle.r rVar, AbstractC2857k.a event) {
        Window window;
        View viewPeekDecorView;
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(rVar, "<anonymous parameter 0>");
        AbstractC5504s.h(event, "event");
        if (event != AbstractC2857k.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void p(AbstractActivityC2640j this$0, androidx.lifecycle.r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(rVar, "<anonymous parameter 0>");
        AbstractC5504s.h(event, "event");
        if (event == AbstractC2857k.a.ON_DESTROY) {
            this$0.contextAwareHelper.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().a();
            }
            this$0.reportFullyDrawnExecutor.m();
        }
    }

    public static final Bundle q(AbstractActivityC2640j this$0) {
        AbstractC5504s.h(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.k(bundle);
        return bundle;
    }

    public static final void r(AbstractActivityC2640j this$0, Context it) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(it, "it");
        Bundle bundleA = this$0.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            this$0.activityResultRegistry.j(bundleA);
        }
    }

    public final void s(final H h10) {
        getLifecycle().addObserver(new InterfaceC2861o() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
                AbstractActivityC2640j.t(h10, this, rVar, aVar);
            }
        });
    }

    public static final void t(H dispatcher, AbstractActivityC2640j this$0, androidx.lifecycle.r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(dispatcher, "$dispatcher");
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(rVar, "<anonymous parameter 0>");
        AbstractC5504s.h(event, "event");
        if (event == AbstractC2857k.a.ON_CREATE) {
            dispatcher.o(b.f24217a.a(this$0));
        }
    }

    private final e u() {
        return new f();
    }

    public final void v() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new X();
            }
        }
    }

    public static final void w(AbstractActivityC2640j this$0) {
        AbstractC5504s.h(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        eVar.J(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC2787v
    public void addMenuProvider(androidx.core.view.B provider) {
        AbstractC5504s.h(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // y1.InterfaceC7196d
    public final void addOnConfigurationChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC4746b listener) {
        AbstractC5504s.h(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnMultiWindowModeChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.s
    public final void addOnPictureInPictureModeChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // y1.e
    public final void addOnTrimMemoryListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC5504s.h(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // g.InterfaceC4817g
    public final AbstractC4816f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public AbstractC5628a getDefaultViewModelCreationExtras() {
        C5629b c5629b = new C5629b(null, 1, null);
        if (getApplication() != null) {
            AbstractC5628a.c cVar = W.a.f30212e;
            Application application = getApplication();
            AbstractC5504s.g(application, "application");
            c5629b.c(cVar, application);
        }
        c5629b.c(androidx.lifecycle.L.f30172a, this);
        c5629b.c(androidx.lifecycle.L.f30173b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c5629b.c(androidx.lifecycle.L.f30174c, extras);
        }
        return c5629b;
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public W.c getDefaultViewModelProviderFactory() {
        return (W.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public E getFullyDrawnReporter() {
        return (E) this.fullyDrawnReporter$delegate.getValue();
    }

    @InterfaceC2154e
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.i, androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.K
    public final H getOnBackPressedDispatcher() {
        return (H) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // P3.i
    public final P3.f getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        v();
        X x10 = this._viewModelStore;
        AbstractC5504s.e(x10);
        return x10;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        Z.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC5504s.g(decorView2, "window.decorView");
        a0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC5504s.g(decorView3, "window.decorView");
        P3.m.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC5504s.g(decorView4, "window.decorView");
        O.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC5504s.g(decorView5, "window.decorView");
        N.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.e(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<K1.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.G.INSTANCE.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC5504s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC5504s.h(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<K1.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.j(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        super.onNewIntent(intent);
        Iterator<K1.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC5504s.h(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<K1.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.v(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC5504s.h(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(grantResults, "grantResults");
        if (this.activityResultRegistry.e(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @InterfaceC2154e
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X xB = this._viewModelStore;
        if (xB == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            xB = dVar.b();
        }
        if (xB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(xB);
        return dVar2;
    }

    @Override // androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        if (getLifecycle() instanceof C2865t) {
            AbstractC2857k lifecycle = getLifecycle();
            AbstractC5504s.f(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C2865t) lifecycle).l(AbstractC2857k.b.f30237c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<K1.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> AbstractC4814d registerForActivityResult(AbstractC4888a contract, AbstractC4816f registry, InterfaceC4812b callback) {
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(registry, "registry");
        AbstractC5504s.h(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.InterfaceC2787v
    public void removeMenuProvider(androidx.core.view.B provider) {
        AbstractC5504s.h(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // y1.InterfaceC7196d
    public final void removeOnConfigurationChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC4746b listener) {
        AbstractC5504s.h(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnMultiWindowModeChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.s
    public final void removeOnPictureInPictureModeChangedListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // y1.e
    public final void removeOnTrimMemoryListener(K1.a listener) {
        AbstractC5504s.h(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC5504s.h(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (X3.a.h()) {
                X3.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            X3.a.f();
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        eVar.J(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC5504s.h(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC5504s.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    public void addMenuProvider(androidx.core.view.B provider, androidx.lifecycle.r owner) {
        AbstractC5504s.h(provider, "provider");
        AbstractC5504s.h(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC5504s.h(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC2154e
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC5504s.h(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    public void addMenuProvider(androidx.core.view.B provider, androidx.lifecycle.r owner, AbstractC2857k.b state) {
        AbstractC5504s.h(provider, "provider");
        AbstractC5504s.h(owner, "owner");
        AbstractC5504s.h(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Override // g.InterfaceC4813c
    public final <I, O> AbstractC4814d registerForActivityResult(AbstractC4888a contract, InterfaceC4812b callback) {
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<K1.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.j(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<K1.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.v(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        eVar.J(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "window.decorView");
        eVar.J(decorView);
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
