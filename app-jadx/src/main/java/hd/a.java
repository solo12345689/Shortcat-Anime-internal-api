package Hd;

import expo.modules.video.VideoView;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface a {
    void b(VideoView videoView, Collection collection);

    void c(VideoView videoView, Collection collection);

    void onAppBackgrounded();

    void onAppForegrounded();

    /* JADX INFO: renamed from: Hd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0110a {
        public static void b(a aVar, VideoView videoView, Collection allVideoViews) {
            AbstractC5504s.h(videoView, "videoView");
            AbstractC5504s.h(allVideoViews, "allVideoViews");
        }

        public static void c(a aVar, VideoView videoView, Collection allVideoViews) {
            AbstractC5504s.h(videoView, "videoView");
            AbstractC5504s.h(allVideoViews, "allVideoViews");
        }

        public static void a(a aVar) {
        }
    }
}
