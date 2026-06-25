package com.amazon.a.a.n.c;

import com.amazon.a.a.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34590b = new com.amazon.a.a.o.c("TaskWorkflow");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f34592c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final List<com.amazon.a.a.n.a> f34591a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicBoolean f34593d = new AtomicBoolean(false);

    private void f() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34590b.a("Exiting task workflow: " + this);
        }
        for (com.amazon.a.a.n.a aVar : this.f34591a) {
            if (this.f34593d.get()) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f34590b.a("Finished set, exiting task workflow early");
                    return;
                }
                return;
            }
            aVar.a();
        }
    }

    @Override // com.amazon.a.a.n.a
    public final void a() {
        try {
            c();
            f();
        } finally {
            b();
        }
    }

    protected abstract String b_();

    public final void d() {
        this.f34593d.set(true);
    }

    @Override // com.amazon.a.a.k.d
    public final void e() {
        Iterator<com.amazon.a.a.n.a> it = this.f34591a.iterator();
        while (it.hasNext()) {
            this.f34592c.b(it.next());
        }
    }

    public final String toString() {
        return b_();
    }

    protected final void a(com.amazon.a.a.n.a aVar) {
        com.amazon.a.a.o.a.a.a((Object) aVar, "task");
        this.f34591a.add(aVar);
        if (aVar instanceof c) {
            ((c) aVar).a(this);
        }
    }

    protected void b() {
    }

    protected void c() {
    }
}
