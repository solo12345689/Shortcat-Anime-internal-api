package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3676h2 {

    /* JADX INFO: renamed from: a */
    private static final char[] f40470a;

    static {
        char[] cArr = new char[80];
        f40470a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC3666f2 interfaceC3666f2, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(interfaceC3666f2, sb2, 0);
        return sb2.toString();
    }

    static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            AbstractC3710o1 abstractC3710o1 = AbstractC3710o1.f40523b;
            sb2.append(AbstractC3735t2.a(new C3700m1(((String) obj).getBytes(P1.f40249a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC3710o1) {
            sb2.append(": \"");
            sb2.append(AbstractC3735t2.a((AbstractC3710o1) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof J1) {
            sb2.append(" {");
            d((J1) obj, sb2, i10 + 2);
            sb2.append("\n");
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        c(i10, sb2);
        sb2.append("}");
    }

    private static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f40470a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(com.google.android.gms.internal.play_billing.InterfaceC3666f2 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3676h2.d(com.google.android.gms.internal.play_billing.f2, java.lang.StringBuilder, int):void");
    }
}
