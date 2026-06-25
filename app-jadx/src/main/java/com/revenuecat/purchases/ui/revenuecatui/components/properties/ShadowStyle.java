package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\rJ;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\rR\u001d\u0010\u0007\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "color", "Li1/h;", "radius", "x", "y", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "component2-D9Ej5fM", "()F", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "copy-qQh39rQ", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;FFF)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "getColor", "F", "getRadius-D9Ej5fM", "getX-D9Ej5fM", "getY-D9Ej5fM", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShadowStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float radius;
    private final float x;
    private final float y;

    public /* synthetic */ ShadowStyle(ColorStyle colorStyle, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorStyle, f10, f11, f12);
    }

    /* JADX INFO: renamed from: copy-qQh39rQ$default, reason: not valid java name */
    public static /* synthetic */ ShadowStyle m484copyqQh39rQ$default(ShadowStyle shadowStyle, ColorStyle colorStyle, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            colorStyle = shadowStyle.color;
        }
        if ((i10 & 2) != 0) {
            f10 = shadowStyle.radius;
        }
        if ((i10 & 4) != 0) {
            f11 = shadowStyle.x;
        }
        if ((i10 & 8) != 0) {
            f12 = shadowStyle.y;
        }
        return shadowStyle.m488copyqQh39rQ(colorStyle, f10, f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: copy-qQh39rQ, reason: not valid java name */
    public final ShadowStyle m488copyqQh39rQ(ColorStyle color, float radius, float x10, float y10) {
        AbstractC5504s.h(color, "color");
        return new ShadowStyle(color, radius, x10, y10, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) other;
        return AbstractC5504s.c(this.color, shadowStyle.color) && C5015h.q(this.radius, shadowStyle.radius) && C5015h.q(this.x, shadowStyle.x) && C5015h.q(this.y, shadowStyle.y);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m489getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m490getXD9Ej5fM() {
        return this.x;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m491getYD9Ej5fM() {
        return this.y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + C5015h.r(this.radius)) * 31) + C5015h.r(this.x)) * 31) + C5015h.r(this.y);
    }

    public String toString() {
        return "ShadowStyle(color=" + this.color + ", radius=" + ((Object) C5015h.s(this.radius)) + ", x=" + ((Object) C5015h.s(this.x)) + ", y=" + ((Object) C5015h.s(this.y)) + ')';
    }

    private ShadowStyle(ColorStyle color, float f10, float f11, float f12) {
        AbstractC5504s.h(color, "color");
        this.color = color;
        this.radius = f10;
        this.x = f11;
        this.y = f12;
    }
}
