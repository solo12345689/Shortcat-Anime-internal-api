package com.amazon.a.a.i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.a.a.i.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34410b = new com.amazon.a.a.o.c("SimplePrompt");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34411e = "OK";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f34412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a f34413d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        LEGACY,
        EXTENDED
    }

    public h(c cVar) {
        this(cVar, a.LEGACY);
    }

    private void a(AlertDialog.Builder builder) {
        String[] strArrB = this.f34412c.b();
        if (strArrB.length < 1 || strArrB.length > 2) {
            f34410b.b("Unexpected button count: " + strArrB.length);
            return;
        }
        boolean[] zArrA = a(this.f34412c.c());
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < zArrA.length; i12++) {
            if (zArrA[i12]) {
                i11++;
                i10 = i12;
            }
        }
        if (i11 == 1) {
            f34410b.a("single button dialog");
            a(builder, strArrB[i10], i10);
        } else {
            f34410b.a("two button dialog");
            builder.setNegativeButton(strArrB[0], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i13) {
                    if (h.this.k()) {
                        h.this.a(0);
                    }
                }
            });
            builder.setPositiveButton(strArrB[1], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i13) {
                    if (h.this.k()) {
                        h.this.a(1);
                    }
                }
            });
        }
    }

    private final Dialog e(Activity activity) {
        f34410b.a("Legacy mode dialog, legacy title = " + this.f34412c.e() + ", extended title = " + this.f34412c.f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f34412c.f()).setMessage(this.f34412c.d()).setCancelable(false).setNeutralButton(f34411e, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (h.this.k()) {
                    h.this.i();
                }
            }
        });
        return builder.create();
    }

    private final Dialog f(Activity activity) {
        com.amazon.a.a.o.c cVar = f34410b;
        cVar.a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f34412c.f()).setMessage(this.f34412c.d()).setCancelable(false);
        a(builder);
        cVar.a("doCreate() returning");
        return builder.create();
    }

    @Override // com.amazon.a.a.i.b
    protected boolean b(Activity activity) {
        return this.f34412c.h();
    }

    @Override // com.amazon.a.a.i.b
    public final Dialog d(Activity activity) {
        return this.f34413d == a.LEGACY ? e(activity) : f(activity);
    }

    protected abstract void i();

    public h(c cVar, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "content");
        this.f34412c = cVar;
        this.f34413d = aVar;
        f34410b.a("created SimplePrompt with mode " + aVar);
    }

    private void a(AlertDialog.Builder builder, String str, final int i10) {
        builder.setNeutralButton(str, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                if (h.this.k()) {
                    h.this.a(i10);
                }
            }
        });
    }

    private boolean[] a(c.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            boolean zA = a(aVarArr[i10]);
            zArr[i10] = zA;
            if (!zA) {
                f34410b.a("filterActions() filtering item " + i10);
            }
        }
        return zArr;
    }

    @Override // com.amazon.a.a.i.b
    protected void a(d dVar) {
        i();
    }

    protected void a(int i10) {
        f34410b.b("extended doAction from base class called, this should never happen.");
        i();
    }

    protected boolean a(c.a aVar) {
        return aVar == c.a.DEFAULT;
    }
}
