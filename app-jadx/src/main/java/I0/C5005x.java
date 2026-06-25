package i0;

import Td.C2160k;
import Ud.AbstractC2279u;
import b0.InterfaceC2967d;
import b0.f;
import i0.C4963G;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5005x extends AbstractC5006y {
    public C5005x(C4963G c4963g) {
        super(c4963g);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) e(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) f(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!b().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void e(Object obj) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    public Void f(Collection collection) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C4974S iterator() {
        return new C4974S(b(), ((InterfaceC2967d) b().j().i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return b().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (b().remove(it.next()) != null || z10) {
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
        Set setF1 = AbstractC2279u.f1(collection);
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
            for (Map.Entry entry : c4963gB.entrySet()) {
                if (!setF1.contains(entry.getKey())) {
                    aVarBuilder.remove(entry.getKey());
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
