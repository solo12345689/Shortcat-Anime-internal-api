package we;

import Df.r;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we.AbstractC6971f;

/* JADX INFO: renamed from: we.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6972g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f63191c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6972g f63192d = new C6972g(AbstractC2279u.p(AbstractC6971f.a.f63187f, AbstractC6971f.d.f63190f, AbstractC6971f.b.f63188f, AbstractC6971f.c.f63189f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f63193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f63194b;

    /* JADX INFO: renamed from: we.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6972g a() {
            return C6972g.f63192d;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: we.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC6971f f63195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f63196b;

        public b(AbstractC6971f kind, int i10) {
            AbstractC5504s.h(kind, "kind");
            this.f63195a = kind;
            this.f63196b = i10;
        }

        public final AbstractC6971f a() {
            return this.f63195a;
        }

        public final int b() {
            return this.f63196b;
        }

        public final AbstractC6971f c() {
            return this.f63195a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f63195a, bVar.f63195a) && this.f63196b == bVar.f63196b;
        }

        public int hashCode() {
            return (this.f63195a.hashCode() * 31) + Integer.hashCode(this.f63196b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f63195a + ", arity=" + this.f63196b + ')';
        }
    }

    public C6972g(List kinds) {
        AbstractC5504s.h(kinds, "kinds");
        this.f63193a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            Xe.c cVarB = ((AbstractC6971f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f63194b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final AbstractC6971f b(Xe.c packageFqName, String className) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(className, "className");
        b bVarC = c(packageFqName, className);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(Xe.c packageFqName, String className) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(className, "className");
        List<AbstractC6971f> list = (List) this.f63194b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (AbstractC6971f abstractC6971f : list) {
            if (r.Q(className, abstractC6971f.a(), false, 2, null)) {
                String strSubstring = className.substring(abstractC6971f.a().length());
                AbstractC5504s.g(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(abstractC6971f, numD.intValue());
                }
            }
        }
        return null;
    }
}
