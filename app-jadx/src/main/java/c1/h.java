package c1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final String a(Locale locale) {
        return locale.getLanguage();
    }

    public static final String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
