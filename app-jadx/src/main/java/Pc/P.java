package pc;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class P implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f55902a;

    public P(List providers) {
        AbstractC5504s.h(providers, "providers");
        this.f55902a = providers;
    }

    @Override // pc.X
    public expo.modules.kotlin.types.b a(InterfaceC6027q type) throws cc.r {
        AbstractC5504s.h(type, "type");
        Iterator it = this.f55902a.iterator();
        while (it.hasNext()) {
            try {
                return ((X) it.next()).a(type);
            } catch (cc.r unused) {
            }
        }
        throw new cc.r(type);
    }
}
