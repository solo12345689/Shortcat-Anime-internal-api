package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import i.AbstractC4956a;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2670y extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2671z f25520a;

    public C2670y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47947I);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f25520a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f25520a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25520a.g(canvas);
    }

    public C2670y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C2671z c2671z = new C2671z(this);
        this.f25520a = c2671z;
        c2671z.c(attributeSet, i10);
    }
}
