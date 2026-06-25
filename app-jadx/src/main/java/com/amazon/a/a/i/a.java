package com.amazon.a.a.i;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34354b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34355e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f34356f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34357g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f34358j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f34359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f34360i;

    public a(c cVar) {
        super(cVar);
        this.f34360i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        if (f34356f.equalsIgnoreCase(this.f34360i.e()) || f34357g.equalsIgnoreCase(this.f34360i.e())) {
            try {
                Activity activityB = this.f34359h.b();
                if (activityB == null) {
                    activityB = this.f34359h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f34355e)));
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        return f34354b;
    }
}
