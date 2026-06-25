package expo.modules.kotlin.jni.decorators;

import Td.L;
import Ub.e;
import X3.a;
import Yb.d;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import dc.AbstractC4580a;
import dc.g;
import dc.r;
import expo.modules.kotlin.jni.Destructible;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import hc.C4930b;
import hc.C4936h;
import hc.C4939k;
import he.AbstractC4945a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import lc.b;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086 ¢\u0006\u0004\b\f\u0010\rJF\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 ¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u001cH\u0086 ¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010%\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0086 ¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010'H\u0086 ¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\b+\u0010,J\\\u00102\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010/2\u0006\u00101\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 ¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0004¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\bJ\u0011\u0010:\u001a\u00020\u000b*\u000209¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u000b*\u0002092\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u000b*\u0002092\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bA\u0010BJ'\u0010G\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u00020\u000b*\u00020D2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bI\u0010JJ!\u0010K\u001a\u00020\u000b*\u00020D2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bK\u0010LJ5\u0010P\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bP\u0010QJ1\u0010T\u001a\u00020\u000b*\u00020N2\u0006\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/NativeMap;", "constants", "LTd/L;", "registerConstants", "(Lcom/facebook/react/bridge/NativeMap;)V", "", "name", "", "takesOwner", "enumerable", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "desiredTypes", "", "cppReturnType", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "body", "registerSyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;ILexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "registerAsyncFunction", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "registerProperty", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;", "registerConstant", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;)V", "jsDecoratorsBridgingObject", "registerObject", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V", "prototypeDecorator", "constructorDecorator", "Ljava/lang/Class;", "ownerClass", "isSharedRef", "registerClass", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;ZLjava/lang/Class;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "k", "(Ljava/lang/String;)V", "finalize", "()V", "a", "Lhc/h;", "e", "(Lhc/h;)V", "objectName", "LUb/d;", "appContext", "f", "(Lhc/h;Ljava/lang/String;LUb/d;)V", "g", "(Lhc/h;LUb/d;)V", "", "LYb/d;", "Llc/b;", "runtime", "d", "(Ljava/util/List;LUb/d;Llc/b;)V", "c", "(LYb/d;LUb/d;Llc/b;)V", "h", "(LYb/d;Ljava/lang/String;LUb/d;)V", "", "Lexpo/modules/kotlin/views/r;", "modulesName", "j", "(Ljava/util/Map;Ljava/lang/String;LUb/d;Llc/b;)V", "moduleName", "viewKey", "i", "(Lexpo/modules/kotlin/views/r;Ljava/lang/String;Ljava/lang/String;LUb/d;Llc/b;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSDecoratorsBridgingObject implements Destructible {
    private final HybridData mHybridData;

    public JSDecoratorsBridgingObject(JNIDeallocator jniDeallocator) {
        AbstractC5504s.h(jniDeallocator, "jniDeallocator");
        this.mHybridData = initHybrid();
        jniDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    public static final Object l(String str, Object[] it) {
        AbstractC5504s.h(it, "it");
        return str;
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void c(d dVar, Ub.d appContext, b runtime) {
        AbstractC5504s.h(dVar, "<this>");
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(runtime, "runtime");
        a.c("[ExpoModulesCore] " + ("Attaching class " + dVar.b()));
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.c());
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(runtime.c());
            jSDecoratorsBridgingObject.e(dVar.c());
            jSDecoratorsBridgingObject.f(dVar.c(), dVar.b(), appContext);
            jSDecoratorsBridgingObject.g(dVar.c(), appContext);
            jSDecoratorsBridgingObject2.h(dVar, dVar.b(), appContext);
            r rVarA = dVar.a();
            InterfaceC6027q interfaceC6027qH = rVarA.h();
            InterfaceC6016f interfaceC6016fC = interfaceC6027qH != null ? interfaceC6027qH.c() : null;
            InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
            registerClass(dVar.b(), jSDecoratorsBridgingObject, jSDecoratorsBridgingObject2, rVarA.i(), interfaceC6014d != null ? AbstractC4945a.b(interfaceC6014d) : null, dVar.e(), (ExpectedType[]) rVarA.e().toArray(new ExpectedType[0]), rVarA.p(dVar.b(), appContext));
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void d(List list, Ub.d appContext, b runtime) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(runtime, "runtime");
        if (list.isEmpty()) {
            return;
        }
        a.c("[ExpoModulesCore] Attaching classes");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c((d) it.next(), appContext, runtime);
            }
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void e(C4936h c4936h) {
        AbstractC5504s.h(c4936h, "<this>");
        Map map = (Map) c4936h.f().invoke();
        if (c4936h.c().isEmpty() && map.isEmpty()) {
            return;
        }
        a.c("[ExpoModulesCore] Exporting constants");
        try {
            if (!map.isEmpty()) {
                registerConstants(Arguments.makeNativeMap((Map<String, ? extends Object>) map));
            }
            Iterator it = c4936h.c().entrySet().iterator();
            while (it.hasNext()) {
                ((C4930b) ((Map.Entry) it.next()).getValue()).b(this);
            }
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void f(C4936h c4936h, String objectName, Ub.d appContext) {
        AbstractC5504s.h(c4936h, "<this>");
        AbstractC5504s.h(objectName, "objectName");
        AbstractC5504s.h(appContext, "appContext");
        e eVarE = c4936h.e();
        if (eVarE.hasNext()) {
            a.c("[ExpoModulesCore] Attaching functions");
            while (eVarE.hasNext()) {
                try {
                    ((AbstractC4580a) eVarE.next()).a(appContext, this, objectName);
                } catch (Throwable th2) {
                    a.f();
                    throw th2;
                }
            }
            L l10 = L.f17438a;
            a.f();
        }
    }

    protected final void finalize() {
        this.mHybridData.resetNative();
    }

    public final void g(C4936h c4936h, Ub.d appContext) {
        AbstractC5504s.h(c4936h, "<this>");
        AbstractC5504s.h(appContext, "appContext");
        if (c4936h.g().isEmpty()) {
            return;
        }
        a.c("[ExpoModulesCore] Attaching properties");
        try {
            Iterator it = c4936h.g().entrySet().iterator();
            while (it.hasNext()) {
                ((C4939k) ((Map.Entry) it.next()).getValue()).c(appContext, this);
            }
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void h(d dVar, String objectName, Ub.d appContext) {
        AbstractC5504s.h(dVar, "<this>");
        AbstractC5504s.h(objectName, "objectName");
        AbstractC5504s.h(appContext, "appContext");
        e eVarD = dVar.d();
        if (eVarD.hasNext()) {
            a.c("[ExpoModulesCore] Attaching static functions");
            while (eVarD.hasNext()) {
                try {
                    ((AbstractC4580a) eVarD.next()).a(appContext, this, objectName);
                } catch (Throwable th2) {
                    a.f();
                    throw th2;
                }
            }
            L l10 = L.f17438a;
            a.f();
        }
    }

    public final void i(expo.modules.kotlin.views.r rVar, String moduleName, String viewKey, Ub.d appContext, b runtime) {
        AbstractC5504s.h(rVar, "<this>");
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(viewKey, "viewKey");
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(runtime, "runtime");
        List listB = rVar.b();
        if (listB.isEmpty()) {
            return;
        }
        a.c("[ExpoModulesCore] " + ("Attaching view prototype for " + rVar.d()));
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.c());
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(appContext, jSDecoratorsBridgingObject, rVar.d());
            }
            if (!AbstractC5504s.c(viewKey, "DEFAULT_MODULE_VIEW")) {
                moduleName = moduleName + "_" + rVar.d();
            }
            registerObject(moduleName, jSDecoratorsBridgingObject);
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void j(Map map, String modulesName, Ub.d appContext, b runtime) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(modulesName, "modulesName");
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(runtime, "runtime");
        if (map.isEmpty()) {
            return;
        }
        a.c("[ExpoModulesCore] Attaching view prototypes");
        try {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(runtime.c());
            for (Map.Entry entry : map.entrySet()) {
                String str = modulesName;
                Ub.d dVar = appContext;
                b bVar = runtime;
                jSDecoratorsBridgingObject.i((expo.modules.kotlin.views.r) entry.getValue(), str, (String) entry.getKey(), dVar, bVar);
                modulesName = str;
                appContext = dVar;
                runtime = bVar;
            }
            registerObject("ViewPrototypes", jSDecoratorsBridgingObject);
            L l10 = L.f17438a;
            a.f();
        } catch (Throwable th2) {
            a.f();
            throw th2;
        }
    }

    public final void k(final String name) {
        AbstractC5504s.h(name, "name");
        registerProperty("__expo_module_name__", false, new ExpectedType[0], new JNIFunctionBody() { // from class: fc.a
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return JSDecoratorsBridgingObject.l(name, objArr);
            }
        }, false, new ExpectedType[0], null);
    }

    public final native void registerAsyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, JNIAsyncFunctionBody body);

    public final native void registerClass(String name, JSDecoratorsBridgingObject prototypeDecorator, JSDecoratorsBridgingObject constructorDecorator, boolean takesOwner, Class<?> ownerClass, boolean isSharedRef, ExpectedType[] desiredTypes, JNIFunctionBody body);

    public final native void registerConstant(String name, JNINoArgsFunctionBody getter);

    public final native void registerConstants(NativeMap constants);

    public final native void registerObject(String name, JSDecoratorsBridgingObject jsDecoratorsBridgingObject);

    public final native void registerProperty(String name, boolean getterTakesOwner, ExpectedType[] getterExpectedType, JNIFunctionBody getter, boolean setterTakesOwner, ExpectedType[] setterExpectedType, JNIFunctionBody setter);

    public final native void registerSyncFunction(String name, boolean takesOwner, boolean enumerable, ExpectedType[] desiredTypes, int cppReturnType, JNIFunctionBody body);
}
