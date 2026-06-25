package ib;

import Ud.AbstractC2279u;
import android.app.Application;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import sb.InterfaceC6447b;

/* JADX INFO: renamed from: ib.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5052a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5052a f48767a = new C5052a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List f48768b;

    private C5052a() {
    }

    private final List a(Application application) {
        List list = f48768b;
        if (list != null) {
            return list;
        }
        List listA = C5054c.f48769b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listE = ((sb.g) it.next()).e(application);
            AbstractC5504s.g(listE, "createApplicationLifecycleListeners(...)");
            AbstractC2279u.D(arrayList, listE);
        }
        f48768b = arrayList;
        return arrayList;
    }

    public static final void b(Application application) {
        AbstractC5504s.h(application, "application");
        Iterator it = f48767a.a(application).iterator();
        while (it.hasNext()) {
            ((InterfaceC6447b) it.next()).a(application);
        }
    }

    public static final void c(Application application, Configuration newConfig) {
        AbstractC5504s.h(application, "application");
        AbstractC5504s.h(newConfig, "newConfig");
        Iterator it = f48767a.a(application).iterator();
        while (it.hasNext()) {
            ((InterfaceC6447b) it.next()).onConfigurationChanged(newConfig);
        }
    }
}
