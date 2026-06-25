package V5;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        AbstractC5504s.h(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // V5.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (L6.b.d()) {
            L6.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!f()) {
            super.draw(canvas);
            if (L6.b.d()) {
                L6.b.b();
                return;
            }
            return;
        }
        h();
        g();
        canvas.clipPath(this.f19872e);
        super.draw(canvas);
        if (L6.b.d()) {
            L6.b.b();
        }
    }
}
