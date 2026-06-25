package Xa;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.swmansion.rnscreens.S;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f21727a = new f();

    private f() {
    }

    public final S a(View view) {
        AbstractC5504s.h(view, "view");
        while (view != null) {
            if (view instanceof S) {
                return (S) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }

    public final ScrollView b(View view) {
        AbstractC5504s.h(view, "view");
        while (view != null) {
            if (view instanceof ScrollView) {
                return (ScrollView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }
}
