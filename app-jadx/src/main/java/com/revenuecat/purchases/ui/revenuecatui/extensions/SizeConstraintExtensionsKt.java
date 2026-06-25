package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "Li1/h;", "dpOrNull", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)Li1/h;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class SizeConstraintExtensionsKt {
    public static final /* synthetic */ C5015h dpOrNull(SizeConstraint sizeConstraint) {
        AbstractC5504s.h(sizeConstraint, "<this>");
        if (sizeConstraint instanceof SizeConstraint.Fixed) {
            return C5015h.h(C5015h.n(((SizeConstraint.Fixed) sizeConstraint).getValue()));
        }
        if ((sizeConstraint instanceof SizeConstraint.Fill) || (sizeConstraint instanceof SizeConstraint.Fit)) {
            return null;
        }
        throw new r();
    }
}
