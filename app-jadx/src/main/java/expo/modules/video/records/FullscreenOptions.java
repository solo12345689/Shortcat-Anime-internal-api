package expo.modules.video.records;

import expo.modules.video.enums.FullscreenOrientation;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\rR \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u000b¨\u0006$"}, d2 = {"Lexpo/modules/video/records/FullscreenOptions;", "Ljc/b;", "Ljava/io/Serializable;", "", "enable", "Lexpo/modules/video/enums/FullscreenOrientation;", "orientation", "autoExitOnRotate", "<init>", "(ZLexpo/modules/video/enums/FullscreenOrientation;Z)V", "component1", "()Z", "component2", "()Lexpo/modules/video/enums/FullscreenOrientation;", "component3", "copy", "(ZLexpo/modules/video/enums/FullscreenOrientation;Z)Lexpo/modules/video/records/FullscreenOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnable", "getEnable$annotations", "()V", "Lexpo/modules/video/enums/FullscreenOrientation;", "getOrientation", "getOrientation$annotations", "getAutoExitOnRotate", "getAutoExitOnRotate$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FullscreenOptions implements InterfaceC5364b, Serializable {
    private final boolean autoExitOnRotate;
    private final boolean enable;
    private final FullscreenOrientation orientation;

    public FullscreenOptions() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ FullscreenOptions copy$default(FullscreenOptions fullscreenOptions, boolean z10, FullscreenOrientation fullscreenOrientation, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fullscreenOptions.enable;
        }
        if ((i10 & 2) != 0) {
            fullscreenOrientation = fullscreenOptions.orientation;
        }
        if ((i10 & 4) != 0) {
            z11 = fullscreenOptions.autoExitOnRotate;
        }
        return fullscreenOptions.copy(z10, fullscreenOrientation, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FullscreenOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAutoExitOnRotate() {
        return this.autoExitOnRotate;
    }

    public final FullscreenOptions copy(boolean enable, FullscreenOrientation orientation, boolean autoExitOnRotate) {
        AbstractC5504s.h(orientation, "orientation");
        return new FullscreenOptions(enable, orientation, autoExitOnRotate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullscreenOptions)) {
            return false;
        }
        FullscreenOptions fullscreenOptions = (FullscreenOptions) other;
        return this.enable == fullscreenOptions.enable && this.orientation == fullscreenOptions.orientation && this.autoExitOnRotate == fullscreenOptions.autoExitOnRotate;
    }

    public final boolean getAutoExitOnRotate() {
        return this.autoExitOnRotate;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final FullscreenOrientation getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enable) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.autoExitOnRotate);
    }

    public String toString() {
        return "FullscreenOptions(enable=" + this.enable + ", orientation=" + this.orientation + ", autoExitOnRotate=" + this.autoExitOnRotate + ")";
    }

    public FullscreenOptions(boolean z10, FullscreenOrientation orientation, boolean z11) {
        AbstractC5504s.h(orientation, "orientation");
        this.enable = z10;
        this.orientation = orientation;
        this.autoExitOnRotate = z11;
    }

    public /* synthetic */ FullscreenOptions(boolean z10, FullscreenOrientation fullscreenOrientation, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? FullscreenOrientation.DEFAULT : fullscreenOrientation, (i10 & 4) != 0 ? false : z11);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAutoExitOnRotate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEnable$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getOrientation$annotations() {
    }
}
