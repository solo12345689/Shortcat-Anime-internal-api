package ka;

import Td.L;
import X1.f;
import android.content.Context;
import android.os.Build;
import ca.AbstractC3091d;
import ca.C3090c;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class v {

    /* JADX INFO: renamed from: b */
    private static final f.a f52178b = X1.i.f("fire-global");

    /* JADX INFO: renamed from: c */
    private static final f.a f52179c = X1.i.f("fire-count");

    /* JADX INFO: renamed from: d */
    private static final f.a f52180d = X1.i.g("last-used-date");

    /* JADX INFO: renamed from: a */
    private final C3090c f52181a;

    public v(Context context, String str) {
        this.f52181a = new C3090c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ L a(long j10, X1.c cVar) {
        cVar.i(f52178b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ L b(v vVar, String str, String str2, f.a aVar, X1.c cVar) {
        vVar.getClass();
        f.a aVar2 = f52180d;
        if (((String) AbstractC3091d.a(cVar, aVar2, "")).equals(str)) {
            f.a aVarI = vVar.i(cVar, str);
            if (aVarI == null || aVarI.a().equals(str2)) {
                return null;
            }
            vVar.q(cVar, aVar, str);
            return null;
        }
        f.a aVar3 = f52179c;
        long jLongValue = ((Long) AbstractC3091d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = vVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) AbstractC3091d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ L c(v vVar, X1.c cVar) {
        vVar.getClass();
        long j10 = 0;
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                f.a aVar = (f.a) entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = vVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.i(aVar, j9.L.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.h(aVar);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f52179c);
            return null;
        }
        cVar.i(f52179c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ L d(v vVar, String str, X1.c cVar) {
        vVar.getClass();
        cVar.i(f52180d, str);
        vVar.l(cVar, str);
        return null;
    }

    private synchronized long e(X1.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) AbstractC3091d.a(cVar, f52179c, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = ((f.a) entry.getKey()).a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(X1.i.h(strA), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f52179c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized f.a i(X1.c cVar, String str) {
        for (Map.Entry entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return X1.i.h(((f.a) entry.getKey()).a());
                    }
                }
            }
        }
        return null;
    }

    private synchronized void l(X1.c cVar, String str) {
        try {
            f.a aVarI = i(cVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) AbstractC3091d.a(cVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarI);
            } else {
                cVar.i(aVarI, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void q(X1.c cVar, f.a aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) AbstractC3091d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }

    synchronized void f() {
        this.f52181a.g(new Function1() { // from class: ka.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.c(this.f52175a, (X1.c) obj);
            }
        });
    }

    synchronized List g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry entry : this.f52181a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(w.a(((f.a) entry.getKey()).a(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f52181a.g(new Function1() { // from class: ka.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.d(this.f52176a, strH, (X1.c) obj);
            }
        });
    }

    synchronized boolean m(long j10) {
        return n(f52178b, j10);
    }

    synchronized boolean n(f.a aVar, long j10) {
        if (j(((Long) this.f52181a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f52181a.k(aVar, Long.valueOf(j10));
        return true;
    }

    synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final f.a aVarH = X1.i.h(str);
        this.f52181a.g(new Function1() { // from class: ka.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.b(this.f52171a, strH, str, aVarH, (X1.c) obj);
            }
        });
    }

    synchronized void p(final long j10) {
        this.f52181a.g(new Function1() { // from class: ka.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.a(j10, (X1.c) obj);
            }
        });
    }
}
