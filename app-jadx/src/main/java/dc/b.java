package Dc;

import Pc.h;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f3685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f3686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f3687d;

    static {
        b bVar = new b();
        f3684a = bVar;
        f3685b = new LinkedHashSet();
        f3686c = new ArrayList();
        f3687d = new ArrayList();
        Yc.c.f22903b.a(bVar);
    }

    private b() {
    }

    public final void a(Oc.c listener) {
        AbstractC5504s.h(listener, "listener");
        Set set = f3685b;
        if (set.contains(listener)) {
            return;
        }
        set.add(listener);
        List list = f3686c;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listener.g((h) it.next());
            }
        }
        List list2 = f3687d;
        if (list2.isEmpty()) {
            return;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            listener.c((Bundle) it2.next());
        }
    }

    public final void b(Pc.a notification) {
        AbstractC5504s.h(notification, "notification");
        Iterator it = f3685b.iterator();
        while (it.hasNext()) {
            ((Oc.c) it.next()).f(notification);
        }
    }

    public final void c(Bundle extras) {
        AbstractC5504s.h(extras, "extras");
        Set set = f3685b;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Oc.c) it.next()).c(extras);
            }
        } else {
            List list = f3687d;
            if (list.isEmpty()) {
                list.add(extras);
            }
        }
    }

    public final void d(h response) {
        AbstractC5504s.h(response, "response");
        Set set = f3685b;
        if (set.isEmpty()) {
            f3686c.add(response);
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Oc.c) it.next()).g(response);
        }
    }

    public final void e() {
        Iterator it = f3685b.iterator();
        while (it.hasNext()) {
            ((Oc.c) it.next()).d();
        }
    }

    public final void f(Oc.c listener) {
        AbstractC5504s.h(listener, "listener");
        f3685b.remove(listener);
    }
}
