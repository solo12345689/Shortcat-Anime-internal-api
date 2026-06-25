package expo.modules.video.records;

import jc.InterfaceC5363a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lexpo/modules/video/records/PlaybackRateChangedEventPayload;", "Lexpo/modules/video/records/VideoEventPayload;", "playbackRate", "", "oldPlaybackRate", "<init>", "(FLjava/lang/Float;)V", "getPlaybackRate$annotations", "()V", "getPlaybackRate", "()F", "getOldPlaybackRate$annotations", "getOldPlaybackRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaybackRateChangedEventPayload implements VideoEventPayload {
    private final Float oldPlaybackRate;
    private final float playbackRate;

    public PlaybackRateChangedEventPayload(float f10, Float f11) {
        this.playbackRate = f10;
        this.oldPlaybackRate = f11;
    }

    public final Float getOldPlaybackRate() {
        return this.oldPlaybackRate;
    }

    public final float getPlaybackRate() {
        return this.playbackRate;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getOldPlaybackRate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getPlaybackRate$annotations() {
    }
}
