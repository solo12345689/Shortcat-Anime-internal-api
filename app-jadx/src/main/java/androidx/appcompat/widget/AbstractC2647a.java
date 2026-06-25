package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2767k0;
import androidx.core.view.InterfaceC2769l0;
import i.AbstractC4956a;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2647a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final C0427a f25261a;

    /* JADX INFO: renamed from: b */
    protected final Context f25262b;

    /* JADX INFO: renamed from: c */
    protected ActionMenuView f25263c;

    /* JADX INFO: renamed from: d */
    protected C2649c f25264d;

    /* JADX INFO: renamed from: e */
    protected int f25265e;

    /* JADX INFO: renamed from: f */
    protected C2767k0 f25266f;

    /* JADX INFO: renamed from: g */
    private boolean f25267g;

    /* JADX INFO: renamed from: h */
    private boolean f25268h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected class C0427a implements InterfaceC2769l0 {

        /* JADX INFO: renamed from: a */
        private boolean f25269a = false;

        /* JADX INFO: renamed from: b */
        int f25270b;

        protected C0427a() {
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void a(View view) {
            this.f25269a = true;
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            if (this.f25269a) {
                return;
            }
            AbstractC2647a abstractC2647a = AbstractC2647a.this;
            abstractC2647a.f25266f = null;
            AbstractC2647a.super.setVisibility(this.f25270b);
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void c(View view) {
            AbstractC2647a.super.setVisibility(0);
            this.f25269a = false;
        }

        public C0427a d(C2767k0 c2767k0, int i10) {
            AbstractC2647a.this.f25266f = c2767k0;
            this.f25270b = i10;
            return this;
        }
    }

    AbstractC2647a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25261a = new C0427a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC4956a.f47954a, typedValue, true) || typedValue.resourceId == 0) {
            this.f25262b = context;
        } else {
            this.f25262b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C2767k0 f(int i10, long j10) {
        C2767k0 c2767k0 = this.f25266f;
        if (c2767k0 != null) {
            c2767k0.c();
        }
        if (i10 != 0) {
            C2767k0 c2767k0B = AbstractC2747a0.e(this).b(0.0f);
            c2767k0B.e(j10);
            c2767k0B.g(this.f25261a.d(c2767k0B, i10));
            return c2767k0B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2767k0 c2767k0B2 = AbstractC2747a0.e(this).b(1.0f);
        c2767k0B2.e(j10);
        c2767k0B2.g(this.f25261a.d(c2767k0B2, i10));
        return c2767k0B2;
    }

    public int getAnimatedVisibility() {
        return this.f25266f != null ? this.f25261a.f25270b : getVisibility();
    }

    public int getContentHeight() {
        return this.f25265e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f48258a, AbstractC4956a.f47956c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.j.f48303j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C2649c c2649c = this.f25264d;
        if (c2649c != null) {
            c2649c.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f25268h = false;
        }
        if (!this.f25268h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f25268h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f25268h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f25267g = false;
        }
        if (!this.f25267g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f25267g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f25267g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C2767k0 c2767k0 = this.f25266f;
            if (c2767k0 != null) {
                c2767k0.c();
            }
            super.setVisibility(i10);
        }
    }
}
