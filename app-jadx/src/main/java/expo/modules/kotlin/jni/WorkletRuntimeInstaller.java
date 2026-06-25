package expo.modules.kotlin.jni;

import Ub.A;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import lc.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/jni/WorkletRuntimeInstaller;", "", "Llc/b;", "runtime", "<init>", "(Llc/b;)V", "Ljava/lang/ref/WeakReference;", "runtimeContextHolder", "", "jsRuntimePointer", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "jniDeallocator", "Lexpo/modules/kotlin/jni/JSIContext;", "install", "(Ljava/lang/ref/WeakReference;JLexpo/modules/kotlin/jni/JNIDeallocator;)Lexpo/modules/kotlin/jni/JSIContext;", "a", "(J)Lexpo/modules/kotlin/jni/JSIContext;", "Llc/b;", "getRuntime", "()Llc/b;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkletRuntimeInstaller {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b runtime;

    public WorkletRuntimeInstaller(b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        this.runtime = runtime;
    }

    private final native JSIContext install(WeakReference<Object> runtimeContextHolder, long jsRuntimePointer, JNIDeallocator jniDeallocator);

    public final JSIContext a(long jsRuntimePointer) {
        return install(A.a(this.runtime), jsRuntimePointer, this.runtime.c());
    }
}
