package Q8;

import R8.AbstractC2113n;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2054b f14409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O8.c f14410b;

    /* synthetic */ G(C2054b c2054b, O8.c cVar, F f10) {
        this.f14409a = c2054b;
        this.f14410b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof G)) {
            G g10 = (G) obj;
            if (AbstractC2113n.a(this.f14409a, g10.f14409a) && AbstractC2113n.a(this.f14410b, g10.f14410b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2113n.b(this.f14409a, this.f14410b);
    }

    public final String toString() {
        return AbstractC2113n.c(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.f14409a).a("feature", this.f14410b).toString();
    }
}
