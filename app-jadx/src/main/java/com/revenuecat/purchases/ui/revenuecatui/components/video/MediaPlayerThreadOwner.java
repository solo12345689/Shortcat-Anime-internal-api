package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Td.L;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import ie.InterfaceC5082a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0007*\u0001g\b\u0000\u0018\u0000 j2\u00020\u0001:\u0003jklB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J$\u0010\u001e\u001a\u00020\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010&J:\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00028\u00002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\b¢\u0006\u0004\b+\u0010,J:\u00102\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u001a\b\u0002\u00101\u001a\u0014\u0012\b\u0012\u00060.j\u0002`/\u0012\u0006\u0012\u0004\u0018\u0001000\u001bH\u0082\b¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b4\u0010\u0011J\u0019\u00105\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b5\u0010\u0011J\u0015\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108JI\u0010?\u001a\u00020\u000f2\u0006\u0010:\u001a\u0002092\u0018\u0010=\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000f0;2\u0018\u0010>\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000f0;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000f¢\u0006\u0004\bA\u0010\u0019J\r\u0010B\u001a\u00020\u000f¢\u0006\u0004\bB\u0010\u0019J\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020<¢\u0006\u0004\bD\u0010EJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010FJ\r\u0010G\u001a\u00020<¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020<¢\u0006\u0004\bI\u0010HJ\r\u0010J\u001a\u00020<¢\u0006\u0004\bJ\u0010HJ\u0019\u0010K\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bK\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u001c\u0010O\u001a\n N*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010SR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010LR\u0016\u0010Y\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010LR\u0018\u0010b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010LR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;", "", "Landroid/content/Context;", "context", "", "muteAudio", "Lkotlin/Function0;", "Landroid/media/MediaPlayer;", "playerFactory", "<init>", "(Landroid/content/Context;ZLie/a;)V", "ensurePlayer", "()Landroid/media/MediaPlayer;", "Landroid/view/Surface;", "surface", "LTd/L;", "setSurfaceInternal", "(Landroid/view/Surface;)V", "surfaceToRelease", "detachAndReleaseSurface", "releaseSurface", "operation", "post", "(Lie/a;)V", "startPositionTicker", "()V", "stopPositionTicker", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PlaybackSnapshot;", "transform", "updatePlaybackSnapshot", "(Lkotlin/jvm/functions/Function1;)V", "isPlaying", "", "markPendingPlaybackState", "(Z)J", "commandId", "clearPendingPlaybackState", "(Ljava/lang/Long;)V", "T", "mediaPlayer", "fallback", "valueProvider", "getPlayerValue", "(Landroid/media/MediaPlayer;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "execute", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "failureMessage", "safely", "(Lie/a;Lkotlin/jvm/functions/Function1;)V", "setSurface", "clearSurfaceBlocking", "loop", "setLooping", "(Z)V", "Landroid/net/Uri;", "uri", "Lkotlin/Function2;", "", "onPrepared", "onVideoSizeChanged", "prepare", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "start", "pause", "positionMs", "seekTo", "(I)V", "()Z", "getDuration", "()I", "getCurrentPosition", "getAudioSessionId", "release", "Z", "Lie/a;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "workerThread", "Landroid/os/HandlerThread;", "workerHandler", "released", "playbackSnapshot", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PlaybackSnapshot;", "Ljava/util/concurrent/atomic/AtomicLong;", "playbackCommandId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PendingPlaybackState;", "pendingPlaybackState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PendingPlaybackState;", "looping", "currentSurface", "Landroid/view/Surface;", "player", "Landroid/media/MediaPlayer;", "positionTickerScheduled", "com/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$positionTicker$1", "positionTicker", "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$positionTicker$1;", "Companion", "PendingPlaybackState", "PlaybackSnapshot", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaPlayerThreadOwner {

    @Deprecated
    public static final long DETACH_SURFACE_AWAIT_TIMEOUT_MS = 1000;

    @Deprecated
    public static final long POSITION_POLL_INTERVAL_MS = 250;
    private final Context appContext;
    private Surface currentSurface;
    private boolean looping;
    private final Handler mainHandler;
    private final boolean muteAudio;
    private volatile PendingPlaybackState pendingPlaybackState;
    private final AtomicLong playbackCommandId;
    private volatile PlaybackSnapshot playbackSnapshot;
    private MediaPlayer player;
    private final InterfaceC5082a playerFactory;
    private final MediaPlayerThreadOwner$positionTicker$1 positionTicker;
    private boolean positionTickerScheduled;
    private volatile boolean released;
    private final Handler workerHandler;
    private final HandlerThread workerThread;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/MediaPlayer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final MediaPlayer invoke() {
            return new MediaPlayer();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$Companion;", "", "()V", "DETACH_SURFACE_AWAIT_TIMEOUT_MS", "", "POSITION_POLL_INTERVAL_MS", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PendingPlaybackState;", "", "isPlaying", "", "commandId", "", "(ZJ)V", "getCommandId", "()J", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class PendingPlaybackState {
        private final long commandId;
        private final boolean isPlaying;

        public PendingPlaybackState(boolean z10, long j10) {
            this.isPlaying = z10;
            this.commandId = j10;
        }

        public static /* synthetic */ PendingPlaybackState copy$default(PendingPlaybackState pendingPlaybackState, boolean z10, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = pendingPlaybackState.isPlaying;
            }
            if ((i10 & 2) != 0) {
                j10 = pendingPlaybackState.commandId;
            }
            return pendingPlaybackState.copy(z10, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getCommandId() {
            return this.commandId;
        }

        public final PendingPlaybackState copy(boolean isPlaying, long commandId) {
            return new PendingPlaybackState(isPlaying, commandId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingPlaybackState)) {
                return false;
            }
            PendingPlaybackState pendingPlaybackState = (PendingPlaybackState) other;
            return this.isPlaying == pendingPlaybackState.isPlaying && this.commandId == pendingPlaybackState.commandId;
        }

        public final long getCommandId() {
            return this.commandId;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isPlaying) * 31) + Long.hashCode(this.commandId);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            return "PendingPlaybackState(isPlaying=" + this.isPlaying + ", commandId=" + this.commandId + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner$PlaybackSnapshot;", "", "prepared", "", "durationMs", "", "currentPositionMs", "isPlaying", "audioSessionId", "(ZIIZI)V", "getAudioSessionId", "()I", "getCurrentPositionMs", "getDurationMs", "()Z", "getPrepared", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class PlaybackSnapshot {
        private final int audioSessionId;
        private final int currentPositionMs;
        private final int durationMs;
        private final boolean isPlaying;
        private final boolean prepared;

        public PlaybackSnapshot() {
            this(false, 0, 0, false, 0, 31, null);
        }

        public static /* synthetic */ PlaybackSnapshot copy$default(PlaybackSnapshot playbackSnapshot, boolean z10, int i10, int i11, boolean z11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z10 = playbackSnapshot.prepared;
            }
            if ((i13 & 2) != 0) {
                i10 = playbackSnapshot.durationMs;
            }
            if ((i13 & 4) != 0) {
                i11 = playbackSnapshot.currentPositionMs;
            }
            if ((i13 & 8) != 0) {
                z11 = playbackSnapshot.isPlaying;
            }
            if ((i13 & 16) != 0) {
                i12 = playbackSnapshot.audioSessionId;
            }
            int i14 = i12;
            int i15 = i11;
            return playbackSnapshot.copy(z10, i10, i15, z11, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getPrepared() {
            return this.prepared;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDurationMs() {
            return this.durationMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCurrentPositionMs() {
            return this.currentPositionMs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsPlaying() {
            return this.isPlaying;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getAudioSessionId() {
            return this.audioSessionId;
        }

        public final PlaybackSnapshot copy(boolean prepared, int durationMs, int currentPositionMs, boolean isPlaying, int audioSessionId) {
            return new PlaybackSnapshot(prepared, durationMs, currentPositionMs, isPlaying, audioSessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaybackSnapshot)) {
                return false;
            }
            PlaybackSnapshot playbackSnapshot = (PlaybackSnapshot) other;
            return this.prepared == playbackSnapshot.prepared && this.durationMs == playbackSnapshot.durationMs && this.currentPositionMs == playbackSnapshot.currentPositionMs && this.isPlaying == playbackSnapshot.isPlaying && this.audioSessionId == playbackSnapshot.audioSessionId;
        }

        public final int getAudioSessionId() {
            return this.audioSessionId;
        }

        public final int getCurrentPositionMs() {
            return this.currentPositionMs;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final boolean getPrepared() {
            return this.prepared;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.prepared) * 31) + Integer.hashCode(this.durationMs)) * 31) + Integer.hashCode(this.currentPositionMs)) * 31) + Boolean.hashCode(this.isPlaying)) * 31) + Integer.hashCode(this.audioSessionId);
        }

        public final boolean isPlaying() {
            return this.isPlaying;
        }

        public String toString() {
            return "PlaybackSnapshot(prepared=" + this.prepared + ", durationMs=" + this.durationMs + ", currentPositionMs=" + this.currentPositionMs + ", isPlaying=" + this.isPlaying + ", audioSessionId=" + this.audioSessionId + ')';
        }

        public PlaybackSnapshot(boolean z10, int i10, int i11, boolean z11, int i12) {
            this.prepared = z10;
            this.durationMs = i10;
            this.currentPositionMs = i11;
            this.isPlaying = z11;
            this.audioSessionId = i12;
        }

        public /* synthetic */ PlaybackSnapshot(boolean z10, int i10, int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? 0 : i12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$pause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42921 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ long $commandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42921(long j10) {
            super(0);
            this.$commandId = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m555invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m555invoke() {
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared()) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer == null) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
                PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
                int currentPositionMs = playbackSnapshot.getCurrentPositionMs();
                try {
                    currentPositionMs = mediaPlayer.getCurrentPosition();
                } catch (Exception unused) {
                }
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, currentPositionMs, false, 0, 19, null);
                mediaPlayerThreadOwner.stopPositionTicker();
            } catch (Exception e10) {
                String str = "Could not pause media player: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
            MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$prepare$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42931 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Function2 $onPrepared;
        final /* synthetic */ Function2 $onVideoSizeChanged;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42931(Uri uri, Function2 function2, Function2 function22) {
            super(0);
            this.$uri = uri;
            this.$onPrepared = function2;
            this.$onVideoSizeChanged = function22;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$10(final MediaPlayerThreadOwner mediaPlayerThreadOwner, final Function2 function2, MediaPlayer mediaPlayer, final int i10, final int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            mediaPlayerThreadOwner.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerThreadOwner.C42931.invoke$lambda$14$lambda$10$lambda$9(mediaPlayerThreadOwner, function2, i10, i11);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$10$lambda$9(MediaPlayerThreadOwner mediaPlayerThreadOwner, Function2 function2, int i10, int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$13(MediaPlayerThreadOwner mediaPlayerThreadOwner, MediaPlayer mediaPlayer) {
            if (mediaPlayer == null) {
                return;
            }
            PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
            int durationMs = playbackSnapshot.getDurationMs();
            try {
                durationMs = mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
            }
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, durationMs, false, 0, 19, null);
            MediaPlayerThreadOwner.clearPendingPlaybackState$default(mediaPlayerThreadOwner, null, 1, null);
            mediaPlayerThreadOwner.stopPositionTicker();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$8(final MediaPlayerThreadOwner mediaPlayerThreadOwner, final Function2 function2, MediaPlayer mediaPlayer) {
            final int videoWidth;
            final int videoHeight;
            int duration;
            if (mediaPlayerThreadOwner.released || mediaPlayer == null) {
                return;
            }
            int currentPosition = 0;
            try {
                videoWidth = mediaPlayer.getVideoWidth();
            } catch (Exception unused) {
                videoWidth = 0;
            }
            try {
                videoHeight = mediaPlayer.getVideoHeight();
            } catch (Exception unused2) {
                videoHeight = 0;
            }
            PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
            try {
                duration = mediaPlayer.getDuration();
            } catch (Exception unused3) {
                duration = 0;
            }
            try {
                currentPosition = mediaPlayer.getCurrentPosition();
            } catch (Exception unused4) {
            }
            int i10 = currentPosition;
            int audioSessionId = playbackSnapshot.getAudioSessionId();
            try {
                audioSessionId = mediaPlayer.getAudioSessionId();
            } catch (Exception unused5) {
            }
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, true, duration, i10, false, audioSessionId, 8, null);
            mediaPlayerThreadOwner.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    MediaPlayerThreadOwner.C42931.invoke$lambda$14$lambda$8$lambda$7(mediaPlayerThreadOwner, function2, videoWidth, videoHeight);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$14$lambda$8$lambda$7(MediaPlayerThreadOwner mediaPlayerThreadOwner, Function2 function2, int i10, int i11) {
            if (mediaPlayerThreadOwner.released) {
                return;
            }
            function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m556invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m556invoke() {
            MediaPlayerThreadOwner.clearPendingPlaybackState$default(MediaPlayerThreadOwner.this, null, 1, null);
            MediaPlayer mediaPlayerEnsurePlayer = MediaPlayerThreadOwner.this.ensurePlayer();
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, false, 0, 16, null);
            MediaPlayerThreadOwner.this.stopPositionTicker();
            final MediaPlayerThreadOwner mediaPlayerThreadOwner2 = MediaPlayerThreadOwner.this;
            Uri uri = this.$uri;
            final Function2 function2 = this.$onPrepared;
            final Function2 function22 = this.$onVideoSizeChanged;
            try {
                mediaPlayerEnsurePlayer.reset();
                Surface surface = mediaPlayerThreadOwner2.currentSurface;
                if (surface != null) {
                    mediaPlayerEnsurePlayer.setSurface(surface);
                } else {
                    Logger.INSTANCE.w("TextureVideoView: Preparing media player without a surface.Audio may play before video is attached.");
                }
                mediaPlayerEnsurePlayer.setLooping(mediaPlayerThreadOwner2.looping);
                if (mediaPlayerThreadOwner2.muteAudio) {
                    mediaPlayerEnsurePlayer.setVolume(0.0f, 0.0f);
                }
                mediaPlayerEnsurePlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.f
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        MediaPlayerThreadOwner.C42931.invoke$lambda$14$lambda$8(mediaPlayerThreadOwner2, function2, mediaPlayer);
                    }
                });
                mediaPlayerEnsurePlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.g
                    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                        MediaPlayerThreadOwner.C42931.invoke$lambda$14$lambda$10(mediaPlayerThreadOwner2, function22, mediaPlayer, i10, i11);
                    }
                });
                mediaPlayerEnsurePlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.h
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        MediaPlayerThreadOwner.C42931.invoke$lambda$14$lambda$13(mediaPlayerThreadOwner2, mediaPlayer);
                    }
                });
                mediaPlayerEnsurePlayer.setDataSource(mediaPlayerThreadOwner2.appContext, uri);
                mediaPlayerEnsurePlayer.prepareAsync();
            } catch (Exception e10) {
                String str = "Could not prepare media player: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$safely$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C42941 extends AbstractC5506u implements Function1 {
        public static final C42941 INSTANCE = new C42941();

        public C42941() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(Exception it) {
            AbstractC5504s.h(it, "it");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$seekTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42951 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ int $positionMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42951(int i10) {
            super(0);
            this.$positionMs = i10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m557invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m557invoke() {
            MediaPlayer mediaPlayer;
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared() || this.$positionMs < 0 || (mediaPlayer = MediaPlayerThreadOwner.this.player) == null) {
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            int i10 = this.$positionMs;
            try {
                mediaPlayer.seekTo(i10);
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, i10, false, 0, 27, null);
            } catch (Exception e10) {
                String str = "Could not seek media player: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$setLooping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42961 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ boolean $loop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42961(boolean z10) {
            super(0);
            this.$loop = z10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m558invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m558invoke() {
            L l10;
            MediaPlayerThreadOwner.this.looping = this.$loop;
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setLooping(this.$loop);
                } catch (Exception e10) {
                    String str = "Could not set looping mode: " + e10.getMessage();
                    if (str != null) {
                        Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                    }
                }
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                Logger.INSTANCE.w("TextureVideoView: Looping was set before media player initialization. Value cached for prepare.");
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$setSurface$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42971 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ Surface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42971(Surface surface) {
            super(0);
            this.$surface = surface;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m559invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m559invoke() {
            MediaPlayerThreadOwner.this.setSurfaceInternal(this.$surface);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$start$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C42981 extends AbstractC5506u implements InterfaceC5082a {
        final /* synthetic */ long $commandId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42981(long j10) {
            super(0);
            this.$commandId = j10;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m560invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m560invoke() {
            if (!MediaPlayerThreadOwner.this.playbackSnapshot.getPrepared()) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayer mediaPlayer = MediaPlayerThreadOwner.this.player;
            if (mediaPlayer == null) {
                MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
                return;
            }
            MediaPlayerThreadOwner mediaPlayerThreadOwner = MediaPlayerThreadOwner.this;
            try {
                mediaPlayer.start();
                mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, true, 0, 23, null);
                mediaPlayerThreadOwner.startPositionTicker();
            } catch (Exception e10) {
                String str = "Could not start media player: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
            MediaPlayerThreadOwner.this.clearPendingPlaybackState(Long.valueOf(this.$commandId));
        }
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$positionTicker$1] */
    public MediaPlayerThreadOwner(Context context, boolean z10, InterfaceC5082a playerFactory) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(playerFactory, "playerFactory");
        this.muteAudio = z10;
        this.playerFactory = playerFactory;
        this.appContext = context.getApplicationContext();
        this.mainHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("RC-TextureVideoViewPlayer");
        handlerThread.start();
        this.workerThread = handlerThread;
        this.workerHandler = new Handler(handlerThread.getLooper());
        this.playbackSnapshot = new PlaybackSnapshot(false, 0, 0, false, 0, 31, null);
        this.playbackCommandId = new AtomicLong(0L);
        this.positionTicker = new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.MediaPlayerThreadOwner$positionTicker$1
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPlaying;
                if (this.this$0.released) {
                    this.this$0.positionTickerScheduled = false;
                    return;
                }
                MediaPlayer mediaPlayer = this.this$0.player;
                if (mediaPlayer == null || !this.this$0.playbackSnapshot.getPrepared()) {
                    this.this$0.positionTickerScheduled = false;
                    return;
                }
                try {
                    zIsPlaying = mediaPlayer.isPlaying();
                } catch (Exception unused) {
                    zIsPlaying = false;
                }
                MediaPlayerThreadOwner mediaPlayerThreadOwner = this.this$0;
                MediaPlayerThreadOwner.PlaybackSnapshot playbackSnapshot = mediaPlayerThreadOwner.playbackSnapshot;
                int currentPositionMs = playbackSnapshot.getCurrentPositionMs();
                try {
                    currentPositionMs = mediaPlayer.getCurrentPosition();
                } catch (Exception unused2) {
                }
                mediaPlayerThreadOwner.playbackSnapshot = MediaPlayerThreadOwner.PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, currentPositionMs, zIsPlaying, 0, 19, null);
                if (zIsPlaying) {
                    this.this$0.workerHandler.postDelayed(this, 250L);
                } else {
                    this.this$0.positionTickerScheduled = false;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPendingPlaybackState(Long commandId) {
        PendingPlaybackState pendingPlaybackState = this.pendingPlaybackState;
        if (pendingPlaybackState == null) {
            return;
        }
        if (commandId == null || pendingPlaybackState.getCommandId() == commandId.longValue()) {
            this.pendingPlaybackState = null;
        }
    }

    static /* synthetic */ void clearPendingPlaybackState$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        mediaPlayerThreadOwner.clearPendingPlaybackState(l10);
    }

    public static /* synthetic */ void clearSurfaceBlocking$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surface = null;
        }
        mediaPlayerThreadOwner.clearSurfaceBlocking(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearSurfaceBlocking$lambda$1(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, CountDownLatch countDownLatch) {
        try {
            mediaPlayerThreadOwner.detachAndReleaseSurface(surface);
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void detachAndReleaseSurface(Surface surfaceToRelease) {
        setSurfaceInternal(null);
        releaseSurface(surfaceToRelease);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPlayer ensurePlayer() {
        int audioSessionId;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            return mediaPlayer;
        }
        MediaPlayer mediaPlayer2 = (MediaPlayer) this.playerFactory.invoke();
        this.player = mediaPlayer2;
        PlaybackSnapshot playbackSnapshot = this.playbackSnapshot;
        try {
            audioSessionId = mediaPlayer2.getAudioSessionId();
        } catch (Exception unused) {
            audioSessionId = 0;
        }
        this.playbackSnapshot = PlaybackSnapshot.copy$default(playbackSnapshot, false, 0, 0, false, audioSessionId, 15, null);
        Surface surface = this.currentSurface;
        if (surface != null) {
            try {
                mediaPlayer2.setSurface(surface);
            } catch (Exception e10) {
                String str = "Could not attach media surface: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
        }
        return mediaPlayer2;
    }

    private final <T> T getPlayerValue(MediaPlayer mediaPlayer, T fallback, Function1 valueProvider) {
        try {
            return (T) valueProvider.invoke(mediaPlayer);
        } catch (Exception unused) {
            return fallback;
        }
    }

    private final long markPendingPlaybackState(boolean isPlaying) {
        long jIncrementAndGet = this.playbackCommandId.incrementAndGet();
        this.pendingPlaybackState = new PendingPlaybackState(isPlaying, jIncrementAndGet);
        return jIncrementAndGet;
    }

    private final void post(final InterfaceC5082a operation) {
        if (this.released) {
            return;
        }
        this.workerHandler.post(new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.a
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerThreadOwner.post$lambda$17(this.f44186a, operation);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void post$lambda$17(MediaPlayerThreadOwner mediaPlayerThreadOwner, InterfaceC5082a interfaceC5082a) {
        if (mediaPlayerThreadOwner.released) {
            return;
        }
        interfaceC5082a.invoke();
    }

    public static /* synthetic */ void release$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surface = null;
        }
        mediaPlayerThreadOwner.release(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$6(MediaPlayerThreadOwner mediaPlayerThreadOwner, Surface surface) {
        try {
            mediaPlayerThreadOwner.playbackSnapshot = PlaybackSnapshot.copy$default(mediaPlayerThreadOwner.playbackSnapshot, false, 0, 0, false, 0, 22, null);
            MediaPlayer mediaPlayer = mediaPlayerThreadOwner.player;
            mediaPlayerThreadOwner.player = null;
            mediaPlayerThreadOwner.currentSurface = null;
            mediaPlayerThreadOwner.stopPositionTicker();
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setSurface(null);
                } catch (Exception unused) {
                }
            }
            mediaPlayerThreadOwner.releaseSurface(surface);
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.release();
                } catch (Exception e10) {
                    String str = "Could not release media player: " + e10.getMessage();
                    if (str != null) {
                        Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                    }
                }
            }
            mediaPlayerThreadOwner.workerThread.quitSafely();
        } catch (Throwable th2) {
            mediaPlayerThreadOwner.workerThread.quitSafely();
            throw th2;
        }
    }

    private final void releaseSurface(Surface surfaceToRelease) {
        if (surfaceToRelease != null) {
            try {
                surfaceToRelease.release();
            } catch (Exception e10) {
                String str = "Could not release media surface: " + e10.getMessage();
                if (str != null) {
                    Logger.INSTANCE.e("TextureVideoView: " + str, e10);
                }
            }
        }
    }

    private final void safely(InterfaceC5082a execute, Function1 failureMessage) {
        try {
            execute.invoke();
        } catch (Exception e10) {
            String str = (String) failureMessage.invoke(e10);
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: " + str, e10);
            }
        }
    }

    static /* synthetic */ void safely$default(MediaPlayerThreadOwner mediaPlayerThreadOwner, InterfaceC5082a interfaceC5082a, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = C42941.INSTANCE;
        }
        try {
            interfaceC5082a.invoke();
        } catch (Exception e10) {
            String str = (String) function1.invoke(e10);
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: " + str, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSurfaceInternal(Surface surface) {
        this.currentSurface = surface;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.setSurface(surface);
        } catch (Exception e10) {
            String str = "Could not set media surface: " + e10.getMessage();
            if (str != null) {
                Logger.INSTANCE.e("TextureVideoView: " + str, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPositionTicker() {
        if (this.positionTickerScheduled) {
            return;
        }
        this.positionTickerScheduled = true;
        this.workerHandler.post(this.positionTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPositionTicker() {
        this.positionTickerScheduled = false;
        this.workerHandler.removeCallbacks(this.positionTicker);
    }

    private final void updatePlaybackSnapshot(Function1 transform) {
        this.playbackSnapshot = (PlaybackSnapshot) transform.invoke(this.playbackSnapshot);
    }

    public final void clearSurfaceBlocking(final Surface surfaceToRelease) {
        if (AbstractC5504s.c(Looper.myLooper(), this.workerThread.getLooper())) {
            detachAndReleaseSurface(surfaceToRelease);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.workerHandler.post(new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.c
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerThreadOwner.clearSurfaceBlocking$lambda$1(this.f44190a, surfaceToRelease, countDownLatch);
            }
        })) {
            releaseSurface(surfaceToRelease);
            Logger.INSTANCE.w("TextureVideoView: Could not post surface detach to worker thread. Released provided surface locally.");
            return;
        }
        try {
            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            Logger.INSTANCE.w("TextureVideoView: Timed out waiting for surface detach on worker thread. Surface release will complete asynchronously on the worker thread.");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Logger.INSTANCE.w("TextureVideoView: Interrupted while waiting for surface detach. Surface release will complete asynchronously on the worker thread.");
        }
    }

    public final int getAudioSessionId() {
        return this.playbackSnapshot.getAudioSessionId();
    }

    public final int getCurrentPosition() {
        return this.playbackSnapshot.getCurrentPositionMs();
    }

    public final int getDuration() {
        return this.playbackSnapshot.getDurationMs();
    }

    public final boolean isPlaying() {
        PendingPlaybackState pendingPlaybackState = this.pendingPlaybackState;
        return pendingPlaybackState != null ? pendingPlaybackState.isPlaying() : this.playbackSnapshot.isPlaying();
    }

    public final void pause() {
        if (this.released || !this.playbackSnapshot.getPrepared()) {
            return;
        }
        post(new C42921(markPendingPlaybackState(false)));
    }

    public final void prepare(Uri uri, Function2 onPrepared, Function2 onVideoSizeChanged) {
        AbstractC5504s.h(uri, "uri");
        AbstractC5504s.h(onPrepared, "onPrepared");
        AbstractC5504s.h(onVideoSizeChanged, "onVideoSizeChanged");
        post(new C42931(uri, onPrepared, onVideoSizeChanged));
    }

    public final void release(final Surface surfaceToRelease) {
        if (this.released) {
            releaseSurface(surfaceToRelease);
            return;
        }
        this.released = true;
        clearPendingPlaybackState$default(this, null, 1, null);
        this.workerHandler.post(new Runnable() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.video.b
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlayerThreadOwner.release$lambda$6(this.f44188a, surfaceToRelease);
            }
        });
    }

    public final void seekTo(int positionMs) {
        post(new C42951(positionMs));
    }

    public final void setLooping(boolean loop) {
        post(new C42961(loop));
    }

    public final void setSurface(Surface surface) {
        post(new C42971(surface));
    }

    public final void start() {
        if (this.released || !this.playbackSnapshot.getPrepared()) {
            return;
        }
        post(new C42981(markPendingPlaybackState(true)));
    }

    public /* synthetic */ MediaPlayerThreadOwner(Context context, boolean z10, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z10, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a);
    }
}
