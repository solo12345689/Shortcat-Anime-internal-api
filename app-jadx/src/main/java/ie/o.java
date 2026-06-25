package Ie;

import Oe.r;
import java.util.Collections;
import java.util.List;
import qf.S;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f9107a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ie.o
        public b a(r rVar, InterfaceC7227e interfaceC7227e, S s10, S s11, List list, List list2) {
            if (rVar == null) {
                c(0);
            }
            if (interfaceC7227e == null) {
                c(1);
            }
            if (s10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(s10, s11, list, list2, Collections.EMPTY_LIST, false);
        }

        @Override // Ie.o
        public void b(InterfaceC7224b interfaceC7224b, List list) {
            if (interfaceC7224b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S f9108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S f9109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f9110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f9111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f9112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f9113f;

        public b(S s10, S s11, List list, List list2, List list3, boolean z10) {
            if (s10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f9108a = s10;
            this.f9109b = s11;
            this.f9110c = list;
            this.f9111d = list2;
            this.f9112e = list3;
            this.f9113f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List b() {
            List list = this.f9112e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public S c() {
            return this.f9109b;
        }

        public S d() {
            S s10 = this.f9108a;
            if (s10 == null) {
                a(4);
            }
            return s10;
        }

        public List e() {
            List list = this.f9111d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.f9110c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f9113f;
        }
    }

    b a(r rVar, InterfaceC7227e interfaceC7227e, S s10, S s11, List list, List list2);

    void b(InterfaceC7224b interfaceC7224b, List list);
}
