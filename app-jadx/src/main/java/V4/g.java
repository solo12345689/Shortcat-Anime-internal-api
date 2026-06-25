package V4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19736a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19737b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f19738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f19739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f19740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f19741d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f19739b == null) {
                this.f19739b = new ArrayList();
            }
            this.f19739b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f19739b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f19739b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f19741d = this;
            this.f19740c = this;
            this.f19738a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f19736a;
        aVar.f19741d = aVar2;
        aVar.f19740c = aVar2.f19740c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f19736a;
        aVar.f19741d = aVar2.f19741d;
        aVar.f19740c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f19741d;
        aVar2.f19740c = aVar.f19740c;
        aVar.f19740c.f19741d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f19740c.f19741d = aVar;
        aVar.f19741d.f19740c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f19737b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f19737b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f19737b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f19737b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f19736a.f19741d; !aVar.equals(this.f19736a); aVar = aVar.f19741d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f19737b.remove(aVar.f19738a);
            ((l) aVar.f19738a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f19736a.f19740c;
        boolean z10 = false;
        while (!aVar.equals(this.f19736a)) {
            sb2.append('{');
            sb2.append(aVar.f19738a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f19740c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
