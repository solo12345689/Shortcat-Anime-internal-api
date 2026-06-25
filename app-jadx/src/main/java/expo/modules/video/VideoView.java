package expo.modules.video;

import Fd.A;
import Fd.AbstractC1584x;
import Fd.C1579s;
import Fd.C1580t;
import Fd.C1583w;
import G3.v;
import G3.x;
import Hd.b;
import Hd.c;
import Id.k;
import Id.m;
import Md.l;
import Td.L;
import Ub.d;
import Ud.AbstractC2279u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.ImageButton;
import androidx.media3.ui.PlayerView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.w;
import com.facebook.react.uimanager.f0;
import expo.modules.kotlin.views.h;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.ContentFit;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.ButtonOptions;
import expo.modules.video.records.FullscreenOptions;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import pe.InterfaceC6023m;
import q2.d0;
import q2.h0;
import vc.C6859c;
import vc.InterfaceC6858b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 Ç\u00012\u00020\u00012\u00020\u0002:\u0002È\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJU\u0010-\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0&H\u0016¢\u0006\u0004\b-\u0010.J)\u00101\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010/\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0010J7\u0010?\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bH\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0014¢\u0006\u0004\bA\u0010\u0010J\u001f\u0010E\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u000bH\u0014¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000eH\u0014¢\u0006\u0004\bG\u0010\u0010J\u0019\u0010J\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\u00072\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bL\u0010KR\u0017\u0010N\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010S\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR!\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0W8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R!\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0W8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010Y\u001a\u0004\b^\u0010[R!\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000e0W8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[R!\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000e0W8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[R!\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0W8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bf\u0010Y\u001a\u0004\bg\u0010[R\"\u0010i\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010p\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u0010j\u001a\u0004\bp\u0010lR$\u0010q\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010j\u001a\u0004\br\u0010lR$\u0010s\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bs\u0010j\u001a\u0004\bt\u0010lR*\u0010u\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010j\u001a\u0004\bv\u0010l\"\u0004\bw\u0010nR*\u0010y\u001a\u00020x2\u0006\u0010o\u001a\u00020x8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0081\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u001b0\u0080\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R5\u0010\u009c\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u00018F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010\u009d\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010j\u001a\u0005\b\u009e\u0001\u0010l\"\u0005\b\u009f\u0001\u0010nR5\u0010 \u0001\u001a\u0004\u0018\u00010\u00072\b\u0010o\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R1\u0010©\u0001\u001a\u00020\u00072\u0007\u0010\u0095\u0001\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b¦\u0001\u0010\u0097\u0001\u001a\u0005\b§\u0001\u0010l\"\u0005\b¨\u0001\u0010nR3\u0010«\u0001\u001a\u00030ª\u00012\u0007\u0010o\u001a\u00030ª\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R5\u0010²\u0001\u001a\u0004\u0018\u00010 2\t\u0010±\u0001\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u00108R.\u0010·\u0001\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010j\u001a\u0005\b¸\u0001\u0010l\"\u0005\b¹\u0001\u0010nR.\u0010º\u0001\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bº\u0001\u0010j\u001a\u0005\b»\u0001\u0010l\"\u0005\b¼\u0001\u0010nR3\u0010¾\u0001\u001a\u00030½\u00012\u0007\u0010o\u001a\u00030½\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006É\u0001"}, d2 = {"Lexpo/modules/video/VideoView;", "Lexpo/modules/kotlin/views/h;", "LHd/b;", "Landroid/content/Context;", "context", "LUb/d;", "appContext", "", "useTextureView", "<init>", "(Landroid/content/Context;LUb/d;Z)V", "", "getPlayerViewLayoutId", "(Z)I", "LTd/L;", "setupCaptioningChangeListener", "()V", "applyButtonSettings", "applySurfaceViewVisibility", "enterFullscreen", "attachPlayer", "exitFullscreen", "enterPictureInPicture", "pipCandidate", "onStartPictureInPicture", "(Lexpo/modules/video/VideoView;)V", "onStopPictureInPicture", "LHd/c;", "listener", "addVideoViewListener", "(LHd/c;)V", "removeVideoViewListener", "Lexpo/modules/video/player/VideoPlayer;", "player", "Lexpo/modules/video/records/VideoSource;", "videoSource", "", "duration", "", "Lexpo/modules/video/records/VideoTrack;", "availableVideoTracks", "Lexpo/modules/video/records/SubtitleTrack;", "availableSubtitleTracks", "Lexpo/modules/video/records/AudioTrack;", "availableAudioTracks", "onVideoSourceLoaded", "(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "isPlaying", "oldIsPlaying", "onIsPlayingChanged", "(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V", "Lq2/h0;", "tracks", "onTracksChanged", "(Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V", "onRenderedFirstFrame", "(Lexpo/modules/video/player/VideoPlayer;)V", "requestLayout", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onAttachedToWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "", "videoViewId", "Ljava/lang/String;", "getVideoViewId", "()Ljava/lang/String;", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "Lvc/b;", "onPictureInPictureStart$delegate", "Lvc/c;", "getOnPictureInPictureStart", "()Lvc/b;", "onPictureInPictureStart", "onPictureInPictureStop$delegate", "getOnPictureInPictureStop", "onPictureInPictureStop", "onFullscreenEnter$delegate", "getOnFullscreenEnter", "onFullscreenEnter", "onFullscreenExit$delegate", "getOnFullscreenExit", "onFullscreenExit", "onFirstFrameRender$delegate", "getOnFirstFrameRender", "onFirstFrameRender", "wasAutoPaused", "Z", "getWasAutoPaused", "()Z", "setWasAutoPaused", "(Z)V", "value", "isInFullscreen", "currentTrackHasSubtitles", "getCurrentTrackHasSubtitles", "showsAudioTracksButton", "getShowsAudioTracksButton", "requiresLinearPlayback", "getRequiresLinearPlayback", "setRequiresLinearPlayback", "Lexpo/modules/video/records/ButtonOptions;", "buttonOptions", "Lexpo/modules/video/records/ButtonOptions;", "getButtonOptions", "()Lexpo/modules/video/records/ButtonOptions;", "setButtonOptions", "(Lexpo/modules/video/records/ButtonOptions;)V", "", "Ljava/lang/ref/WeakReference;", "listeners", "Ljava/util/List;", "Landroid/app/Activity;", "currentActivity", "Landroid/app/Activity;", "decorView", "Landroid/view/View;", "Lcom/facebook/react/uimanager/events/w;", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/w;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactNativeEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "captioningChangeListener", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "windowFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "LLd/a;", "<set-?>", "pipParams$delegate", "LGd/b;", "getPipParams", "()LLd/a;", "setPipParams", "(LLd/a;)V", "pipParams", "shouldHideSurfaceView", "getShouldHideSurfaceView", "setShouldHideSurfaceView", "useExoShutter", "Ljava/lang/Boolean;", "getUseExoShutter", "()Ljava/lang/Boolean;", "setUseExoShutter", "(Ljava/lang/Boolean;)V", "autoEnterPiP$delegate", "getAutoEnterPiP", "setAutoEnterPiP", "autoEnterPiP", "Lexpo/modules/video/enums/ContentFit;", "contentFit", "Lexpo/modules/video/enums/ContentFit;", "getContentFit", "()Lexpo/modules/video/enums/ContentFit;", "setContentFit", "(Lexpo/modules/video/enums/ContentFit;)V", "newPlayer", "videoPlayer", "Lexpo/modules/video/player/VideoPlayer;", "getVideoPlayer", "()Lexpo/modules/video/player/VideoPlayer;", "setVideoPlayer", "useNativeControls", "getUseNativeControls", "setUseNativeControls", "allowsFullscreen", "getAllowsFullscreen", "setAllowsFullscreen", "Lexpo/modules/video/records/FullscreenOptions;", "fullscreenOptions", "Lexpo/modules/video/records/FullscreenOptions;", "getFullscreenOptions", "()Lexpo/modules/video/records/FullscreenOptions;", "setFullscreenOptions", "(Lexpo/modules/video/records/FullscreenOptions;)V", "Ljava/lang/Runnable;", "mLayoutRunnable", "Ljava/lang/Runnable;", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class VideoView extends h implements b {
    static final /* synthetic */ InterfaceC6023m[] $$delegatedProperties = {O.k(new F(VideoView.class, "onPictureInPictureStart", "getOnPictureInPictureStart()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(VideoView.class, "onPictureInPictureStop", "getOnPictureInPictureStop()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(VideoView.class, "onFullscreenEnter", "getOnFullscreenEnter()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(VideoView.class, "onFullscreenExit", "getOnFullscreenExit()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.k(new F(VideoView.class, "onFirstFrameRender", "getOnFirstFrameRender()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), O.e(new z(VideoView.class, "pipParams", "getPipParams()Lexpo/modules/video/records/PiPParams;", 0)), O.e(new z(VideoView.class, "autoEnterPiP", "getAutoEnterPiP()Z", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean allowsFullscreen;

    /* JADX INFO: renamed from: autoEnterPiP$delegate, reason: from kotlin metadata */
    private final Gd.b autoEnterPiP;
    private ButtonOptions buttonOptions;
    private CaptioningManager.CaptioningChangeListener captioningChangeListener;
    private ContentFit contentFit;
    private final Activity currentActivity;
    private boolean currentTrackHasSubtitles;
    private final View decorView;
    private FullscreenOptions fullscreenOptions;
    private boolean isInFullscreen;
    private List<WeakReference<c>> listeners;
    private final Runnable mLayoutRunnable;

    /* JADX INFO: renamed from: onFirstFrameRender$delegate, reason: from kotlin metadata */
    private final C6859c onFirstFrameRender;

    /* JADX INFO: renamed from: onFullscreenEnter$delegate, reason: from kotlin metadata */
    private final C6859c onFullscreenEnter;

    /* JADX INFO: renamed from: onFullscreenExit$delegate, reason: from kotlin metadata */
    private final C6859c onFullscreenExit;

    /* JADX INFO: renamed from: onPictureInPictureStart$delegate, reason: from kotlin metadata */
    private final C6859c onPictureInPictureStart;

    /* JADX INFO: renamed from: onPictureInPictureStop$delegate, reason: from kotlin metadata */
    private final C6859c onPictureInPictureStop;

    /* JADX INFO: renamed from: pipParams$delegate, reason: from kotlin metadata */
    private final Gd.b pipParams;
    private final PlayerView playerView;
    private EventDispatcher reactNativeEventDispatcher;
    private boolean requiresLinearPlayback;
    private boolean shouldHideSurfaceView;
    private boolean showsAudioTracksButton;
    private final w touchEventCoalescingKeyHelper;
    private Boolean useExoShutter;
    private boolean useNativeControls;
    private VideoPlayer videoPlayer;
    private final String videoViewId;
    private boolean wasAutoPaused;
    private final View.OnFocusChangeListener windowFocusChangeListener;

    /* JADX INFO: renamed from: expo.modules.video.VideoView$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Activity currentActivity) {
            AbstractC5504s.h(currentActivity, "currentActivity");
            return Build.VERSION.SDK_INT >= 26 && currentActivity.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(final Context context, d appContext, boolean z10) throws IllegalAccessException, cc.h, InvocationTargetException {
        super(context, appContext);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "toString(...)");
        this.videoViewId = string;
        View viewInflate = LayoutInflater.from(context.getApplicationContext()).inflate(getPlayerViewLayoutId(z10), (ViewGroup) null);
        AbstractC5504s.f(viewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) viewInflate;
        this.playerView = playerView;
        this.onPictureInPictureStart = new C6859c(this, null);
        this.onPictureInPictureStop = new C6859c(this, null);
        this.onFullscreenEnter = new C6859c(this, null);
        this.onFullscreenExit = new C6859c(this, null);
        this.onFirstFrameRender = new C6859c(this, null);
        this.buttonOptions = new ButtonOptions(false, false, false, false, null, false, false, false, 255, null);
        this.listeners = new ArrayList();
        Activity activityF = appContext.F();
        this.currentActivity = activityF;
        View decorView = activityF.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        this.decorView = decorView;
        this.touchEventCoalescingKeyHelper = new w();
        this.windowFocusChangeListener = new View.OnFocusChangeListener() { // from class: Fd.U
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                VideoView.windowFocusChangeListener$lambda$0(this.f6627a, context, view, z11);
            }
        };
        this.pipParams = new Gd.b(new Ld.a(false, false, false, false, null, null, 63, null), null, new Function2() { // from class: Fd.V
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoView.pipParams_delegate$lambda$2(this.f6629a, (Ld.a) obj, (Ld.a) obj2);
            }
        }, 2, null);
        this.shouldHideSurfaceView = true;
        this.autoEnterPiP = new Gd.b(Boolean.FALSE, null, new Function2() { // from class: Fd.W
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VideoView.autoEnterPiP_delegate$lambda$3(this.f6630a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, 2, null);
        this.contentFit = ContentFit.CONTAIN;
        this.useNativeControls = true;
        this.allowsFullscreen = true;
        this.fullscreenOptions = new FullscreenOptions(false, null, false, 7, null);
        this.mLayoutRunnable = new Runnable() { // from class: Fd.X
            @Override // java.lang.Runnable
            public final void run() {
                VideoView.mLayoutRunnable$lambda$8(this.f6631a);
            }
        };
        m.f9065a.q(this);
        playerView.setFullscreenButtonClickListener(new PlayerView.e() { // from class: Fd.Y
            @Override // androidx.media3.ui.PlayerView.e
            public final void a(boolean z11) {
                this.f6632a.enterFullscreen();
            }
        });
        playerView.setUseController(false);
        playerView.setShutterBackgroundColor(0);
        View videoSurfaceView = playerView.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.setAlpha(0.0f);
        }
        Md.m.f12391a.a(playerView, context);
        addView(playerView, new ViewGroup.LayoutParams(-1, -1));
        Context contextB = appContext.B();
        AbstractC5504s.f(contextB, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        this.reactNativeEventDispatcher = f0.b((ReactContext) contextB, getId());
    }

    private final void applyButtonSettings() {
        Boolean showSubtitles = this.buttonOptions.getShowSubtitles();
        boolean zBooleanValue = showSubtitles != null ? showSubtitles.booleanValue() : this.currentTrackHasSubtitles;
        AbstractC1584x.a(this.playerView, this.buttonOptions, this.requiresLinearPlayback);
        this.playerView.setShowSubtitleButton(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L autoEnterPiP_delegate$lambda$3(VideoView videoView, boolean z10, boolean z11) {
        videoView.setPipParams(Ld.a.b(videoView.getPipParams(), z10, false, false, false, null, null, 62, null));
        return L.f17438a;
    }

    private final int getPlayerViewLayoutId(boolean useTextureView) {
        return useTextureView ? A.f6612c : A.f6611b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mLayoutRunnable$lambda$8(VideoView videoView) {
        videoView.measure(View.MeasureSpec.makeMeasureSpec(videoView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(videoView.getHeight(), 1073741824));
        videoView.layout(videoView.getLeft(), videoView.getTop(), videoView.getRight(), videoView.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L pipParams_delegate$lambda$2(VideoView videoView, Ld.a aVar, Ld.a old) {
        AbstractC5504s.h(aVar, "new");
        AbstractC5504s.h(old, "old");
        Iterator<T> it = videoView.listeners.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.a(videoView, old, aVar);
            }
        }
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeVideoViewListener$lambda$11(c cVar, WeakReference it) {
        AbstractC5504s.h(it, "it");
        return !AbstractC5504s.c(it.get(), cVar);
    }

    private final void setPipParams(Ld.a aVar) {
        this.pipParams.d(this, $$delegatedProperties[5], aVar);
    }

    private final void setupCaptioningChangeListener() {
        Object systemService = getContext().getSystemService("captioning");
        CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        Md.m mVar = Md.m.f12391a;
        PlayerView playerView = this.playerView;
        Context context = getContext();
        AbstractC5504s.g(context, "getContext(...)");
        CaptioningManager.CaptioningChangeListener captioningChangeListenerB = mVar.b(playerView, context);
        this.captioningChangeListener = captioningChangeListenerB;
        if (captioningChangeListenerB == null || captioningManager == null) {
            return;
        }
        captioningManager.addCaptioningChangeListener(captioningChangeListenerB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void windowFocusChangeListener$lambda$0(VideoView videoView, Context context, View view, boolean z10) {
        if (z10) {
            Md.m.f12391a.a(videoView.playerView, context);
        }
    }

    public final void addVideoViewListener(c listener) {
        AbstractC5504s.h(listener, "listener");
        List<WeakReference<c>> list = this.listeners;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC5504s.c(((WeakReference) it.next()).get(), listener)) {
                    return;
                }
            }
        }
        this.listeners.add(new WeakReference<>(listener));
    }

    public final void applySurfaceViewVisibility() {
        if (AbstractC5504s.c(this.useExoShutter, Boolean.TRUE) || !this.shouldHideSurfaceView) {
            View videoSurfaceView = this.playerView.getVideoSurfaceView();
            if (videoSurfaceView != null) {
                videoSurfaceView.setAlpha(1.0f);
                return;
            }
            return;
        }
        View videoSurfaceView2 = this.playerView.getVideoSurfaceView();
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.setAlpha(0.0f);
        }
    }

    public final void attachPlayer() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.c2(this);
        }
    }

    public final void enterFullscreen() {
        Intent intent = new Intent(getContext(), (Class<?>) FullscreenPlayerActivity.class);
        intent.putExtra("player_uuid", this.videoViewId);
        intent.putExtra("fullscreen_options", this.fullscreenOptions);
        this.isInFullscreen = true;
        this.currentActivity.startActivity(intent);
        if (Build.VERSION.SDK_INT >= 34) {
            this.currentActivity.overrideActivityTransition(0, 0, 0);
        } else {
            this.currentActivity.overridePendingTransition(0, 0);
        }
        getOnFullscreenEnter().invoke(L.f17438a);
        setPipParams(Ld.a.b(getPipParams(), false, false, false, true, null, null, 55, null));
    }

    public final void enterPictureInPicture() throws C1579s, C1580t, C1583w {
        if (!INSTANCE.a(this.currentActivity)) {
            throw new C1583w();
        }
        if (this.playerView.getPlayer() == null) {
            throw new C1580t("No player attached to the VideoView");
        }
        setPipParams(Ld.a.b(getPipParams(), false, false, true, false, null, null, 59, null));
        m.f9065a.d().l(this);
    }

    public final void exitFullscreen() {
        View viewFindViewById = this.playerView.findViewById(x.f7212s);
        AbstractC5504s.g(viewFindViewById, "findViewById(...)");
        ((ImageButton) viewFindViewById).setImageResource(v.f7153b);
        attachPlayer();
        getOnFullscreenExit().invoke(L.f17438a);
        this.isInFullscreen = false;
        setPipParams(Ld.a.b(getPipParams(), false, false, false, false, null, null, 55, null));
    }

    public final boolean getAllowsFullscreen() {
        return this.allowsFullscreen;
    }

    public final boolean getAutoEnterPiP() {
        return ((Boolean) this.autoEnterPiP.c(this, $$delegatedProperties[6])).booleanValue();
    }

    public final ButtonOptions getButtonOptions() {
        return this.buttonOptions;
    }

    public final ContentFit getContentFit() {
        return this.contentFit;
    }

    public final boolean getCurrentTrackHasSubtitles() {
        return this.currentTrackHasSubtitles;
    }

    public final FullscreenOptions getFullscreenOptions() {
        return this.fullscreenOptions;
    }

    public final InterfaceC6858b getOnFirstFrameRender() {
        return this.onFirstFrameRender.a(this, $$delegatedProperties[4]);
    }

    public final InterfaceC6858b getOnFullscreenEnter() {
        return this.onFullscreenEnter.a(this, $$delegatedProperties[2]);
    }

    public final InterfaceC6858b getOnFullscreenExit() {
        return this.onFullscreenExit.a(this, $$delegatedProperties[3]);
    }

    public final InterfaceC6858b getOnPictureInPictureStart() {
        return this.onPictureInPictureStart.a(this, $$delegatedProperties[0]);
    }

    public final InterfaceC6858b getOnPictureInPictureStop() {
        return this.onPictureInPictureStop.a(this, $$delegatedProperties[1]);
    }

    public final Ld.a getPipParams() {
        return (Ld.a) this.pipParams.c(this, $$delegatedProperties[5]);
    }

    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    public final boolean getRequiresLinearPlayback() {
        return this.requiresLinearPlayback;
    }

    public final boolean getShouldHideSurfaceView() {
        return this.shouldHideSurfaceView;
    }

    public final boolean getShowsAudioTracksButton() {
        return this.showsAudioTracksButton;
    }

    public final Boolean getUseExoShutter() {
        return this.useExoShutter;
    }

    public final boolean getUseNativeControls() {
        return this.useNativeControls;
    }

    public final VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public final String getVideoViewId() {
        return this.videoViewId;
    }

    public final boolean getWasAutoPaused() {
        return this.wasAutoPaused;
    }

    /* JADX INFO: renamed from: isInFullscreen, reason: from getter */
    public final boolean getIsInFullscreen() {
        return this.isInFullscreen;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupCaptioningChangeListener();
        Md.m mVar = Md.m.f12391a;
        PlayerView playerView = this.playerView;
        Context context = getContext();
        AbstractC5504s.g(context, "getContext(...)");
        mVar.a(playerView, context);
        this.decorView.setOnFocusChangeListener(this.windowFocusChangeListener);
        setPipParams(Ld.a.b(getPipParams(), false, true, false, false, null, null, 61, null));
    }

    @Override // Hd.b
    public void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        b.a.a(this, videoPlayer, audioMixingMode, audioMixingMode2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CaptioningManager.CaptioningChangeListener captioningChangeListener = this.captioningChangeListener;
        if (captioningChangeListener != null) {
            Object systemService = getContext().getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            if (captioningManager != null) {
                captioningManager.removeCaptioningChangeListener(captioningChangeListener);
            }
            this.captioningChangeListener = null;
        }
        this.decorView.setOnFocusChangeListener(null);
        setPipParams(Ld.a.b(getPipParams(), false, false, false, false, null, null, 61, null));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (!this.useNativeControls || event == null) {
            return false;
        }
        this.touchEventCoalescingKeyHelper.a(event.getEventTime());
        EventDispatcher eventDispatcher = this.reactNativeEventDispatcher;
        if (eventDispatcher == null) {
            return false;
        }
        Md.a.a(eventDispatcher, this, MotionEvent.obtainNoHistory(event), this.touchEventCoalescingKeyHelper);
        return false;
    }

    @Override // Hd.b
    public void onIsPlayingChanged(VideoPlayer player, boolean isPlaying, Boolean oldIsPlaying) {
        AbstractC5504s.h(player, "player");
        if (AbstractC5504s.c(player, this.videoPlayer) && isPlaying) {
            this.wasAutoPaused = false;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        super.onLayout(changed, l10, t10, r10, b10);
        setPipParams(Ld.a.b(getPipParams(), false, false, false, false, null, l.i(this.playerView), 31, null));
        PlayerView playerView = this.playerView;
        VideoPlayer videoPlayer = this.videoPlayer;
        AbstractC1584x.g(playerView, videoPlayer != null ? videoPlayer.getRequiresLinearPlayback() : true);
    }

    @Override // Hd.b
    public void onMutedChanged(VideoPlayer videoPlayer, boolean z10, Boolean bool) {
        b.a.c(this, videoPlayer, z10, bool);
    }

    @Override // Hd.b
    public void onPlaybackRateChanged(VideoPlayer videoPlayer, float f10, Float f11) {
        b.a.d(this, videoPlayer, f10, f11);
    }

    @Override // Hd.b
    public void onPlayedToEnd(VideoPlayer videoPlayer) {
        b.a.e(this, videoPlayer);
    }

    @Override // Hd.b
    public void onRenderedFirstFrame(VideoPlayer player) {
        AbstractC5504s.h(player, "player");
        if (AbstractC5504s.c(player.q2(), this)) {
            this.shouldHideSurfaceView = false;
            applySurfaceViewVisibility();
            getOnFirstFrameRender().invoke(L.f17438a);
        }
    }

    @Override // Hd.b
    public void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2) {
        b.a.g(this, videoPlayer, videoSource, videoSource2);
    }

    public final void onStartPictureInPicture(VideoView pipCandidate) {
        getOnPictureInPictureStart().invoke(L.f17438a);
    }

    @Override // Hd.b
    public void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError) {
        b.a.h(this, videoPlayer, playerStatus, playerStatus2, playbackError);
    }

    public final void onStopPictureInPicture(VideoView pipCandidate) {
        setPipParams(Ld.a.b(getPipParams(), false, false, false, false, null, null, 59, null));
        getOnPictureInPictureStop().invoke(L.f17438a);
    }

    @Override // Hd.b
    public void onTargetViewChanged(VideoPlayer videoPlayer, VideoView videoView, VideoView videoView2) {
        b.a.i(this, videoPlayer, videoView, videoView2);
    }

    @Override // Hd.b
    public void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate) {
        b.a.j(this, videoPlayer, timeUpdate);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.useNativeControls && event != null) {
            this.touchEventCoalescingKeyHelper.a(event.getEventTime());
            EventDispatcher eventDispatcher = this.reactNativeEventDispatcher;
            if (eventDispatcher != null) {
                Md.a.a(eventDispatcher, this, event, this.touchEventCoalescingKeyHelper);
            }
        }
        if (event != null && event.getActionMasked() == 1) {
            performClick();
        }
        return true;
    }

    @Override // Hd.b
    public void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, d0 d0Var) {
        b.a.k(this, videoPlayer, d0Var);
    }

    @Override // Hd.b
    public void onTracksChanged(VideoPlayer player, h0 tracks) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(tracks, "tracks");
        this.currentTrackHasSubtitles = !player.getSubtitles().c().isEmpty();
        this.showsAudioTracksButton = player.getAudioTracks().c().size() > 1;
        PlayerView playerView = this.playerView;
        Boolean showSubtitles = this.buttonOptions.getShowSubtitles();
        playerView.setShowSubtitleButton(showSubtitles != null ? showSubtitles.booleanValue() : this.currentTrackHasSubtitles);
        b.a.l(this, player, tracks);
    }

    @Override // Hd.b
    public void onVideoSourceLoaded(VideoPlayer player, VideoSource videoSource, Double duration, List<VideoTrack> availableVideoTracks, List<SubtitleTrack> availableSubtitleTracks, List<AudioTrack> availableAudioTracks) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(availableVideoTracks, "availableVideoTracks");
        AbstractC5504s.h(availableSubtitleTracks, "availableSubtitleTracks");
        AbstractC5504s.h(availableAudioTracks, "availableAudioTracks");
        setPipParams(Ld.a.b(getPipParams(), false, false, false, false, k.a(this), null, 47, null));
        b.a.m(this, player, videoSource, duration, availableVideoTracks, availableSubtitleTracks, availableAudioTracks);
    }

    @Override // Hd.b
    public void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2) {
        b.a.n(this, videoPlayer, videoTrack, videoTrack2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int visibility) {
        AbstractC5504s.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            Md.m mVar = Md.m.f12391a;
            PlayerView playerView = this.playerView;
            Context context = getContext();
            AbstractC5504s.g(context, "getContext(...)");
            mVar.a(playerView, context);
        }
    }

    @Override // Hd.b
    public void onVolumeChanged(VideoPlayer videoPlayer, float f10, Float f11) {
        b.a.o(this, videoPlayer, f10, f11);
    }

    public final void removeVideoViewListener(final c listener) {
        AbstractC5504s.h(listener, "listener");
        AbstractC2279u.Q(this.listeners, new Function1() { // from class: Fd.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(VideoView.removeVideoViewListener$lambda$11(listener, (WeakReference) obj));
            }
        });
    }

    @Override // expo.modules.kotlin.views.h, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public final void setAllowsFullscreen(boolean z10) {
        if (z10) {
            this.playerView.setFullscreenButtonClickListener(new PlayerView.e() { // from class: Fd.T
                @Override // androidx.media3.ui.PlayerView.e
                public final void a(boolean z11) {
                    this.f6626a.enterFullscreen();
                }
            });
        } else {
            this.playerView.setFullscreenButtonClickListener(null);
            AbstractC1584x.d(this.playerView, false);
        }
        this.allowsFullscreen = z10;
    }

    public final void setAutoEnterPiP(boolean z10) {
        this.autoEnterPiP.d(this, $$delegatedProperties[6], Boolean.valueOf(z10));
    }

    public final void setButtonOptions(ButtonOptions value) {
        AbstractC5504s.h(value, "value");
        this.buttonOptions = value;
        applyButtonSettings();
    }

    public final void setContentFit(ContentFit value) {
        AbstractC5504s.h(value, "value");
        this.playerView.setResizeMode(value.toResizeMode());
        this.contentFit = value;
    }

    public final void setFullscreenOptions(FullscreenOptions value) {
        AbstractC5504s.h(value, "value");
        this.fullscreenOptions = value;
        if (value.getEnable()) {
            this.playerView.setFullscreenButtonClickListener(new PlayerView.e() { // from class: Fd.Z
                @Override // androidx.media3.ui.PlayerView.e
                public final void a(boolean z10) {
                    this.f6633a.enterFullscreen();
                }
            });
        } else {
            this.playerView.setFullscreenButtonClickListener(null);
            AbstractC1584x.d(this.playerView, false);
        }
    }

    public final void setRequiresLinearPlayback(boolean z10) {
        this.requiresLinearPlayback = z10;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.l3(z10);
        }
        AbstractC1584x.b(this.playerView, z10);
        applyButtonSettings();
    }

    public final void setShouldHideSurfaceView(boolean z10) {
        this.shouldHideSurfaceView = z10;
    }

    public final void setUseExoShutter(Boolean bool) {
        if (AbstractC5504s.c(bool, Boolean.TRUE)) {
            this.playerView.setShutterBackgroundColor(-16777216);
        } else {
            this.playerView.setShutterBackgroundColor(0);
        }
        applySurfaceViewVisibility();
        this.useExoShutter = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setUseNativeControls(boolean r3) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r2 = this;
            if (r3 == 0) goto L15
            expo.modules.video.records.ButtonOptions r0 = r2.buttonOptions
            java.lang.Boolean r0 = r0.getShowSubtitles()
            if (r0 == 0) goto Lf
            boolean r0 = r0.booleanValue()
            goto L11
        Lf:
            boolean r0 = r2.currentTrackHasSubtitles
        L11:
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.media3.ui.PlayerView r1 = r2.playerView
            r1.setUseController(r3)
            androidx.media3.ui.PlayerView r1 = r2.playerView
            r1.setShowSubtitleButton(r0)
            r2.useNativeControls = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.VideoView.setUseNativeControls(boolean):void");
    }

    public final void setVideoPlayer(VideoPlayer videoPlayer) {
        Kd.b firstFrameEventGenerator;
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            m.f9065a.m(videoPlayer2, this);
        }
        VideoPlayer videoPlayer3 = this.videoPlayer;
        boolean zG = (videoPlayer == null || (firstFrameEventGenerator = videoPlayer.getFirstFrameEventGenerator()) == null) ? false : firstFrameEventGenerator.G();
        if (videoPlayer3 != null) {
            videoPlayer3.V2(this);
        }
        if (videoPlayer != null) {
            videoPlayer.a2(this);
        }
        this.videoPlayer = videoPlayer;
        this.shouldHideSurfaceView = !zG;
        applySurfaceViewVisibility();
        attachPlayer();
        if (videoPlayer != null) {
            m.f9065a.l(videoPlayer, this);
        }
        if (AbstractC5504s.c(videoPlayer3, videoPlayer) || videoPlayer3 == null) {
            return;
        }
        videoPlayer3.L2();
    }

    public final void setWasAutoPaused(boolean z10) {
        this.wasAutoPaused = z10;
    }

    public /* synthetic */ VideoView(Context context, d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, (i10 & 4) != 0 ? false : z10);
    }
}
