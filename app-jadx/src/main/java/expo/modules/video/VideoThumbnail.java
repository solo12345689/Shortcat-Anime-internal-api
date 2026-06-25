package expo.modules.video;

import android.graphics.Bitmap;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/video/VideoThumbnail;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "ref", "LEf/a;", "requestedTime", "actualTime", "<init>", "(Landroid/graphics/Bitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "k", "()I", "e", "J", "Y", "()J", "f", "S", "g", "I", "getWidth", "width", "h", "getHeight", "height", "", "i", "Ljava/lang/String;", "()Ljava/lang/String;", "nativeRefType", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoThumbnail extends SharedRef<Bitmap> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long requestedTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long actualTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String nativeRefType;

    public /* synthetic */ VideoThumbnail(Bitmap bitmap, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, j10, j11);
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedRef
    /* JADX INFO: renamed from: J, reason: from getter */
    public String getNativeRefType() {
        return this.nativeRefType;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final long getActualTime() {
        return this.actualTime;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getRequestedTime() {
        return this.requestedTime;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public int k() {
        return ((Bitmap) getRef()).getByteCount();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private VideoThumbnail(Bitmap ref, long j10, long j11) {
        super(ref, null, 2, null);
        AbstractC5504s.h(ref, "ref");
        this.requestedTime = j10;
        this.actualTime = j11;
        this.width = ref.getWidth();
        this.height = ref.getHeight();
        this.nativeRefType = "image";
    }
}
