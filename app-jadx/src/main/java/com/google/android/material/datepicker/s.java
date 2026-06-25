package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f42452c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f42453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f42454b;

    private s(Long l10, TimeZone timeZone) {
        this.f42453a = l10;
        this.f42454b = timeZone;
    }

    static s c() {
        return f42452c;
    }

    Calendar a() {
        return b(this.f42454b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f42453a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
