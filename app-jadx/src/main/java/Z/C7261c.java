package z;

import Gf.InterfaceC1623n;
import Td.L;
import Td.u;
import a0.C2507c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import oe.C5870f;
import r0.C6226h;
import z.C7264f;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7261c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65278b = C2507c.f23495d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2507c f65279a = new C2507c(new C7264f.a[16], 0);

    /* JADX INFO: renamed from: z.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7264f.a f65281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7264f.a aVar) {
            super(1);
            this.f65281b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L.f17438a;
        }

        public final void invoke(Throwable th2) {
            C7261c.this.f65279a.w(this.f65281b);
        }
    }

    public final void b(Throwable th2) {
        C2507c c2507c = this.f65279a;
        int iP = c2507c.p();
        InterfaceC1623n[] interfaceC1623nArr = new InterfaceC1623n[iP];
        for (int i10 = 0; i10 < iP; i10++) {
            interfaceC1623nArr[i10] = ((C7264f.a) c2507c.o()[i10]).a();
        }
        for (int i11 = 0; i11 < iP; i11++) {
            interfaceC1623nArr[i11].L(th2);
        }
        if (!this.f65279a.s()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C7264f.a aVar) {
        C6226h c6226h = (C6226h) aVar.b().invoke();
        if (c6226h == null) {
            InterfaceC1623n interfaceC1623nA = aVar.a();
            u.a aVar2 = Td.u.f17466b;
            interfaceC1623nA.resumeWith(Td.u.b(L.f17438a));
            return false;
        }
        aVar.a().p(new a(aVar));
        C5870f c5870f = new C5870f(0, this.f65279a.p() - 1);
        int iF = c5870f.f();
        int i10 = c5870f.i();
        if (iF <= i10) {
            while (true) {
                C6226h c6226h2 = (C6226h) ((C7264f.a) this.f65279a.o()[i10]).b().invoke();
                if (c6226h2 != null) {
                    C6226h c6226hP = c6226h.p(c6226h2);
                    if (AbstractC5504s.c(c6226hP, c6226h)) {
                        this.f65279a.b(i10 + 1, aVar);
                        return true;
                    }
                    if (!AbstractC5504s.c(c6226hP, c6226h2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int iP = this.f65279a.p() - 1;
                        if (iP <= i10) {
                            while (true) {
                                ((C7264f.a) this.f65279a.o()[i10]).a().L(cancellationException);
                                if (iP == i10) {
                                    break;
                                }
                                iP++;
                            }
                        }
                    }
                }
                if (i10 == iF) {
                    break;
                }
                i10--;
            }
        }
        this.f65279a.b(0, aVar);
        return true;
    }

    public final void d() {
        C5870f c5870f = new C5870f(0, this.f65279a.p() - 1);
        int iF = c5870f.f();
        int i10 = c5870f.i();
        if (iF <= i10) {
            while (true) {
                ((C7264f.a) this.f65279a.o()[iF]).a().resumeWith(Td.u.b(L.f17438a));
                if (iF == i10) {
                    break;
                } else {
                    iF++;
                }
            }
        }
        this.f65279a.i();
    }
}
