package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.L;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.h2;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006#²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010!\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/storage/FileRepository;", "repository", "LTd/L;", "VideoComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;II)V", "Lr0/h;", "", "viewportWidth", "viewportHeight", "", "isVisibleInViewport", "(Lr0/h;II)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "videoUrls", "Ljava/net/URI;", "rememberVideoContentState", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;I)Ljava/net/URI;", "resolveVideoUrl", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/storage/FileRepository;)Ljava/net/URI;", "Ljava/net/URL;", "url", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "cacheVideo", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lcom/revenuecat/purchases/storage/FileRepository;LZd/e;)Ljava/lang/Object;", "Ls0/E1;", "composeShape", "isVisible", "videoReady", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class VideoComponentViewKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$VideoComponentView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/e;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;", "it", "invoke", "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e applyIfNotNull, AspectRatio it) {
            AbstractC5504s.h(applyIfNotNull, "$this$applyIfNotNull");
            AbstractC5504s.h(it, "it");
            return AspectRatioKt.aspectRatio(applyIfNotNull, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$VideoComponentView$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass6 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ FileRepository $repository;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ VideoComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(VideoComponentStyle videoComponentStyle, PaywallState.Loaded.Components components, androidx.compose.ui.e eVar, FileRepository fileRepository, int i10, int i11) {
            super(2);
            this.$style = videoComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$repository = fileRepository;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            VideoComponentViewKt.VideoComponentView(this.$style, this.$state, this.$modifier, this.$repository, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt", f = "VideoComponentView.kt", l = {183}, m = "cacheVideo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43001 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C43001(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VideoComponentViewKt.cacheVideo(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void VideoComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle r40, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r41, androidx.compose.ui.e r42, com.revenuecat.purchases.storage.FileRepository r43, Y.InterfaceC2425m r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.VideoComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, com.revenuecat.purchases.storage.FileRepository, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E1 VideoComponentView$lambda$3(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    private static final boolean VideoComponentView$lambda$5(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoComponentView$lambda$6(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    private static final boolean VideoComponentView$lambda$8(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoComponentView$lambda$9(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object cacheVideo(java.net.URL r4, com.revenuecat.purchases.models.Checksum r5, com.revenuecat.purchases.storage.FileRepository r6, Zd.e r7) {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.C43001
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.C43001) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$cacheVideo$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            java.net.URL r4 = (java.net.URL) r4
            Td.v.b(r7)     // Catch: java.lang.Exception -> L2d
            goto L5b
        L2d:
            r5 = move-exception
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Td.v.b(r7)
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r4 = r6.generateOrGetCachedFileURL(r4, r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r4 != r1) goto L5b
            return r1
        L45:
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to cache video: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.e(r4, r5)
        L5b:
            Td.L r4 = Td.L.f17438a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt.cacheVideo(java.net.URL, com.revenuecat.purchases.models.Checksum, com.revenuecat.purchases.storage.FileRepository, Zd.e):java.lang.Object");
    }

    public static final /* synthetic */ boolean isVisibleInViewport(C6226h c6226h, int i10, int i11) {
        AbstractC5504s.h(c6226h, "<this>");
        return c6226h.j() > 0.0f && c6226h.e() > 0.0f && c6226h.i() < ((float) i10) && c6226h.l() < ((float) i11);
    }

    private static final URI rememberVideoContentState(VideoUrls videoUrls, FileRepository fileRepository, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(541496876);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(541496876, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.video.rememberVideoContentState (VideoComponentView.kt:140)");
        }
        Object[] objArr = {videoUrls.getUrl()};
        interfaceC2425m.V(-494481958);
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean zF = ((i11 > 4 && interfaceC2425m.U(videoUrls)) || (i10 & 6) == 4) | interfaceC2425m.F(fileRepository);
        Object objD = interfaceC2425m.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            objD = new VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1(videoUrls, fileRepository);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        URI uri = (URI) h0.d.e(objArr, null, null, (InterfaceC5082a) objD, interfaceC2425m, 0, 6);
        URL url = videoUrls.getUrl();
        interfaceC2425m.V(-494476975);
        if ((i11 <= 4 || !interfaceC2425m.U(videoUrls)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zF2 = interfaceC2425m.F(fileRepository) | z10;
        Object objD2 = interfaceC2425m.D();
        if (zF2 || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = new VideoComponentViewKt$rememberVideoContentState$1$1(videoUrls, fileRepository, null);
            interfaceC2425m.u(objD2);
        }
        interfaceC2425m.O();
        AbstractC2393b0.e(url, (Function2) objD2, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return uri;
    }

    public static final /* synthetic */ URI resolveVideoUrl(VideoUrls videoUrls, FileRepository repository) throws URISyntaxException {
        URI file;
        AbstractC5504s.h(videoUrls, "videoUrls");
        AbstractC5504s.h(repository, "repository");
        URI file2 = repository.getFile(videoUrls.getUrl(), videoUrls.getChecksum());
        if (file2 != null) {
            return file2;
        }
        URL urlLowRes = videoUrls.getUrlLowRes();
        if (urlLowRes != null) {
            if (AbstractC5504s.c(urlLowRes, videoUrls.getUrl())) {
                urlLowRes = null;
            }
            if (urlLowRes != null && (file = repository.getFile(urlLowRes, videoUrls.getChecksumLowRes())) != null) {
                return file;
            }
        }
        URI uri = videoUrls.getUrl().toURI();
        AbstractC5504s.g(uri, "videoUrls.url.toURI()");
        return uri;
    }
}
