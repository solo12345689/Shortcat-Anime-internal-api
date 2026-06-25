.class public final Lcom/revenuecat/purchases/ui/revenuecatui/extensions/AnimationsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a.\u0010\u000c\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\r\u001a\u00020\u00018\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
        "",
        "packageButtonActionInProgressOpacityAnimation",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)F",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
        "packageInfo",
        "Ls0/r0;",
        "selectedColor",
        "unselectedColor",
        "packageButtonColorAnimation-9z6LAg8",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;JJLY/m;I)J",
        "packageButtonColorAnimation",
        "alpha",
        "result",
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
.method public static final packageButtonActionInProgressOpacityAnimation(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)F
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x659b1237

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LY/w;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonActionInProgressOpacityAnimation (Animations.kt:13)"

    .line 20
    .line 21
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-interface {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->getActionInProgress()LY/h2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    const p0, 0x3ecccccd    # 0.4f

    .line 41
    .line 42
    .line 43
    :goto_0
    move v0, p0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_1
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->defaultAnimation()Lw/r0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/16 v6, 0xc00

    .line 55
    .line 56
    const/16 v7, 0x14

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const-string v3, "Package button action in progress alpha"

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v5, p1

    .line 63
    invoke-static/range {v0 .. v7}, Lw/c;->d(FLw/i;FLjava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/AnimationsKt;->packageButtonActionInProgressOpacityAnimation$lambda$0(LY/h2;)F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {}, LY/w;->L()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-static {}, LY/w;->T()V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-interface {v5}, LY/m;->O()V

    .line 81
    .line 82
    .line 83
    return p0
.end method

.method private static final packageButtonActionInProgressOpacityAnimation$lambda$0(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final packageButtonColorAnimation-9z6LAg8(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;JJLY/m;I)J
    .locals 8

    .line 1
    const-string v0, "$this$packageButtonColorAnimation"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageInfo"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x2f387f23

    .line 12
    .line 13
    .line 14
    invoke-interface {p6, v0}, LY/m;->V(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, LY/w;->L()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonColorAnimation (Animations.kt:28)"

    .line 25
    .line 26
    invoke-static {v0, p7, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getSelectedPackage()LY/C0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    move-wide v0, p2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-wide v0, p4

    .line 46
    :goto_0
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->defaultAnimation()Lw/r0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string p2, "Package button selected color: "

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/4 v6, 0x0

    .line 78
    const/16 v7, 0x8

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    move-object v5, p6

    .line 82
    invoke-static/range {v0 .. v7}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/AnimationsKt;->packageButtonColorAnimation_9z6LAg8$lambda$1(LY/h2;)J

    .line 87
    .line 88
    .line 89
    move-result-wide p0

    .line 90
    invoke-static {}, LY/w;->L()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_2

    .line 95
    .line 96
    invoke-static {}, LY/w;->T()V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-interface {v5}, LY/m;->O()V

    .line 100
    .line 101
    .line 102
    return-wide p0
.end method

.method private static final packageButtonColorAnimation_9z6LAg8$lambda$1(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
