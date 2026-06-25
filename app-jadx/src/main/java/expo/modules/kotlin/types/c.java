package expo.modules.kotlin.types;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import pc.P;
import pc.X;
import pc.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final X a(X x10, X otherProvider) {
        AbstractC5504s.h(x10, "<this>");
        AbstractC5504s.h(otherProvider, "otherProvider");
        return new P(AbstractC2279u.p(x10, otherProvider));
    }

    public static final X b(X x10) {
        X xA;
        return (x10 == null || (xA = a(x10, a0.f55913a)) == null) ? a0.f55913a : xA;
    }
}
