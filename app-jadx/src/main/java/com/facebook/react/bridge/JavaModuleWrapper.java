package com.facebook.react.bridge;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 *2\u00020\u0001:\u0003+,*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0013j\b\u0012\u0004\u0012\u00020\u0018`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper;", "", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "Lcom/facebook/react/bridge/ModuleHolder;", "moduleHolder", "<init>", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ModuleHolder;)V", "LTd/L;", "findMethods", "()V", "", "methodId", "Lcom/facebook/react/bridge/ReadableNativeArray;", "parameters", "invoke", "(ILcom/facebook/react/bridge/ReadableNativeArray;)V", "Lcom/facebook/react/bridge/JSInstance;", "Lcom/facebook/react/bridge/ModuleHolder;", "Ljava/util/ArrayList;", "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "Lkotlin/collections/ArrayList;", "methods", "Ljava/util/ArrayList;", "Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;", "descs", "Lcom/facebook/react/bridge/BaseJavaModule;", "getModule", "()Lcom/facebook/react/bridge/BaseJavaModule;", "module", "", "getName", "()Ljava/lang/String;", "name", "", "getMethodDescriptors", "()Ljava/util/List;", "methodDescriptors", "Lcom/facebook/react/bridge/NativeMap;", "getConstants", "()Lcom/facebook/react/bridge/NativeMap;", "constants", "Companion", "NativeMethod", "MethodDescriptor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaModuleWrapper {
    private static final Companion Companion = new Companion(null);
    private final ArrayList<MethodDescriptor> descs;
    private final JSInstance jsInstance;
    private final ArrayList<NativeMethod> methods;
    private final ModuleHolder moduleHolder;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$MethodDescriptor;", "", "<init>", "()V", "method", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "setMethod", "(Ljava/lang/reflect/Method;)V", "signature", "", "getSignature", "()Ljava/lang/String;", "setSignature", "(Ljava/lang/String;)V", "name", "getName", "setName", "type", "getType", "setType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {
        private Method method;
        private String name;
        private String signature;
        private String type;

        public final Method getMethod() {
            return this.method;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final String getType() {
            return this.type;
        }

        public final void setMethod(Method method) {
            this.method = method;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setSignature(String str) {
            this.signature = str;
        }

        public final void setType(String str) {
            this.type = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "Lcom/facebook/react/bridge/ReadableArray;", "parameters", "LTd/L;", "invoke", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;)V", "", "getType", "()Ljava/lang/String;", "type", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jsInstance, ReadableArray parameters);
    }

    static {
        W6.b.a("JavaModuleWrapper", W6.a.f20777a);
    }

    public JavaModuleWrapper(JSInstance jsInstance, ModuleHolder moduleHolder) {
        AbstractC5504s.h(jsInstance, "jsInstance");
        AbstractC5504s.h(moduleHolder, "moduleHolder");
        this.jsInstance = jsInstance;
        this.moduleHolder = moduleHolder;
        this.methods = new ArrayList<>();
        this.descs = new ArrayList<>();
    }

    private final void findMethods() {
        U7.a.c(0L, "findMethods");
        Class<?> cls = this.moduleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Iterator itA = AbstractC5489c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                AbstractC5504s.e(method);
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.setName(name);
                methodDescriptor.setType(javaMethodWrapper.getType());
                if (AbstractC5504s.c(BaseJavaModule.METHOD_TYPE_SYNC, methodDescriptor.getType())) {
                    methodDescriptor.setSignature(javaMethodWrapper.getSignature());
                    methodDescriptor.setMethod(method);
                }
                this.methods.add(javaMethodWrapper);
                this.descs.add(methodDescriptor);
            }
        }
        U7.a.i(0L);
    }

    public final NativeMap getConstants() {
        String name = getName();
        U7.b.a(0L, "JavaModuleWrapper.getConstants").b("moduleName", name).c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        U7.a.c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        U7.a.i(0L);
        U7.a.c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap((Map<String, ? extends Object>) constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            U7.b.b(0L).c();
        }
    }

    public final List<MethodDescriptor> getMethodDescriptors() {
        if (this.descs.isEmpty()) {
            findMethods();
        }
        return this.descs;
    }

    public final BaseJavaModule getModule() {
        NativeModule module = this.moduleHolder.getModule();
        AbstractC5504s.f(module, "null cannot be cast to non-null type com.facebook.react.bridge.BaseJavaModule");
        return (BaseJavaModule) module;
    }

    public final String getName() {
        return this.moduleHolder.getName();
    }

    public final void invoke(int methodId, ReadableNativeArray parameters) {
        AbstractC5504s.h(parameters, "parameters");
        if (methodId >= this.methods.size()) {
            return;
        }
        this.methods.get(methodId).invoke(this.jsInstance, parameters);
    }
}
