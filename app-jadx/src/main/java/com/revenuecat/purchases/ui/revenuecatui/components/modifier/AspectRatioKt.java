package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "aspectRatio", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/e;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class AspectRatioKt {
    public static final /* synthetic */ e aspectRatio(e eVar, AspectRatio aspectRatio) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(aspectRatio, "aspectRatio");
        return eVar.then(c.a(e.f26613a, aspectRatio.getRatio(), aspectRatio.getMatchHeightConstraintsFirst()));
    }
}
