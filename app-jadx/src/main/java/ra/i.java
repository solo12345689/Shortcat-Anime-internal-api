package Ra;

import Qa.x;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f15437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f15438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f15439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f15440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15437e = handler.Y0();
        this.f15438f = handler.W0();
        this.f15439g = handler.X0();
        this.f15440h = handler.Z0();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("rotation", this.f15437e);
        eventData.putDouble("anchorX", B.g(this.f15438f));
        eventData.putDouble("anchorY", B.g(this.f15439g));
        eventData.putDouble("velocity", this.f15440h);
    }
}
