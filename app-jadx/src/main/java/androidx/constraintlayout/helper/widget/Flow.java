package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.k;
import t1.AbstractC6599l;
import t1.C6592e;
import t1.C6594g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C6594g f27935l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.k, androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f27935l = new C6594g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f28550m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28559n1) {
                    this.f27935l.z2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28568o1) {
                    this.f27935l.E1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28658y1) {
                    this.f27935l.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28667z1) {
                    this.f27935l.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28577p1) {
                    this.f27935l.H1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28586q1) {
                    this.f27935l.K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28595r1) {
                    this.f27935l.I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28604s1) {
                    this.f27935l.F1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28426Y1) {
                    this.f27935l.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28346O1) {
                    this.f27935l.t2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28418X1) {
                    this.f27935l.D2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28295I1) {
                    this.f27935l.n2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28362Q1) {
                    this.f27935l.v2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28313K1) {
                    this.f27935l.p2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28378S1) {
                    this.f27935l.x2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28330M1) {
                    this.f27935l.r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28286H1) {
                    this.f27935l.m2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28354P1) {
                    this.f27935l.u2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28304J1) {
                    this.f27935l.o2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28370R1) {
                    this.f27935l.w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28402V1) {
                    this.f27935l.B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f28322L1) {
                    this.f27935l.q2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f28394U1) {
                    this.f27935l.A2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f28338N1) {
                    this.f27935l.s2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28410W1) {
                    this.f27935l.C2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f28386T1) {
                    this.f27935l.y2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f28068d = this.f27935l;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(C6592e c6592e, boolean z10) {
        this.f27935l.p1(z10);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i10, int i11) {
        p(this.f27935l, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.k
    public void p(AbstractC6599l abstractC6599l, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (abstractC6599l == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC6599l.y1(mode, size, mode2, size2);
            setMeasuredDimension(abstractC6599l.t1(), abstractC6599l.s1());
        }
    }

    public void setFirstHorizontalBias(float f10) {
        this.f27935l.m2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f27935l.n2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f27935l.o2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f27935l.p2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f27935l.q2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f27935l.r2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f27935l.s2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f27935l.t2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f27935l.y2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f27935l.z2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f27935l.E1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f27935l.F1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f27935l.H1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f27935l.I1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f27935l.K1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f27935l.A2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f27935l.B2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f27935l.C2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f27935l.D2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f27935l.E2(i10);
        requestLayout();
    }
}
