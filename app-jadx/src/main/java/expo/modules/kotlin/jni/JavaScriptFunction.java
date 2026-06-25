package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u0011\b\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0017\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", "", "ReturnType", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "thisValue", "", "args", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedReturnType", "invoke", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", "LTd/L;", "finalize", "()V", "a", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "Lpe/q;", "Lpe/q;", "getReturnType", "()Lpe/q;", "b", "(Lpe/q;)V", "getReturnType$annotations", "returnType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaScriptFunction<ReturnType> implements Destructible {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6027q returnType;
    private final HybridData mHybridData;

    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void b(InterfaceC6027q interfaceC6027q) {
        this.returnType = interfaceC6027q;
    }

    protected final void finalize() {
        this.mHybridData.resetNative();
    }
}
