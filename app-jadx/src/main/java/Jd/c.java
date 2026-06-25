package Jd;

import android.os.Binder;
import expo.modules.video.playbackService.ExpoVideoPlaybackService;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Binder {

    /* JADX INFO: renamed from: a */
    private final ExpoVideoPlaybackService f9489a;

    public c(ExpoVideoPlaybackService service) {
        AbstractC5504s.h(service, "service");
        this.f9489a = service;
    }

    public final ExpoVideoPlaybackService a() {
        return this.f9489a;
    }
}
