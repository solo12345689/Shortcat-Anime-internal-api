package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class r extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f25498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2663q f25499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25500c;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            c2651e.b();
        }
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            return c2663q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            return c2663q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f25499b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2663q c2663q = this.f25499b;
        if (c2663q != null && drawable != null && !this.f25500c) {
            c2663q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C2663q c2663q2 = this.f25499b;
        if (c2663q2 != null) {
            c2663q2.c();
            if (this.f25500c) {
                return;
            }
            this.f25499b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f25500c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f25498a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2663q c2663q = this.f25499b;
        if (c2663q != null) {
            c2663q.k(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.f25500c = false;
        d0.a(this, getContext());
        C2651e c2651e = new C2651e(this);
        this.f25498a = c2651e;
        c2651e.e(attributeSet, i10);
        C2663q c2663q = new C2663q(this);
        this.f25499b = c2663q;
        c2663q.g(attributeSet, i10);
    }
}
