package s0;

import android.graphics.Rect;
import android.graphics.RectF;
import i1.C5023p;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    public static final Rect a(C5023p c5023p) {
        return new Rect(c5023p.f(), c5023p.h(), c5023p.g(), c5023p.d());
    }

    public static final Rect b(C6226h c6226h) {
        return new Rect((int) c6226h.i(), (int) c6226h.l(), (int) c6226h.j(), (int) c6226h.e());
    }

    public static final RectF c(C6226h c6226h) {
        return new RectF(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e());
    }

    public static final C5023p d(Rect rect) {
        return new C5023p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C6226h e(Rect rect) {
        return new C6226h(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C6226h f(RectF rectF) {
        return new C6226h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
