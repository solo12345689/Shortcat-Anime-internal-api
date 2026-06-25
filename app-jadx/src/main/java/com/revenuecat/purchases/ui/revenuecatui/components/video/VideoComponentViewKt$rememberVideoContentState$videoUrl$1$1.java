package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.storage.FileRepository;
import ie.InterfaceC5082a;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/net/URI;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ FileRepository $repository;
    final /* synthetic */ VideoUrls $videoUrls;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentViewKt$rememberVideoContentState$videoUrl$1$1(VideoUrls videoUrls, FileRepository fileRepository) {
        super(0);
        this.$videoUrls = videoUrls;
        this.$repository = fileRepository;
    }

    @Override // ie.InterfaceC5082a
    public final URI invoke() {
        return VideoComponentViewKt.resolveVideoUrl(this.$videoUrls, this.$repository);
    }
}
