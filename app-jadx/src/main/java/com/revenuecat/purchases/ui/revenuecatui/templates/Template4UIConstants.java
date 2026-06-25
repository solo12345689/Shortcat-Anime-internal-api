package com.revenuecat.purchases.ui.revenuecatui.templates;

import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template4UIConstants;", "", "<init>", "()V", "Li1/h;", "packageButtonContentVerticalSpacing", "F", "getPackageButtonContentVerticalSpacing-D9Ej5fM", "()F", "packageHorizontalSpacing", "getPackageHorizontalSpacing-D9Ej5fM", "packagesHorizontalPadding", "getPackagesHorizontalPadding-D9Ej5fM", "checkmarkSize", "getCheckmarkSize-D9Ej5fM", "checkmarkPadding", "getCheckmarkPadding-D9Ej5fM", "discountVerticalPadding", "getDiscountVerticalPadding-D9Ej5fM", "", "maxPackagesToDisplay", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Template4UIConstants {
    private static final float checkmarkPadding;
    private static final float discountVerticalPadding;
    public static final float maxPackagesToDisplay = 3.0f;
    private static final float packageButtonContentVerticalSpacing;
    private static final float packageHorizontalSpacing;
    public static final Template4UIConstants INSTANCE = new Template4UIConstants();
    private static final float packagesHorizontalPadding = C5015h.n(24);
    private static final float checkmarkSize = C5015h.n(18);

    static {
        float f10 = 4;
        packageButtonContentVerticalSpacing = C5015h.n(f10);
        float f11 = 8;
        packageHorizontalSpacing = C5015h.n(f11);
        checkmarkPadding = C5015h.n(f11);
        discountVerticalPadding = C5015h.n(f10);
    }

    private Template4UIConstants() {
    }

    /* JADX INFO: renamed from: getCheckmarkPadding-D9Ej5fM, reason: not valid java name */
    public final float m901getCheckmarkPaddingD9Ej5fM() {
        return checkmarkPadding;
    }

    /* JADX INFO: renamed from: getCheckmarkSize-D9Ej5fM, reason: not valid java name */
    public final float m902getCheckmarkSizeD9Ej5fM() {
        return checkmarkSize;
    }

    /* JADX INFO: renamed from: getDiscountVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m903getDiscountVerticalPaddingD9Ej5fM() {
        return discountVerticalPadding;
    }

    /* JADX INFO: renamed from: getPackageButtonContentVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m904getPackageButtonContentVerticalSpacingD9Ej5fM() {
        return packageButtonContentVerticalSpacing;
    }

    /* JADX INFO: renamed from: getPackageHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m905getPackageHorizontalSpacingD9Ej5fM() {
        return packageHorizontalSpacing;
    }

    /* JADX INFO: renamed from: getPackagesHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m906getPackagesHorizontalPaddingD9Ej5fM() {
        return packagesHorizontalPadding;
    }
}
