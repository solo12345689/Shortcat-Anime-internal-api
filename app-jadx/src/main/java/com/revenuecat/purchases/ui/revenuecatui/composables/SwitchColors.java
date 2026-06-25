package com.revenuecat.purchases.ui.revenuecatui.composables;

import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ%\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001a\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001a\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001a\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "Ls0/r0;", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "thumbColor$revenuecatui_defaultsBc8Release", "(ZZ)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "thumbColor", "trackColor$revenuecatui_defaultsBc8Release", "trackColor", "borderColor$revenuecatui_defaultsBc8Release", "borderColor", "iconColor-WaAFU9c$revenuecatui_defaultsBc8Release", "(ZZ)J", "iconColor", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "J", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchColors {
    public static final int $stable = 0;
    private final ColorStyle checkedBorderColor;
    private final long checkedIconColor;
    private final ColorStyle checkedThumbColor;
    private final ColorStyle checkedTrackColor;
    private final ColorStyle disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final ColorStyle disabledCheckedThumbColor;
    private final ColorStyle disabledCheckedTrackColor;
    private final ColorStyle disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final ColorStyle disabledUncheckedThumbColor;
    private final ColorStyle disabledUncheckedTrackColor;
    private final ColorStyle uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final ColorStyle uncheckedThumbColor;
    private final ColorStyle uncheckedTrackColor;

    public /* synthetic */ SwitchColors(ColorStyle colorStyle, ColorStyle colorStyle2, ColorStyle colorStyle3, long j10, ColorStyle colorStyle4, ColorStyle colorStyle5, ColorStyle colorStyle6, long j11, ColorStyle colorStyle7, ColorStyle colorStyle8, ColorStyle colorStyle9, long j12, ColorStyle colorStyle10, ColorStyle colorStyle11, ColorStyle colorStyle12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorStyle, colorStyle2, colorStyle3, j10, colorStyle4, colorStyle5, colorStyle6, j11, colorStyle7, colorStyle8, colorStyle9, j12, colorStyle10, colorStyle11, colorStyle12, j13);
    }

    public final ColorStyle borderColor$revenuecatui_defaultsBc8Release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedBorderColor : this.uncheckedBorderColor : checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return AbstractC5504s.c(this.checkedThumbColor, switchColors.checkedThumbColor) && AbstractC5504s.c(this.checkedTrackColor, switchColors.checkedTrackColor) && AbstractC5504s.c(this.checkedBorderColor, switchColors.checkedBorderColor) && C6385r0.s(this.checkedIconColor, switchColors.checkedIconColor) && AbstractC5504s.c(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && AbstractC5504s.c(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && AbstractC5504s.c(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && C6385r0.s(this.uncheckedIconColor, switchColors.uncheckedIconColor) && AbstractC5504s.c(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && AbstractC5504s.c(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && AbstractC5504s.c(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && C6385r0.s(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && AbstractC5504s.c(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && AbstractC5504s.c(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && AbstractC5504s.c(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && C6385r0.s(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.checkedThumbColor.hashCode() * 31) + this.checkedTrackColor.hashCode()) * 31) + this.checkedBorderColor.hashCode()) * 31) + C6385r0.y(this.checkedIconColor)) * 31) + this.uncheckedThumbColor.hashCode()) * 31) + this.uncheckedTrackColor.hashCode()) * 31) + this.uncheckedBorderColor.hashCode()) * 31) + C6385r0.y(this.uncheckedIconColor)) * 31) + this.disabledCheckedThumbColor.hashCode()) * 31) + this.disabledCheckedTrackColor.hashCode()) * 31) + this.disabledCheckedBorderColor.hashCode()) * 31) + C6385r0.y(this.disabledCheckedIconColor)) * 31) + this.disabledUncheckedThumbColor.hashCode()) * 31) + this.disabledUncheckedTrackColor.hashCode()) * 31) + this.disabledUncheckedBorderColor.hashCode()) * 31) + C6385r0.y(this.disabledUncheckedIconColor);
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$revenuecatui_defaultsBc8Release, reason: not valid java name */
    public final long m624iconColorWaAFU9c$revenuecatui_defaultsBc8Release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedIconColor : this.uncheckedIconColor : checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final ColorStyle thumbColor$revenuecatui_defaultsBc8Release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedThumbColor : this.uncheckedThumbColor : checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    public String toString() {
        return "SwitchColors(checkedThumbColor=" + this.checkedThumbColor + ", checkedTrackColor=" + this.checkedTrackColor + ", checkedBorderColor=" + this.checkedBorderColor + ", checkedIconColor=" + ((Object) C6385r0.z(this.checkedIconColor)) + ", uncheckedThumbColor=" + this.uncheckedThumbColor + ", uncheckedTrackColor=" + this.uncheckedTrackColor + ", uncheckedBorderColor=" + this.uncheckedBorderColor + ", uncheckedIconColor=" + ((Object) C6385r0.z(this.uncheckedIconColor)) + ", disabledCheckedThumbColor=" + this.disabledCheckedThumbColor + ", disabledCheckedTrackColor=" + this.disabledCheckedTrackColor + ", disabledCheckedBorderColor=" + this.disabledCheckedBorderColor + ", disabledCheckedIconColor=" + ((Object) C6385r0.z(this.disabledCheckedIconColor)) + ", disabledUncheckedThumbColor=" + this.disabledUncheckedThumbColor + ", disabledUncheckedTrackColor=" + this.disabledUncheckedTrackColor + ", disabledUncheckedBorderColor=" + this.disabledUncheckedBorderColor + ", disabledUncheckedIconColor=" + ((Object) C6385r0.z(this.disabledUncheckedIconColor)) + ')';
    }

    public final ColorStyle trackColor$revenuecatui_defaultsBc8Release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedTrackColor : this.uncheckedTrackColor : checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private SwitchColors(ColorStyle checkedThumbColor, ColorStyle checkedTrackColor, ColorStyle checkedBorderColor, long j10, ColorStyle uncheckedThumbColor, ColorStyle uncheckedTrackColor, ColorStyle uncheckedBorderColor, long j11, ColorStyle disabledCheckedThumbColor, ColorStyle disabledCheckedTrackColor, ColorStyle disabledCheckedBorderColor, long j12, ColorStyle disabledUncheckedThumbColor, ColorStyle disabledUncheckedTrackColor, ColorStyle disabledUncheckedBorderColor, long j13) {
        AbstractC5504s.h(checkedThumbColor, "checkedThumbColor");
        AbstractC5504s.h(checkedTrackColor, "checkedTrackColor");
        AbstractC5504s.h(checkedBorderColor, "checkedBorderColor");
        AbstractC5504s.h(uncheckedThumbColor, "uncheckedThumbColor");
        AbstractC5504s.h(uncheckedTrackColor, "uncheckedTrackColor");
        AbstractC5504s.h(uncheckedBorderColor, "uncheckedBorderColor");
        AbstractC5504s.h(disabledCheckedThumbColor, "disabledCheckedThumbColor");
        AbstractC5504s.h(disabledCheckedTrackColor, "disabledCheckedTrackColor");
        AbstractC5504s.h(disabledCheckedBorderColor, "disabledCheckedBorderColor");
        AbstractC5504s.h(disabledUncheckedThumbColor, "disabledUncheckedThumbColor");
        AbstractC5504s.h(disabledUncheckedTrackColor, "disabledUncheckedTrackColor");
        AbstractC5504s.h(disabledUncheckedBorderColor, "disabledUncheckedBorderColor");
        this.checkedThumbColor = checkedThumbColor;
        this.checkedTrackColor = checkedTrackColor;
        this.checkedBorderColor = checkedBorderColor;
        this.checkedIconColor = j10;
        this.uncheckedThumbColor = uncheckedThumbColor;
        this.uncheckedTrackColor = uncheckedTrackColor;
        this.uncheckedBorderColor = uncheckedBorderColor;
        this.uncheckedIconColor = j11;
        this.disabledCheckedThumbColor = disabledCheckedThumbColor;
        this.disabledCheckedTrackColor = disabledCheckedTrackColor;
        this.disabledCheckedBorderColor = disabledCheckedBorderColor;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = disabledUncheckedThumbColor;
        this.disabledUncheckedTrackColor = disabledUncheckedTrackColor;
        this.disabledUncheckedBorderColor = disabledUncheckedBorderColor;
        this.disabledUncheckedIconColor = j13;
    }
}
