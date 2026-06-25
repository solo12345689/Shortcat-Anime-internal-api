package com.revenuecat.purchases.ui.revenuecatui.helpers;

import G4.h;
import Td.L;
import Y.AbstractC2394b1;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C2397c1;
import Y.H;
import Y.InterfaceC2425m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v4.InterfaceC6845d;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv4/d;", "imageLoader", "Lkotlin/Function0;", "LTd/L;", "content", "ProvidePreviewImageLoader", "(Lv4/d;Lkotlin/jvm/functions/Function2;LY/m;I)V", "LG4/h;", "imageRequest", "Lw0/b;", "getPreviewPlaceholderBlocking", "(Lv4/d;LG4/h;)Lw0/b;", "LY/b1;", "LocalPreviewImageLoader", "LY/b1;", "getLocalPreviewImageLoader", "()LY/b1;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImagePreviewsKt {
    private static final /* synthetic */ AbstractC2394b1 LocalPreviewImageLoader = H.j(ImagePreviewsKt$LocalPreviewImageLoader$1.INSTANCE);

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt$ProvidePreviewImageLoader$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ InterfaceC6845d $imageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC6845d interfaceC6845d, Function2 function2, int i10) {
            super(2);
            this.$imageLoader = interfaceC6845d;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ImagePreviewsKt.ProvidePreviewImageLoader(this.$imageLoader, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final /* synthetic */ void ProvidePreviewImageLoader(InterfaceC6845d imageLoader, Function2 content, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(imageLoader, "imageLoader");
        AbstractC5504s.h(content, "content");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-887489443);
        if ((i10 & 48) == 0) {
            i11 = (interfaceC2425mG.F(content) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-887489443, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.ProvidePreviewImageLoader (ImagePreviews.kt:21)");
            }
            H.c(LocalPreviewImageLoader.d(null), content, interfaceC2425mG, (i11 & 112) | C2397c1.f22274i);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(imageLoader, content, i10));
        }
    }

    public static final AbstractC2394b1 getLocalPreviewImageLoader() {
        return LocalPreviewImageLoader;
    }

    public static final /* synthetic */ AbstractC6923b getPreviewPlaceholderBlocking(InterfaceC6845d interfaceC6845d, h imageRequest) {
        AbstractC5504s.h(interfaceC6845d, "<this>");
        AbstractC5504s.h(imageRequest, "imageRequest");
        return null;
    }
}
