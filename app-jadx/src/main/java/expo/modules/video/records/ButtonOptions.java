package expo.modules.video.records;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJb\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u000eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010\u0013R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u000eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b3\u0010&\u001a\u0004\b2\u0010\u000eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b5\u0010&\u001a\u0004\b4\u0010\u000e¨\u00066"}, d2 = {"Lexpo/modules/video/records/ButtonOptions;", "Ljc/b;", "", "showNext", "showPrevious", "showSeekForward", "showSeekBackward", "showSubtitles", "showSettings", "showPlayPause", "showBottomBar", "<init>", "(ZZZZLjava/lang/Boolean;ZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "copy", "(ZZZZLjava/lang/Boolean;ZZZ)Lexpo/modules/video/records/ButtonOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowNext", "getShowNext$annotations", "()V", "getShowPrevious", "getShowPrevious$annotations", "getShowSeekForward", "getShowSeekForward$annotations", "getShowSeekBackward", "getShowSeekBackward$annotations", "Ljava/lang/Boolean;", "getShowSubtitles", "getShowSubtitles$annotations", "getShowSettings", "getShowSettings$annotations", "getShowPlayPause", "getShowPlayPause$annotations", "getShowBottomBar", "getShowBottomBar$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ButtonOptions implements InterfaceC5364b {
    private final boolean showBottomBar;
    private final boolean showNext;
    private final boolean showPlayPause;
    private final boolean showPrevious;
    private final boolean showSeekBackward;
    private final boolean showSeekForward;
    private final boolean showSettings;
    private final Boolean showSubtitles;

    public ButtonOptions() {
        this(false, false, false, false, null, false, false, false, 255, null);
    }

    public static /* synthetic */ ButtonOptions copy$default(ButtonOptions buttonOptions, boolean z10, boolean z11, boolean z12, boolean z13, Boolean bool, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = buttonOptions.showNext;
        }
        if ((i10 & 2) != 0) {
            z11 = buttonOptions.showPrevious;
        }
        if ((i10 & 4) != 0) {
            z12 = buttonOptions.showSeekForward;
        }
        if ((i10 & 8) != 0) {
            z13 = buttonOptions.showSeekBackward;
        }
        if ((i10 & 16) != 0) {
            bool = buttonOptions.showSubtitles;
        }
        if ((i10 & 32) != 0) {
            z14 = buttonOptions.showSettings;
        }
        if ((i10 & 64) != 0) {
            z15 = buttonOptions.showPlayPause;
        }
        if ((i10 & 128) != 0) {
            z16 = buttonOptions.showBottomBar;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        Boolean bool2 = bool;
        boolean z19 = z14;
        return buttonOptions.copy(z10, z11, z12, z13, bool2, z19, z17, z18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowNext() {
        return this.showNext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowPrevious() {
        return this.showPrevious;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowSeekForward() {
        return this.showSeekForward;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowSeekBackward() {
        return this.showSeekBackward;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowSubtitles() {
        return this.showSubtitles;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowSettings() {
        return this.showSettings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowPlayPause() {
        return this.showPlayPause;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowBottomBar() {
        return this.showBottomBar;
    }

    public final ButtonOptions copy(boolean showNext, boolean showPrevious, boolean showSeekForward, boolean showSeekBackward, Boolean showSubtitles, boolean showSettings, boolean showPlayPause, boolean showBottomBar) {
        return new ButtonOptions(showNext, showPrevious, showSeekForward, showSeekBackward, showSubtitles, showSettings, showPlayPause, showBottomBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonOptions)) {
            return false;
        }
        ButtonOptions buttonOptions = (ButtonOptions) other;
        return this.showNext == buttonOptions.showNext && this.showPrevious == buttonOptions.showPrevious && this.showSeekForward == buttonOptions.showSeekForward && this.showSeekBackward == buttonOptions.showSeekBackward && AbstractC5504s.c(this.showSubtitles, buttonOptions.showSubtitles) && this.showSettings == buttonOptions.showSettings && this.showPlayPause == buttonOptions.showPlayPause && this.showBottomBar == buttonOptions.showBottomBar;
    }

    public final boolean getShowBottomBar() {
        return this.showBottomBar;
    }

    public final boolean getShowNext() {
        return this.showNext;
    }

    public final boolean getShowPlayPause() {
        return this.showPlayPause;
    }

    public final boolean getShowPrevious() {
        return this.showPrevious;
    }

    public final boolean getShowSeekBackward() {
        return this.showSeekBackward;
    }

    public final boolean getShowSeekForward() {
        return this.showSeekForward;
    }

    public final boolean getShowSettings() {
        return this.showSettings;
    }

    public final Boolean getShowSubtitles() {
        return this.showSubtitles;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.showNext) * 31) + Boolean.hashCode(this.showPrevious)) * 31) + Boolean.hashCode(this.showSeekForward)) * 31) + Boolean.hashCode(this.showSeekBackward)) * 31;
        Boolean bool = this.showSubtitles;
        return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.showSettings)) * 31) + Boolean.hashCode(this.showPlayPause)) * 31) + Boolean.hashCode(this.showBottomBar);
    }

    public String toString() {
        return "ButtonOptions(showNext=" + this.showNext + ", showPrevious=" + this.showPrevious + ", showSeekForward=" + this.showSeekForward + ", showSeekBackward=" + this.showSeekBackward + ", showSubtitles=" + this.showSubtitles + ", showSettings=" + this.showSettings + ", showPlayPause=" + this.showPlayPause + ", showBottomBar=" + this.showBottomBar + ")";
    }

    public ButtonOptions(boolean z10, boolean z11, boolean z12, boolean z13, Boolean bool, boolean z14, boolean z15, boolean z16) {
        this.showNext = z10;
        this.showPrevious = z11;
        this.showSeekForward = z12;
        this.showSeekBackward = z13;
        this.showSubtitles = bool;
        this.showSettings = z14;
        this.showPlayPause = z15;
        this.showBottomBar = z16;
    }

    public /* synthetic */ ButtonOptions(boolean z10, boolean z11, boolean z12, boolean z13, Boolean bool, boolean z14, boolean z15, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? true : z14, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? true : z16);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowBottomBar$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowNext$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowPlayPause$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowPrevious$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowSeekBackward$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowSeekForward$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowSettings$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowSubtitles$annotations() {
    }
}
