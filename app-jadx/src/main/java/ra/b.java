package Ra;

import Qa.AbstractC2081d;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private final int f15409a;

    /* JADX INFO: renamed from: b */
    private final int f15410b;

    /* JADX INFO: renamed from: c */
    private final int f15411c;

    /* JADX INFO: renamed from: d */
    private final int f15412d;

    public b(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        this.f15409a = handler.O();
        this.f15410b = handler.T();
        this.f15411c = handler.S();
        this.f15412d = handler.Q();
    }

    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f15409a);
        eventData.putInt("handlerTag", this.f15410b);
        eventData.putInt("state", this.f15411c);
        eventData.putInt("pointerType", this.f15412d);
    }
}
