package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ud.AbstractC2273n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a5\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005\"\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000¨\u0006\t"}, d2 = {"nonEmptySetOf", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "A", "head", "t", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "toNonEmptySetOrNull", "", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class NonEmptySetKt {
    public static final /* synthetic */ NonEmptySet nonEmptySetOf(Object obj, Object... t10) {
        AbstractC5504s.h(t10, "t");
        return new NonEmptySet(obj, (Iterable<? extends Object>) AbstractC2273n.L(t10));
    }

    public static final /* synthetic */ NonEmptySet toNonEmptySetOrNull(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return new NonEmptySet(it.next(), new NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1(it));
        }
        return null;
    }
}
