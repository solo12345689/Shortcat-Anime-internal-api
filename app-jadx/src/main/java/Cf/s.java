package Cf;

import Ud.AbstractC2273n;
import ie.InterfaceC5082a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s extends n {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f3117a;

        public a(Iterator it) {
            this.f3117a = it;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return this.f3117a;
        }
    }

    public static i g(Iterator it) {
        AbstractC5504s.h(it, "<this>");
        return h(new a(it));
    }

    public static i h(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return iVar instanceof Cf.a ? iVar : new Cf.a(iVar);
    }

    public static i i() {
        return e.f3090a;
    }

    public static final i j(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return k(iVar, new Function1() { // from class: Cf.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.l((i) obj);
            }
        });
    }

    private static final i k(i iVar, Function1 function1) {
        return iVar instanceof z ? ((z) iVar).e(function1) : new g(iVar, new Function1() { // from class: Cf.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.m(obj);
            }
        }, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator l(i it) {
        AbstractC5504s.h(it, "it");
        return it.iterator();
    }

    public static i n(final InterfaceC5082a nextFunction) {
        AbstractC5504s.h(nextFunction, "nextFunction");
        return h(new h(nextFunction, new Function1() { // from class: Cf.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.q(nextFunction, obj);
            }
        }));
    }

    public static i o(InterfaceC5082a seedFunction, Function1 nextFunction) {
        AbstractC5504s.h(seedFunction, "seedFunction");
        AbstractC5504s.h(nextFunction, "nextFunction");
        return new h(seedFunction, nextFunction);
    }

    public static i p(final Object obj, Function1 nextFunction) {
        AbstractC5504s.h(nextFunction, "nextFunction");
        return obj == null ? e.f3090a : new h(new InterfaceC5082a() { // from class: Cf.o
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return s.r(obj);
            }
        }, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(InterfaceC5082a interfaceC5082a, Object it) {
        AbstractC5504s.h(it, "it");
        return interfaceC5082a.invoke();
    }

    public static i s(Object... elements) {
        AbstractC5504s.h(elements, "elements");
        return AbstractC2273n.M(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(Object obj) {
        return obj;
    }
}
