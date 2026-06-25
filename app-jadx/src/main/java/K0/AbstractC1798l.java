package K0;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: K0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1798l {
    public static final View a(InterfaceC1794j interfaceC1794j) {
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = N.b(AbstractC1796k.n(interfaceC1794j));
        AbstractC5504s.f(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
