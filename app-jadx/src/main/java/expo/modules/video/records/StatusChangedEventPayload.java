package expo.modules.video.records;

import app.notifee.core.event.LogEvent;
import expo.modules.video.enums.PlayerStatus;
import jc.InterfaceC5363a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/video/records/StatusChangedEventPayload;", "Lexpo/modules/video/records/VideoEventPayload;", "status", "Lexpo/modules/video/enums/PlayerStatus;", "oldStatus", LogEvent.LEVEL_ERROR, "Lexpo/modules/video/records/PlaybackError;", "<init>", "(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V", "getStatus$annotations", "()V", "getStatus", "()Lexpo/modules/video/enums/PlayerStatus;", "getOldStatus$annotations", "getOldStatus", "getError$annotations", "getError", "()Lexpo/modules/video/records/PlaybackError;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusChangedEventPayload implements VideoEventPayload {
    private final PlaybackError error;
    private final PlayerStatus oldStatus;
    private final PlayerStatus status;

    public StatusChangedEventPayload(PlayerStatus status, PlayerStatus playerStatus, PlaybackError playbackError) {
        AbstractC5504s.h(status, "status");
        this.status = status;
        this.oldStatus = playerStatus;
        this.error = playbackError;
    }

    public final PlaybackError getError() {
        return this.error;
    }

    public final PlayerStatus getOldStatus() {
        return this.oldStatus;
    }

    public final PlayerStatus getStatus() {
        return this.status;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getError$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getOldStatus$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getStatus$annotations() {
    }
}
