package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;", "", "Li1/h;", "width", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "color", "<init>", "(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "copy-D5KLDUw", "(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidth-D9Ej5fM", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;", "getColor", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BorderStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float width;

    public /* synthetic */ BorderStyle(float f10, ColorStyle colorStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, colorStyle);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStyle m454copyD5KLDUw$default(BorderStyle borderStyle, float f10, ColorStyle colorStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStyle.width;
        }
        if ((i10 & 2) != 0) {
            colorStyle = borderStyle.color;
        }
        return borderStyle.m456copyD5KLDUw(f10, colorStyle);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStyle m456copyD5KLDUw(float width, ColorStyle color) {
        AbstractC5504s.h(color, "color");
        return new BorderStyle(width, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) other;
        return C5015h.q(this.width, borderStyle.width) && AbstractC5504s.c(this.color, borderStyle.color);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m457getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C5015h.r(this.width) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "BorderStyle(width=" + ((Object) C5015h.s(this.width)) + ", color=" + this.color + ')';
    }

    private BorderStyle(float f10, ColorStyle color) {
        AbstractC5504s.h(color, "color");
        this.width = f10;
        this.color = color;
    }
}
