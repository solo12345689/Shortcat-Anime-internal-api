package Md;

import G3.C1592a;
import android.content.Context;
import android.view.accessibility.CaptioningManager;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f12391a = new m();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends CaptioningManager.CaptioningChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PlayerView f12392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12393b;

        a(PlayerView playerView, Context context) {
            this.f12392a = playerView;
            this.f12393b = context;
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onEnabledChanged(boolean z10) {
            m.f12391a.a(this.f12392a, this.f12393b);
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onFontScaleChanged(float f10) {
            m.f12391a.a(this.f12392a, this.f12393b);
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onUserStyleChanged(CaptioningManager.CaptionStyle userStyle) {
            AbstractC5504s.h(userStyle, "userStyle");
            m.f12391a.a(this.f12392a, this.f12393b);
        }
    }

    private m() {
    }

    public final void a(PlayerView playerView, Context context) {
        AbstractC5504s.h(playerView, "playerView");
        AbstractC5504s.h(context, "context");
        SubtitleView subtitleView = playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setApplyEmbeddedStyles(false);
            subtitleView.setApplyEmbeddedFontSizes(false);
            Object systemService = context.getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            CaptioningManager.CaptionStyle userStyle = captioningManager != null ? captioningManager.getUserStyle() : null;
            if (userStyle != null) {
                C1592a c1592aA = C1592a.a(userStyle);
                AbstractC5504s.g(c1592aA, "createFromCaptionStyle(...)");
                subtitleView.setStyle(c1592aA);
                subtitleView.b(2, captioningManager.getFontScale() * 16.0f);
            }
        }
    }

    public final CaptioningManager.CaptioningChangeListener b(PlayerView playerView, Context context) {
        AbstractC5504s.h(playerView, "playerView");
        AbstractC5504s.h(context, "context");
        return new a(playerView, context);
    }
}
