package expo.modules.video.records;

import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0019\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001f\u0012\u0004\b$\u0010\u0012\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lexpo/modules/video/records/BufferOptions;", "Ljc/b;", "Ljava/io/Serializable;", "", "preferredForwardBufferDuration", "", "maxBufferBytes", "", "prioritizeTimeOverSizeThreshold", "minBufferForPlayback", "<init>", "(Ljava/lang/Double;JZD)V", "Ljava/lang/Double;", "getPreferredForwardBufferDuration", "()Ljava/lang/Double;", "setPreferredForwardBufferDuration", "(Ljava/lang/Double;)V", "getPreferredForwardBufferDuration$annotations", "()V", "J", "getMaxBufferBytes", "()J", "setMaxBufferBytes", "(J)V", "getMaxBufferBytes$annotations", "Z", "getPrioritizeTimeOverSizeThreshold", "()Z", "setPrioritizeTimeOverSizeThreshold", "(Z)V", "getPrioritizeTimeOverSizeThreshold$annotations", "D", "getMinBufferForPlayback", "()D", "setMinBufferForPlayback", "(D)V", "getMinBufferForPlayback$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BufferOptions implements InterfaceC5364b, Serializable {
    private long maxBufferBytes;
    private double minBufferForPlayback;
    private Double preferredForwardBufferDuration;
    private boolean prioritizeTimeOverSizeThreshold;

    public BufferOptions() {
        this(null, 0L, false, 0.0d, 15, null);
    }

    public final long getMaxBufferBytes() {
        return this.maxBufferBytes;
    }

    public final double getMinBufferForPlayback() {
        return this.minBufferForPlayback;
    }

    public final Double getPreferredForwardBufferDuration() {
        return this.preferredForwardBufferDuration;
    }

    public final boolean getPrioritizeTimeOverSizeThreshold() {
        return this.prioritizeTimeOverSizeThreshold;
    }

    public final void setMaxBufferBytes(long j10) {
        this.maxBufferBytes = j10;
    }

    public final void setMinBufferForPlayback(double d10) {
        this.minBufferForPlayback = d10;
    }

    public final void setPreferredForwardBufferDuration(Double d10) {
        this.preferredForwardBufferDuration = d10;
    }

    public final void setPrioritizeTimeOverSizeThreshold(boolean z10) {
        this.prioritizeTimeOverSizeThreshold = z10;
    }

    public BufferOptions(Double d10, long j10, boolean z10, double d11) {
        this.preferredForwardBufferDuration = d10;
        this.maxBufferBytes = j10;
        this.prioritizeTimeOverSizeThreshold = z10;
        this.minBufferForPlayback = d11;
    }

    public /* synthetic */ BufferOptions(Double d10, long j10, boolean z10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? 1.0d : d11);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMaxBufferBytes$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMinBufferForPlayback$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getPreferredForwardBufferDuration$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getPrioritizeTimeOverSizeThreshold$annotations() {
    }
}
