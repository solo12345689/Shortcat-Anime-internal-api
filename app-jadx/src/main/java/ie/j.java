package Ie;

import Oe.q;
import ye.InterfaceC7227e;
import ye.InterfaceC7234l;
import ye.Z;
import ye.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface j {

    /* JADX INFO: renamed from: a */
    public static final j f9100a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ie.j
        public void a(q qVar, g0 g0Var) {
            if (qVar == null) {
                f(1);
            }
            if (g0Var == null) {
                f(2);
            }
        }

        @Override // Ie.j
        public InterfaceC7227e b(Xe.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // Ie.j
        public void c(Oe.l lVar, InterfaceC7234l interfaceC7234l) {
            if (lVar == null) {
                f(3);
            }
            if (interfaceC7234l == null) {
                f(4);
            }
        }

        @Override // Ie.j
        public void d(Oe.g gVar, InterfaceC7227e interfaceC7227e) {
            if (gVar == null) {
                f(7);
            }
            if (interfaceC7227e == null) {
                f(8);
            }
        }

        @Override // Ie.j
        public void e(Oe.n nVar, Z z10) {
            if (nVar == null) {
                f(5);
            }
            if (z10 == null) {
                f(6);
            }
        }
    }

    void a(q qVar, g0 g0Var);

    InterfaceC7227e b(Xe.c cVar);

    void c(Oe.l lVar, InterfaceC7234l interfaceC7234l);

    void d(Oe.g gVar, InterfaceC7227e interfaceC7227e);

    void e(Oe.n nVar, Z z10);
}
