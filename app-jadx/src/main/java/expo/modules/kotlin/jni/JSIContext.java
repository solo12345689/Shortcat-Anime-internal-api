package expo.modules.kotlin.jni;

import Ub.d;
import Ub.r;
import Ub.s;
import com.facebook.jni.HybridData;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import lc.b;
import nc.C5775b;
import nc.C5776c;
import nc.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0%H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u00102\n\u0010)\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u0004\u0018\u00010\u00132\n\u0010)\u001a\u0006\u0012\u0002\b\u000300H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0004¢\u0006\u0004\b5\u0010\u0018J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u0018J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/Destructible;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcom/facebook/jni/HybridData;", "mHybridData", "Ljava/lang/ref/WeakReference;", "Llc/b;", "runtimeHolder", "<init>", "(Lcom/facebook/jni/HybridData;Ljava/lang/ref/WeakReference;)V", "", "script", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "evaluateScript", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "LTd/L;", "evaluateVoidScript", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "global", "()Lexpo/modules/kotlin/jni/JavaScriptObject;", "createObject", "drainJSEventLoop", "()V", "", DiagnosticsEntry.ID_KEY, "js", "setNativeStateForSharedObject", "(ILexpo/modules/kotlin/jni/JavaScriptObject;)V", "name", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getJavaScriptModuleObject", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "", "hasModule", "(Ljava/lang/String;)Z", "", "getJavaScriptModulesName", "()[Ljava/lang/String;", "", "native", "registerSharedObject", "(Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getSharedObject", "(I)Lexpo/modules/kotlin/jni/JavaScriptObject;", "deleteSharedObject", "(I)V", "Ljava/lang/Class;", "registerClass", "(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "getJavascriptClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;", "finalize", "close", "a", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "Ljava/lang/ref/WeakReference;", "getRuntimeHolder", "()Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSIContext implements Destructible, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference runtimeHolder;
    private final HybridData mHybridData;

    public JSIContext(HybridData mHybridData, WeakReference<b> runtimeHolder) {
        AbstractC5504s.h(mHybridData, "mHybridData");
        AbstractC5504s.h(runtimeHolder, "runtimeHolder");
        this.mHybridData = mHybridData;
        this.runtimeHolder = runtimeHolder;
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final native JavaScriptObject createObject();

    public final void deleteSharedObject(int id2) {
        e eVarE;
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (eVarE = bVar.e()) == null) {
            return;
        }
        eVarE.b(C5776c.b(id2));
    }

    public final native void drainJSEventLoop();

    public final native JavaScriptValue evaluateScript(String script);

    public final native void evaluateVoidScript(String script);

    protected final void finalize() {
        close();
    }

    public final JavaScriptModuleObject_ getJavaScriptModuleObject(String name) {
        d dVarA;
        s sVarC;
        r rVarR;
        AbstractC5504s.h(name, "name");
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (dVarA = bVar.a()) == null || (sVarC = dVarA.C()) == null || (rVarR = sVarC.r(name)) == null) {
            return null;
        }
        return rVarR.f();
    }

    public final String[] getJavaScriptModulesName() {
        d dVarA;
        s sVarC;
        Map mapT;
        Set setKeySet;
        String[] strArr;
        b bVar = (b) this.runtimeHolder.get();
        return (bVar == null || (dVarA = bVar.a()) == null || (sVarC = dVarA.C()) == null || (mapT = sVarC.t()) == null || (setKeySet = mapT.keySet()) == null || (strArr = (String[]) setKeySet.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final JavaScriptObject getJavascriptClass(Class<?> cls) {
        C5775b c5775bB;
        AbstractC5504s.h(cls, "native");
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (c5775bB = bVar.b()) == null) {
            return null;
        }
        return c5775bB.e(cls);
    }

    public final JavaScriptObject getSharedObject(int id2) {
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null) {
            return null;
        }
        return C5776c.e(C5776c.b(id2), bVar);
    }

    public final native JavaScriptObject global();

    public final boolean hasModule(String name) {
        d dVarA;
        s sVarC;
        AbstractC5504s.h(name, "name");
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (dVarA = bVar.a()) == null || (sVarC = dVarA.C()) == null) {
            return false;
        }
        return sVarC.v(name);
    }

    public final void registerClass(Class<?> cls, JavaScriptObject js) {
        C5775b c5775bB;
        AbstractC5504s.h(cls, "native");
        AbstractC5504s.h(js, "js");
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (c5775bB = bVar.b()) == null) {
            return;
        }
        c5775bB.b(cls, js);
    }

    public final void registerSharedObject(Object obj, JavaScriptObject js) {
        e eVarE;
        AbstractC5504s.h(obj, "native");
        AbstractC5504s.h(js, "js");
        b bVar = (b) this.runtimeHolder.get();
        if (bVar == null || (eVarE = bVar.e()) == null) {
            return;
        }
        C5776c.a(eVarE.a((SharedObject) obj, js));
    }

    public final native void setNativeStateForSharedObject(int id2, JavaScriptObject js);
}
