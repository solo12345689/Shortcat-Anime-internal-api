.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0014\u0010\u000c\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a\u001e\u0010\r\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0010"
    }
    d2 = {
        "measureUnit",
        "Landroid/icu/util/MeasureUnit;",
        "Lcom/revenuecat/purchases/models/Period$Unit;",
        "getMeasureUnit",
        "(Lcom/revenuecat/purchases/models/Period$Unit;)Landroid/icu/util/MeasureUnit;",
        "localized",
        "",
        "Lcom/revenuecat/purchases/models/Period;",
        "locale",
        "Ljava/util/Locale;",
        "width",
        "Landroid/icu/text/MeasureFormat$FormatWidth;",
        "localizedAbbreviatedPeriod",
        "localizedPeriod",
        "formatWidth",
        "localizedUnitPeriod",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic getMeasureUnit(Lcom/revenuecat/purchases/models/Period$Unit;)Landroid/icu/util/MeasureUnit;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, v0, :cond_4

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p0, v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_0
    new-instance p0, LTd/r;

    .line 32
    .line 33
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p0

    .line 37
    :cond_1
    sget-object p0, Landroid/icu/util/MeasureUnit;->YEAR:Landroid/icu/util/TimeUnit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    sget-object p0, Landroid/icu/util/MeasureUnit;->MONTH:Landroid/icu/util/TimeUnit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    sget-object p0, Landroid/icu/util/MeasureUnit;->WEEK:Landroid/icu/util/TimeUnit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    sget-object p0, Landroid/icu/util/MeasureUnit;->DAY:Landroid/icu/util/TimeUnit;

    .line 47
    .line 48
    return-object p0
.end method

.method private static final localized(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->localizedPeriod(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 p2, 0x1

    .line 10
    if-ne p0, p2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    const/4 v0, 0x0

    .line 14
    const-string v1, "1"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p1, v1, v2, p0, v0}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "substring(...)"

    .line 28
    .line 29
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, LDf/r;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    return-object p1
.end method

.method public static final synthetic localizedAbbreviatedPeriod(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "locale"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroid/icu/text/MeasureFormat$FormatWidth;->SHORT:Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 12
    .line 13
    invoke-static {p0, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->localized(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final synthetic localizedPeriod(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "locale"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "formatWidth"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Landroid/icu/text/MeasureFormat;->getInstance(Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Landroid/icu/text/MeasureFormat;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Landroid/icu/util/Measure;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->getMeasureUnit(Lcom/revenuecat/purchases/models/Period$Unit;)Landroid/icu/util/MeasureUnit;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p2, v0, p0}, Landroid/icu/util/Measure;-><init>(Ljava/lang/Number;Landroid/icu/util/MeasureUnit;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, "getInstance(locale, form\u2026 unit.measureUnit),\n    )"

    .line 46
    .line 47
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p0
.end method

.method public static synthetic localizedPeriod$default(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Landroid/icu/text/MeasureFormat$FormatWidth;->WIDE:Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->localizedPeriod(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final synthetic localizedUnitPeriod(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "locale"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroid/icu/text/MeasureFormat$FormatWidth;->WIDE:Landroid/icu/text/MeasureFormat$FormatWidth;

    .line 12
    .line 13
    invoke-static {p0, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PeriodExtensionsKt;->localized(Lcom/revenuecat/purchases/models/Period;Ljava/util/Locale;Landroid/icu/text/MeasureFormat$FormatWidth;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
