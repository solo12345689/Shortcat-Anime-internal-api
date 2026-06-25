package Xe;

import Df.r;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: d */
    public static final a f21759d = new a(null);

    /* JADX INFO: renamed from: a */
    private final c f21760a;

    /* JADX INFO: renamed from: b */
    private final c f21761b;

    /* JADX INFO: renamed from: c */
    private final boolean f21762c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String string, boolean z10) {
            String strK;
            String str;
            AbstractC5504s.h(string, "string");
            int iI0 = r.i0(string, '`', 0, false, 6, null);
            if (iI0 == -1) {
                iI0 = string.length();
            }
            int iP0 = r.p0(string, "/", iI0, false, 4, null);
            if (iP0 == -1) {
                strK = r.K(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iP0);
                AbstractC5504s.g(strSubstring, "substring(...)");
                String strJ = r.J(strSubstring, '/', com.amazon.a.a.o.c.a.b.f34706a, false, 4, null);
                String strSubstring2 = string.substring(iP0 + 1);
                AbstractC5504s.g(strSubstring2, "substring(...)");
                strK = r.K(strSubstring2, "`", "", false, 4, null);
                str = strJ;
            }
            return new b(new c(str), new c(strK), z10);
        }

        public final b c(c topLevelFqName) {
            AbstractC5504s.h(topLevelFqName, "topLevelFqName");
            return new b(topLevelFqName.d(), topLevelFqName.f());
        }

        private a() {
        }
    }

    public b(c packageFqName, c relativeClassName, boolean z10) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(relativeClassName, "relativeClassName");
        this.f21760a = packageFqName;
        this.f21761b = relativeClassName;
        this.f21762c = z10;
        relativeClassName.c();
    }

    private static final String c(c cVar) {
        String strA = cVar.a();
        if (!r.V(strA, '/', false, 2, null)) {
            return strA;
        }
        return '`' + strA + '`';
    }

    public static final b k(c cVar) {
        return f21759d.c(cVar);
    }

    public final c a() {
        if (this.f21760a.c()) {
            return this.f21761b;
        }
        return new c(this.f21760a.a() + com.amazon.a.a.o.c.a.b.f34706a + this.f21761b.a());
    }

    public final String b() {
        if (this.f21760a.c()) {
            return c(this.f21761b);
        }
        return r.J(this.f21760a.a(), com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null) + "/" + c(this.f21761b);
    }

    public final b d(f name) {
        AbstractC5504s.h(name, "name");
        return new b(this.f21760a, this.f21761b.b(name), this.f21762c);
    }

    public final b e() {
        c cVarD = this.f21761b.d();
        if (cVarD.c()) {
            return null;
        }
        return new b(this.f21760a, cVarD, this.f21762c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC5504s.c(this.f21760a, bVar.f21760a) && AbstractC5504s.c(this.f21761b, bVar.f21761b) && this.f21762c == bVar.f21762c;
    }

    public final c f() {
        return this.f21760a;
    }

    public final c g() {
        return this.f21761b;
    }

    public final f h() {
        return this.f21761b.f();
    }

    public int hashCode() {
        return (((this.f21760a.hashCode() * 31) + this.f21761b.hashCode()) * 31) + Boolean.hashCode(this.f21762c);
    }

    public final boolean i() {
        return this.f21762c;
    }

    public final boolean j() {
        return !this.f21761b.d().c();
    }

    public String toString() {
        if (!this.f21760a.c()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c packageFqName, f topLevelName) {
        this(packageFqName, c.f21763c.a(topLevelName), false);
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(topLevelName, "topLevelName");
    }
}
