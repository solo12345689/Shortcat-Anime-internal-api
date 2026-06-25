package Y0;

import Td.u;
import Ud.AbstractC2279u;
import Y0.C2479n;
import Y0.F;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair b(List list, q0 q0Var, C2479n c2479n, U u10, Function1 function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objB;
        Object objG;
        int size = list.size();
        List listS = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC2484t interfaceC2484t = (InterfaceC2484t) list.get(i10);
            int iA = interfaceC2484t.a();
            F.a aVar = F.f22590a;
            if (F.e(iA, aVar.b())) {
                synchronized (c2479n.f22699d) {
                    try {
                        C2479n.b bVar = new C2479n.b(interfaceC2484t, u10.a());
                        C2479n.a aVar2 = (C2479n.a) c2479n.f22697b.d(bVar);
                        if (aVar2 == null) {
                            aVar2 = (C2479n.a) c2479n.f22698c.e(bVar);
                        }
                        if (aVar2 != null) {
                            objInvoke2 = aVar2.g();
                        } else {
                            Td.L l10 = Td.L.f17438a;
                            try {
                                objInvoke = u10.b(interfaceC2484t);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(q0Var);
                            }
                            Object obj = objInvoke;
                            C2479n.f(c2479n, interfaceC2484t, u10, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = function1.invoke(q0Var);
                }
                return Td.z.a(listS, J.a(q0Var.e(), objInvoke2, interfaceC2484t, q0Var.f(), q0Var.d()));
            }
            if (F.e(iA, aVar.c())) {
                synchronized (c2479n.f22699d) {
                    try {
                        C2479n.b bVar2 = new C2479n.b(interfaceC2484t, u10.a());
                        C2479n.a aVar3 = (C2479n.a) c2479n.f22697b.d(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (C2479n.a) c2479n.f22698c.e(bVar2);
                        }
                        if (aVar3 != null) {
                            objG = aVar3.g();
                        } else {
                            Td.L l11 = Td.L.f17438a;
                            try {
                                u.a aVar4 = Td.u.f17466b;
                                objB = Td.u.b(u10.b(interfaceC2484t));
                            } catch (Throwable th3) {
                                u.a aVar5 = Td.u.f17466b;
                                objB = Td.u.b(Td.v.a(th3));
                            }
                            Object obj2 = Td.u.g(objB) ? null : objB;
                            C2479n.f(c2479n, interfaceC2484t, u10, obj2, false, 8, null);
                            objG = obj2;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objG != null) {
                    return Td.z.a(listS, J.a(q0Var.e(), objG, interfaceC2484t, q0Var.f(), q0Var.d()));
                }
            } else {
                if (!F.e(iA, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC2484t);
                }
                C2479n.a aVarD = c2479n.d(interfaceC2484t, u10);
                if (aVarD != null) {
                    if (!C2479n.a.e(aVarD.g()) && aVarD.g() != null) {
                        return Td.z.a(listS, J.a(q0Var.e(), aVarD.g(), interfaceC2484t, q0Var.f(), q0Var.d()));
                    }
                } else if (listS == null) {
                    listS = AbstractC2279u.s(interfaceC2484t);
                } else {
                    listS.add(interfaceC2484t);
                }
            }
        }
        return Td.z.a(listS, function1.invoke(q0Var));
    }
}
