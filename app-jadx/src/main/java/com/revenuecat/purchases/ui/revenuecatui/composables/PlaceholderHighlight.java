package com.revenuecat.purchases.ui.revenuecatui.composables;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import s0.AbstractC6358h0;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;", "", "", ReactProgressBarViewManager.PROP_PROGRESS, "Lr0/l;", "size", "Ls0/h0;", "brush-d16Qtg0", "(FJ)Ls0/h0;", "brush", "alpha", "(F)F", "Lw/M;", "getAnimationSpec", "()Lw/M;", "animationSpec", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PlaceholderHighlight {
    float alpha(float progress);

    /* JADX INFO: renamed from: brush-d16Qtg0 */
    AbstractC6358h0 mo574brushd16Qtg0(float progress, long size);

    C6884M getAnimationSpec();
}
