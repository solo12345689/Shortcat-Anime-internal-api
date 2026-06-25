package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.InterfaceC2955e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.impl.w;
import i4.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n4.C5737m;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements InterfaceC2955e {

    /* JADX INFO: renamed from: e */
    private static final String f32791e = i.i("CommandHandler");

    /* JADX INFO: renamed from: a */
    private final Context f32792a;

    /* JADX INFO: renamed from: b */
    private final Map f32793b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f32794c = new Object();

    /* JADX INFO: renamed from: d */
    private final w f32795d;

    b(Context context, w wVar) {
        this.f32792a = context;
        this.f32795d = wVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, C5737m c5737m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, c5737m);
    }

    static Intent c(Context context, C5737m c5737m, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, c5737m);
    }

    static Intent d(Context context, C5737m c5737m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, c5737m);
    }

    static Intent e(Context context, C5737m c5737m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, c5737m);
    }

    private void g(Intent intent, int i10, g gVar) {
        i.e().a(f32791e, "Handling constraints changed " + intent);
        new c(this.f32792a, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f32794c) {
            try {
                C5737m c5737mP = p(intent);
                i iVarE = i.e();
                String str = f32791e;
                iVarE.a(str, "Handing delay met for " + c5737mP);
                if (this.f32793b.containsKey(c5737mP)) {
                    i.e().a(str, "WorkSpec " + c5737mP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    f fVar = new f(this.f32792a, i10, gVar, this.f32795d.d(c5737mP));
                    this.f32793b.put(c5737mP, fVar);
                    fVar.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(Intent intent, int i10) {
        C5737m c5737mP = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        i.e().a(f32791e, "Handling onExecutionCompleted " + intent + ", " + i10);
        f(c5737mP, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        i.e().a(f32791e, "Handling reschedule " + intent + ", " + i10);
        gVar.g().z();
    }

    private void k(Intent intent, int i10, g gVar) {
        C5737m c5737mP = p(intent);
        i iVarE = i.e();
        String str = f32791e;
        iVarE.a(str, "Handling schedule work for " + c5737mP);
        WorkDatabase workDatabaseV = gVar.g().v();
        workDatabaseV.e();
        try {
            C5745u c5745uH = workDatabaseV.J().h(c5737mP.b());
            if (c5745uH == null) {
                i.e().k(str, "Skipping scheduling " + c5737mP + " because it's no longer in the DB");
                return;
            }
            if (c5745uH.f53944b.b()) {
                i.e().k(str, "Skipping scheduling " + c5737mP + "because it is finished.");
                return;
            }
            long jC = c5745uH.c();
            if (c5745uH.h()) {
                i.e().a(str, "Opportunistically setting an alarm for " + c5737mP + "at " + jC);
                a.c(this.f32792a, workDatabaseV, c5737mP, jC);
                gVar.e().a().execute(new g.b(gVar, a(this.f32792a), i10));
            } else {
                i.e().a(str, "Setting up Alarms for " + c5737mP + "at " + jC);
                a.c(this.f32792a, workDatabaseV, c5737mP, jC);
            }
            workDatabaseV.B();
        } finally {
            workDatabaseV.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<v> listC;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listC = new ArrayList(1);
            v vVarB = this.f32795d.b(new C5737m(string, i10));
            if (vVarB != null) {
                listC.add(vVarB);
            }
        } else {
            listC = this.f32795d.c(string);
        }
        for (v vVar : listC) {
            i.e().a(f32791e, "Handing stopWork work for " + string);
            gVar.g().E(vVar);
            a.a(this.f32792a, gVar.g().v(), vVar.a());
            gVar.f(vVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static C5737m p(Intent intent) {
        return new C5737m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, C5737m c5737m) {
        intent.putExtra("KEY_WORKSPEC_ID", c5737m.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", c5737m.a());
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        synchronized (this.f32794c) {
            try {
                f fVar = (f) this.f32793b.remove(c5737m);
                this.f32795d.b(c5737m);
                if (fVar != null) {
                    fVar.h(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f32794c) {
            z10 = !this.f32793b.isEmpty();
        }
        return z10;
    }

    void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.e().c(f32791e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        i.e().k(f32791e, "Ignoring intent " + intent);
    }
}
