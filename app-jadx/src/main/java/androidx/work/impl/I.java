package androidx.work.impl;

import Td.L;
import Ud.AbstractC2279u;
import i4.l;
import i4.t;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import n4.C5745u;
import n4.InterfaceC5746v;
import n4.InterfaceC5750z;
import o4.AbstractC5823d;
import o4.RunnableC5822c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i4.u f32730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f32731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f32733d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i4.u uVar, E e10, String str, o oVar) {
            super(0);
            this.f32730a = uVar;
            this.f32731b = e10;
            this.f32732c = str;
            this.f32733d = oVar;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m103invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m103invoke() {
            new RunnableC5822c(new x(this.f32731b, this.f32732c, i4.d.KEEP, AbstractC2279u.e(this.f32730a)), this.f32733d).run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32734a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C5745u spec) {
            AbstractC5504s.h(spec, "spec");
            return spec.j() ? "Periodic" : "OneTime";
        }
    }

    public static final i4.l c(final E e10, final String name, final i4.u workRequest) {
        AbstractC5504s.h(e10, "<this>");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(workRequest, "workRequest");
        final o oVar = new o();
        final a aVar = new a(workRequest, e10, name, oVar);
        e10.w().b().execute(new Runnable() { // from class: androidx.work.impl.G
            @Override // java.lang.Runnable
            public final void run() {
                I.d(e10, name, oVar, aVar, workRequest);
            }
        });
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E this_enqueueUniquelyNamedPeriodic, String name, o operation, InterfaceC5082a enqueueNew, i4.u workRequest) {
        AbstractC5504s.h(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        AbstractC5504s.h(name, "$name");
        AbstractC5504s.h(operation, "$operation");
        AbstractC5504s.h(enqueueNew, "$enqueueNew");
        AbstractC5504s.h(workRequest, "$workRequest");
        InterfaceC5746v interfaceC5746vJ = this_enqueueUniquelyNamedPeriodic.v().J();
        List listO = interfaceC5746vJ.o(name);
        if (listO.size() > 1) {
            e(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        C5745u.b bVar = (C5745u.b) AbstractC2279u.o0(listO);
        if (bVar == null) {
            enqueueNew.invoke();
            return;
        }
        C5745u c5745uH = interfaceC5746vJ.h(bVar.f53963a);
        if (c5745uH == null) {
            operation.a(new l.b.a(new IllegalStateException("WorkSpec with " + bVar.f53963a + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!c5745uH.j()) {
            e(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (bVar.f53964b == i4.s.CANCELLED) {
            interfaceC5746vJ.a(bVar.f53963a);
            enqueueNew.invoke();
            return;
        }
        C5745u c5745uE = C5745u.e(workRequest.d(), bVar.f53963a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048574, null);
        try {
            r processor = this_enqueueUniquelyNamedPeriodic.s();
            AbstractC5504s.g(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.v();
            AbstractC5504s.g(workDatabase, "workDatabase");
            androidx.work.a configuration = this_enqueueUniquelyNamedPeriodic.o();
            AbstractC5504s.g(configuration, "configuration");
            List schedulers = this_enqueueUniquelyNamedPeriodic.t();
            AbstractC5504s.g(schedulers, "schedulers");
            f(processor, workDatabase, configuration, schedulers, c5745uE, workRequest.c());
            operation.a(i4.l.f48678a);
        } catch (Throwable th2) {
            operation.a(new l.b.a(th2));
        }
    }

    private static final void e(o oVar, String str) {
        oVar.a(new l.b.a(new UnsupportedOperationException(str)));
    }

    private static final t.a f(r rVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List list, final C5745u c5745u, final Set set) {
        final String str = c5745u.f53943a;
        final C5745u c5745uH = workDatabase.J().h(str);
        if (c5745uH == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (c5745uH.f53944b.b()) {
            return t.a.NOT_APPLIED;
        }
        if (c5745uH.j() ^ c5745u.j()) {
            b bVar = b.f32734a;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.invoke(c5745uH)) + " Worker to " + ((String) bVar.invoke(c5745u)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = rVar.k(str);
        if (!zK) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(str);
            }
        }
        workDatabase.A(new Runnable() { // from class: androidx.work.impl.H
            @Override // java.lang.Runnable
            public final void run() {
                I.g(workDatabase, c5745u, c5745uH, list, str, set, zK);
            }
        });
        if (!zK) {
            u.b(aVar, workDatabase, list);
        }
        return zK ? t.a.APPLIED_FOR_NEXT_RUN : t.a.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WorkDatabase workDatabase, C5745u newWorkSpec, C5745u oldWorkSpec, List schedulers, String workSpecId, Set tags, boolean z10) {
        AbstractC5504s.h(workDatabase, "$workDatabase");
        AbstractC5504s.h(newWorkSpec, "$newWorkSpec");
        AbstractC5504s.h(oldWorkSpec, "$oldWorkSpec");
        AbstractC5504s.h(schedulers, "$schedulers");
        AbstractC5504s.h(workSpecId, "$workSpecId");
        AbstractC5504s.h(tags, "$tags");
        InterfaceC5746v interfaceC5746vJ = workDatabase.J();
        InterfaceC5750z interfaceC5750zK = workDatabase.K();
        interfaceC5746vJ.w(AbstractC5823d.b(schedulers, C5745u.e(newWorkSpec, null, oldWorkSpec.f53944b, null, null, null, null, 0L, 0L, 0L, null, oldWorkSpec.f53953k, null, 0L, oldWorkSpec.f53956n, 0L, 0L, false, null, 0, oldWorkSpec.f() + 1, 515069, null)));
        interfaceC5750zK.b(workSpecId);
        interfaceC5750zK.c(workSpecId, tags);
        if (z10) {
            return;
        }
        interfaceC5746vJ.n(workSpecId, -1L);
        workDatabase.I().a(workSpecId);
    }
}
