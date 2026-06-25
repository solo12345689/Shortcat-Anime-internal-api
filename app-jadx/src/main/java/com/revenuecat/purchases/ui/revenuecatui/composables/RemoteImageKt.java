package com.revenuecat.purchases.ui.revenuecatui.composables;

import G4.b;
import G4.h;
import I0.InterfaceC1680f;
import J4.a;
import Td.L;
import U.D;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import v4.InterfaceC6845d;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001ae\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aY\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a{\u0010#\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b%\u0010&¨\u0006)²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "resource", "Landroidx/compose/ui/e;", "modifier", "LI0/f;", "contentScale", "", "contentDescription", "LJ4/a;", "transformation", "", "alpha", "Landroidx/compose/ui/graphics/d;", "colorFilter", "LTd/L;", "LocalImage", "(ILandroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V", "urlString", "placeholderUrlString", "RemoteImage", "(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;", "source", "placeholderSource", "Image", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;Landroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V", "LG4/h;", "imageRequest", "Lv4/d;", "imageLoader", "Lw0/b;", "placeholder", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "AsyncImage", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;LG4/h;Lv4/d;Landroidx/compose/ui/e;Lw0/b;LI0/f;Ljava/lang/String;FLandroidx/compose/ui/graphics/d;Lkotlin/jvm/functions/Function1;LY/m;II)V", "ImageForPreviews", "(Landroidx/compose/ui/e;LY/m;I)V", "LG4/b;", "cachePolicy", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RemoteImageKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$AsyncImage$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ InterfaceC6845d $imageLoader;
        final /* synthetic */ h $imageRequest;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ AbstractC6923b $placeholder;
        final /* synthetic */ ImageSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ImageSource imageSource, h hVar, InterfaceC6845d interfaceC6845d, e eVar, AbstractC6923b abstractC6923b, InterfaceC1680f interfaceC1680f, String str, float f10, d dVar, Function1 function1, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$imageRequest = hVar;
            this.$imageLoader = interfaceC6845d;
            this.$modifier = eVar;
            this.$placeholder = abstractC6923b;
            this.$contentScale = interfaceC1680f;
            this.$contentDescription = str;
            this.$alpha = f10;
            this.$colorFilter = dVar;
            this.$onError = function1;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.AsyncImage(this.$source, this.$imageRequest, this.$imageLoader, this.$modifier, this.$placeholder, this.$contentScale, this.$contentDescription, this.$alpha, this.$colorFilter, this.$onError, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$Image$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageSource imageSource, ImageSource imageSource2, e eVar, InterfaceC1680f interfaceC1680f, String str, a aVar, float f10, d dVar, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = interfaceC1680f;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$colorFilter = dVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$Image$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ImageSource $placeholderSource;
        final /* synthetic */ ImageSource $source;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ImageSource imageSource, ImageSource imageSource2, e eVar, InterfaceC1680f interfaceC1680f, String str, a aVar, float f10, d dVar, int i10, int i11) {
            super(2);
            this.$source = imageSource;
            this.$placeholderSource = imageSource2;
            this.$modifier = eVar;
            this.$contentScale = interfaceC1680f;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$colorFilter = dVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.Image(this.$source, this.$placeholderSource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$ImageForPreviews$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43081 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43081(e eVar, int i10) {
            super(2);
            this.$modifier = eVar;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.ImageForPreviews(this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$LocalImage$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43091 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ int $resource;
        final /* synthetic */ a $transformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43091(int i10, e eVar, InterfaceC1680f interfaceC1680f, String str, a aVar, float f10, d dVar, int i11, int i12) {
            super(2);
            this.$resource = i10;
            this.$modifier = eVar;
            this.$contentScale = interfaceC1680f;
            this.$contentDescription = str;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$colorFilter = dVar;
            this.$$changed = i11;
            this.$$default = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.LocalImage(this.$resource, this.$modifier, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt$RemoteImage$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43102 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ float $alpha;
        final /* synthetic */ d $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ InterfaceC1680f $contentScale;
        final /* synthetic */ e $modifier;
        final /* synthetic */ String $placeholderUrlString;
        final /* synthetic */ a $transformation;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43102(String str, e eVar, String str2, InterfaceC1680f interfaceC1680f, String str3, a aVar, float f10, d dVar, int i10, int i11) {
            super(2);
            this.$urlString = str;
            this.$modifier = eVar;
            this.$placeholderUrlString = str2;
            this.$contentScale = interfaceC1680f;
            this.$contentDescription = str3;
            this.$transformation = aVar;
            this.$alpha = f10;
            this.$colorFilter = dVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RemoteImageKt.RemoteImage(this.$urlString, this.$modifier, this.$placeholderUrlString, this.$contentScale, this.$contentDescription, this.$transformation, this.$alpha, this.$colorFilter, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AsyncImage(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r32, G4.h r33, v4.InterfaceC6845d r34, androidx.compose.ui.e r35, w0.AbstractC6923b r36, I0.InterfaceC1680f r37, java.lang.String r38, float r39, androidx.compose.ui.graphics.d r40, kotlin.jvm.functions.Function1 r41, Y.InterfaceC2425m r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.AsyncImage(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, G4.h, v4.d, androidx.compose.ui.e, w0.b, I0.f, java.lang.String, float, androidx.compose.ui.graphics.d, kotlin.jvm.functions.Function1, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Image(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r18, com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource r19, androidx.compose.ui.e r20, I0.InterfaceC1680f r21, java.lang.String r22, J4.a r23, float r24, androidx.compose.ui.graphics.d r25, Y.InterfaceC2425m r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.Image(com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource, androidx.compose.ui.e, I0.f, java.lang.String, J4.a, float, androidx.compose.ui.graphics.d, Y.m, int, int):void");
    }

    private static final b Image$lambda$2(C0 c02) {
        return (b) c02.getValue();
    }

    public static final void ImageForPreviews(e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        e eVar2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-523416196);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            eVar2 = eVar;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-523416196, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ImageForPreviews (RemoteImage.kt:211)");
            }
            eVar2 = eVar;
            f.a(androidx.compose.foundation.b.d(eVar2, D.f17597a.a(interfaceC2425mG, D.f17598b).C(), null, 2, null), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43081(eVar2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LocalImage(int r20, androidx.compose.ui.e r21, I0.InterfaceC1680f r22, java.lang.String r23, J4.a r24, float r25, androidx.compose.ui.graphics.d r26, Y.InterfaceC2425m r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.LocalImage(int, androidx.compose.ui.e, I0.f, java.lang.String, J4.a, float, androidx.compose.ui.graphics.d, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteImage(java.lang.String r22, androidx.compose.ui.e r23, java.lang.String r24, I0.InterfaceC1680f r25, java.lang.String r26, J4.a r27, float r28, androidx.compose.ui.graphics.d r29, Y.InterfaceC2425m r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt.RemoteImage(java.lang.String, androidx.compose.ui.e, java.lang.String, I0.f, java.lang.String, J4.a, float, androidx.compose.ui.graphics.d, Y.m, int, int):void");
    }
}
