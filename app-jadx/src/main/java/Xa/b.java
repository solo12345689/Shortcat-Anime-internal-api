package Xa;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import com.facebook.react.W;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f21725a = new b();

    private b() {
    }

    private final K b(W w10) {
        boolean z10;
        Context context = w10.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC2842v;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC2842v abstractActivityC2842v = (AbstractActivityC2842v) context;
        if (abstractActivityC2842v.C().C0().isEmpty()) {
            return abstractActivityC2842v.C();
        }
        try {
            return K.o0(w10).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return abstractActivityC2842v.C();
        }
    }

    public final K a(ViewGroup view) {
        boolean z10;
        AbstractC5504s.h(view, "view");
        ViewParent viewParent = view;
        while (true) {
            z10 = viewParent instanceof W;
            if (z10 || (viewParent instanceof Va.a) || viewParent.getParent() == null) {
                break;
            }
            ViewParent parent = viewParent.getParent();
            AbstractC5504s.g(parent, "getParent(...)");
            viewParent = parent;
        }
        if (!(viewParent instanceof Va.a)) {
            if (z10) {
                return b((W) viewParent);
            }
            throw new IllegalStateException(("[RNScreens] Expected parent to be a ReactRootView, instead found: " + viewParent.getClass().getName()).toString());
        }
        AbstractComponentCallbacksC2838q associatedFragment = ((Va.a) viewParent).getAssociatedFragment();
        if (associatedFragment != null) {
            return associatedFragment.getChildFragmentManager();
        }
        throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + viewParent + " returned nullish fragment").toString());
    }
}
