package com.google.firebase.installations;

import android.text.TextUtils;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.C6166b;
import qa.InterfaceC6165a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f43299b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f43300c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f43301d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6165a f43302a;

    private i(InterfaceC6165a interfaceC6165a) {
        this.f43302a = interfaceC6165a;
    }

    public static i c() {
        return d(C6166b.b());
    }

    public static i d(InterfaceC6165a interfaceC6165a) {
        if (f43301d == null) {
            f43301d = new i(interfaceC6165a);
        }
        return f43301d;
    }

    static boolean g(String str) {
        return f43300c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    }

    public long a() {
        return this.f43302a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(oa.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f43299b;
    }
}
