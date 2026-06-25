package m2;

import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import kotlin.jvm.internal.AbstractC5504s;
import o2.C5807f;
import o2.C5809h;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: m2.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5631d {

    /* JADX INFO: renamed from: a */
    private final X f53051a;

    /* JADX INFO: renamed from: b */
    private final W.c f53052b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5628a f53053c;

    /* JADX INFO: renamed from: d */
    private final C5807f f53054d;

    public C5631d(X store, W.c factory, AbstractC5628a defaultExtras) {
        AbstractC5504s.h(store, "store");
        AbstractC5504s.h(factory, "factory");
        AbstractC5504s.h(defaultExtras, "defaultExtras");
        this.f53051a = store;
        this.f53052b = factory;
        this.f53053c = defaultExtras;
        this.f53054d = new C5807f();
    }

    public static /* synthetic */ U e(C5631d c5631d, InterfaceC6014d interfaceC6014d, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C5809h.f54235a.c(interfaceC6014d);
        }
        return c5631d.d(interfaceC6014d, str);
    }

    public final U d(InterfaceC6014d modelClass, String key) {
        U uB;
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(key, "key");
        synchronized (this.f53054d) {
            try {
                uB = this.f53051a.b(key);
                if (modelClass.t(uB)) {
                    if (this.f53052b instanceof W.e) {
                        W.e eVar = (W.e) this.f53052b;
                        AbstractC5504s.e(uB);
                        eVar.a(uB);
                    }
                    AbstractC5504s.f(uB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C5629b c5629b = new C5629b(this.f53053c);
                    c5629b.c(W.f30208c, key);
                    uB = AbstractC5632e.a(this.f53052b, modelClass, c5629b);
                    this.f53051a.d(key, uB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uB;
    }
}
