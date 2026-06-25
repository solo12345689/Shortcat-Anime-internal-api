package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Cf.i;
import Td.z;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import h1.InterfaceC4895a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/timeline/SizeParameterProvider;", "Lh1/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "<init>", "()V", "", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "allSizeConstraints", "Ljava/util/List;", "LCf/i;", "values", "LCf/i;", "getValues", "()LCf/i;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeParameterProvider implements InterfaceC4895a {
    private final List<SizeConstraint> allSizeConstraints;
    private final i values;

    public SizeParameterProvider() {
        List<SizeConstraint> listP = AbstractC2279u.p(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(200, null));
        this.allSizeConstraints = listP;
        ArrayList<Pair> arrayList = new ArrayList();
        for (SizeConstraint sizeConstraint : listP) {
            List<SizeConstraint> list = this.allSizeConstraints;
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(z.a(sizeConstraint, (SizeConstraint) it.next()));
            }
            AbstractC2279u.D(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList3.add(new Size((SizeConstraint) pair.getFirst(), (SizeConstraint) pair.getSecond()));
        }
        this.values = AbstractC2279u.c0(arrayList3);
    }

    @Override // h1.InterfaceC4895a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // h1.InterfaceC4895a
    public i getValues() {
        return this.values;
    }
}
