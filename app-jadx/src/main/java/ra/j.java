package Ra;

import Qa.B;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e */
    private final float f15441e;

    /* JADX INFO: renamed from: f */
    private final float f15442f;

    /* JADX INFO: renamed from: g */
    private final float f15443g;

    /* JADX INFO: renamed from: h */
    private final float f15444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15441e = handler.L();
        this.f15442f = handler.M();
        this.f15443g = handler.J();
        this.f15444h = handler.K();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", com.facebook.react.uimanager.B.g(this.f15441e));
        eventData.putDouble("y", com.facebook.react.uimanager.B.g(this.f15442f));
        eventData.putDouble("absoluteX", com.facebook.react.uimanager.B.g(this.f15443g));
        eventData.putDouble("absoluteY", com.facebook.react.uimanager.B.g(this.f15444h));
    }
}
