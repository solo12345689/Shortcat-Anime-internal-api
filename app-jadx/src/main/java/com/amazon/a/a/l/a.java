package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f34437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f34440d;

    public a(Activity activity, int i10, int i11, Intent intent) {
        this.f34437a = activity;
        this.f34438b = i10;
        this.f34439c = i11;
        this.f34440d = intent;
    }

    public Activity a() {
        return this.f34437a;
    }

    public int b() {
        return this.f34438b;
    }

    public Intent c() {
        return this.f34440d;
    }

    public int d() {
        return this.f34439c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f34438b + ", resultCode: " + this.f34439c + ", activity: " + this.f34437a + ", intent: " + this.f34440d + "]";
    }
}
