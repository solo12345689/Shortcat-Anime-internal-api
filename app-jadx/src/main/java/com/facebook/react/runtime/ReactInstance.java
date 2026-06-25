package com.facebook.react.runtime;

import U7.b;
import android.content.res.AssetManager;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.C3240e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.devsupport.D0;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.b;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.y0;
import com.facebook.react.uimanager.z0;
import com.facebook.soloader.SoLoader;
import g7.C4858a;
import h7.C4914b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0093\u00012\u00020\u0001:\u0003vorBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\u00020\f\"\b\b\u0000\u0010\u001a*\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001a*\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001a*\u00020\u00192\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0012H\u0007¢\u0006\u0004\b+\u0010\u0014J\u0010\u0010-\u001a\u00020,H\u0086 ¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0086 ¢\u0006\u0004\b0\u00101J(\u00106\u001a\u00020\u00122\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!2\u0006\u00105\u001a\u000204H\u0086 ¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0012H\u0087 ¢\u0006\u0004\b8\u0010\u0014J\u0015\u0010;\u001a\u00020\u00122\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020\u00122\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020!¢\u0006\u0004\b?\u0010@J\\\u0010P\u001a\u00020O2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010N\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0083 ¢\u0006\u0004\bP\u0010QJ \u0010T\u001a\u00020\u00122\u0006\u0010R\u001a\u00020!2\u0006\u0010S\u001a\u00020!H\u0082 ¢\u0006\u0004\bT\u0010UJ \u0010Y\u001a\u00020\u00122\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020!H\u0082 ¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\\\u001a\u00020[H\u0082 ¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020/H\u0082 ¢\u0006\u0004\b^\u00101J\u0010\u0010`\u001a\u00020_H\u0082 ¢\u0006\u0004\b`\u0010aJ\u0010\u0010c\u001a\u00020bH\u0082 ¢\u0006\u0004\bc\u0010dJ \u0010f\u001a\u00020\u00122\u0006\u0010=\u001a\u0002092\u0006\u0010e\u001a\u00020!H\u0082 ¢\u0006\u0004\bf\u0010@J\u0018\u0010h\u001a\u00020\u00122\u0006\u0010g\u001a\u000209H\u0082 ¢\u0006\u0004\bh\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bk\u0010l\u0012\u0004\bm\u0010\u0014R\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0017\u0010~\u001a\u00020y8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001c\u0010\u0084\u0001\u001a\u00020\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0015\u0010\u0092\u0001\u001a\u00030\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/facebook/react/runtime/ReactInstance;", "", "Lcom/facebook/react/runtime/c;", "context", "Lcom/facebook/react/runtime/f;", "delegate", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Lc7/f;", "devSupportManager", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", "", "useDevSupport", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "reactHostInspectorTarget", "<init>", "(Lcom/facebook/react/runtime/c;Lcom/facebook/react/runtime/f;Lcom/facebook/react/fabric/ComponentFactory;Lc7/f;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "LTd/L;", "w", "()V", "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleLoader", "y", "(Lcom/facebook/react/bridge/JSBundleLoader;)V", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "nativeModuleInterface", "v", "(Ljava/lang/Class;)Z", "q", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "", "nativeModuleName", "r", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/runtime/j0;", "surface", "z", "(Lcom/facebook/react/runtime/j0;)V", "B", "C", "m", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getBufferedRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "moduleName", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "callFunctionOnModule", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "unregisterFromInspector", "", "level", "u", "(I)V", "segmentId", "path", "A", "(ILjava/lang/String;)V", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "jsMessageQueueThread", "nativeModulesMessageQueueThread", "Lcom/facebook/react/modules/core/JavaTimerManager;", "timerManager", "Lcom/facebook/react/runtime/JSTimerExecutor;", "jsTimerExecutor", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "jReactExceptionsManager", "Lcom/facebook/react/runtime/BindingsInstaller;", "jBindingsInstaller", "isProfiling", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/bridge/queue/MessageQueueThread;Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/runtime/JSTimerExecutor;Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;Lcom/facebook/react/runtime/BindingsInstaller;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)Lcom/facebook/jni/HybridData;", "fileName", "sourceURL", "loadJSBundleFromFile", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/res/AssetManager;", "assetManager", "assetURL", "loadJSBundleFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;)V", "Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;", "getUnbufferedRuntimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", "", "getJavaScriptContext", "()J", "segmentPath", "registerSegmentNative", "pressureLevel", "handleMemoryPressureJs", "a", "Lcom/facebook/react/runtime/c;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "b", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;", "turboModuleManager", "c", "Lcom/facebook/react/modules/core/JavaTimerManager;", "javaTimerManager", "Lcom/facebook/react/runtime/ReactInstance$b;", "d", "Lcom/facebook/react/runtime/ReactInstance$b;", "viewManagerResolver", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "e", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "t", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "Lcom/facebook/react/fabric/FabricUIManager;", "f", "Lcom/facebook/react/fabric/FabricUIManager;", "o", "()Lcom/facebook/react/fabric/FabricUIManager;", "fabricUIManager", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "g", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "p", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "", "s", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "n", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "h", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactInstance {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    private static final String f37221i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3255c context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TurboModuleManager turboModuleManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final JavaTimerManager javaTimerManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b viewManagerResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ReactQueueConfiguration reactQueueConfiguration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FabricUIManager fabricUIManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final JavaScriptContextHolder javaScriptContextHolder;
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ComponentNameResolver {
        a() {
        }

        @Override // com.facebook.react.uimanager.ComponentNameResolver
        public String[] getComponentNames() {
            Collection collectionA = ReactInstance.this.viewManagerResolver.a();
            if (!collectionA.isEmpty()) {
                return (String[]) collectionA.toArray(new String[0]);
            }
            AbstractC7283a.m(ReactInstance.f37221i, "No ViewManager names found");
            return new String[0];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements z0 {

        /* JADX INFO: renamed from: a */
        private final List f37230a;

        /* JADX INFO: renamed from: b */
        private final C3255c f37231b;

        /* JADX INFO: renamed from: c */
        private final Map f37232c;

        /* JADX INFO: renamed from: d */
        private Map f37233d;

        public b(List reactPackages, C3255c context) {
            AbstractC5504s.h(reactPackages, "reactPackages");
            AbstractC5504s.h(context, "context");
            this.f37230a = reactPackages;
            this.f37231b = context;
            this.f37232c = new HashMap();
        }

        @Override // com.facebook.react.uimanager.z0
        public Collection a() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(e());
            hashSet.addAll(c().keySet());
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.z0
        public ViewManager b(String viewManagerName) {
            AbstractC5504s.h(viewManagerName, "viewManagerName");
            ViewManager viewManagerD = d(viewManagerName);
            return viewManagerD != null ? viewManagerD : (ViewManager) c().get(viewManagerName);
        }

        public final synchronized Map c() {
            Map map = this.f37233d;
            if (map != null) {
                if (map == null) {
                    AbstractC5504s.u("_eagerViewManagerMap");
                    map = null;
                }
                return map;
            }
            HashMap map2 = new HashMap();
            for (com.facebook.react.O o10 : this.f37230a) {
                if (!(o10 instanceof com.facebook.react.Y)) {
                    for (ViewManager viewManager : o10.createViewManagers(this.f37231b)) {
                        map2.put(viewManager.getName(), viewManager);
                    }
                }
            }
            this.f37233d = map2;
            return map2;
        }

        public final synchronized ViewManager d(String viewManagerName) {
            ViewManager viewManagerCreateViewManager;
            AbstractC5504s.h(viewManagerName, "viewManagerName");
            if (this.f37232c.containsKey(viewManagerName)) {
                return (ViewManager) this.f37232c.get(viewManagerName);
            }
            for (com.facebook.react.O o10 : this.f37230a) {
                if ((o10 instanceof com.facebook.react.Y) && (viewManagerCreateViewManager = ((com.facebook.react.Y) o10).createViewManager(this.f37231b, viewManagerName)) != null) {
                    this.f37232c.put(viewManagerName, viewManagerCreateViewManager);
                    return viewManagerCreateViewManager;
                }
            }
            return null;
        }

        public final synchronized Collection e() {
            HashSet hashSet;
            try {
                hashSet = new HashSet();
                for (com.facebook.react.O o10 : this.f37230a) {
                    if (o10 instanceof com.facebook.react.Y) {
                        Collection viewManagerNames = ((com.facebook.react.Y) o10).getViewManagerNames(this.f37231b);
                        if (viewManagerNames == null) {
                            J7.d.d(this.f37231b, "The ReactPackage called: `" + o10.getClass().getSimpleName() + "` is returning null for getViewManagerNames(). This is violating the signature of the method. That method should be updated to return an empty collection.");
                        } else {
                            hashSet.addAll(viewManagerNames);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.ReactInstance$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map c(List list, Map map) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
            U7.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
            try {
                return com.facebook.react.uimanager.i0.c(list, null, map);
            } finally {
                U7.a.i(0L);
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            }
        }

        public final NativeMap d(ViewManager viewManager, Map map) {
            b.a aVarA = U7.b.a(0L, "ReactInstance.getConstantsForViewManager");
            String name = viewManager.getName();
            AbstractC5504s.g(name, "getName(...)");
            aVarA.b("ViewManager", name).b("Lazy", Boolean.TRUE).c();
            try {
                return Arguments.makeNativeMap((Map<String, ? extends Object>) com.facebook.react.uimanager.i0.d(viewManager, null, null, null, map));
            } finally {
                U7.b.b(0L).c();
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d implements ReactJsExceptionHandler {

        /* JADX INFO: renamed from: a */
        private final QueueThreadExceptionHandler f37234a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ReactInstance f37235b;

        public d(ReactInstance reactInstance, QueueThreadExceptionHandler queueThreadExceptionHandler) {
            AbstractC5504s.h(queueThreadExceptionHandler, "queueThreadExceptionHandler");
            this.f37235b = reactInstance;
            this.f37234a = queueThreadExceptionHandler;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(ReactJsExceptionHandler.ProcessedError errorMap) {
            AbstractC5504s.h(errorMap, "errorMap");
            JavaOnlyMap javaOnlyMapB = D0.b(errorMap);
            try {
                NativeModule nativeModuleR = this.f37235b.r("ExceptionsManager");
                if (nativeModuleR == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((NativeExceptionsManagerSpec) nativeModuleR).reportException(javaOnlyMapB);
            } catch (Exception e10) {
                this.f37234a.handleException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements JSBundleLoaderDelegate {
        e() {
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromAssets(AssetManager assetManager, String assetURL, boolean z10) {
            AbstractC5504s.h(assetManager, "assetManager");
            AbstractC5504s.h(assetURL, "assetURL");
            ReactInstance.this.context.d(assetURL);
            ReactInstance.this.loadJSBundleFromAssets(assetManager, assetURL);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromFile(String fileName, String sourceURL, boolean z10) {
            AbstractC5504s.h(fileName, "fileName");
            AbstractC5504s.h(sourceURL, "sourceURL");
            ReactInstance.this.context.d(sourceURL);
            ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadSplitBundleFromFile(String fileName, String sourceURL) {
            AbstractC5504s.h(fileName, "fileName");
            AbstractC5504s.h(sourceURL, "sourceURL");
            ReactInstance.this.loadJSBundleFromFile(fileName, sourceURL);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void setSourceURLs(String deviceURL, String remoteURL) {
            AbstractC5504s.h(deviceURL, "deviceURL");
            AbstractC5504s.h(remoteURL, "remoteURL");
            ReactInstance.this.context.d(deviceURL);
        }
    }

    static {
        String simpleName = ReactInstance.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f37221i = simpleName;
        SoLoader.t("rninstance");
    }

    public ReactInstance(C3255c context, InterfaceC3258f delegate, ComponentFactory componentFactory, c7.f devSupportManager, QueueThreadExceptionHandler exceptionHandler, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(componentFactory, "componentFactory");
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        AbstractC5504s.h(exceptionHandler, "exceptionHandler");
        this.context = context;
        U7.a.c(0L, "ReactInstance.initialize");
        MessageQueueThreadSpec.Companion companion = MessageQueueThreadSpec.INSTANCE;
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.INSTANCE.create(new ReactQueueConfigurationSpec(companion.newBackgroundThreadSpec("v_native"), companion.newBackgroundThreadSpec("v_js")), exceptionHandler);
        this.reactQueueConfiguration = reactQueueConfigurationImplCreate;
        AbstractC7283a.b(f37221i, "Calling initializeMessageQueueThreads()");
        context.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        b.C0617b c0617b = com.facebook.react.modules.core.b.f36977f;
        c0617b.b(C4858a.b());
        devSupportManager.y();
        JSTimerExecutor jSTimerExecutor = new JSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(context, jSTimerExecutor, c0617b.a(), devSupportManager);
        this.javaTimerManager = javaTimerManager;
        this.mHybridData = initHybrid(delegate.getJsRuntimeFactory(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutor, new d(this, exceptionHandler), delegate.getBindingsInstaller(), U7.a.j(0L) || InspectorFlags.getIsProfilingBuild(), reactHostInspectorTarget);
        this.javaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
        U7.a.c(0L, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3257e(context.c(), context.b()));
        if (z10) {
            arrayList.add(new C3240e());
        }
        arrayList.addAll(delegate.getReactPackages());
        com.facebook.react.T tA = delegate.getTurboModuleManagerDelegateBuilder().c(arrayList).d(context).a();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.turboModuleManager = new TurboModuleManager(unbufferedRuntimeExecutor, tA, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        U7.a.i(0L);
        U7.a.c(0L, "ReactInstance.initialize#initFabric");
        b bVar = new b(arrayList, context);
        this.viewManagerResolver = bVar;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new a());
        if (C4914b.N()) {
            final HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new UIConstantsProviderBinding.DefaultEventTypesProvider() { // from class: com.facebook.react.runtime.e0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
                public final NativeMap getDefaultEventTypes() {
                    return ReactInstance.e();
                }
            }, new UIConstantsProviderBinding.ConstantsForViewManagerProvider() { // from class: com.facebook.react.runtime.f0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
                public final NativeMap getConstantsForViewManager(String str) {
                    return ReactInstance.f(this.f37283a, map, str);
                }
            }, new UIConstantsProviderBinding.ConstantsProvider() { // from class: com.facebook.react.runtime.g0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
                public final NativeMap getConstants() {
                    return ReactInstance.g(this.f37287a, map);
                }
            });
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(context, new y0(bVar), eventBeatManager);
        this.fabricUIManager = fabricUIManager;
        C3289e.i(context);
        new FabricUIManagerBinding().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory);
        fabricUIManager.initialize();
        U7.a.i(0L);
        U7.a.i(0L);
    }

    public static final NativeMap e() {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) com.facebook.react.uimanager.i0.a());
    }

    public static final NativeMap f(ReactInstance reactInstance, Map map, String viewManagerName) {
        AbstractC5504s.h(viewManagerName, "viewManagerName");
        ViewManager viewManagerB = reactInstance.viewManagerResolver.b(viewManagerName);
        if (viewManagerB == null) {
            return null;
        }
        return INSTANCE.d(viewManagerB, map);
    }

    public static final NativeMap g(ReactInstance reactInstance, Map map) {
        Map mapC = INSTANCE.c(new ArrayList(reactInstance.viewManagerResolver.c().values()), map);
        Collection collectionE = reactInstance.viewManagerResolver.e();
        if (!collectionE.isEmpty()) {
            mapC.put("ViewManagerNames", new ArrayList(collectionE));
            mapC.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap((Map<String, ? extends Object>) mapC);
    }

    private final native long getJavaScriptContext();

    private final native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private final native RuntimeScheduler getRuntimeScheduler();

    private final native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private final native void handleMemoryPressureJs(int pressureLevel);

    private final native HybridData initHybrid(JSRuntimeFactory jsRuntimeFactory, MessageQueueThread jsMessageQueueThread, MessageQueueThread nativeModulesMessageQueueThread, JavaTimerManager timerManager, JSTimerExecutor jsTimerExecutor, ReactJsExceptionHandler jReactExceptionsManager, BindingsInstaller jBindingsInstaller, boolean isProfiling, ReactHostInspectorTarget reactHostInspectorTarget);

    public final native void loadJSBundleFromAssets(AssetManager assetManager, String assetURL);

    public final native void loadJSBundleFromFile(String fileName, String sourceURL);

    private final native void registerSegmentNative(int segmentId, String segmentPath);

    public static final void x(ReactInstance reactInstance) {
        U7.a.c(0L, "initializeEagerTurboModules");
        Iterator<String> it = reactInstance.turboModuleManager.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            reactInstance.turboModuleManager.getModule(it.next());
        }
        U7.a.i(0L);
    }

    public final void A(int segmentId, String path) {
        AbstractC5504s.h(path, "path");
        registerSegmentNative(segmentId, path);
    }

    public final void B(j0 surface) {
        AbstractC5504s.h(surface, "surface");
        String str = f37221i;
        AbstractC7283a.b(str, "startSurface() is called with surface: " + surface.l());
        U7.a.c(0L, "ReactInstance.startSurface");
        k0 k0VarA = surface.a();
        if (k0VarA == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (k0VarA.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new C3299o("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            k0VarA.setId(-1);
        }
        if (surface.o()) {
            this.fabricUIManager.attachRootView(surface.k(), k0VarA);
        } else {
            this.fabricUIManager.startSurface(surface.k(), surface.g(), k0VarA);
        }
        U7.a.i(0L);
    }

    public final void C(j0 surface) {
        AbstractC5504s.h(surface, "surface");
        AbstractC7283a.b(f37221i, "stopSurface() is called with surface: " + surface.l());
        this.fabricUIManager.stopSurface(surface.k());
    }

    public final native void callFunctionOnModule(String moduleName, String methodName, NativeArray args);

    public final native RuntimeExecutor getBufferedRuntimeExecutor();

    public final native CallInvokerHolderImpl getJSCallInvokerHolder();

    public final void m() {
        AbstractC7283a.b(f37221i, "ReactInstance.destroy() is called.");
        this.reactQueueConfiguration.destroy();
        this.turboModuleManager.invalidate();
        this.fabricUIManager.invalidate();
        this.javaTimerManager.x();
        this.mHybridData.resetNative();
        this.javaScriptContextHolder.clear();
    }

    public final EventDispatcher n() {
        EventDispatcher eventDispatcher = this.fabricUIManager.getEventDispatcher();
        AbstractC5504s.g(eventDispatcher, "<get-eventDispatcher>(...)");
        return eventDispatcher;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final FabricUIManager getFabricUIManager() {
        return this.fabricUIManager;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.javaScriptContextHolder;
    }

    public final NativeModule q(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) nativeModuleInterface.getAnnotation(InterfaceC5454a.class);
        if (interfaceC5454a != null) {
            return r(interfaceC5454a.name());
        }
        return null;
    }

    public final NativeModule r(String nativeModuleName) {
        NativeModule module;
        AbstractC5504s.h(nativeModuleName, "nativeModuleName");
        synchronized (this.turboModuleManager) {
            module = this.turboModuleManager.getModule(nativeModuleName);
        }
        return module;
    }

    public final Collection s() {
        return this.turboModuleManager.getModules();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ReactQueueConfiguration getReactQueueConfiguration() {
        return this.reactQueueConfiguration;
    }

    public final void u(int level) {
        try {
            handleMemoryPressureJs(level);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(f37221i, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public final native void unregisterFromInspector();

    public final boolean v(Class nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) nativeModuleInterface.getAnnotation(InterfaceC5454a.class);
        if (interfaceC5454a != null) {
            return this.turboModuleManager.hasModule(interfaceC5454a.name());
        }
        return false;
    }

    public final void w() {
        this.reactQueueConfiguration.getNativeModulesQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.runtime.d0
            @Override // java.lang.Runnable
            public final void run() {
                ReactInstance.x(this.f37280a);
            }
        });
    }

    public final void y(JSBundleLoader bundleLoader) {
        AbstractC5504s.h(bundleLoader, "bundleLoader");
        U7.a.c(0L, "ReactInstance.loadJSBundle");
        bundleLoader.loadScript(new e());
        U7.a.i(0L);
    }

    public final void z(j0 surface) {
        AbstractC5504s.h(surface, "surface");
        U7.a.c(0L, "ReactInstance.prerenderSurface");
        AbstractC7283a.b(f37221i, "call prerenderSurface with surface: " + surface.i());
        this.fabricUIManager.startSurface(surface.k(), surface.g(), null);
        U7.a.i(0L);
    }
}
