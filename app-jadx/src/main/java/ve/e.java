package ve;

import Ud.AbstractC2279u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final boolean a(d dVar, InterfaceC7227e classDescriptor) {
        AbstractC5504s.h(dVar, "<this>");
        AbstractC5504s.h(classDescriptor, "classDescriptor");
        if (!bf.i.x(classDescriptor)) {
            return false;
        }
        Set setB = dVar.b();
        Xe.b bVarN = ff.e.n(classDescriptor);
        return AbstractC2279u.e0(setB, bVarN != null ? bVarN.e() : null);
    }
}
