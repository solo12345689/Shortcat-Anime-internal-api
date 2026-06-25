package Vd;

import Ud.AbstractC2269j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5376f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC2269j implements Set, Serializable, InterfaceC5376f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f20025b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f20026c = new h(d.f20000n.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20027a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(d backing) {
        AbstractC5504s.h(backing, "backing");
        this.f20027a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f20027a.k(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20027a.o();
        return super.addAll(elements);
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f20027a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f20027a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f20027a.containsKey(obj);
    }

    public final Set d() {
        this.f20027a.m();
        return size() > 0 ? this : f20026c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f20027a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f20027a.J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f20027a.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20027a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20027a.o();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }
}
