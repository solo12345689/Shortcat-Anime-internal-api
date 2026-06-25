package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import i.AbstractC4956a;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2668w extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2666u f25519a;

    public C2668w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47945G);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f25519a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C2668w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C2666u c2666u = new C2666u(this);
        this.f25519a = c2666u;
        c2666u.c(attributeSet, i10);
    }
}
