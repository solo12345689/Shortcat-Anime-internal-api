package qe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6025o;
import se.AbstractC6453A;
import se.C6475X;
import se.C6494i0;
import ye.InterfaceC7234l;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: qe.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6173c {
    public static final Collection a(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Collection collectionL = ((C6475X.a) ((C6475X) interfaceC6014d).a0().getValue()).L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionL) {
            AbstractC6453A abstractC6453A = (AbstractC6453A) obj;
            if (e(abstractC6453A) && (abstractC6453A instanceof InterfaceC6025o)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Collection b(InterfaceC6014d interfaceC6014d) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Collection collectionH = ((C6475X.a) ((C6475X) interfaceC6014d).a0().getValue()).H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionH) {
            AbstractC6453A abstractC6453A = (AbstractC6453A) obj;
            if (e(abstractC6453A) && (abstractC6453A instanceof InterfaceC6025o)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final InterfaceC6018h c(InterfaceC6014d interfaceC6014d) {
        Object next;
        AbstractC5504s.h(interfaceC6014d, "<this>");
        Iterator it = ((C6475X) interfaceC6014d).i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC6018h interfaceC6018h = (InterfaceC6018h) next;
            AbstractC5504s.f(interfaceC6018h, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            InterfaceC7247z interfaceC7247zB0 = ((C6494i0) interfaceC6018h).b0();
            AbstractC5504s.f(interfaceC7247zB0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((InterfaceC7234l) interfaceC7247zB0).e0()) {
                break;
            }
        }
        return (InterfaceC6018h) next;
    }

    private static final boolean d(AbstractC6453A abstractC6453A) {
        return abstractC6453A.b0().O() != null;
    }

    private static final boolean e(AbstractC6453A abstractC6453A) {
        return !d(abstractC6453A);
    }
}
