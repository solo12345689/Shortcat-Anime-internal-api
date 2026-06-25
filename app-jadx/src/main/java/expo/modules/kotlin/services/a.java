package expo.modules.kotlin.services;

import Ub.d;
import Ud.AbstractC2279u;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import mc.InterfaceC5657a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f46185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f46186b;

    public a(WeakReference appContextHolder) {
        AbstractC5504s.h(appContextHolder, "appContextHolder");
        this.f46185a = appContextHolder;
        this.f46186b = new LinkedHashMap();
    }

    private final List b(Service service) {
        Class<?> cls = service.getClass();
        Annotation[] annotationsByType = cls.getAnnotationsByType(InterfaceC5657a.class);
        AbstractC5504s.g(annotationsByType, "getAnnotationsByType(...)");
        ArrayList arrayList = new ArrayList(annotationsByType.length);
        for (Annotation annotation : annotationsByType) {
            arrayList.add(((InterfaceC5657a) annotation).clazz());
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? AbstractC2279u.e(cls) : arrayList;
    }

    public final Map a() {
        return this.f46186b;
    }

    public final a c(Class serviceClass) {
        AbstractC5504s.h(serviceClass, "serviceClass");
        Object obj = this.f46185a.get();
        if (obj == null) {
            throw new IllegalArgumentException("Cannot register a service to an invalid app context.");
        }
        Service serviceA = Service.INSTANCE.a(serviceClass, (d) obj);
        Iterator it = b(serviceA).iterator();
        while (it.hasNext()) {
            this.f46186b.put((Class) it.next(), serviceA);
        }
        return this;
    }

    public final a d(List serviceClasses) {
        AbstractC5504s.h(serviceClasses, "serviceClasses");
        Iterator it = serviceClasses.iterator();
        while (it.hasNext()) {
            c((Class) it.next());
        }
        return this;
    }
}
