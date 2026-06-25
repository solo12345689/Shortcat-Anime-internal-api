package Xb;

import Ud.S;
import he.AbstractC4945a;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private final a e(Class cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new a() { // from class: Xb.c
                @Override // Xb.a
                public final Object a() {
                    return e.f(declaredConstructor);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Constructor constructor) {
        return constructor.newInstance(null);
    }

    private final a g(InterfaceC6014d interfaceC6014d) {
        Iterator it = interfaceC6014d.i().iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                List parameters = ((InterfaceC6018h) next).getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((InterfaceC6022l) it2.next()).p()) {
                            break;
                        }
                    }
                }
                if (z10) {
                    break;
                }
                z10 = true;
                obj = next;
            }
        }
        obj = null;
        final InterfaceC6018h interfaceC6018h = (InterfaceC6018h) obj;
        if (interfaceC6018h == null) {
            return null;
        }
        return new a() { // from class: Xb.d
            @Override // Xb.a
            public final Object a() {
                return e.h(interfaceC6018h);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(InterfaceC6018h interfaceC6018h) {
        return interfaceC6018h.callBy(S.i());
    }

    private final a i(Class cls) {
        final i iVarD = i.f21741a.d(cls);
        return new a() { // from class: Xb.b
            @Override // Xb.a
            public final Object a() {
                return e.j(iVarD);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(i iVar) {
        return iVar.b();
    }

    public final a d(InterfaceC6014d clazz) {
        AbstractC5504s.h(clazz, "clazz");
        a aVarE = e(AbstractC4945a.b(clazz));
        return (aVarE == null && (aVarE = g(clazz)) == null) ? i(AbstractC4945a.b(clazz)) : aVarE;
    }
}
