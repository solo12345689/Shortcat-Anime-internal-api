package bf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import ye.AbstractC7241t;
import ye.InterfaceC7224b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w {
    public static final InterfaceC7224b a(Collection descriptors) {
        Integer numD;
        AbstractC5504s.h(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC7224b interfaceC7224b = null;
        while (it.hasNext()) {
            InterfaceC7224b interfaceC7224b2 = (InterfaceC7224b) it.next();
            if (interfaceC7224b == null || ((numD = AbstractC7241t.d(interfaceC7224b.getVisibility(), interfaceC7224b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC7224b = interfaceC7224b2;
            }
        }
        AbstractC5504s.e(interfaceC7224b);
        return interfaceC7224b;
    }
}
