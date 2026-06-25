package Tf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f17527b;

        a(e eVar) {
            this.f17527b = eVar;
            this.f17526a = eVar.k();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e next() {
            e eVar = this.f17527b;
            int iK = eVar.k();
            int i10 = this.f17526a;
            this.f17526a = i10 - 1;
            return eVar.n(iK - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17526a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f17529b;

        b(e eVar) {
            this.f17529b = eVar;
            this.f17528a = eVar.k();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            e eVar = this.f17529b;
            int iK = eVar.k();
            int i10 = this.f17528a;
            this.f17528a = i10 - 1;
            return eVar.l(iK - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17528a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f17530a;

        public c(e eVar) {
            this.f17530a = eVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f17530a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f17531a;

        public d(e eVar) {
            this.f17531a = eVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f17531a);
        }
    }

    public static final Iterable a(e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return new c(eVar);
    }

    public static final Iterable b(e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        return new d(eVar);
    }
}
