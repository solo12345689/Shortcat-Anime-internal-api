package e0;

import Ud.AbstractC2270k;
import b0.g;
import d0.C4553d;
import f0.C4749c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4637b extends AbstractC2270k implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45767e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45768f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C4637b f45769g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f45770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f45771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4553d f45772d;

    /* JADX INFO: renamed from: e0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return C4637b.f45769g;
        }

        private a() {
        }
    }

    static {
        C4749c c4749c = C4749c.f46798a;
        f45769g = new C4637b(c4749c, c4749c, C4553d.f44901d.a());
    }

    public C4637b(Object obj, Object obj2, C4553d c4553d) {
        this.f45770b = obj;
        this.f45771c = obj2;
        this.f45772d = c4553d;
    }

    @Override // java.util.Collection, java.util.Set, b0.g
    public g add(Object obj) {
        if (this.f45772d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new C4637b(obj, obj, this.f45772d.t(obj, new C4636a()));
        }
        Object obj2 = this.f45771c;
        Object obj3 = this.f45772d.get(obj2);
        AbstractC5504s.e(obj3);
        return new C4637b(this.f45770b, obj, this.f45772d.t(obj2, ((C4636a) obj3).e(obj)).t(obj, new C4636a(obj2)));
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f45772d.containsKey(obj);
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f45772d.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4638c(this.f45770b, this.f45772d);
    }

    @Override // java.util.Collection, java.util.Set, b0.g
    public g remove(Object obj) {
        C4636a c4636a = (C4636a) this.f45772d.get(obj);
        if (c4636a == null) {
            return this;
        }
        C4553d c4553dU = this.f45772d.u(obj);
        if (c4636a.b()) {
            Object obj2 = c4553dU.get(c4636a.d());
            AbstractC5504s.e(obj2);
            c4553dU = c4553dU.t(c4636a.d(), ((C4636a) obj2).e(c4636a.c()));
        }
        if (c4636a.a()) {
            Object obj3 = c4553dU.get(c4636a.c());
            AbstractC5504s.e(obj3);
            c4553dU = c4553dU.t(c4636a.c(), ((C4636a) obj3).f(c4636a.d()));
        }
        return new C4637b(!c4636a.b() ? c4636a.c() : this.f45770b, !c4636a.a() ? c4636a.d() : this.f45771c, c4553dU);
    }
}
