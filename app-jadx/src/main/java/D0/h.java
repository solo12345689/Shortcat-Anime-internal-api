package d0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC4550a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f44919a;

    public h(f fVar) {
        this.f44919a = fVar;
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f44919a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f44919a.clear();
    }

    @Override // d0.AbstractC4550a
    public boolean e(Map.Entry entry) {
        Object obj = this.f44919a.get(entry.getKey());
        return obj != null ? AbstractC5504s.c(obj, entry.getValue()) : entry.getValue() == null && this.f44919a.containsKey(entry.getKey());
    }

    @Override // d0.AbstractC4550a
    public boolean i(Map.Entry entry) {
        return this.f44919a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f44919a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
