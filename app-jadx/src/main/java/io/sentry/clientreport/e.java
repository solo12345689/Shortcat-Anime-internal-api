package io.sentry.clientreport;

import io.sentry.AbstractC5226l;
import io.sentry.C5235m3;
import io.sentry.C5265q2;
import io.sentry.C5266q3;
import io.sentry.C5322z3;
import io.sentry.EnumC5210h3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5221k;
import io.sentry.T2;
import io.sentry.protocol.E;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f50617a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50618b;

    public e(C5322z3 c5322z3) {
        this.f50618b = c5322z3;
    }

    private EnumC5221k f(EnumC5210h3 enumC5210h3) {
        return EnumC5210h3.Event.equals(enumC5210h3) ? EnumC5221k.Error : EnumC5210h3.Session.equals(enumC5210h3) ? EnumC5221k.Session : EnumC5210h3.Transaction.equals(enumC5210h3) ? EnumC5221k.Transaction : EnumC5210h3.UserFeedback.equals(enumC5210h3) ? EnumC5221k.UserReport : EnumC5210h3.Feedback.equals(enumC5210h3) ? EnumC5221k.Feedback : EnumC5210h3.Profile.equals(enumC5210h3) ? EnumC5221k.Profile : EnumC5210h3.ProfileChunk.equals(enumC5210h3) ? EnumC5221k.ProfileChunkUi : EnumC5210h3.Attachment.equals(enumC5210h3) ? EnumC5221k.Attachment : EnumC5210h3.CheckIn.equals(enumC5210h3) ? EnumC5221k.Monitor : EnumC5210h3.ReplayVideo.equals(enumC5210h3) ? EnumC5221k.Replay : EnumC5210h3.Log.equals(enumC5210h3) ? EnumC5221k.LogItem : EnumC5210h3.Span.equals(enumC5210h3) ? EnumC5221k.Span : EnumC5210h3.TraceMetric.equals(enumC5210h3) ? EnumC5221k.TraceMetric : EnumC5221k.Default;
    }

    private void g(f fVar, EnumC5221k enumC5221k, Long l10) {
        this.f50618b.getOnDiscard();
    }

    private void h(String str, String str2, Long l10) {
        this.f50617a.a(new d(str, str2), l10);
    }

    private void j(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, EnumC5221k enumC5221k) {
        c(fVar, enumC5221k, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, C5265q2 c5265q2) {
        if (c5265q2 == null) {
            return;
        }
        try {
            Iterator it = c5265q2.c().iterator();
            while (it.hasNext()) {
                d(fVar, (T2) it.next());
            }
        } catch (Throwable th2) {
            this.f50618b.getLogger().a(EnumC5215i3.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, EnumC5221k enumC5221k, long j10) {
        try {
            h(fVar.getReason(), enumC5221k.getCategory(), Long.valueOf(j10));
            g(fVar, enumC5221k, Long.valueOf(j10));
        } catch (Throwable th2) {
            this.f50618b.getLogger().a(EnumC5215i3.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(f fVar, T2 t22) {
        if (t22 == null) {
            return;
        }
        try {
            EnumC5210h3 enumC5210h3B = t22.O().b();
            if (EnumC5210h3.ClientReport.equals(enumC5210h3B)) {
                try {
                    j(t22.L(this.f50618b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f50618b.getLogger().c(EnumC5215i3.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC5221k enumC5221kF = f(enumC5210h3B);
            if (enumC5221kF.equals(EnumC5221k.Transaction)) {
                E eR = t22.R(this.f50618b.getSerializer());
                if (eR != null) {
                    List listO0 = eR.o0();
                    String reason = fVar.getReason();
                    EnumC5221k enumC5221k = EnumC5221k.Span;
                    h(reason, enumC5221k.getCategory(), Long.valueOf(((long) listO0.size()) + 1));
                    g(fVar, enumC5221k, Long.valueOf(((long) listO0.size()) + 1));
                }
                h(fVar.getReason(), enumC5221kF.getCategory(), 1L);
                g(fVar, enumC5221kF, 1L);
                return;
            }
            if (enumC5221kF.equals(EnumC5221k.LogItem)) {
                C5235m3 c5235m3P = t22.P(this.f50618b.getSerializer());
                if (c5235m3P == null) {
                    this.f50618b.getLogger().c(EnumC5215i3.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                long size = c5235m3P.a().size();
                h(fVar.getReason(), enumC5221kF.getCategory(), Long.valueOf(size));
                h(fVar.getReason(), EnumC5221k.LogByte.getCategory(), Long.valueOf(t22.M().length));
                g(fVar, enumC5221kF, Long.valueOf(size));
                return;
            }
            if (!enumC5221kF.equals(EnumC5221k.TraceMetric)) {
                h(fVar.getReason(), enumC5221kF.getCategory(), 1L);
                g(fVar, enumC5221kF, 1L);
                return;
            }
            C5266q3 c5266q3Q = t22.Q(this.f50618b.getSerializer());
            if (c5266q3Q == null) {
                this.f50618b.getLogger().c(EnumC5215i3.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            long size2 = c5266q3Q.a().size();
            h(fVar.getReason(), enumC5221kF.getCategory(), Long.valueOf(size2));
            g(fVar, enumC5221kF, Long.valueOf(size2));
        } catch (Throwable th2) {
            this.f50618b.getLogger().a(EnumC5215i3.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public C5265q2 e(C5265q2 c5265q2) {
        c cVarI = i();
        if (cVarI == null) {
            return c5265q2;
        }
        try {
            this.f50618b.getLogger().c(EnumC5215i3.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = c5265q2.c().iterator();
            while (it.hasNext()) {
                arrayList.add((T2) it.next());
            }
            arrayList.add(T2.D(this.f50618b.getSerializer(), cVarI));
            return new C5265q2(c5265q2.b(), arrayList);
        } catch (Throwable th2) {
            this.f50618b.getLogger().a(EnumC5215i3.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return c5265q2;
        }
    }

    c i() {
        Date dateD = AbstractC5226l.d();
        List listB = this.f50617a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateD, listB);
    }
}
