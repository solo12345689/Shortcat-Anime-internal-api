package Ra;

import Qa.u;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f15433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f15434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f15435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f15436h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15433e = handler.b1();
        this.f15434f = handler.Z0();
        this.f15435g = handler.a1();
        this.f15436h = handler.c1();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("scale", this.f15433e);
        eventData.putDouble("focalX", B.g(this.f15434f));
        eventData.putDouble("focalY", B.g(this.f15435g));
        eventData.putDouble("velocity", this.f15436h);
    }
}
