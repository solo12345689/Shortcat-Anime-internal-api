package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Td.r;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Lz/q;", "toOrientation", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;)Lz/q;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class OverflowExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackComponent.Overflow.values().length];
            try {
                iArr[StackComponent.Overflow.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackComponent.Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ q toOrientation(StackComponent.Overflow overflow, Dimension dimension) {
        AbstractC5504s.h(overflow, "<this>");
        AbstractC5504s.h(dimension, "dimension");
        int i10 = WhenMappings.$EnumSwitchMapping$0[overflow.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            throw new r();
        }
        if (dimension instanceof Dimension.Horizontal) {
            return q.Horizontal;
        }
        if (dimension instanceof Dimension.Vertical) {
            return q.Vertical;
        }
        if (dimension instanceof Dimension.ZLayer) {
            return null;
        }
        throw new r();
    }
}
