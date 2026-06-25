package expo.modules.kotlin.jni;

import Ub.A;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.soloader.SoLoader;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import lc.C5588a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lexpo/modules/kotlin/jni/MainRuntimeInstaller;", "", "Llc/a;", "runtimeContext", "<init>", "(Llc/a;)V", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsInvokerHolder", "Lexpo/modules/kotlin/jni/JSIContext;", "install", "(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;)Lexpo/modules/kotlin/jni/JSIContext;", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;Lcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;", "a", "(JLcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "getCoreModuleObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Llc/a;", "getRuntimeContext", "()Llc/a;", "b", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainRuntimeInstaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5588a runtimeContext;

    static {
        SoLoader.t("expo-modules-core");
    }

    public MainRuntimeInstaller(C5588a runtimeContext) {
        AbstractC5504s.h(runtimeContext, "runtimeContext");
        this.runtimeContext = runtimeContext;
    }

    private final native JSIContext install(WeakReference<Object> runtimeContextHolder, long jsRuntimePointer, JNIDeallocator jniDeallocator, RuntimeExecutor runtimeExecutor);

    private final native JSIContext install(WeakReference<Object> runtimeContextHolder, long jsRuntimePointer, JNIDeallocator jniDeallocator, CallInvokerHolderImpl jsInvokerHolder);

    public final JSIContext a(long jsRuntimePointer, RuntimeExecutor runtimeExecutor) {
        AbstractC5504s.h(runtimeExecutor, "runtimeExecutor");
        return install(A.a(this.runtimeContext), jsRuntimePointer, this.runtimeContext.c(), runtimeExecutor);
    }

    public final JavaScriptModuleObject_ getCoreModuleObject() {
        return this.runtimeContext.h().f();
    }
}
