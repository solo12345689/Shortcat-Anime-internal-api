package io.sentry.transport;

import com.revenuecat.purchases.common.Constants;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5221k;
import io.sentry.H;
import io.sentry.InterfaceC5192e0;
import io.sentry.T2;
import io.sentry.util.C5288a;
import io.sentry.util.D;
import io.sentry.util.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f51400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f51401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f51402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f51403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f51404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5288a f51405f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void m(z zVar);
    }

    public z(o oVar, C5322z3 c5322z3) {
        this.f51402c = new ConcurrentHashMap();
        this.f51403d = new CopyOnWriteArrayList();
        this.f51404e = null;
        this.f51405f = new C5288a();
        this.f51400a = oVar;
        this.f51401b = c5322z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Iterator it = this.f51403d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(this);
        }
    }

    private long D(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public static /* synthetic */ void g(z zVar, io.sentry.hints.f fVar) {
        zVar.getClass();
        fVar.e();
        zVar.f51401b.getLogger().c(EnumC5215i3.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private void k(EnumC5221k enumC5221k, Date date) {
        Date date2 = (Date) this.f51402c.get(enumC5221k);
        if (date2 == null || date.after(date2)) {
            this.f51402c.put(enumC5221k, date);
            C();
            InterfaceC5192e0 interfaceC5192e0A = this.f51405f.a();
            try {
                if (this.f51404e == null) {
                    this.f51404e = new Timer(true);
                }
                this.f51404e.schedule(new a(), date);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private List m(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(EnumC5221k.Attachment);
            case "replay_video":
                return Collections.singletonList(EnumC5221k.Replay);
            case "profile_chunk":
                return Arrays.asList(EnumC5221k.ProfileChunkUi, EnumC5221k.ProfileChunk);
            case "profile":
                return Collections.singletonList(EnumC5221k.Profile);
            case "feedback":
                return Collections.singletonList(EnumC5221k.Feedback);
            case "log":
                return Collections.singletonList(EnumC5221k.LogItem);
            case "span":
                return Collections.singletonList(EnumC5221k.Span);
            case "event":
                return Collections.singletonList(EnumC5221k.Error);
            case "trace_metric":
                return Collections.singletonList(EnumC5221k.TraceMetric);
            case "check_in":
                return Collections.singletonList(EnumC5221k.Monitor);
            case "session":
                return Collections.singletonList(EnumC5221k.Session);
            case "transaction":
                return Collections.singletonList(EnumC5221k.Transaction);
            default:
                return Collections.singletonList(EnumC5221k.Unknown);
        }
    }

    private boolean w(String str) {
        Iterator it = m(str).iterator();
        while (it.hasNext()) {
            if (o((EnumC5221k) it.next())) {
                return true;
            }
        }
        return false;
    }

    private void z(H h10, final boolean z10) {
        io.sentry.util.l.h(h10, io.sentry.hints.q.class, new l.a() { // from class: io.sentry.transport.w
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.q) obj).c(false);
            }
        });
        io.sentry.util.l.h(h10, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.l) obj).d(z10);
            }
        });
        io.sentry.util.l.h(h10, io.sentry.hints.f.class, new l.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                z.g(this.f51399a, (io.sentry.hints.f) obj);
            }
        });
    }

    public void E(b bVar) {
        this.f51403d.remove(bVar);
    }

    public void H(String str, String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                k(EnumC5221k.All, new Date(this.f51400a.getCurrentTimeMillis() + D(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(com.amazon.a.a.o.b.f.f34694a, -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
            if (strArrSplit.length > 0) {
                long jD = D(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f51400a.getCurrentTimeMillis() + jD);
                    if (str4 == null || str4.isEmpty()) {
                        k(EnumC5221k.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            EnumC5221k enumC5221kValueOf = EnumC5221k.Unknown;
                            try {
                                String strB = D.b(str5);
                                if (strB != null) {
                                    enumC5221kValueOf = EnumC5221k.valueOf(strB);
                                } else {
                                    this.f51401b.getLogger().c(EnumC5215i3.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.f51401b.getLogger().a(EnumC5215i3.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!EnumC5221k.Unknown.equals(enumC5221kValueOf)) {
                                k(enumC5221kValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = this.f51405f.a();
        try {
            Timer timer = this.f51404e;
            if (timer != null) {
                timer.cancel();
                this.f51404e = null;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            this.f51403d.clear();
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void j(b bVar) {
        this.f51403d.add(bVar);
    }

    public C5265q2 l(C5265q2 c5265q2, H h10) {
        ArrayList arrayList = null;
        for (T2 t22 : c5265q2.c()) {
            if (w(t22.O().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t22);
                this.f51401b.getClientReportRecorder().d(io.sentry.clientreport.f.RATELIMIT_BACKOFF, t22);
            }
        }
        if (arrayList == null) {
            return c5265q2;
        }
        this.f51401b.getLogger().c(EnumC5215i3.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (T2 t23 : c5265q2.c()) {
            if (!arrayList.contains(t23)) {
                arrayList2.add(t23);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C5265q2(c5265q2.b(), arrayList2);
        }
        this.f51401b.getLogger().c(EnumC5215i3.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        z(h10, false);
        return null;
    }

    public boolean o(EnumC5221k enumC5221k) {
        Date date;
        Date date2 = new Date(this.f51400a.getCurrentTimeMillis());
        Date date3 = (Date) this.f51402c.get(EnumC5221k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC5221k.Unknown.equals(enumC5221k) || (date = (Date) this.f51402c.get(enumC5221k)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean q() {
        Date date = new Date(this.f51400a.getCurrentTimeMillis());
        Iterator it = this.f51402c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) this.f51402c.get((EnumC5221k) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public z(C5322z3 c5322z3) {
        this(m.a(), c5322z3);
    }
}
