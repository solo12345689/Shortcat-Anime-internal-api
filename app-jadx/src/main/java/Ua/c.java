package Ua;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final AbstractComponentCallbacksC2838q a(View view) {
        AbstractC5504s.h(view, "<this>");
        try {
            return f0.a(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final ViewGroup b(View view) {
        AbstractC5504s.h(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View c(View view) {
        AbstractC5504s.h(view, "<this>");
        ViewGroup viewGroupB = b(view);
        if (viewGroupB != null) {
            viewGroupB.endViewTransition(view);
            viewGroupB.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        return view;
    }
}
