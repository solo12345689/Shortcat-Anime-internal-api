package expo.modules.webview;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\nR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\nR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\r¨\u0006#"}, d2 = {"Lexpo/modules/webview/ScrollToParam;", "Ljc/b;", "", "x", "y", "", "animated", "<init>", "(DDZ)V", "component1", "()D", "component2", "component3", "()Z", "copy", "(DDZ)Lexpo/modules/webview/ScrollToParam;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getX", "getX$annotations", "()V", "getY", "getY$annotations", "Z", "getAnimated", "getAnimated$annotations", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScrollToParam implements InterfaceC5364b {
    private final boolean animated;
    private final double x;
    private final double y;

    public ScrollToParam() {
        this(0.0d, 0.0d, false, 7, null);
    }

    public static /* synthetic */ ScrollToParam copy$default(ScrollToParam scrollToParam, double d10, double d11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = scrollToParam.x;
        }
        double d12 = d10;
        if ((i10 & 2) != 0) {
            d11 = scrollToParam.y;
        }
        double d13 = d11;
        if ((i10 & 4) != 0) {
            z10 = scrollToParam.animated;
        }
        return scrollToParam.copy(d12, d13, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAnimated() {
        return this.animated;
    }

    public final ScrollToParam copy(double x10, double y10, boolean animated) {
        return new ScrollToParam(x10, y10, animated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollToParam)) {
            return false;
        }
        ScrollToParam scrollToParam = (ScrollToParam) other;
        return Double.compare(this.x, scrollToParam.x) == 0 && Double.compare(this.y, scrollToParam.y) == 0 && this.animated == scrollToParam.animated;
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return (((Double.hashCode(this.x) * 31) + Double.hashCode(this.y)) * 31) + Boolean.hashCode(this.animated);
    }

    public String toString() {
        return "ScrollToParam(x=" + this.x + ", y=" + this.y + ", animated=" + this.animated + ")";
    }

    public ScrollToParam(double d10, double d11, boolean z10) {
        this.x = d10;
        this.y = d11;
        this.animated = z10;
    }

    public /* synthetic */ ScrollToParam(double d10, double d11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? true : z10);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAnimated$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getX$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getY$annotations() {
    }
}
