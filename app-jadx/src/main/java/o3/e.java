package O3;

import Df.r;
import M3.j;
import S3.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e */
    public static final b f12932e = new b(null);

    /* JADX INFO: renamed from: a */
    public final String f12933a;

    /* JADX INFO: renamed from: b */
    public final Map f12934b;

    /* JADX INFO: renamed from: c */
    public final Set f12935c;

    /* JADX INFO: renamed from: d */
    public final Set f12936d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: h */
        public static final C0204a f12937h = new C0204a(null);

        /* JADX INFO: renamed from: a */
        public final String f12938a;

        /* JADX INFO: renamed from: b */
        public final String f12939b;

        /* JADX INFO: renamed from: c */
        public final boolean f12940c;

        /* JADX INFO: renamed from: d */
        public final int f12941d;

        /* JADX INFO: renamed from: e */
        public final String f12942e;

        /* JADX INFO: renamed from: f */
        public final int f12943f;

        /* JADX INFO: renamed from: g */
        public final int f12944g;

        /* JADX INFO: renamed from: O3.e$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0204a {
            public /* synthetic */ C0204a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                AbstractC5504s.h(current, "current");
                if (AbstractC5504s.c(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return AbstractC5504s.c(r.k1(strSubstring).toString(), str);
            }

            private C0204a() {
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(type, "type");
            this.f12938a = name;
            this.f12939b = type;
            this.f12940c = z10;
            this.f12941d = i10;
            this.f12942e = str;
            this.f12943f = i11;
            this.f12944g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC5504s.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (r.W(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (r.W(upperCase, "CHAR", false, 2, null) || r.W(upperCase, "CLOB", false, 2, null) || r.W(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (r.W(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (r.W(upperCase, "REAL", false, 2, null) || r.W(upperCase, "FLOA", false, 2, null) || r.W(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f12941d != ((a) obj).f12941d) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC5504s.c(this.f12938a, aVar.f12938a) || this.f12940c != aVar.f12940c) {
                return false;
            }
            if (this.f12943f == 1 && aVar.f12943f == 2 && (str3 = this.f12942e) != null && !f12937h.b(str3, aVar.f12942e)) {
                return false;
            }
            if (this.f12943f == 2 && aVar.f12943f == 1 && (str2 = aVar.f12942e) != null && !f12937h.b(str2, this.f12942e)) {
                return false;
            }
            int i10 = this.f12943f;
            return (i10 == 0 || i10 != aVar.f12943f || ((str = this.f12942e) == null ? aVar.f12942e == null : f12937h.b(str, aVar.f12942e))) && this.f12944g == aVar.f12944g;
        }

        public int hashCode() {
            return (((((this.f12938a.hashCode() * 31) + this.f12944g) * 31) + (this.f12940c ? 1231 : 1237)) * 31) + this.f12941d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f12938a);
            sb2.append("', type='");
            sb2.append(this.f12939b);
            sb2.append("', affinity='");
            sb2.append(this.f12944g);
            sb2.append("', notNull=");
            sb2.append(this.f12940c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f12941d);
            sb2.append(", defaultValue='");
            String str = this.f12942e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(g database, String tableName) {
            AbstractC5504s.h(database, "database");
            AbstractC5504s.h(tableName, "tableName");
            return f.f(database, tableName);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f12945a;

        /* JADX INFO: renamed from: b */
        public final String f12946b;

        /* JADX INFO: renamed from: c */
        public final String f12947c;

        /* JADX INFO: renamed from: d */
        public final List f12948d;

        /* JADX INFO: renamed from: e */
        public final List f12949e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            AbstractC5504s.h(referenceTable, "referenceTable");
            AbstractC5504s.h(onDelete, "onDelete");
            AbstractC5504s.h(onUpdate, "onUpdate");
            AbstractC5504s.h(columnNames, "columnNames");
            AbstractC5504s.h(referenceColumnNames, "referenceColumnNames");
            this.f12945a = referenceTable;
            this.f12946b = onDelete;
            this.f12947c = onUpdate;
            this.f12948d = columnNames;
            this.f12949e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC5504s.c(this.f12945a, cVar.f12945a) && AbstractC5504s.c(this.f12946b, cVar.f12946b) && AbstractC5504s.c(this.f12947c, cVar.f12947c) && AbstractC5504s.c(this.f12948d, cVar.f12948d)) {
                return AbstractC5504s.c(this.f12949e, cVar.f12949e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f12945a.hashCode() * 31) + this.f12946b.hashCode()) * 31) + this.f12947c.hashCode()) * 31) + this.f12948d.hashCode()) * 31) + this.f12949e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f12945a + "', onDelete='" + this.f12946b + " +', onUpdate='" + this.f12947c + "', columnNames=" + this.f12948d + ", referenceColumnNames=" + this.f12949e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a */
        private final int f12950a;

        /* JADX INFO: renamed from: b */
        private final int f12951b;

        /* JADX INFO: renamed from: c */
        private final String f12952c;

        /* JADX INFO: renamed from: d */
        private final String f12953d;

        public d(int i10, int i11, String from, String to) {
            AbstractC5504s.h(from, "from");
            AbstractC5504s.h(to, "to");
            this.f12950a = i10;
            this.f12951b = i11;
            this.f12952c = from;
            this.f12953d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a */
        public int compareTo(d other) {
            AbstractC5504s.h(other, "other");
            int i10 = this.f12950a - other.f12950a;
            return i10 == 0 ? this.f12951b - other.f12951b : i10;
        }

        public final String b() {
            return this.f12952c;
        }

        public final int c() {
            return this.f12950a;
        }

        public final String h() {
            return this.f12953d;
        }
    }

    /* JADX INFO: renamed from: O3.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0205e {

        /* JADX INFO: renamed from: e */
        public static final a f12954e = new a(null);

        /* JADX INFO: renamed from: a */
        public final String f12955a;

        /* JADX INFO: renamed from: b */
        public final boolean f12956b;

        /* JADX INFO: renamed from: c */
        public final List f12957c;

        /* JADX INFO: renamed from: d */
        public List f12958d;

        /* JADX INFO: renamed from: O3.e$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0205e(String name, boolean z10, List columns, List orders) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(columns, "columns");
            AbstractC5504s.h(orders, "orders");
            this.f12955a = name;
            this.f12956b = z10;
            this.f12957c = columns;
            this.f12958d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add(j.ASC.name());
                }
            }
            this.f12958d = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0205e)) {
                return false;
            }
            C0205e c0205e = (C0205e) obj;
            if (this.f12956b == c0205e.f12956b && AbstractC5504s.c(this.f12957c, c0205e.f12957c) && AbstractC5504s.c(this.f12958d, c0205e.f12958d)) {
                return r.Q(this.f12955a, "index_", false, 2, null) ? r.Q(c0205e.f12955a, "index_", false, 2, null) : AbstractC5504s.c(this.f12955a, c0205e.f12955a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((r.Q(this.f12955a, "index_", false, 2, null) ? -1184239155 : this.f12955a.hashCode()) * 31) + (this.f12956b ? 1 : 0)) * 31) + this.f12957c.hashCode()) * 31) + this.f12958d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f12955a + "', unique=" + this.f12956b + ", columns=" + this.f12957c + ", orders=" + this.f12958d + "'}";
        }
    }

    public e(String name, Map columns, Set foreignKeys, Set set) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(columns, "columns");
        AbstractC5504s.h(foreignKeys, "foreignKeys");
        this.f12933a = name;
        this.f12934b = columns;
        this.f12935c = foreignKeys;
        this.f12936d = set;
    }

    public static final e a(g gVar, String str) {
        return f12932e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC5504s.c(this.f12933a, eVar.f12933a) || !AbstractC5504s.c(this.f12934b, eVar.f12934b) || !AbstractC5504s.c(this.f12935c, eVar.f12935c)) {
            return false;
        }
        Set set2 = this.f12936d;
        if (set2 == null || (set = eVar.f12936d) == null) {
            return true;
        }
        return AbstractC5504s.c(set2, set);
    }

    public int hashCode() {
        return (((this.f12933a.hashCode() * 31) + this.f12934b.hashCode()) * 31) + this.f12935c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f12933a + "', columns=" + this.f12934b + ", foreignKeys=" + this.f12935c + ", indices=" + this.f12936d + '}';
    }
}
