package Zd;

import Zd.i;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f23271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i.b f23272b;

    public d(i left, i.b element) {
        AbstractC5504s.h(left, "left");
        AbstractC5504s.h(element, "element");
        this.f23271a = left;
        this.f23272b = element;
    }

    private final boolean c(i.b bVar) {
        return AbstractC5504s.c(l(bVar.getKey()), bVar);
    }

    private final boolean d(d dVar) {
        while (c(dVar.f23272b)) {
            i iVar = dVar.f23271a;
            if (!(iVar instanceof d)) {
                AbstractC5504s.f(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f23271a;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String acc, i.b element) {
        AbstractC5504s.h(acc, "acc");
        AbstractC5504s.h(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    @Override // Zd.i
    public i a1(i.c key) {
        AbstractC5504s.h(key, "key");
        if (this.f23272b.l(key) != null) {
            return this.f23271a;
        }
        i iVarA1 = this.f23271a.a1(key);
        return iVarA1 == this.f23271a ? this : iVarA1 == j.f23275a ? this.f23272b : new d(iVarA1, this.f23272b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.e() == e() && dVar.d(this);
    }

    public int hashCode() {
        return this.f23271a.hashCode() + this.f23272b.hashCode();
    }

    @Override // Zd.i
    public i.b l(i.c key) {
        AbstractC5504s.h(key, "key");
        d dVar = this;
        while (true) {
            i.b bVarL = dVar.f23272b.l(key);
            if (bVarL != null) {
                return bVarL;
            }
            i iVar = dVar.f23271a;
            if (!(iVar instanceof d)) {
                return iVar.l(key);
            }
            dVar = (d) iVar;
        }
    }

    public String toString() {
        return '[' + ((String) y1("", new Function2() { // from class: Zd.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d.f((String) obj, (i.b) obj2);
            }
        })) + ']';
    }

    @Override // Zd.i
    public i w(i iVar) {
        return i.a.b(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 operation) {
        AbstractC5504s.h(operation, "operation");
        return operation.invoke(this.f23271a.y1(obj, operation), this.f23272b);
    }
}
