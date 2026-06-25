package com.google.android.material.button;

import H9.l;
import H9.p;
import H9.q;
import H9.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private static final int f42116k = AbstractC5847j.f54887p;

    /* JADX INFO: renamed from: a */
    private final List f42117a;

    /* JADX INFO: renamed from: b */
    private final List f42118b;

    /* JADX INFO: renamed from: c */
    private final b f42119c;

    /* JADX INFO: renamed from: d */
    private final Comparator f42120d;

    /* JADX INFO: renamed from: e */
    private Integer[] f42121e;

    /* JADX INFO: renamed from: f */
    p f42122f;

    /* JADX INFO: renamed from: g */
    private q f42123g;

    /* JADX INFO: renamed from: h */
    private int f42124h;

    /* JADX INFO: renamed from: i */
    private r f42125i;

    /* JADX INFO: renamed from: j */
    private boolean f42126j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements MaterialButton.b {
        private b() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            d.this.invalidate();
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42116k;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f42117a = new ArrayList();
        this.f42118b = new ArrayList();
        this.f42119c = new b();
        this.f42120d = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.a(this.f42115a, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f42126j = true;
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55299x2, i10, i11, new int[0]);
        if (typedArrayI.hasValue(AbstractC5848k.f54901A2)) {
            this.f42125i = r.b(context2, typedArrayI, AbstractC5848k.f54901A2);
        }
        if (typedArrayI.hasValue(AbstractC5848k.f54917C2)) {
            q qVarB = q.b(context2, typedArrayI, AbstractC5848k.f54917C2);
            this.f42123g = qVarB;
            if (qVarB == null) {
                this.f42123g = new q.b(l.b(context2, typedArrayI.getResourceId(AbstractC5848k.f54917C2, 0), typedArrayI.getResourceId(AbstractC5848k.f54925D2, 0)).m()).j();
            }
        }
        if (typedArrayI.hasValue(AbstractC5848k.f54909B2)) {
            this.f42122f = p.c(context2, typedArrayI, AbstractC5848k.f54909B2, new H9.a(0.0f));
        }
        this.f42124h = typedArrayI.getDimensionPixelSize(AbstractC5848k.f55315z2, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(AbstractC5848k.f55307y2, true));
        typedArrayI.recycle();
    }

    public static /* synthetic */ int a(d dVar, MaterialButton materialButton, MaterialButton materialButton2) {
        dVar.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(dVar.indexOfChild(materialButton), dVar.indexOfChild(materialButton2));
    }

    private void b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonF = f(i10);
            MaterialButton materialButtonF2 = f(i10 - 1);
            if (this.f42124h <= 0) {
                iMin = Math.min(materialButtonF.getStrokeWidth(), materialButtonF2.getStrokeWidth());
                materialButtonF.setShouldDrawSurfaceColorStroke(true);
                materialButtonF2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonF.setShouldDrawSurfaceColorStroke(false);
                materialButtonF2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonF);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f42124h - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f42124h - iMin;
                layoutParamsD.setMarginStart(0);
            }
            materialButtonF.setLayoutParams(layoutParamsD);
        }
        m(firstVisibleChildIndex);
    }

    private void c() {
        if (this.f42125i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (j(i10)) {
                int iE = e(i10);
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iE /= 2;
                }
                iMin = Math.min(iMin, iE);
            }
        }
        int i11 = firstVisibleChildIndex;
        while (i11 <= lastVisibleChildIndex) {
            if (j(i11)) {
                f(i11).setSizeChange(this.f42125i);
                f(i11).setWidthChangeMax((i11 == firstVisibleChildIndex || i11 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i11++;
        }
    }

    private int e(int i10) {
        if (!j(i10) || this.f42125i == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f42125i.c(f(i10).getWidth()));
        MaterialButton materialButtonI = i(i10);
        int allowedWidthDecrease = materialButtonI == null ? 0 : materialButtonI.getAllowedWidthDecrease();
        MaterialButton materialButtonG = g(i10);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
    }

    private MaterialButton g(int i10) {
        int childCount = getChildCount();
        do {
            i10++;
            if (i10 >= childCount) {
                return null;
            }
        } while (!j(i10));
        return f(i10);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (j(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private q.b h(boolean z10, boolean z11, int i10) {
        q qVar = this.f42123g;
        if (qVar == null || (!z10 && !z11)) {
            qVar = (q) this.f42118b.get(i10);
        }
        return qVar == null ? new q.b((l) this.f42117a.get(i10)) : qVar.i();
    }

    private MaterialButton i(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (j(i11)) {
                return f(i11);
            }
        }
        return null;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void l() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).o();
        }
    }

    private void m(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void n() {
        TreeMap treeMap = new TreeMap(this.f42120d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(f(i10), Integer.valueOf(i10));
        }
        this.f42121e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.f42126j = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f42119c);
        this.f42117a.add(materialButton.getShapeAppearanceModel());
        this.f42118b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    MaterialButton f(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public r getButtonSizeChange() {
        return this.f42125i;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f42121e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public H9.d getInnerCornerSize() {
        return this.f42122f.e();
    }

    public p getInnerCornerSizeStateList() {
        return this.f42122f;
    }

    public l getShapeAppearance() {
        q qVar = this.f42123g;
        if (qVar == null) {
            return null;
        }
        return qVar.c(true);
    }

    public int getSpacing() {
        return this.f42124h;
    }

    public q getStateListShapeAppearance() {
        return this.f42123g;
    }

    void k(MaterialButton materialButton, int i10) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonI = i(iIndexOfChild);
        MaterialButton materialButtonG = g(iIndexOfChild);
        if (materialButtonI == null && materialButtonG == null) {
            return;
        }
        if (materialButtonI == null) {
            materialButtonG.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonG == null) {
            materialButtonI.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonI == null || materialButtonG == null) {
            return;
        }
        materialButtonI.setDisplayedWidthDecrease(i10 / 2);
        materialButtonG.setDisplayedWidthDecrease((i10 + 1) / 2);
    }

    void o() {
        int iH;
        if (!(this.f42122f == null && this.f42123g == null) && this.f42126j) {
            this.f42126j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButtonF = f(i10);
                if (materialButtonF.getVisibility() != 8) {
                    boolean z10 = i10 == firstVisibleChildIndex;
                    boolean z11 = i10 == lastVisibleChildIndex;
                    q.b bVarH = h(z10, z11, i10);
                    boolean z12 = getOrientation() == 0;
                    boolean zG = com.google.android.material.internal.p.g(this);
                    if (z12) {
                        iH = z10 ? 5 : 0;
                        if (z11) {
                            iH |= 10;
                        }
                        if (zG) {
                            iH = q.h(iH);
                        }
                    } else {
                        iH = z10 ? 3 : 0;
                        if (z11) {
                            iH |= 12;
                        }
                    }
                    q qVarJ = bVarH.n(this.f42122f, ~iH).j();
                    if (qVarJ.f()) {
                        materialButtonF.setStateListShapeAppearanceModel(qVarJ);
                    } else {
                        materialButtonF.setShapeAppearanceModel(qVarJ.c(true));
                    }
                }
                i10++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        o();
        b();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f42117a.remove(iIndexOfChild);
            this.f42118b.remove(iIndexOfChild);
        }
        this.f42126j = true;
        o();
        l();
        b();
    }

    public void setButtonSizeChange(r rVar) {
        if (this.f42125i != rVar) {
            this.f42125i = rVar;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(H9.d dVar) {
        this.f42122f = p.b(dVar);
        this.f42126j = true;
        o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(p pVar) {
        this.f42122f = pVar;
        this.f42126j = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f42126j = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(l lVar) {
        this.f42123g = new q.b(lVar).j();
        this.f42126j = true;
        o();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.f42124h = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(q qVar) {
        this.f42123g = qVar;
        this.f42126j = true;
        o();
        invalidate();
    }
}
