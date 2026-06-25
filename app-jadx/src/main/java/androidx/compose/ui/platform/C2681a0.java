package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2681a0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f27411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f27412b;

    public C2681a0(Context context) {
        super(context);
        setClipChildren(false);
        this.f27411a = new HashMap();
        this.f27412b = new HashMap();
    }

    public final void a(androidx.compose.ui.viewinterop.b bVar, Canvas canvas) {
        bVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.b, K0.J> getHolderToLayoutNode() {
        return this.f27411a;
    }

    public final HashMap<K0.J, androidx.compose.ui.viewinterop.b> getLayoutNodeToHolder() {
        return this.f27412b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (androidx.compose.ui.viewinterop.b bVar : this.f27411a.keySet()) {
            bVar.layout(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            H0.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            H0.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator it = this.f27411a.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.b) it.next()).F();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            K0.J j10 = (K0.J) this.f27411a.get(childAt);
            if (childAt.isLayoutRequested() && j10 != null) {
                K0.J.I1(j10, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }
}
