package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import I0.InterfaceC1680f;
import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "LI0/f;", "toContentScale", "(Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;)LI0/f;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class FitModeKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FitMode.values().length];
            try {
                iArr[FitMode.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitMode.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ InterfaceC1680f toContentScale(FitMode fitMode) {
        AbstractC5504s.h(fitMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[fitMode.ordinal()];
        if (i10 == 1) {
            return InterfaceC1680f.f8703a.b();
        }
        if (i10 == 2) {
            return InterfaceC1680f.f8703a.a();
        }
        throw new r();
    }
}
