package We;

import Df.r;
import Ud.AbstractC2279u;
import ce.AbstractC3098c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20858a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20859b = AbstractC2279u.w0(AbstractC2279u.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f20860c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listP = AbstractC2279u.p("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = AbstractC3098c.c(0, listP.size() - 1, 2);
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f20859b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listP.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listP.get(i11));
                linkedHashMap.put(str + '/' + ((String) listP.get(i10)) + "Array", '[' + ((String) listP.get(i11)));
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f20859b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC2279u.p("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC2279u.p("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f20859b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC2279u.p("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f20859b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f20860c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map map, String str, String str2) {
        map.put(f20859b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        AbstractC5504s.h(classId, "classId");
        String str = (String) f20860c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + r.J(classId, com.amazon.a.a.o.c.a.b.f34706a, '$', false, 4, null) + ';';
    }
}
