package Sa;

import Sa.g;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import com.facebook.react.uimanager.C3284b0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C4546y;
import com.swmansion.rnscreens.X;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f16027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f16028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BottomSheetBehavior.f f16030d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends BottomSheetBehavior.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4546y f16031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f16032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f16033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f16034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f16035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f16036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ValueAnimator f16037g;

        public a(C4546y screen, View viewToAnimate, float f10) {
            AbstractC5504s.h(screen, "screen");
            AbstractC5504s.h(viewToAnimate, "viewToAnimate");
            this.f16031a = screen;
            this.f16032b = viewToAnimate;
            this.f16033c = f10;
            this.f16034d = f(screen.getSheetLargestUndimmedDetentIndex());
            float f11 = f(AbstractC5874j.m(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().d() - 1));
            this.f16035e = f11;
            this.f16036f = f11 - this.f16034d;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Sa.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    g.a.e(this.f16026a, valueAnimator);
                }
            });
            this.f16037g = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, ValueAnimator it) {
            AbstractC5504s.h(it, "it");
            View view = aVar.f16032b;
            Object animatedValue = it.getAnimatedValue();
            AbstractC5504s.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float f(int i10) {
            int iD = this.f16031a.getSheetDetents().d();
            if (iD == 1) {
                return (i10 == -1 || i10 != 0) ? -1.0f : 1.0f;
            }
            if (iD == 2) {
                if (i10 == -1) {
                    return -1.0f;
                }
                if (i10 != 0) {
                    return i10 != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (iD != 3 || i10 == -1) {
                return -1.0f;
            }
            if (i10 == 0) {
                return 0.0f;
            }
            if (i10 != 1) {
                return i10 != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<C4546y> sheetBehavior = this.f16031a.getSheetBehavior();
            AbstractC5504s.e(sheetBehavior);
            return sheetBehavior.o0();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            float f11 = this.f16034d;
            if (f11 >= f10 || f10 >= this.f16035e) {
                return;
            }
            this.f16037g.setCurrentFraction((f10 - f11) / this.f16036f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC5504s.h(bottomSheet, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f16034d = f(this.f16031a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(AbstractC5874j.m(this.f16031a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f16031a.getSheetDetents().d() - 1));
                this.f16035e = f10;
                this.f16036f = f10 - this.f16034d;
            }
        }
    }

    public g(C3284b0 reactContext, C4546y screen) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(screen, "screen");
        this.f16027a = reactContext;
        this.f16028b = b(screen);
        this.f16029c = 0.3f;
    }

    private final d b(final C4546y c4546y) {
        d dVar = new d(this.f16027a, this.f16029c);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dVar.setOnClickListener(new View.OnClickListener() { // from class: Sa.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.c(c4546y, view);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4546y c4546y, View view) {
        if (c4546y.getSheetClosesOnTouchOutside()) {
            AbstractComponentCallbacksC2838q fragment = c4546y.getFragment();
            AbstractC5504s.f(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((X) fragment).Z();
        }
    }

    private final BottomSheetBehavior.f i(C4546y c4546y, boolean z10) {
        if (this.f16030d == null || z10) {
            this.f16030d = new a(c4546y, this.f16028b, this.f16029c);
        }
        BottomSheetBehavior.f fVar = this.f16030d;
        AbstractC5504s.e(fVar);
        return fVar;
    }

    public final d d() {
        return this.f16028b;
    }

    public final float e() {
        return this.f16029c;
    }

    public final void f(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior.f fVar = this.f16030d;
        if (fVar == null || bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.D0(fVar);
    }

    public final void g(C4546y screen, BottomSheetBehavior behavior) {
        AbstractC5504s.h(screen, "screen");
        AbstractC5504s.h(behavior, "behavior");
        behavior.Y(i(screen, true));
    }

    public final void h(C4546y screen, ViewGroup root) {
        AbstractC5504s.h(screen, "screen");
        AbstractC5504s.h(root, "root");
        root.addView(this.f16028b, 0);
        if (j(screen, screen.getSheetInitialDetentIndex())) {
            this.f16028b.setAlpha(this.f16029c);
        } else {
            this.f16028b.setAlpha(0.0f);
        }
    }

    public final boolean j(C4546y screen, int i10) {
        AbstractC5504s.h(screen, "screen");
        return i10 > screen.getSheetLargestUndimmedDetentIndex();
    }
}
