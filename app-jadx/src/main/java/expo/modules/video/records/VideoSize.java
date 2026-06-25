package expo.modules.video.records;

import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6109x;
import q2.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u000fR \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lexpo/modules/video/records/VideoSize;", "Ljc/b;", "Ljava/io/Serializable;", "", "width", "height", "<init>", "(II)V", "Lq2/l0;", "size", "(Lq2/l0;)V", "Lq2/x;", "format", "(Lq2/x;)V", "component1", "()I", "component2", "copy", "(II)Lexpo/modules/video/records/VideoSize;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VideoSize implements InterfaceC5364b, Serializable {
    private final int height;
    private final int width;

    public VideoSize() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ VideoSize copy$default(VideoSize videoSize, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = videoSize.width;
        }
        if ((i12 & 2) != 0) {
            i11 = videoSize.height;
        }
        return videoSize.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final VideoSize copy(int width, int height) {
        return new VideoSize(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) other;
        return this.width == videoSize.width && this.height == videoSize.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        return "VideoSize(width=" + this.width + ", height=" + this.height + ")";
    }

    public VideoSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public /* synthetic */ VideoSize(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSize(l0 size) {
        this(size.f56923a, size.f56924b);
        AbstractC5504s.h(size, "size");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSize(C6109x format) {
        this(format.f57029v, format.f57030w);
        AbstractC5504s.h(format, "format");
    }

    @InterfaceC5363a
    public static /* synthetic */ void getHeight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getWidth$annotations() {
    }
}
