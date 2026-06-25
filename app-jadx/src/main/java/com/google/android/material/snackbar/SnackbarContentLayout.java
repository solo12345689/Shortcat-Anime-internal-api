package com.google.android.material.snackbar;

import C9.d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import p9.AbstractC5946a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f42818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f42819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f42820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42821d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42820c = d.g(context, AbstractC5838a.f54662t0, AbstractC5946a.f55827b);
    }

    private static void a(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42818a.getPaddingTop() == i11 && this.f42818a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f42818a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f42819b;
    }

    public TextView getMessageView() {
        return this.f42818a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f42818a = (TextView) findViewById(AbstractC5842e.f54778P);
        this.f42819b = (Button) findViewById(AbstractC5842e.f54777O);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC5840c.f54731m);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC5840c.f54729l);
        Layout layout = this.f42818a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f42821d <= 0 || this.f42819b.getMeasuredWidth() <= this.f42821d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f42821d = i10;
    }
}
