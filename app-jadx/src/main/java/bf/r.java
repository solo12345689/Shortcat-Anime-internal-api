package bf;

import Td.L;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7223a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r {
    public static final Collection b(Collection collection, Function1 descriptorByHandle) {
        AbstractC5504s.h(collection, "<this>");
        AbstractC5504s.h(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        Af.k kVarA = Af.k.f430c.a();
        while (!linkedList.isEmpty()) {
            Object objM0 = AbstractC2279u.m0(linkedList);
            Af.k kVarA2 = Af.k.f430c.a();
            Collection collectionP = o.p(objM0, linkedList, descriptorByHandle, new q(kVarA2));
            AbstractC5504s.g(collectionP, "extractMembersOverridableInBothWays(...)");
            if (collectionP.size() == 1 && kVarA2.isEmpty()) {
                Object objL0 = AbstractC2279u.L0(collectionP);
                AbstractC5504s.g(objL0, "single(...)");
                kVarA.add(objL0);
            } else {
                Object objL = o.L(collectionP, descriptorByHandle);
                InterfaceC7223a interfaceC7223a = (InterfaceC7223a) descriptorByHandle.invoke(objL);
                for (Object obj : collectionP) {
                    AbstractC5504s.e(obj);
                    if (!o.B(interfaceC7223a, (InterfaceC7223a) descriptorByHandle.invoke(obj))) {
                        kVarA2.add(obj);
                    }
                }
                if (!kVarA2.isEmpty()) {
                    kVarA.addAll(kVarA2);
                }
                kVarA.add(objL);
            }
        }
        return kVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L c(Af.k kVar, Object obj) {
        AbstractC5504s.e(obj);
        kVar.add(obj);
        return L.f17438a;
    }
}
