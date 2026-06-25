package com.revenuecat.purchases.ui.revenuecatui.composables;

import U.D;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.Metadata;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J²\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchDefaults;", "", "<init>", "()V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "Ls0/r0;", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;", "colors-lRJcREg", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLY/m;III)Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;", "colors", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* JADX INFO: renamed from: colors-lRJcREg, reason: not valid java name */
    public final SwitchColors m625colorslRJcREg(ColorStyle colorStyle, ColorStyle colorStyle2, ColorStyle colorStyle3, long j10, ColorStyle colorStyle4, ColorStyle colorStyle5, ColorStyle colorStyle6, long j11, ColorStyle colorStyle7, ColorStyle colorStyle8, ColorStyle colorStyle9, long j12, ColorStyle colorStyle10, ColorStyle colorStyle11, ColorStyle colorStyle12, long j13, InterfaceC2425m interfaceC2425m, int i10, int i11, int i12) {
        ColorStyle colorStyle13;
        ColorStyle colorStyle14;
        ColorStyle colorStyleM469boximpl;
        interfaceC2425m.V(1279282675);
        ColorStyle colorStyleM469boximpl2 = (i12 & 1) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(SwitchKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), interfaceC2425m, 6))) : colorStyle;
        ColorStyle colorStyleM469boximpl3 = (i12 & 2) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(SwitchKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), interfaceC2425m, 6))) : colorStyle2;
        ColorStyle colorStyleM469boximpl4 = (i12 & 4) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.i())) : colorStyle3;
        long value = (i12 & 8) != 0 ? SwitchKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), interfaceC2425m, 6) : j10;
        ColorStyle colorStyleM469boximpl5 = (i12 & 16) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(SwitchKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), interfaceC2425m, 6))) : colorStyle4;
        ColorStyle colorStyleM469boximpl6 = (i12 & 32) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(SwitchKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), interfaceC2425m, 6))) : colorStyle5;
        ColorStyle colorStyleM469boximpl7 = (i12 & 64) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(SwitchKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), interfaceC2425m, 6))) : colorStyle6;
        long value2 = (i12 & 128) != 0 ? SwitchKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), interfaceC2425m, 6) : j11;
        ColorStyle colorStyleM469boximpl8 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), interfaceC2425m, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()))) : colorStyle7;
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            colorStyle13 = colorStyleM469boximpl8;
            colorStyle14 = colorStyleM469boximpl2;
            colorStyleM469boximpl = ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), interfaceC2425m, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H())));
        } else {
            colorStyle13 = colorStyleM469boximpl8;
            colorStyle14 = colorStyleM469boximpl2;
            colorStyleM469boximpl = colorStyle8;
        }
        ColorStyle colorStyleM469boximpl9 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.i())) : colorStyle9;
        long jH = (i12 & 2048) != 0 ? AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), interfaceC2425m, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()) : j12;
        ColorStyle colorStyleM469boximpl10 = (i12 & 4096) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), interfaceC2425m, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()))) : colorStyle10;
        ColorStyle colorStyleM469boximpl11 = (i12 & 8192) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), interfaceC2425m, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()))) : colorStyle11;
        ColorStyle colorStyleM469boximpl12 = (i12 & 16384) != 0 ? ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), interfaceC2425m, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()))) : colorStyle12;
        long jH2 = (i12 & 32768) != 0 ? AbstractC6387s0.h(C6385r0.q(SwitchKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), interfaceC2425m, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), D.f17597a.a(interfaceC2425m, D.f17598b).H()) : j13;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1279282675, i10, i11, "com.revenuecat.purchases.ui.revenuecatui.composables.SwitchDefaults.colors (Switch.kt:172)");
        }
        SwitchColors switchColors = new SwitchColors(colorStyle14, colorStyleM469boximpl3, colorStyleM469boximpl4, value, colorStyleM469boximpl5, colorStyleM469boximpl6, colorStyleM469boximpl7, value2, colorStyle13, colorStyleM469boximpl, colorStyleM469boximpl9, jH, colorStyleM469boximpl10, colorStyleM469boximpl11, colorStyleM469boximpl12, jH2, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return switchColors;
    }
}
