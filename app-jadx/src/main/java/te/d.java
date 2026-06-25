package te;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes5.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f60920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f60921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f60922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f60923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f60924e;

    public d(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f60920a = cls;
        this.f60921b = map;
        this.f60922c = lazy;
        this.f60923d = lazy2;
        this.f60924e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f60920a, this.f60921b, this.f60922c, this.f60923d, this.f60924e, obj, method, objArr);
    }
}
