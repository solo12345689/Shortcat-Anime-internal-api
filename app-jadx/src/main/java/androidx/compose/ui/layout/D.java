package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6548N;
import t.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface D {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Collection, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6548N f26880a;

        public a(C6548N c6548n) {
            this.f26880a = c6548n;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f26880a.g(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f26880a.k();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f26880a.a(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f26880a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.f26880a.c();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f26880a.d();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f26880a.j().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f26880a.x(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f26880a.x(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f26880a.B(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC5496j.a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5496j.b(this, objArr);
        }

        public /* synthetic */ a(C6548N c6548n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? a0.a() : c6548n);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
