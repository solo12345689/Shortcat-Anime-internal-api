package p6;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: p6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5934a implements JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f55810a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f55811b = "";

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(this.f55810a, this.f55811b);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String filename) {
        AbstractC5504s.h(filename, "filename");
        HermesSamplingProfiler.dumpSampledTraceToFile(filename);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }
}
