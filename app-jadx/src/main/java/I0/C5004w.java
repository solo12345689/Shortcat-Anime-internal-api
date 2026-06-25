package i0;

import Td.C2160k;
import Ud.AbstractC2279u;
import b0.InterfaceC2967d;
import b0.f;
import i0.C4963G;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: i0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5004w extends AbstractC5006y {
    public C5004w(C4963G c4963g) {
        super(c4963g);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) f(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (kotlin.jvm.internal.V.n(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void e(Map.Entry entry) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    public Void f(Collection collection) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    public boolean i(Map.Entry entry) {
        return AbstractC5504s.c(b().get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C4972P(b(), ((InterfaceC2967d) b().j().i().entrySet()).iterator());
    }

    public boolean l(Map.Entry entry) {
        return b().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (kotlin.jvm.internal.V.n(obj)) {
            return l((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (b().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        b0.f fVarI;
        int iJ;
        AbstractC4993l abstractC4993lC;
        boolean zB;
        Collection<Map.Entry> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(collection2, 10)), 16));
        for (Map.Entry entry : collection2) {
            Pair pairA = Td.z.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        C4963G c4963gB = b();
        boolean z10 = false;
        do {
            synchronized (AbstractC4964H.f48402a) {
                AbstractC4978W abstractC4978WL = c4963gB.l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C4963G.a aVar = (C4963G.a) AbstractC5003v.K((C4963G.a) abstractC4978WL);
                fVarI = aVar.i();
                iJ = aVar.j();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(fVarI);
            f.a aVarBuilder = fVarI.builder();
            for (Map.Entry entry2 : c4963gB.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC5504s.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            Td.L l11 = Td.L.f17438a;
            b0.f fVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(fVarBuild, fVarI)) {
                break;
            }
            AbstractC4978W abstractC4978WL2 = c4963gB.l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C4963G.a aVar2 = (C4963G.a) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zB = c4963gB.b((C4963G.a) AbstractC5003v.p0(aVar2, c4963gB, abstractC4993lC), iJ, fVarBuild);
            }
            AbstractC5003v.X(abstractC4993lC, c4963gB);
        } while (!zB);
        return z10;
    }
}
