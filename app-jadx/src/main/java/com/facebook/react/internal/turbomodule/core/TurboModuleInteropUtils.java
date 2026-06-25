package com.facebook.react.internal.turbomodule.core;

import Df.r;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\fJ;\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u0014\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J/\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\nH\u0002¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0002\u0010\u0014¨\u0006 "}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils;", "", "<init>", "()V", "getMethodDescriptorsFromModule", "", "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "module", "Lcom/facebook/react/bridge/NativeModule;", "getMethodsFromModule", "", "Ljava/lang/reflect/Method;", "(Lcom/facebook/react/bridge/NativeModule;)[Ljava/lang/reflect/Method;", "createJniSignature", "", "moduleName", "methodName", "paramClasses", "Ljava/lang/Class;", "returnClass", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/String;", "convertParamClassToJniType", "paramClass", "convertReturnClassToJniType", "convertClassToJniType", "cls", "getJsArgCount", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)I", "createJSIReturnKind", "MethodDescriptor", "ParsingException", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TurboModuleInteropUtils {
    public static final TurboModuleInteropUtils INSTANCE = new TurboModuleInteropUtils();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;", "", "methodName", "", "jniSignature", "jsiReturnKind", "jsArgCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MethodDescriptor {
        public final String jniSignature;
        public final int jsArgCount;
        public final String jsiReturnKind;
        public final String methodName;

        public MethodDescriptor(String methodName, String jniSignature, String jsiReturnKind, int i10) {
            AbstractC5504s.h(methodName, "methodName");
            AbstractC5504s.h(jniSignature, "jniSignature");
            AbstractC5504s.h(jsiReturnKind, "jsiReturnKind");
            this.methodName = methodName;
            this.jniSignature = jniSignature;
            this.jsiReturnKind = jsiReturnKind;
            this.jsArgCount = i10;
        }
    }

    private TurboModuleInteropUtils() {
    }

    private final String convertClassToJniType(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Class must have a canonical name");
        }
        return "L" + r.J(canonicalName, com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null) + ";";
    }

    private final String convertParamClassToJniType(String moduleName, String methodName, Class<?> paramClass) {
        if (AbstractC5504s.c(paramClass, Boolean.TYPE)) {
            return "Z";
        }
        if (AbstractC5504s.c(paramClass, Integer.TYPE)) {
            return "I";
        }
        if (AbstractC5504s.c(paramClass, Double.TYPE)) {
            return "D";
        }
        if (AbstractC5504s.c(paramClass, Float.TYPE)) {
            return "F";
        }
        if (AbstractC5504s.c(paramClass, Boolean.class) || AbstractC5504s.c(paramClass, Integer.class) || AbstractC5504s.c(paramClass, Double.class) || AbstractC5504s.c(paramClass, Float.class) || AbstractC5504s.c(paramClass, String.class) || AbstractC5504s.c(paramClass, Callback.class) || AbstractC5504s.c(paramClass, Promise.class) || AbstractC5504s.c(paramClass, ReadableMap.class) || AbstractC5504s.c(paramClass, ReadableArray.class) || AbstractC5504s.c(paramClass, Dynamic.class)) {
            return convertClassToJniType(paramClass);
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JNI signature. Detected unsupported parameter class: " + paramClass.getCanonicalName());
    }

    private final String convertReturnClassToJniType(String moduleName, String methodName, Class<?> returnClass) {
        if (AbstractC5504s.c(returnClass, Boolean.TYPE)) {
            return "Z";
        }
        if (AbstractC5504s.c(returnClass, Integer.TYPE)) {
            return "I";
        }
        if (AbstractC5504s.c(returnClass, Double.TYPE)) {
            return "D";
        }
        if (AbstractC5504s.c(returnClass, Float.TYPE)) {
            return "F";
        }
        if (AbstractC5504s.c(returnClass, Void.TYPE)) {
            return "V";
        }
        if (AbstractC5504s.c(returnClass, Boolean.class) || AbstractC5504s.c(returnClass, Integer.class) || AbstractC5504s.c(returnClass, Double.class) || AbstractC5504s.c(returnClass, Float.class) || AbstractC5504s.c(returnClass, String.class) || AbstractC5504s.c(returnClass, WritableMap.class) || AbstractC5504s.c(returnClass, WritableArray.class) || AbstractC5504s.c(returnClass, Map.class)) {
            return convertClassToJniType(returnClass);
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JNI signature. Detected unsupported return class: " + returnClass.getCanonicalName());
    }

    private final String createJSIReturnKind(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        for (int i10 = 0; i10 < paramClasses.length; i10++) {
            if (AbstractC5504s.c(paramClasses[i10], Promise.class)) {
                if (i10 == paramClasses.length - 1) {
                    return "PromiseKind";
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Promises must be used as last parameter only.");
            }
        }
        if (AbstractC5504s.c(returnClass, Boolean.TYPE) || AbstractC5504s.c(returnClass, Boolean.class)) {
            return "BooleanKind";
        }
        if (AbstractC5504s.c(returnClass, Double.TYPE) || AbstractC5504s.c(returnClass, Double.class) || AbstractC5504s.c(returnClass, Float.TYPE) || AbstractC5504s.c(returnClass, Float.class) || AbstractC5504s.c(returnClass, Integer.TYPE) || AbstractC5504s.c(returnClass, Integer.class)) {
            return "NumberKind";
        }
        if (AbstractC5504s.c(returnClass, String.class)) {
            return "StringKind";
        }
        if (AbstractC5504s.c(returnClass, Void.TYPE)) {
            return "VoidKind";
        }
        if (AbstractC5504s.c(returnClass, WritableMap.class) || AbstractC5504s.c(returnClass, Map.class)) {
            return "ObjectKind";
        }
        if (AbstractC5504s.c(returnClass, WritableArray.class)) {
            return "ArrayKind";
        }
        throw new ParsingException(moduleName, methodName, "Unable to parse JSI return kind. Detected unsupported return class: " + returnClass.getCanonicalName());
    }

    private final String createJniSignature(String moduleName, String methodName, Class<?>[] paramClasses, Class<?> returnClass) {
        StringBuilder sb2 = new StringBuilder("(");
        for (Class<?> cls : paramClasses) {
            sb2.append(convertParamClassToJniType(moduleName, methodName, cls));
        }
        sb2.append(")");
        sb2.append(convertReturnClassToJniType(moduleName, methodName, returnClass));
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private final int getJsArgCount(String moduleName, String methodName, Class<?>[] paramClasses) {
        for (int i10 = 0; i10 < paramClasses.length; i10++) {
            if (AbstractC5504s.c(paramClasses[i10], Promise.class)) {
                if (i10 == paramClasses.length - 1) {
                    return paramClasses.length - 1;
                }
                throw new ParsingException(moduleName, methodName, "Unable to parse JavaScript arg count. Promises must be used as last parameter only.");
            }
        }
        return paramClasses.length;
    }

    public static final List<MethodDescriptor> getMethodDescriptorsFromModule(NativeModule module) {
        AbstractC5504s.h(module, "module");
        Method[] methodsFromModule = INSTANCE.getMethodsFromModule(module);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Method method : methodsFromModule) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            String name = module.getName();
            AbstractC5504s.g(name, "getName(...)");
            String name2 = method.getName();
            if (reactMethod != null || AbstractC5504s.c("getConstants", name2)) {
                if (hashSet.contains(name2)) {
                    throw new ParsingException(name, "Module exports two methods to JavaScript with the same name: \"" + name2);
                }
                AbstractC5504s.e(name2);
                hashSet.add(name2);
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (AbstractC5504s.c("getConstants", name2)) {
                    if (!AbstractC5504s.c(returnType, Map.class)) {
                        throw new ParsingException(name, "getConstants must return a Map");
                    }
                } else if (reactMethod != null) {
                    boolean zIsBlockingSynchronousMethod = reactMethod.isBlockingSynchronousMethod();
                    Class cls = Void.TYPE;
                    if ((zIsBlockingSynchronousMethod && AbstractC5504s.c(returnType, cls)) || (!reactMethod.isBlockingSynchronousMethod() && !AbstractC5504s.c(returnType, cls))) {
                        throw new ParsingException(name, "TurboModule system assumes returnType == void iff the method is synchronous.");
                    }
                }
                TurboModuleInteropUtils turboModuleInteropUtils = INSTANCE;
                AbstractC5504s.e(parameterTypes);
                AbstractC5504s.e(returnType);
                arrayList.add(new MethodDescriptor(name2, turboModuleInteropUtils.createJniSignature(name, name2, parameterTypes, returnType), turboModuleInteropUtils.createJSIReturnKind(name, name2, parameterTypes, returnType), turboModuleInteropUtils.getJsArgCount(name, name2, parameterTypes)));
            }
        }
        return arrayList;
    }

    private final Method[] getMethodsFromModule(NativeModule module) {
        Class<?> cls = module.getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            superclass = null;
        }
        if (superclass != null && TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC5504s.g(declaredMethods, "getDeclaredMethods(...)");
        return declaredMethods;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "moduleName", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "methodName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ParsingException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(String moduleName, String message) {
            super("Unable to parse @ReactMethod annotations from native module: " + moduleName + ". Details: " + message);
            AbstractC5504s.h(moduleName, "moduleName");
            AbstractC5504s.h(message, "message");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingException(String moduleName, String methodName, String message) {
            super("Unable to parse @ReactMethod annotation from native module method: " + moduleName + "." + methodName + "(). Details: " + message);
            AbstractC5504s.h(moduleName, "moduleName");
            AbstractC5504s.h(methodName, "methodName");
            AbstractC5504s.h(message, "message");
        }
    }
}
