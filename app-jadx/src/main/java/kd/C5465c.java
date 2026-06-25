package kd;

import Td.L;
import android.util.Log;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: kd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5465c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5465c f52188a = new C5465c();

    private C5465c() {
    }

    public static final void c(String style) {
        AbstractC5504s.h(style, "style");
        f52188a.d(style, new InterfaceC5082a() { // from class: kd.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5465c.e();
            }
        }, new Function1() { // from class: kd.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5465c.f((String) obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r4.equals("light") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r4.equals("") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(java.lang.String r4, ie.InterfaceC5082a r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            goto L61
        L4:
            int r1 = r4.hashCode()
            if (r1 == 0) goto L3e
            r2 = 3075958(0x2eef76, float:4.310335E-39)
            if (r1 == r2) goto L33
            r2 = 102970646(0x6233516, float:3.0695894E-35)
            if (r1 == r2) goto L2a
            r2 = 1673671211(0x63c2322b, float:7.1645667E21)
            if (r1 == r2) goto L1a
            goto L46
        L1a:
            java.lang.String r1 = "automatic"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L46
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 >= r6) goto L61
            r0 = 3
            goto L61
        L2a:
            java.lang.String r0 = "light"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L60
            goto L46
        L33:
            java.lang.String r0 = "dark"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3c
            goto L46
        L3c:
            r0 = 2
            goto L61
        L3e:
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L60
        L46:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Invalid user interface style: \""
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = "\""
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r6.invoke(r4)
            return
        L60:
            r0 = 1
        L61:
            androidx.appcompat.app.f.L(r0)
            r5.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.C5465c.d(java.lang.String, ie.a, kotlin.jvm.functions.Function1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L e() {
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L f(String m10) {
        AbstractC5504s.h(m10, "m");
        Log.e("SystemUI", m10);
        return L.f17438a;
    }
}
