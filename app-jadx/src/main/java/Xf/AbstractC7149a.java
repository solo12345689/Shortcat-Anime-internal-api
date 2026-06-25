package xf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: xf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7149a implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: xf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0971a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f64470a;

        public AbstractC0971a(int i10) {
            this.f64470a = i10;
        }

        protected final Object c(AbstractC7149a thisRef) {
            AbstractC5504s.h(thisRef, "thisRef");
            return thisRef.b().get(this.f64470a);
        }
    }

    protected abstract AbstractC7151c b();

    protected abstract AbstractC7174z d();

    protected abstract void e(String str, Object obj);

    protected final void f(InterfaceC6014d tClass, Object value) {
        AbstractC5504s.h(tClass, "tClass");
        AbstractC5504s.h(value, "value");
        String strU = tClass.u();
        AbstractC5504s.e(strU);
        e(strU, value);
    }

    public final boolean isEmpty() {
        return b().b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b().iterator();
    }
}
