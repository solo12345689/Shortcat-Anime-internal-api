package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import C.A;
import Td.D;
import Td.N;
import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaddingValuesKt;
import i1.EnumC5027t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0005\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "LC/A;", "margin", "Li1/t;", "layoutDirection", "addMargin", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LC/A;Li1/t;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "LTd/D;", "addMargin-Qn1smSk", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;I)Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class SizeKt {
    public static final /* synthetic */ Size addMargin(Size size, A margin, EnumC5027t layoutDirection) {
        AbstractC5504s.h(size, "<this>");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(layoutDirection, "layoutDirection");
        return new Size(m433addMarginQn1smSk(size.getWidth(), N.a(PaddingValuesKt.calculateHorizontalPadding(margin, layoutDirection))), m433addMarginQn1smSk(size.getHeight(), N.a(PaddingValuesKt.calculateVerticalPadding(margin))));
    }

    /* JADX INFO: renamed from: addMargin-Qn1smSk, reason: not valid java name */
    private static final SizeConstraint m433addMarginQn1smSk(SizeConstraint sizeConstraint, int i10) {
        if (sizeConstraint instanceof SizeConstraint.Fixed) {
            return new SizeConstraint.Fixed(D.b(((SizeConstraint.Fixed) sizeConstraint).getValue() + i10), null);
        }
        if (sizeConstraint instanceof SizeConstraint.Fill ? true : sizeConstraint instanceof SizeConstraint.Fit) {
            return sizeConstraint;
        }
        throw new r();
    }
}
