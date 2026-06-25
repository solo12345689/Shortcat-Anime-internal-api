package expo.modules.kotlin.jni;

import Ub.f;
import com.amazon.a.a.o.b;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5968J;
import pc.C5969K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\u00020\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060 H\u0086\u0002¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0004¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bH\u0082 ¢\u0006\u0004\b*\u0010\fJ\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b*\u0010\u0010J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b*\u0010\u0013J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b*\u0010\u0016J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0082 ¢\u0006\u0004\b*\u0010\u0019J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u001aH\u0082 ¢\u0006\u0004\b*\u0010\u001cJ \u0010*\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0082 ¢\u0006\u0004\b*\u0010\u001fJ&\u0010*\u001a\u00020\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060 H\u0082 ¢\u0006\u0004\b*\u0010\"J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020+H\u0082 ¢\u0006\u0004\b*\u0010,J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020-H\u0082 ¢\u0006\u0004\b*\u0010.J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020/H\u0082 ¢\u0006\u0004\b*\u00100J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u000201H\u0082 ¢\u0006\u0004\b*\u00102J\u0018\u0010*\u001a\u00020\b2\u0006\u0010\u000e\u001a\u000203H\u0082 ¢\u0006\u0004\b*\u00104J \u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0082 ¢\u0006\u0004\b*\u0010&J\u0018\u00106\u001a\u00020\b2\u0006\u0010\u000e\u001a\u000205H\u0082 ¢\u0006\u0004\b6\u00107J\u0018\u00109\u001a\u00020\b2\u0006\u0010\u000e\u001a\u000208H\u0082 ¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020;H\u0082 ¢\u0006\u0004\b<\u0010=J\u0018\u0010?\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020>H\u0082 ¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010A¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/jni/JavaCallback;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "value", "LTd/L;", "f", "(Ljava/lang/Object;)V", "b", "()V", "", "result", "e", "(I)V", "", "k", "(Z)V", "", "c", "(D)V", "", "d", "(F)V", "", "g", "(Ljava/lang/String;)V", "", "i", "(Ljava/util/Collection;)V", "", "j", "(Ljava/util/Map;)V", "code", b.f34648f, "h", "(Ljava/lang/String;Ljava/lang/String;)V", "finalize", "a", "()Lcom/facebook/jni/HybridData;", "invokeNative", "Lcom/facebook/react/bridge/WritableNativeArray;", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableNativeMap;", "(Lcom/facebook/react/bridge/WritableNativeMap;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "(Lexpo/modules/kotlin/sharedobjects/SharedObject;)V", "Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "(Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;)V", "Lexpo/modules/kotlin/jni/NativeArrayBuffer;", "(Lexpo/modules/kotlin/jni/NativeArrayBuffer;)V", "", "invokeIntArray", "([I)V", "", "invokeLongArray", "([J)V", "", "invokeFloatArray", "([F)V", "", "invokeDoubleArray", "([D)V", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaCallback implements Destructible {
    private final HybridData mHybridData;

    public JavaCallback(HybridData mHybridData) {
        AbstractC5504s.h(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void invokeDoubleArray(double[] result);

    private final native void invokeFloatArray(float[] result);

    private final native void invokeIntArray(int[] result);

    private final native void invokeLongArray(long[] result);

    private final native void invokeNative();

    private final native void invokeNative(double result);

    private final native void invokeNative(float result);

    private final native void invokeNative(int result);

    private final native void invokeNative(WritableNativeArray result);

    private final native void invokeNative(WritableNativeMap result);

    private final native void invokeNative(JavaScriptArrayBuffer result);

    private final native void invokeNative(NativeArrayBuffer result);

    private final native void invokeNative(SharedObject result);

    private final native void invokeNative(String result);

    private final native void invokeNative(String code, String str);

    private final native void invokeNative(Collection<? extends Object> result);

    private final native void invokeNative(Map<String, ? extends Object> result);

    private final native void invokeNative(boolean result);

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void b() {
        try {
            invokeNative();
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void c(double result) {
        try {
            invokeNative(result);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void d(float result) {
        try {
            invokeNative(result);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void e(int result) {
        try {
            invokeNative(result);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void f(Object value) {
        try {
            Object objB = C5969K.b(C5969K.f55891a, value, null, true, 2, null);
            if (objB == null) {
                invokeNative();
                return;
            }
            if (objB instanceof Integer) {
                invokeNative(((Number) objB).intValue());
                return;
            }
            if (objB instanceof Boolean) {
                invokeNative(((Boolean) objB).booleanValue());
                return;
            }
            if (objB instanceof Double) {
                invokeNative(((Number) objB).doubleValue());
                return;
            }
            if (objB instanceof Float) {
                invokeNative(((Number) objB).floatValue());
                return;
            }
            if (objB instanceof String) {
                invokeNative((String) objB);
                return;
            }
            if (objB instanceof Collection) {
                invokeNative((Collection<? extends Object>) objB);
                return;
            }
            if (objB instanceof Map) {
                invokeNative((Map<String, ? extends Object>) objB);
                return;
            }
            if (objB instanceof WritableNativeArray) {
                invokeNative((WritableNativeArray) objB);
                return;
            }
            if (objB instanceof WritableNativeMap) {
                invokeNative((WritableNativeMap) objB);
                return;
            }
            if (objB instanceof SharedObject) {
                invokeNative((SharedObject) objB);
                return;
            }
            if (objB instanceof JavaScriptArrayBuffer) {
                invokeNative((JavaScriptArrayBuffer) objB);
                return;
            }
            if (objB instanceof NativeArrayBuffer) {
                invokeNative((NativeArrayBuffer) objB);
                return;
            }
            if (objB instanceof int[]) {
                invokeIntArray((int[]) objB);
                return;
            }
            if (objB instanceof long[]) {
                invokeLongArray((long[]) objB);
                return;
            }
            if (objB instanceof float[]) {
                invokeFloatArray((float[]) objB);
                return;
            }
            if (objB instanceof double[]) {
                invokeDoubleArray((double[]) objB);
                return;
            }
            throw new UnexpectedException("Unknown type: " + objB.getClass());
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    protected final void finalize() {
        this.mHybridData.resetNative();
    }

    public final void g(String result) {
        AbstractC5504s.h(result, "result");
        try {
            invokeNative(result);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void h(String code, String str) {
        AbstractC5504s.h(code, "code");
        AbstractC5504s.h(str, "errorMessage");
        try {
            invokeNative(code, str);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void i(Collection result) {
        AbstractC5504s.h(result, "result");
        try {
            invokeNative(AbstractC5968J.s(result));
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void j(Map result) {
        AbstractC5504s.h(result, "result");
        try {
            invokeNative(AbstractC5968J.u(result));
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }

    public final void k(boolean result) {
        try {
            invokeNative(result);
        } catch (Throwable th2) {
            if (this.mHybridData.isValid()) {
                throw th2;
            }
            f.a().b("Invalidated JavaCallback was invoked", th2);
        }
    }
}
