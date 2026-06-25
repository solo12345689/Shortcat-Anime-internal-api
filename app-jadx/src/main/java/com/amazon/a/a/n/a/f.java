package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends com.amazon.a.a.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34525b = new com.amazon.a.a.o.c("DecisionDialog");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f34527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<a> f34528e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f34526c = Thread.currentThread();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.amazon.d.a.a f34531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Intent f34533c;

        public a(com.amazon.d.a.a aVar) {
            this.f34531a = aVar;
            this.f34532b = aVar.a();
            this.f34533c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f34531a;
        }

        public String b() {
            return this.f34532b;
        }

        public Intent c() {
            return this.f34533c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f34536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f34537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f34538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f34539f;

        public b(com.amazon.d.a.f fVar) {
            this.f34534a = fVar.b();
            this.f34535b = fVar.c();
            this.f34536c = fVar.d();
            this.f34537d = a(fVar.e());
            this.f34538e = a(fVar.f());
            this.f34539f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String b() {
            return this.f34535b;
        }

        public long c() {
            return this.f34536c;
        }

        public a d() {
            return this.f34539f;
        }

        public a e() {
            return this.f34538e;
        }

        public a f() {
            return this.f34537d;
        }

        public String a() {
            return this.f34534a;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f34527d = new b(fVar);
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!com.amazon.a.a.o.c.f34700b) {
                return null;
            }
            f34525b.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f34527d.a()).setMessage(this.f34527d.b()).setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        a(activity, alertDialogCreate, this.f34527d.f(), -1);
        a(activity, alertDialogCreate, this.f34527d.e(), -3);
        a(activity, alertDialogCreate, this.f34527d.d(), -2);
        return alertDialogCreate;
    }

    private com.amazon.d.a.a n() throws com.amazon.a.a.n.a.a.e {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                f34525b.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f34528e.take().a();
        } catch (InterruptedException unused) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34525b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new com.amazon.a.a.n.a.a.e(o());
        }
    }

    private e o() {
        return l() == com.amazon.a.a.i.d.NOT_COMPATIBLE ? e.APP_NOT_COMPATIBLE : e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        return a(this.f34527d.f()) || a(this.f34527d.e()) || a(this.f34527d.d());
    }

    @Override // com.amazon.a.a.i.b
    public Dialog d(Activity activity) {
        return f(activity);
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return this.f34527d.c();
    }

    public com.amazon.d.a.a i() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34525b.a("GetCustomerDecision: " + this.f34526c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f34527d.a();
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo activityInfoE = e(activity);
        if (activityInfoE == null) {
            return false;
        }
        boolean z10 = activityInfoE.launchMode == 3;
        com.amazon.a.a.o.c cVar = f34525b;
        cVar.a("Single instance: " + z10);
        boolean z11 = (activityInfoE.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z11);
        boolean z12 = (activityInfoE.flags & 128) != 0;
        cVar.a("No History: " + z12);
        return (z10 || z11 || z12) ? false : true;
    }

    @Override // com.amazon.a.a.i.b
    protected void a(com.amazon.a.a.i.d dVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34525b.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f34526c.interrupt();
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i10) {
        if (aVar == null) {
            return;
        }
        alertDialog.setButton(i10, aVar.b(), new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.n.a.f.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                if (com.amazon.a.a.o.c.f34699a) {
                    f.f34525b.a("Choice selected!");
                }
                if (f.this.k()) {
                    f.this.f34528e.add(aVar);
                }
            }
        });
    }
}
