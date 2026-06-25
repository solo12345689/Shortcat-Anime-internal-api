package I1;

import I1.u;
import Td.AbstractC2163n;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8767a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f8769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f8770b;

        public b(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            this.f8769a = activity;
            this.f8770b = AbstractC2163n.b(new InterfaceC5082a() { // from class: I1.s
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return u.b.b(this.f8766a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewGroup b(b bVar) {
            View viewInflate = View.inflate(bVar.f8769a, f.f8744a, null);
            AbstractC5504s.f(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) viewInflate;
        }

        private final ViewGroup f() {
            return (ViewGroup) this.f8770b.getValue();
        }

        public void c() {
            View rootView = ((ViewGroup) this.f8769a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(f());
            }
        }

        public final Activity d() {
            return this.f8769a;
        }

        public ViewGroup e() {
            return f();
        }

        public void g() {
            ViewParent parent = e().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(e());
            }
        }
    }

    public u(Activity ctx) {
        AbstractC5504s.h(ctx, "ctx");
        b aVar = Build.VERSION.SDK_INT >= 31 ? new a(ctx) : new b(ctx);
        aVar.c();
        this.f8767a = aVar;
    }

    public final View a() {
        return this.f8767a.e();
    }

    public final void b() {
        this.f8767a.g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        AbstractC5504s.h(platformView, "platformView");
        AbstractC5504s.h(ctx, "ctx");
        b bVar = this.f8767a;
        AbstractC5504s.f(bVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        ((a) bVar).j(platformView);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SplashScreenView f8768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            AbstractC5504s.h(activity, "activity");
        }

        @Override // I1.u.b
        public void g() {
            h().remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = d().getTheme();
                AbstractC5504s.g(theme, "getTheme(...)");
                View decorView = d().getWindow().getDecorView();
                AbstractC5504s.g(decorView, "getDecorView(...)");
                x.b(theme, decorView, null, 4, null);
            }
        }

        public final SplashScreenView h() {
            SplashScreenView splashScreenView = this.f8768c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            AbstractC5504s.u("platformView");
            return null;
        }

        @Override // I1.u.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SplashScreenView e() {
            return h();
        }

        public final void j(SplashScreenView splashScreenView) {
            AbstractC5504s.h(splashScreenView, "<set-?>");
            this.f8768c = splashScreenView;
        }

        @Override // I1.u.b
        public void c() {
        }
    }
}
