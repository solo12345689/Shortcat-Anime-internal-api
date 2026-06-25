package com.revenuecat.purchases.ui.revenuecatui.components.video;

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

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt$rememberVideoContentState$1$1$3$1", f = "VideoComponentView.kt", l = {150}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class VideoComponentViewKt$rememberVideoContentState$1$1$3$1 extends l implements Function2 {
    final /* synthetic */ URL $it;
    final /* synthetic */ FileRepository $repository;
    final /* synthetic */ VideoUrls $videoUrls;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentViewKt$rememberVideoContentState$1$1$3$1(URL url, VideoUrls videoUrls, FileRepository fileRepository, Zd.e eVar) {
        super(2, eVar);
        this.$it = url;
        this.$videoUrls = videoUrls;
        this.$repository = fileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Zd.e create(Object obj, Zd.e eVar) {
        return new VideoComponentViewKt$rememberVideoContentState$1$1$3$1(this.$it, this.$videoUrls, this.$repository, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, Zd.e eVar) {
        return ((VideoComponentViewKt$rememberVideoContentState$1$1$3$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            URL url = this.$it;
            Checksum checksumLowRes = this.$videoUrls.getChecksumLowRes();
            FileRepository fileRepository = this.$repository;
            this.label = 1;
            if (VideoComponentViewKt.cacheVideo(url, checksumLowRes, fileRepository, this) == objF) {
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
