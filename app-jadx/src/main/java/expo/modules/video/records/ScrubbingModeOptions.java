package expo.modules.video.records;

import A2.P;
import expo.modules.video.player.VideoPlayer;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0013\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R(\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0013\u0012\u0004\b%\u0010\u0019\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Lexpo/modules/video/records/ScrubbingModeOptions;", "Ljc/b;", "Ljava/io/Serializable;", "", "scrubbingModeEnabled", "increaseCodecOperatingRate", "enableDynamicScheduling", "useDecodeOnlyFlag", "allowSkippingMediaCodecFlush", "<init>", "(ZZZZZ)V", "LA2/P;", "toScrubbingModeParameters", "()LA2/P;", "Lexpo/modules/video/player/VideoPlayer;", "videoPlayer", "LTd/L;", "applyToPlayer", "(Lexpo/modules/video/player/VideoPlayer;)V", "Z", "getScrubbingModeEnabled", "()Z", "setScrubbingModeEnabled", "(Z)V", "getScrubbingModeEnabled$annotations", "()V", "getIncreaseCodecOperatingRate", "setIncreaseCodecOperatingRate", "getIncreaseCodecOperatingRate$annotations", "getEnableDynamicScheduling", "setEnableDynamicScheduling", "getEnableDynamicScheduling$annotations", "getUseDecodeOnlyFlag", "setUseDecodeOnlyFlag", "getUseDecodeOnlyFlag$annotations", "getAllowSkippingMediaCodecFlush", "setAllowSkippingMediaCodecFlush", "getAllowSkippingMediaCodecFlush$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrubbingModeOptions implements InterfaceC5364b, Serializable {
    private boolean allowSkippingMediaCodecFlush;
    private boolean enableDynamicScheduling;
    private boolean increaseCodecOperatingRate;
    private boolean scrubbingModeEnabled;
    private boolean useDecodeOnlyFlag;

    public ScrubbingModeOptions() {
        this(false, false, false, false, false, 31, null);
    }

    private final P toScrubbingModeParameters() {
        P pH = new P.b().l(this.useDecodeOnlyFlag).i(this.allowSkippingMediaCodecFlush).k(this.increaseCodecOperatingRate).j(this.enableDynamicScheduling).h();
        AbstractC5504s.g(pH, "build(...)");
        return pH;
    }

    public final void applyToPlayer(VideoPlayer videoPlayer) {
        AbstractC5504s.h(videoPlayer, "videoPlayer");
        videoPlayer.y2().setScrubbingModeEnabled(this.scrubbingModeEnabled);
        videoPlayer.y2().n(toScrubbingModeParameters());
    }

    public final boolean getAllowSkippingMediaCodecFlush() {
        return this.allowSkippingMediaCodecFlush;
    }

    public final boolean getEnableDynamicScheduling() {
        return this.enableDynamicScheduling;
    }

    public final boolean getIncreaseCodecOperatingRate() {
        return this.increaseCodecOperatingRate;
    }

    public final boolean getScrubbingModeEnabled() {
        return this.scrubbingModeEnabled;
    }

    public final boolean getUseDecodeOnlyFlag() {
        return this.useDecodeOnlyFlag;
    }

    public final void setAllowSkippingMediaCodecFlush(boolean z10) {
        this.allowSkippingMediaCodecFlush = z10;
    }

    public final void setEnableDynamicScheduling(boolean z10) {
        this.enableDynamicScheduling = z10;
    }

    public final void setIncreaseCodecOperatingRate(boolean z10) {
        this.increaseCodecOperatingRate = z10;
    }

    public final void setScrubbingModeEnabled(boolean z10) {
        this.scrubbingModeEnabled = z10;
    }

    public final void setUseDecodeOnlyFlag(boolean z10) {
        this.useDecodeOnlyFlag = z10;
    }

    public ScrubbingModeOptions(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.scrubbingModeEnabled = z10;
        this.increaseCodecOperatingRate = z11;
        this.enableDynamicScheduling = z12;
        this.useDecodeOnlyFlag = z13;
        this.allowSkippingMediaCodecFlush = z14;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ScrubbingModeOptions(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 1
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L15
            r5 = r0
        L15:
            r7 = r7 & 16
            if (r7 == 0) goto L20
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L26
        L20:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L26:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.records.ScrubbingModeOptions.<init>(boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAllowSkippingMediaCodecFlush$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEnableDynamicScheduling$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getIncreaseCodecOperatingRate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getScrubbingModeEnabled$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUseDecodeOnlyFlag$annotations() {
    }
}
