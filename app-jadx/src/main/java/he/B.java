package He;

import He.C;
import Td.C2161l;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class B {

    /* JADX INFO: renamed from: a */
    private static final Xe.c f8413a;

    /* JADX INFO: renamed from: b */
    private static final Xe.c f8414b;

    /* JADX INFO: renamed from: c */
    private static final Xe.c f8415c;

    /* JADX INFO: renamed from: d */
    private static final Xe.c f8416d;

    /* JADX INFO: renamed from: e */
    private static final String f8417e;

    /* JADX INFO: renamed from: f */
    private static final Xe.c[] f8418f;

    /* JADX INFO: renamed from: g */
    private static final K f8419g;

    /* JADX INFO: renamed from: h */
    private static final C f8420h;

    static {
        Xe.c cVar = new Xe.c("org.jspecify.nullness");
        f8413a = cVar;
        Xe.c cVar2 = new Xe.c("org.jspecify.annotations");
        f8414b = cVar2;
        Xe.c cVar3 = new Xe.c("io.reactivex.rxjava3.annotations");
        f8415c = cVar3;
        Xe.c cVar4 = new Xe.c("org.checkerframework.checker.nullness.compatqual");
        f8416d = cVar4;
        String strA = cVar3.a();
        f8417e = strA;
        f8418f = new Xe.c[]{new Xe.c(strA + ".Nullable"), new Xe.c(strA + ".NonNull")};
        Xe.c cVar5 = new Xe.c("org.jetbrains.annotations");
        C.a aVar = C.f8421d;
        Pair pairA = Td.z.a(cVar5, aVar.a());
        Pair pairA2 = Td.z.a(new Xe.c("androidx.annotation"), aVar.a());
        Pair pairA3 = Td.z.a(new Xe.c("android.support.annotation"), aVar.a());
        Pair pairA4 = Td.z.a(new Xe.c("android.annotation"), aVar.a());
        Pair pairA5 = Td.z.a(new Xe.c("com.android.annotations"), aVar.a());
        Pair pairA6 = Td.z.a(new Xe.c("org.eclipse.jdt.annotation"), aVar.a());
        Pair pairA7 = Td.z.a(new Xe.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair pairA8 = Td.z.a(cVar4, aVar.a());
        Pair pairA9 = Td.z.a(new Xe.c("javax.annotation"), aVar.a());
        Pair pairA10 = Td.z.a(new Xe.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair pairA11 = Td.z.a(new Xe.c("io.reactivex.annotations"), aVar.a());
        Xe.c cVar6 = new Xe.c("androidx.annotation.RecentlyNullable");
        O o10 = O.f8501d;
        Pair pairA12 = Td.z.a(cVar6, new C(o10, null, null, 4, null));
        Pair pairA13 = Td.z.a(new Xe.c("androidx.annotation.RecentlyNonNull"), new C(o10, null, null, 4, null));
        Pair pairA14 = Td.z.a(new Xe.c("lombok"), aVar.a());
        C2161l c2161l = new C2161l(2, 1);
        O o11 = O.f8502e;
        f8419g = new M(Ud.S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, Td.z.a(cVar, new C(o10, c2161l, o11)), Td.z.a(cVar2, new C(o10, new C2161l(2, 1), o11)), Td.z.a(cVar3, new C(o10, new C2161l(1, 8), o11))));
        f8420h = new C(o10, null, null, 4, null);
    }

    public static final G a(C2161l configuredKotlinVersion) {
        AbstractC5504s.h(configuredKotlinVersion, "configuredKotlinVersion");
        C c10 = f8420h;
        O oC = (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
        return new G(oC, c(oC), null, 4, null);
    }

    public static /* synthetic */ G b(C2161l c2161l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2161l = C2161l.f17454f;
        }
        return a(c2161l);
    }

    public static final O c(O globalReportLevel) {
        AbstractC5504s.h(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == O.f8501d) {
            return null;
        }
        return globalReportLevel;
    }

    public static final O d(Xe.c annotationFqName) {
        AbstractC5504s.h(annotationFqName, "annotationFqName");
        return h(annotationFqName, K.f8492a.a(), null, 4, null);
    }

    public static final Xe.c e() {
        return f8414b;
    }

    public static final Xe.c[] f() {
        return f8418f;
    }

    public static final O g(Xe.c annotation, K configuredReportLevels, C2161l configuredKotlinVersion) {
        AbstractC5504s.h(annotation, "annotation");
        AbstractC5504s.h(configuredReportLevels, "configuredReportLevels");
        AbstractC5504s.h(configuredKotlinVersion, "configuredKotlinVersion");
        O o10 = (O) configuredReportLevels.a(annotation);
        if (o10 != null) {
            return o10;
        }
        C c10 = (C) f8419g.a(annotation);
        return c10 == null ? O.f8500c : (c10.d() == null || c10.d().compareTo(configuredKotlinVersion) > 0) ? c10.c() : c10.b();
    }

    public static /* synthetic */ O h(Xe.c cVar, K k10, C2161l c2161l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c2161l = new C2161l(1, 7, 20);
        }
        return g(cVar, k10, c2161l);
    }
}
