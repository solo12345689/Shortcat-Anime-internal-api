package expo.modules.image.records;

import android.graphics.Color;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\r¨\u0006\""}, d2 = {"Lexpo/modules/image/records/ImageLoadOptions;", "Ljc/b;", "", "maxWidth", "maxHeight", "Landroid/graphics/Color;", "tintColor", "<init>", "(IILandroid/graphics/Color;)V", "component1", "()I", "component2", "component3", "()Landroid/graphics/Color;", "copy", "(IILandroid/graphics/Color;)Lexpo/modules/image/records/ImageLoadOptions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxWidth", "getMaxWidth$annotations", "()V", "getMaxHeight", "getMaxHeight$annotations", "Landroid/graphics/Color;", "getTintColor", "getTintColor$annotations", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageLoadOptions implements InterfaceC5364b {
    private final int maxHeight;
    private final int maxWidth;
    private final Color tintColor;

    public ImageLoadOptions() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ ImageLoadOptions copy$default(ImageLoadOptions imageLoadOptions, int i10, int i11, Color color, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = imageLoadOptions.maxWidth;
        }
        if ((i12 & 2) != 0) {
            i11 = imageLoadOptions.maxHeight;
        }
        if ((i12 & 4) != 0) {
            color = imageLoadOptions.tintColor;
        }
        return imageLoadOptions.copy(i10, i11, color);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Color getTintColor() {
        return this.tintColor;
    }

    public final ImageLoadOptions copy(int maxWidth, int maxHeight, Color tintColor) {
        return new ImageLoadOptions(maxWidth, maxHeight, tintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLoadOptions)) {
            return false;
        }
        ImageLoadOptions imageLoadOptions = (ImageLoadOptions) other;
        return this.maxWidth == imageLoadOptions.maxWidth && this.maxHeight == imageLoadOptions.maxHeight && AbstractC5504s.c(this.tintColor, imageLoadOptions.tintColor);
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final Color getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.maxWidth) * 31) + Integer.hashCode(this.maxHeight)) * 31;
        Color color = this.tintColor;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "ImageLoadOptions(maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", tintColor=" + this.tintColor + ")";
    }

    public ImageLoadOptions(int i10, int i11, Color color) {
        this.maxWidth = i10;
        this.maxHeight = i11;
        this.tintColor = color;
    }

    public /* synthetic */ ImageLoadOptions(int i10, int i11, Color color, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Integer.MIN_VALUE : i10, (i12 & 2) != 0 ? Integer.MIN_VALUE : i11, (i12 & 4) != 0 ? null : color);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMaxHeight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMaxWidth$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTintColor$annotations() {
    }
}
