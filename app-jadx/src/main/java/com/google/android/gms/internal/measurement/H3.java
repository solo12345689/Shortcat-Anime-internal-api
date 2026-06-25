package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final J3 f39361a;

    static {
        Uri uri = I3.f39382a;
        f39361a = K3.b();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f39361a.a(contentResolver, str, null);
    }
}
