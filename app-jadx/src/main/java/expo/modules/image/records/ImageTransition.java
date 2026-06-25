package expo.modules.image.records;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lexpo/modules/image/records/ImageTransition;", "Ljc/b;", "", "duration", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lexpo/modules/image/records/ImageTransition;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDuration", "getDuration$annotations", "()V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageTransition implements InterfaceC5364b {
    private final int duration;

    public ImageTransition() {
        this(0, 1, null);
    }

    public static /* synthetic */ ImageTransition copy$default(ImageTransition imageTransition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = imageTransition.duration;
        }
        return imageTransition.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public final ImageTransition copy(int duration) {
        return new ImageTransition(duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageTransition) && this.duration == ((ImageTransition) other).duration;
    }

    public final int getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return Integer.hashCode(this.duration);
    }

    public String toString() {
        return "ImageTransition(duration=" + this.duration + ")";
    }

    public ImageTransition(int i10) {
        this.duration = i10;
    }

    public /* synthetic */ ImageTransition(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getDuration$annotations() {
    }
}
