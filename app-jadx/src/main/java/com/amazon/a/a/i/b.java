package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends com.amazon.a.a.e.c<b> {

    /* JADX INFO: renamed from: b */
    private static final com.amazon.a.a.o.c f34361b = new com.amazon.a.a.o.c("Prompt");

    /* JADX INFO: renamed from: c */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f34362c;

    /* JADX INFO: renamed from: d */
    private final int f34363d;

    /* JADX INFO: renamed from: e */
    private Activity f34364e;

    /* JADX INFO: renamed from: f */
    private d f34365f;

    /* JADX INFO: renamed from: g */
    private Dialog f34366g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f34367h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.amazon.a.a.i.b$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 implements DialogInterface.OnKeyListener {
        AnonymousClass1() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            return i10 == 84;
        }
    }

    /* JADX INFO: renamed from: com.amazon.a.a.i.b$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass2 implements com.amazon.a.a.n.a {
        AnonymousClass2() {
        }

        @Override // com.amazon.a.a.n.a
        public void a() {
            b.this.k();
        }

        public String toString() {
            return "DismissPromptTask: " + b.this.toString();
        }
    }

    public b() {
        int i10 = i();
        this.f34363d = i10;
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.a("Creating Prompt: " + i10);
        }
    }

    private boolean e(Activity activity) {
        if (this.f34362c.b(com.amazon.a.a.m.c.f34465e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f34364e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int iNextInt = new Random().nextInt(2146249079) + 1234567;
        if (iNextInt <= 1234567) {
            return 1234567;
        }
        return iNextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.b("Dismissing dialog: " + this.f34363d);
        }
        try {
            this.f34364e.dismissDialog(this.f34363d);
            this.f34364e.removeDialog(this.f34363d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34361b.b("Unable to remove dialog: " + this.f34363d);
            }
        }
        this.f34364e = null;
        this.f34366g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.NOT_COMPATIBLE);
        }
    }

    protected abstract void a(d dVar);

    protected boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f34364e = activity;
        Dialog dialogD = d(activity);
        this.f34366g = dialogD;
        dialogD.setCancelable(false);
        this.f34366g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            AnonymousClass1() {
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return i10 == 84;
            }
        });
        return this.f34366g;
    }

    protected abstract Dialog d(Activity activity);

    @Override // com.amazon.a.a.e.a
    protected final void d() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.a("Expiring prompt: " + this);
        }
        this.f34325a.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.b.2
            AnonymousClass2() {
            }

            @Override // com.amazon.a.a.n.a
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f34363d;
    }

    public final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.a("Dismissing Prompt: " + this.f34363d);
        }
        if (!this.f34367h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34361b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f34364e != null) {
            m();
        }
        f();
        return true;
    }

    protected d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f34365f;
        return dVar == null ? d.EXPIRATION_DURATION_ELAPSED : dVar;
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f34699a) {
            f34361b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f34365f = dVar;
        c();
    }

    public void a(Activity activity, boolean z10) {
        if (activity != this.f34364e) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34361b.a("Unrecognized context");
            }
        } else {
            if (!z10 || this.f34366g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.f34699a) {
                f34361b.a("showing dialog because it was not showing");
            }
            this.f34366g.show();
        }
    }
}
