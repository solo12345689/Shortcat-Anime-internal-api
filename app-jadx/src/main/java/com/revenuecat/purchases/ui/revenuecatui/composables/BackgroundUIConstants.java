package com.revenuecat.purchases.ui.revenuecatui.composables;

import I0.InterfaceC1680f;
import i1.C5015h;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;", "", "<init>", "()V", "Li1/h;", "blurSize", "F", "getBlurSize-D9Ej5fM", "()F", "LI0/f;", "contentScale", "LI0/f;", "getContentScale", "()LI0/f;", "", "blurAlpha", "", "minSDKVersionSupportingBlur", "I", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundUIConstants {
    public static final float blurAlpha = 0.7f;
    public static final int minSDKVersionSupportingBlur = 31;
    public static final BackgroundUIConstants INSTANCE = new BackgroundUIConstants();
    private static final float blurSize = C5015h.n(60);
    private static final InterfaceC1680f contentScale = InterfaceC1680f.f8703a.a();

    private BackgroundUIConstants() {
    }

    /* JADX INFO: renamed from: getBlurSize-D9Ej5fM, reason: not valid java name */
    public final float m565getBlurSizeD9Ej5fM() {
        return blurSize;
    }

    public final InterfaceC1680f getContentScale() {
        return contentScale;
    }
}
