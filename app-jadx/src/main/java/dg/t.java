package dg;

import Ud.AbstractC2279u;
import ce.AbstractC3098c;
import fg.AbstractC4807e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import je.InterfaceC5371a;
import kg.AbstractC5480c;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class t implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: b */
    public static final b f45580b = new b(null);

    /* JADX INFO: renamed from: a */
    private final String[] f45581a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List f45582a = new ArrayList(20);

        public final a a(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            b bVar = t.f45580b;
            bVar.e(name);
            bVar.f(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            AbstractC5504s.h(line, "line");
            int iI0 = Df.r.i0(line, ':', 1, false, 4, null);
            if (iI0 != -1) {
                String strSubstring = line.substring(0, iI0);
                AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iI0 + 1);
                AbstractC5504s.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            AbstractC5504s.g(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            this.f45582a.add(name);
            this.f45582a.add(Df.r.k1(value).toString());
            return this;
        }

        public final a d(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            t.f45580b.e(name);
            c(name, value);
            return this;
        }

        public final t e() {
            return new t((String[]) this.f45582a.toArray(new String[0]), null);
        }

        public final String f(String name) {
            AbstractC5504s.h(name, "name");
            int size = this.f45582a.size() - 2;
            int iC = AbstractC3098c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!Df.r.B(name, (String) this.f45582a.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f45582a.get(size + 1);
        }

        public final List g() {
            return this.f45582a;
        }

        public final a h(String name) {
            AbstractC5504s.h(name, "name");
            int i10 = 0;
            while (i10 < this.f45582a.size()) {
                if (Df.r.B(name, (String) this.f45582a.get(i10), true)) {
                    this.f45582a.remove(i10);
                    this.f45582a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            b bVar = t.f45580b;
            bVar.e(name);
            bVar.f(value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void e(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(AbstractC4807e.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public final void f(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractC4807e.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(AbstractC4807e.H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final String g(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = AbstractC3098c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!Df.r.B(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final t a(Map headers) {
            AbstractC5504s.h(headers, "headers");
            return h(headers);
        }

        public final t h(Map map) {
            AbstractC5504s.h(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = Df.r.k1(str).toString();
                String string2 = Df.r.k1(str2).toString();
                e(string);
                f(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t i(String... namesAndValues) {
            AbstractC5504s.h(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = Df.r.k1(str).toString();
            }
            int iC = AbstractC3098c.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    e(str2);
                    f(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new t(strArr, null);
        }

        private b() {
        }
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final int b() {
        return size();
    }

    public final String d(String name) {
        AbstractC5504s.h(name, "name");
        return f45580b.g(this.f45581a, name);
    }

    public final Date e(String name) {
        AbstractC5504s.h(name, "name");
        String strD = d(name);
        if (strD != null) {
            return AbstractC5480c.a(strD);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f45581a, ((t) obj).f45581a);
    }

    public final String f(int i10) {
        return this.f45581a[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f45581a);
    }

    public final Set i() {
        TreeSet treeSet = new TreeSet(Df.r.D(U.f52264a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(f(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC5504s.g(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = Td.z.a(f(i10), p(i10));
        }
        return AbstractC5489c.a(pairArr);
    }

    public final a l() {
        a aVar = new a();
        AbstractC2279u.E(aVar.g(), this.f45581a);
        return aVar;
    }

    public final Map n() {
        TreeMap treeMap = new TreeMap(Df.r.D(U.f52264a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strF = f(i10);
            Locale US = Locale.US;
            AbstractC5504s.g(US, "US");
            String lowerCase = strF.toLowerCase(US);
            AbstractC5504s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(p(i10));
        }
        return treeMap;
    }

    public final String p(int i10) {
        return this.f45581a[(i10 * 2) + 1];
    }

    public final List r(String name) {
        AbstractC5504s.h(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (Df.r.B(name, f(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(p(i10));
            }
        }
        if (arrayList == null) {
            return AbstractC2279u.m();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC5504s.g(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f45581a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strF = f(i10);
            String strP = p(i10);
            sb2.append(strF);
            sb2.append(": ");
            if (AbstractC4807e.H(strF)) {
                strP = "██";
            }
            sb2.append(strP);
            sb2.append("\n");
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private t(String[] strArr) {
        this.f45581a = strArr;
    }
}
