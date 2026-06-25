package i0;

import b0.AbstractC2964a;
import b0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import je.InterfaceC5375e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4963G implements InterfaceC4976U, Map, InterfaceC5375e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC4978W f48396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f48397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f48398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection f48399d;

    /* JADX INFO: renamed from: i0.G$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC4978W {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b0.f f48400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48401d;

        public a(long j10, b0.f fVar) {
            super(j10);
            this.f48400c = fVar;
        }

        @Override // i0.AbstractC4978W
        public void c(AbstractC4978W abstractC4978W) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) abstractC4978W;
            synchronized (AbstractC4964H.f48402a) {
                this.f48400c = aVar.f48400c;
                this.f48401d = aVar.f48401d;
                Td.L l10 = Td.L.f17438a;
            }
        }

        @Override // i0.AbstractC4978W
        public AbstractC4978W d(long j10) {
            return new a(j10, this.f48400c);
        }

        public final b0.f i() {
            return this.f48400c;
        }

        public final int j() {
            return this.f48401d;
        }

        public final void k(b0.f fVar) {
            this.f48400c = fVar;
        }

        public final void l(int i10) {
            this.f48401d = i10;
        }
    }

    public C4963G() {
        b0.f fVarA = AbstractC2964a.a();
        AbstractC4993l abstractC4993lM = AbstractC5003v.M();
        a aVar = new a(abstractC4993lM.i(), fVarA);
        if (!(abstractC4993lM instanceof C4983b)) {
            aVar.g(new a(AbstractC4998q.c(1), fVarA));
        }
        this.f48396a = aVar;
        this.f48397b = new C5004w(this);
        this.f48398c = new C5005x(this);
        this.f48399d = new C5007z(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(a aVar, int i10, b0.f fVar) {
        boolean z10;
        synchronized (AbstractC4964H.f48402a) {
            if (aVar.j() == i10) {
                aVar.k(fVar);
                z10 = true;
                aVar.l(aVar.j() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private final int d(a aVar, b0.f fVar) {
        int iJ;
        synchronized (AbstractC4964H.f48402a) {
            aVar.k(fVar);
            iJ = aVar.j();
            aVar.l(iJ + 1);
        }
        return iJ;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC4993l abstractC4993lC;
        AbstractC4978W abstractC4978WL = l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) AbstractC5003v.K((a) abstractC4978WL);
        aVar.i();
        b0.f fVarA = AbstractC2964a.a();
        if (fVarA != aVar.i()) {
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                d((a) AbstractC5003v.p0(aVar2, this, abstractC4993lC), fVarA);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return j().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return j().i().containsValue(obj);
    }

    public Set e() {
        return this.f48397b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return e();
    }

    public Set f() {
        return this.f48398c;
    }

    public final int g() {
        return j().j();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return j().i().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return j().i().isEmpty();
    }

    public final a j() {
        AbstractC4978W abstractC4978WL = l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) AbstractC5003v.e0((a) abstractC4978WL, this);
    }

    public int k() {
        return j().i().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return f();
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f48396a;
    }

    public Collection m() {
        return this.f48399d;
    }

    public final boolean n(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5504s.c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        b0.f fVarI;
        int iJ;
        Object objPut;
        AbstractC4993l abstractC4993lC;
        boolean zB;
        do {
            synchronized (AbstractC4964H.f48402a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC5003v.K((a) abstractC4978WL);
                fVarI = aVar.i();
                iJ = aVar.j();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(fVarI);
            f.a aVarBuilder = fVarI.builder();
            objPut = aVarBuilder.put(obj, obj2);
            b0.f fVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(fVarBuild, fVarI)) {
                break;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zB = b((a) AbstractC5003v.p0(aVar2, this, abstractC4993lC), iJ, fVarBuild);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b0.f fVarI;
        int iJ;
        AbstractC4993l abstractC4993lC;
        boolean zB;
        do {
            synchronized (AbstractC4964H.f48402a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC5003v.K((a) abstractC4978WL);
                fVarI = aVar.i();
                iJ = aVar.j();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(fVarI);
            f.a aVarBuilder = fVarI.builder();
            aVarBuilder.putAll(map);
            b0.f fVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(fVarBuild, fVarI)) {
                return;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zB = b((a) AbstractC5003v.p0(aVar2, this, abstractC4993lC), iJ, fVarBuild);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zB);
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f48396a = (a) abstractC4978W;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        b0.f fVarI;
        int iJ;
        Object objRemove;
        AbstractC4993l abstractC4993lC;
        boolean zB;
        do {
            synchronized (AbstractC4964H.f48402a) {
                AbstractC4978W abstractC4978WL = l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC5003v.K((a) abstractC4978WL);
                fVarI = aVar.i();
                iJ = aVar.j();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(fVarI);
            f.a aVarBuilder = fVarI.builder();
            objRemove = aVarBuilder.remove(obj);
            b0.f fVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(fVarBuild, fVarI)) {
                break;
            }
            AbstractC4978W abstractC4978WL2 = l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zB = b((a) AbstractC5003v.p0(aVar2, this, abstractC4993lC), iJ, fVarBuild);
            }
            AbstractC5003v.X(abstractC4993lC, this);
        } while (!zB);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return k();
    }

    public String toString() {
        AbstractC4978W abstractC4978WL = l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) AbstractC5003v.K((a) abstractC4978WL)).i() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m();
    }
}
