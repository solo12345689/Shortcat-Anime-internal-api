package Jf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f9585a = new Function1() { // from class: Jf.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return n.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f9586b = new Function2() { // from class: Jf.m
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(n.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return AbstractC5504s.c(obj, obj2);
    }

    public static final InterfaceC1742e e(InterfaceC1742e interfaceC1742e) {
        return interfaceC1742e instanceof I ? interfaceC1742e : f(interfaceC1742e, f9585a, f9586b);
    }

    private static final InterfaceC1742e f(InterfaceC1742e interfaceC1742e, Function1 function1, Function2 function2) {
        if (interfaceC1742e instanceof C1741d) {
            C1741d c1741d = (C1741d) interfaceC1742e;
            if (c1741d.f9570b == function1 && c1741d.f9571c == function2) {
                return interfaceC1742e;
            }
        }
        return new C1741d(interfaceC1742e, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }
}
