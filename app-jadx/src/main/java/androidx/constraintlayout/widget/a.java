package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import t1.C6588a;
import t1.C6592e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C6588a f28046l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(C6592e c6592e, int i10, boolean z10) {
        this.f28045k = i10;
        if (z10) {
            int i11 = this.f28044j;
            if (i11 == 5) {
                this.f28045k = 1;
            } else if (i11 == 6) {
                this.f28045k = 0;
            }
        } else {
            int i12 = this.f28044j;
            if (i12 == 5) {
                this.f28045k = 0;
            } else if (i12 == 6) {
                this.f28045k = 1;
            }
        }
        if (c6592e instanceof C6588a) {
            ((C6588a) c6592e).w1(this.f28045k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f28046l.q1();
    }

    public int getMargin() {
        return this.f28046l.s1();
    }

    public int getType() {
        return this.f28044j;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f28046l = new C6588a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f28550m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28241C1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f28232B1) {
                    this.f28046l.v1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f28250D1) {
                    this.f28046l.x1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f28068d = this.f28046l;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(C6592e c6592e, boolean z10) {
        p(c6592e, this.f28044j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f28046l.v1(z10);
    }

    public void setDpMargin(int i10) {
        this.f28046l.x1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f28046l.x1(i10);
    }

    public void setType(int i10) {
        this.f28044j = i10;
    }
}
