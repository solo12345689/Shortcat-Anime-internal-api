package R0;

import K0.J;
import Ud.AbstractC2279u;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;
import t.AbstractC6565o;
import t.AbstractC6566p;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator[] f14933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f14934b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14935a = new a();

        /* JADX INFO: renamed from: R0.G$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0256a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0256a f14936a = new C0256a();

            C0256a() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f14937a = new b();

            b() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(s sVar, s sVar2) {
            SemanticsConfiguration semanticsConfigurationY = sVar.y();
            x xVar = x.f15043a;
            return Integer.valueOf(Float.compare(((Number) semanticsConfigurationY.p(xVar.N(), C0256a.f14936a)).floatValue(), ((Number) sVar2.y().p(xVar.N(), b.f14937a)).floatValue()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14938a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f14939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f14940b;

        public c(Comparator comparator, Comparator comparator2) {
            this.f14939a = comparator;
            this.f14940b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f14939a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : this.f14940b.compare(((s) obj).s(), ((s) obj2).s());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f14941a;

        public d(Comparator comparator) {
            this.f14941a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f14941a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : Xd.a.d(Integer.valueOf(((s) obj).q()), Integer.valueOf(((s) obj2).q()));
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new d(new c(i10 == 0 ? i.f14971a : C2097f.f14954a, J.f10425r0.b()));
            i10++;
        }
        f14933a = comparatorArr;
        f14934b = a.f14935a;
    }

    private static final void b(s sVar, ArrayList arrayList, Function1 function1, Function1 function12, C6540F c6540f) {
        boolean zBooleanValue = ((Boolean) sVar.y().p(x.f15043a.w(), b.f14938a)).booleanValue();
        if ((zBooleanValue || ((Boolean) function12.invoke(sVar)).booleanValue()) && ((Boolean) function1.invoke(sVar)).booleanValue()) {
            arrayList.add(sVar);
        }
        if (zBooleanValue) {
            c6540f.s(sVar.q(), f(sVar, function1, function12, sVar.m()));
            return;
        }
        List listM = sVar.m();
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((s) listM.get(i10), arrayList, function1, function12, c6540f);
        }
    }

    private static final boolean c(ArrayList arrayList, s sVar) {
        float fL = sVar.l().l();
        float fE = sVar.l().e();
        boolean z10 = fL >= fE;
        int iO = AbstractC2279u.o(arrayList);
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                C6226h c6226h = (C6226h) ((Pair) arrayList.get(i10)).c();
                boolean z11 = c6226h.l() >= c6226h.e();
                if (!z10 && !z11 && Math.max(fL, c6226h.l()) < Math.min(fE, c6226h.e())) {
                    arrayList.set(i10, new Pair(c6226h.o(0.0f, fL, Float.POSITIVE_INFINITY, fE), ((Pair) arrayList.get(i10)).d()));
                    ((List) ((Pair) arrayList.get(i10)).d()).add(sVar);
                    return true;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public static final List d(s sVar, List list, Function1 function1, AbstractC6565o abstractC6565o) {
        int size = 0;
        char c10 = sVar.r().getLayoutDirection() == EnumC5027t.f48574b ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iO = AbstractC2279u.o(list);
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                s sVar2 = (s) list.get(i10);
                if (i10 == 0 || !c(arrayList, sVar2)) {
                    arrayList.add(new Pair(sVar2.l(), AbstractC2279u.s(sVar2)));
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        AbstractC2279u.B(arrayList, H.f14942a);
        ArrayList arrayList2 = new ArrayList();
        Comparator comparator = f14933a[c10 ^ 1];
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            AbstractC2279u.B((List) pair.d(), comparator);
            arrayList2.addAll((Collection) pair.d());
        }
        final Function2 function2 = f14934b;
        AbstractC2279u.B(arrayList2, new Comparator() { // from class: R0.F
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return G.e(function2, obj, obj2);
            }
        });
        while (size <= AbstractC2279u.o(arrayList2)) {
            List list2 = (List) abstractC6565o.c(((s) arrayList2.get(size)).q());
            if (list2 != null) {
                if (((Boolean) function1.invoke(arrayList2.get(size))).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final List f(s sVar, Function1 function1, Function1 function12, List list) {
        C6540F c6540fC = AbstractC6566p.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((s) list.get(i10), arrayList, function1, function12, c6540fC);
        }
        return d(sVar, arrayList, function12, c6540fC);
    }
}
