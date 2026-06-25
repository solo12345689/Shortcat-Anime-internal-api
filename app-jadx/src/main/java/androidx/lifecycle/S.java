package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: a */
    private final C2865t f30200a;

    /* JADX INFO: renamed from: b */
    private final Handler f30201b;

    /* JADX INFO: renamed from: c */
    private a f30202c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C2865t f30203a;

        /* JADX INFO: renamed from: b */
        private final AbstractC2857k.a f30204b;

        /* JADX INFO: renamed from: c */
        private boolean f30205c;

        public a(C2865t registry, AbstractC2857k.a event) {
            AbstractC5504s.h(registry, "registry");
            AbstractC5504s.h(event, "event");
            this.f30203a = registry;
            this.f30204b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30205c) {
                return;
            }
            this.f30203a.g(this.f30204b);
            this.f30205c = true;
        }
    }

    public S(r provider) {
        AbstractC5504s.h(provider, "provider");
        this.f30200a = new C2865t(provider);
        this.f30201b = new Handler();
    }

    private final void f(AbstractC2857k.a aVar) {
        a aVar2 = this.f30202c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f30200a, aVar);
        this.f30202c = aVar3;
        Handler handler = this.f30201b;
        AbstractC5504s.e(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public AbstractC2857k a() {
        return this.f30200a;
    }

    public void b() {
        f(AbstractC2857k.a.ON_START);
    }

    public void c() {
        f(AbstractC2857k.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC2857k.a.ON_STOP);
        f(AbstractC2857k.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC2857k.a.ON_START);
    }
}
