package T6;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends B {

    /* JADX INFO: renamed from: i */
    private final t f17229i;

    /* JADX INFO: renamed from: j */
    private final int[] f17230j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReadableMap config, t nativeAnimatedNodesManager) {
        int[] iArr;
        super(null, 1, null);
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17229i = nativeAnimatedNodesManager;
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
        this.f17230j = iArr;
    }

    @Override // T6.B, T6.AbstractC2149b
    public String e() {
        return "DivisionAnimatedNode[" + this.f17203d + "]: input nodes: " + this.f17230j + " - super: " + super.e();
    }

    @Override // T6.AbstractC2149b
    public void h() {
        int[] iArr = this.f17230j;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            AbstractC2149b abstractC2149bK = this.f17229i.k(iArr[i10]);
            if (abstractC2149bK == null || !(abstractC2149bK instanceof B)) {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f17203d);
            }
            double d10 = ((B) abstractC2149bK).f17194f;
            if (i11 == 0) {
                this.f17194f = d10;
            } else {
                if (d10 == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f17203d);
                }
                this.f17194f /= d10;
            }
            i10++;
            i11 = i12;
        }
    }
}
