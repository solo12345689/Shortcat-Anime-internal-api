package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import s.AbstractC6331a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25528b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25527a = getResources().getDimensionPixelOffset(AbstractC6331a.f58866b);
        this.f25528b = getResources().getDimensionPixelOffset(AbstractC6331a.f58865a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f25527a * 2), this.f25528b), 1073741824), i11);
    }
}
