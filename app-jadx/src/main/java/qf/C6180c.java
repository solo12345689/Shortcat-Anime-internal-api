package qf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import qf.u0;
import uf.InterfaceC6772d;

/* JADX INFO: renamed from: qf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6180c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6180c f58036a = new C6180c();

    private C6180c() {
    }

    private final boolean c(u0 u0Var, uf.j jVar, uf.p pVar) {
        uf.r rVarJ = u0Var.j();
        if (rVarJ.w(jVar)) {
            return true;
        }
        if (rVarJ.b0(jVar)) {
            return false;
        }
        if (u0Var.o() && rVarJ.s(jVar)) {
            return true;
        }
        return rVarJ.j0(rVarJ.e(jVar), pVar);
    }

    private final boolean e(u0 u0Var, uf.j jVar, uf.j jVar2) {
        uf.r rVarJ = u0Var.j();
        if (C6188g.f58053b) {
            if (!rVarJ.a(jVar) && !rVarJ.y(rVarJ.e(jVar))) {
                u0Var.l(jVar);
            }
            if (!rVarJ.a(jVar2)) {
                u0Var.l(jVar2);
            }
        }
        if (rVarJ.b0(jVar2) || rVarJ.q(jVar) || rVarJ.T(jVar)) {
            return true;
        }
        if ((jVar instanceof InterfaceC6772d) && rVarJ.C0((InterfaceC6772d) jVar)) {
            return true;
        }
        C6180c c6180c = f58036a;
        if (c6180c.a(u0Var, jVar, u0.c.b.f58114a)) {
            return true;
        }
        if (rVarJ.q(jVar2) || c6180c.a(u0Var, jVar2, u0.c.d.f58116a) || rVarJ.x(jVar)) {
            return false;
        }
        return c6180c.b(u0Var, jVar, rVarJ.e(jVar2));
    }

    public final boolean a(u0 u0Var, uf.j type, u0.c supertypesPolicy) {
        AbstractC5504s.h(u0Var, "<this>");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(supertypesPolicy, "supertypesPolicy");
        uf.r rVarJ = u0Var.j();
        if ((rVarJ.x(type) && !rVarJ.b0(type)) || rVarJ.q(type)) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC5504s.e(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC5504s.e(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            uf.j jVar = (uf.j) arrayDequeH.pop();
            AbstractC5504s.e(jVar);
            if (setI.add(jVar)) {
                u0.c cVar = rVarJ.b0(jVar) ? u0.c.C0878c.f58115a : supertypesPolicy;
                if (AbstractC5504s.c(cVar, u0.c.C0878c.f58115a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    uf.r rVarJ2 = u0Var.j();
                    Iterator it = rVarJ2.E(rVarJ2.e(jVar)).iterator();
                    while (it.hasNext()) {
                        uf.j jVarA = cVar.a(u0Var, (uf.i) it.next());
                        if ((rVarJ.x(jVarA) && !rVarJ.b0(jVarA)) || rVarJ.q(jVarA)) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    public final boolean b(u0 state, uf.j start, uf.p end) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(start, "start");
        AbstractC5504s.h(end, "end");
        uf.r rVarJ = state.j();
        if (f58036a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC5504s.e(arrayDequeH);
        Set setI = state.i();
        AbstractC5504s.e(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            uf.j jVar = (uf.j) arrayDequeH.pop();
            AbstractC5504s.e(jVar);
            if (setI.add(jVar)) {
                u0.c cVar = rVarJ.b0(jVar) ? u0.c.C0878c.f58115a : u0.c.b.f58114a;
                if (AbstractC5504s.c(cVar, u0.c.C0878c.f58115a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    uf.r rVarJ2 = state.j();
                    Iterator it = rVarJ2.E(rVarJ2.e(jVar)).iterator();
                    while (it.hasNext()) {
                        uf.j jVarA = cVar.a(state, (uf.i) it.next());
                        if (f58036a.c(state, jVarA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(u0 state, uf.j subType, uf.j superType) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return e(state, subType, superType);
    }
}
