package Ra;

import Qa.q;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e */
    private final boolean f15423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15423e = handler.f0();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putBoolean("pointerInside", this.f15423e);
    }
}
