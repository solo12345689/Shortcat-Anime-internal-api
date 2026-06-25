package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements V3.a {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2857k f29525a;

        a(AbstractC2857k abstractC2857k) {
            this.f29525a = abstractC2857k;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(androidx.lifecycle.r rVar) {
            EmojiCompatInitializer.this.e();
            this.f29525a.removeObserver(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f29527a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f29528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f29529b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f29528a = iVar;
                this.f29529b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                try {
                    this.f29528a.a(th2);
                } finally {
                    this.f29529b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                try {
                    this.f29528a.b(mVar);
                } finally {
                    this.f29529b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f29527a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29569a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f29527a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                G1.n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.k()) {
                    e.c().n();
                }
            } finally {
                G1.n.b();
            }
        }
    }

    @Override // V3.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // V3.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC2857k lifecycle = ((androidx.lifecycle.r) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }
}
