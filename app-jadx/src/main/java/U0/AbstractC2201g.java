package U0;

import U0.C2197e;
import Ud.AbstractC2279u;
import Ud.C2272m;
import b1.AbstractC2968a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: U0.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2201g {

    /* JADX INFO: renamed from: a */
    private static final C2197e f18826a = new C2197e("", null, 2, null);

    /* JADX INFO: renamed from: U0.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(((C2197e.d) obj).h()), Integer.valueOf(((C2197e.d) obj2).h()));
        }
    }

    public static final List e(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add((C2197e.d) list.get(i10));
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add((C2197e.d) list2.get(i11));
        }
        return arrayList;
    }

    public static final C2197e f() {
        return f18826a;
    }

    public static final List g(List list, int i10, int i11) {
        if (!(i10 <= i11)) {
            AbstractC2968a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C2197e.d dVar = (C2197e.d) list.get(i12);
            if (j(i10, i11, dVar.h(), dVar.f())) {
                arrayList.add(new C2197e.d(dVar.g(), Math.max(i10, dVar.h()) - i10, Math.min(i11, dVar.f()) - i10, dVar.i()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List h(C2197e c2197e, int i10, int i11, Function1 function1) {
        List listB;
        if (i10 == i11 || (listB = c2197e.b()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c2197e.j().length()) {
            ArrayList arrayList = new ArrayList(listB.size());
            int size = listB.size();
            for (int i12 = 0; i12 < size; i12++) {
                C2197e.d dVar = (C2197e.d) listB.get(i12);
                if ((function1 != null ? ((Boolean) function1.invoke(dVar.g())).booleanValue() : true) && j(i10, i11, dVar.h(), dVar.f())) {
                    arrayList.add(new C2197e.d((C2197e.a) dVar.g(), AbstractC5874j.m(dVar.h(), i10, i11) - i10, AbstractC5874j.m(dVar.f(), i10, i11) - i10, dVar.i()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return listB;
        }
        ArrayList arrayList2 = new ArrayList(listB.size());
        int size2 = listB.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = listB.get(i13);
            if (((Boolean) function1.invoke(((C2197e.d) obj).g())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    static /* synthetic */ List i(C2197e c2197e, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        return h(c2197e, i10, i11, function1);
    }

    public static final boolean j(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }

    public static final List k(C2197e c2197e, B b10) {
        List listM;
        List listF = c2197e.f();
        if (listF == null || (listM = AbstractC2279u.R0(listF, new a())) == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        C2272m c2272m = new C2272m();
        int size = listM.size();
        int iF = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) listM.get(i10);
            C2197e.d dVarE = C2197e.d.e(dVar, b10.l((B) dVar.g()), 0, 0, null, 14, null);
            while (iF < dVarE.h() && !c2272m.isEmpty()) {
                C2197e.d dVar2 = (C2197e.d) c2272m.last();
                if (dVarE.h() < dVar2.f()) {
                    arrayList.add(new C2197e.d(dVar2.g(), iF, dVarE.h()));
                    iF = dVarE.h();
                } else {
                    arrayList.add(new C2197e.d(dVar2.g(), iF, dVar2.f()));
                    iF = dVar2.f();
                    while (!c2272m.isEmpty() && iF == ((C2197e.d) c2272m.last()).f()) {
                        c2272m.removeLast();
                    }
                }
            }
            if (iF < dVarE.h()) {
                arrayList.add(new C2197e.d(b10, iF, dVarE.h()));
                iF = dVarE.h();
            }
            C2197e.d dVar3 = (C2197e.d) c2272m.t();
            if (dVar3 == null) {
                c2272m.add(new C2197e.d(dVarE.g(), dVarE.h(), dVarE.f()));
            } else if (dVar3.h() == dVarE.h() && dVar3.f() == dVarE.f()) {
                c2272m.removeLast();
                c2272m.add(new C2197e.d(((B) dVar3.g()).l((B) dVarE.g()), dVarE.h(), dVarE.f()));
            } else if (dVar3.h() == dVar3.f()) {
                arrayList.add(new C2197e.d(dVar3.g(), dVar3.h(), dVar3.f()));
                c2272m.removeLast();
                c2272m.add(new C2197e.d(dVarE.g(), dVarE.h(), dVarE.f()));
            } else {
                if (dVar3.f() < dVarE.f()) {
                    throw new IllegalArgumentException();
                }
                c2272m.add(new C2197e.d(((B) dVar3.g()).l((B) dVarE.g()), dVarE.h(), dVarE.f()));
            }
        }
        while (iF <= c2197e.j().length() && !c2272m.isEmpty()) {
            C2197e.d dVar4 = (C2197e.d) c2272m.last();
            arrayList.add(new C2197e.d(dVar4.g(), iF, dVar4.f()));
            iF = dVar4.f();
            while (!c2272m.isEmpty() && iF == ((C2197e.d) c2272m.last()).f()) {
                c2272m.removeLast();
            }
        }
        if (iF < c2197e.j().length()) {
            arrayList.add(new C2197e.d(b10, iF, c2197e.j().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C2197e.d(b10, 0, 0));
        }
        return arrayList;
    }

    public static final C2197e l(C2197e c2197e, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = c2197e.j().substring(i10, i11);
            AbstractC5504s.g(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List listH = h(c2197e, i10, i11, new Function1() { // from class: U0.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC2201g.m((C2197e.a) obj));
            }
        });
        if (listH == null) {
            listH = AbstractC2279u.m();
        }
        return new C2197e(strSubstring, listH);
    }

    public static final boolean m(C2197e.a aVar) {
        return !(aVar instanceof B);
    }
}
