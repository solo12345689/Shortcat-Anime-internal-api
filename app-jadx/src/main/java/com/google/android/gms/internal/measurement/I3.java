package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f39382a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f39383b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f39384c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f39385d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
