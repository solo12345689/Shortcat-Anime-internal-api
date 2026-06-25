package com.facebook.react.bridge;

import Td.InterfaceC2154e;
import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u00162\u00060\u0001j\u0002`\u0002:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;", "delegate", "<init>", "(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)V", "Ljava/util/concurrent/Executor;", "executor", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Ljava/util/concurrent/Executor;Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)Lcom/facebook/jni/HybridData;", "LTd/L;", "sendDebuggerResumeCommand", "()V", "close", "", "isValid", "()Z", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "TargetDelegate", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public final class ReactInstanceManagerInspectorTarget implements AutoCloseable {
    private static final Companion Companion = new Companion(null);
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;", "", "", "", "getMetadata", "()Ljava/util/Map;", "LTd/L;", "onReload", "()V", "message", "onSetPausedInDebuggerMessage", "(Ljava/lang/String;)V", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "listener", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TargetDelegate {
        Map<String, String> getMetadata();

        void loadNetworkResource(String url, InspectorNetworkRequestListener listener);

        void onReload();

        void onSetPausedInDebuggerMessage(String message);
    }

    static {
        W6.b.a("ReactInstanceManagerInspectorTarget", W6.a.f20777a);
        ReactNativeJNISoLoader.staticInit();
    }

    public ReactInstanceManagerInspectorTarget(TargetDelegate delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.mHybridData = initHybrid(new Executor() { // from class: com.facebook.react.bridge.v
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
            }
        }, delegate);
    }

    private final native HybridData initHybrid(Executor executor, TargetDelegate delegate);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mHybridData$lambda$0(Runnable runnable) {
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            AbstractC5504s.e(runnable);
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final native void sendDebuggerResumeCommand();

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
