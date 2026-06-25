package La;

import Ba.i;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.react.uimanager.C3284b0;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f11371n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f11372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f11375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Da.a f11379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f11382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Ca.f f11383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VelocityTracker f11384m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f11372a = reactContext;
        this.f11379h = new Da.c();
        this.f11381j = true;
        this.f11382k = new Rect();
        this.f11383l = new Ca.f();
    }

    private final void B() {
        this.f11383l.n();
        F();
    }

    private final void C(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f11384m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        this.f11374c = motionEvent.getX();
        this.f11375d = motionEvent.getY();
        i.a(this, this.f11382k);
        this.f11376e = this.f11382k.top;
    }

    private final void D(MotionEvent motionEvent) {
        i.a(this, this.f11382k);
        int i10 = this.f11382k.top - this.f11376e;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, i10);
        VelocityTracker velocityTracker = this.f11384m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        float x10 = motionEventObtain.getX() - this.f11374c;
        float y10 = motionEventObtain.getY() - this.f11375d;
        boolean z10 = false;
        if (!this.f11373b) {
            this.f11373b = Math.abs(y10) > Math.abs(x10) && Math.abs(y10) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
        }
        if (this.f11373b) {
            if (this.f11383l.t()) {
                if (this.f11377f == 0) {
                    this.f11377f = this.f11383l.q();
                }
                int iA = this.f11379h.a(AbstractC5466a.d(y10), getWindowHeight() - ((int) motionEvent.getRawY()), this.f11383l.q(), this.f11378g);
                if (iA != 0) {
                    this.f11383l.r(iA);
                }
            } else if (!this.f11383l.u()) {
                L0 l0F = AbstractC2747a0.F(this);
                if (l0F != null && l0F.r(L0.p.d())) {
                    z10 = true;
                }
                if (G(y10, z10)) {
                    Ca.f.y(this.f11383l, this, null, 2, null);
                }
            }
            this.f11375d = motionEvent.getY();
            this.f11374c = motionEvent.getX();
            this.f11376e = this.f11382k.top;
        }
    }

    private final void E(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f11384m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.f11384m;
        if (velocityTracker2 != null) {
            velocityTracker2.computeCurrentVelocity(500);
        }
        VelocityTracker velocityTracker3 = this.f11384m;
        this.f11383l.l((this.f11383l.t() && this.f11377f == this.f11383l.q()) ? null : velocityTracker3 != null ? Float.valueOf(velocityTracker3.getYVelocity()) : null);
        F();
    }

    private final void F() {
        this.f11373b = false;
        this.f11374c = 0.0f;
        this.f11375d = 0.0f;
        this.f11376e = 0;
        this.f11377f = 0;
        this.f11382k.setEmpty();
        VelocityTracker velocityTracker = this.f11384m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f11384m = null;
    }

    private final boolean G(float f10, boolean z10) {
        return f10 < 0.0f ? !z10 && this.f11380i : f10 > 0.0f && z10 && this.f11381j;
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        if (Build.VERSION.SDK_INT >= 30) {
            Activity currentActivity = this.f11372a.getCurrentActivity();
            WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return bounds.height();
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f11384m == null) {
            this.f11384m = VelocityTracker.obtain();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            D(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            E(motionEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            B();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setInterpolator(String interpolator) {
        AbstractC5504s.h(interpolator, "interpolator");
        Da.a cVar = (Da.a) g.a().get(interpolator);
        if (cVar == null) {
            cVar = new Da.c();
        }
        this.f11379h = cVar;
    }

    public final void setOffset(double d10) {
        this.f11378g = (int) Ba.d.b((float) d10);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z10) {
        this.f11381j = z10;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z10) {
        this.f11380i = z10;
    }
}
