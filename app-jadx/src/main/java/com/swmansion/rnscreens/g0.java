package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.C4546y;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: b */
    private static boolean f44487b;

    /* JADX INFO: renamed from: c */
    private static boolean f44488c;

    /* JADX INFO: renamed from: d */
    private static boolean f44489d;

    /* JADX INFO: renamed from: a */
    public static final g0 f44486a = new g0();

    /* JADX INFO: renamed from: e */
    private static b f44490e = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44491a;

        static {
            int[] iArr = new int[C4546y.g.values().length];
            try {
                iArr[C4546y.g.f44814a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4546y.g.f44815b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4546y.g.f44816c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C4546y.g.f44817d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C4546y.g.f44818e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44491a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements androidx.core.view.I {
        b() {
        }

        @Override // androidx.core.view.I
        public L0 d(View v10, L0 insets) {
            AbstractC5504s.h(v10, "v");
            AbstractC5504s.h(insets, "insets");
            L0 l0W = AbstractC2747a0.W(v10, insets);
            AbstractC5504s.g(l0W, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                L0 l0S = l0W.s(l0W.k(), 0, l0W.l(), l0W.j());
                AbstractC5504s.g(l0S, "replaceSystemWindowInsets(...)");
                return l0S;
            }
            A1.b bVarF = l0W.f(L0.p.h());
            AbstractC5504s.g(bVarF, "getInsets(...)");
            L0 l0A = new L0.a().b(L0.p.h(), A1.b.c(bVarF.f104a, 0, bVarF.f106c, bVarF.f107d)).a();
            AbstractC5504s.g(l0A, "build(...)");
            return l0A;
        }
    }

    private g0() {
    }

    private final boolean f(C4546y c4546y, C4546y.g gVar) {
        int i10 = a.f44491a[gVar.ordinal()];
        if (i10 == 1) {
            return c4546y.getScreenOrientation() != null;
        }
        if (i10 == 2) {
            return c4546y.getStatusBarStyle() != null;
        }
        if (i10 == 3) {
            return c4546y.r() != null;
        }
        if (i10 == 4) {
            return c4546y.q() != null;
        }
        if (i10 == 5) {
            return c4546y.p() != null;
        }
        throw new Td.r();
    }

    private final C4546y g(C4546y c4546y, C4546y.g gVar) {
        G fragmentWrapper;
        if (c4546y == null || (fragmentWrapper = c4546y.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            C4546y topScreen = ((A) it.next()).getTopScreen();
            g0 g0Var = f44486a;
            C4546y c4546yG = g0Var.g(topScreen, gVar);
            if (c4546yG != null) {
                return c4546yG;
            }
            if (topScreen != null && g0Var.f(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final C4546y h(C4546y c4546y, C4546y.g gVar) {
        for (ViewParent container = c4546y.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C4546y) {
                C4546y c4546y2 = (C4546y) container;
                if (f(c4546y2, gVar)) {
                    return c4546y2;
                }
            }
        }
        return null;
    }

    private final C4546y i(C4546y c4546y, C4546y.g gVar) {
        C4546y c4546yG = g(c4546y, gVar);
        return c4546yG != null ? c4546yG : f(c4546y, gVar) ? c4546y : h(c4546y, gVar);
    }

    public static final void j(boolean z10, l1 l1Var) {
        if (z10) {
            l1Var.b(L0.p.h());
        } else {
            l1Var.g(L0.p.h());
        }
    }

    public static final void n(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        new l1(activity.getWindow(), decorView).e(AbstractC5504s.c(str, "dark"));
    }

    public final void c() {
        f44489d = true;
    }

    public final void d() {
        f44487b = true;
    }

    public final void e() {
        f44488c = true;
    }

    public final void k(C4546y screen, Activity activity) {
        Boolean boolR;
        AbstractC5504s.h(screen, "screen");
        if (activity == null) {
            return;
        }
        C4546y c4546yI = i(screen, C4546y.g.f44816c);
        final boolean zBooleanValue = (c4546yI == null || (boolR = c4546yI.r()) == null) ? false : boolR.booleanValue();
        Window window = activity.getWindow();
        final l1 l1Var = new l1(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.j(zBooleanValue, l1Var);
            }
        });
    }

    public final void l(C4546y screen, Activity activity) {
        Boolean boolP;
        AbstractC5504s.h(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C4546y c4546yI = i(screen, C4546y.g.f44818e);
        if (!((c4546yI == null || (boolP = c4546yI.p()) == null) ? false : boolP.booleanValue())) {
            new l1(window, window.getDecorView()).g(L0.p.g());
            return;
        }
        l1 l1Var = new l1(window, window.getDecorView());
        l1Var.b(L0.p.g());
        l1Var.f(2);
    }

    public final void m(C4546y screen, Activity activity) {
        Integer screenOrientation;
        AbstractC5504s.h(screen, "screen");
        if (activity == null) {
            return;
        }
        C4546y c4546yI = i(screen, C4546y.g.f44814a);
        activity.setRequestedOrientation((c4546yI == null || (screenOrientation = c4546yI.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void o(C4546y screen, final Activity activity, ReactContext reactContext) {
        final String statusBarStyle;
        AbstractC5504s.h(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C4546y c4546yI = i(screen, C4546y.g.f44815b);
        if (c4546yI == null || (statusBarStyle = c4546yI.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.n(activity, statusBarStyle);
            }
        });
    }

    public final void p(C4546y screen, Activity activity, ReactContext reactContext) {
        AbstractC5504s.h(screen, "screen");
        if (f44487b) {
            m(screen, activity);
        }
        if (f44488c) {
            o(screen, activity, reactContext);
            k(screen, activity);
        }
        if (f44489d) {
            l(screen, activity);
        }
    }
}
