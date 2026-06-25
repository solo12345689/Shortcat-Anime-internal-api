package expo.modules.video.records;

import A2.Q;
import expo.modules.video.player.VideoPlayer;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u001a"}, d2 = {"Lexpo/modules/video/records/SeekTolerance;", "Ljc/b;", "Ljava/io/Serializable;", "", "toleranceBefore", "toleranceAfter", "<init>", "(DD)V", "LA2/Q;", "toSeekParameters", "()LA2/Q;", "Lexpo/modules/video/player/VideoPlayer;", "videoPlayer", "LTd/L;", "applyToPlayer", "(Lexpo/modules/video/player/VideoPlayer;)V", "D", "getToleranceBefore", "()D", "setToleranceBefore", "(D)V", "getToleranceBefore$annotations", "()V", "getToleranceAfter", "setToleranceAfter", "getToleranceAfter$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SeekTolerance implements InterfaceC5364b, Serializable {
    private double toleranceAfter;
    private double toleranceBefore;

    public SeekTolerance() {
        this(0.0d, 0.0d, 3, null);
    }

    private final Q toSeekParameters() {
        double d10 = 1000;
        return new Q(a0.V0((long) (this.toleranceBefore * d10)), a0.V0((long) (this.toleranceAfter * d10)));
    }

    public final void applyToPlayer(VideoPlayer videoPlayer) {
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        videoPlayer.getPlayer().d(toSeekParameters());
    }

    public final double getToleranceAfter() {
        return this.toleranceAfter;
    }

    public final double getToleranceBefore() {
        return this.toleranceBefore;
    }

    public final void setToleranceAfter(double d10) {
        this.toleranceAfter = d10;
    }

    public final void setToleranceBefore(double d10) {
        this.toleranceBefore = d10;
    }

    public SeekTolerance(double d10, double d11) {
        this.toleranceBefore = d10;
        this.toleranceAfter = d11;
    }

    public /* synthetic */ SeekTolerance(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getToleranceAfter$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getToleranceBefore$annotations() {
    }
}
