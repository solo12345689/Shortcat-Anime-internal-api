package V5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f19817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f19820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f19821i;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f19817e = new Matrix();
        this.f19818f = i10 - (i10 % 90);
        this.f19819g = (i11 < 0 || i11 > 8) ? 0 : i11;
        this.f19820h = new Matrix();
        this.f19821i = new RectF();
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        AbstractC5504s.h(canvas, "canvas");
        if (this.f19818f <= 0 && ((i10 = this.f19819g) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f19817e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // V5.g, V5.D
    public void f(Matrix transform) {
        AbstractC5504s.h(transform, "transform");
        u(transform);
        if (this.f19817e.isIdentity()) {
            return;
        }
        transform.preConcat(this.f19817e);
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f19819g;
        return (i10 == 5 || i10 == 7 || this.f19818f % SensibleDefaults.X_OFFSET != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f19819g;
        return (i10 == 5 || i10 == 7 || this.f19818f % SensibleDefaults.X_OFFSET != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // V5.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i10;
        AbstractC5504s.h(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i11 = this.f19818f;
        if (i11 <= 0 && ((i10 = this.f19819g) == 0 || i10 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i12 = this.f19819g;
        if (i12 == 2) {
            this.f19817e.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f19817e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f19817e.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f19817e.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f19817e.setRotate(i11, bounds.centerX(), bounds.centerY());
        } else {
            this.f19817e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f19817e.postScale(1.0f, -1.0f);
        }
        this.f19820h.reset();
        this.f19817e.invert(this.f19820h);
        this.f19821i.set(bounds);
        this.f19820h.mapRect(this.f19821i);
        RectF rectF = this.f19821i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
