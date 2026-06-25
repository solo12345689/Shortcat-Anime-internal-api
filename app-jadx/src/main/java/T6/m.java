package T6;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends B {

    /* JADX INFO: renamed from: i */
    private final t f17258i;

    /* JADX INFO: renamed from: j */
    private int[] f17259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ReadableMap config, t nativeAnimatedNodesManager) {
        int[] iArr;
        super(null, 1, null);
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17258i = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("input");
        if (array == null) {
            iArr = new int[0];
        } else {
            int size = array.size();
            int[] iArr2 = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr2[i10] = array.getInt(i10);
            }
            iArr = iArr2;
        }
        this.f17259j = iArr;
    }

    @Override // T6.B, T6.AbstractC2149b
    public String e() {
        return "MultiplicationAnimatedNode[" + this.f17203d + "]: input nodes: " + this.f17259j + " - super: " + super.e();
    }

    @Override // T6.AbstractC2149b
    public void h() {
        this.f17194f = 1.0d;
        int length = this.f17259j.length;
        for (int i10 = 0; i10 < length; i10++) {
            AbstractC2149b abstractC2149bK = this.f17258i.k(this.f17259j[i10]);
            if (abstractC2149bK == null || !(abstractC2149bK instanceof B)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
            }
            this.f17194f *= ((B) abstractC2149bK).l();
        }
    }
}
