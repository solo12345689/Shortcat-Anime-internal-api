package Ra;

import Qa.m;
import Qa.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e */
    private final float f15413e;

    /* JADX INFO: renamed from: f */
    private final float f15414f;

    /* JADX INFO: renamed from: g */
    private final float f15415g;

    /* JADX INFO: renamed from: h */
    private final float f15416h;

    /* JADX INFO: renamed from: i */
    private final z f15417i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15413e = handler.L();
        this.f15414f = handler.M();
        this.f15415g = handler.J();
        this.f15416h = handler.K();
        this.f15417i = handler.X0();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", B.g(this.f15413e));
        eventData.putDouble("y", B.g(this.f15414f));
        eventData.putDouble("absoluteX", B.g(this.f15415g));
        eventData.putDouble("absoluteY", B.g(this.f15416h));
        if (this.f15417i.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f15417i.b());
    }
}
