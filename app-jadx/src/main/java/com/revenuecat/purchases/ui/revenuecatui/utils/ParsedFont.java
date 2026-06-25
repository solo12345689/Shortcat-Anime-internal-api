package com.revenuecat.purchases.ui.revenuecatui.utils;

import Y0.H;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;", "", "", "resId", "weight", "LY0/H;", "style", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2", "component3-_-LCdwA", "component3", "copy-RetOiIg", "(III)Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getResId", "getWeight", "getStyle-_-LCdwA", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ParsedFont {
    public static final int $stable = 0;
    private final int resId;
    private final int style;
    private final int weight;

    public /* synthetic */ ParsedFont(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ParsedFont m924copyRetOiIg$default(ParsedFont parsedFont, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = parsedFont.resId;
        }
        if ((i13 & 2) != 0) {
            i11 = parsedFont.weight;
        }
        if ((i13 & 4) != 0) {
            i12 = parsedFont.style;
        }
        return parsedFont.m926copyRetOiIg(i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name and from getter */
    public final int getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ParsedFont m926copyRetOiIg(int resId, int weight, int style) {
        return new ParsedFont(resId, weight, style, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedFont)) {
            return false;
        }
        ParsedFont parsedFont = (ParsedFont) other;
        return this.resId == parsedFont.resId && this.weight == parsedFont.weight && H.f(this.style, parsedFont.style);
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int m927getStyle_LCdwA() {
        return this.style;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resId) * 31) + Integer.hashCode(this.weight)) * 31) + H.g(this.style);
    }

    public String toString() {
        return "ParsedFont(resId=" + this.resId + ", weight=" + this.weight + ", style=" + ((Object) H.h(this.style)) + ')';
    }

    private ParsedFont(int i10, int i11, int i12) {
        this.resId = i10;
        this.weight = i11;
        this.style = i12;
    }
}
