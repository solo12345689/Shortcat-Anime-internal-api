package xa;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: xa.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7072F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f64072a;

    static {
        char[] cArr = new char[80];
        f64072a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f64072a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof AbstractC7079e ? obj.equals(AbstractC7079e.f64161b) : obj instanceof InterfaceC7070D ? obj == ((InterfaceC7070D) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    static void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        sb2.append(c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(W.c((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC7079e) {
            sb2.append(": \"");
            sb2.append(W.a((AbstractC7079e) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC7090p) {
            sb2.append(" {");
            e((AbstractC7090p) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i10 + 2;
        d(sb2, i11, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        d(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(xa.InterfaceC7070D r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.AbstractC7072F.e(xa.D, java.lang.StringBuilder, int):void");
    }

    static String f(InterfaceC7070D interfaceC7070D, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        e(interfaceC7070D, sb2, 0);
        return sb2.toString();
    }
}
