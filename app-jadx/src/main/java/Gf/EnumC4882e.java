package gf;

import com.adjust.sdk.Constants;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ve.l;

/* JADX INFO: renamed from: gf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC4882e {
    BOOLEAN(l.f62119g, "boolean", "Z", "java.lang.Boolean"),
    CHAR(l.f62120h, "char", "C", "java.lang.Character"),
    BYTE(l.f62121i, "byte", "B", "java.lang.Byte"),
    SHORT(l.f62122j, "short", "S", "java.lang.Short"),
    INT(l.f62123k, "int", "I", "java.lang.Integer"),
    FLOAT(l.f62124l, "float", "F", "java.lang.Float"),
    LONG(l.f62125m, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(l.f62126n, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f47462m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f47463n = new EnumMap(l.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f47464o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set f47465p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map f47466q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f47468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xe.c f47471d;

    static {
        for (EnumC4882e enumC4882e : values()) {
            f47462m.put(enumC4882e.k(), enumC4882e);
            f47463n.put(enumC4882e.m(), enumC4882e);
            f47464o.put(enumC4882e.h(), enumC4882e);
            String strReplace = enumC4882e.f47471d.a().replace(com.amazon.a.a.o.c.a.b.f34706a, '/');
            f47465p.add(strReplace);
            f47466q.put(strReplace, "(" + enumC4882e.f47470c + ")L" + strReplace + ";");
        }
    }

    EnumC4882e(l lVar, String str, String str2, String str3) {
        if (lVar == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.f47468a = lVar;
        this.f47469b = str;
        this.f47470c = str2;
        this.f47471d = new Xe.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.EnumC4882e.a(int):void");
    }

    public static EnumC4882e b(String str) {
        if (str == null) {
            a(3);
        }
        EnumC4882e enumC4882e = (EnumC4882e) f47462m.get(str);
        if (enumC4882e != null) {
            return enumC4882e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public static EnumC4882e c(l lVar) {
        if (lVar == null) {
            a(5);
        }
        EnumC4882e enumC4882e = (EnumC4882e) f47463n.get(lVar);
        if (enumC4882e == null) {
            a(6);
        }
        return enumC4882e;
    }

    public String h() {
        String str = this.f47470c;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String k() {
        String str = this.f47469b;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public l m() {
        l lVar = this.f47468a;
        if (lVar == null) {
            a(12);
        }
        return lVar;
    }

    public Xe.c p() {
        Xe.c cVar = this.f47471d;
        if (cVar == null) {
            a(15);
        }
        return cVar;
    }
}
