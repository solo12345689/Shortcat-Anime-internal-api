package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.L;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.MediaController;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002^_B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b)\u0010'J\u001d\u0010,\u001a\u00020\f2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\u000f\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010\u000eJ\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u0012J\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00102J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u00107J\u000f\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\fH\u0014¢\u0006\u0004\b=\u0010\u000eJ\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010?R\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010?R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010?R\u0016\u0010R\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010?R\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010LR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010L¨\u0006`"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;", "Landroid/widget/FrameLayout;", "Landroid/widget/MediaController$MediaPlayerControl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "showControls", "muteAudio", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)V", "LTd/L;", "prepareIfNeeded", "()V", "", "position", "safeSeekTo", "(I)V", "Landroid/view/Surface;", "takeAttachedSurface", "()Landroid/view/Surface;", "applySizing", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;", "getPlaybackState", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;", "state", "setPlaybackState", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;)V", "Landroid/net/Uri;", "uri", "setVideoURI", "(Landroid/net/Uri;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;", "type", "setScaleType", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;)V", "loop", "setLooping", "(Z)V", "enabled", "setAutoStart", "Lkotlin/Function0;", "callback", "setOnReadyCallback", "(Lie/a;)V", "release", "start", "pause", "getDuration", "()I", "getCurrentPosition", "pos", "seekTo", "isPlaying", "()Z", "getBufferPercentage", "canPause", "canSeekBackward", "canSeekForward", "getAudioSessionId", "onDetachedFromWindow", "startIfNeeded", "Z", "Landroid/view/TextureView;", "texture", "Landroid/view/TextureView;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;", "playerOwner", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;", "Landroid/widget/MediaController;", "controller", "Landroid/widget/MediaController;", "attachedSurface", "Landroid/view/Surface;", "videoWidth", "I", "videoHeight", "prepared", "released", "Landroid/net/Uri;", "autoStart", "scaleType", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;", "firstFrameRendered", "onReadyCallback", "Lie/a;", "resumePosMs", "resumePlayWhenReady", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "viewTreeObserverListening", "prepareRequestId", "PlaybackState", "ScaleType", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TextureVideoView extends FrameLayout implements MediaController.MediaPlayerControl {
    private Surface attachedSurface;
    private boolean autoStart;
    private MediaController controller;
    private boolean firstFrameRendered;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private final boolean muteAudio;
    private InterfaceC5082a onReadyCallback;
    private final MediaPlayerThreadOwner playerOwner;
    private int prepareRequestId;
    private boolean prepared;
    private boolean released;
    private boolean resumePlayWhenReady;
    private int resumePosMs;
    private ScaleType scaleType;
    private final boolean showControls;
    private final TextureView texture;
    private Uri uri;
    private int videoHeight;
    private int videoWidth;
    private boolean viewTreeObserverListening;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$PlaybackState;", "", "positionMs", "", "playWhenReady", "", "(IZ)V", "getPlayWhenReady", "()Z", "getPositionMs", "()I", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlaybackState {
        public static final int $stable = 0;
        private final boolean playWhenReady;
        private final int positionMs;

        public PlaybackState(int i10, boolean z10) {
            this.positionMs = i10;
            this.playWhenReady = z10;
        }

        public final boolean getPlayWhenReady() {
            return this.playWhenReady;
        }

        public final int getPositionMs() {
            return this.positionMs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;", "", "(Ljava/lang/String;I)V", "FIT", "FILL", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ScaleType {
        FIT,
        FILL
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView$prepareIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "width", "height", "LTd/L;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42991 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42991(int i10) {
            super(2);
            this.$requestId = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(int i10, int i11) {
            MediaController mediaController;
            if (TextureVideoView.this.released || this.$requestId != TextureVideoView.this.prepareRequestId) {
                return;
            }
            TextureVideoView.this.prepared = true;
            TextureVideoView.this.videoWidth = i10;
            TextureVideoView.this.videoHeight = i11;
            TextureVideoView.this.applySizing();
            if (TextureVideoView.this.resumePosMs > 0) {
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.safeSeekTo(textureVideoView.resumePosMs);
            } else if (TextureVideoView.this.resumePosMs == 0) {
                TextureVideoView.this.safeSeekTo(1);
            }
            if (TextureVideoView.this.autoStart || TextureVideoView.this.resumePlayWhenReady) {
                TextureVideoView.this.start();
            }
            if (!TextureVideoView.this.showControls || (mediaController = TextureVideoView.this.controller) == null) {
                return;
            }
            mediaController.show();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView$prepareIfNeeded$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "width", "height", "LTd/L;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$requestId = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(int i10, int i11) {
            if (TextureVideoView.this.released || this.$requestId != TextureVideoView.this.prepareRequestId) {
                return;
            }
            TextureVideoView.this.videoWidth = i10;
            TextureVideoView.this.videoHeight = i11;
            TextureVideoView.this.applySizing();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, boolean z10, boolean z11) {
        this(context, null, z10, z11, 2, null);
        AbstractC5504s.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(TextureVideoView textureVideoView, View view) {
        MediaController mediaController;
        if (!textureVideoView.showControls || (mediaController = textureVideoView.controller) == null) {
            return;
        }
        mediaController.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySizing() {
        if (this.released || getWidth() == 0 || getHeight() == 0 || this.videoWidth == 0 || this.videoHeight == 0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        float f13 = this.videoWidth / this.videoHeight;
        ViewGroup.LayoutParams layoutParams = this.texture.getLayoutParams();
        AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.scaleType == ScaleType.FIT) {
            if (f13 > f12) {
                layoutParams2.width = width;
                layoutParams2.height = (int) (f10 / f13);
            } else {
                layoutParams2.height = height;
                layoutParams2.width = (int) (f11 * f13);
            }
        } else if (f13 > f12) {
            layoutParams2.height = height;
            layoutParams2.width = (int) (f11 * f13);
        } else {
            layoutParams2.width = width;
            layoutParams2.height = (int) (f10 / f13);
        }
        layoutParams2.gravity = 17;
        this.texture.setLayoutParams(layoutParams2);
        this.texture.setVisibility(0);
        this.texture.setAlpha(1.0f);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareIfNeeded() {
        Uri uri;
        if (this.released || (uri = this.uri) == null) {
            return;
        }
        int i10 = this.prepareRequestId + 1;
        this.prepareRequestId = i10;
        this.prepared = false;
        this.playerOwner.prepare(uri, new C42991(i10), new AnonymousClass2(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeSeekTo(int position) {
        if (!this.prepared || position <= 0) {
            return;
        }
        this.playerOwner.seekTo(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Surface takeAttachedSurface() {
        Surface surface = this.attachedSurface;
        this.attachedSurface = null;
        return surface;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return this.playerOwner.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return (!this.prepared || this.released) ? this.resumePosMs : this.playerOwner.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (!this.prepared || this.released) {
            return 0;
        }
        return this.playerOwner.getDuration();
    }

    public final PlaybackState getPlaybackState() {
        return new PlaybackState(this.prepared ? this.playerOwner.getCurrentPosition() : this.resumePosMs, this.prepared ? this.playerOwner.isPlaying() : this.resumePlayWhenReady);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.prepared && !this.released && this.playerOwner.isPlaying();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (!this.prepared || this.released) {
            return;
        }
        this.playerOwner.pause();
    }

    public final void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        this.prepared = false;
        this.prepareRequestId++;
        MediaController mediaController = this.controller;
        if (mediaController != null) {
            mediaController.hide();
        }
        this.controller = null;
        this.playerOwner.release(takeAttachedSurface());
        if (this.viewTreeObserverListening) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
            this.viewTreeObserverListening = false;
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int pos) {
        this.resumePosMs = pos;
        safeSeekTo(pos);
    }

    public final void setAutoStart(boolean enabled) {
        this.autoStart = enabled;
    }

    public final void setLooping(boolean loop) {
        if (this.released) {
            return;
        }
        this.playerOwner.setLooping(loop);
    }

    public final void setOnReadyCallback(InterfaceC5082a callback) {
        this.onReadyCallback = callback;
        if (!this.firstFrameRendered || callback == null) {
            return;
        }
        callback.invoke();
    }

    public final void setPlaybackState(PlaybackState state) {
        AbstractC5504s.h(state, "state");
        this.resumePosMs = state.getPositionMs();
        this.resumePlayWhenReady = state.getPlayWhenReady();
        if (this.prepared) {
            safeSeekTo(this.resumePosMs);
            if (this.resumePlayWhenReady) {
                start();
            } else {
                pause();
            }
        }
    }

    public final void setScaleType(ScaleType type) {
        AbstractC5504s.h(type, "type");
        this.scaleType = type;
        applySizing();
    }

    public final void setVideoURI(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        this.uri = uri;
        this.prepared = false;
        this.firstFrameRendered = false;
        if (this.resumePosMs == 0) {
            this.resumePlayWhenReady = this.autoStart;
        }
        if (!this.texture.isAvailable() || this.released) {
            return;
        }
        prepareIfNeeded();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (!this.prepared || this.released) {
            return;
        }
        this.playerOwner.start();
    }

    public final void startIfNeeded() {
        if (!this.prepared || this.released || this.playerOwner.isPlaying() || !this.autoStart) {
            return;
        }
        start();
    }

    public /* synthetic */ TextureVideoView(Context context, AttributeSet attributeSet, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, z10, z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        super(context, attributeSet);
        AbstractC5504s.h(context, "context");
        this.showControls = z10;
        this.muteAudio = z11;
        TextureView textureView = new TextureView(context);
        this.texture = textureView;
        this.playerOwner = new MediaPlayerThreadOwner(context, z11, null, 4, null);
        this.autoStart = true;
        this.scaleType = ScaleType.FIT;
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f44206a.applySizing();
            }
        };
        setClipToPadding(true);
        setClipChildren(true);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1, 17));
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture st, int w10, int h10) {
                AbstractC5504s.h(st, "st");
                if (TextureVideoView.this.released) {
                    return;
                }
                Surface surfaceTakeAttachedSurface = TextureVideoView.this.takeAttachedSurface();
                if (surfaceTakeAttachedSurface != null) {
                    TextureVideoView.this.playerOwner.clearSurfaceBlocking(surfaceTakeAttachedSurface);
                }
                TextureVideoView.this.attachedSurface = new Surface(st);
                TextureVideoView.this.playerOwner.setSurface(TextureVideoView.this.attachedSurface);
                if (!TextureVideoView.this.viewTreeObserverListening) {
                    TextureVideoView.this.getViewTreeObserver().addOnGlobalLayoutListener(TextureVideoView.this.layoutListener);
                    TextureVideoView.this.viewTreeObserverListening = true;
                }
                if (!TextureVideoView.this.prepared) {
                    TextureVideoView.this.prepareIfNeeded();
                    return;
                }
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.safeSeekTo(textureVideoView.resumePosMs);
                if (TextureVideoView.this.resumePlayWhenReady) {
                    TextureVideoView.this.start();
                }
                TextureVideoView.this.applySizing();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
                AbstractC5504s.h(st, "st");
                Surface surfaceTakeAttachedSurface = TextureVideoView.this.takeAttachedSurface();
                if (TextureVideoView.this.released) {
                    return true;
                }
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.resumePlayWhenReady = textureVideoView.isPlaying();
                TextureVideoView textureVideoView2 = TextureVideoView.this;
                textureVideoView2.resumePosMs = textureVideoView2.getCurrentPosition();
                if (TextureVideoView.this.prepared) {
                    TextureVideoView.this.pause();
                }
                TextureVideoView.this.playerOwner.clearSurfaceBlocking(surfaceTakeAttachedSurface);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture st, int w10, int h10) {
                AbstractC5504s.h(st, "st");
                TextureVideoView.this.applySizing();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture st) {
                AbstractC5504s.h(st, "st");
                if (TextureVideoView.this.firstFrameRendered || !TextureVideoView.this.prepared) {
                    return;
                }
                TextureVideoView.this.firstFrameRendered = true;
                InterfaceC5082a interfaceC5082a = TextureVideoView.this.onReadyCallback;
                if (interfaceC5082a != null) {
                    interfaceC5082a.invoke();
                }
            }
        });
        MediaController mediaController = new MediaController(context);
        mediaController.setMediaPlayer(this);
        if (z10) {
            mediaController.setAnchorView(this);
            mediaController.setEnabled(true);
        }
        this.controller = mediaController;
        setOnClickListener(new View.OnClickListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextureVideoView._init_$lambda$2(this.f44207a, view);
            }
        });
    }
}
