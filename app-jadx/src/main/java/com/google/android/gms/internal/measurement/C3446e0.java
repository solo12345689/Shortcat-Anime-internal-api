package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3446e0 {

    /* JADX INFO: renamed from: a */
    final C3616x1 f39742a;

    /* JADX INFO: renamed from: b */
    Y1 f39743b;

    /* JADX INFO: renamed from: c */
    final C3427c f39744c;

    /* JADX INFO: renamed from: d */
    private final V7 f39745d;

    public C3446e0() {
        C3616x1 c3616x1 = new C3616x1();
        this.f39742a = c3616x1;
        this.f39743b = c3616x1.f40022b.c();
        this.f39744c = new C3427c();
        this.f39745d = new V7();
        c3616x1.f40024d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f39336a.g();
            }
        });
        c3616x1.f40024d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C3423b4(this.f39700a.f39744c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f39742a.f40024d.a(str, callable);
    }

    public final boolean b(C3418b c3418b) throws D0 {
        try {
            C3427c c3427c = this.f39744c;
            c3427c.b(c3418b);
            this.f39742a.f40023c.e("runtime.counter", new C3490j(Double.valueOf(0.0d)));
            this.f39745d.b(this.f39743b.c(), c3427c);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th2) {
            throw new D0(th2);
        }
    }

    public final boolean c() {
        C3427c c3427c = this.f39744c;
        return !c3427c.c().equals(c3427c.a());
    }

    public final boolean d() {
        return !this.f39744c.f().isEmpty();
    }

    public final C3427c e() {
        return this.f39744c;
    }

    public final void f(C3 c32) throws D0 {
        AbstractC3499k abstractC3499k;
        try {
            C3616x1 c3616x1 = this.f39742a;
            this.f39743b = c3616x1.f40022b.c();
            if (c3616x1.a(this.f39743b, (G3[]) c32.C().toArray(new G3[0])) instanceof C3472h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C3634z3 c3634z3 : c32.D().C()) {
                List listD = c3634z3.D();
                String strC = c3634z3.C();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    InterfaceC3553q interfaceC3553qA = c3616x1.a(this.f39743b, (G3) it.next());
                    if (!(interfaceC3553qA instanceof C3526n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Y1 y12 = this.f39743b;
                    if (y12.d(strC)) {
                        InterfaceC3553q interfaceC3553qH = y12.h(strC);
                        if (!(interfaceC3553qH instanceof AbstractC3499k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strC)));
                        }
                        abstractC3499k = (AbstractC3499k) interfaceC3553qH;
                    } else {
                        abstractC3499k = null;
                    }
                    if (abstractC3499k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strC)));
                    }
                    abstractC3499k.a(this.f39743b, Collections.singletonList(interfaceC3553qA));
                }
            }
        } catch (Throwable th2) {
            throw new D0(th2);
        }
    }

    final /* synthetic */ AbstractC3499k g() {
        return new R7(this.f39745d);
    }
}
