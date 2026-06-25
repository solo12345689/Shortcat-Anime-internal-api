package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0003J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "A", "", "head", "rest", "", "(Ljava/lang/Object;Ljava/lang/Iterable;)V", "all", "(Ljava/lang/Object;Ljava/util/Set;)V", "getHead", "()Ljava/lang/Object;", "Ljava/lang/Object;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "toSet", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NonEmptySet<A> implements Set<A>, InterfaceC5371a {
    public static final int $stable = 8;
    private final Set<A> all;
    private final A head;

    /* JADX WARN: Multi-variable type inference failed */
    private NonEmptySet(A a10, Set<? extends A> set) {
        this.head = a10;
        this.all = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(A a10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.all.contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC5504s.h(elements, "elements");
        return this.all.containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object other) {
        return other instanceof NonEmptySet ? AbstractC5504s.c(this.all, ((NonEmptySet) other).all) : AbstractC5504s.c(this.all, other);
    }

    public final /* synthetic */ Object getHead() {
        return this.head;
    }

    public int getSize() {
        return this.all.size();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.all.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<A> iterator() {
        return this.all.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    /* JADX INFO: renamed from: toSet, reason: from getter */
    public final /* synthetic */ Set getAll() {
        return this.all;
    }

    public String toString() {
        return "NonEmptySet(" + AbstractC2279u.w0(this.all, null, null, null, 0, null, null, 63, null) + ')';
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC5504s.h(array, "array");
        return (T[]) AbstractC5496j.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonEmptySet(A a10, Iterable<? extends A> rest) {
        this((Object) a10, a0.m(AbstractC2279u.f1(rest), a10));
        AbstractC5504s.h(rest, "rest");
    }
}
