package Ra;

import Qa.t;
import Qa.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f15424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f15425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f15426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f15427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f15428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f15429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f15430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f15431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f15432m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t handler) {
        super(handler);
        AbstractC5504s.h(handler, "handler");
        this.f15424e = handler.L();
        this.f15425f = handler.M();
        this.f15426g = handler.J();
        this.f15427h = handler.K();
        this.f15428i = handler.n1();
        this.f15429j = handler.o1();
        this.f15430k = handler.p1();
        this.f15431l = handler.q1();
        this.f15432m = handler.m1();
    }

    @Override // Ra.b
    public void a(WritableMap eventData) {
        AbstractC5504s.h(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", B.g(this.f15424e));
        eventData.putDouble("y", B.g(this.f15425f));
        eventData.putDouble("absoluteX", B.g(this.f15426g));
        eventData.putDouble("absoluteY", B.g(this.f15427h));
        eventData.putDouble("translationX", B.g(this.f15428i));
        eventData.putDouble("translationY", B.g(this.f15429j));
        eventData.putDouble("velocityX", B.g(this.f15430k));
        eventData.putDouble("velocityY", B.g(this.f15431l));
        if (this.f15432m.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f15432m.b());
    }
}
