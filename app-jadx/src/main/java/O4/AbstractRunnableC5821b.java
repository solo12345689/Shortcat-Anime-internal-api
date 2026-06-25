package o4;

import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import i4.l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import n4.InterfaceC5726b;
import n4.InterfaceC5746v;

/* JADX INFO: renamed from: o4.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC5821b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final androidx.work.impl.o f54483a = new androidx.work.impl.o();

    /* JADX INFO: renamed from: o4.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractRunnableC5821b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E f54484b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ UUID f54485c;

        a(E e10, UUID uuid) {
            this.f54484b = e10;
            this.f54485c = uuid;
        }

        @Override // o4.AbstractRunnableC5821b
        void h() {
            WorkDatabase workDatabaseV = this.f54484b.v();
            workDatabaseV.e();
            try {
                a(this.f54484b, this.f54485c.toString());
                workDatabaseV.B();
                workDatabaseV.i();
                g(this.f54484b);
            } catch (Throwable th2) {
                workDatabaseV.i();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o4.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0846b extends AbstractRunnableC5821b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E f54486b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f54487c;

        C0846b(E e10, String str) {
            this.f54486b = e10;
            this.f54487c = str;
        }

        @Override // o4.AbstractRunnableC5821b
        void h() {
            WorkDatabase workDatabaseV = this.f54486b.v();
            workDatabaseV.e();
            try {
                Iterator it = workDatabaseV.J().j(this.f54487c).iterator();
                while (it.hasNext()) {
                    a(this.f54486b, (String) it.next());
                }
                workDatabaseV.B();
                workDatabaseV.i();
                g(this.f54486b);
            } catch (Throwable th2) {
                workDatabaseV.i();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o4.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends AbstractRunnableC5821b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ E f54488b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f54489c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f54490d;

        c(E e10, String str, boolean z10) {
            this.f54488b = e10;
            this.f54489c = str;
            this.f54490d = z10;
        }

        @Override // o4.AbstractRunnableC5821b
        void h() {
            WorkDatabase workDatabaseV = this.f54488b.v();
            workDatabaseV.e();
            try {
                Iterator it = workDatabaseV.J().f(this.f54489c).iterator();
                while (it.hasNext()) {
                    a(this.f54488b, (String) it.next());
                }
                workDatabaseV.B();
                workDatabaseV.i();
                if (this.f54490d) {
                    g(this.f54488b);
                }
            } catch (Throwable th2) {
                workDatabaseV.i();
                throw th2;
            }
        }
    }

    public static AbstractRunnableC5821b b(UUID uuid, E e10) {
        return new a(e10, uuid);
    }

    public static AbstractRunnableC5821b c(String str, E e10, boolean z10) {
        return new c(e10, str, z10);
    }

    public static AbstractRunnableC5821b d(String str, E e10) {
        return new C0846b(e10, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        InterfaceC5746v interfaceC5746vJ = workDatabase.J();
        InterfaceC5726b interfaceC5726bE = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            i4.s sVarG = interfaceC5746vJ.g(str2);
            if (sVarG != i4.s.SUCCEEDED && sVarG != i4.s.FAILED) {
                interfaceC5746vJ.q(i4.s.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC5726bE.a(str2));
        }
    }

    void a(E e10, String str) {
        f(e10.v(), str);
        e10.s().p(str);
        Iterator it = e10.t().iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.t) it.next()).c(str);
        }
    }

    public i4.l e() {
        return this.f54483a;
    }

    void g(E e10) {
        androidx.work.impl.u.b(e10.o(), e10.v(), e10.t());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f54483a.a(i4.l.f48678a);
        } catch (Throwable th2) {
            this.f54483a.a(new l.b.a(th2));
        }
    }
}
