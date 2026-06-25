package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import C.A;
import androidx.compose.foundation.layout.p;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "LC/A;", "toPaddingValues", "(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;)LC/A;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class PaddingKt {
    public static final /* synthetic */ A toPaddingValues(Padding padding) {
        AbstractC5504s.h(padding, "<this>");
        return p.d(C5015h.n((float) padding.getLeading()), C5015h.n((float) padding.getTop()), C5015h.n((float) padding.getTrailing()), C5015h.n((float) padding.getBottom()));
    }
}
