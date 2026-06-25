package com.revenuecat.purchases.ui.revenuecatui.composables;

import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u000e\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0014\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;", "", "<init>", "()V", "", "roundedCorner", "I", "Li1/h;", "minimumHeight", "F", "getMinimumHeight-D9Ej5fM", "()F", "selectedTierPadding", "getSelectedTierPadding-D9Ej5fM", "tierTextPaddingHorizontal", "getTierTextPaddingHorizontal-D9Ej5fM", "tierTextPaddingVertical", "getTierTextPaddingVertical-D9Ej5fM", "tierHorizontalPadding", "getTierHorizontalPadding-D9Ej5fM", "tierVerticalPadding", "getTierVerticalPadding-D9Ej5fM", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TierSwitcherUIConstants {
    public static final int roundedCorner = 50;
    public static final TierSwitcherUIConstants INSTANCE = new TierSwitcherUIConstants();
    private static final float minimumHeight = C5015h.n(40);
    private static final float selectedTierPadding = C5015h.n(2);
    private static final float tierTextPaddingHorizontal = C5015h.n(10);
    private static final float tierTextPaddingVertical = C5015h.n(4);
    private static final float tierHorizontalPadding = C5015h.n(16);
    private static final float tierVerticalPadding = C5015h.n(8);

    private TierSwitcherUIConstants() {
    }

    /* JADX INFO: renamed from: getMinimumHeight-D9Ej5fM, reason: not valid java name */
    public final float m638getMinimumHeightD9Ej5fM() {
        return minimumHeight;
    }

    /* JADX INFO: renamed from: getSelectedTierPadding-D9Ej5fM, reason: not valid java name */
    public final float m639getSelectedTierPaddingD9Ej5fM() {
        return selectedTierPadding;
    }

    /* JADX INFO: renamed from: getTierHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m640getTierHorizontalPaddingD9Ej5fM() {
        return tierHorizontalPadding;
    }

    /* JADX INFO: renamed from: getTierTextPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m641getTierTextPaddingHorizontalD9Ej5fM() {
        return tierTextPaddingHorizontal;
    }

    /* JADX INFO: renamed from: getTierTextPaddingVertical-D9Ej5fM, reason: not valid java name */
    public final float m642getTierTextPaddingVerticalD9Ej5fM() {
        return tierTextPaddingVertical;
    }

    /* JADX INFO: renamed from: getTierVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m643getTierVerticalPaddingD9Ej5fM() {
        return tierVerticalPadding;
    }
}
