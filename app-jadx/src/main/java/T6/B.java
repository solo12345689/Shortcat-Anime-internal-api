package T6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class B extends AbstractC2149b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f17194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f17195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f17196h;

    public B(ReadableMap readableMap) {
        this.f17194f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f17195g = readableMap != null ? readableMap.getDouble(com.amazon.device.iap.internal.c.b.as) : 0.0d;
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "ValueAnimatedNode[" + this.f17203d + "]: value: " + this.f17194f + " offset: " + this.f17195g;
    }

    public final void i() {
        this.f17195g += this.f17194f;
        this.f17194f = 0.0d;
    }

    public final void j() {
        this.f17194f += this.f17195g;
        this.f17195g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f17195g + this.f17194f)) {
            h();
        }
        return this.f17195g + this.f17194f;
    }

    public final void m() {
        c cVar = this.f17196h;
        if (cVar != null) {
            double dL = l();
            double d10 = this.f17195g;
            cVar.a(dL - d10, d10);
        }
    }

    public final void n(c cVar) {
        this.f17196h = cVar;
    }

    public /* synthetic */ B(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }
}
