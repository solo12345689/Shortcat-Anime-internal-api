package af;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.N;
import ye.m0;

/* JADX INFO: renamed from: af.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC2616b {

    /* JADX INFO: renamed from: af.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC2616b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23972a = new a();

        private a() {
        }

        @Override // af.InterfaceC2616b
        public String a(InterfaceC7230h classifier, n renderer) {
            AbstractC5504s.h(classifier, "classifier");
            AbstractC5504s.h(renderer, "renderer");
            if (classifier instanceof m0) {
                Xe.f name = ((m0) classifier).getName();
                AbstractC5504s.g(name, "getName(...)");
                return renderer.R(name, false);
            }
            Xe.d dVarM = bf.i.m(classifier);
            AbstractC5504s.g(dVarM, "getFqName(...)");
            return renderer.Q(dVarM);
        }
    }

    /* JADX INFO: renamed from: af.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0418b implements InterfaceC2616b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0418b f23973a = new C0418b();

        private C0418b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ye.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [ye.J, ye.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [ye.m] */
        @Override // af.InterfaceC2616b
        public String a(InterfaceC7230h classifier, n renderer) {
            AbstractC5504s.h(classifier, "classifier");
            AbstractC5504s.h(renderer, "renderer");
            if (classifier instanceof m0) {
                Xe.f name = ((m0) classifier).getName();
                AbstractC5504s.g(name, "getName(...)");
                return renderer.R(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC7227e);
            return AbstractC2614G.c(AbstractC2279u.V(arrayList));
        }
    }

    /* JADX INFO: renamed from: af.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC2616b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23974a = new c();

        private c() {
        }

        private final String b(InterfaceC7230h interfaceC7230h) {
            Xe.f name = interfaceC7230h.getName();
            AbstractC5504s.g(name, "getName(...)");
            String strB = AbstractC2614G.b(name);
            if (interfaceC7230h instanceof m0) {
                return strB;
            }
            InterfaceC7235m interfaceC7235mB = interfaceC7230h.b();
            AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
            String strC = c(interfaceC7235mB);
            if (strC == null || AbstractC5504s.c(strC, "")) {
                return strB;
            }
            return strC + com.amazon.a.a.o.c.a.b.f34706a + strB;
        }

        private final String c(InterfaceC7235m interfaceC7235m) {
            if (interfaceC7235m instanceof InterfaceC7227e) {
                return b((InterfaceC7230h) interfaceC7235m);
            }
            if (interfaceC7235m instanceof N) {
                return AbstractC2614G.a(((N) interfaceC7235m).f().i());
            }
            return null;
        }

        @Override // af.InterfaceC2616b
        public String a(InterfaceC7230h classifier, n renderer) {
            AbstractC5504s.h(classifier, "classifier");
            AbstractC5504s.h(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC7230h interfaceC7230h, n nVar);
}
