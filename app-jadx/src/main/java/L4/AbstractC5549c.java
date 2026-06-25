package l4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC5445a;
import kotlin.jvm.internal.AbstractC5504s;
import n4.C5745u;

/* JADX INFO: renamed from: l4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5549c implements InterfaceC5445a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m4.h f52535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f52537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f52538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f52539e;

    /* JADX INFO: renamed from: l4.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void b(List list);

        void c(List list);
    }

    public AbstractC5549c(m4.h tracker) {
        AbstractC5504s.h(tracker, "tracker");
        this.f52535a = tracker;
        this.f52536b = new ArrayList();
        this.f52537c = new ArrayList();
    }

    private final void h(a aVar, Object obj) {
        if (this.f52536b.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.c(this.f52536b);
        } else {
            aVar.b(this.f52536b);
        }
    }

    @Override // k4.InterfaceC5445a
    public void a(Object obj) {
        this.f52538d = obj;
        h(this.f52539e, obj);
    }

    public abstract boolean b(C5745u c5745u);

    public abstract boolean c(Object obj);

    public final boolean d(String workSpecId) {
        AbstractC5504s.h(workSpecId, "workSpecId");
        Object obj = this.f52538d;
        return obj != null && c(obj) && this.f52537c.contains(workSpecId);
    }

    public final void e(Iterable workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
        this.f52536b.clear();
        this.f52537c.clear();
        List list = this.f52536b;
        for (Object obj : workSpecs) {
            if (b((C5745u) obj)) {
                list.add(obj);
            }
        }
        List list2 = this.f52536b;
        List list3 = this.f52537c;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((C5745u) it.next()).f53943a);
        }
        if (this.f52536b.isEmpty()) {
            this.f52535a.f(this);
        } else {
            this.f52535a.c(this);
        }
        h(this.f52539e, this.f52538d);
    }

    public final void f() {
        if (this.f52536b.isEmpty()) {
            return;
        }
        this.f52536b.clear();
        this.f52535a.f(this);
    }

    public final void g(a aVar) {
        if (this.f52539e != aVar) {
            this.f52539e = aVar;
            h(aVar, this.f52538d);
        }
    }
}
