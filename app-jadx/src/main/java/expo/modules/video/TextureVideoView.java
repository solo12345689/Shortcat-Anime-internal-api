package expo.modules.video;

import Ub.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/video/TextureVideoView;", "Lexpo/modules/video/VideoView;", "Landroid/content/Context;", "context", "LUb/d;", "appContext", "<init>", "(Landroid/content/Context;LUb/d;)V", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextureVideoView extends VideoView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, d appContext) {
        super(context, appContext, true);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
    }
}
