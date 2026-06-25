package T6;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends AbstractC2149b {

    /* JADX INFO: renamed from: f */
    private final t f17314f;

    /* JADX INFO: renamed from: g */
    private final JavaOnlyMap f17315g;

    /* JADX INFO: renamed from: h */
    private final int f17316h;

    /* JADX INFO: renamed from: i */
    private final int f17317i;

    /* JADX INFO: renamed from: j */
    private final int f17318j;

    public z(ReadableMap config, t nativeAnimatedNodesManager) {
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17314f = nativeAnimatedNodesManager;
        this.f17315g = JavaOnlyMap.INSTANCE.deepClone(config.getMap("animationConfig"));
        this.f17316h = config.getInt("animationId");
        this.f17317i = config.getInt("toValue");
        this.f17318j = config.getInt("value");
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "TrackingAnimatedNode[" + this.f17203d + "]: animationID: " + this.f17316h + " toValueNode: " + this.f17317i + " valueNode: " + this.f17318j + " animationConfig: " + this.f17315g;
    }

    @Override // T6.AbstractC2149b
    public void h() {
        AbstractC2149b abstractC2149bK = this.f17314f.k(this.f17317i);
        B b10 = abstractC2149bK instanceof B ? (B) abstractC2149bK : null;
        if (b10 != null) {
            this.f17315g.putDouble("toValue", b10.l());
        } else {
            this.f17315g.putNull("toValue");
        }
        this.f17314f.x(this.f17316h, this.f17318j, this.f17315g, null);
    }
}
