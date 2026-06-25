package Td;

import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class w implements Lazy, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17469d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17470e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile InterfaceC5082a f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f17473c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w(InterfaceC5082a initializer) {
        AbstractC5504s.h(initializer, "initializer");
        this.f17471a = initializer;
        H h10 = H.f17432a;
        this.f17472b = h10;
        this.f17473c = h10;
    }

    @Override // kotlin.Lazy
    public boolean e() {
        return this.f17472b != H.f17432a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f17472b;
        H h10 = H.f17432a;
        if (obj != h10) {
            return obj;
        }
        InterfaceC5082a interfaceC5082a = this.f17471a;
        if (interfaceC5082a != null) {
            Object objInvoke = interfaceC5082a.invoke();
            if (androidx.concurrent.futures.b.a(f17470e, this, h10, objInvoke)) {
                this.f17471a = null;
                return objInvoke;
            }
        }
        return this.f17472b;
    }

    public String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
