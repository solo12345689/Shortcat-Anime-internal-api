package Ra;

import Qa.o;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e */
    private final float f15418e;

    /* JADX INFO: renamed from: f */
    private final float f15419f;

    /* JADX INFO: renamed from: g */
    private final float f15420g;

    /* JADX INFO: renamed from: h */
    private final float f15421h;

    /* JADX INFO: renamed from: i */
    private final int f15422i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15418e = handler.L();
        this.f15419f = handler.M();
        this.f15420g = handler.J();
        this.f15421h = handler.K();
        this.f15422i = handler.Y0();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", B.g(this.f15418e));
        eventData.putDouble("y", B.g(this.f15419f));
        eventData.putDouble("absoluteX", B.g(this.f15420g));
        eventData.putDouble("absoluteY", B.g(this.f15421h));
        eventData.putInt("duration", this.f15422i);
    }
}
