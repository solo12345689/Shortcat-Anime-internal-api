package R2;

import java.util.concurrent.Executor;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends Executor {

    /* JADX INFO: renamed from: R2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0260a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f15133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6627n f15134b;

        C0260a(Executor executor, InterfaceC6627n interfaceC6627n) {
            this.f15133a = executor;
            this.f15134b = interfaceC6627n;
        }

        @Override // R2.a
        public void a() {
            this.f15134b.accept(this.f15133a);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f15133a.execute(runnable);
        }
    }

    static a p0(Executor executor, InterfaceC6627n interfaceC6627n) {
        return new C0260a(executor, interfaceC6627n);
    }

    void a();
}
