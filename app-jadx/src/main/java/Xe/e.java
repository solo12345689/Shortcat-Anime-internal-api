package Xe;

import Df.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21774a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f21894a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f21896c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f21895b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21774a = iArr;
        }
    }

    public static final Object a(c cVar, Map values) {
        Object next;
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (AbstractC5504s.c(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).a().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(packageName, "packageName");
        return AbstractC5504s.c(f(cVar), packageName);
    }

    public static final boolean c(c cVar, c packageName) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(packageName, "packageName");
        if (AbstractC5504s.c(cVar, packageName) || packageName.c()) {
            return true;
        }
        return d(cVar.a(), packageName.a());
    }

    private static final boolean d(String str, String str2) {
        return r.Q(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.f21894a;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f21774a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.f21895b;
            } else {
                if (i11 != 3) {
                    throw new Td.r();
                }
                if (cCharAt == '.') {
                    kVar = k.f21896c;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.f21896c;
    }

    public static final c f(c cVar) {
        AbstractC5504s.h(cVar, "<this>");
        if (cVar.c()) {
            return null;
        }
        return cVar.d();
    }

    public static final c g(c cVar, c prefix) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(prefix, "prefix");
        if (!c(cVar, prefix) || prefix.c()) {
            return cVar;
        }
        if (AbstractC5504s.c(cVar, prefix)) {
            return c.f21764d;
        }
        String strSubstring = cVar.a().substring(prefix.a().length() + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return new c(strSubstring);
    }
}
