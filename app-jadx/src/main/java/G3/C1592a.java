package G3;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: renamed from: G3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1592a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1592a f7129g = new C1592a(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f7135f;

    public C1592a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f7130a = i10;
        this.f7131b = i11;
        this.f7132c = i12;
        this.f7133d = i13;
        this.f7134e = i14;
        this.f7135f = typeface;
    }

    public static C1592a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C1592a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f7129g.f7130a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f7129g.f7131b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f7129g.f7132c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f7129g.f7133d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f7129g.f7134e, captionStyle.getTypeface());
    }
}
