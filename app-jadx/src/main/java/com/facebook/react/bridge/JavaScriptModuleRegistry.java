package com.facebook.react.bridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006¢\u0006\u0002\u0010\rR\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry;", "", "<init>", "()V", "moduleInstances", "", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "getJavaScriptModule", "T", "instance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "JavaScriptModuleInvocationHandler", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptModuleRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<Class<? extends JavaScriptModule>, JavaScriptModule> moduleInstances = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$Companion;", "", "<init>", "()V", "getJSModuleName", "", "jsModuleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getJSModuleName(Class<? extends JavaScriptModule> jsModuleInterface) {
            AbstractC5504s.h(jsModuleInterface, "jsModuleInterface");
            String simpleName = jsModuleInterface.getSimpleName();
            AbstractC5504s.e(simpleName);
            int iO0 = Df.r.o0(simpleName, '$', 0, false, 6, null);
            if (iO0 != -1) {
                AbstractC5504s.e(simpleName);
                simpleName = simpleName.substring(iO0 + 1);
                AbstractC5504s.g(simpleName, "substring(...)");
            }
            AbstractC5504s.e(simpleName);
            return simpleName;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/JavaScriptModuleRegistry$JavaScriptModuleInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "catalystInstance", "Lcom/facebook/react/bridge/CatalystInstance;", "moduleInterface", "Ljava/lang/Class;", "Lcom/facebook/react/bridge/JavaScriptModule;", "<init>", "(Lcom/facebook/react/bridge/CatalystInstance;Ljava/lang/Class;)V", "name", "", "getJSModuleName", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class JavaScriptModuleInvocationHandler implements InvocationHandler {
        private final CatalystInstance catalystInstance;
        private final Class<? extends JavaScriptModule> moduleInterface;
        private String name;

        public JavaScriptModuleInvocationHandler(CatalystInstance catalystInstance, Class<? extends JavaScriptModule> moduleInterface) {
            AbstractC5504s.h(catalystInstance, "catalystInstance");
            AbstractC5504s.h(moduleInterface, "moduleInterface");
            this.catalystInstance = catalystInstance;
            this.moduleInterface = moduleInterface;
            if (Y6.a.f22860b) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator itA = AbstractC5489c.a(moduleInterface.getDeclaredMethods());
                while (itA.hasNext()) {
                    Method method = (Method) itA.next();
                    String name = method.getName();
                    AbstractC5504s.g(name, "getName(...)");
                    if (!linkedHashSet.add(name)) {
                        throw new AssertionError("Method overloading is unsupported: " + this.moduleInterface.getName() + "#" + method.getName());
                    }
                }
            }
        }

        private final String getJSModuleName() {
            String str = this.name;
            if (str != null) {
                return str;
            }
            String jSModuleName = JavaScriptModuleRegistry.INSTANCE.getJSModuleName(this.moduleInterface);
            this.name = jSModuleName;
            return jSModuleName;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            AbstractC5504s.h(proxy, "proxy");
            AbstractC5504s.h(method, "method");
            WritableNativeArray writableNativeArrayFromJavaArgs = args != null ? Arguments.fromJavaArgs(args) : new WritableNativeArray();
            CatalystInstance catalystInstance = this.catalystInstance;
            String jSModuleName = getJSModuleName();
            String name = method.getName();
            AbstractC5504s.g(name, "getName(...)");
            catalystInstance.callFunction(jSModuleName, name, writableNativeArrayFromJavaArgs);
            return null;
        }
    }

    public static final String getJSModuleName(Class<? extends JavaScriptModule> cls) {
        return INSTANCE.getJSModuleName(cls);
    }

    public final synchronized <T extends JavaScriptModule> T getJavaScriptModule(CatalystInstance instance, Class<T> moduleInterface) {
        AbstractC5504s.h(instance, "instance");
        AbstractC5504s.h(moduleInterface, "moduleInterface");
        T t10 = (T) this.moduleInstances.get(moduleInterface);
        if (t10 != null) {
            return t10;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(moduleInterface.getClassLoader(), new Class[]{moduleInterface}, new JavaScriptModuleInvocationHandler(instance, moduleInterface));
        AbstractC5504s.f(objNewProxyInstance, "null cannot be cast to non-null type com.facebook.react.bridge.JavaScriptModule");
        T t11 = (T) objNewProxyInstance;
        this.moduleInstances.put((Class<? extends JavaScriptModule>) moduleInterface, t11);
        return t11;
    }
}
