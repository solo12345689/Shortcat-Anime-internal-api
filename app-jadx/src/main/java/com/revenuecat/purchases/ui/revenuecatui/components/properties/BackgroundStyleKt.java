package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import G4.b;
import G4.h;
import I0.InterfaceC1680f;
import Td.L;
import Td.r;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PurchasesExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import i1.C5015h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.E1;
import v4.InterfaceC6845d;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u001fH\u0003¢\u0006\u0004\b\"\u0010!\u001a\u000f\u0010#\u001a\u00020\u001fH\u0003¢\u0006\u0004\b#\u0010!¨\u0006$²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/Background;", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "aliases", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "toBackgroundStyles", "(Lcom/revenuecat/purchases/paywalls/components/common/Background;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", "rememberBackgroundStyle", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "imageUrls", "LI0/f;", "contentScale", "Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;LI0/f;LY/m;I)Lcoil/compose/AsyncImagePainter;", "Landroid/content/Context;", "context", "", "url", "LG4/b;", "cachePolicy", "LG4/h;", "getImageRequest", "(Landroid/content/Context;Ljava/lang/String;LG4/b;)LG4/h;", "LTd/L;", "Background_Preview_ColorHex", "(LY/m;I)V", "Background_Preview_ColorGradientLinear", "Background_Preview_ColorGradientRadial", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackgroundStyleKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorGradientLinear$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BackgroundStyleKt.Background_Preview_ColorGradientLinear(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorGradientRadial$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42221 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42221(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BackgroundStyleKt.Background_Preview_ColorGradientRadial(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorHex$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C42231 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42231(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            BackgroundStyleKt.Background_Preview_ColorHex(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void Background_Preview_ColorGradientLinear(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1587277957);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1587277957, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientLinear (BackgroundStyle.kt:232)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(BackgroundKt.background$default(eVarM, BackgroundStyle.Color.m440boximpl(BackgroundStyle.Color.m441constructorimpl(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.f()), 50.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.b()), 100.0f)))))), (E1) null, 2, (Object) null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    public static final void Background_Preview_ColorGradientRadial(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1823976651);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1823976651, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientRadial (BackgroundStyle.kt:262)");
            }
            e eVarM = s.m(e.f26613a, C5015h.n(100));
            C6385r0.a aVar = C6385r0.f58985b;
            f.a(BackgroundKt.background$default(eVarM, BackgroundStyle.Color.m440boximpl(BackgroundStyle.Color.m441constructorimpl(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(AbstractC2279u.p(new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.f()), 50.0f), new ColorInfo.Gradient.Point(AbstractC6387s0.k(aVar.b()), 100.0f)))))), (E1) null, 2, (Object) null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42221(i10));
        }
    }

    public static final void Background_Preview_ColorHex(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(529543697);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(529543697, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorHex (BackgroundStyle.kt:222)");
            }
            f.a(BackgroundKt.background$default(s.m(e.f26613a, C5015h.n(100)), BackgroundStyle.Color.m440boximpl(BackgroundStyle.Color.m441constructorimpl(ColorStyle.Solid.m469boximpl(ColorStyle.Solid.m470constructorimpl(C6385r0.f58985b.h())))), (E1) null, 2, (Object) null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C42231(i10));
        }
    }

    private static final h getImageRequest(Context context, String str, b bVar) {
        return new h.a(context).c(str).e(bVar).f(bVar).a();
    }

    private static final AsyncImagePainter rememberAsyncImagePainter(ImageUrls imageUrls, InterfaceC1680f interfaceC1680f, InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC6845d interfaceC6845d;
        h hVar;
        AbstractC6923b abstractC6923bD;
        interfaceC2425m.V(618155120);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(618155120, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberAsyncImagePainter (BackgroundStyle.kt:178)");
        }
        interfaceC2425m.V(756632259);
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = b2.e(b.ENABLED, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        interfaceC2425m.O();
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        InterfaceC6845d interfaceC6845d2 = (InterfaceC6845d) interfaceC2425m.n(ImagePreviewsKt.getLocalPreviewImageLoader());
        boolean zIsInPreviewMode = HelperFunctionsKt.isInPreviewMode(interfaceC2425m, 0);
        InterfaceC6845d interfaceC6845d3 = zIsInPreviewMode ? interfaceC6845d2 : null;
        interfaceC2425m.V(756639231);
        if (interfaceC6845d3 == null) {
            interfaceC2425m.V(756640750);
            boolean zU = interfaceC2425m.U(context);
            Object objD2 = interfaceC2425m.D();
            if (zU || objD2 == aVar.a()) {
                Purchases.Companion companion = Purchases.INSTANCE;
                Context applicationContext = context.getApplicationContext();
                AbstractC5504s.g(applicationContext, "context.applicationContext");
                objD2 = PurchasesExtensionsKt.getImageLoaderTyped(companion, applicationContext);
                interfaceC2425m.u(objD2);
            }
            interfaceC6845d3 = (InterfaceC6845d) objD2;
            interfaceC2425m.O();
        }
        interfaceC2425m.O();
        Object webp = imageUrls.getWebp();
        Object objRememberAsyncImagePainter$lambda$7 = rememberAsyncImagePainter$lambda$7(c02);
        interfaceC2425m.V(756644466);
        boolean zU2 = interfaceC2425m.U(webp) | interfaceC2425m.U(context) | interfaceC2425m.U(objRememberAsyncImagePainter$lambda$7);
        Object objD3 = interfaceC2425m.D();
        if (zU2 || objD3 == aVar.a()) {
            String string = imageUrls.getWebp().toString();
            AbstractC5504s.g(string, "imageUrls.webp.toString()");
            objD3 = getImageRequest(context, string, rememberAsyncImagePainter$lambda$7(c02));
            interfaceC2425m.u(objD3);
        }
        h hVar2 = (h) objD3;
        interfaceC2425m.O();
        interfaceC2425m.V(756652882);
        if (!zIsInPreviewMode || interfaceC6845d2 == null) {
            String string2 = imageUrls.getWebpLowRes().toString();
            AbstractC5504s.g(string2, "imageUrls.webpLowRes.toString()");
            interfaceC6845d = interfaceC6845d3;
            hVar = hVar2;
            abstractC6923bD = coil.compose.b.d(getImageRequest(context, string2, rememberAsyncImagePainter$lambda$7(c02)), interfaceC6845d, null, null, null, null, null, null, interfaceC1680f, 0, interfaceC2425m, ((i10 << 21) & 234881024) | 27648, 740);
        } else {
            abstractC6923bD = ImagePreviewsKt.getPreviewPlaceholderBlocking(interfaceC6845d3, hVar2);
            interfaceC6845d = interfaceC6845d3;
            hVar = hVar2;
        }
        AbstractC6923b abstractC6923b = abstractC6923bD;
        interfaceC2425m.O();
        interfaceC2425m.V(756669032);
        Object objD4 = interfaceC2425m.D();
        if (objD4 == aVar.a()) {
            objD4 = new BackgroundStyleKt$rememberAsyncImagePainter$1$1(c02);
            interfaceC2425m.u(objD4);
        }
        interfaceC2425m.O();
        AsyncImagePainter asyncImagePainterD = coil.compose.b.d(hVar, interfaceC6845d, abstractC6923b, null, null, null, null, (Function1) objD4, interfaceC1680f, 0, interfaceC2425m, ((i10 << 21) & 234881024) | 12610560, 608);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return asyncImagePainterD;
    }

    private static final b rememberAsyncImagePainter$lambda$7(C0 c02) {
        return (b) c02.getValue();
    }

    public static final /* synthetic */ BackgroundStyle rememberBackgroundStyle(BackgroundStyles background, InterfaceC2425m interfaceC2425m, int i10) {
        BackgroundStyle backgroundStyleM440boximpl;
        AbstractC5504s.h(background, "background");
        interfaceC2425m.V(1019071422);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1019071422, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberBackgroundStyle (BackgroundStyle.kt:143)");
        }
        boolean z10 = true;
        if (background instanceof BackgroundStyles.Color) {
            interfaceC2425m.V(-1590418969);
            ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(((BackgroundStyles.Color) background).m453unboximpl(), interfaceC2425m, 0);
            interfaceC2425m.V(779982346);
            if ((((i10 & 14) ^ 6) <= 4 || !interfaceC2425m.U(background)) && (i10 & 6) != 4) {
                z10 = false;
            }
            boolean zU = interfaceC2425m.U(forCurrentTheme) | z10;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = BackgroundStyle.Color.m440boximpl(BackgroundStyle.Color.m441constructorimpl(forCurrentTheme));
                interfaceC2425m.u(objD);
            }
            ColorStyle colorStyleM446unboximpl = ((BackgroundStyle.Color) objD).m446unboximpl();
            interfaceC2425m.O();
            interfaceC2425m.O();
            backgroundStyleM440boximpl = BackgroundStyle.Color.m440boximpl(colorStyleM446unboximpl);
        } else if (background instanceof BackgroundStyles.Image) {
            interfaceC2425m.V(-1590195521);
            BackgroundStyles.Image image = (BackgroundStyles.Image) background;
            ColorStyles colorOverlay = image.getColorOverlay();
            interfaceC2425m.V(779988729);
            ColorStyle forCurrentTheme2 = colorOverlay == null ? null : ColorStyleKt.getForCurrentTheme(colorOverlay, interfaceC2425m, 0);
            interfaceC2425m.O();
            ImageUrls urlsForCurrentTheme = ThemeImageUrlsKt.getUrlsForCurrentTheme(image.getSources(), interfaceC2425m, 0);
            AsyncImagePainter asyncImagePainterRememberAsyncImagePainter = rememberAsyncImagePainter(urlsForCurrentTheme, image.getContentScale(), interfaceC2425m, 0);
            interfaceC2425m.V(779994638);
            boolean zU2 = interfaceC2425m.U(urlsForCurrentTheme) | interfaceC2425m.U(forCurrentTheme2) | interfaceC2425m.U(asyncImagePainterRememberAsyncImagePainter);
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new BackgroundStyle.Image(asyncImagePainterRememberAsyncImagePainter, image.getContentScale(), forCurrentTheme2);
                interfaceC2425m.u(objD2);
            }
            backgroundStyleM440boximpl = (BackgroundStyle.Image) objD2;
            interfaceC2425m.O();
            interfaceC2425m.O();
        } else {
            if (!(background instanceof BackgroundStyles.Video)) {
                interfaceC2425m.V(779791050);
                interfaceC2425m.O();
                throw new r();
            }
            interfaceC2425m.V(-1589658663);
            interfaceC2425m.V(780005105);
            if ((((i10 & 14) ^ 6) <= 4 || !interfaceC2425m.U(background)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objD3 = interfaceC2425m.D();
            if (z10 || objD3 == InterfaceC2425m.f22370a.a()) {
                BackgroundStyles.Video video = (BackgroundStyles.Video) background;
                Object video2 = new BackgroundStyle.Video(video.getSources(), video.getFallbackImage(), video.getLoop(), video.getMuteAudio(), video.getContentScale(), video.getColorOverlay());
                interfaceC2425m.u(video2);
                objD3 = video2;
            }
            backgroundStyleM440boximpl = (BackgroundStyle.Video) objD3;
            interfaceC2425m.O();
            interfaceC2425m.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return backgroundStyleM440boximpl;
    }

    public static final /* synthetic */ Result toBackgroundStyles(Background background, Map aliases) {
        AbstractC5504s.h(background, "<this>");
        AbstractC5504s.h(aliases, "aliases");
        if (background instanceof Background.Color) {
            Result colorStyles = ColorStyleKt.toColorStyles(((Background.Color) background).getValue(), aliases);
            if (colorStyles instanceof Result.Success) {
                return new Result.Success(BackgroundStyles.Color.m447boximpl(BackgroundStyles.Color.m448constructorimpl((ColorStyles) ((Result.Success) colorStyles).getValue())));
            }
            if (colorStyles instanceof Result.Error) {
                return colorStyles;
            }
            throw new r();
        }
        if (background instanceof Background.Image) {
            Background.Image image = (Background.Image) background;
            ColorScheme colorOverlay = image.getColorOverlay();
            Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, aliases) : null);
            if (resultOrSuccessfullyNull instanceof Result.Success) {
                return new Result.Success(new BackgroundStyles.Image(image.getValue(), FitModeKt.toContentScale(image.getFitMode()), (ColorStyles) ((Result.Success) resultOrSuccessfullyNull).getValue()));
            }
            if (resultOrSuccessfullyNull instanceof Result.Error) {
                return resultOrSuccessfullyNull;
            }
            throw new r();
        }
        if (!(background instanceof Background.Video)) {
            if (background instanceof Background.Unknown) {
                return new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.UnsupportedBackgroundType((Background.Unknown) background), new PaywallValidationError.UnsupportedBackgroundType[0]));
            }
            throw new r();
        }
        Background.Video video = (Background.Video) background;
        ColorScheme colorOverlay2 = video.getColorOverlay();
        Result resultOrSuccessfullyNull2 = ResultKt.orSuccessfullyNull(colorOverlay2 != null ? ColorStyleKt.toColorStyles(colorOverlay2, aliases) : null);
        if (resultOrSuccessfullyNull2 instanceof Result.Success) {
            return new Result.Success(new BackgroundStyles.Video(video.getValue(), video.getFallbackImage(), video.getLoop(), video.getMuteAudio(), FitModeKt.toContentScale(video.getFitMode()), (ColorStyles) ((Result.Success) resultOrSuccessfullyNull2).getValue()));
        }
        if (resultOrSuccessfullyNull2 instanceof Result.Error) {
            return resultOrSuccessfullyNull2;
        }
        throw new r();
    }
}
