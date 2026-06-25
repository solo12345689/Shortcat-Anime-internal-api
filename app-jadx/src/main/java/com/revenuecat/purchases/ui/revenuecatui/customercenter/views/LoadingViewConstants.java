package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import J.h;
import J.i;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\u0018\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u001d\u0010\u001c\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u000fR\u001d\u0010\u001e\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/LoadingViewConstants;", "", "<init>", "()V", "", "PLACEHOLDER_ALPHA", "F", "LJ/h;", "PLACEHOLDER_SHAPE", "LJ/h;", "getPLACEHOLDER_SHAPE", "()LJ/h;", "Li1/h;", "TITLE_WIDTH", "getTITLE_WIDTH-D9Ej5fM", "()F", "TITLE_HEIGHT", "getTITLE_HEIGHT-D9Ej5fM", "SUBTITLE_WIDTH", "getSUBTITLE_WIDTH-D9Ej5fM", "BODY_HEIGHT", "getBODY_HEIGHT-D9Ej5fM", "STORE_WIDTH", "getSTORE_WIDTH-D9Ej5fM", "BUTTON_HEIGHT", "getBUTTON_HEIGHT-D9Ej5fM", "BUTTON_SHAPE", "getBUTTON_SHAPE", "BADGE_WIDTH", "getBADGE_WIDTH-D9Ej5fM", "BADGE_HEIGHT", "getBADGE_HEIGHT-D9Ej5fM", "BADGE_SHAPE", "getBADGE_SHAPE", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LoadingViewConstants {
    public static final float PLACEHOLDER_ALPHA = 0.15f;
    public static final LoadingViewConstants INSTANCE = new LoadingViewConstants();
    private static final h PLACEHOLDER_SHAPE = i.d(C5015h.n(4));
    private static final float TITLE_WIDTH = C5015h.n(SensibleDefaults.X_OFFSET);
    private static final float TITLE_HEIGHT = C5015h.n(20);
    private static final float SUBTITLE_WIDTH = C5015h.n(220);
    private static final float BODY_HEIGHT = C5015h.n(16);
    private static final float STORE_WIDTH = C5015h.n(100);
    private static final float BUTTON_HEIGHT = C5015h.n(48);
    private static final h BUTTON_SHAPE = i.d(C5015h.n(24));
    private static final float BADGE_WIDTH = C5015h.n(60);
    private static final float BADGE_HEIGHT = C5015h.n(22);
    private static final h BADGE_SHAPE = i.d(CustomerCenterConstants.Card.INSTANCE.m645getBADGE_CORNER_SIZED9Ej5fM());

    private LoadingViewConstants() {
    }

    /* JADX INFO: renamed from: getBADGE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m733getBADGE_HEIGHTD9Ej5fM() {
        return BADGE_HEIGHT;
    }

    public final h getBADGE_SHAPE() {
        return BADGE_SHAPE;
    }

    /* JADX INFO: renamed from: getBADGE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m734getBADGE_WIDTHD9Ej5fM() {
        return BADGE_WIDTH;
    }

    /* JADX INFO: renamed from: getBODY_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m735getBODY_HEIGHTD9Ej5fM() {
        return BODY_HEIGHT;
    }

    /* JADX INFO: renamed from: getBUTTON_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m736getBUTTON_HEIGHTD9Ej5fM() {
        return BUTTON_HEIGHT;
    }

    public final h getBUTTON_SHAPE() {
        return BUTTON_SHAPE;
    }

    public final h getPLACEHOLDER_SHAPE() {
        return PLACEHOLDER_SHAPE;
    }

    /* JADX INFO: renamed from: getSTORE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m737getSTORE_WIDTHD9Ej5fM() {
        return STORE_WIDTH;
    }

    /* JADX INFO: renamed from: getSUBTITLE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m738getSUBTITLE_WIDTHD9Ej5fM() {
        return SUBTITLE_WIDTH;
    }

    /* JADX INFO: renamed from: getTITLE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m739getTITLE_HEIGHTD9Ej5fM() {
        return TITLE_HEIGHT;
    }

    /* JADX INFO: renamed from: getTITLE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m740getTITLE_WIDTHD9Ej5fM() {
        return TITLE_WIDTH;
    }
}
