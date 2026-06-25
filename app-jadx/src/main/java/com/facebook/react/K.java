package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C3232s;
import com.facebook.react.devsupport.InterfaceC3213b0;
import g7.InterfaceC4859b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p6.C5934a;
import q7.InterfaceC6143a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final a f36388A = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f36389B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSBundleLoader f36392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f36394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Application f36395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC3213b0 f36397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LifecycleState f36400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSExceptionHandler f36401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Activity f36402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC6143a f36403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c7.c f36405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JavaScriptExecutorFactory f36406q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private UIManagerProvider f36409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map f36410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private T.a f36411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private U6.h f36412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c7.d f36413x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC4859b f36414y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c7.i f36415z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36390a = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36407r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f36408s = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("ReactInstanceManagerBuilder", W6.a.f20778b);
        String simpleName = K.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f36389B = simpleName;
    }

    private final JavaScriptExecutorFactory c(String str, String str2, Context context) {
        H.H(context);
        try {
            HermesExecutor.INSTANCE.b();
            return new C5934a();
        } catch (UnsatisfiedLinkError unused) {
            AbstractC7283a.m(f36389B, "Unable to load Hermes. Your application is not built correctly and will fail to execute");
            return null;
        }
    }

    public final K a(O reactPackage) {
        AbstractC5504s.h(reactPackage, "reactPackage");
        this.f36390a.add(reactPackage);
        return this;
    }

    public final H b() {
        Application application = this.f36395f;
        if (application == null) {
            throw new IllegalStateException("Application property has not been set with this builder");
        }
        if (this.f36400k == LifecycleState.f36552c && this.f36402m == null) {
            throw new IllegalStateException("Activity needs to be set if initial lifecycle state is resumed");
        }
        if (!this.f36396g && this.f36391b == null && this.f36392c == null) {
            throw new IllegalStateException("JS Bundle File or Asset URL has to be provided when dev support is disabled");
        }
        if (this.f36393d == null && this.f36391b == null && this.f36392c == null) {
            throw new IllegalStateException("Either MainModulePath or JS Bundle File needs to be provided");
        }
        String packageName = application.getPackageName();
        String strE = com.facebook.react.modules.systeminfo.a.e();
        String str = this.f36391b;
        Activity activity = this.f36402m;
        InterfaceC6143a interfaceC6143a = this.f36403n;
        JavaScriptExecutorFactory javaScriptExecutorFactoryC = this.f36406q;
        if (javaScriptExecutorFactoryC == null) {
            AbstractC5504s.e(packageName);
            Context applicationContext = application.getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            javaScriptExecutorFactoryC = c(packageName, strE, applicationContext);
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = this.f36392c;
        if (jSBundleLoaderCreateAssetLoader == null && str != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.INSTANCE.createAssetLoader(application, str, false);
        }
        JavaScriptExecutorFactory javaScriptExecutorFactory = javaScriptExecutorFactoryC;
        String str2 = this.f36393d;
        List list = this.f36390a;
        boolean z10 = this.f36396g;
        InterfaceC3213b0 c3232s = this.f36397h;
        if (c3232s == null) {
            c3232s = new C3232s();
        }
        InterfaceC3213b0 interfaceC3213b0 = c3232s;
        boolean z11 = this.f36398i;
        boolean z12 = this.f36399j;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f36394e;
        LifecycleState lifecycleState = this.f36400k;
        if (lifecycleState == null) {
            throw new IllegalStateException("Initial lifecycle state was not set");
        }
        return new H(application, activity, interfaceC6143a, javaScriptExecutorFactory, jSBundleLoaderCreateAssetLoader, str2, list, z10, interfaceC3213b0, z11, z12, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.f36401l, null, this.f36404o, this.f36405p, this.f36407r, this.f36408s, this.f36409t, this.f36410u, this.f36411v, this.f36412w, this.f36413x, this.f36414y, this.f36415z);
    }

    public final K d(Application application) {
        AbstractC5504s.h(application, "application");
        this.f36395f = application;
        return this;
    }

    public final K e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f36391b = str2;
        this.f36392c = null;
        return this;
    }

    public final K f(InterfaceC4859b interfaceC4859b) {
        this.f36414y = interfaceC4859b;
        return this;
    }

    public final K g(c7.d dVar) {
        this.f36413x = dVar;
        return this;
    }

    public final K h(InterfaceC3213b0 interfaceC3213b0) {
        this.f36397h = interfaceC3213b0;
        return this;
    }

    public final K i(LifecycleState initialLifecycleState) {
        AbstractC5504s.h(initialLifecycleState, "initialLifecycleState");
        this.f36400k = initialLifecycleState;
        return this;
    }

    public final K j(String jsBundleFile) {
        AbstractC5504s.h(jsBundleFile, "jsBundleFile");
        if (!Df.r.Q(jsBundleFile, "assets://", false, 2, null)) {
            return k(JSBundleLoader.INSTANCE.createFileLoader(jsBundleFile));
        }
        this.f36391b = jsBundleFile;
        this.f36392c = null;
        return this;
    }

    public final K k(JSBundleLoader jsBundleLoader) {
        AbstractC5504s.h(jsBundleLoader, "jsBundleLoader");
        this.f36392c = jsBundleLoader;
        this.f36391b = null;
        return this;
    }

    public final K l(JSExceptionHandler jSExceptionHandler) {
        this.f36401l = jSExceptionHandler;
        return this;
    }

    public final K m(String jsMainModulePath) {
        AbstractC5504s.h(jsMainModulePath, "jsMainModulePath");
        this.f36393d = jsMainModulePath;
        return this;
    }

    public final K n(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f36406q = javaScriptExecutorFactory;
        return this;
    }

    public final K o(boolean z10) {
        this.f36404o = z10;
        return this;
    }

    public final K p(c7.i iVar) {
        this.f36415z = iVar;
        return this;
    }

    public final K q(T.a aVar) {
        this.f36411v = aVar;
        return this;
    }

    public final K s(boolean z10) {
        this.f36398i = z10;
        return this;
    }

    public final K t(U6.h hVar) {
        this.f36412w = hVar;
        return this;
    }

    public final K u(UIManagerProvider uIManagerProvider) {
        this.f36409t = uIManagerProvider;
        return this;
    }

    public final K v(boolean z10) {
        this.f36396g = z10;
        return this;
    }

    public final K r(c7.j jVar) {
        return this;
    }
}
