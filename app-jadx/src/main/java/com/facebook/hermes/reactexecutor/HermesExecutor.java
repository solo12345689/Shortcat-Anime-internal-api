package com.facebook.hermes.reactexecutor;

import Y6.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/hermes/reactexecutor/HermesExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "", "enableDebugger", "", "debuggerName", "<init>", "(ZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f35960b;

    /* JADX INFO: renamed from: com.facebook.hermes.reactexecutor.HermesExecutor$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HybridData initHybrid(boolean z10, String str, long j10) {
            return HermesExecutor.initHybrid(z10, str, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData initHybridDefaultConfig(boolean z10, String str) {
            return HermesExecutor.initHybridDefaultConfig(z10, str);
        }

        public final void b() {
            if (HermesExecutor.f35960b == null) {
                SoLoader.t("hermesvm");
                SoLoader.t("hermes_executor");
                HermesExecutor.f35960b = a.f22860b ? "Debug" : "Release";
            }
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        companion.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HermesExecutor(boolean z10, String debuggerName) {
        super(INSTANCE.initHybridDefaultConfig(z10, debuggerName));
        AbstractC5504s.h(debuggerName, "debuggerName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(boolean z10, String str, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybridDefaultConfig(boolean z10, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f35960b;
    }
}
