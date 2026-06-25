package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import com.facebook.hermes.intl.c;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import o6.InterfaceC5833b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Format f35953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.icu.text.NumberFormat f35954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o6.h f35955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.h f35956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MeasureUnit f35957e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35958a;

        static {
            int[] iArr = new int[c.g.values().length];
            f35958a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35958a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35958a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j() {
    }

    public static int n(String str) throws o6.f {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new o6.f("Invalid currency code !");
        }
    }

    private void o(android.icu.text.NumberFormat numberFormat, InterfaceC5833b interfaceC5833b, c.h hVar) {
        this.f35954b = numberFormat;
        this.f35953a = numberFormat;
        this.f35955c = (o6.h) interfaceC5833b;
        this.f35956d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) throws o6.f {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new o6.f("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d10) {
        try {
            try {
                Format format = this.f35953a;
                return (!(format instanceof MeasureFormat) || this.f35957e == null) ? format.formatToCharacterIterator(Double.valueOf(d10)) : format.formatToCharacterIterator(new Measure(Double.valueOf(d10), this.f35957e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d10));
            } catch (Exception unused2) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
            }
        } catch (RuntimeException unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String b(InterfaceC5833b interfaceC5833b) {
        return NumberingSystem.getInstance((ULocale) interfaceC5833b.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d10) {
        try {
            try {
                Format format = this.f35953a;
                return (!(format instanceof MeasureFormat) || this.f35957e == null) ? format.format(Double.valueOf(d10)) : format.format(new Measure(Double.valueOf(d10), this.f35957e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d10);
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d10);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String l(AttributedCharacterIterator.Attribute attribute, double d10) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d10, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d10) ? "nan" : Double.isInfinite(d10) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? "group" : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? com.amazon.a.a.o.b.f34634a : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j d(InterfaceC5833b interfaceC5833b, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar) throws o6.f {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(o6.d.h(str)) == null) {
                    throw new o6.f("Invalid numbering system: " + str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(o6.d.h(str));
                interfaceC5833b.f("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new o6.f("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            o(CompactDecimalFormat.getInstance((ULocale) interfaceC5833b.getLocale(), bVar == c.b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG), interfaceC5833b, hVar);
            return this;
        }
        android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) interfaceC5833b.getLocale(), hVar.b(eVar, dVar));
        if (eVar == c.e.ENGINEERING) {
            numberFormat.setMaximumIntegerDigits(3);
        }
        o(numberFormat, interfaceC5833b, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j e(String str, c.EnumC0602c enumC0602c) {
        if (this.f35956d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f35954b.setCurrency(currency);
            if (enumC0602c != c.EnumC0602c.CODE) {
                str = currency.getName(this.f35955c.getLocale(), enumC0602c.b(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f35954b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j i(c.f fVar, int i10, int i11) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f35954b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f35954b.setMaximumFractionDigits(i11);
            }
            android.icu.text.NumberFormat numberFormat = this.f35954b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j h(boolean z10) {
        this.f35954b.setGroupingUsed(z10);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public j g(int i10) {
        if (i10 != -1) {
            this.f35954b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j k(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f35954b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if (Build.VERSION.SDK_INT >= 31) {
                int i10 = a.f35958a[gVar.ordinal()];
                if (i10 == 1) {
                    decimalFormat.setSignAlwaysShown(false);
                    return this;
                }
                if (i10 == 2 || i10 == 3) {
                    decimalFormat.setSignAlwaysShown(true);
                    return this;
                }
            } else {
                int i11 = a.f35958a[gVar.ordinal()];
                if (i11 == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                } else if (i11 == 2 || i11 == 3) {
                    if (!decimalFormat.getNegativePrefix().isEmpty()) {
                        decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                    if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                        decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                        return this;
                    }
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j f(c.f fVar, int i10, int i11) throws o6.f {
        android.icu.text.NumberFormat numberFormat = this.f35954b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new o6.f("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i11);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j j(String str, c.i iVar) {
        if (this.f35956d == c.h.UNIT) {
            this.f35957e = p(str);
            this.f35953a = MeasureFormat.getInstance(this.f35955c.getLocale(), iVar.b(), this.f35954b);
        }
        return this;
    }
}
