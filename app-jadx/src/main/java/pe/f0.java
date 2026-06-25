package Pe;

import Pe.n0;
import gf.EnumC4882e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2023h f13870a = new C2023h(EnumC2026k.f13899b, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2023h f13871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2023h f13872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f13873d;

    static {
        EnumC2026k enumC2026k = EnumC2026k.f13900c;
        f13871b = new C2023h(enumC2026k, null, false, false, 8, null);
        f13872c = new C2023h(enumC2026k, null, true, false, 8, null);
        Qe.F f10 = Qe.F.f14805a;
        String strH = f10.h("Object");
        String strG = f10.g("Predicate");
        String strG2 = f10.g("Function");
        String strG3 = f10.g("Consumer");
        String strG4 = f10.g("BiFunction");
        String strG5 = f10.g("BiConsumer");
        String strG6 = f10.g("UnaryOperator");
        String strI = f10.i("stream/Stream");
        String strI2 = f10.i("Optional");
        n0 n0Var = new n0();
        n0.a.b(new n0.a(n0Var, f10.i("Iterator")), "forEachRemaining", null, new C2028m(strG3), 2, null);
        n0.a.b(new n0.a(n0Var, f10.h("Iterable")), "spliterator", null, new C2038x(f10), 2, null);
        n0.a aVar = new n0.a(n0Var, f10.i("Collection"));
        n0.a.b(aVar, "removeIf", null, new I(strG), 2, null);
        n0.a.b(aVar, "stream", null, new U(strI), 2, null);
        n0.a.b(aVar, "parallelStream", null, new Z(strI), 2, null);
        n0.a aVar2 = new n0.a(n0Var, f10.i("List"));
        n0.a.b(aVar2, "replaceAll", null, new a0(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new b0(strH));
        aVar2.a("addLast", "2.1", new c0(strH));
        aVar2.a("removeFirst", "2.1", new d0(strH));
        aVar2.a("removeLast", "2.1", new e0(strH));
        n0.a aVar3 = new n0.a(n0Var, f10.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new C2029n(strH));
        aVar3.a("addLast", "2.1", new C2030o(strH));
        aVar3.a("removeFirst", "2.1", new C2031p(strH));
        aVar3.a("removeLast", "2.1", new C2032q(strH));
        n0.a aVar4 = new n0.a(n0Var, f10.i("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new r(strH));
        aVar4.a("addLast", "2.2", new C2033s(strH));
        aVar4.a("removeFirst", "2.2", new C2034t(strH));
        aVar4.a("removeLast", "2.2", new C2035u(strH));
        aVar4.a("getFirst", "2.2", new C2036v(strH));
        aVar4.a("getLast", "2.2", new C2037w(strH));
        n0.a aVar5 = new n0.a(n0Var, f10.i("Map"));
        n0.a.b(aVar5, "forEach", null, new C2039y(strG5), 2, null);
        n0.a.b(aVar5, "putIfAbsent", null, new C2040z(strH), 2, null);
        n0.a.b(aVar5, "replace", null, new A(strH), 2, null);
        n0.a.b(aVar5, "replace", null, new B(strH), 2, null);
        n0.a.b(aVar5, "replaceAll", null, new C(strG4), 2, null);
        n0.a.b(aVar5, "compute", null, new D(strH, strG4), 2, null);
        n0.a.b(aVar5, "computeIfAbsent", null, new E(strH, strG2), 2, null);
        n0.a.b(aVar5, "computeIfPresent", null, new F(strH, strG4), 2, null);
        n0.a.b(aVar5, "merge", null, new G(strH, strG4), 2, null);
        n0.a aVar6 = new n0.a(n0Var, f10.i("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new H(strH));
        aVar6.a("putLast", "2.2", new J(strH));
        n0.a aVar7 = new n0.a(n0Var, strI2);
        n0.a.b(aVar7, "empty", null, new K(strI2), 2, null);
        n0.a.b(aVar7, "of", null, new L(strH, strI2), 2, null);
        n0.a.b(aVar7, "ofNullable", null, new M(strH, strI2), 2, null);
        n0.a.b(aVar7, com.amazon.a.a.o.b.au, null, new N(strH), 2, null);
        n0.a.b(aVar7, "ifPresent", null, new O(strG3), 2, null);
        n0.a.b(new n0.a(n0Var, f10.h("ref/Reference")), com.amazon.a.a.o.b.au, null, new P(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG), "test", null, new Q(strH), 2, null);
        n0.a.b(new n0.a(n0Var, f10.g("BiPredicate")), "test", null, new S(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG3), "accept", null, new T(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG5), "accept", null, new V(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG2), "apply", null, new W(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG4), "apply", null, new X(strH), 2, null);
        n0.a.b(new n0.a(n0Var, f10.g("Supplier")), com.amazon.a.a.o.b.au, null, new Y(strH), 2, null);
        f13873d = n0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L A(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.d(str, f13870a);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L B(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.d(str, f13870a);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L C(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b, f13872c);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L D(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13872c;
        function.b(str, c2023h);
        function.d(str2, f13871b, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L E(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13870a);
        function.d(str2, f13871b, f13872c);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L F(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13872c);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L G(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b, f13872c);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L H(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13870a);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L I(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        function.c(EnumC4882e.BOOLEAN);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L J(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.c(EnumC4882e.BOOLEAN);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L K(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    public static final Map K0() {
        return f13873d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L L(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L M(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.d(str, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L N(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.d(str, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L O(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L P(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h, c2023h);
        function.c(EnumC4882e.BOOLEAN);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L Q(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.d(str, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L R(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.d(str, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L a(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L b(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L c(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L d(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L e(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L f(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L g(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L h(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L i(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L j(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L k(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L l(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.b(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L m(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L n(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L o(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L p(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        function.d(str, f13871b);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L q(Qe.F f10, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        String strI = f10.i("Spliterator");
        C2023h c2023h = f13871b;
        function.d(strI, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L r(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L s(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.d(str, f13870a);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L t(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.d(str, f13870a);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L u(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.b(str, c2023h);
        function.c(EnumC4882e.BOOLEAN);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L v(String str, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h, c2023h, c2023h, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L w(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        C2023h c2023h2 = f13870a;
        function.b(str2, c2023h, c2023h, c2023h2, c2023h2);
        function.d(str, c2023h2);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L x(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        function.b(str2, c2023h, c2023h, c2023h);
        function.d(str, c2023h);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L y(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        C2023h c2023h2 = f13872c;
        C2023h c2023h3 = f13870a;
        function.b(str2, c2023h, c2023h, c2023h2, c2023h3);
        function.d(str, c2023h3);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L z(String str, String str2, n0.a.C0226a function) {
        AbstractC5504s.h(function, "$this$function");
        C2023h c2023h = f13871b;
        function.b(str, c2023h);
        C2023h c2023h2 = f13872c;
        function.b(str, c2023h2);
        C2023h c2023h3 = f13870a;
        function.b(str2, c2023h, c2023h2, c2023h2, c2023h3);
        function.d(str, c2023h3);
        return Td.L.f17438a;
    }
}
