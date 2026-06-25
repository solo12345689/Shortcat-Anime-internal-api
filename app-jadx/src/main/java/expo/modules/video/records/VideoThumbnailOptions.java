package expo.modules.video.records;

import Td.z;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/video/records/VideoThumbnailOptions;", "Ljc/b;", "", "maxWidth", "maxHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlin/Pair;", "toNativeSizeLimit", "()Lkotlin/Pair;", "Ljava/lang/Integer;", "getMaxWidth", "()Ljava/lang/Integer;", "getMaxWidth$annotations", "()V", "getMaxHeight", "getMaxHeight$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoThumbnailOptions implements InterfaceC5364b {
    private final Integer maxHeight;
    private final Integer maxWidth;

    public VideoThumbnailOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final Pair<Integer, Integer> toNativeSizeLimit() {
        Integer num = this.maxWidth;
        if (num == null && this.maxHeight == null) {
            return null;
        }
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer num2 = this.maxHeight;
        int iIntValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
        if (iIntValue < 1 || iIntValue2 < 1) {
            throw new IllegalArgumentException("Failed to generate a thumbnail: The maxWidth and maxHeight parameters must be greater than zero");
        }
        return z.a(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    public VideoThumbnailOptions(Integer num, Integer num2) {
        this.maxWidth = num;
        this.maxHeight = num2;
    }

    public /* synthetic */ VideoThumbnailOptions(Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMaxHeight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMaxWidth$annotations() {
    }
}
