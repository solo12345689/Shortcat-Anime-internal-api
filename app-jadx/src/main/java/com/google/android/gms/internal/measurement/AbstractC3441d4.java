package com.google.android.gms.internal.measurement;

import android.net.Uri;
import t.C6551a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3441d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6551a f39736a = new C6551a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39737b = 0;

    public static synchronized Uri a(String str) {
        C6551a c6551a = f39736a;
        Uri uri = (Uri) c6551a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c6551a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
