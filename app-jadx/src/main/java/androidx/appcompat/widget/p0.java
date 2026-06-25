package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2753d0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static p0 f25474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static p0 f25475l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f25476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f25477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f25479d = new Runnable() { // from class: androidx.appcompat.widget.n0
        @Override // java.lang.Runnable
        public final void run() {
            this.f25469a.h(false);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f25480e = new Runnable() { // from class: androidx.appcompat.widget.o0
        @Override // java.lang.Runnable
        public final void run() {
            this.f25470a.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q0 f25483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25485j;

    private p0(View view, CharSequence charSequence) {
        this.f25476a = view;
        this.f25477b = charSequence;
        this.f25478c = AbstractC2753d0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f25476a.removeCallbacks(this.f25479d);
    }

    private void c() {
        this.f25485j = true;
    }

    private void e() {
        this.f25476a.postDelayed(this.f25479d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(p0 p0Var) {
        p0 p0Var2 = f25474k;
        if (p0Var2 != null) {
            p0Var2.b();
        }
        f25474k = p0Var;
        if (p0Var != null) {
            p0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        p0 p0Var = f25474k;
        if (p0Var != null && p0Var.f25476a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = f25475l;
        if (p0Var2 != null && p0Var2.f25476a == view) {
            p0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f25485j && Math.abs(x10 - this.f25481f) <= this.f25478c && Math.abs(y10 - this.f25482g) <= this.f25478c) {
            return false;
        }
        this.f25481f = x10;
        this.f25482g = y10;
        this.f25485j = false;
        return true;
    }

    void d() {
        if (f25475l == this) {
            f25475l = null;
            q0 q0Var = this.f25483h;
            if (q0Var != null) {
                q0Var.c();
                this.f25483h = null;
                c();
                this.f25476a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f25474k == this) {
            f(null);
        }
        this.f25476a.removeCallbacks(this.f25480e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f25476a.isAttachedToWindow()) {
            f(null);
            p0 p0Var = f25475l;
            if (p0Var != null) {
                p0Var.d();
            }
            f25475l = this;
            this.f25484i = z10;
            q0 q0Var = new q0(this.f25476a.getContext());
            this.f25483h = q0Var;
            q0Var.e(this.f25476a, this.f25481f, this.f25482g, this.f25484i, this.f25477b);
            this.f25476a.addOnAttachStateChangeListener(this);
            if (this.f25484i) {
                j11 = 2500;
            } else {
                if ((AbstractC2747a0.K(this.f25476a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f25476a.removeCallbacks(this.f25480e);
            this.f25476a.postDelayed(this.f25480e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f25483h != null && this.f25484i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f25476a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f25476a.isEnabled() && this.f25483h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f25481f = view.getWidth() / 2;
        this.f25482g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
