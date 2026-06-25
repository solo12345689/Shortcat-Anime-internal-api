package re;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6013c;
import pe.InterfaceC6018h;
import pe.InterfaceC6019i;
import pe.InterfaceC6023m;
import se.AbstractC6453A;
import se.j1;
import te.h;

/* JADX INFO: renamed from: re.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6308a {
    public static final boolean a(InterfaceC6013c interfaceC6013c) {
        h hVarV;
        AbstractC5504s.h(interfaceC6013c, "<this>");
        if (interfaceC6013c instanceof InterfaceC6019i) {
            InterfaceC6023m interfaceC6023m = (InterfaceC6023m) interfaceC6013c;
            Field fieldB = c.b(interfaceC6023m);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = c.c(interfaceC6023m);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = c.e((InterfaceC6019i) interfaceC6013c);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (interfaceC6013c instanceof InterfaceC6023m) {
            InterfaceC6023m interfaceC6023m2 = (InterfaceC6023m) interfaceC6013c;
            Field fieldB2 = c.b(interfaceC6023m2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = c.c(interfaceC6023m2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (interfaceC6013c instanceof InterfaceC6023m.b) {
            Field fieldB3 = c.b(((InterfaceC6023m.b) interfaceC6013c).j());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = c.d((InterfaceC6018h) interfaceC6013c);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (interfaceC6013c instanceof InterfaceC6019i.a) {
            Field fieldB4 = c.b(((InterfaceC6019i.a) interfaceC6013c).j());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = c.d((InterfaceC6018h) interfaceC6013c);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(interfaceC6013c instanceof InterfaceC6018h)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC6013c + " (" + interfaceC6013c.getClass() + ')');
        }
        InterfaceC6018h interfaceC6018h = (InterfaceC6018h) interfaceC6013c;
        Method methodD3 = c.d(interfaceC6018h);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            AbstractC6453A abstractC6453AB = j1.b(interfaceC6013c);
            Member memberB = (abstractC6453AB == null || (hVarV = abstractC6453AB.V()) == null) ? null : hVarV.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = c.a(interfaceC6018h);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(InterfaceC6013c interfaceC6013c, boolean z10) {
        h hVarV;
        AbstractC5504s.h(interfaceC6013c, "<this>");
        if (interfaceC6013c instanceof InterfaceC6019i) {
            InterfaceC6023m interfaceC6023m = (InterfaceC6023m) interfaceC6013c;
            Field fieldB = c.b(interfaceC6023m);
            if (fieldB != null) {
                fieldB.setAccessible(z10);
            }
            Method methodC = c.c(interfaceC6023m);
            if (methodC != null) {
                methodC.setAccessible(z10);
            }
            Method methodE = c.e((InterfaceC6019i) interfaceC6013c);
            if (methodE != null) {
                methodE.setAccessible(z10);
                return;
            }
            return;
        }
        if (interfaceC6013c instanceof InterfaceC6023m) {
            InterfaceC6023m interfaceC6023m2 = (InterfaceC6023m) interfaceC6013c;
            Field fieldB2 = c.b(interfaceC6023m2);
            if (fieldB2 != null) {
                fieldB2.setAccessible(z10);
            }
            Method methodC2 = c.c(interfaceC6023m2);
            if (methodC2 != null) {
                methodC2.setAccessible(z10);
                return;
            }
            return;
        }
        if (interfaceC6013c instanceof InterfaceC6023m.b) {
            Field fieldB3 = c.b(((InterfaceC6023m.b) interfaceC6013c).j());
            if (fieldB3 != null) {
                fieldB3.setAccessible(z10);
            }
            Method methodD = c.d((InterfaceC6018h) interfaceC6013c);
            if (methodD != null) {
                methodD.setAccessible(z10);
                return;
            }
            return;
        }
        if (interfaceC6013c instanceof InterfaceC6019i.a) {
            Field fieldB4 = c.b(((InterfaceC6019i.a) interfaceC6013c).j());
            if (fieldB4 != null) {
                fieldB4.setAccessible(z10);
            }
            Method methodD2 = c.d((InterfaceC6018h) interfaceC6013c);
            if (methodD2 != null) {
                methodD2.setAccessible(z10);
                return;
            }
            return;
        }
        if (!(interfaceC6013c instanceof InterfaceC6018h)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC6013c + " (" + interfaceC6013c.getClass() + ')');
        }
        InterfaceC6018h interfaceC6018h = (InterfaceC6018h) interfaceC6013c;
        Method methodD3 = c.d(interfaceC6018h);
        if (methodD3 != null) {
            methodD3.setAccessible(z10);
        }
        AbstractC6453A abstractC6453AB = j1.b(interfaceC6013c);
        Member memberB = (abstractC6453AB == null || (hVarV = abstractC6453AB.V()) == null) ? null : hVarV.b();
        AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorA = c.a(interfaceC6018h);
        if (constructorA != null) {
            constructorA.setAccessible(z10);
        }
    }
}
