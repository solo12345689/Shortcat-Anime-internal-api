package Xf;

import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2384v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22009a = AbstractC2383u.a(16);

    /* JADX INFO: renamed from: Xf.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
    }

    public final Object a(Tf.e descriptor, a key) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(key, "key");
        Map map = (Map) this.f22009a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(Tf.e descriptor, a key, InterfaceC5082a defaultValue) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(Tf.e descriptor, a key, Object value) {
        AbstractC5504s.h(descriptor, "descriptor");
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        Map map = this.f22009a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = AbstractC2383u.a(2);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
