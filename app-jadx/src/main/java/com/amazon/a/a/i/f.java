package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements e, com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f34386a = new com.amazon.a.a.o.c("PromptManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f34388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f34389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f34390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f34391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<b> f34392g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f34393h = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        if (this.f34393h.get()) {
            if (com.amazon.a.a.o.c.f34700b) {
                f34386a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34386a.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.f34392g.add(bVar);
        if (this.f34391f != null) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34386a.a("Dialog currently showing, not presenting given dialog");
            }
        } else {
            Activity activityB = this.f34387b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        this.f34392g.remove(bVar);
        if (this.f34391f == bVar) {
            this.f34391f = null;
            Activity activityB = this.f34387b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        b();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        b bVar = this.f34391f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    @Override // com.amazon.a.a.i.e
    public void a(final b bVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34386a.a("Scheduling presentation: " + bVar);
        }
        this.f34390e.b(bVar);
        if (this.f34393h.get()) {
            if (com.amazon.a.a.o.c.f34700b) {
                f34386a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        this.f34389d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.c(bVar);
            }

            public String toString() {
                return "Prompt Presentation on Main Thread: " + bVar + ", " + bVar.a();
            }
        });
    }

    @Override // com.amazon.a.a.e.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final b bVar) {
        this.f34389d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.d(bVar);
            }

            public String toString() {
                return "PromptManager:removeExpiredPrompt: " + bVar;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f34393h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34386a.a("PromptManager finishing....");
            }
            Iterator<b> it = this.f34392g.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                next.c();
            }
            b bVar = this.f34391f;
            if (bVar != null) {
                bVar.k();
            }
        }
    }

    private void b() {
        this.f34388c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.i.f.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                f.this.b(aVar.b());
            }
        });
    }

    private void a(Activity activity) {
        b bVarA = a();
        if (bVarA == null) {
            return;
        }
        a(bVarA, activity);
    }

    private void c() {
        this.f34388c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.i.f.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.FIRST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                f.this.d();
            }
        });
    }

    private b a() {
        if (this.f34392g.isEmpty()) {
            return null;
        }
        return this.f34392g.iterator().next();
    }

    private void a(b bVar, Activity activity) {
        this.f34391f = bVar;
        bVar.a(activity);
    }

    @Override // com.amazon.a.a.i.e
    public Dialog a(Activity activity, int i10) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34386a.a("onCreateDialog, id: " + i10 + ", activity: " + activity);
        }
        b bVar = this.f34391f;
        if (bVar == null) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34386a.a("Showing dialog is null, returning");
            }
            return null;
        }
        if (bVar.j() != i10) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34386a.a("Showing dialog id does not match given id: " + i10 + ", returning");
            }
            return null;
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34386a.a("Creating dialog prompt: " + this.f34391f);
        }
        return this.f34391f.c(activity);
    }

    @Override // com.amazon.a.a.i.e
    public void a(Activity activity, boolean z10) {
        b bVar = this.f34391f;
        if (bVar != null) {
            bVar.a(activity, z10);
        }
    }
}
