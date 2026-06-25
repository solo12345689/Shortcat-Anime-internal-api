package com.revenuecat.purchases.ui.revenuecatui.composables;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C6385r0;
import s0.F1;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u0002HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0016R\u0014\u0010\u0012\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "Ls0/r0;", "highlightColor", "Lw/M;", "", "animationSpec", "<init>", "(JLw/M;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", ReactProgressBarViewManager.PROP_PROGRESS, "Lr0/l;", "size", "Ls0/h0;", "brush-d16Qtg0", "(FJ)Ls0/h0;", "brush", "alpha", "(F)F", "component2", "()Lw/M;", "copy-DxMtmZc", "(JLw/M;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/Fade;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "Lw/M;", "getAnimationSpec", "Ls0/F1;", "Ls0/F1;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Fade implements PlaceholderHighlight {
    public static final int $stable = C6884M.f62376d;
    private final C6884M animationSpec;
    private final F1 brush;
    private final long highlightColor;

    public /* synthetic */ Fade(long j10, C6884M c6884m, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, c6884m);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    private final long getHighlightColor() {
        return this.highlightColor;
    }

    /* JADX INFO: renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ Fade m573copyDxMtmZc$default(Fade fade, long j10, C6884M c6884m, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = fade.highlightColor;
        }
        if ((i10 & 2) != 0) {
            c6884m = fade.animationSpec;
        }
        return fade.m575copyDxMtmZc(j10, c6884m);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    /* JADX INFO: renamed from: brush-d16Qtg0, reason: not valid java name */
    public AbstractC6358h0 mo574brushd16Qtg0(float progress, long size) {
        return this.brush;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C6884M getAnimationSpec() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: copy-DxMtmZc, reason: not valid java name */
    public final Fade m575copyDxMtmZc(long highlightColor, C6884M animationSpec) {
        AbstractC5504s.h(animationSpec, "animationSpec");
        return new Fade(highlightColor, animationSpec, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) other;
        return C6385r0.s(this.highlightColor, fade.highlightColor) && AbstractC5504s.c(this.animationSpec, fade.animationSpec);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public C6884M getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (C6385r0.y(this.highlightColor) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(highlightColor=" + ((Object) C6385r0.z(this.highlightColor)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Fade(long j10, C6884M animationSpec) {
        AbstractC5504s.h(animationSpec, "animationSpec");
        this.highlightColor = j10;
        this.animationSpec = animationSpec;
        this.brush = new F1(j10, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderHighlight
    public float alpha(float progress) {
        return progress;
    }
}
