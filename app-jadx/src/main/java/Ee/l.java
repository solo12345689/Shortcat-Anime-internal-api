package Ee;

import Ee.AbstractC1529h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends AbstractC1529h implements Oe.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f5939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Xe.f fVar, Object[] values) {
        super(fVar, null);
        AbstractC5504s.h(values, "values");
        this.f5939c = values;
    }

    @Override // Oe.e
    public List c() {
        Object[] objArr = this.f5939c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC1529h.a aVar = AbstractC1529h.f5936b;
            AbstractC5504s.e(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
