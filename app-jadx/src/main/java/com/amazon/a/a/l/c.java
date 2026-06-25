package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34441a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f34442b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34443c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f34444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f34446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicReference<a> f34447g = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlockingQueue<com.amazon.a.a.l.a> f34448h = new LinkedBlockingQueue();

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f34446f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.l.c.1
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
                a aVar2 = (a) c.this.f34447g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }
        });
    }

    private int b() {
        return f34442b.nextInt(f34443c) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f34452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f34454c;

        public a(Intent intent, int i10) {
            this.f34452a = intent;
            this.f34453b = i10;
        }

        public void a(Activity activity) {
            c.f34441a.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f34452a, this.f34453b);
            this.f34454c = activity;
        }

        public void b(Activity activity) {
            c.f34441a.b("Context changed while awaiting result!");
            if (this.f34454c != null) {
                c.f34441a.b("Finishing activity from old context: " + this.f34454c);
                this.f34454c.finishActivity(this.f34453b);
            }
            a(activity);
        }

        public int a() {
            return this.f34453b;
        }
    }

    @Override // com.amazon.a.a.l.b
    public com.amazon.a.a.l.a a(Intent intent) {
        final a aVar = new a(intent, b());
        if (!Y.a(this.f34447g, null, aVar)) {
            f34441a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        com.amazon.a.a.o.c cVar = f34441a;
        cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
        this.f34444d.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.l.c.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity activityB = c.this.f34445e.b();
                if (activityB == null) {
                    c.f34441a.a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                } else {
                    aVar.a(activityB);
                }
            }
        });
        try {
            try {
                cVar.a("Blocking for request: " + aVar.a());
                com.amazon.a.a.l.a aVarTake = this.f34448h.take();
                cVar.a("Received Response: " + aVar.a());
                this.f34447g.set(null);
                return aVarTake;
            } catch (InterruptedException unused) {
                com.amazon.a.a.o.c cVar2 = f34441a;
                cVar2.a("Interrupted while awaiting for request, returning null");
                cVar2.a("Received Response: " + aVar.a());
                this.f34447g.set(null);
                return null;
            }
        } catch (Throwable th2) {
            f34441a.a("Received Response: " + aVar.a());
            this.f34447g.set(null);
            throw th2;
        }
    }

    @Override // com.amazon.a.a.l.b
    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34441a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f34447g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34441a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34441a.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34441a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.f34448h.add(aVar);
        return true;
    }
}
