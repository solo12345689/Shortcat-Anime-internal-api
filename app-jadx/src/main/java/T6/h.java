package T6;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends B {

    /* JADX INFO: renamed from: i */
    private final t f17224i;

    /* JADX INFO: renamed from: j */
    private final int f17225j;

    /* JADX INFO: renamed from: k */
    private final double f17226k;

    /* JADX INFO: renamed from: l */
    private final double f17227l;

    /* JADX INFO: renamed from: m */
    private double f17228m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReadableMap config, t nativeAnimatedNodesManager) {
        super(null, 1, null);
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17224i = nativeAnimatedNodesManager;
        this.f17225j = config.getInt("input");
        this.f17226k = config.getDouble("min");
        this.f17227l = config.getDouble("max");
        this.f17194f = this.f17228m;
    }

    private final double o() {
        AbstractC2149b abstractC2149bK = this.f17224i.k(this.f17225j);
        if (abstractC2149bK == null || !(abstractC2149bK instanceof B)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((B) abstractC2149bK).l();
    }

    @Override // T6.B, T6.AbstractC2149b
    public String e() {
        return "DiffClampAnimatedNode[" + this.f17203d + "]: InputNodeTag: " + this.f17225j + " min: " + this.f17226k + " max: " + this.f17227l + " lastValue: " + this.f17228m + " super: " + super.e();
    }

    @Override // T6.AbstractC2149b
    public void h() {
        double dO = o();
        double d10 = dO - this.f17228m;
        this.f17228m = dO;
        this.f17194f = Math.min(Math.max(this.f17194f + d10, this.f17226k), this.f17227l);
    }
}
