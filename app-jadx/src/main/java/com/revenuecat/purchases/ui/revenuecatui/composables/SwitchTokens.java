package com.revenuecat.purchases.ui.revenuecatui.composables;

import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010'\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010$R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010-\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010$R\u001d\u0010/\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010$R\u001d\u00101\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010$R\u0017\u00103\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 R\u001d\u00105\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010$R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001d\u0010;\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010$R\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchTokens;", "", "<init>", "()V", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;", "DisabledSelectedHandleColor", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;", "getDisabledSelectedHandleColor", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/ColorSchemeKeyTokens;", "", "DisabledSelectedHandleOpacity", "F", "DisabledSelectedIconColor", "getDisabledSelectedIconColor", "DisabledSelectedIconOpacity", "DisabledSelectedTrackColor", "getDisabledSelectedTrackColor", "DisabledTrackOpacity", "DisabledUnselectedHandleColor", "getDisabledUnselectedHandleColor", "DisabledUnselectedHandleOpacity", "DisabledUnselectedIconColor", "getDisabledUnselectedIconColor", "DisabledUnselectedIconOpacity", "DisabledUnselectedTrackColor", "getDisabledUnselectedTrackColor", "DisabledUnselectedTrackOutlineColor", "getDisabledUnselectedTrackOutlineColor", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;", "HandleShape", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;", "getHandleShape", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/ShapeKeyTokens;", "Li1/h;", "PressedHandleWidth", "getPressedHandleWidth-D9Ej5fM", "()F", "SelectedHandleColor", "getSelectedHandleColor", "SelectedHandleWidth", "getSelectedHandleWidth-D9Ej5fM", "SelectedIconColor", "getSelectedIconColor", "SelectedTrackColor", "getSelectedTrackColor", "StateLayerSize", "getStateLayerSize-D9Ej5fM", "TrackHeight", "getTrackHeight-D9Ej5fM", "TrackOutlineWidth", "getTrackOutlineWidth-D9Ej5fM", "TrackShape", "getTrackShape", "TrackWidth", "getTrackWidth-D9Ej5fM", "UnselectedFocusTrackOutlineColor", "getUnselectedFocusTrackOutlineColor", "UnselectedHandleColor", "getUnselectedHandleColor", "UnselectedHandleWidth", "getUnselectedHandleWidth-D9Ej5fM", "UnselectedIconColor", "getUnselectedIconColor", "UnselectedTrackColor", "getUnselectedTrackColor", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SwitchTokens {
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    private static final ColorSchemeKeyTokens DisabledSelectedIconColor;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedTrackColor;
    public static final float DisabledTrackOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledUnselectedHandleColor;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedIconColor;
    public static final float DisabledUnselectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackColor;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackOutlineColor;
    private static final ShapeKeyTokens HandleShape;
    private static final float PressedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedHandleColor;
    private static final float SelectedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedTrackColor;
    private static final float StateLayerSize;
    private static final float TrackHeight;
    private static final float TrackOutlineWidth;
    private static final ShapeKeyTokens TrackShape;
    private static final float TrackWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusTrackOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedHandleColor;
    private static final float UnselectedHandleWidth;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedTrackColor;
    public static final SwitchTokens INSTANCE = new SwitchTokens();
    private static final ColorSchemeKeyTokens DisabledSelectedHandleColor = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledSelectedTrackColor = colorSchemeKeyTokens;
        DisabledUnselectedHandleColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceContainerHighest;
        DisabledUnselectedIconColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackOutlineColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        HandleShape = shapeKeyTokens;
        PressedHandleWidth = C5015h.n((float) 28.0d);
        SelectedHandleColor = ColorSchemeKeyTokens.OnPrimary;
        SelectedHandleWidth = C5015h.n((float) 24.0d);
        SelectedIconColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        SelectedTrackColor = ColorSchemeKeyTokens.Primary;
        StateLayerSize = C5015h.n((float) 40.0d);
        TrackHeight = C5015h.n((float) 32.0d);
        TrackOutlineWidth = C5015h.n((float) 2.0d);
        TrackShape = shapeKeyTokens;
        TrackWidth = C5015h.n((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Outline;
        UnselectedFocusTrackOutlineColor = colorSchemeKeyTokens3;
        UnselectedHandleColor = colorSchemeKeyTokens3;
        UnselectedHandleWidth = C5015h.n((float) 16.0d);
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedTrackColor = colorSchemeKeyTokens2;
    }

    private SwitchTokens() {
    }

    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return DisabledSelectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return DisabledSelectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return DisabledSelectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return DisabledUnselectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return DisabledUnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return DisabledUnselectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return DisabledUnselectedTrackOutlineColor;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* JADX INFO: renamed from: getPressedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m626getPressedHandleWidthD9Ej5fM() {
        return PressedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return SelectedHandleColor;
    }

    /* JADX INFO: renamed from: getSelectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m627getSelectedHandleWidthD9Ej5fM() {
        return SelectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return SelectedTrackColor;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m628getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    /* JADX INFO: renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m629getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    /* JADX INFO: renamed from: getTrackOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m630getTrackOutlineWidthD9Ej5fM() {
        return TrackOutlineWidth;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }

    /* JADX INFO: renamed from: getTrackWidth-D9Ej5fM, reason: not valid java name */
    public final float m631getTrackWidthD9Ej5fM() {
        return TrackWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return UnselectedFocusTrackOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return UnselectedHandleColor;
    }

    /* JADX INFO: renamed from: getUnselectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m632getUnselectedHandleWidthD9Ej5fM() {
        return UnselectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return UnselectedTrackColor;
    }
}
