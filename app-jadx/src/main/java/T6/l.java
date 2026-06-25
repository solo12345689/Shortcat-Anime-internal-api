package T6;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends B {

    /* JADX INFO: renamed from: i */
    private final t f17255i;

    /* JADX INFO: renamed from: j */
    private final int f17256j;

    /* JADX INFO: renamed from: k */
    private final double f17257k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ReadableMap config, t nativeAnimatedNodesManager) {
        super(null, 1, null);
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17255i = nativeAnimatedNodesManager;
        this.f17256j = config.getInt("input");
        this.f17257k = config.getDouble("modulus");
    }

    @Override // T6.B, T6.AbstractC2149b
    public String e() {
        return "NativeAnimatedNodesManager[" + this.f17203d + "] inputNode: " + this.f17256j + " modulus: " + this.f17257k + " super: " + super.e();
    }

    @Override // T6.AbstractC2149b
    public void h() {
        AbstractC2149b abstractC2149bK = this.f17255i.k(this.f17256j);
        if (!(abstractC2149bK instanceof B)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dL = ((B) abstractC2149bK).l();
        double d10 = this.f17257k;
        this.f17194f = ((dL % d10) + d10) % d10;
    }
}
