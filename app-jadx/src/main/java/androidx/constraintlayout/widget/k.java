package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import t1.AbstractC6599l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends c {

    /* JADX INFO: renamed from: j */
    private boolean f28676j;

    /* JADX INFO: renamed from: k */
    private boolean f28677k;

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f28550m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28613t1) {
                    this.f28676j = true;
                } else if (index == i.f28223A1) {
                    this.f28677k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28676j || this.f28677k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f28066b; i10++) {
                    View viewL = constraintLayout.l(this.f28065a[i10]);
                    if (viewL != null) {
                        if (this.f28676j) {
                            viewL.setVisibility(visibility);
                        }
                        if (this.f28677k && elevation > 0.0f) {
                            viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(AbstractC6599l abstractC6599l, int i10, int i11);

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
