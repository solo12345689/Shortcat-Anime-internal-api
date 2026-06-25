package expo.modules.video;

import Fd.A;
import Fd.AbstractC1584x;
import Fd.AbstractC1586z;
import Fd.C1564c;
import Fd.C1565d;
import Fd.C1579s;
import G3.v;
import G3.x;
import Hd.a;
import Md.c;
import Md.l;
import Md.m;
import Td.L;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Rational;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.CaptioningManager;
import android.widget.ImageButton;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.video.FullscreenPlayerActivity;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.ButtonOptions;
import expo.modules.video.records.FullscreenOptions;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import q2.InterfaceC6084P;
import q2.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lexpo/modules/video/FullscreenPlayerActivity;", "Landroid/app/Activity;", "LHd/a;", "<init>", "()V", "LTd/L;", "n", "h", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPostCreate", "finish", "onResume", "onPause", "onStop", "onStart", "onDestroy", "onAppForegrounded", "", "isInPictureInPictureMode", "Landroid/content/res/Configuration;", "newConfig", "onPictureInPictureModeChanged", "(ZLandroid/content/res/Configuration;)V", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/View;", "a", "Landroid/view/View;", "mContentView", "", "b", "Ljava/lang/String;", "videoViewId", "Lexpo/modules/video/player/VideoPlayer;", "c", "Lexpo/modules/video/player/VideoPlayer;", "videoPlayer", "Landroidx/media3/ui/PlayerView;", "d", "Landroidx/media3/ui/PlayerView;", "playerView", "Lexpo/modules/video/VideoView;", "e", "Lexpo/modules/video/VideoView;", "videoView", "f", "Z", "didFinish", "g", "wasAutoPaused", "isStopped", "Lexpo/modules/video/records/FullscreenOptions;", "i", "Lexpo/modules/video/records/FullscreenOptions;", "options", "LMd/c;", "j", "LMd/c;", "orientationHelper", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "k", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "captioningChangeListener", "l", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullscreenPlayerActivity extends Activity implements Hd.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private View mContentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String videoViewId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private VideoPlayer videoPlayer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PlayerView playerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private VideoView videoView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean didFinish;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean wasAutoPaused;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isStopped;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private FullscreenOptions options;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private c orientationHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private CaptioningManager.CaptioningChangeListener captioningChangeListener;

    private final void h() {
        View view = null;
        if (Build.VERSION.SDK_INT < 30) {
            View view2 = this.mContentView;
            if (view2 == null) {
                AbstractC5504s.u("mContentView");
            } else {
                view = view2;
            }
            view.setSystemUiVisibility(4871);
            return;
        }
        View view3 = this.mContentView;
        if (view3 == null) {
            AbstractC5504s.u("mContentView");
        } else {
            view = view3;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.setSystemBarsBehavior(2);
            windowInsetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        }
    }

    public static final L i(FullscreenPlayerActivity fullscreenPlayerActivity) {
        fullscreenPlayerActivity.finish();
        return L.f17438a;
    }

    public static final L j(FullscreenPlayerActivity fullscreenPlayerActivity) {
        fullscreenPlayerActivity.setRequestedOrientation(-1);
        return L.f17438a;
    }

    public static final void k(FullscreenPlayerActivity fullscreenPlayerActivity, boolean z10, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        PlayerView playerView = fullscreenPlayerActivity.playerView;
        if (playerView == null) {
            AbstractC5504s.u("playerView");
            playerView = null;
        }
        AbstractC1584x.g(playerView, z10);
    }

    public static final void l(FullscreenPlayerActivity fullscreenPlayerActivity, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws C1579s {
        PlayerView playerView = fullscreenPlayerActivity.playerView;
        if (playerView == null) {
            AbstractC5504s.u("playerView");
            playerView = null;
        }
        l.f(fullscreenPlayerActivity, l.i(playerView));
    }

    private final void m() {
        Object systemService = getSystemService("captioning");
        PlayerView playerView = null;
        CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        m mVar = m.f12391a;
        PlayerView playerView2 = this.playerView;
        if (playerView2 == null) {
            AbstractC5504s.u("playerView");
        } else {
            playerView = playerView2;
        }
        CaptioningManager.CaptioningChangeListener captioningChangeListenerB = mVar.b(playerView, this);
        this.captioningChangeListener = captioningChangeListenerB;
        if (captioningChangeListenerB == null || captioningManager == null) {
            return;
        }
        captioningManager.addCaptioningChangeListener(captioningChangeListenerB);
    }

    private final void n() {
        PlayerView playerView = this.playerView;
        PlayerView playerView2 = null;
        if (playerView == null) {
            AbstractC5504s.u("playerView");
            playerView = null;
        }
        playerView.setFullscreenButtonClickListener(new PlayerView.e() { // from class: Fd.k
            @Override // androidx.media3.ui.PlayerView.e
            public final void a(boolean z10) {
                FullscreenPlayerActivity.o(this.f6640a, z10);
            }
        });
        PlayerView playerView3 = this.playerView;
        if (playerView3 == null) {
            AbstractC5504s.u("playerView");
        } else {
            playerView2 = playerView3;
        }
        View viewFindViewById = playerView2.findViewById(x.f7212s);
        AbstractC5504s.g(viewFindViewById, "findViewById(...)");
        ((ImageButton) viewFindViewById).setImageResource(v.f7154c);
    }

    public static final void o(FullscreenPlayerActivity fullscreenPlayerActivity, boolean z10) {
        fullscreenPlayerActivity.finish();
    }

    @Override // Hd.a
    public void b(VideoView videoView, Collection collection) {
        a.C0110a.b(this, videoView, collection);
    }

    @Override // Hd.a
    public void c(VideoView videoView, Collection collection) {
        a.C0110a.c(this, videoView, collection);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        this.didFinish = true;
        String str = this.videoViewId;
        if (str != null) {
            Id.m.f9065a.e(str).attachPlayer();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    @Override // Hd.a
    public void onAppBackgrounded() {
        a.C0110a.a(this);
    }

    @Override // Hd.a
    public void onAppForegrounded() {
        if (this.isStopped || isInPictureInPictureMode()) {
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        c cVar = this.orientationHelper;
        if (cVar != null) {
            cVar.j(newConfig);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws C1579s {
        FullscreenOptions fullscreenOptions;
        Id.m mVar;
        VideoView videoViewE;
        ExoPlayer player;
        super.onCreate(savedInstanceState);
        try {
            String stringExtra = getIntent().getStringExtra("player_uuid");
            if (stringExtra == null) {
                throw new C1565d();
            }
            this.videoViewId = stringExtra;
            VideoView videoView = null;
            if (Build.VERSION.SDK_INT >= 33) {
                fullscreenOptions = (FullscreenOptions) getIntent().getSerializableExtra("fullscreen_options", FullscreenOptions.class);
                if (fullscreenOptions == null) {
                    throw new C1564c();
                }
            } else {
                Serializable serializableExtra = getIntent().getSerializableExtra("fullscreen_options");
                fullscreenOptions = serializableExtra instanceof FullscreenOptions ? (FullscreenOptions) serializableExtra : null;
                if (fullscreenOptions == null) {
                    throw new C1564c();
                }
            }
            this.options = fullscreenOptions;
            String str = this.videoViewId;
            if (str == null || (videoViewE = (mVar = Id.m.f9065a).e(str)) == null) {
                throw new C1565d();
            }
            this.videoView = videoViewE;
            FullscreenOptions fullscreenOptions2 = this.options;
            if (fullscreenOptions2 == null) {
                AbstractC5504s.u("options");
                fullscreenOptions2 = null;
            }
            c cVar = new c(this, fullscreenOptions2, new InterfaceC5082a() { // from class: Fd.g
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return FullscreenPlayerActivity.i(this.f6635a);
                }
            }, new InterfaceC5082a() { // from class: Fd.h
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return FullscreenPlayerActivity.j(this.f6636a);
                }
            });
            this.orientationHelper = cVar;
            cVar.l();
            setContentView(A.f6610a);
            this.mContentView = findViewById(AbstractC1586z.f6656a);
            this.playerView = (PlayerView) findViewById(AbstractC1586z.f6657b);
            FullscreenOptions fullscreenOptions3 = this.options;
            if (fullscreenOptions3 == null) {
                AbstractC5504s.u("options");
                fullscreenOptions3 = null;
            }
            setRequestedOrientation(fullscreenOptions3.getOrientation().toActivityOrientation());
            VideoView videoView2 = this.videoView;
            if (videoView2 == null) {
                AbstractC5504s.u("videoView");
                videoView2 = null;
            }
            VideoPlayer videoPlayer = videoView2.getVideoPlayer();
            this.videoPlayer = videoPlayer;
            if (videoPlayer != null && (player = videoPlayer.getPlayer()) != null) {
                VideoView videoView3 = this.videoView;
                if (videoView3 == null) {
                    AbstractC5504s.u("videoView");
                    videoView3 = null;
                }
                PlayerView playerView = videoView3.getPlayerView();
                PlayerView playerView2 = this.playerView;
                if (playerView2 == null) {
                    AbstractC5504s.u("playerView");
                    playerView2 = null;
                }
                PlayerView.U(player, playerView, playerView2);
                VideoPlayer videoPlayer2 = this.videoPlayer;
                if (videoPlayer2 != null) {
                    videoPlayer2.L2();
                }
            }
            mVar.n(String.valueOf(hashCode()), this);
            mVar.o(this);
            PlayerView playerView3 = this.playerView;
            if (playerView3 == null) {
                AbstractC5504s.u("playerView");
                playerView3 = null;
            }
            InterfaceC6084P player2 = playerView3.getPlayer();
            if (player2 != null) {
                l0 l0VarW0 = player2.w0();
                AbstractC5504s.g(l0VarW0, "getVideoSize(...)");
                PlayerView playerView4 = this.playerView;
                if (playerView4 == null) {
                    AbstractC5504s.u("playerView");
                    playerView4 = null;
                }
                int width = playerView4.getWidth();
                PlayerView playerView5 = this.playerView;
                if (playerView5 == null) {
                    AbstractC5504s.u("playerView");
                    playerView5 = null;
                }
                int height = playerView5.getHeight();
                VideoView videoView4 = this.videoView;
                if (videoView4 == null) {
                    AbstractC5504s.u("videoView");
                    videoView4 = null;
                }
                Rational rationalH = l.h(l0VarW0, width, height, videoView4.getContentFit());
                VideoView videoView5 = this.videoView;
                if (videoView5 == null) {
                    AbstractC5504s.u("videoView");
                } else {
                    videoView = videoView5;
                }
                l.c(this, videoView.getAutoEnterPiP(), rationalH);
            }
        } catch (CodedException e10) {
            Log.e("ExpoVideo", String.valueOf(e10.getMessage()), e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        CaptioningManager.CaptioningChangeListener captioningChangeListener = this.captioningChangeListener;
        VideoView videoView = null;
        if (captioningChangeListener != null) {
            Object systemService = getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            if (captioningManager != null) {
                captioningManager.removeCaptioningChangeListener(captioningChangeListener);
            }
            this.captioningChangeListener = null;
        }
        VideoView videoView2 = this.videoView;
        if (videoView2 == null) {
            AbstractC5504s.u("videoView");
        } else {
            videoView = videoView2;
        }
        videoView.exitFullscreen();
        Id.m mVar = Id.m.f9065a;
        mVar.x(this);
        mVar.w(String.valueOf(hashCode()));
        c cVar = this.orientationHelper;
        if (cVar != null) {
            cVar.m();
        }
    }

    @Override // android.app.Activity
    protected void onPause() throws IllegalAccessException, InvocationTargetException {
        ExoPlayer player;
        ExoPlayer player2;
        VideoPlayer videoPlayer = this.videoPlayer;
        if ((videoPlayer == null || !videoPlayer.getStaysActiveInBackground()) && !this.didFinish) {
            VideoPlayer videoPlayer2 = this.videoPlayer;
            boolean z10 = (videoPlayer2 == null || (player2 = videoPlayer2.getPlayer()) == null || !player2.isPlaying()) ? false : true;
            this.wasAutoPaused = z10;
            if (z10) {
                PlayerView playerView = this.playerView;
                if (playerView == null) {
                    AbstractC5504s.u("playerView");
                    playerView = null;
                }
                playerView.setUseController(false);
                VideoPlayer videoPlayer3 = this.videoPlayer;
                if (videoPlayer3 != null && (player = videoPlayer3.getPlayer()) != null) {
                    player.pause();
                }
            }
        }
        c cVar = this.orientationHelper;
        if (cVar != null) {
            cVar.m();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) throws IllegalAccessException, InvocationTargetException {
        VideoPlayer videoPlayer;
        ExoPlayer player;
        PlayerView playerView = null;
        VideoView videoView = null;
        if (isInPictureInPictureMode) {
            PlayerView playerView2 = this.playerView;
            if (playerView2 == null) {
                AbstractC5504s.u("playerView");
            } else {
                playerView = playerView2;
            }
            playerView.setUseController(false);
        } else {
            PlayerView playerView3 = this.playerView;
            if (playerView3 == null) {
                AbstractC5504s.u("playerView");
                playerView3 = null;
            }
            VideoView videoView2 = this.videoView;
            if (videoView2 == null) {
                AbstractC5504s.u("videoView");
            } else {
                videoView = videoView2;
            }
            playerView3.setUseController(videoView.getUseNativeControls());
        }
        if (this.wasAutoPaused && isInPictureInPictureMode && (videoPlayer = this.videoPlayer) != null && (player = videoPlayer.getPlayer()) != null) {
            player.u();
        }
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle savedInstanceState) {
        boolean currentTrackHasSubtitles;
        super.onPostCreate(savedInstanceState);
        h();
        n();
        VideoPlayer videoPlayer = this.videoPlayer;
        final boolean requiresLinearPlayback = videoPlayer != null ? videoPlayer.getRequiresLinearPlayback() : false;
        VideoView videoView = this.videoView;
        PlayerView playerView = null;
        if (videoView == null) {
            AbstractC5504s.u("videoView");
            videoView = null;
        }
        ButtonOptions buttonOptionsCopy$default = ButtonOptions.copy$default(videoView.getButtonOptions(), false, false, false, false, null, false, false, true, 127, null);
        PlayerView playerView2 = this.playerView;
        if (playerView2 == null) {
            AbstractC5504s.u("playerView");
            playerView2 = null;
        }
        AbstractC1584x.a(playerView2, buttonOptionsCopy$default, requiresLinearPlayback);
        PlayerView playerView3 = this.playerView;
        if (playerView3 == null) {
            AbstractC5504s.u("playerView");
            playerView3 = null;
        }
        AbstractC1584x.g(playerView3, requiresLinearPlayback);
        PlayerView playerView4 = this.playerView;
        if (playerView4 == null) {
            AbstractC5504s.u("playerView");
            playerView4 = null;
        }
        playerView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Fd.i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                FullscreenPlayerActivity.k(this.f6637a, requiresLinearPlayback, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        PlayerView playerView5 = this.playerView;
        if (playerView5 == null) {
            AbstractC5504s.u("playerView");
            playerView5 = null;
        }
        VideoView videoView2 = this.videoView;
        if (videoView2 == null) {
            AbstractC5504s.u("videoView");
            videoView2 = null;
        }
        Boolean showSubtitles = videoView2.getButtonOptions().getShowSubtitles();
        if (showSubtitles != null) {
            currentTrackHasSubtitles = showSubtitles.booleanValue();
        } else {
            VideoView videoView3 = this.videoView;
            if (videoView3 == null) {
                AbstractC5504s.u("videoView");
                videoView3 = null;
            }
            currentTrackHasSubtitles = videoView3.getCurrentTrackHasSubtitles();
        }
        playerView5.setShowSubtitleButton(currentTrackHasSubtitles);
        m mVar = m.f12391a;
        PlayerView playerView6 = this.playerView;
        if (playerView6 == null) {
            AbstractC5504s.u("playerView");
            playerView6 = null;
        }
        mVar.a(playerView6, this);
        m();
        PlayerView playerView7 = this.playerView;
        if (playerView7 == null) {
            AbstractC5504s.u("playerView");
        } else {
            playerView = playerView7;
        }
        playerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Fd.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws C1579s {
                FullscreenPlayerActivity.l(this.f6639a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    @Override // android.app.Activity
    protected void onResume() throws IllegalAccessException, InvocationTargetException {
        c cVar = this.orientationHelper;
        if (cVar != null) {
            cVar.l();
        }
        PlayerView playerView = this.playerView;
        PlayerView playerView2 = null;
        if (playerView == null) {
            AbstractC5504s.u("playerView");
            playerView = null;
        }
        playerView.setUseController(true);
        m mVar = m.f12391a;
        PlayerView playerView3 = this.playerView;
        if (playerView3 == null) {
            AbstractC5504s.u("playerView");
        } else {
            playerView2 = playerView3;
        }
        mVar.a(playerView2, this);
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.isStopped = false;
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.isStopped = true;
        super.onStop();
    }
}
