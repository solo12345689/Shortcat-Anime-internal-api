package d0;

import Ud.AbstractC2268i;
import b0.f;
import f0.C4748b;
import f0.C4751e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC2268i implements f.a {

    /* JADX INFO: renamed from: a */
    private C4553d f44909a;

    /* JADX INFO: renamed from: b */
    private C4751e f44910b = new C4751e();

    /* JADX INFO: renamed from: c */
    private t f44911c;

    /* JADX INFO: renamed from: d */
    private Object f44912d;

    /* JADX INFO: renamed from: e */
    private int f44913e;

    /* JADX INFO: renamed from: f */
    private int f44914f;

    public f(C4553d c4553d) {
        this.f44909a = c4553d;
        this.f44911c = this.f44909a.q();
        this.f44914f = this.f44909a.size();
    }

    @Override // Ud.AbstractC2268i
    public Set a() {
        return new h(this);
    }

    @Override // Ud.AbstractC2268i
    public Set b() {
        return new j(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f44926e.a();
        AbstractC5504s.f(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f44911c = tVarA;
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f44911c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Ud.AbstractC2268i
    public int d() {
        return this.f44914f;
    }

    @Override // Ud.AbstractC2268i
    public Collection e() {
        return new l(this);
    }

    @Override // b0.f.a
    /* JADX INFO: renamed from: f */
    public C4553d build() {
        C4553d c4553d;
        if (this.f44911c == this.f44909a.q()) {
            c4553d = this.f44909a;
        } else {
            this.f44910b = new C4751e();
            c4553d = new C4553d(this.f44911c, size());
        }
        this.f44909a = c4553d;
        return c4553d;
    }

    public final int g() {
        return this.f44913e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f44911c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final t i() {
        return this.f44911c;
    }

    public final C4751e j() {
        return this.f44910b;
    }

    public final void k(int i10) {
        this.f44913e = i10;
    }

    public final void l(Object obj) {
        this.f44912d = obj;
    }

    protected final void m(C4751e c4751e) {
        this.f44910b = c4751e;
    }

    public void n(int i10) {
        this.f44914f = i10;
        this.f44913e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f44912d = null;
        this.f44911c = this.f44911c.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f44912d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        C4553d c4553dBuild = map instanceof C4553d ? (C4553d) map : null;
        if (c4553dBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            c4553dBuild = fVar != null ? fVar.build() : null;
        }
        if (c4553dBuild == null) {
            super.putAll(map);
            return;
        }
        C4748b c4748b = new C4748b(0, 1, null);
        int size = size();
        t tVar = this.f44911c;
        t tVarQ = c4553dBuild.q();
        AbstractC5504s.f(tVarQ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f44911c = tVar.E(tVarQ, 0, c4748b, this);
        int size2 = (c4553dBuild.size() + size) - c4748b.a();
        if (size != size2) {
            n(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f44912d = null;
        t tVarG = this.f44911c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = t.f44926e.a();
            AbstractC5504s.f(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f44911c = tVarG;
        return this.f44912d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f44911c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f44926e.a();
            AbstractC5504s.f(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f44911c = tVarH;
        return size != size();
    }
}
