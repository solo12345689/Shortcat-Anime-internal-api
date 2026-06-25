package expo.modules.image.records;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001e"}, d2 = {"Lexpo/modules/image/records/ImageLoadEvent;", "Ljc/b;", "", "cacheType", "Lexpo/modules/image/records/ImageSource;", "source", "<init>", "(Ljava/lang/String;Lexpo/modules/image/records/ImageSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Lexpo/modules/image/records/ImageSource;", "copy", "(Ljava/lang/String;Lexpo/modules/image/records/ImageSource;)Lexpo/modules/image/records/ImageLoadEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCacheType", "getCacheType$annotations", "()V", "Lexpo/modules/image/records/ImageSource;", "getSource", "getSource$annotations", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageLoadEvent implements InterfaceC5364b {
    private final String cacheType;
    private final ImageSource source;

    public ImageLoadEvent(String cacheType, ImageSource source) {
        AbstractC5504s.h(cacheType, "cacheType");
        AbstractC5504s.h(source, "source");
        this.cacheType = cacheType;
        this.source = source;
    }

    public static /* synthetic */ ImageLoadEvent copy$default(ImageLoadEvent imageLoadEvent, String str, ImageSource imageSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = imageLoadEvent.cacheType;
        }
        if ((i10 & 2) != 0) {
            imageSource = imageLoadEvent.source;
        }
        return imageLoadEvent.copy(str, imageSource);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCacheType() {
        return this.cacheType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageSource getSource() {
        return this.source;
    }

    public final ImageLoadEvent copy(String cacheType, ImageSource source) {
        AbstractC5504s.h(cacheType, "cacheType");
        AbstractC5504s.h(source, "source");
        return new ImageLoadEvent(cacheType, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLoadEvent)) {
            return false;
        }
        ImageLoadEvent imageLoadEvent = (ImageLoadEvent) other;
        return AbstractC5504s.c(this.cacheType, imageLoadEvent.cacheType) && AbstractC5504s.c(this.source, imageLoadEvent.source);
    }

    public final String getCacheType() {
        return this.cacheType;
    }

    public final ImageSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (this.cacheType.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "ImageLoadEvent(cacheType=" + this.cacheType + ", source=" + this.source + ")";
    }

    @InterfaceC5363a
    public static /* synthetic */ void getCacheType$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getSource$annotations() {
    }
}
