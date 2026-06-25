package Zd;

import Zd.f;
import Zd.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static i b(i iVar, i context) {
            AbstractC5504s.h(context, "context");
            return context == j.f23275a ? iVar : (i) context.y1(iVar, new Function2() { // from class: Zd.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.a.c((i) obj, (i.b) obj2);
                }
            });
        }

        public static i c(i acc, b element) {
            AbstractC5504s.h(acc, "acc");
            AbstractC5504s.h(element, "element");
            i iVarA1 = acc.a1(element.getKey());
            j jVar = j.f23275a;
            if (iVarA1 == jVar) {
                return element;
            }
            f.b bVar = f.f23273S;
            f fVar = (f) iVarA1.l(bVar);
            if (fVar == null) {
                return new d(iVarA1, element);
            }
            i iVarA12 = iVarA1.a1(bVar);
            return iVarA12 == jVar ? new d(element, fVar) : new d(new d(iVarA12, element), fVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b extends i {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public static Object a(b bVar, Object obj, Function2 operation) {
                AbstractC5504s.h(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC5504s.h(key, "key");
                if (!AbstractC5504s.c(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC5504s.f(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c key) {
                AbstractC5504s.h(key, "key");
                return AbstractC5504s.c(bVar.getKey(), key) ? j.f23275a : bVar;
            }

            public static i d(b bVar, i context) {
                AbstractC5504s.h(context, "context");
                return a.b(bVar, context);
            }
        }

        c getKey();

        @Override // Zd.i
        b l(c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
    }

    i a1(c cVar);

    b l(c cVar);

    i w(i iVar);

    Object y1(Object obj, Function2 function2);
}
