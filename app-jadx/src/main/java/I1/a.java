package I1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f8733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f8735c;

    public a(Drawable drawable, float f10) {
        AbstractC5504s.h(drawable, "drawable");
        this.f8733a = drawable;
        this.f8734b = f10;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f10 / 2.0f, Path.Direction.CW);
        this.f8735c = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        canvas.clipPath(this.f8735c);
        this.f8733a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8733a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f8733a.setBounds(bounds);
        this.f8735c.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f8733a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8733a.setColorFilter(colorFilter);
    }
}
