package com.google.android.gms.common;

import Q8.InterfaceC2061i;
import Q8.K;
import Q8.L;
import Q8.N;
import R8.AbstractC2115p;
import R8.B;
import R8.E;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.m;
import androidx.fragment.app.AbstractActivityC2842v;
import com.google.android.gms.common.api.GoogleApiActivity;
import r4.AbstractC6254i;

/* JADX INFO: renamed from: com.google.android.gms.common.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3333a extends b {

    /* JADX INFO: renamed from: c */
    private String f38928c;

    /* JADX INFO: renamed from: e */
    private static final Object f38926e = new Object();

    /* JADX INFO: renamed from: f */
    private static final C3333a f38927f = new C3333a();

    /* JADX INFO: renamed from: d */
    public static final int f38925d = b.f38946a;

    public static C3333a n() {
        return f38927f;
    }

    @Override // com.google.android.gms.common.b
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // com.google.android.gms.common.b
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // com.google.android.gms.common.b
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // com.google.android.gms.common.b
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.b
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // com.google.android.gms.common.b
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11) {
        return l(activity, i10, i11, null);
    }

    public Dialog l(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i10, E.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent m(Context context, ConnectionResult connectionResult) {
        return connectionResult.i() ? connectionResult.f() : c(context, connectionResult.d(), 0);
    }

    public n9.i o(Activity activity) {
        int i10 = f38925d;
        AbstractC2115p.e("makeGooglePlayServicesAvailable must be called from the main thread");
        int iH = h(activity, i10);
        if (iH == 0) {
            return n9.l.f(null);
        }
        N nT = N.t(activity);
        nT.s(new ConnectionResult(iH, null), 0);
        return nT.u();
    }

    public boolean p(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i10, i11, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        u(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(Context context, int i10) {
        v(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog r(Context context, int i10, E e10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(B.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = B.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = e10;
        if (strB != null) {
            if (e10 == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = B.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(B.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        u(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final L t(Context context, K k10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        L l10 = new L(k10);
        d9.f.q(context, l10, intentFilter);
        l10.a(context);
        if (i(context, "com.google.android.gms")) {
            return l10;
        }
        k10.a();
        l10.b();
        return null;
    }

    final void u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2842v) {
                O8.m.N(dialog, onCancelListener).M(((AbstractActivityC2842v) activity).C(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        O8.b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void v(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = B.e(context, i10);
        String strD = B.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC2115p.l(context.getSystemService("notification"));
        m.e eVarO = new m.e(context).A(true).g(true).p(strE).O(new m.c().h(strD));
        if (com.google.android.gms.common.util.h.c(context)) {
            AbstractC2115p.o(com.google.android.gms.common.util.l.b());
            eVarO.K(context.getApplicationInfo().icon).E(2);
            if (com.google.android.gms.common.util.h.d(context)) {
                eVarO.a(M8.b.f12255a, resources.getString(M8.c.f12274o), pendingIntent);
            } else {
                eVarO.n(pendingIntent);
            }
        } else {
            eVarO.K(R.drawable.stat_sys_warning).Q(resources.getString(M8.c.f12267h)).V(System.currentTimeMillis()).n(pendingIntent).o(strD);
        }
        if (com.google.android.gms.common.util.l.e()) {
            AbstractC2115p.o(com.google.android.gms.common.util.l.e());
            synchronized (f38926e) {
                str2 = this.f38928c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(M8.c.f12266g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC6254i.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarO.j(str2);
        }
        Notification notificationD = eVarO.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            d.f38950b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationD);
    }

    final void w(Context context) {
        new f(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean x(Activity activity, InterfaceC2061i interfaceC2061i, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogR = r(activity, i10, E.c(interfaceC2061i, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogR == null) {
            return false;
        }
        u(activity, dialogR, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntentM;
        if (X8.b.a(context) || (pendingIntentM = m(context, connectionResult)) == null) {
            return false;
        }
        v(context, connectionResult.d(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i10, true), d9.g.f45084a | 134217728));
        return true;
    }
}
