package com.revenuecat.purchases.ui.revenuecatui.utils;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/utils/DefaultDateFormatter;", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;", "()V", "format", "", "date", "Ljava/util/Date;", "locale", "Ljava/util/Locale;", "formatUsingDateTimeFormatter", "formatUsingSimpleDateFormat", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultDateFormatter implements DateFormatter {
    public static final int $stable = 0;

    private final String formatUsingDateTimeFormatter(Date date, Locale locale) {
        String str = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern("dd MMM yyyy", locale));
        AbstractC5504s.g(str, "localDate.format(formatter)");
        return str;
    }

    private final String formatUsingSimpleDateFormat(Date date, Locale locale) {
        String str = new SimpleDateFormat("dd MMM yyyy", locale).format(date);
        AbstractC5504s.g(str, "formatter.format(date)");
        return str;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter
    public String format(Date date, Locale locale) {
        AbstractC5504s.h(date, "date");
        AbstractC5504s.h(locale, "locale");
        return Build.VERSION.SDK_INT >= 26 ? formatUsingDateTimeFormatter(date, locale) : formatUsingSimpleDateFormat(date, locale);
    }
}
