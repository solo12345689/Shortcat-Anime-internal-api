.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0008\u0007\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000c2\u0006\u0010\r\u001a\u00020\u0005H\u0000\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000cH\u0000\u001a\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000cH\u0000\u001a\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000cH\u0000\u001a\"\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u0005*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "isLifetime",
        "",
        "Lcom/revenuecat/purchases/Package;",
        "(Lcom/revenuecat/purchases/Package;)Z",
        "periodUnitAbbreviatedLocalizationKey",
        "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
        "getPeriodUnitAbbreviatedLocalizationKey",
        "(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
        "periodUnitLocalizationKey",
        "getPeriodUnitLocalizationKey",
        "getStringOrLogError",
        "",
        "",
        "key",
        "productPeriod",
        "localizedVariableKeys",
        "productPeriodAbbreviated",
        "productPeriodWithUnit",
        "productPeriodly",
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
.method public static final getPeriodUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final getPeriodUnitLocalizationKey(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "Could not find localized string for variable key: "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-object p0
.end method

.method public static final isLifetime(Lcom/revenuecat/purchases/Package;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getPackageType()Lcom/revenuecat/purchases/PackageType;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/revenuecat/purchases/PackageType;->LIFETIME:Lcom/revenuecat/purchases/PackageType;

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static final productPeriod(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localizedVariableKeys"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-le v2, v3, :cond_3

    .line 42
    .line 43
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodValueWithUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string p1, "format(...)"

    .line 74
    .line 75
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_2
    return-object v1

    .line 80
    :cond_3
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getPeriodUnitLocalizationKey(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_4
    return-object v1
.end method

.method public static final productPeriodAbbreviated(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localizedVariableKeys"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-le v2, v3, :cond_3

    .line 42
    .line 43
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodValueWithUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string p1, "format(...)"

    .line 76
    .line 77
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_2
    return-object v1

    .line 82
    :cond_3
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getPeriodUnitAbbreviatedLocalizationKey(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_4
    return-object v1
.end method

.method public static final productPeriodWithUnit(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localizedVariableKeys"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 18
    .line 19
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodValueWithUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string p1, "format(...)"

    .line 67
    .line 68
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_1
    return-object v0
.end method

.method public static final productPeriodly(Lcom/revenuecat/purchases/Package;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localizedVariableKeys"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPeriod()Lcom/revenuecat/purchases/models/Period;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->isLifetime(Lcom/revenuecat/purchases/Package;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->LIFETIME:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 26
    .line 27
    invoke-static {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x1

    .line 41
    if-le v1, v2, :cond_3

    .line 42
    .line 43
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PeriodExtensionsKt;->getPeriodValueWithUnitLocalizationKey(Lcom/revenuecat/purchases/models/Period;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getValue()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string p1, "format(...)"

    .line 74
    .line 75
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-object p0

    .line 79
    :cond_3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Period;->getUnit()Lcom/revenuecat/purchases/models/Period$Unit;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    aget v0, v1, v0

    .line 90
    .line 91
    if-eq v0, v2, :cond_8

    .line 92
    .line 93
    const/4 v1, 0x2

    .line 94
    if-eq v0, v1, :cond_7

    .line 95
    .line 96
    const/4 v1, 0x3

    .line 97
    if-eq v0, v1, :cond_6

    .line 98
    .line 99
    const/4 v1, 0x4

    .line 100
    if-eq v0, v1, :cond_5

    .line 101
    .line 102
    const/4 v1, 0x5

    .line 103
    if-ne v0, v1, :cond_4

    .line 104
    .line 105
    move-object v0, p0

    .line 106
    goto :goto_0

    .line 107
    :cond_4
    new-instance p0, LTd/r;

    .line 108
    .line 109
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_5
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->YEARLY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_6
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->MONTHLY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->WEEKLY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_8
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;->DAILY:Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;

    .line 123
    .line 124
    :goto_0
    if-eqz v0, :cond_9

    .line 125
    .line 126
    invoke-static {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackagePeriodExtensionsKt;->getStringOrLogError(Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    :cond_9
    return-object p0
.end method
