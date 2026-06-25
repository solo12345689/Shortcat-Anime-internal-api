package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Td.r;
import Y0.L;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "LY0/L;", "toFontWeight", "(Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;)LY0/L;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class FontKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontWeight.values().length];
            try {
                iArr[FontWeight.EXTRA_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeight.THIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FontWeight.REGULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FontWeight.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FontWeight.SEMI_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FontWeight.BOLD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FontWeight.EXTRA_BOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FontWeight.BLACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ L toFontWeight(FontWeight fontWeight) {
        AbstractC5504s.h(fontWeight, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) {
            case 1:
                return L.f22613b.d();
            case 2:
                return L.f22613b.i();
            case 3:
                return L.f22613b.e();
            case 4:
                return L.f22613b.g();
            case 5:
                return L.f22613b.f();
            case 6:
                return L.f22613b.h();
            case 7:
                return L.f22613b.b();
            case 8:
                return L.f22613b.c();
            case 9:
                return L.f22613b.a();
            default:
                throw new r();
        }
    }
}
