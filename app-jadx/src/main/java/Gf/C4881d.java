package gf;

/* JADX INFO: renamed from: gf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C4881d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Xe.c f47453b;

    private C4881d(String str) {
        if (str == null) {
            a(7);
        }
        this.f47452a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.C4881d.a(int):void");
    }

    public static C4881d b(Xe.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new C4881d(h(bVar));
    }

    public static C4881d c(Xe.c cVar) {
        if (cVar == null) {
            a(4);
        }
        C4881d c4881d = new C4881d(cVar.a().replace(com.amazon.a.a.o.c.a.b.f34706a, '/'));
        c4881d.f47453b = cVar;
        return c4881d;
    }

    public static C4881d d(String str) {
        if (str == null) {
            a(0);
        }
        return new C4881d(str);
    }

    public static String h(Xe.b bVar) {
        if (bVar == null) {
            a(2);
        }
        Xe.c cVarF = bVar.f();
        String strReplace = bVar.g().a().replace(com.amazon.a.a.o.c.a.b.f34706a, '$');
        if (!cVarF.c()) {
            strReplace = cVarF.a().replace(com.amazon.a.a.o.c.a.b.f34706a, '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public Xe.c e() {
        return new Xe.c(this.f47452a.replace('/', com.amazon.a.a.o.c.a.b.f34706a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47452a.equals(((C4881d) obj).f47452a);
    }

    public String f() {
        String str = this.f47452a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public Xe.c g() {
        int iLastIndexOf = this.f47452a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new Xe.c(this.f47452a.substring(0, iLastIndexOf).replace('/', com.amazon.a.a.o.c.a.b.f34706a));
        }
        Xe.c cVar = Xe.c.f21764d;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f47452a.hashCode();
    }

    public String toString() {
        return this.f47452a;
    }
}
