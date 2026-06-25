package expo.modules.video.records;

import java.util.List;
import jc.InterfaceC5363a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/video/records/AvailableSubtitleTracksChangedEventPayload;", "Lexpo/modules/video/records/VideoEventPayload;", "availableSubtitleTracks", "", "Lexpo/modules/video/records/SubtitleTrack;", "oldAvailableSubtitleTracks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAvailableSubtitleTracks$annotations", "()V", "getAvailableSubtitleTracks", "()Ljava/util/List;", "getOldAvailableSubtitleTracks$annotations", "getOldAvailableSubtitleTracks", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailableSubtitleTracksChangedEventPayload implements VideoEventPayload {
    private final List<SubtitleTrack> availableSubtitleTracks;
    private final List<SubtitleTrack> oldAvailableSubtitleTracks;

    public AvailableSubtitleTracksChangedEventPayload(List<SubtitleTrack> availableSubtitleTracks, List<SubtitleTrack> oldAvailableSubtitleTracks) {
        AbstractC5504s.h(availableSubtitleTracks, "availableSubtitleTracks");
        AbstractC5504s.h(oldAvailableSubtitleTracks, "oldAvailableSubtitleTracks");
        this.availableSubtitleTracks = availableSubtitleTracks;
        this.oldAvailableSubtitleTracks = oldAvailableSubtitleTracks;
    }

    public final List<SubtitleTrack> getAvailableSubtitleTracks() {
        return this.availableSubtitleTracks;
    }

    public final List<SubtitleTrack> getOldAvailableSubtitleTracks() {
        return this.oldAvailableSubtitleTracks;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAvailableSubtitleTracks$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getOldAvailableSubtitleTracks$annotations() {
    }
}
