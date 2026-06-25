package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import o9.AbstractC5842e;
import o9.AbstractC5844g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ClockHandView f43097A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ClockFaceView f43098B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final MaterialButtonToggleGroup f43099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final View.OnClickListener f43100D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Chip f43101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Chip f43102z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.C(TimePickerView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.D(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f43105a;

        c(GestureDetector gestureDetector) {
            this.f43105a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f43105a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void E() {
        this.f43101y.setTag(AbstractC5842e.f54776N, 12);
        this.f43102z.setTag(AbstractC5842e.f54776N, 10);
        this.f43101y.setOnClickListener(this.f43100D);
        this.f43102z.setOnClickListener(this.f43100D);
        this.f43101y.setAccessibilityClassName("android.view.View");
        this.f43102z.setAccessibilityClassName("android.view.View");
    }

    private void F() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f43101y.setOnTouchListener(cVar);
        this.f43102z.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f43102z.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43100D = new a();
        LayoutInflater.from(context).inflate(AbstractC5844g.f54828l, this);
        this.f43098B = (ClockFaceView) findViewById(AbstractC5842e.f54796i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC5842e.f54799l);
        this.f43099C = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f43120a.getClass();
            }
        });
        this.f43101y = (Chip) findViewById(AbstractC5842e.f54802o);
        this.f43102z = (Chip) findViewById(AbstractC5842e.f54800m);
        this.f43097A = (ClockHandView) findViewById(AbstractC5842e.f54797j);
        F();
        E();
    }
}
