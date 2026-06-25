package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import com.amazon.a.a.k.d;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends a<T>> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34324b = new com.amazon.a.a.o.c("Expirable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f34325a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f34326c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f34327d = new Vector();

    private void h() {
        this.f34325a.a(com.amazon.a.a.n.b.d.BACKGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.c();
            }

            public String toString() {
                return "Expire: " + a.this.toString();
            }
        }, a());
    }

    private void i() {
        Iterator<b<T>> it = this.f34327d.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    protected abstract Date a();

    public final void a(b<T> bVar) {
        this.f34327d.add(bVar);
    }

    public void c() {
        if (this.f34326c.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34324b.a("Expiring: " + this);
            }
            d();
            if (com.amazon.a.a.o.c.f34699a) {
                f34324b.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    protected abstract void d();

    @Override // com.amazon.a.a.k.d
    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.f34326c.compareAndSet(false, true)) {
            i();
        }
    }

    protected boolean g() {
        return this.f34326c.get();
    }

    protected void b() {
    }
}
