package I1;

import I1.g;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import j.AbstractC5323a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8745b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8746a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Activity activity) {
            AbstractC5504s.h(activity, "<this>");
            g gVar = new g(activity, null);
            gVar.b();
            return gVar;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f8747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f8749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f8750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Drawable f8751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f8753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e f8754h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private u f8755i;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f8757b;

            a(u uVar) {
                this.f8757b = uVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                AbstractC5504s.h(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!b.this.h().a()) {
                        b.this.d(this.f8757b);
                    } else {
                        b.this.f8755i = this.f8757b;
                    }
                }
            }
        }

        public b(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            this.f8747a = activity;
            this.f8753g = new d() { // from class: I1.h
                @Override // I1.g.d
                public final boolean a() {
                    return g.b.l();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(u uVar, e eVar) {
            uVar.a().bringToFront();
            eVar.a(uVar);
        }

        private final void f(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(I1.e.f8743a);
            if (this.f8752f) {
                Drawable drawableB = AbstractC5323a.b(imageView.getContext(), I1.d.f8742a);
                dimension = imageView.getResources().getDimension(I1.c.f8741b) * 0.6666667f;
                if (drawableB != null) {
                    imageView.setBackground(new I1.a(drawableB, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(I1.c.f8740a) * 0.6666667f;
            }
            imageView.setImageDrawable(new I1.a(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l() {
            return false;
        }

        public final void d(final u splashScreenViewProvider) {
            AbstractC5504s.h(splashScreenViewProvider, "splashScreenViewProvider");
            final e eVar = this.f8754h;
            if (eVar == null) {
                return;
            }
            this.f8754h = null;
            splashScreenViewProvider.a().postOnAnimation(new Runnable() { // from class: I1.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.e(splashScreenViewProvider, eVar);
                }
            });
        }

        public final Activity g() {
            return this.f8747a;
        }

        public final d h() {
            return this.f8753g;
        }

        public void i() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f8747a.getTheme();
            if (theme.resolveAttribute(I1.b.f8739d, typedValue, true)) {
                this.f8749c = Integer.valueOf(typedValue.resourceId);
                this.f8750d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(I1.b.f8738c, typedValue, true)) {
                this.f8751e = AbstractC5323a.b(this.f8747a, typedValue.resourceId);
            }
            if (theme.resolveAttribute(I1.b.f8737b, typedValue, true)) {
                this.f8752f = typedValue.resourceId == I1.c.f8741b;
            }
            AbstractC5504s.e(theme);
            k(theme, typedValue);
        }

        public void j(e exitAnimationListener) {
            AbstractC5504s.h(exitAnimationListener, "exitAnimationListener");
            this.f8754h = exitAnimationListener;
            u uVar = new u(this.f8747a);
            Integer num = this.f8749c;
            Integer num2 = this.f8750d;
            View viewA = uVar.a();
            if (num != null && num.intValue() != 0) {
                viewA.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                viewA.setBackgroundColor(num2.intValue());
            } else {
                viewA.setBackground(this.f8747a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f8751e;
            if (drawable != null) {
                f(viewA, drawable);
            }
            viewA.addOnLayoutChangeListener(new a(uVar));
        }

        protected final void k(Resources.Theme currentTheme, TypedValue typedValue) {
            AbstractC5504s.h(currentTheme, "currentTheme");
            AbstractC5504s.h(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(I1.b.f8736a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f8748b = i10;
                if (i10 != 0) {
                    this.f8747a.setTheme(i10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a(u uVar);
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f8746a.i();
    }

    public final void c(e listener) {
        AbstractC5504s.h(listener, "listener");
        this.f8746a.j(listener);
    }

    private g(Activity activity) {
        this.f8746a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f8758j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f8759k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            AbstractC5504s.h(activity, "activity");
            this.f8758j = true;
            this.f8759k = new a(activity);
        }

        private final void n() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = g().getTheme();
            Window window = g().getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            AbstractC5504s.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            AbstractC5504s.e(theme);
            x.a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.f8758j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(c cVar, e eVar, SplashScreenView splashScreenView) {
            AbstractC5504s.h(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                cVar.n();
            }
            eVar.a(new u(splashScreenView, cVar.g()));
        }

        @Override // I1.g.b
        public void i() {
            Resources.Theme theme = g().getTheme();
            AbstractC5504s.g(theme, "getTheme(...)");
            k(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = g().getWindow().getDecorView();
                AbstractC5504s.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f8759k);
            }
        }

        @Override // I1.g.b
        public void j(final e exitAnimationListener) {
            AbstractC5504s.h(exitAnimationListener, "exitAnimationListener");
            g().getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: I1.p
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    g.c.q(this.f8764a, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final boolean o(SplashScreenView child) {
            AbstractC5504s.h(child, "child");
            WindowInsets windowInsetsBuild = j.a().build();
            AbstractC5504s.g(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void p(boolean z10) {
            this.f8758j = z10;
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f8761b;

            a(Activity activity) {
                this.f8761b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (q.a(view2)) {
                    c cVar = c.this;
                    cVar.p(cVar.o(r.a(view2)));
                    View decorView = this.f8761b.getWindow().getDecorView();
                    AbstractC5504s.f(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
