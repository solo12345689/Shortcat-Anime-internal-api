package expo.modules.kotlin.jni.worklets;

import com.facebook.jni.HybridData;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;", "", "", "jsRuntimePointer", "<init>", "(J)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "(J)Lcom/facebook/jni/HybridData;", "a", "Lcom/facebook/jni/HybridData;", "mHybridData", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkletNativeRuntime {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HybridData mHybridData;

    public WorkletNativeRuntime(long j10) {
        this.mHybridData = initHybrid(j10);
    }

    public final native HybridData initHybrid(long jsRuntimePointer);
}
