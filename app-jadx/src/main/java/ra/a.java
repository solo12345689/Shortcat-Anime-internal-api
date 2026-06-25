package Ra;

import Qa.C2079b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e */
    private final float f15405e;

    /* JADX INFO: renamed from: f */
    private final float f15406f;

    /* JADX INFO: renamed from: g */
    private final float f15407g;

    /* JADX INFO: renamed from: h */
    private final float f15408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C2079b handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15405e = handler.L();
        this.f15406f = handler.M();
        this.f15407g = handler.J();
        this.f15408h = handler.K();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", B.g(this.f15405e));
        eventData.putDouble("y", B.g(this.f15406f));
        eventData.putDouble("absoluteX", B.g(this.f15407g));
        eventData.putDouble("absoluteY", B.g(this.f15408h));
    }
}
