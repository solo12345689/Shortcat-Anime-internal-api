package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.swmansion.rnscreens.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4533k implements androidx.core.view.I, LifecycleEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f44640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f44641e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4533k f44637a = new C4533k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f44638b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakReference f44639c = new WeakReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f44642f = true;

    private C4533k() {
    }

    private final boolean b() {
        return !f44640d || f44639c.get() == null;
    }

    private final View c() {
        return (View) f44639c.get();
    }

    public final void a(androidx.core.view.I listener) {
        AbstractC5504s.h(listener, "listener");
        f44638b.add(listener);
    }

    @Override // androidx.core.view.I
    public L0 d(View v10, L0 insets) {
        AbstractC5504s.h(v10, "v");
        AbstractC5504s.h(insets, "insets");
        L0 l0W = f44642f ? AbstractC2747a0.W(v10, insets) : insets;
        AbstractC5504s.e(l0W);
        Iterator it = f44638b.iterator();
        while (it.hasNext()) {
            l0W = ((androidx.core.view.I) it.next()).d(v10, insets);
            AbstractC5504s.g(l0W, "onApplyWindowInsets(...)");
        }
        return l0W;
    }

    public final boolean e(View view) {
        AbstractC5504s.h(view, "view");
        if (!b()) {
            return false;
        }
        AbstractC2747a0.w0(view, this);
        f44639c = new WeakReference(view);
        f44640d = true;
        return true;
    }

    public final void f(ReactApplicationContext context) {
        AbstractC5504s.h(context, "context");
        if (f44641e) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        f44641e = true;
        context.addLifecycleEventListener(this);
    }

    public final void g(androidx.core.view.I listener) {
        AbstractC5504s.h(listener, "listener");
        f44638b.remove(listener);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View viewC = c();
        if (f44640d && viewC != null) {
            AbstractC2747a0.w0(viewC, null);
            f44640d = false;
            f44639c.clear();
        }
        f44641e = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
