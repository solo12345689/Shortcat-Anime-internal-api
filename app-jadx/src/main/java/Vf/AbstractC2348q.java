package Vf;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2348q extends AbstractC2346p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2348q(Rf.b element) {
        super(element, null);
        AbstractC5504s.h(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Vf.AbstractC2316a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        AbstractC5504s.h(collection, "<this>");
        return collection.size();
    }
}
