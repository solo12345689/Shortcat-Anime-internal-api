package com.google.android.material.timepicker;

import H9.h;
import H9.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o9.AbstractC5842e;
import o9.AbstractC5844g;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class d extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private h f43110A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f43111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43112z;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(AbstractC5844g.f54825i, this);
        setBackground(C());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f54991L4, i10, 0);
        this.f43112z = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f54999M4, 0);
        this.f43111y = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f43109a.H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void B(List list, androidx.constraintlayout.widget.e eVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), AbstractC5842e.f54790c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable C() {
        h hVar = new h();
        this.f43110A = hVar;
        hVar.a0(new j(0.5f));
        this.f43110A.d0(ColorStateList.valueOf(-1));
        return this.f43110A;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f43111y);
            handler.post(this.f43111y);
        }
    }

    int D(int i10) {
        return i10 == 2 ? Math.round(this.f43112z * 0.66f) : this.f43112z;
    }

    public int E() {
        return this.f43112z;
    }

    public void F(int i10) {
        this.f43112z = i10;
        H();
    }

    protected void H() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != AbstractC5842e.f54790c && !G(childAt)) {
                int i11 = (Integer) childAt.getTag(AbstractC5842e.f54798k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            B((List) entry.getValue(), eVar, D(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        I();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f43110A.d0(ColorStateList.valueOf(i10));
    }
}
