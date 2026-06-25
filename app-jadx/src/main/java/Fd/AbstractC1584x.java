package Fd;

import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.media3.ui.C2924b;
import androidx.media3.ui.PlayerView;
import expo.modules.video.records.ButtonOptions;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Fd.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1584x {
    public static final void a(PlayerView playerView, ButtonOptions config, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        AbstractC5504s.h(config, "config");
        boolean z11 = false;
        playerView.setShowFastForwardButton(!z10 && config.getShowSeekForward());
        playerView.setShowRewindButton(!z10 && config.getShowSeekBackward());
        playerView.setShowPreviousButton(!z10 && config.getShowPrevious());
        if (!z10 && config.getShowNext()) {
            z11 = true;
        }
        playerView.setShowNextButton(z11);
        f(playerView, config.getShowSettings());
        e(playerView, config.getShowPlayPause());
        c(playerView, config.getShowBottomBar());
    }

    public static final void b(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        playerView.setShowFastForwardButton(!z10);
        playerView.setShowRewindButton(!z10);
        playerView.setShowPreviousButton(!z10);
        playerView.setShowNextButton(!z10);
        g(playerView, z10);
    }

    public static final void c(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        ViewGroup viewGroup = (ViewGroup) playerView.findViewById(G3.x.f7198e);
        if (viewGroup != null) {
            viewGroup.setVisibility(z10 ? 0 : 8);
        }
        C2924b c2924b = (C2924b) playerView.findViewById(G3.x.f7180G);
        if (c2924b != null) {
            c2924b.setVisibility(z10 ? 0 : 8);
        }
    }

    public static final void d(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        ImageButton imageButton = (ImageButton) playerView.findViewById(G3.x.f7212s);
        if (imageButton != null) {
            imageButton.setVisibility(z10 ? 0 : 8);
        }
    }

    public static final void e(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        ImageButton imageButton = (ImageButton) playerView.findViewById(G3.x.f7176C);
        if (imageButton != null) {
            imageButton.setVisibility(z10 ? 0 : 8);
        }
    }

    public static final void f(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        ImageButton imageButton = (ImageButton) playerView.findViewById(G3.x.f7185L);
        if (imageButton != null) {
            imageButton.setVisibility(z10 ? 0 : 8);
        }
    }

    public static final void g(PlayerView playerView, boolean z10) {
        AbstractC5504s.h(playerView, "<this>");
        C2924b c2924b = (C2924b) playerView.findViewById(G3.x.f7180G);
        if (z10) {
            if (c2924b != null) {
                c2924b.setScrubberColor(0);
            }
            if (c2924b != null) {
                c2924b.setEnabled(false);
                return;
            }
            return;
        }
        if (c2924b != null) {
            c2924b.setScrubberColor(-1);
        }
        if (c2924b != null) {
            c2924b.setEnabled(true);
        }
    }
}
