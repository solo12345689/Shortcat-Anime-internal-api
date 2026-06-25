package expo.modules.kotlin.jni.worklets;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\nJ0\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 ¢\u0006\u0004\b\t\u0010\rJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000e\u0010\nJ0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/Worklet;", "", "Lexpo/modules/kotlin/jni/worklets/Serializable;", "serializable", "<init>", "(Lexpo/modules/kotlin/jni/worklets/Serializable;)V", "Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "workletNativeRuntime", "LTd/L;", "schedule", "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;)V", "", "args", "(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;Lexpo/modules/kotlin/jni/worklets/Serializable;[Ljava/lang/Object;)V", "execute", "a", "Lexpo/modules/kotlin/jni/worklets/Serializable;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Worklet {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Serializable serializable;

    public Worklet(Serializable serializable) {
        AbstractC5504s.h(serializable, "serializable");
        this.serializable = serializable;
    }

    private final native void execute(WorkletNativeRuntime workletNativeRuntime, Serializable serializable);

    private final native void execute(WorkletNativeRuntime workletNativeRuntime, Serializable serializable, Object[] args);

    private final native void schedule(WorkletNativeRuntime workletNativeRuntime, Serializable serializable);

    private final native void schedule(WorkletNativeRuntime workletNativeRuntime, Serializable serializable, Object[] args);
}
