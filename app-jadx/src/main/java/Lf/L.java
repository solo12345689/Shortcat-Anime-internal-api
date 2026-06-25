package Lf;

import Gf.Y0;
import Zd.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f11553a = new E("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f11554b = new Function2() { // from class: Lf.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.d(obj, (i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f11555c = new Function2() { // from class: Lf.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.e((Y0) obj, (i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f11556d = new Function2() { // from class: Lf.K
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.h((P) obj, (i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, i.b bVar) {
        if (!(bVar instanceof Y0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y0 e(Y0 y02, i.b bVar) {
        if (y02 != null) {
            return y02;
        }
        if (bVar instanceof Y0) {
            return (Y0) bVar;
        }
        return null;
    }

    public static final void f(Zd.i iVar, Object obj) {
        if (obj == f11553a) {
            return;
        }
        if (obj instanceof P) {
            ((P) obj).b(iVar);
            return;
        }
        Object objY1 = iVar.y1(null, f11555c);
        AbstractC5504s.f(objY1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Y0) objY1).F0(iVar, obj);
    }

    public static final Object g(Zd.i iVar) {
        Object objY1 = iVar.y1(0, f11554b);
        AbstractC5504s.e(objY1);
        return objY1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P h(P p10, i.b bVar) {
        if (bVar instanceof Y0) {
            Y0 y02 = (Y0) bVar;
            p10.a(y02, y02.o(p10.f11559a));
        }
        return p10;
    }

    public static final Object i(Zd.i iVar, Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f11553a;
        }
        if (obj instanceof Integer) {
            return iVar.y1(new P(iVar, ((Number) obj).intValue()), f11556d);
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Y0) obj).o(iVar);
    }
}
