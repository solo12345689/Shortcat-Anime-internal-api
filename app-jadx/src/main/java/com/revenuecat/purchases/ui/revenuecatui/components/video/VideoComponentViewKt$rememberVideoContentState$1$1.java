package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import java.net.URL;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1", f = "VideoComponentView.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class VideoComponentViewKt$rememberVideoContentState$1$1 extends l implements Function2 {
    final /* synthetic */ FileRepository $repository;
    final /* synthetic */ VideoUrls $videoUrls;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$1", f = "VideoComponentView.kt", l = {148}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ FileRepository $repository;
        final /* synthetic */ VideoUrls $videoUrls;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VideoUrls videoUrls, FileRepository fileRepository, Zd.e eVar) {
            super(2, eVar);
            this.$videoUrls = videoUrls;
            this.$repository = fileRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new AnonymousClass1(this.$videoUrls, this.$repository, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                URL url = this.$videoUrls.getUrl();
                Checksum checksum = this.$videoUrls.getChecksum();
                FileRepository fileRepository = this.$repository;
                this.label = 1;
                if (VideoComponentViewKt.cacheVideo(url, checksum, fileRepository, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentViewKt$rememberVideoContentState$1$1(VideoUrls videoUrls, FileRepository fileRepository, Zd.e eVar) {
        super(2, eVar);
        this.$videoUrls = videoUrls;
        this.$repository = fileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Zd.e create(Object obj, Zd.e eVar) {
        VideoComponentViewKt$rememberVideoContentState$1$1 videoComponentViewKt$rememberVideoContentState$1$1 = new VideoComponentViewKt$rememberVideoContentState$1$1(this.$videoUrls, this.$repository, eVar);
        videoComponentViewKt$rememberVideoContentState$1$1.L$0 = obj;
        return videoComponentViewKt$rememberVideoContentState$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, Zd.e eVar) {
        return ((VideoComponentViewKt$rememberVideoContentState$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        O o10 = (O) this.L$0;
        AbstractC1617k.d(o10, null, null, new AnonymousClass1(this.$videoUrls, this.$repository, null), 3, null);
        URL urlLowRes = this.$videoUrls.getUrlLowRes();
        if (urlLowRes != null) {
            if (AbstractC5504s.c(urlLowRes, this.$videoUrls.getUrl())) {
                urlLowRes = null;
            }
            if (urlLowRes != null) {
                AbstractC1617k.d(o10, null, null, new VideoComponentViewKt$rememberVideoContentState$1$1$3$1(urlLowRes, this.$videoUrls, this.$repository, null), 3, null);
            }
        }
        return L.f17438a;
    }
}
