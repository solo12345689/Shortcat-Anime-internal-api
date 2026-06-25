package Cf;

import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f3105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f3106b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f3107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3108b = -2;

        a() {
        }

        private final void b() {
            Object objInvoke;
            if (this.f3108b == -2) {
                objInvoke = h.this.f3105a.invoke();
            } else {
                Function1 function1 = h.this.f3106b;
                Object obj = this.f3107a;
                AbstractC5504s.e(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f3107a = objInvoke;
            this.f3108b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3108b < 0) {
                b();
            }
            return this.f3108b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f3108b < 0) {
                b();
            }
            if (this.f3108b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f3107a;
            AbstractC5504s.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f3108b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(InterfaceC5082a getInitialValue, Function1 getNextValue) {
        AbstractC5504s.h(getInitialValue, "getInitialValue");
        AbstractC5504s.h(getNextValue, "getNextValue");
        this.f3105a = getInitialValue;
        this.f3106b = getNextValue;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
