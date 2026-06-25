package Md;

import E3.C1375h3;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final C1375h3 a(Context context, ExoPlayer player) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(player, "player");
        C1375h3 c1375h3D = new C1375h3.b(context, player).g("ExpoVideoBasicMediaSession_" + player.hashCode()).d();
        AbstractC5504s.g(c1375h3D, "build(...)");
        return c1375h3D;
    }
}
