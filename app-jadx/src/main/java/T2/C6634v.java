package t2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import q2.C6105t;

/* JADX INFO: renamed from: t2.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6634v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6623j f60639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6631s f60640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f60641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f60642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f60643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f60644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f60645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f60646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f60647i;

    /* JADX INFO: renamed from: t2.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: renamed from: t2.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(Object obj, C6105t c6105t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2.v$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f60648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C6105t.b f60649b = new C6105t.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f60650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f60651d;

        public c(Object obj) {
            this.f60648a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f60651d) {
                return;
            }
            if (i10 != -1) {
                this.f60649b.a(i10);
            }
            this.f60650c = true;
            aVar.invoke(this.f60648a);
        }

        public void b(b bVar) {
            if (this.f60651d || !this.f60650c) {
                return;
            }
            C6105t c6105tE = this.f60649b.e();
            this.f60649b = new C6105t.b();
            this.f60650c = false;
            bVar.a(this.f60648a, c6105tE);
        }

        public void c(b bVar) {
            this.f60651d = true;
            if (this.f60650c) {
                this.f60650c = false;
                bVar.a(this.f60648a, this.f60649b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f60648a.equals(((c) obj).f60648a);
        }

        public int hashCode() {
            return this.f60648a.hashCode();
        }
    }

    public C6634v(Looper looper, InterfaceC6623j interfaceC6623j, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC6623j, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f60642d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f60641c);
            if (this.f60640b.c(1)) {
                break;
            }
        }
        return true;
    }

    private void l() {
        if (this.f60647i) {
            AbstractC6614a.g(Thread.currentThread() == this.f60640b.g().getThread());
        }
    }

    public void c(Object obj) {
        AbstractC6614a.e(obj);
        synchronized (this.f60645g) {
            try {
                if (this.f60646h) {
                    return;
                }
                this.f60642d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C6634v d(Looper looper, InterfaceC6623j interfaceC6623j, b bVar) {
        return new C6634v(this.f60642d, looper, interfaceC6623j, bVar, this.f60647i);
    }

    public C6634v e(Looper looper, b bVar) {
        return d(looper, this.f60639a, bVar);
    }

    public void f() {
        l();
        if (this.f60644f.isEmpty()) {
            return;
        }
        if (!this.f60640b.c(1)) {
            InterfaceC6631s interfaceC6631s = this.f60640b;
            interfaceC6631s.a(interfaceC6631s.b(1));
        }
        boolean zIsEmpty = this.f60643e.isEmpty();
        this.f60643e.addAll(this.f60644f);
        this.f60644f.clear();
        if (zIsEmpty) {
            while (!this.f60643e.isEmpty()) {
                ((Runnable) this.f60643e.peekFirst()).run();
                this.f60643e.removeFirst();
            }
        }
    }

    public void h(final int i10, final a aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f60642d);
        this.f60644f.add(new Runnable() { // from class: t2.u
            @Override // java.lang.Runnable
            public final void run() {
                C6634v.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void i() {
        l();
        synchronized (this.f60645g) {
            this.f60646h = true;
        }
        Iterator it = this.f60642d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f60641c);
        }
        this.f60642d.clear();
    }

    public void j(Object obj) {
        l();
        for (c cVar : this.f60642d) {
            if (cVar.f60648a.equals(obj)) {
                cVar.c(this.f60641c);
                this.f60642d.remove(cVar);
            }
        }
    }

    public void k(int i10, a aVar) {
        h(i10, aVar);
        f();
    }

    private C6634v(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC6623j interfaceC6623j, b bVar, boolean z10) {
        this.f60639a = interfaceC6623j;
        this.f60642d = copyOnWriteArraySet;
        this.f60641c = bVar;
        this.f60645g = new Object();
        this.f60643e = new ArrayDeque();
        this.f60644f = new ArrayDeque();
        this.f60640b = interfaceC6623j.e(looper, new Handler.Callback() { // from class: t2.t
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f60635a.g(message);
            }
        });
        this.f60647i = z10;
    }
}
