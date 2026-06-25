package a1;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a1.W, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2529W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2520M f23546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f23547b = new AtomicReference(null);

    public C2529W(InterfaceC2520M interfaceC2520M) {
        this.f23546a = interfaceC2520M;
    }

    public final c0 a() {
        return (c0) this.f23547b.get();
    }

    public final void b() {
        this.f23546a.e();
    }

    public final void c() {
        if (a() != null) {
            this.f23546a.g();
        }
    }

    public c0 d(C2527U c2527u, C2552t c2552t, Function1 function1, Function1 function12) {
        this.f23546a.h(c2527u, c2552t, function1, function12);
        c0 c0Var = new c0(this, this.f23546a);
        this.f23547b.set(c0Var);
        return c0Var;
    }

    public final void e() {
        this.f23546a.a();
        this.f23547b.set(new c0(this, this.f23546a));
    }

    public final void f() {
        this.f23547b.set(null);
        this.f23546a.b();
    }

    public void g(c0 c0Var) {
        if (w.Y.a(this.f23547b, c0Var, null)) {
            this.f23546a.b();
        }
    }
}
