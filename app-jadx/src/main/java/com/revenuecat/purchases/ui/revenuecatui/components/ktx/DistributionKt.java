package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import C.C1131b;
import Td.r;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "Li1/h;", "spacing", "LC/b$e;", "toHorizontalArrangement-3ABfNKs", "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$e;", "toHorizontalArrangement", "LC/b$m;", "toVerticalArrangement-3ABfNKs", "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$m;", "toVerticalArrangement", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class DistributionKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlexDistribution.values().length];
            try {
                iArr[FlexDistribution.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlexDistribution.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlexDistribution.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlexDistribution.SPACE_BETWEEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlexDistribution.SPACE_AROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlexDistribution.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: toHorizontalArrangement-3ABfNKs, reason: not valid java name */
    public static final /* synthetic */ C1131b.e m418toHorizontalArrangement3ABfNKs(FlexDistribution toHorizontalArrangement, float f10) {
        AbstractC5504s.h(toHorizontalArrangement, "$this$toHorizontalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[toHorizontalArrangement.ordinal()]) {
            case 1:
                return C1131b.f2093a.p(f10, e.f52304a.k());
            case 2:
                return C1131b.f2093a.p(f10, e.f52304a.j());
            case 3:
                return C1131b.f2093a.p(f10, e.f52304a.g());
            case 4:
            case 5:
            case 6:
                return C1131b.f2093a.g();
            default:
                throw new r();
        }
    }

    /* JADX INFO: renamed from: toVerticalArrangement-3ABfNKs, reason: not valid java name */
    public static final /* synthetic */ C1131b.m m419toVerticalArrangement3ABfNKs(FlexDistribution toVerticalArrangement, float f10) {
        AbstractC5504s.h(toVerticalArrangement, "$this$toVerticalArrangement");
        switch (WhenMappings.$EnumSwitchMapping$0[toVerticalArrangement.ordinal()]) {
            case 1:
                return C1131b.f2093a.q(f10, e.f52304a.l());
            case 2:
                return C1131b.f2093a.q(f10, e.f52304a.a());
            case 3:
                return C1131b.f2093a.q(f10, e.f52304a.i());
            case 4:
            case 5:
            case 6:
                return C1131b.f2093a.h();
            default:
                throw new r();
        }
    }
}
