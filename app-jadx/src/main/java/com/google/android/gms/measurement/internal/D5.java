package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C3632z1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40709a;

    public D5(Context context) {
        AbstractC2115p.l(context);
        this.f40709a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    private final void k(q6 q6Var, Runnable runnable) {
        q6Var.b().t(new RunnableC3952z5(this, q6Var, runnable));
    }

    public final void a() {
        Log.v("FA", this.f40709a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f40709a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f40709a;
        X2 x2O = X2.O(context, null, null);
        final C3887q2 c3887q2A = x2O.a();
        String action = intent.getAction();
        x2O.c();
        c3887q2A.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(q6.F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.C5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f40692a.f(i11, c3887q2A, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC3950z3(q6.F(this.f40709a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC2115p.l(string);
            q6 q6VarF = q6.F(this.f40709a);
            final C3887q2 c3887q2A = q6VarF.a();
            q6VarF.c();
            c3887q2A.w().b("Local AppMeasurementJobService called. action", str);
            k(q6VarF, new Runnable() { // from class: com.google.android.gms.measurement.internal.A5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f40618a.g(c3887q2A, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C3632z1.s(this.f40709a, null).J(new Runnable() { // from class: com.google.android.gms.measurement.internal.B5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f40639a.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i10, C3887q2 c3887q2, Intent intent) {
        Context context = this.f40709a;
        j9.I i11 = (j9.I) context;
        if (i11.a(i10)) {
            c3887q2.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            X2.O(context, null, null).a().w().a("Completed wakeful intent.");
            i11.b(intent);
        }
    }

    final /* synthetic */ void g(C3887q2 c3887q2, JobParameters jobParameters) {
        c3887q2.w().a("AppMeasurementJobService processed last upload request.");
        ((j9.I) this.f40709a).c(jobParameters, false);
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((j9.I) this.f40709a).c(jobParameters, false);
    }
}
