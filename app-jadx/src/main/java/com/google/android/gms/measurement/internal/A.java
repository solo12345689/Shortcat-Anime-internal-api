package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends B3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40604d;

    A(X2 x22) {
        super(x22);
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f40603c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f40604d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f40603c;
    }

    public final String p() {
        l();
        return this.f40604d;
    }
}
