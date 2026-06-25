package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import i1.AbstractC5030w;
import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\fR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\fR\u001d\u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\fR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\fR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\fR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;", "", "<init>", "()V", "Li1/h;", "PaddingTiny", "F", "PaddingSmall", "PaddingMedium", "PaddingXL", "ManagementViewTitleTopPadding", "getManagementViewTitleTopPadding-D9Ej5fM", "()F", "Li1/v;", "SettingsRowMainTextSize", "J", "getSettingsRowMainTextSize-XSAIIZE", "()J", "SettingsRowSupportingTextSize", "getSettingsRowSupportingTextSize-XSAIIZE", "", "SettingsRowMainTextAlpha", "SettingsRowSupportingTextAlpha", "SubscriptionViewRowHeight", "getSubscriptionViewRowHeight-D9Ej5fM", "SubscriptionViewHorizontalSpace", "getSubscriptionViewHorizontalSpace-D9Ej5fM", "SubscriptionViewIconSize", "getSubscriptionViewIconSize-D9Ej5fM", "ContentUnavailableViewPaddingHorizontal", "getContentUnavailableViewPaddingHorizontal-D9Ej5fM", "ContentUnavailableViewPaddingVertical", "getContentUnavailableViewPaddingVertical-D9Ej5fM", "ContentUnavailableViewPaddingText", "getContentUnavailableViewPaddingText-D9Ej5fM", "ContentUnavailableIconSize", "getContentUnavailableIconSize-D9Ej5fM", "ManagementViewHorizontalPadding", "getManagementViewHorizontalPadding-D9Ej5fM", "ManagementViewSpacer", "getManagementViewSpacer-D9Ej5fM", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterUIConstants {
    public static final int $stable = 0;
    private static final float ContentUnavailableIconSize;
    private static final float ContentUnavailableViewPaddingHorizontal;
    private static final float ContentUnavailableViewPaddingText;
    private static final float ContentUnavailableViewPaddingVertical;
    public static final CustomerCenterUIConstants INSTANCE = new CustomerCenterUIConstants();
    private static final float ManagementViewHorizontalPadding;
    private static final float ManagementViewSpacer;
    private static final float ManagementViewTitleTopPadding;
    private static final float PaddingMedium;
    private static final float PaddingSmall;
    private static final float PaddingTiny;
    private static final float PaddingXL;
    public static final float SettingsRowMainTextAlpha = 1.0f;
    private static final long SettingsRowMainTextSize;
    public static final float SettingsRowSupportingTextAlpha = 0.6f;
    private static final long SettingsRowSupportingTextSize;
    private static final float SubscriptionViewHorizontalSpace;
    private static final float SubscriptionViewIconSize;
    private static final float SubscriptionViewRowHeight;

    static {
        float fN = C5015h.n(4);
        PaddingTiny = fN;
        float fN2 = C5015h.n(8);
        PaddingSmall = fN2;
        float f10 = 16;
        float fN3 = C5015h.n(f10);
        PaddingMedium = fN3;
        float fN4 = C5015h.n(32);
        PaddingXL = fN4;
        ManagementViewTitleTopPadding = C5015h.n(64);
        SettingsRowMainTextSize = AbstractC5030w.f(20);
        SettingsRowSupportingTextSize = AbstractC5030w.f(14);
        SubscriptionViewRowHeight = C5015h.n(60);
        SubscriptionViewHorizontalSpace = fN2;
        float f11 = 24;
        SubscriptionViewIconSize = C5015h.n(f11);
        ContentUnavailableViewPaddingHorizontal = C5015h.n(f10);
        ContentUnavailableViewPaddingVertical = C5015h.n(20);
        ContentUnavailableViewPaddingText = fN;
        ContentUnavailableIconSize = C5015h.n(f11);
        ManagementViewHorizontalPadding = fN3;
        ManagementViewSpacer = fN4;
    }

    private CustomerCenterUIConstants() {
    }

    /* JADX INFO: renamed from: getContentUnavailableIconSize-D9Ej5fM, reason: not valid java name */
    public final float m660getContentUnavailableIconSizeD9Ej5fM() {
        return ContentUnavailableIconSize;
    }

    /* JADX INFO: renamed from: getContentUnavailableViewPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m661getContentUnavailableViewPaddingHorizontalD9Ej5fM() {
        return ContentUnavailableViewPaddingHorizontal;
    }

    /* JADX INFO: renamed from: getContentUnavailableViewPaddingText-D9Ej5fM, reason: not valid java name */
    public final float m662getContentUnavailableViewPaddingTextD9Ej5fM() {
        return ContentUnavailableViewPaddingText;
    }

    /* JADX INFO: renamed from: getContentUnavailableViewPaddingVertical-D9Ej5fM, reason: not valid java name */
    public final float m663getContentUnavailableViewPaddingVerticalD9Ej5fM() {
        return ContentUnavailableViewPaddingVertical;
    }

    /* JADX INFO: renamed from: getManagementViewHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m664getManagementViewHorizontalPaddingD9Ej5fM() {
        return ManagementViewHorizontalPadding;
    }

    /* JADX INFO: renamed from: getManagementViewSpacer-D9Ej5fM, reason: not valid java name */
    public final float m665getManagementViewSpacerD9Ej5fM() {
        return ManagementViewSpacer;
    }

    /* JADX INFO: renamed from: getManagementViewTitleTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m666getManagementViewTitleTopPaddingD9Ej5fM() {
        return ManagementViewTitleTopPadding;
    }

    /* JADX INFO: renamed from: getSettingsRowMainTextSize-XSAIIZE, reason: not valid java name */
    public final long m667getSettingsRowMainTextSizeXSAIIZE() {
        return SettingsRowMainTextSize;
    }

    /* JADX INFO: renamed from: getSettingsRowSupportingTextSize-XSAIIZE, reason: not valid java name */
    public final long m668getSettingsRowSupportingTextSizeXSAIIZE() {
        return SettingsRowSupportingTextSize;
    }

    /* JADX INFO: renamed from: getSubscriptionViewHorizontalSpace-D9Ej5fM, reason: not valid java name */
    public final float m669getSubscriptionViewHorizontalSpaceD9Ej5fM() {
        return SubscriptionViewHorizontalSpace;
    }

    /* JADX INFO: renamed from: getSubscriptionViewIconSize-D9Ej5fM, reason: not valid java name */
    public final float m670getSubscriptionViewIconSizeD9Ej5fM() {
        return SubscriptionViewIconSize;
    }

    /* JADX INFO: renamed from: getSubscriptionViewRowHeight-D9Ej5fM, reason: not valid java name */
    public final float m671getSubscriptionViewRowHeightD9Ej5fM() {
        return SubscriptionViewRowHeight;
    }
}
