package w;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class A0 implements z0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6914s f62321a;

    /* JADX INFO: renamed from: b */
    private AbstractC6913q f62322b;

    /* JADX INFO: renamed from: c */
    private AbstractC6913q f62323c;

    /* JADX INFO: renamed from: d */
    private AbstractC6913q f62324d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6914s {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6879H f62325a;

        a(InterfaceC6879H interfaceC6879H) {
            this.f62325a = interfaceC6879H;
        }

        @Override // w.InterfaceC6914s
        public InterfaceC6879H get(int i10) {
            return this.f62325a;
        }
    }

    public A0(InterfaceC6914s interfaceC6914s) {
        this.f62321a = interfaceC6914s;
    }

    @Override // w.v0
    public long b(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        Iterator it = AbstractC5874j.x(0, abstractC6913q.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((Ud.O) it).nextInt();
            jMax = Math.max(jMax, this.f62321a.get(iNextInt).e(abstractC6913q.a(iNextInt), abstractC6913q2.a(iNextInt), abstractC6913q3.a(iNextInt)));
        }
        return jMax;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        if (this.f62322b == null) {
            this.f62322b = r.g(abstractC6913q);
        }
        AbstractC6913q abstractC6913q4 = this.f62322b;
        if (abstractC6913q4 == null) {
            AbstractC5504s.u("valueVector");
            abstractC6913q4 = null;
        }
        int iB = abstractC6913q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q5 = this.f62322b;
            if (abstractC6913q5 == null) {
                AbstractC5504s.u("valueVector");
                abstractC6913q5 = null;
            }
            abstractC6913q5.e(i10, this.f62321a.get(i10).c(j10, abstractC6913q.a(i10), abstractC6913q2.a(i10), abstractC6913q3.a(i10)));
        }
        AbstractC6913q abstractC6913q6 = this.f62322b;
        if (abstractC6913q6 != null) {
            return abstractC6913q6;
        }
        AbstractC5504s.u("valueVector");
        return null;
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        if (this.f62323c == null) {
            this.f62323c = r.g(abstractC6913q3);
        }
        AbstractC6913q abstractC6913q4 = this.f62323c;
        if (abstractC6913q4 == null) {
            AbstractC5504s.u("velocityVector");
            abstractC6913q4 = null;
        }
        int iB = abstractC6913q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q5 = this.f62323c;
            if (abstractC6913q5 == null) {
                AbstractC5504s.u("velocityVector");
                abstractC6913q5 = null;
            }
            abstractC6913q5.e(i10, this.f62321a.get(i10).d(j10, abstractC6913q.a(i10), abstractC6913q2.a(i10), abstractC6913q3.a(i10)));
        }
        AbstractC6913q abstractC6913q6 = this.f62323c;
        if (abstractC6913q6 != null) {
            return abstractC6913q6;
        }
        AbstractC5504s.u("velocityVector");
        return null;
    }

    @Override // w.v0
    public AbstractC6913q g(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        if (this.f62324d == null) {
            this.f62324d = r.g(abstractC6913q3);
        }
        AbstractC6913q abstractC6913q4 = this.f62324d;
        if (abstractC6913q4 == null) {
            AbstractC5504s.u("endVelocityVector");
            abstractC6913q4 = null;
        }
        int iB = abstractC6913q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q5 = this.f62324d;
            if (abstractC6913q5 == null) {
                AbstractC5504s.u("endVelocityVector");
                abstractC6913q5 = null;
            }
            abstractC6913q5.e(i10, this.f62321a.get(i10).b(abstractC6913q.a(i10), abstractC6913q2.a(i10), abstractC6913q3.a(i10)));
        }
        AbstractC6913q abstractC6913q6 = this.f62324d;
        if (abstractC6913q6 != null) {
            return abstractC6913q6;
        }
        AbstractC5504s.u("endVelocityVector");
        return null;
    }

    public A0(InterfaceC6879H interfaceC6879H) {
        this(new a(interfaceC6879H));
    }
}
