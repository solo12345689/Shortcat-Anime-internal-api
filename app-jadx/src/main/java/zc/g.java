package zc;

import Df.r;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.content.Context;
import android.content.SharedPreferences;
import android.icu.util.LocaleData;
import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import bc.C3042a;
import bc.EnumC3046e;
import ie.InterfaceC5082a;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.U;
import pc.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lzc/g;", "Lgc/c;", "<init>", "()V", "Landroid/content/Context;", "context", "LTd/L;", "J", "(Landroid/content/Context;)V", "Ljava/util/Locale;", "locale", "", "G", "(Ljava/util/Locale;)Ljava/lang/String;", "", "", "F", "(Ljava/util/Locale;)Ljava/util/Map;", "", "H", "()Ljava/util/List;", "", "K", "()Z", "D", "()Ljava/lang/String;", "E", "Lgc/e;", "n", "()Lgc/e;", "Lkotlin/Function0;", "d", "Lie/a;", "observer", "expo-localization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5082a observer = new InterfaceC5082a() { // from class: zc.f
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return g.I();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC5082a {
        a() {
        }

        public final void a() {
            gc.c.u(g.this, "onLocaleSettingsChanged", null, 2, null);
            gc.c.u(g.this, "onCalendarSettingsChanged", null, 2, null);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return g.this.H();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return g.this.E();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {
        public d() {
        }

        public final void a() {
            Context contextB = g.this.i().B();
            if (contextB != null) {
                g.this.J(contextB);
            }
            g gVar = g.this;
            gVar.observer = gVar.new a();
            i.f66057a.c(g.this.observer);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {
        public e() {
        }

        public final void a() {
            i.f66057a.a(g.this.observer);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    private final String D() {
        return Build.VERSION.SDK_INT >= 26 ? Calendar.getInstance().getCalendarType().toString() : "gregory";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List E() {
        return AbstractC2279u.e(S.l(z.a("calendar", D()), z.a("uses24hourClock", Boolean.valueOf(K())), z.a("firstWeekday", Integer.valueOf(Calendar.getInstance().getFirstDayOfWeek())), z.a("timeZone", Calendar.getInstance().getTimeZone().getID())));
    }

    private final Map F(Locale locale) {
        try {
            return S.l(z.a("currencyCode", Currency.getInstance(locale).getCurrencyCode()), z.a("currencySymbol", Currency.getInstance(locale).getSymbol(locale)), z.a("languageCurrencyCode", Currency.getInstance(locale).getCurrencyCode()), z.a("languageCurrencySymbol", Currency.getInstance(locale).getSymbol(locale)));
        } catch (Exception unused) {
            return S.l(z.a("currencyCode", null), z.a("currencySymbol", null), z.a("languageCurrencyCode", null), z.a("languageCurrencySymbol", null));
        }
    }

    private final String G(Locale locale) {
        if (Build.VERSION.SDK_INT < 28) {
            return r.C(h.b(locale), "uk", false, 2, null) ? "uk" : AbstractC2279u.e0(h.e(), h.b(locale)) ? "us" : "metric";
        }
        LocaleData.MeasurementSystem measurementSystem = LocaleData.getMeasurementSystem(ULocale.forLocale(locale));
        return AbstractC5504s.c(measurementSystem, LocaleData.MeasurementSystem.SI) ? "metric" : AbstractC5504s.c(measurementSystem, LocaleData.MeasurementSystem.UK) ? "uk" : AbstractC5504s.c(measurementSystem, LocaleData.MeasurementSystem.US) ? "us" : "metric";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List H() {
        ArrayList arrayList = new ArrayList();
        G1.i iVarD = G1.i.d();
        AbstractC5504s.g(iVarD, "getDefault(...)");
        int iG = iVarD.g();
        for (int i10 = 0; i10 < iG; i10++) {
            try {
                Locale localeC = iVarD.c(i10);
                if (localeC != null) {
                    DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(localeC);
                    Pair pairA = z.a("languageTag", localeC.toLanguageTag());
                    Pair pairA2 = z.a("regionCode", h.b(localeC));
                    Pair pairA3 = z.a("languageRegionCode", h.a(localeC));
                    Pair pairA4 = z.a("textDirection", TextUtils.getLayoutDirectionFromLocale(localeC) == 1 ? "rtl" : "ltr");
                    Pair pairA5 = z.a("languageCode", localeC.getLanguage());
                    String script = localeC.getScript();
                    if (script.length() == 0) {
                        script = null;
                    }
                    arrayList.add(S.p(S.l(pairA, pairA2, pairA3, pairA4, pairA5, z.a("languageScriptCode", script), z.a("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator())), z.a("digitGroupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator())), z.a("measurementSystem", G(localeC)), z.a("temperatureUnit", h.d(localeC))), F(localeC)));
                }
            } catch (Exception e10) {
                Log.w("expo-localization", "Failed to get locale for index " + i10, e10);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L I() {
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Context context) {
        Context contextB = i().B();
        String string = contextB != null ? contextB.getString(j.f66060b) : null;
        Context contextB2 = i().B();
        String string2 = contextB2 != null ? contextB2.getString(j.f66059a) : null;
        if (AbstractC5504s.c(string2, com.amazon.a.a.o.b.f34640af)) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
            editorEdit.putBoolean("RCTI18nUtil_allowRTL", true);
            editorEdit.putBoolean("RCTI18nUtil_forceRTL", true);
            editorEdit.apply();
            return;
        }
        if (AbstractC5504s.c(string, com.amazon.a.a.o.b.f34640af) || AbstractC5504s.c(string, com.amazon.a.a.o.b.f34641ag)) {
            SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
            editorEdit2.putBoolean("RCTI18nUtil_allowRTL", AbstractC5504s.c(string, com.amazon.a.a.o.b.f34640af));
            if (AbstractC5504s.c(string2, com.amazon.a.a.o.b.f34641ag)) {
                editorEdit2.putBoolean("RCTI18nUtil_forceRTL", false);
            }
            editorEdit2.apply();
        }
    }

    private final boolean K() {
        if (i().B() == null) {
            return false;
        }
        return DateFormat.is24HourFormat(i().B());
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoLocalization");
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(Object.class));
            if (u10 == null) {
                u10 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u10);
            }
            dVar.p().put("getLocales", new dc.r("getLocales", c5972bArr, u10, new b()));
            C5972b[] c5972bArr2 = new C5972b[0];
            U u11 = (U) v10.a().get(O.b(Object.class));
            if (u11 == null) {
                u11 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u11);
            }
            dVar.p().put("getCalendars", new dc.r("getCalendars", c5972bArr2, u11, new c()));
            dVar.d("onLocaleSettingsChanged", "onCalendarSettingsChanged");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new d()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new e()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
