package expo.modules.image.records;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\rR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b(\u0010\u001f\u001a\u0004\b\t\u0010\u0013¨\u0006)"}, d2 = {"Lexpo/modules/image/records/ImageSource;", "Ljc/b;", "", "url", "", "width", "height", "mediaType", "", "isAnimated", "<init>", "(Ljava/lang/String;IILjava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;IILjava/lang/String;Z)Lexpo/modules/image/records/ImageSource;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "I", "getWidth", "getWidth$annotations", "getHeight", "getHeight$annotations", "getMediaType", "getMediaType$annotations", "Z", "isAnimated$annotations", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageSource implements InterfaceC5364b {
    private final int height;
    private final boolean isAnimated;
    private final String mediaType;
    private final String url;
    private final int width;

    public ImageSource(String url, int i10, int i11, String str, boolean z10) {
        AbstractC5504s.h(url, "url");
        this.url = url;
        this.width = i10;
        this.height = i11;
        this.mediaType = str;
        this.isAnimated = z10;
    }

    public static /* synthetic */ ImageSource copy$default(ImageSource imageSource, String str, int i10, int i11, String str2, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageSource.url;
        }
        if ((i12 & 2) != 0) {
            i10 = imageSource.width;
        }
        if ((i12 & 4) != 0) {
            i11 = imageSource.height;
        }
        if ((i12 & 8) != 0) {
            str2 = imageSource.mediaType;
        }
        if ((i12 & 16) != 0) {
            z10 = imageSource.isAnimated;
        }
        boolean z11 = z10;
        int i13 = i11;
        return imageSource.copy(str, i10, i13, str2, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAnimated() {
        return this.isAnimated;
    }

    public final ImageSource copy(String url, int width, int height, String mediaType, boolean isAnimated) {
        AbstractC5504s.h(url, "url");
        return new ImageSource(url, width, height, mediaType, isAnimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSource)) {
            return false;
        }
        ImageSource imageSource = (ImageSource) other;
        return AbstractC5504s.c(this.url, imageSource.url) && this.width == imageSource.width && this.height == imageSource.height && AbstractC5504s.c(this.mediaType, imageSource.mediaType) && this.isAnimated == imageSource.isAnimated;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((this.url.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31;
        String str = this.mediaType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isAnimated);
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public String toString() {
        return "ImageSource(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", mediaType=" + this.mediaType + ", isAnimated=" + this.isAnimated + ")";
    }

    @InterfaceC5363a
    public static /* synthetic */ void getHeight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMediaType$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUrl$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getWidth$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void isAnimated$annotations() {
    }
}
