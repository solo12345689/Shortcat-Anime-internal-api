package De;

import Df.r;
import Ee.AbstractC1527f;
import Qe.x;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements x {

    /* JADX INFO: renamed from: c */
    public static final a f3699c = new a(null);

    /* JADX INFO: renamed from: a */
    private final Class f3700a;

    /* JADX INFO: renamed from: b */
    private final Re.a f3701b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class klass) {
            AbstractC5504s.h(klass, "klass");
            Re.b bVar = new Re.b();
            c.f3697a.b(klass, bVar);
            Re.a aVarN = bVar.n();
            if (aVarN == null) {
                return null;
            }
            return new f(klass, aVarN, null);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, Re.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    @Override // Qe.x
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f3700a.getName();
        AbstractC5504s.g(name, "getName(...)");
        sb2.append(r.J(name, com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // Qe.x
    public void b(x.c visitor, byte[] bArr) {
        AbstractC5504s.h(visitor, "visitor");
        c.f3697a.b(this.f3700a, visitor);
    }

    @Override // Qe.x
    public void c(x.d visitor, byte[] bArr) {
        AbstractC5504s.h(visitor, "visitor");
        c.f3697a.i(this.f3700a, visitor);
    }

    @Override // Qe.x
    public Re.a d() {
        return this.f3701b;
    }

    public final Class e() {
        return this.f3700a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && AbstractC5504s.c(this.f3700a, ((f) obj).f3700a);
    }

    @Override // Qe.x
    public Xe.b g() {
        return AbstractC1527f.e(this.f3700a);
    }

    public int hashCode() {
        return this.f3700a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f3700a;
    }

    private f(Class cls, Re.a aVar) {
        this.f3700a = cls;
        this.f3701b = aVar;
    }
}
