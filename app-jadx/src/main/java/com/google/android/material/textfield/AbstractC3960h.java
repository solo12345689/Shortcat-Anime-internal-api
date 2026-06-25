package com.google.android.material.textfield;

import H9.h;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3960h extends H9.h {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    b f42935X;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends AbstractC3960h {
        c(b bVar) {
            super(bVar);
        }

        @Override // H9.h
        protected void w(Canvas canvas) {
            if (this.f42935X.f42936x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f42935X.f42936x);
            } else {
                canvas.clipRect(this.f42935X.f42936x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    static AbstractC3960h u0(H9.l lVar) {
        if (lVar == null) {
            lVar = new H9.l();
        }
        return v0(new b(lVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC3960h v0(b bVar) {
        return new c(bVar);
    }

    @Override // H9.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f42935X = new b(this.f42935X);
        return this;
    }

    boolean w0() {
        return !this.f42935X.f42936x.isEmpty();
    }

    void x0() {
        y0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void y0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f42935X.f42936x.left && f11 == this.f42935X.f42936x.top && f12 == this.f42935X.f42936x.right && f13 == this.f42935X.f42936x.bottom) {
            return;
        }
        this.f42935X.f42936x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void z0(RectF rectF) {
        y0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends h.c {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f42936x;

        @Override // H9.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC3960h abstractC3960hV0 = AbstractC3960h.v0(this);
            abstractC3960hV0.invalidateSelf();
            return abstractC3960hV0;
        }

        private b(H9.l lVar, RectF rectF) {
            super(lVar, null);
            this.f42936x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f42936x = bVar.f42936x;
        }
    }

    private AbstractC3960h(b bVar) {
        super(bVar);
        this.f42935X = bVar;
    }
}
