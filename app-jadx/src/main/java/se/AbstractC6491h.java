package se;

import Ud.AbstractC2279u;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6017g;
import pe.InterfaceC6027q;
import qe.AbstractC6174d;

/* JADX INFO: renamed from: se.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6491h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC6477a f59501a = AbstractC6479b.a(C6481c.f59471a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC6477a f59502b = AbstractC6479b.a(C6483d.f59474a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC6477a f59503c = AbstractC6479b.a(C6485e.f59488a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC6477a f59504d = AbstractC6479b.a(C6487f.f59493a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC6477a f59505e = AbstractC6479b.a(C6489g.f59498a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6027q a(Class it) {
        AbstractC5504s.h(it, "it");
        return AbstractC6174d.b(m(it), AbstractC2279u.m(), false, AbstractC2279u.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        AbstractC5504s.h(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6027q c(Class it) {
        AbstractC5504s.h(it, "it");
        return AbstractC6174d.b(m(it), AbstractC2279u.m(), true, AbstractC2279u.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6475X d(Class it) {
        AbstractC5504s.h(it, "it");
        return new C6475X(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6520v0 e(Class it) {
        AbstractC5504s.h(it, "it");
        return new C6520v0(it);
    }

    public static final InterfaceC6027q k(Class jClass, List arguments, boolean z10) {
        AbstractC5504s.h(jClass, "jClass");
        AbstractC5504s.h(arguments, "arguments");
        return arguments.isEmpty() ? z10 ? (InterfaceC6027q) f59504d.a(jClass) : (InterfaceC6027q) f59503c.a(jClass) : l(jClass, arguments, z10);
    }

    private static final InterfaceC6027q l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f59505e.a(cls);
        Pair pairA = Td.z.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(pairA);
        if (obj == null) {
            InterfaceC6027q interfaceC6027qB = AbstractC6174d.b(m(cls), list, z10, AbstractC2279u.m());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pairA, interfaceC6027qB);
            obj = objPutIfAbsent == null ? interfaceC6027qB : objPutIfAbsent;
        }
        AbstractC5504s.g(obj, "getOrPut(...)");
        return (InterfaceC6027q) obj;
    }

    public static final C6475X m(Class jClass) {
        AbstractC5504s.h(jClass, "jClass");
        Object objA = f59501a.a(jClass);
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C6475X) objA;
    }

    public static final InterfaceC6017g n(Class jClass) {
        AbstractC5504s.h(jClass, "jClass");
        return (InterfaceC6017g) f59502b.a(jClass);
    }
}
