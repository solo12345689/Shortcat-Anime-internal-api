package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f49183h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f49184a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f49185b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5288a f49186c = new C5288a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5176b f49187d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5176b f49188e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C5176b f49189f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A1 f49190g = null;

    static {
        HashMap map = new HashMap();
        f49183h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put(Constants.LONG, Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean j(Object obj, Class cls) {
        Class cls2 = (Class) f49183h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void a(List list) {
        if (list != null) {
            this.f49185b.addAll(list);
        }
    }

    public void b() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49186c.a();
        try {
            Iterator it = this.f49184a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object c(String str) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49186c.a();
        try {
            Object obj = this.f49184a.get(str);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object d(String str, Class cls) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49186c.a();
        try {
            Object obj = this.f49184a.get(str);
            if (cls.isInstance(obj)) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return obj;
                }
            } else {
                if (!j(obj, cls)) {
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                    }
                    return null;
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            }
            return obj;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public List e() {
        return new ArrayList(this.f49185b);
    }

    public A1 f() {
        return this.f49190g;
    }

    public C5176b g() {
        return this.f49187d;
    }

    public C5176b h() {
        return this.f49189f;
    }

    public C5176b i() {
        return this.f49188e;
    }

    public void k(String str, Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49186c.a();
        try {
            this.f49184a.put(str, obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void l(A1 a12) {
        this.f49190g = a12;
    }

    public void m(C5176b c5176b) {
        this.f49187d = c5176b;
    }

    public void n(C5176b c5176b) {
        this.f49189f = c5176b;
    }

    public void o(C5176b c5176b) {
        this.f49188e = c5176b;
    }
}
