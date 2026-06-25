package j4;

import i4.i;
import i4.q;
import java.util.HashMap;
import java.util.Map;
import n4.C5745u;

/* JADX INFO: renamed from: j4.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5334a {

    /* JADX INFO: renamed from: d */
    static final String f51626d = i.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    final b f51627a;

    /* JADX INFO: renamed from: b */
    private final q f51628b;

    /* JADX INFO: renamed from: c */
    private final Map f51629c = new HashMap();

    /* JADX INFO: renamed from: j4.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0812a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C5745u f51630a;

        RunnableC0812a(C5745u c5745u) {
            this.f51630a = c5745u;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.e().a(C5334a.f51626d, "Scheduling work " + this.f51630a.f53943a);
            C5334a.this.f51627a.a(this.f51630a);
        }
    }

    public C5334a(b bVar, q qVar) {
        this.f51627a = bVar;
        this.f51628b = qVar;
    }

    public void a(C5745u c5745u) {
        Runnable runnable = (Runnable) this.f51629c.remove(c5745u.f53943a);
        if (runnable != null) {
            this.f51628b.a(runnable);
        }
        RunnableC0812a runnableC0812a = new RunnableC0812a(c5745u);
        this.f51629c.put(c5745u.f53943a, runnableC0812a);
        this.f51628b.b(c5745u.c() - System.currentTimeMillis(), runnableC0812a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f51629c.remove(str);
        if (runnable != null) {
            this.f51628b.a(runnable);
        }
    }
}
