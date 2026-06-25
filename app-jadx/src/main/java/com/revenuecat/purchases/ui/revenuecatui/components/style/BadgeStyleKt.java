package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u00052$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0007H\u0000¨\u0006\n"}, d2 = {"toBadgeStyle", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "createStackComponentStyle", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BadgeStyleKt {
    public static final /* synthetic */ Result toBadgeStyle(Badge badge, Function1 createStackComponentStyle) {
        AbstractC5504s.h(badge, "<this>");
        AbstractC5504s.h(createStackComponentStyle, "createStackComponentStyle");
        Result result = (Result) createStackComponentStyle.invoke(badge.getStack());
        if (result instanceof Result.Success) {
            return new Result.Success(new BadgeStyle((StackComponentStyle) ((Result.Success) result).getValue(), badge.getStyle(), badge.getAlignment()));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new r();
    }
}
