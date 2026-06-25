package Xe;

import Df.r;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: e */
    public static final a f21767e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final f f21768f;

    /* JADX INFO: renamed from: g */
    private static final Pattern f21769g;

    /* JADX INFO: renamed from: a */
    private final String f21770a;

    /* JADX INFO: renamed from: b */
    private transient c f21771b;

    /* JADX INFO: renamed from: c */
    private transient d f21772c;

    /* JADX INFO: renamed from: d */
    private transient f f21773d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(f shortName) {
            AbstractC5504s.h(shortName, "shortName");
            String strB = shortName.b();
            AbstractC5504s.g(strB, "asString(...)");
            return new d(strB, c.f21764d.i(), shortName, null);
        }

        private a() {
        }
    }

    static {
        f fVarQ = f.q("<root>");
        AbstractC5504s.g(fVarQ, "special(...)");
        f21768f = fVarQ;
        Pattern patternCompile = Pattern.compile("\\.");
        AbstractC5504s.g(patternCompile, "compile(...)");
        f21769g = patternCompile;
    }

    public /* synthetic */ d(String str, d dVar, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, fVar);
    }

    private final void c() {
        int iD = d(this.f21770a);
        if (iD < 0) {
            this.f21773d = f.k(this.f21770a);
            this.f21772c = c.f21764d.i();
            return;
        }
        String strSubstring = this.f21770a.substring(iD + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        this.f21773d = f.k(strSubstring);
        String strSubstring2 = this.f21770a.substring(0, iD);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        this.f21772c = new d(strSubstring2);
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List i(d dVar) {
        if (dVar.e()) {
            return new ArrayList();
        }
        List listI = i(dVar.g());
        listI.add(dVar.j());
        return listI;
    }

    public final String a() {
        return this.f21770a;
    }

    public final d b(f name) {
        String strB;
        AbstractC5504s.h(name, "name");
        if (e()) {
            strB = name.b();
        } else {
            strB = this.f21770a + com.amazon.a.a.o.c.a.b.f34706a + name.b();
        }
        AbstractC5504s.e(strB);
        return new d(strB, this, name);
    }

    public final boolean e() {
        return this.f21770a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC5504s.c(this.f21770a, ((d) obj).f21770a);
    }

    public final boolean f() {
        return this.f21771b != null || r.i0(a(), '<', 0, false, 6, null) < 0;
    }

    public final d g() {
        d dVar = this.f21772c;
        if (dVar != null) {
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        d dVar2 = this.f21772c;
        AbstractC5504s.e(dVar2);
        return dVar2;
    }

    public final List h() {
        return i(this);
    }

    public int hashCode() {
        return this.f21770a.hashCode();
    }

    public final f j() {
        f fVar = this.f21773d;
        if (fVar != null) {
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        f fVar2 = this.f21773d;
        AbstractC5504s.e(fVar2);
        return fVar2;
    }

    public final f k() {
        return e() ? f21768f : j();
    }

    public final boolean l(f segment) {
        AbstractC5504s.h(segment, "segment");
        if (e()) {
            return false;
        }
        int iI0 = r.i0(this.f21770a, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null);
        if (iI0 == -1) {
            iI0 = this.f21770a.length();
        }
        int i10 = iI0;
        String strB = segment.b();
        AbstractC5504s.g(strB, "asString(...)");
        return i10 == strB.length() && r.F(this.f21770a, 0, strB, 0, i10, false, 16, null);
    }

    public final c m() {
        c cVar = this.f21771b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f21771b = cVar2;
        return cVar2;
    }

    public String toString() {
        if (!e()) {
            return this.f21770a;
        }
        String strB = f21768f.b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }

    public d(String fqName, c safe) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(safe, "safe");
        this.f21770a = fqName;
        this.f21771b = safe;
    }

    public d(String fqName) {
        AbstractC5504s.h(fqName, "fqName");
        this.f21770a = fqName;
    }

    private d(String str, d dVar, f fVar) {
        this.f21770a = str;
        this.f21772c = dVar;
        this.f21773d = fVar;
    }
}
