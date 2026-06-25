package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.AbstractC2739w0;
import b4.C2986c;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001ak\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0007H\u0003¢\u0006\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "paywallState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;", "rememberUpdatedVideoComponentState", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentState;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VideoComponentStateKt {
    public static final /* synthetic */ VideoComponentState rememberUpdatedVideoComponentState(VideoComponentStyle style, PaywallState.Loaded.Components paywallState, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(paywallState, "paywallState");
        interfaceC2425m.V(-374173384);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-374173384, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberUpdatedVideoComponentState (VideoComponentState.kt:304)");
        }
        interfaceC2425m.V(-904430054);
        int i11 = (i10 & 112) ^ 48;
        boolean z10 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new VideoComponentStateKt$rememberUpdatedVideoComponentState$1$1(paywallState);
            interfaceC2425m.u(objD);
        }
        InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD;
        interfaceC2425m.O();
        interfaceC2425m.V(-904428153);
        boolean z11 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD2 = interfaceC2425m.D();
        if (z11 || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$2$1(paywallState);
            interfaceC2425m.u(objD2);
        }
        InterfaceC5082a interfaceC5082a2 = (InterfaceC5082a) objD2;
        interfaceC2425m.O();
        interfaceC2425m.V(-904425948);
        boolean z12 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD3 = interfaceC2425m.D();
        if (z12 || objD3 == InterfaceC2425m.f22370a.a()) {
            objD3 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$3$1(paywallState);
            interfaceC2425m.u(objD3);
        }
        InterfaceC5082a interfaceC5082a3 = (InterfaceC5082a) objD3;
        interfaceC2425m.O();
        interfaceC2425m.V(-904423572);
        boolean z13 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD4 = interfaceC2425m.D();
        if (z13 || objD4 == InterfaceC2425m.f22370a.a()) {
            objD4 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$4$1(paywallState);
            interfaceC2425m.u(objD4);
        }
        InterfaceC5082a interfaceC5082a4 = (InterfaceC5082a) objD4;
        interfaceC2425m.O();
        interfaceC2425m.V(-904421239);
        boolean z14 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD5 = interfaceC2425m.D();
        if (z14 || objD5 == InterfaceC2425m.f22370a.a()) {
            objD5 = new VideoComponentStateKt$rememberUpdatedVideoComponentState$5$1(paywallState);
            interfaceC2425m.u(objD5);
        }
        interfaceC2425m.O();
        VideoComponentState videoComponentStateRememberUpdatedVideoComponentState = rememberUpdatedVideoComponentState(style, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, (InterfaceC5082a) objD5, interfaceC2425m, i10 & 14);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return videoComponentStateRememberUpdatedVideoComponentState;
    }

    private static final /* synthetic */ VideoComponentState rememberUpdatedVideoComponentState(VideoComponentStyle videoComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-673938114);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-673938114, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberUpdatedVideoComponentState (VideoComponentState.kt:324)");
        }
        C2986c c2986cB = V.b.b(interfaceC2425m, 0).a().b();
        InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
        boolean zA = AbstractC7015m.a(interfaceC2425m, 0);
        EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
        interfaceC2425m.V(-904396879);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(videoComponentStyle)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            VideoComponentState videoComponentState = new VideoComponentState(c2986cB, interfaceC5011d, zA, enumC5027t, videoComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, interfaceC5082a5);
            interfaceC2425m.u(videoComponentState);
            objD = videoComponentState;
        }
        VideoComponentState videoComponentState2 = (VideoComponentState) objD;
        interfaceC2425m.O();
        videoComponentState2.update(c2986cB, interfaceC5011d, Boolean.valueOf(zA), enumC5027t);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return videoComponentState2;
    }
}
