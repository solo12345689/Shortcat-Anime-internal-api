package W5;

import V5.E;
import V5.F;
import V5.g;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends g implements E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f20761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f20762f;

    public c(Drawable drawable) {
        super(drawable);
        this.f20761e = null;
    }

    @Override // V5.E
    public void d(F f10) {
        this.f20762f = f10;
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            F f10 = this.f20762f;
            if (f10 != null) {
                f10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f20761e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f20761e.draw(canvas);
            }
        }
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        F f10 = this.f20762f;
        if (f10 != null) {
            f10.l(z10);
        }
        return super.setVisible(z10, z11);
    }

    public void x(Drawable drawable) {
        this.f20761e = drawable;
        invalidateSelf();
    }
}
