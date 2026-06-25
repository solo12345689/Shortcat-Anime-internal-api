package db;

import Sa.r;
import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.C3092a;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.L;
import com.swmansion.rnscreens.C4539q;
import com.swmansion.rnscreens.X;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: db.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4579e extends CoordinatorLayout implements L {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Animation.AnimationListener f45088A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final X f45089y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final L f45090z;

    /* JADX INFO: renamed from: db.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC5504s.h(animation, "animation");
            C4579e.this.getFragment$react_native_screens_release().H();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC5504s.h(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC5504s.h(animation, "animation");
            C4579e.this.getFragment$react_native_screens_release().I();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4579e(Context context, X fragment, L pointerEventsImpl) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(pointerEventsImpl, "pointerEventsImpl");
        this.f45089y = fragment;
        this.f45090z = pointerEventsImpl;
        this.f45088A = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    public final X getFragment$react_native_screens_release() {
        return this.f45089y;
    }

    @Override // com.facebook.react.uimanager.L
    public C getPointerEvents() {
        return this.f45090z.getPointerEvents();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        AbstractC5504s.g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (r.d(this.f45089y.k())) {
            this.f45089y.k().u(z10);
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        AbstractC5504s.h(animation, "animation");
        C3092a c3092a = new C3092a(this.f45089y);
        c3092a.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.f45089y.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(c3092a);
            animationSet.setAnimationListener(this.f45088A);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(c3092a);
        animationSet2.setAnimationListener(this.f45088A);
        super.startAnimation(animationSet2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4579e(Context context, X fragment) {
        this(context, fragment, new C4539q());
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fragment, "fragment");
    }
}
