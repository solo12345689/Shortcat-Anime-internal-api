package com.facebook.react.devsupport;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.Constants;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f36794d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f36795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36797c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(Map map, long j10, long j11);

        void b(Map map, C6683h c6683h, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public n0(InterfaceC6685j source, String boundary) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(boundary, "boundary");
        this.f36795a = source;
        this.f36796b = boundary;
    }

    private final void a(C6683h c6683h, boolean z10, a aVar) throws EOFException {
        long jH = c6683h.H(C6686k.f61044d.b("\r\n\r\n"));
        if (jH == -1) {
            aVar.b(Ud.S.i(), c6683h, z10);
            return;
        }
        C6683h c6683h2 = new C6683h();
        C6683h c6683h3 = new C6683h();
        c6683h.N0(c6683h2, jH);
        c6683h.skip(r0.a());
        c6683h.U(c6683h3);
        aVar.b(c(c6683h2), c6683h3, z10);
    }

    private final void b(Map map, long j10, boolean z10, a aVar) {
        if (aVar == null || map == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f36797c > 16 || z10) {
            this.f36797c = jCurrentTimeMillis;
            aVar.a(map, j10, Long.parseLong((String) map.getOrDefault("Content-Length", "0")));
        }
    }

    private final Map c(C6683h c6683h) {
        List listM;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listL = new Df.p("\r\n").l(c6683h.M1(), 0);
        if (listL.isEmpty()) {
            listM = AbstractC2279u.m();
        } else {
            ListIterator listIterator = listL.listIterator(listL.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM = AbstractC2279u.T0(listL, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM = AbstractC2279u.m();
        }
        for (String str : (String[]) listM.toArray(new String[0])) {
            int iJ0 = Df.r.j0(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, 0, false, 6, null);
            if (iJ0 != -1) {
                String strSubstring = str.substring(0, iJ0);
                AbstractC5504s.g(strSubstring, "substring(...)");
                int length = strSubstring.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = AbstractC5504s.i(strSubstring.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                String string = strSubstring.subSequence(i10, length + 1).toString();
                String strSubstring2 = str.substring(iJ0 + 1);
                AbstractC5504s.g(strSubstring2, "substring(...)");
                int length2 = strSubstring2.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = AbstractC5504s.i(strSubstring2.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                linkedHashMap.put(string, strSubstring2.subSequence(i11, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.facebook.react.devsupport.n0.a r26) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.n0.d(com.facebook.react.devsupport.n0$a):boolean");
    }
}
