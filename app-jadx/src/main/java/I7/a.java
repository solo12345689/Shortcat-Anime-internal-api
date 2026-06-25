package I7;

import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC3247l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8855a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f8856b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f8857c = new HashMap();

    private a() {
    }

    public static final View a(View root, String nativeId) {
        AbstractC5504s.h(root, "root");
        AbstractC5504s.h(nativeId, "nativeId");
        if (AbstractC5504s.c(f8855a.b(root), nativeId)) {
            return root;
        }
        if (!(root instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) root;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            AbstractC5504s.g(childAt, "getChildAt(...)");
            View viewA = a(childAt, nativeId);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    private final String b(View view) {
        Object tag = view.getTag(AbstractC3247l.f36906G);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static final void c(View view) {
        AbstractC5504s.h(view, "view");
        String strB = f8855a.b(view);
        if (strB == null) {
            return;
        }
        Iterator it = f8856b.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
        for (Map.Entry entry : f8857c.entrySet()) {
            b.a(entry.getKey());
            if (((Set) entry.getValue()).contains(strB)) {
                throw null;
            }
        }
    }
}
