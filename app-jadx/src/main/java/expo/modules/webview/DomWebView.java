package expo.modules.webview;

import Df.r;
import Gf.AbstractC1615j;
import Od.f;
import Od.g;
import Td.L;
import Td.u;
import Td.v;
import Ub.d;
import Zd.e;
import Zd.k;
import ae.AbstractC2605b;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.views.h;
import expo.modules.webview.DomWebView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.json.JSONObject;
import pe.InterfaceC6023m;
import vc.C6859c;
import vc.InterfaceC6858b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J#\u0010-\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u000bR\u001b\u00103\u001a\u00060\u000fj\u0002`28\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010:\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0016\u0010C\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010;R!\u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lexpo/modules/webview/DomWebView;", "Lexpo/modules/kotlin/views/h;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "LUb/d;", "appContext", "<init>", "(Landroid/content/Context;LUb/d;)V", "Landroid/webkit/WebView;", "createWebView", "()Landroid/webkit/WebView;", "expo/modules/webview/DomWebView$a", "createWebViewClient", "()Lexpo/modules/webview/DomWebView$a;", "", "deferredId", "", "source", "nativeJsiEvalSync", "(ILjava/lang/String;LZd/e;)Ljava/lang/Object;", "LTd/L;", "reload", "()V", "Lexpo/modules/webview/DomWebViewSource;", "setSource", "(Lexpo/modules/webview/DomWebViewSource;)V", "script", "setInjectedJSBeforeContentLoaded", "(Ljava/lang/String;)V", "injectJavaScript", "message", "dispatchMessageEvent", "data", "evalSync", "(Ljava/lang/String;)Ljava/lang/String;", "Lexpo/modules/webview/ScrollToParam;", "param", "scrollTo", "(Lexpo/modules/webview/ScrollToParam;)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "webView", "Landroid/webkit/WebView;", "getWebView", "Lexpo/modules/webview/WebViewId;", "webViewId", "I", "getWebViewId", "()I", "Lexpo/modules/webview/DomWebViewSource;", "injectedJSBeforeContentLoaded", "Ljava/lang/String;", "webviewDebuggingEnabled", "Z", "getWebviewDebuggingEnabled", "()Z", "setWebviewDebuggingEnabled", "(Z)V", "nestedScrollEnabled", "getNestedScrollEnabled", "setNestedScrollEnabled", "needsResetupScripts", "Lvc/b;", "Lexpo/modules/webview/OnMessageEvent;", "onMessage$delegate", "Lvc/c;", "getOnMessage", "()Lvc/b;", "onMessage", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DomWebView extends h implements View.OnTouchListener {
    static final /* synthetic */ InterfaceC6023m[] $$delegatedProperties = {O.k(new F(DomWebView.class, "onMessage", "getOnMessage()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};
    private String injectedJSBeforeContentLoaded;
    private boolean needsResetupScripts;
    private boolean nestedScrollEnabled;

    /* JADX INFO: renamed from: onMessage$delegate, reason: from kotlin metadata */
    private final C6859c onMessage;
    private DomWebViewSource source;
    private final WebView webView;
    private final int webViewId;
    private boolean webviewDebuggingEnabled;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            DomWebView domWebView = DomWebView.this;
            domWebView.injectJavaScript(r.K("\n// browserScripts/InstallGlobals/Deferred.ts\nclass Deferred {\n  promise;\n  resolveCallback;\n  rejectCallback;\n  constructor() {\n    this.promise = new Promise((resolve, reject) => {\n      this.resolveCallback = resolve;\n      this.rejectCallback = reject;\n    });\n  }\n  resolve(value) {\n    this.resolveCallback(value);\n  }\n  reject(reason) {\n    this.rejectCallback(reason);\n  }\n  getPromise() {\n    return this.promise;\n  }\n}\n\n// browserScripts/InstallGlobals/EventEmitterProxy.ts\nclass EventEmitterProxy {\n  moduleName;\n  listeners;\n  constructor(moduleName) {\n    this.moduleName = moduleName;\n  }\n  addListener = (eventName, listener) => {\n    if (!this.listeners) {\n      this.listeners = new Map;\n    }\n    if (!this.listeners.has(eventName)) {\n      this.listeners.set(eventName, new Set);\n    }\n    this.listeners.get(eventName)?.add(listener);\n    const nativeListenerId = window.ExpoDomWebView.nextEventListenerId++;\n    listener.$$nativeListenerId = nativeListenerId;\n    const source = `\n      globalThis.expo.$$DomWebViewEventListenerMap ||= {};\n      globalThis.expo.$$DomWebViewEventListenerMap['${eventName}'] ||= new Map();\n      const listener = (...args) => {\n        const serializeArgs = args.map((arg) => JSON.stringify(arg)).join(',');\n        const script = 'window.ExpoDomWebView.eventEmitterProxy.${this.moduleName}.emit(\"${eventName}\", ' + serializeArgs + ')';\n        globalThis.expo.modules.ExpoDomWebViewModule.evalJsForWebViewAsync(\"%%WEBVIEW_ID%%\", script);\n      };\n      globalThis.expo.$$DomWebViewEventListenerMap['${eventName}'].set(${nativeListenerId}, listener);\n      globalThis.expo.modules.${this.moduleName}.addListener('${eventName}', listener);\n    `;\n    window.ExpoDomWebView.eval(source);\n    return {\n      remove: () => {\n        this.removeListener(eventName, listener);\n      }\n    };\n  };\n  removeListener = (eventName, listener) => {\n    const nativeListenerId = listener.$$nativeListenerId;\n    if (nativeListenerId != null) {\n      const source = `(function() {\n        const nativeListener = globalThis.expo.$$DomWebViewEventListenerMap['${eventName}'].get(${nativeListenerId});\n        if (nativeListener != null) {\n          globalThis.expo.modules.${this.moduleName}.removeListener('${eventName}', nativeListener);\n          globalThis.expo.$$DomWebViewEventListenerMap['${eventName}'].delete(${nativeListenerId});\n        }\n      })();\n      true;\n      `;\n      window.ExpoDomWebView.eval(source);\n    }\n    this.listeners?.get(eventName)?.delete(listener);\n  };\n  removeAllListeners = (eventName) => {\n    const source = `\n      globalThis.expo.$$DomWebViewEventListenerMap['${eventName}'].clear();\n      globalThis.expo.modules.${this.moduleName}.removeAllListeners('${eventName}');\n    `;\n    window.ExpoDomWebView.eval(source);\n    this.listeners?.get(eventName)?.clear();\n  };\n  emit = (eventName, ...args) => {\n    const listeners = new Set(this.listeners?.get(eventName));\n    listeners.forEach((listener) => {\n      try {\n        listener(...args);\n      } catch (error) {\n        console.error(error);\n      }\n    });\n  };\n}\n\n// browserScripts/InstallGlobals/utils.ts\nfunction serializeArgs(args) {\n  return args.map((arg) => {\n    if (typeof arg === \"object\" && arg.sharedObjectId != null) {\n      return `globalThis.expo.sharedObjectRegistry.get(${arg.sharedObjectId})`;\n    }\n    return JSON.stringify(arg);\n  }).join(\",\");\n}\n\n// browserScripts/InstallGlobals/proxies.ts\nfunction createSharedObjectProxy(sharedObjectId) {\n  return new Proxy({}, {\n    get: (target, prop) => {\n      const name = String(prop);\n      if (name === \"sharedObjectId\") {\n        return sharedObjectId;\n      }\n      return function(...args) {\n        const serializedArgs = serializeArgs(args);\n        const source = `globalThis.expo.sharedObjectRegistry.get(${sharedObjectId})?.${name}?.call(globalThis.expo.sharedObjectRegistry.get(${sharedObjectId}),${serializedArgs})`;\n        return window.ExpoDomWebView.eval(source);\n      };\n    }\n  });\n}\nfunction createConstructorProxy(moduleName, property, propertyName) {\n  return new Proxy(function() {\n  }, {\n    construct(target, args) {\n      const serializedArgs = serializeArgs(args);\n      const sharedObjectId = window.ExpoDomWebView.nextSharedObjectId++;\n      const sharedObjectProxy = createSharedObjectProxy(sharedObjectId);\n      window.ExpoDomWebView.sharedObjectFinalizationRegistry.register(sharedObjectProxy, sharedObjectId);\n      const source = `globalThis.expo.sharedObjectRegistry ||= new Map(); globalThis.expo.sharedObjectRegistry.set(${sharedObjectId}, new ${property}(${serializedArgs}));`;\n      window.ExpoDomWebView.eval(source);\n      return sharedObjectProxy;\n    }\n  });\n}\nfunction createPropertyProxy(propertyTypeCache, moduleName, propertyName) {\n  const property = `globalThis.expo.modules.${moduleName}.${propertyName}`;\n  let propertyType = propertyTypeCache[propertyName];\n  if (!propertyType) {\n    const typeCheck = `${property}?.prototype?.__expo_shared_object_id__ != null ? 'sharedObject' : typeof ${property}`;\n    propertyType = window.ExpoDomWebView.eval(typeCheck);\n    propertyTypeCache[propertyName] = propertyType;\n  }\n  if (propertyType === \"sharedObject\") {\n    return createConstructorProxy(moduleName, property, propertyName);\n  }\n  if (propertyType === \"function\") {\n    return function(...args) {\n      const serializedArgs = serializeArgs(args);\n      const source = `${property}(${serializedArgs})`;\n      return window.ExpoDomWebView.eval(source);\n    };\n  }\n  return window.ExpoDomWebView.eval(property);\n}\nfunction createExpoModuleProxy(moduleName) {\n  const propertyTypeCache = {};\n  return new Proxy({}, {\n    get: (target, prop) => {\n      const name = String(prop);\n      if ([\"addListener\", \"removeListener\", \"removeAllListeners\"].includes(name)) {\n        return window.ExpoDomWebView.eventEmitterProxy[moduleName][name];\n      }\n      return createPropertyProxy(propertyTypeCache, moduleName, name);\n    }\n  });\n}\n\n// browserScripts/InstallGlobals/ExpoDomWebView.ts\nclass ExpoDomWebView {\n  nextDeferredId;\n  nextSharedObjectId;\n  nextEventListenerId;\n  deferredMap;\n  sharedObjectFinalizationRegistry;\n  expoModulesProxy;\n  eventEmitterProxy;\n  constructor() {\n    this.nextDeferredId = 0;\n    this.nextSharedObjectId = 0;\n    this.nextEventListenerId = 0;\n    this.deferredMap = new Map;\n    this.sharedObjectFinalizationRegistry = new FinalizationRegistry((sharedObjectId) => {\n      this.eval(`globalThis.expo.sharedObjectRegistry.delete(${sharedObjectId})`);\n    });\n    const expoModules = {};\n    const eventEmitterProxy = {};\n    this.eval(\"Object.keys(globalThis.expo.modules)\").forEach((name) => {\n      expoModules[name] = createExpoModuleProxy(name);\n      eventEmitterProxy[name] = new EventEmitterProxy(name);\n    });\n    this.expoModulesProxy = expoModules;\n    this.eventEmitterProxy = eventEmitterProxy;\n  }\n  eval(source) {\n    const { deferredId, deferred } = this.createDeferred();\n    const args = JSON.stringify({ source, deferredId });\n    const result = JSON.parse(window.ExpoDomWebViewBridge.eval(args));\n    if (result.isPromise) {\n      return deferred.getPromise();\n    }\n    this.removeDeferred(deferredId);\n    return result.value;\n  }\n  createDeferred() {\n    const deferred = new Deferred;\n    const deferredId = this.nextDeferredId;\n    this.deferredMap.set(deferredId, deferred);\n    this.nextDeferredId += 1;\n    return { deferredId, deferred };\n  }\n  resolveDeferred(deferredId, value) {\n    const deferred = this.deferredMap.get(deferredId);\n    if (deferred) {\n      deferred.resolve(value);\n      this.deferredMap.delete(deferredId);\n    }\n  }\n  rejectDeferred(deferredId, reason) {\n    const deferred = this.deferredMap.get(deferredId);\n    if (deferred) {\n      deferred.reject(reason);\n      this.deferredMap.delete(deferredId);\n    }\n  }\n  removeDeferred(deferredId) {\n    this.deferredMap.delete(deferredId);\n  }\n}\n\n// browserScripts/InstallGlobals/index.ts\nwindow.ExpoDomWebView = new ExpoDomWebView;\n\n", "\"%%WEBVIEW_ID%%\"", String.valueOf(domWebView.getWebViewId()), false, 4, null));
            String str2 = DomWebView.this.injectedJSBeforeContentLoaded;
            if (str2 != null) {
                DomWebView.this.injectJavaScript(str2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46785a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f46788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, e eVar) {
            super(2, eVar);
            this.f46787c = i10;
            this.f46788d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DomWebView.this.new b(this.f46787c, this.f46788d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = AbstractC2605b.f();
            int i10 = this.f46785a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            DomWebView domWebView = DomWebView.this;
            int i11 = this.f46787c;
            String str = this.f46788d;
            AbstractC5504s.e(str);
            this.f46785a = 1;
            Object objNativeJsiEvalSync = domWebView.nativeJsiEvalSync(i11, str, this);
            return objNativeJsiEvalSync == objF ? objF : objNativeJsiEvalSync;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f46789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DomWebView f46790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f46791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f46792d;

        c(int i10, DomWebView domWebView, String str, e eVar) {
            this.f46789a = i10;
            this.f46790b = domWebView;
            this.f46791c = str;
            this.f46792d = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                JavaScriptValue javaScriptValueG = this.f46790b.getAppContext().D().g(r.K(r.K(r.K("\n// browserScripts/NativeEvalWrapper/index.ts\n(function() {\n  const result = \"%%SOURCE%%\";\n  if (result instanceof Promise) {\n    result.then((resolved) => {\n      const resolvedString = JSON.stringify(resolved);\n      const script = 'window.ExpoDomWebView.resolveDeferred(\"%%DEFERRED_ID%%\", ' + resolvedString + \")\";\n      globalThis.expo.modules.ExpoDomWebViewModule.evalJsForWebViewAsync(\"%%WEBVIEW_ID%%\", script);\n    }).catch((error) => {\n      const errorString = JSON.stringify(error);\n      const script = 'window.ExpoDomWebView.rejectDeferred(\"%%DEFERRED_ID%%\", ' + errorString + \")\";\n      globalThis.expo.modules.ExpoDomWebViewModule.evalJsForWebViewAsync(\"%%WEBVIEW_ID%%\", script);\n    });\n    return JSON.stringify({ isPromise: true, value: null });\n  } else {\n    return JSON.stringify({ isPromise: false, value: result });\n  }\n})();\n\n", "\"%%DEFERRED_ID%%\"", String.valueOf(this.f46789a), false, 4, null), "\"%%WEBVIEW_ID%%\"", String.valueOf(this.f46790b.getWebViewId()), false, 4, null), "\"%%SOURCE%%\"", this.f46791c, false, 4, null));
                e eVar = this.f46792d;
                u.a aVar = u.f17466b;
                eVar.resumeWith(u.b(javaScriptValueG.getString()));
            } catch (Exception e10) {
                e eVar2 = this.f46792d;
                u.a aVar2 = u.f17466b;
                eVar2.resumeWith(u.b(v.a(e10)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomWebView(Context context, d appContext) {
        super(context, appContext);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        this.webViewId = f.f13149a.a(this);
        this.nestedScrollEnabled = true;
        this.onMessage = new C6859c(this, null);
        WebView webViewCreateWebView = createWebView();
        this.webView = webViewCreateWebView;
        addView(webViewCreateWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    private final WebView createWebView() {
        WebView webView = new WebView(getContext());
        webView.setBackgroundColor(0);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(createWebViewClient());
        webView.addJavascriptInterface(new g(this), "ReactNativeWebView");
        webView.addJavascriptInterface(new Od.d(this), "ExpoDomWebViewBridge");
        webView.setOnTouchListener(this);
        return webView;
    }

    private final a createWebViewClient() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchMessageEvent$lambda$2(DomWebView domWebView, String str) {
        String title = domWebView.webView.getTitle();
        if (title == null) {
            title = "";
        }
        String url = domWebView.webView.getUrl();
        domWebView.getOnMessage().invoke(new OnMessageEvent(title, url != null ? url : "", str));
    }

    private final InterfaceC6858b getOnMessage() {
        return this.onMessage.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void injectJavaScript$lambda$1(DomWebView domWebView, String str) {
        domWebView.webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nativeJsiEvalSync(int i10, String str, e eVar) throws Throwable {
        k kVar = new k(AbstractC2605b.c(eVar));
        getAppContext().j(new c(i10, this, str, kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollTo$lambda$3(ScrollToParam scrollToParam, DomWebView domWebView) {
        if (!scrollToParam.getAnimated()) {
            domWebView.webView.scrollTo((int) scrollToParam.getX(), (int) scrollToParam.getY());
            return;
        }
        WebView webView = domWebView.webView;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(webView, "scrollX", webView.getScrollX(), (int) scrollToParam.getX());
        objectAnimatorOfInt.setDuration(250L);
        WebView webView2 = domWebView.webView;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(webView2, "scrollY", webView2.getScrollY(), (int) scrollToParam.getY());
        objectAnimatorOfInt2.setDuration(250L);
        objectAnimatorOfInt.start();
        objectAnimatorOfInt2.start();
    }

    public final void dispatchMessageEvent(final String message) {
        AbstractC5504s.h(message, "message");
        this.webView.post(new Runnable() { // from class: Od.c
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.dispatchMessageEvent$lambda$2(this.f13123a, message);
            }
        });
    }

    public final String evalSync(String data) {
        AbstractC5504s.h(data, "data");
        JSONObject jSONObject = new JSONObject(data);
        return (String) AbstractC1615j.b(null, new b(jSONObject.getInt("deferredId"), jSONObject.getString("source"), null), 1, null);
    }

    public final boolean getNestedScrollEnabled() {
        return this.nestedScrollEnabled;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final int getWebViewId() {
        return this.webViewId;
    }

    public final boolean getWebviewDebuggingEnabled() {
        return this.webviewDebuggingEnabled;
    }

    public final void injectJavaScript(final String script) {
        AbstractC5504s.h(script, "script");
        this.webView.post(new Runnable() { // from class: Od.b
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.injectJavaScript$lambda$1(this.f13121a, script);
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        if (!this.nestedScrollEnabled) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public final void reload() {
        String uri;
        WebView.setWebContentsDebuggingEnabled(this.webviewDebuggingEnabled);
        DomWebViewSource domWebViewSource = this.source;
        if (domWebViewSource != null && (uri = domWebViewSource.getUri()) != null) {
            if (AbstractC5504s.c(uri, this.webView.getUrl())) {
                return;
            }
            this.webView.loadUrl(uri);
        } else if (this.needsResetupScripts) {
            this.needsResetupScripts = false;
            this.webView.reload();
        }
    }

    public final void scrollTo(final ScrollToParam param) {
        AbstractC5504s.h(param, "param");
        this.webView.post(new Runnable() { // from class: Od.a
            @Override // java.lang.Runnable
            public final void run() {
                DomWebView.scrollTo$lambda$3(param, this);
            }
        });
    }

    public final void setInjectedJSBeforeContentLoaded(String script) {
        String str;
        if (script == null || script.length() == 0) {
            str = null;
        } else {
            str = "(function() { " + script + "; })();true;";
        }
        this.injectedJSBeforeContentLoaded = str;
        this.needsResetupScripts = true;
    }

    public final void setNestedScrollEnabled(boolean z10) {
        this.nestedScrollEnabled = z10;
    }

    public final void setSource(DomWebViewSource source) {
        AbstractC5504s.h(source, "source");
        this.source = source;
    }

    public final void setWebviewDebuggingEnabled(boolean z10) {
        this.webviewDebuggingEnabled = z10;
    }
}
