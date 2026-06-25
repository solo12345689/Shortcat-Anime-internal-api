package com.facebook.react.bridge;

import Td.InterfaceC2154e;
import Ud.AbstractC2273n;
import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0002<;B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\r2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001e\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00103\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R \u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u000106\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0013\u0010:\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b9\u0010.¨\u0006="}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper;", "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "Lcom/facebook/react/bridge/JavaModuleWrapper;", "moduleWrapper", "Ljava/lang/reflect/Method;", "method", "", "isSync", "<init>", "(Lcom/facebook/react/bridge/JavaModuleWrapper;Ljava/lang/reflect/Method;Z)V", "LTd/L;", "processArguments", "()V", "", "Ljava/lang/Class;", "paramTypes", "", "buildSignature", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;Z)Ljava/lang/String;", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "buildArgumentExtractors", "([Ljava/lang/Class;)[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "", "calculateJSArgumentsNeeded", "()I", "startIndex", "jsArgumentsNeeded", "getAffectedRange", "(II)Ljava/lang/String;", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "Lcom/facebook/react/bridge/ReadableArray;", "parameters", "invoke", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/JavaModuleWrapper;", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "parameterTypes", "[Ljava/lang/Class;", "paramLength", "I", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "argumentsProcessed", "Z", "argumentExtractors", "[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "internalSignature", "", "arguments", "[Ljava/lang/Object;", "getSignature", "signature", "Companion", "ArgumentExtractor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public final class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN;
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK;
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE;
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC;
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT;
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER;
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP;
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE;
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG;
    private ArgumentExtractor<?>[] argumentExtractors;
    private Object[] arguments;
    private boolean argumentsProcessed;
    private String internalSignature;
    private int jsArgumentsNeeded;
    private final Method method;
    private final JavaModuleWrapper moduleWrapper;
    private final int paramLength;
    private final Class<?>[] parameterTypes;
    private String type;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J'\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "T", "", "<init>", "()V", "getJSArgumentsNeeded", "", "extractArgument", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "jsArguments", "Lcom/facebook/react/bridge/ReadableArray;", "atIndex", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class ArgumentExtractor<T> {
        public abstract T extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u001b2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010 \u001a\u00020\u001b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$Companion;", "", "<init>", "()V", "ARGUMENT_EXTRACTOR_BOOLEAN", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "", "ARGUMENT_EXTRACTOR_DOUBLE", "", "ARGUMENT_EXTRACTOR_FLOAT", "", "ARGUMENT_EXTRACTOR_INTEGER", "", "ARGUMENT_EXTRACTOR_STRING", "", "ARGUMENT_EXTRACTOR_ARRAY", "Lcom/facebook/react/bridge/ReadableArray;", "ARGUMENT_EXTRACTOR_DYNAMIC", "Lcom/facebook/react/bridge/Dynamic;", "ARGUMENT_EXTRACTOR_MAP", "Lcom/facebook/react/bridge/ReadableMap;", "ARGUMENT_EXTRACTOR_CALLBACK", "Lcom/facebook/react/bridge/Callback;", "ARGUMENT_EXTRACTOR_PROMISE", "Lcom/facebook/react/bridge/Promise;", "DEBUG", "paramTypeToChar", "", "paramClass", "Ljava/lang/Class;", "returnTypeToChar", "returnClass", "commonTypeToChar", "typeClass", "createInvokeExceptionMessage", "traceName", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final char commonTypeToChar(Class<?> typeClass) {
            if (AbstractC5504s.c(typeClass, Boolean.TYPE)) {
                return 'z';
            }
            if (AbstractC5504s.c(typeClass, Boolean.class)) {
                return 'Z';
            }
            if (AbstractC5504s.c(typeClass, Integer.TYPE)) {
                return 'i';
            }
            if (AbstractC5504s.c(typeClass, Integer.class)) {
                return 'I';
            }
            if (AbstractC5504s.c(typeClass, Double.TYPE)) {
                return 'd';
            }
            if (AbstractC5504s.c(typeClass, Double.class)) {
                return 'D';
            }
            if (AbstractC5504s.c(typeClass, Float.TYPE)) {
                return 'f';
            }
            if (AbstractC5504s.c(typeClass, Float.class)) {
                return 'F';
            }
            return AbstractC5504s.c(typeClass, String.class) ? 'S' : (char) 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createInvokeExceptionMessage(String traceName) {
            return "Could not invoke " + traceName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char paramTypeToChar(Class<?> paramClass) {
            char cCommonTypeToChar = commonTypeToChar(paramClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (AbstractC5504s.c(paramClass, Callback.class)) {
                return 'X';
            }
            if (AbstractC5504s.c(paramClass, Promise.class)) {
                return 'P';
            }
            if (AbstractC5504s.c(paramClass, ReadableMap.class)) {
                return 'M';
            }
            if (AbstractC5504s.c(paramClass, ReadableArray.class)) {
                return 'A';
            }
            if (AbstractC5504s.c(paramClass, Dynamic.class)) {
                return 'Y';
            }
            throw new RuntimeException("Got unknown param class: " + paramClass.getSimpleName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char returnTypeToChar(Class<?> returnClass) {
            char cCommonTypeToChar = commonTypeToChar(returnClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (AbstractC5504s.c(returnClass, Void.TYPE)) {
                return 'v';
            }
            if (AbstractC5504s.c(returnClass, WritableMap.class)) {
                return 'M';
            }
            if (AbstractC5504s.c(returnClass, WritableArray.class)) {
                return 'A';
            }
            throw new RuntimeException("Got unknown return class: " + returnClass.getSimpleName());
        }

        private Companion() {
        }
    }

    static {
        W6.b.a("JavaMethodWrapper", W6.a.f20778b);
        ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_BOOLEAN$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Boolean extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return Boolean.valueOf(jsArguments.getBoolean(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DOUBLE$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Double extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return Double.valueOf(jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Float extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return Float.valueOf((float) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_INTEGER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Integer extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return Integer.valueOf((int) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_STRING$1
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public String extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return jsArguments.getString(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public ReadableArray extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return jsArguments.getArray(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DYNAMIC$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Dynamic extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return DynamicFromArray.INSTANCE.create(jsArguments, atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_MAP$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public ReadableMap extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return jsArguments.getMap(atIndex);
            }
        };
        ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_CALLBACK$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Callback extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                if (jsArguments.isNull(atIndex)) {
                    return null;
                }
                return new CallbackImpl(jsInstance, (int) jsArguments.getDouble(atIndex));
            }
        };
        ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_PROMISE$1
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public int getJSArgumentsNeeded() {
                return 2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
            public Promise extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
                AbstractC5504s.h(jsInstance, "jsInstance");
                AbstractC5504s.h(jsArguments, "jsArguments");
                return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jsInstance, jsArguments, atIndex), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jsInstance, jsArguments, atIndex + 1));
            }
        };
        DEBUG = K5.c.a().c(L5.a.f11310e);
    }

    public JavaMethodWrapper(JavaModuleWrapper moduleWrapper, Method method, boolean z10) {
        AbstractC5504s.h(moduleWrapper, "moduleWrapper");
        AbstractC5504s.h(method, "method");
        this.moduleWrapper = moduleWrapper;
        this.method = method;
        this.type = BaseJavaModule.METHOD_TYPE_ASYNC;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
        this.parameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.paramLength = length;
        if (z10) {
            setType(BaseJavaModule.METHOD_TYPE_SYNC);
        } else {
            if (length <= 0 || !AbstractC5504s.c(parameterTypes[length - 1], Promise.class)) {
                return;
            }
            setType(BaseJavaModule.METHOD_TYPE_PROMISE);
        }
    }

    private final ArgumentExtractor<?>[] buildArgumentExtractors(Class<?>[] paramTypes) {
        ArgumentExtractor argumentExtractor;
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[paramTypes.length];
        int jSArgumentsNeeded = 0;
        while (jSArgumentsNeeded < paramTypes.length) {
            Class<?> cls = paramTypes[jSArgumentsNeeded];
            if (AbstractC5504s.c(cls, Boolean.class) || AbstractC5504s.c(cls, Boolean.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (AbstractC5504s.c(cls, Integer.class) || AbstractC5504s.c(cls, Integer.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (AbstractC5504s.c(cls, Double.class) || AbstractC5504s.c(cls, Double.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (AbstractC5504s.c(cls, Float.class) || AbstractC5504s.c(cls, Float.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (AbstractC5504s.c(cls, String.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_STRING;
            } else if (AbstractC5504s.c(cls, Callback.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (AbstractC5504s.c(cls, Promise.class)) {
                if (jSArgumentsNeeded != paramTypes.length - 1) {
                    throw new IllegalStateException("Promise must be used as last parameter only");
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_PROMISE;
            } else if (AbstractC5504s.c(cls, ReadableMap.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_MAP;
            } else if (AbstractC5504s.c(cls, ReadableArray.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (!AbstractC5504s.c(cls, Dynamic.class)) {
                    throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            argumentExtractorArr[jSArgumentsNeeded] = argumentExtractor;
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return (ArgumentExtractor[]) AbstractC2273n.E0(argumentExtractorArr);
    }

    private final String buildSignature(Method method, Class<?>[] paramTypes, boolean isSync) {
        StringBuilder sb2 = new StringBuilder(paramTypes.length + 2);
        if (isSync) {
            Companion companion = INSTANCE;
            Class<?> returnType = method.getReturnType();
            AbstractC5504s.g(returnType, "getReturnType(...)");
            sb2.append(companion.returnTypeToChar(returnType));
            sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        } else {
            sb2.append("v.");
        }
        int length = paramTypes.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class<?> cls = paramTypes[i10];
            if (AbstractC5504s.c(cls, Promise.class) && i10 != paramTypes.length - 1) {
                throw new IllegalStateException("Promise must be used as last parameter only");
            }
            sb2.append(INSTANCE.paramTypeToChar(cls));
        }
        return sb2.toString();
    }

    private final int calculateJSArgumentsNeeded() {
        ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
        if (argumentExtractorArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int jSArgumentsNeeded = 0;
        for (ArgumentExtractor<?> argumentExtractor : argumentExtractorArr) {
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return jSArgumentsNeeded;
    }

    private final String getAffectedRange(int startIndex, int jsArgumentsNeeded) {
        if (jsArgumentsNeeded <= 1) {
            return String.valueOf(startIndex);
        }
        return startIndex + "-" + ((jsArgumentsNeeded + startIndex) - 1);
    }

    private final void processArguments() {
        if (this.argumentsProcessed) {
            return;
        }
        U7.b.a(0L, "processArguments").b("method", this.moduleWrapper.getName() + "." + this.method.getName()).c();
        try {
            this.argumentsProcessed = true;
            this.argumentExtractors = buildArgumentExtractors(this.parameterTypes);
            this.internalSignature = buildSignature(this.method, this.parameterTypes, AbstractC5504s.c(getType(), BaseJavaModule.METHOD_TYPE_SYNC));
            this.arguments = new Object[this.parameterTypes.length];
            this.jsArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            U7.b.b(0L).c();
        }
    }

    public final Method getMethod() {
        return this.method;
    }

    public final String getSignature() {
        if (!this.argumentsProcessed) {
            processArguments();
        }
        String str = this.internalSignature;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public String getType() {
        return this.type;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(JSInstance jsInstance, ReadableArray parameters) {
        AbstractC5504s.h(jsInstance, "jsInstance");
        AbstractC5504s.h(parameters, "parameters");
        String str = this.moduleWrapper.getName() + "." + this.method.getName();
        U7.b.a(0L, "callJavaModuleMethod").b("method", str).c();
        if (DEBUG) {
            K5.c.a().a(L5.a.f11310e, "JS->Java: %s.%s()", this.moduleWrapper.getName(), this.method.getName());
        }
        try {
            if (!this.argumentsProcessed) {
                processArguments();
            }
            Object[] objArr = this.arguments;
            if (objArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'arguments' is null.");
            }
            ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
            if (argumentExtractorArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'argumentExtractors' is null.");
            }
            if (this.jsArgumentsNeeded != parameters.size()) {
                throw new JSApplicationCausedNativeException(str + " got " + parameters.size() + " arguments, expected " + this.jsArgumentsNeeded);
            }
            int jSArgumentsNeeded = 0;
            for (int i10 = 0; i10 < argumentExtractorArr.length; i10++) {
                try {
                    objArr[i10] = argumentExtractorArr[i10].extractArgument(jsInstance, parameters, jSArgumentsNeeded);
                    jSArgumentsNeeded += argumentExtractorArr[i10].getJSArgumentsNeeded();
                } catch (UnexpectedNativeTypeException e10) {
                    throw new JSApplicationCausedNativeException(e10.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i10].getJSArgumentsNeeded()) + ")", e10);
                } catch (NullPointerException e11) {
                    throw new JSApplicationCausedNativeException(e11.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i10].getJSArgumentsNeeded()) + ")", e11);
                }
            }
            try {
                this.method.invoke(this.moduleWrapper.getModule(), Arrays.copyOf(objArr, objArr.length));
                U7.b.b(0L).c();
            } catch (IllegalAccessException e12) {
                throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e12);
            } catch (IllegalArgumentException e13) {
                throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e13);
            } catch (InvocationTargetException e14) {
                if (!(e14.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e14);
                }
                Throwable cause = e14.getCause();
                AbstractC5504s.f(cause, "null cannot be cast to non-null type java.lang.RuntimeException");
                throw ((RuntimeException) cause);
            }
        } catch (Throwable th2) {
            U7.b.b(0L).c();
            throw th2;
        }
    }

    public void setType(String str) {
        AbstractC5504s.h(str, "<set-?>");
        this.type = str;
    }
}
