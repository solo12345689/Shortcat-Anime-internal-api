package com.facebook.react.views.scroll;

import android.graphics.Rect;
import h7.C4914b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.InterfaceC5372b;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Collection, InterfaceC5372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f38003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f38004c = new LinkedHashMap();

    public d(boolean z10) {
        this.f38002a = z10;
    }

    static /* synthetic */ b A(d dVar, Rect rect, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return dVar.z(rect, str);
    }

    private final c D(c cVar) {
        c cVarE = cVar.e();
        if (cVarE == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's right must not be null when rotating left.");
        }
        c cVarC = cVarE.c();
        cVarE.i(cVar);
        cVar.k(cVarC);
        G(cVar);
        I(cVar);
        G(cVarE);
        I(cVarE);
        return cVarE;
    }

    private final c F(c cVar) {
        c cVarC = cVar.c();
        if (cVarC == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's left must not be null when rotating right.");
        }
        c cVarE = cVarC.e();
        cVarC.k(cVar);
        cVar.i(cVarE);
        G(cVar);
        I(cVar);
        G(cVarC);
        I(cVarC);
        return cVarC;
    }

    private final void G(c cVar) {
        cVar.g(Math.max(t(cVar.c()), t(cVar.e())) + 1);
    }

    private final void I(c cVar) {
        int iA = cVar.b().a();
        c cVarC = cVar.c();
        int iD = cVarC != null ? cVarC.d() : Integer.MIN_VALUE;
        c cVarE = cVar.e();
        cVar.j(Math.max(iA, Math.max(iD, cVarE != null ? cVarE.d() : Integer.MIN_VALUE)));
    }

    private final c d(c cVar) {
        G(cVar);
        I(cVar);
        int iE = e(cVar);
        if (iE > 1) {
            if (e(cVar.c()) < 0) {
                c cVarC = cVar.c();
                if (cVarC == null) {
                    throw new IllegalArgumentException("[IntervalTree] node.left must not be null when performing left rotation around it");
                }
                cVar.i(D(cVarC));
            }
            return F(cVar);
        }
        if (iE >= -1) {
            return cVar;
        }
        if (e(cVar.e()) > 0) {
            c cVarE = cVar.e();
            if (cVarE == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when performing right rotation around it");
            }
            cVar.k(F(cVarE));
        }
        return D(cVar);
    }

    private final int e(c cVar) {
        if (cVar == null) {
            return 0;
        }
        return t(cVar.c()) - t(cVar.e());
    }

    private final int f(b bVar, b bVar2) {
        return bVar.c() != bVar2.c() ? AbstractC5504s.i(bVar.c(), bVar2.c()) : bVar.a() != bVar2.a() ? AbstractC5504s.i(bVar.a(), bVar2.a()) : bVar.b().compareTo(bVar2.b());
    }

    private final c l(c cVar, c cVar2) {
        if (cVar == null) {
            return null;
        }
        if (f(cVar2.b(), cVar.b()) < 0) {
            cVar.i(l(cVar.c(), cVar2));
        } else if (f(cVar2.b(), cVar.b()) > 0) {
            cVar.k(l(cVar.e(), cVar2));
        } else if (cVar.c() == null) {
            cVar = cVar.e();
        } else if (cVar.e() == null) {
            cVar = cVar.c();
        } else {
            c cVarE = cVar.e();
            if (cVarE == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when finding node's successor");
            }
            c cVarN = n(cVarE);
            cVar.l(cVarN.f());
            cVar.h(cVarN.b());
            cVar.k(l(cVar.e(), cVarN));
        }
        if (cVar == null) {
            return null;
        }
        return d(cVar);
    }

    private final c n(c cVar) {
        c cVarN;
        c cVarC = cVar.c();
        return (cVarC == null || (cVarN = n(cVarC)) == null) ? cVar : cVarN;
    }

    private final int t(c cVar) {
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    private final void u(c cVar, List list) {
        if (cVar == null) {
            return;
        }
        u(cVar.c(), list);
        list.add(cVar.f());
        u(cVar.e(), list);
    }

    private final c v(c cVar, c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        if (f(cVar2.b(), cVar.b()) < 0) {
            cVar.i(v(cVar.c(), cVar2));
        } else {
            cVar.k(v(cVar.e(), cVar2));
        }
        return d(cVar);
    }

    private final void y(c cVar, b bVar, Set set) {
        r rVarF;
        r rVarF2;
        if (t.a() && C4914b.B()) {
            String str = "VirtualViewContainerStateExperimental:queryHelper";
            Rect containerRelativeRect = null;
            String virtualViewID = (cVar == null || (rVarF2 = cVar.f()) == null) ? null : rVarF2.getVirtualViewID();
            if (cVar != null && (rVarF = cVar.f()) != null) {
                containerRelativeRect = rVarF.getContainerRelativeRect();
            }
            AbstractC7283a.b(str, "Check node (" + virtualViewID + ", " + containerRelativeRect + ") against interval(" + bVar.c() + ", " + bVar.a() + ")");
        }
        if (cVar == null || cVar.d() <= bVar.c()) {
            return;
        }
        y(cVar.c(), bVar, set);
        if (cVar.b().d(bVar)) {
            set.add(cVar.f().getVirtualViewID());
        }
        if (cVar.b().c() < bVar.a()) {
            y(cVar.e(), bVar, set);
        }
    }

    private final b z(Rect rect, String str) {
        if (this.f38002a) {
            int i10 = rect.left;
            int i11 = rect.right;
            if (str == null) {
                str = "";
            }
            return new b(i10, i11, str);
        }
        int i12 = rect.top;
        int i13 = rect.bottom;
        if (str == null) {
            str = "";
        }
        return new b(i12, i13, str);
    }

    public boolean B(r element) {
        AbstractC5504s.h(element, "element");
        c cVar = (c) this.f38004c.get(element.getVirtualViewID());
        if (cVar == null) {
            return false;
        }
        this.f38003b = l(this.f38003b, cVar);
        this.f38004c.remove(element.getVirtualViewID());
        return true;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add((r) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(r element) {
        boolean z10;
        AbstractC5504s.h(element, "element");
        String virtualViewID = element.getVirtualViewID();
        c cVar = (c) this.f38004c.get(virtualViewID);
        if (cVar != null) {
            this.f38003b = l(this.f38003b, cVar);
            z10 = false;
        } else {
            z10 = true;
        }
        c cVar2 = new c(z(element.getContainerRelativeRect(), virtualViewID), element, 0, 0, null, null, 60, null);
        this.f38003b = v(this.f38003b, cVar2);
        this.f38004c.put(virtualViewID, cVar2);
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:IntervalTree: add", "New VirtualView: (" + element.getVirtualViewID() + ", " + element.getContainerRelativeRect() + "). Node interval " + cVar2.b().b());
        }
        return z10;
    }

    @Override // java.util.Collection
    public void clear() {
        this.f38003b = null;
        this.f38004c.clear();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof r) {
            return i((r) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((r) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean i(r element) {
        AbstractC5504s.h(element, "element");
        return this.f38004c.containsKey(element.getVirtualViewID());
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        u(this.f38003b, arrayList);
        return arrayList.iterator();
    }

    public int p() {
        return this.f38004c.size();
    }

    public final r r(String virtualViewID) {
        AbstractC5504s.h(virtualViewID, "virtualViewID");
        c cVar = (c) this.f38004c.get(virtualViewID);
        if (cVar != null) {
            return cVar.f();
        }
        return null;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof r) {
            return B((r) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (remove((r) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        throw new Error("IntervalTree does not support retainAll yet");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return p();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public final Set w(Rect queryRect) {
        AbstractC5504s.h(queryRect, "queryRect");
        b bVarA = A(this, queryRect, null, 2, null);
        HashSet hashSet = new HashSet();
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:query", "Querying tree for rect " + queryRect);
        }
        y(this.f38003b, bVarA, hashSet);
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:query", "Query results: " + hashSet);
        }
        return hashSet;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
