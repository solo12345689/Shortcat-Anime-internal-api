package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.core.view.l1;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements I {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f42612a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f42613b;

        a(c cVar, d dVar) {
            this.f42612a = cVar;
            this.f42613b = dVar;
        }

        @Override // androidx.core.view.I
        public L0 d(View view, L0 l02) {
            return this.f42612a.a(view, l02, new d(this.f42613b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        L0 a(View view, L0 l02, d dVar);
    }

    public static void b(View view, c cVar) {
        AbstractC2747a0.w0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) AbstractC7194b.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static boolean g(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                p.k(view, z10);
            }
        });
    }

    public static void k(View view, boolean z10) {
        l1 l1VarJ;
        if (!z10 || (l1VarJ = AbstractC2747a0.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            l1VarJ.g(L0.p.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int f42614a;

        /* JADX INFO: renamed from: b */
        public int f42615b;

        /* JADX INFO: renamed from: c */
        public int f42616c;

        /* JADX INFO: renamed from: d */
        public int f42617d;

        public d(int i10, int i11, int i12, int i13) {
            this.f42614a = i10;
            this.f42615b = i11;
            this.f42616c = i12;
            this.f42617d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f42614a, this.f42615b, this.f42616c, this.f42617d);
        }

        public d(d dVar) {
            this.f42614a = dVar.f42614a;
            this.f42615b = dVar.f42615b;
            this.f42616c = dVar.f42616c;
            this.f42617d = dVar.f42617d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
