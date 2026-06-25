package k4;

import Td.L;
import i4.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import l4.AbstractC5549c;
import l4.C5547a;
import l4.C5548b;
import l4.C5550d;
import l4.C5551e;
import l4.C5552f;
import l4.C5553g;
import l4.C5554h;
import m4.n;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC5448d, AbstractC5549c.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5447c f52052a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5549c[] f52053b;

    /* JADX INFO: renamed from: c */
    private final Object f52054c;

    public e(InterfaceC5447c interfaceC5447c, AbstractC5549c[] constraintControllers) {
        AbstractC5504s.h(constraintControllers, "constraintControllers");
        this.f52052a = interfaceC5447c;
        this.f52053b = constraintControllers;
        this.f52054c = new Object();
    }

    @Override // k4.InterfaceC5448d
    public void a(Iterable workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
        synchronized (this.f52054c) {
            try {
                for (AbstractC5549c abstractC5549c : this.f52053b) {
                    abstractC5549c.g(null);
                }
                for (AbstractC5549c abstractC5549c2 : this.f52053b) {
                    abstractC5549c2.e(workSpecs);
                }
                for (AbstractC5549c abstractC5549c3 : this.f52053b) {
                    abstractC5549c3.g(this);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l4.AbstractC5549c.a
    public void b(List workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
        synchronized (this.f52054c) {
            try {
                ArrayList<C5745u> arrayList = new ArrayList();
                for (Object obj : workSpecs) {
                    if (d(((C5745u) obj).f53943a)) {
                        arrayList.add(obj);
                    }
                }
                for (C5745u c5745u : arrayList) {
                    i.e().a(f.f52055a, "Constraints met for " + c5745u);
                }
                InterfaceC5447c interfaceC5447c = this.f52052a;
                if (interfaceC5447c != null) {
                    interfaceC5447c.e(arrayList);
                    L l10 = L.f17438a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l4.AbstractC5549c.a
    public void c(List workSpecs) {
        AbstractC5504s.h(workSpecs, "workSpecs");
        synchronized (this.f52054c) {
            InterfaceC5447c interfaceC5447c = this.f52052a;
            if (interfaceC5447c != null) {
                interfaceC5447c.b(workSpecs);
                L l10 = L.f17438a;
            }
        }
    }

    public final boolean d(String workSpecId) {
        AbstractC5549c abstractC5549c;
        boolean z10;
        AbstractC5504s.h(workSpecId, "workSpecId");
        synchronized (this.f52054c) {
            try {
                AbstractC5549c[] abstractC5549cArr = this.f52053b;
                int length = abstractC5549cArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        abstractC5549c = null;
                        break;
                    }
                    abstractC5549c = abstractC5549cArr[i10];
                    if (abstractC5549c.d(workSpecId)) {
                        break;
                    }
                    i10++;
                }
                if (abstractC5549c != null) {
                    i.e().a(f.f52055a, "Work " + workSpecId + " constrained by " + abstractC5549c.getClass().getSimpleName());
                }
                z10 = abstractC5549c == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // k4.InterfaceC5448d
    public void reset() {
        synchronized (this.f52054c) {
            try {
                for (AbstractC5549c abstractC5549c : this.f52053b) {
                    abstractC5549c.f();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(n trackers, InterfaceC5447c interfaceC5447c) {
        this(interfaceC5447c, new AbstractC5549c[]{new C5547a(trackers.a()), new C5548b(trackers.b()), new C5554h(trackers.d()), new C5550d(trackers.c()), new C5553g(trackers.c()), new C5552f(trackers.c()), new C5551e(trackers.c())});
        AbstractC5504s.h(trackers, "trackers");
    }
}
