package com.facebook.react.runtime;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q7.InterfaceC6145c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/runtime/JSTimerExecutor;", "Lcom/facebook/jni/HybridClassBase;", "Lq7/c;", "<init>", "()V", "LTd/L;", "initHybrid", "Lcom/facebook/react/bridge/WritableNativeArray;", "timerIDs", "callTimers", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableArray;", "(Lcom/facebook/react/bridge/WritableArray;)V", "", "frameTime", "callIdleCallbacks", "(D)V", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSTimerExecutor extends HybridClassBase implements InterfaceC6145c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f37183a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSTimerExecutor() {
        initHybrid();
    }

    private final native void callTimers(WritableNativeArray timerIDs);

    private final native void initHybrid();

    @Override // q7.InterfaceC6145c
    public void callTimers(WritableArray timerIDs) {
        AbstractC5504s.h(timerIDs, "timerIDs");
        callTimers((WritableNativeArray) timerIDs);
    }

    @Override // q7.InterfaceC6145c
    public void emitTimeDriftWarning(String warningMessage) {
        AbstractC5504s.h(warningMessage, "warningMessage");
    }

    @Override // q7.InterfaceC6145c
    public void callIdleCallbacks(double frameTime) {
    }
}
