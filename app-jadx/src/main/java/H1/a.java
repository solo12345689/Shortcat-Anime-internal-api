package H1;

import H1.i;
import H1.j;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a */
    private final j.c f7632a;

    /* JADX INFO: renamed from: b */
    private final Executor f7633b;

    /* JADX INFO: renamed from: H1.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0097a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ j.c f7634a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Typeface f7635b;

        RunnableC0097a(j.c cVar, Typeface typeface) {
            this.f7634a = cVar;
            this.f7635b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7634a.b(this.f7635b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ j.c f7637a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f7638b;

        b(j.c cVar, int i10) {
            this.f7637a = cVar;
            this.f7638b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7637a.a(this.f7638b);
        }
    }

    a(j.c cVar, Executor executor) {
        this.f7632a = cVar;
        this.f7633b = executor;
    }

    private void a(int i10) {
        this.f7633b.execute(new b(this.f7632a, i10));
    }

    private void c(Typeface typeface) {
        this.f7633b.execute(new RunnableC0097a(this.f7632a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f7668a);
        } else {
            a(eVar.f7669b);
        }
    }
}
