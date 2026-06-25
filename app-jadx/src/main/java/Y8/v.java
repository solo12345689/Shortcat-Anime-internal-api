package y8;

import A8.b;
import java.util.Iterator;
import java.util.concurrent.Executor;
import r8.AbstractC6289o;
import z8.InterfaceC7327d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f64977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7327d f64978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f64979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A8.b f64980d;

    v(Executor executor, InterfaceC7327d interfaceC7327d, x xVar, A8.b bVar) {
        this.f64977a = executor;
        this.f64978b = interfaceC7327d;
        this.f64979c = xVar;
        this.f64980d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f64978b.d0().iterator();
        while (it.hasNext()) {
            vVar.f64979c.a((AbstractC6289o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f64977a.execute(new Runnable() { // from class: y8.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f64975a;
                vVar.f64980d.g(new b.a() { // from class: y8.u
                    @Override // A8.b.a
                    public final Object b() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
