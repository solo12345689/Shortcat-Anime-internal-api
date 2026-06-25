package com.revenuecat.purchases.ui.revenuecatui.components.image;

import B4.b;
import C.A;
import G4.q;
import I0.B;
import K0.InterfaceC1788g;
import Td.D;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.emergetools.snapshots.annotations.EmergeSnapshotConfig;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import g0.i;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.E1;
import v4.C6842a;
import v4.InterfaceC6845d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u0019\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0018\u0010\u000e\u001aq\u0010+\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b.\u0010/\u001a!\u0010.\u001a\u00020-2\u0006\u00101\u001a\u0002002\b\b\u0003\u00103\u001a\u000202H\u0003¢\u0006\u0004\b.\u00104\u001a\"\u0010:\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a4\u0010B\u001a\u00020?*\u00020;2\b\b\u0001\u0010<\u001a\u0002052\b\b\u0001\u0010=\u001a\u0002052\b\b\u0001\u0010>\u001a\u000202H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010D\u001a\u000202*\u00020CH\u0002¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\f\u0010G\u001a\u00020F8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Landroidx/compose/ui/e;", "modifier", "LTd/L;", "ImageComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;", "parameters", "ImageComponentView_Preview", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/image/PreviewParameters;LY/m;I)V", "ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview", "(LY/m;I)V", "ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview", "ImageComponentView_Preview_SmallerContainer", "ImageComponentView_Preview_Margin_Padding", "ImageComponentView_Preview_LinearGradient", "ImageComponentView_Preview_RadialGradient", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "ImageComponentView_Preview_MaskShape", "(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;LY/m;I)V", "ImageComponentView_Preview_FixedFixedFitMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "themeImageUrls", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "shape", "", "visible", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;", "overlay", "LC/A;", "paddingValues", "marginValues", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;", "border", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;", "shadow", "previewImageComponentStyle", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;ZLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LC/A;LC/A;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ImageComponentStyle;", "Lv4/d;", "previewImageLoader", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LY/m;I)Lv4/d;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "imageUrls", "", "resource", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;ILY/m;II)Lv4/d;", "LTd/D;", "widthPx", "heightPx", "previewThemeImageUrls-feOb9K0", "(II)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "previewThemeImageUrls", "Landroid/graphics/drawable/Drawable;", "width", "height", AppStateModule.APP_STATE_BACKGROUND, "Landroid/graphics/Bitmap;", "toBitmap-gd2BlFg", "(Landroid/graphics/drawable/Drawable;III)Landroid/graphics/Bitmap;", "toBitmap", "", "toRgbColor", "(Ljava/lang/String;)I", "Ls0/E1;", "composeShape", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ImageComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(e applyIfNotNull, AspectRatio it) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(it, "it");
            return AspectRatioKt.aspectRatio(applyIfNotNull, it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ImageComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(ImageComponentStyle imageComponentStyle, PaywallState.Loaded.Components components, e eVar, int i10, int i11) {
            super(2);
            this.$style = imageComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView(this.$style, this.$state, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41851 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41851(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1367814797, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview.<anonymous> (ImageComponentView.kt:231)");
            }
            e eVarI = p.i(s.v(s.d(b.d(e.f26613a, C6385r0.f58985b.h(), null, 2, null), 0.0f, 1, null), C5015h.n(200)), C5015h.n(20));
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE), FitMode.FILL, new MaskShape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), false, null, null, null, null, null, interfaceC2425m, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41861 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41861(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(955317783, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview.<anonymous> (ImageComponentView.kt:257)");
            }
            e eVarI = p.i(s.i(s.h(b.d(e.f26613a, C6385r0.f58985b.h(), null, 2, null), 0.0f, 1, null), C5015h.n(200)), C5015h.n(20));
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarI);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE), FitMode.FILL, new MaskShape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), false, null, null, null, null, null, interfaceC2425m, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41872 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41872(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41881 extends AbstractC5506u implements Function2 {
        final /* synthetic */ PreviewParameters $parameters;
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41881(ThemeImageUrls themeImageUrls, PreviewParameters previewParameters) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
            this.$parameters = previewParameters;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-463386670, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview.<anonymous> (ImageComponentView.kt:204)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.h(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            PreviewParameters previewParameters = this.$parameters;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, previewParameters.getViewSize(), previewParameters.getFitMode(), new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, null, null, null, null, interfaceC2425m, 3072, 1008), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41892 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PreviewParameters $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41892(PreviewParameters previewParameters, int i10) {
            super(2);
            this.$parameters = previewParameters;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview(this.$parameters, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_FixedFixedFitMargin$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41901 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41901(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1199303222, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_FixedFixedFitMargin.<anonymous> (ImageComponentView.kt:484)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.h(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(24, null), new SizeConstraint.Fixed(24, null)), FitMode.FIT, new MaskShape.Rectangle((CornerRadiuses) null, 1, (DefaultConstructorMarker) null), false, null, null, p.e(0.0f, 0.0f, C5015h.n(8), 0.0f, 11, null), null, null, interfaceC2425m, 918556080, 112), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_FixedFixedFitMargin$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41912 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41912(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_FixedFixedFitMargin(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_LinearGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41921 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41921(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1985929596, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_LinearGradient.<anonymous> (ImageComponentView.kt:348)");
            }
            e.a aVar = e.f26613a;
            C6385r0.a aVar2 = C6385r0.f58985b;
            e eVarD = b.d(aVar, aVar2.h(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, null), SizeConstraint.Fit.INSTANCE), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(0.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(Color.parseColor("#88FF0000"), 0.0f), new ColorInfo.Gradient.Point(Color.parseColor("#8800FF00"), 50.0f), new ColorInfo.Gradient.Point(Color.parseColor("#880000FF"), 100.0f)))), null, 2, null), null, null, new BorderStyles(C5015h.n(10), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(aVar2.b())), null, 2, null), null), null, interfaceC2425m, 3504, 720), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_LinearGradient$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41932 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41932(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_LinearGradient(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41941 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41941(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1369202481, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Margin_Padding.<anonymous> (ImageComponentView.kt:313)");
            }
            e eVarD = b.d(s.i(e.f26613a, C5015h.n(200)), C6385r0.f58985b.e(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            float f10 = 20;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, null), new SizeConstraint.Fixed(400, null)), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, p.a(C5015h.n(f10)), p.a(C5015h.n(f10)), null, null, interfaceC2425m, 819465648, RCHTTPStatusCodes.NOT_MODIFIED), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_Margin_Padding$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41952 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41952(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_Margin_Padding(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_MaskShape$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41961 extends AbstractC5506u implements Function2 {
        final /* synthetic */ MaskShape $maskShape;
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41961(ThemeImageUrls themeImageUrls, MaskShape maskShape) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
            this.$maskShape = maskShape;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-569034613, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_MaskShape.<anonymous> (ImageComponentView.kt:464)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.b(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            MaskShape maskShape = this.$maskShape;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, null), new SizeConstraint.Fixed(200, null)), FitMode.FIT, maskShape, false, null, null, null, null, null, interfaceC2425m, 432, 1008), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_MaskShape$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41972 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MaskShape $maskShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41972(MaskShape maskShape, int i10) {
            super(2);
            this.$maskShape = maskShape;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_MaskShape(this.$maskShape, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_RadialGradient$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C41981 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41981(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-827207358, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_RadialGradient.<anonymous> (ImageComponentView.kt:401)");
            }
            e eVarD = b.d(e.f26613a, C6385r0.f58985b.h(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, null), SizeConstraint.Fit.INSTANCE), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(AbstractC2279u.p(new ColorInfo.Gradient.Point(Color.parseColor("#88FF0000"), 0.0f), new ColorInfo.Gradient.Point(Color.parseColor("#8800FF00"), 50.0f), new ColorInfo.Gradient.Point(Color.parseColor("#880000FF"), 100.0f)))), null, 2, null), null, null, null, null, interfaceC2425m, 3504, 976), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_RadialGradient$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C41992 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41992(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_RadialGradient(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_SmallerContainer$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42001 extends AbstractC5506u implements Function2 {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42001(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-161866748, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_SmallerContainer.<anonymous> (ImageComponentView.kt:283)");
            }
            e eVarD = b.d(s.i(e.f26613a, C5015h.n(200)), C6385r0.f58985b.b(), null, 2, null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            e eVarF = c.f(interfaceC2425m, eVarD);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, null), new SizeConstraint.Fixed(400, null)), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, null, null, null, null, interfaceC2425m, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$ImageComponentView_Preview_SmallerContainer$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42012 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42012(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImageComponentViewKt.ImageComponentView_Preview_SmallerContainer(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void ImageComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r18, androidx.compose.ui.e r19, Y.InterfaceC2425m r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt.ImageComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, Y.m, int, int):void");
    }

    public static final E1 ImageComponentView$lambda$3(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1105161640);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1105161640, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview (ImageComponentView.kt:228)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(100, 100);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-1367814797, true, new C41851(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1217970940);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1217970940, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview (ImageComponentView.kt:254)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(100, 100);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(955317783, true, new C41861(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41872(i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.95f)
    public static final void ImageComponentView_Preview(PreviewParameters previewParameters, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1427202611);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(previewParameters) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1427202611, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview (ImageComponentView.kt:201)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(previewParameters.getImageWidth(), previewParameters.getImageHeight());
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-463386670, true, new C41881(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, previewParameters), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41892(previewParameters, i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.97f)
    public static final void ImageComponentView_Preview_FixedFixedFitMargin(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1911339503);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1911339503, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_FixedFixedFitMargin (ImageComponentView.kt:481)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(96, 96);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-1199303222, true, new C41901(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41912(i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Preview_LinearGradient(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(246381111);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(246381111, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_LinearGradient (ImageComponentView.kt:345)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(1985929596, true, new C41921(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41932(i10));
        }
    }

    public static final void ImageComponentView_Preview_Margin_Padding(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-370346004);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-370346004, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Margin_Padding (ImageComponentView.kt:310)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(1369202481, true, new C41941(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41952(i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Preview_MaskShape(MaskShape maskShape, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(916782022);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(maskShape) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(916782022, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_MaskShape (ImageComponentView.kt:461)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(400, 200);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-569034613, true, new C41961(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, maskShape), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41972(maskShape, i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Preview_RadialGradient(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1728211453);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1728211453, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_RadialGradient (ImageComponentView.kt:398)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-827207358, true, new C41981(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C41992(i10));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    public static final void ImageComponentView_Preview_SmallerContainer(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1125682689);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1125682689, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_SmallerContainer (ImageComponentView.kt:280)");
            }
            ThemeImageUrls themeImageUrlsM414previewThemeImageUrlsfeOb9K0 = m414previewThemeImageUrlsfeOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrlsM414previewThemeImageUrlsfeOb9K0, interfaceC2425mG, 0), i.d(-161866748, true, new C42001(themeImageUrlsM414previewThemeImageUrlsfeOb9K0), interfaceC2425mG, 54), interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42012(i10));
        }
    }

    public static final ImageComponentStyle previewImageComponentStyle(ThemeImageUrls themeImageUrls, Size size, FitMode fitMode, MaskShape maskShape, boolean z10, ColorStyles colorStyles, A a10, A a11, BorderStyles borderStyles, ShadowStyles shadowStyles, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        interfaceC2425m.V(-1478132064);
        boolean z11 = (i11 & 16) != 0 ? true : z10;
        ColorStyles colorStyles2 = (i11 & 32) != 0 ? null : colorStyles;
        A a12 = (i11 & 64) != 0 ? p.a(C5015h.n(0)) : a10;
        A a13 = (i11 & 128) != 0 ? p.a(C5015h.n(0)) : a11;
        BorderStyles borderStyles2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new BorderStyles(C5015h.n(2), new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.c())), null, 2, null), null) : borderStyles;
        ShadowStyles shadowStyles2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.a())), null, 2, null), C5015h.n(10), C5015h.n(0), C5015h.n(3), null) : shadowStyles;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1478132064, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageComponentStyle (ImageComponentView.kt:522)");
        }
        ImageComponentStyle imageComponentStyle = new ImageComponentStyle(NonEmptyMapKt.nonEmptyMapOf(z.a(LocaleId.m307boximpl(LocaleId.m308constructorimpl("en_US")), themeImageUrls), new Pair[0]), z11, size, a12, a13, ShapeKt.toShape(maskShape), borderStyles2, shadowStyles2, colorStyles2, FitModeKt.toContentScale(fitMode), null, null, null, null, AbstractC2279u.m(), false, 43008, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return imageComponentStyle;
    }

    private static final InterfaceC6845d previewImageLoader(ThemeImageUrls themeImageUrls, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(-845849021);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-845849021, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageLoader (ImageComponentView.kt:540)");
        }
        InterfaceC6845d interfaceC6845dPreviewImageLoader = previewImageLoader(ThemeImageUrlsKt.getUrlsForCurrentTheme(themeImageUrls, interfaceC2425m, i10 & 14), 0, interfaceC2425m, 0, 2);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return interfaceC6845dPreviewImageLoader;
    }

    /* JADX INFO: renamed from: previewThemeImageUrls-feOb9K0 */
    private static final ThemeImageUrls m414previewThemeImageUrlsfeOb9K0(int i10, int i11) {
        return new ThemeImageUrls(new ImageUrls(new URL("https://preview"), new URL("https://preview"), new URL("https://preview"), i10, i11, null), (ImageUrls) null, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: toBitmap-gd2BlFg */
    public static final Bitmap m415toBitmapgd2BlFg(Drawable toBitmap, int i10, int i11, int i12) {
        AbstractC5504s.h(toBitmap, "$this$toBitmap");
        Rect bounds = toBitmap.getBounds();
        AbstractC5504s.g(bounds, "bounds");
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(width.toInt…oInt(), Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i12);
        toBitmap.setBounds(0, 0, i10, i11);
        toBitmap.draw(canvas);
        toBitmap.setBounds(i13, i14, i15, i16);
        return bitmapCreateBitmap;
    }

    public static final int toRgbColor(String str) {
        int iHashCode = str.hashCode();
        return (iHashCode & 255) | (((iHashCode >> 16) & 255) << 16) | (-16777216) | (((iHashCode >> 8) & 255) << 8);
    }

    private static final InterfaceC6845d previewImageLoader(final ImageUrls imageUrls, final int i10, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        interfaceC2425m.V(-536172673);
        if ((i12 & 2) != 0) {
            i10 = R.drawable.f44179android;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-536172673, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageLoader (ImageComponentView.kt:546)");
        }
        final Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        InterfaceC6845d.a aVar = new InterfaceC6845d.a(context);
        C6842a.C0928a c0928a = new C6842a.C0928a();
        interfaceC2425m.V(-2000731791);
        boolean zF = interfaceC2425m.F(context) | ((((i11 & 112) ^ 48) > 32 && interfaceC2425m.c(i10)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(imageUrls)) || (i11 & 6) == 4);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            objD = new B4.b() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt$previewImageLoader$1$1$1
                @Override // B4.b
                public final Object intercept(b.a aVar2, Zd.e eVar) {
                    Resources resources = aVar2.c().l().getResources();
                    Drawable drawable = context.getDrawable(i10);
                    AbstractC5504s.e(drawable);
                    int width = imageUrls.getWidth();
                    int height = imageUrls.getHeight();
                    ImageUrls imageUrls2 = imageUrls;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(imageUrls2.getOriginal());
                    sb2.append(':');
                    sb2.append((Object) D.k(imageUrls2.getWidth()));
                    sb2.append((Object) D.k(imageUrls2.getHeight()));
                    return new q(new BitmapDrawable(resources, ImageComponentViewKt.m415toBitmapgd2BlFg(drawable, width, height, ImageComponentViewKt.toRgbColor(sb2.toString()))), aVar2.c(), x4.f.MEMORY, null, null, false, false, 120, null);
                }
            };
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        c0928a.b((B4.b) objD);
        InterfaceC6845d interfaceC6845dB = aVar.c(c0928a.f()).b();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return interfaceC6845dB;
    }
}
