package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f25530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f25531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f25532d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0429a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f25533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f25534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f25535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f25536d;

        public a a() {
            return new a(this.f25533a, this.f25534b, this.f25535c, this.f25536d);
        }

        public C0429a b(int i10) {
            this.f25534b = Integer.valueOf(i10);
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25529a = num;
        this.f25530b = num2;
        this.f25531c = num3;
        this.f25532d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25529a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25530b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25531c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25532d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
