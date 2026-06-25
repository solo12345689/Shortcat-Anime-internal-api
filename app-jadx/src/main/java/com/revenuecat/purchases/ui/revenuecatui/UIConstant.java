package com.revenuecat.purchases.ui.revenuecatui;

import i1.C5015h;
import kotlin.Metadata;
import w.AbstractC6877F;
import w.AbstractC6906j;
import w.InterfaceC6904i;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u000f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0011\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0013\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u001d\u0010!\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;", "", "<init>", "()V", "T", "Lw/r0;", "defaultAnimation", "()Lw/r0;", "Li1/h;", "defaultHorizontalPadding", "F", "getDefaultHorizontalPadding-D9Ej5fM", "()F", "defaultVerticalSpacing", "getDefaultVerticalSpacing-D9Ej5fM", "defaultCornerRadius", "getDefaultCornerRadius-D9Ej5fM", "defaultPackageCornerRadius", "getDefaultPackageCornerRadius-D9Ej5fM", "defaultPackageBorderWidth", "getDefaultPackageBorderWidth-D9Ej5fM", "Lw/i;", "Ls0/r0;", "defaultColorAnimation", "Lw/i;", "getDefaultColorAnimation", "()Lw/i;", "", "purchaseInProgressButtonOpacity", "", "defaultAnimationDurationMillis", "I", "halfWeight", "iconButtonSize", "getIconButtonSize-D9Ej5fM", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UIConstant {
    public static final int defaultAnimationDurationMillis = 200;
    private static final float defaultHorizontalPadding;
    private static final float defaultVerticalSpacing;
    public static final float halfWeight = 0.5f;
    public static final float purchaseInProgressButtonOpacity = 0.4f;
    public static final UIConstant INSTANCE = new UIConstant();
    private static final float defaultCornerRadius = C5015h.n(20);
    private static final float defaultPackageCornerRadius = C5015h.n(16);
    private static final float defaultPackageBorderWidth = C5015h.n((float) 1.5d);
    private static final InterfaceC6904i defaultColorAnimation = AbstractC6906j.j(300, 0, AbstractC6877F.e(), 2, null);
    private static final float iconButtonSize = C5015h.n(48);
    public static final int $stable = 8;

    static {
        float f10 = 12;
        defaultHorizontalPadding = C5015h.n(f10);
        defaultVerticalSpacing = C5015h.n(f10);
    }

    private UIConstant() {
    }

    public final <T> r0 defaultAnimation() {
        return AbstractC6906j.j(200, 0, AbstractC6877F.f(), 2, null);
    }

    public final InterfaceC6904i getDefaultColorAnimation() {
        return defaultColorAnimation;
    }

    /* JADX INFO: renamed from: getDefaultCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m385getDefaultCornerRadiusD9Ej5fM() {
        return defaultCornerRadius;
    }

    /* JADX INFO: renamed from: getDefaultHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m386getDefaultHorizontalPaddingD9Ej5fM() {
        return defaultHorizontalPadding;
    }

    /* JADX INFO: renamed from: getDefaultPackageBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m387getDefaultPackageBorderWidthD9Ej5fM() {
        return defaultPackageBorderWidth;
    }

    /* JADX INFO: renamed from: getDefaultPackageCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m388getDefaultPackageCornerRadiusD9Ej5fM() {
        return defaultPackageCornerRadius;
    }

    /* JADX INFO: renamed from: getDefaultVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m389getDefaultVerticalSpacingD9Ej5fM() {
        return defaultVerticalSpacing;
    }

    /* JADX INFO: renamed from: getIconButtonSize-D9Ej5fM, reason: not valid java name */
    public final float m390getIconButtonSizeD9Ej5fM() {
        return iconButtonSize;
    }
}
