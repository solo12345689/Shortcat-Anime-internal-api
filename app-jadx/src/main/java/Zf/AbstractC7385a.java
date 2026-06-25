package zf;

import Af.j;
import java.util.Collection;
import java.util.LinkedHashSet;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: zf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7385a {
    public static final Collection a(Collection collection, Collection collection2) {
        AbstractC5504s.h(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final j b(Iterable scopes) {
        AbstractC5504s.h(scopes, "scopes");
        j jVar = new j();
        for (Object obj : scopes) {
            InterfaceC5387k interfaceC5387k = (InterfaceC5387k) obj;
            if (interfaceC5387k != null && interfaceC5387k != InterfaceC5387k.b.f51800b) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
