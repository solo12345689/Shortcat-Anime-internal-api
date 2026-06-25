package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import s0.E;
import s0.InterfaceC6364j0;
import s0.r1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26821a;

    public a(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(r1.f59000a, Boolean.TRUE);
    }

    public final void a(InterfaceC6364j0 interfaceC6364j0, View view, long j10) {
        super.drawChild(E.d(interfaceC6364j0), view, j10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f26821a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
