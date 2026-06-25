package xe;

import Qe.F;
import Ud.AbstractC2279u;
import Ud.a0;
import gf.EnumC4882e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f64457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f64458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f64459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f64460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f64461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f64462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f64463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f64464h;

    static {
        x xVar = new x();
        f64457a = xVar;
        F f10 = F.f14805a;
        f64458b = a0.m(f10.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f64459c = a0.l(a0.l(a0.l(a0.l(a0.l(a0.l(xVar.b(), f10.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f10.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f10.e("Double", "isInfinite()Z", "isNaN()Z")), f10.e("Float", "isInfinite()Z", "isNaN()Z")), f10.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f10.e("CharSequence", "isEmpty()Z"));
        f64460d = f10.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f64461e = a0.l(a0.l(a0.l(a0.l(a0.l(a0.l(f10.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f10.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f10.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f10.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f10.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f64462f = a0.l(a0.l(f10.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f10.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f10.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = xVar.a();
        String[] strArrB = f10.b("D");
        Set setL = a0.l(setA, f10.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = f10.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f64463g = a0.l(setL, f10.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = f10.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f64464h = f10.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set a() {
        F f10 = F.f14805a;
        EnumC4882e enumC4882e = EnumC4882e.BOOLEAN;
        EnumC4882e enumC4882e2 = EnumC4882e.BYTE;
        List listP = AbstractC2279u.p(enumC4882e, enumC4882e2, EnumC4882e.DOUBLE, EnumC4882e.FLOAT, enumC4882e2, EnumC4882e.INT, EnumC4882e.LONG, EnumC4882e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            String strB = ((EnumC4882e) it.next()).p().f().b();
            AbstractC5504s.g(strB, "asString(...)");
            String[] strArrB = f10.b("Ljava/lang/String;");
            AbstractC2279u.D(linkedHashSet, f10.e(strB, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        F f10 = F.f14805a;
        List<EnumC4882e> listP = AbstractC2279u.p(EnumC4882e.BOOLEAN, EnumC4882e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC4882e enumC4882e : listP) {
            String strB = enumC4882e.p().f().b();
            AbstractC5504s.g(strB, "asString(...)");
            AbstractC2279u.D(linkedHashSet, f10.e(strB, enumC4882e.k() + "Value()" + enumC4882e.h()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f64460d;
    }

    public final Set d() {
        return f64458b;
    }

    public final Set e() {
        return f64463g;
    }

    public final Set f() {
        return f64459c;
    }

    public final Set g() {
        return f64462f;
    }

    public final Set h() {
        return f64464h;
    }

    public final Set i() {
        return f64461e;
    }

    public final boolean j(Xe.d fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return AbstractC5504s.c(fqName, o.a.f62247i) || ve.o.e(fqName);
    }

    public final boolean k(Xe.d fqName) {
        AbstractC5504s.h(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        Xe.b bVarN = C7139c.f64375a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
