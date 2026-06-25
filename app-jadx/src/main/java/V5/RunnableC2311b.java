package V5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: V5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC2311b extends g implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f19788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19789h;

    public RunnableC2311b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int x() {
        return (int) ((20.0f / this.f19786e) * 360.0f);
    }

    private void y() {
        if (this.f19789h) {
            return;
        }
        this.f19789h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right - bounds.left;
        int i11 = bounds.bottom - bounds.top;
        float f10 = this.f19788g;
        if (!this.f19787f) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, r3 + (i10 / 2), r1 + (i11 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19789h = false;
        this.f19788g += x();
        invalidateSelf();
    }

    public RunnableC2311b(Drawable drawable, int i10, boolean z10) {
        super((Drawable) y5.k.g(drawable));
        this.f19788g = 0.0f;
        this.f19789h = false;
        this.f19786e = i10;
        this.f19787f = z10;
    }
}
