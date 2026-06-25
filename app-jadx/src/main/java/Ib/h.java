package Ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ViewParent;
import android.widget.ImageView;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.records.ContentPosition;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends androidx.appcompat.widget.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f8971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ContentFit f8974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ContentFit f8975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ContentPosition f8976i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        setClipToOutline(true);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f8974g = ContentFit.Cover;
        this.f8975h = ContentFit.ScaleDown;
        this.f8976i = ContentPosition.INSTANCE.a();
    }

    private final void d(Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer num, Integer num2) {
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Matrix matrix$expo_image_release = contentFit.toMatrix$expo_image_release(rectF, rectF2, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        matrix$expo_image_release.mapRect(rectF);
        contentPosition.apply$expo_image_release(matrix$expo_image_release, rectF, rectF2);
        setImageMatrix(matrix$expo_image_release);
    }

    static /* synthetic */ void e(h hVar, Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            contentPosition = ContentPosition.INSTANCE.a();
        }
        ContentPosition contentPosition2 = contentPosition;
        if ((i10 & 8) != 0) {
            o oVar = hVar.f8971d;
            num = oVar != null ? Integer.valueOf(oVar.s()) : null;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            o oVar2 = hVar.f8971d;
            num2 = oVar2 != null ? Integer.valueOf(oVar2.r()) : null;
        }
        hVar.d(drawable, contentFit, contentPosition2, num3, num2);
    }

    public final void c() {
        if (getDrawable() == null) {
            return;
        }
        if (!this.f8972e) {
            Drawable drawable = getDrawable();
            AbstractC5504s.g(drawable, "getDrawable(...)");
            e(this, drawable, this.f8974g, this.f8976i, null, null, 24, null);
            return;
        }
        Drawable drawable2 = getDrawable();
        AbstractC5504s.g(drawable2, "getDrawable(...)");
        ContentFit contentFit = this.f8975h;
        o oVar = this.f8971d;
        Integer numValueOf = oVar != null ? Integer.valueOf(oVar.p()) : null;
        o oVar2 = this.f8971d;
        e(this, drawable2, contentFit, null, oVar2 != null ? Integer.valueOf(oVar2.q()) : null, numValueOf, 4, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        com.bumptech.glide.k requestManager;
        AbstractC5504s.h(canvas, "canvas");
        Drawable drawable = getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null && bitmap.isRecycled()) {
            Log.e("ExpoImage", "Trying to use a recycled bitmap");
            o oVarG = g();
            if (oVarG != null) {
                ViewParent parent = getParent();
                ExpoImageViewWrapper expoImageViewWrapper = parent instanceof ExpoImageViewWrapper ? (ExpoImageViewWrapper) parent : null;
                if (expoImageViewWrapper != null && (requestManager = expoImageViewWrapper.getRequestManager()) != null) {
                    oVarG.e(requestManager);
                }
            }
        }
        super.draw(canvas);
    }

    public final boolean f() {
        return this.f8972e;
    }

    public final o g() {
        setImageDrawable(null);
        o oVar = this.f8971d;
        if (oVar != null) {
            oVar.C(false);
        } else {
            oVar = null;
        }
        this.f8971d = null;
        setVisibility(8);
        this.f8972e = false;
        return oVar;
    }

    public final ContentFit getContentFit$expo_image_release() {
        return this.f8974g;
    }

    public final ContentPosition getContentPosition$expo_image_release() {
        return this.f8976i;
    }

    public final o getCurrentTarget() {
        return this.f8971d;
    }

    public final ContentFit getPlaceholderContentFit$expo_image_release() {
        return this.f8975h;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c();
    }

    public final void setContentFit$expo_image_release(ContentFit value) {
        AbstractC5504s.h(value, "value");
        this.f8974g = value;
        this.f8973f = true;
    }

    public final void setContentPosition$expo_image_release(ContentPosition value) {
        AbstractC5504s.h(value, "value");
        this.f8976i = value;
        this.f8973f = true;
    }

    public final void setCurrentTarget(o oVar) {
        this.f8971d = oVar;
    }

    public final void setPlaceholder(boolean z10) {
        this.f8972e = z10;
    }

    public final void setPlaceholderContentFit$expo_image_release(ContentFit value) {
        AbstractC5504s.h(value, "value");
        this.f8975h = value;
        this.f8973f = true;
    }

    public final void setTintColor$expo_image_release(Integer num) {
        if (num != null) {
            setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            clearColorFilter();
        }
    }
}
