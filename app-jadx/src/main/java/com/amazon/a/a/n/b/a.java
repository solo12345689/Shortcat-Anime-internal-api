package com.amazon.a.a.n.b;

import com.amazon.a.a.c.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements com.amazon.a.a.k.d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34570a = new com.amazon.a.a.o.c("ForegroundTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f34572c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f34574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.amazon.a.a.n.a> f34575f = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f34573d = b.b("KIWI_UI");

    public a(c cVar) {
        this.f34574e = cVar;
    }

    private com.amazon.a.a.n.a c(final com.amazon.a.a.n.a aVar) {
        return new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.n.b.a.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.a(aVar, true);
            }

            public String toString() {
                return "Future:PostToUITask: " + aVar.toString();
            }
        };
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        a(aVar, true);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f34572c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.n.b.a.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public String toString() {
                return "ForegroundTaskPipeline:onResume listener";
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34570a.a("Activity resumed, scheduling tasks on UI thread");
        }
        Iterator<com.amazon.a.a.n.a> it = this.f34575f.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f34575f.clear();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        a(aVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.amazon.a.a.n.a aVar, boolean z10) {
        if (this.f34571b.c()) {
            if (z10) {
                this.f34573d.b(aVar);
                return;
            } else {
                this.f34573d.a(aVar);
                return;
            }
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34570a.a("No UI visible to execute task: " + aVar + ", placing into pending queue until task is visible");
        }
        this.f34575f.add(aVar);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        this.f34574e.a(c(aVar), date);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j10) {
        this.f34574e.a(c(aVar), j10);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        this.f34573d.a();
        this.f34574e.a();
        this.f34575f.clear();
    }
}
