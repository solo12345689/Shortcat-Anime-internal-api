package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import x1.AbstractC7046c;

/* JADX INFO: renamed from: androidx.core.view.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2757f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WindowInsets f29045a = L0.f28953b.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f29046b = false;

    /* JADX INFO: renamed from: androidx.core.view.f0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    public static /* synthetic */ WindowInsets a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f29045a;
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(AbstractC7046c.f63619M);
        Object tag2 = view.getTag(AbstractC7046c.f63626T);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = {f29045a};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.e0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return AbstractC2757f0.a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(AbstractC7046c.f63618L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f29045a;
    }

    public static boolean c(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }
}
