package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.c0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f38188w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private Integer f38189x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Integer f38190y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f38188w0 = true;
    }

    private final ColorStateList r(int i10) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i10});
    }

    public final void s(Drawable drawable, Integer num) {
        AbstractC5504s.h(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        setBackground(new RippleDrawable(r(i10), new ColorDrawable(i10), null));
    }

    @Override // androidx.appcompat.widget.c0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f38188w0 || isChecked() == z10) {
            super.setChecked(isChecked());
            return;
        }
        this.f38188w0 = false;
        super.setChecked(z10);
        setTrackColor(z10);
    }

    public final void setOn(boolean z10) {
        if (isChecked() != z10) {
            super.setChecked(z10);
            setTrackColor(z10);
        }
        this.f38188w0 = true;
    }

    public final void setThumbColor(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        AbstractC5504s.g(thumbDrawable, "getThumbDrawable(...)");
        s(thumbDrawable, num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateListR = r(num.intValue());
        Drawable background = super.getBackground();
        AbstractC5504s.f(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(colorStateListR);
    }

    public final void setTrackColor(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        AbstractC5504s.g(trackDrawable, "getTrackDrawable(...)");
        s(trackDrawable, num);
    }

    public final void setTrackColorForFalse(Integer num) {
        if (AbstractC5504s.c(num, this.f38189x0)) {
            return;
        }
        this.f38189x0 = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.f38189x0);
    }

    public final void setTrackColorForTrue(Integer num) {
        if (AbstractC5504s.c(num, this.f38190y0)) {
            return;
        }
        this.f38190y0 = num;
        if (isChecked()) {
            setTrackColor(this.f38190y0);
        }
    }

    private final void setTrackColor(boolean z10) {
        Integer num = this.f38190y0;
        if (num == null && this.f38189x0 == null) {
            return;
        }
        if (!z10) {
            num = this.f38189x0;
        }
        setTrackColor(num);
    }
}
