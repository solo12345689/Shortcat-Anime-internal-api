package expo.modules.font;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u0010R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b(\u0010\u001f\u001a\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lexpo/modules/font/RenderToImageOptions;", "Ljc/b;", "", "fontFamily", "", "size", "lineHeight", "", "color", "<init>", "(Ljava/lang/String;FLjava/lang/Float;I)V", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "()Ljava/lang/Float;", "component4", "()I", "copy", "(Ljava/lang/String;FLjava/lang/Float;I)Lexpo/modules/font/RenderToImageOptions;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFontFamily", "getFontFamily$annotations", "()V", "F", "getSize", "getSize$annotations", "Ljava/lang/Float;", "getLineHeight", "getLineHeight$annotations", "I", "getColor", "getColor$annotations", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RenderToImageOptions implements InterfaceC5364b {
    private final int color;
    private final String fontFamily;
    private final Float lineHeight;
    private final float size;

    public RenderToImageOptions() {
        this(null, 0.0f, null, 0, 15, null);
    }

    public static /* synthetic */ RenderToImageOptions copy$default(RenderToImageOptions renderToImageOptions, String str, float f10, Float f11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = renderToImageOptions.fontFamily;
        }
        if ((i11 & 2) != 0) {
            f10 = renderToImageOptions.size;
        }
        if ((i11 & 4) != 0) {
            f11 = renderToImageOptions.lineHeight;
        }
        if ((i11 & 8) != 0) {
            i10 = renderToImageOptions.color;
        }
        return renderToImageOptions.copy(str, f10, f11, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final RenderToImageOptions copy(String fontFamily, float size, Float lineHeight, int color) {
        AbstractC5504s.h(fontFamily, "fontFamily");
        return new RenderToImageOptions(fontFamily, size, lineHeight, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderToImageOptions)) {
            return false;
        }
        RenderToImageOptions renderToImageOptions = (RenderToImageOptions) other;
        return AbstractC5504s.c(this.fontFamily, renderToImageOptions.fontFamily) && Float.compare(this.size, renderToImageOptions.size) == 0 && AbstractC5504s.c(this.lineHeight, renderToImageOptions.lineHeight) && this.color == renderToImageOptions.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final Float getLineHeight() {
        return this.lineHeight;
    }

    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((this.fontFamily.hashCode() * 31) + Float.hashCode(this.size)) * 31;
        Float f10 = this.lineHeight;
        return ((iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31) + Integer.hashCode(this.color);
    }

    public String toString() {
        return "RenderToImageOptions(fontFamily=" + this.fontFamily + ", size=" + this.size + ", lineHeight=" + this.lineHeight + ", color=" + this.color + ")";
    }

    public RenderToImageOptions(String fontFamily, float f10, Float f11, int i10) {
        AbstractC5504s.h(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        this.size = f10;
        this.lineHeight = f11;
        this.color = i10;
    }

    public /* synthetic */ RenderToImageOptions(String str, float f10, Float f11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 24.0f : f10, (i11 & 4) != 0 ? null : f11, (i11 & 8) != 0 ? -16777216 : i10);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getColor$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getFontFamily$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getLineHeight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getSize$annotations() {
    }
}
