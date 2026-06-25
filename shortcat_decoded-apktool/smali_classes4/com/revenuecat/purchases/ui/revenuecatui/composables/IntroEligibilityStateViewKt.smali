.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001ax\u0010\u0015\u001a\u00020\u00122\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a5\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "textWithNoIntroOffer",
        "textWithIntroOffer",
        "textWithMultipleIntroOffers",
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;",
        "eligibility",
        "Ls0/r0;",
        "color",
        "LU0/Y0;",
        "style",
        "LY0/L;",
        "fontWeight",
        "Lg1/j;",
        "textAlign",
        "",
        "allowLinks",
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "IntroEligibilityStateView-QETHhvg",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V",
        "IntroEligibilityStateView",
        "introEligibilityText",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "IntroEligibilityPreviewNoOffer",
        "(LY/m;I)V",
        "IntroEligibilityPreviewBothTextsIneligible",
        "IntroEligibilityPreviewBothTextsEligibleSingleOffer",
        "IntroEligibilityPreviewBothTextsEligibleMultipleOffers",
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
.method private static final IntroEligibilityPreviewBothTextsEligibleMultipleOffers(LY/m;I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x190c193e

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v13

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v13}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v13}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleMultipleOffers (IntroEligibilityStateView.kt:152)"

    .line 33
    .line 34
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferMultiple;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferMultiple;

    .line 38
    .line 39
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 40
    .line 41
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const/16 v14, 0x6db6

    .line 46
    .line 47
    const/16 v15, 0x3e0

    .line 48
    .line 49
    const-string v2, "$3.99/mo"

    .line 50
    .line 51
    const-string v3, "7 day trial, then $3.99/mo"

    .line 52
    .line 53
    const-string v4, "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter."

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    invoke-static/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, LY/w;->L()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-static {}, LY/w;->T()V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    invoke-interface {v13}, LY/m;->k()LY/B1;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleMultipleOffers$1;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleMultipleOffers$1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return-void
.end method

.method private static final IntroEligibilityPreviewBothTextsEligibleSingleOffer(LY/m;I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x5659f1db

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v13

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v13}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v13}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleSingleOffer (IntroEligibilityStateView.kt:140)"

    .line 33
    .line 34
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;

    .line 38
    .line 39
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 40
    .line 41
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const/16 v14, 0x6db6

    .line 46
    .line 47
    const/16 v15, 0x3e0

    .line 48
    .line 49
    const-string v2, "$3.99/mo"

    .line 50
    .line 51
    const-string v3, "7 day trial, then $3.99/mo"

    .line 52
    .line 53
    const-string v4, "7 days for free, then $1.99 for your first month, and just $3.99/mo thereafter."

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    invoke-static/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, LY/w;->L()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-static {}, LY/w;->T()V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    invoke-interface {v13}, LY/m;->k()LY/B1;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleSingleOffer$1;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsEligibleSingleOffer$1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return-void
.end method

.method private static final IntroEligibilityPreviewBothTextsIneligible(LY/m;I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, 0xa2c8404

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v13

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v13}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v13}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsIneligible (IntroEligibilityStateView.kt:128)"

    .line 33
    .line 34
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$Ineligible;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$Ineligible;

    .line 38
    .line 39
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 40
    .line 41
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const/16 v14, 0x6db6

    .line 46
    .line 47
    const/16 v15, 0x3e0

    .line 48
    .line 49
    const-string v2, "$3.99/mo"

    .line 50
    .line 51
    const-string v3, "7 day trial, then $3.99/mo"

    .line 52
    .line 53
    const-string v4, "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter."

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    invoke-static/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, LY/w;->L()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-static {}, LY/w;->T()V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    invoke-interface {v13}, LY/m;->k()LY/B1;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsIneligible$1;

    .line 79
    .line 80
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewBothTextsIneligible$1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return-void
.end method

.method private static final IntroEligibilityPreviewNoOffer(LY/m;I)V
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0xf360696    # -5.0006408E29f

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v13

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v13}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v13}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewNoOffer (IntroEligibilityStateView.kt:116)"

    .line 33
    .line 34
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;

    .line 38
    .line 39
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 40
    .line 41
    invoke-virtual {v1}, Ls0/r0$a;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const/16 v14, 0x6db6

    .line 46
    .line 47
    const/16 v15, 0x3e0

    .line 48
    .line 49
    const-string v2, "$3.99/mo"

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    invoke-static/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, LY/w;->L()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-static {}, LY/w;->T()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    invoke-interface {v13}, LY/m;->k()LY/B1;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewNoOffer$1;

    .line 77
    .line 78
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityPreviewNoOffer$1;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public static final IntroEligibilityStateView-QETHhvg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;LY/m;II)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v12, p12

    move/from16 v13, p13

    const-string v0, "eligibility"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1bb8a59a

    move-object/from16 v5, p11

    .line 1
    invoke-interface {v5, v0}, LY/m;->g(I)LY/m;

    move-result-object v5

    and-int/lit8 v6, v13, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v12, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v12, 0x6

    if-nez v6, :cond_2

    invoke-interface {v5, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v12

    goto :goto_1

    :cond_2
    move v6, v12

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v12, 0x30

    if-nez v7, :cond_5

    invoke-interface {v5, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v13, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_8

    invoke-interface {v5, v3}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v13, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v12, 0xc00

    if-nez v7, :cond_b

    invoke-interface {v5, v4}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    :goto_7
    and-int/lit8 v7, v13, 0x10

    if-eqz v7, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-wide/from16 v8, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v8, v12, 0x6000

    if-nez v8, :cond_c

    move-wide/from16 v8, p4

    invoke-interface {v5, v8, v9}, LY/m;->d(J)Z

    move-result v10

    if-eqz v10, :cond_e

    const/16 v10, 0x4000

    goto :goto_8

    :cond_e
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v6, v10

    :goto_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v12

    if-nez v10, :cond_11

    and-int/lit8 v10, v13, 0x20

    if-nez v10, :cond_f

    move-object/from16 v10, p6

    invoke-interface {v5, v10}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v10, p6

    :cond_10
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v6, v11

    goto :goto_b

    :cond_11
    move-object/from16 v10, p6

    :goto_b
    and-int/lit8 v11, v13, 0x40

    const/high16 v14, 0x180000

    if-eqz v11, :cond_13

    or-int/2addr v6, v14

    :cond_12
    move-object/from16 v14, p7

    goto :goto_d

    :cond_13
    and-int/2addr v14, v12

    if-nez v14, :cond_12

    move-object/from16 v14, p7

    invoke-interface {v5, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v6, v15

    :goto_d
    and-int/lit16 v15, v13, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_15

    or-int v6, v6, v16

    move-object/from16 v0, p8

    goto :goto_f

    :cond_15
    and-int v16, v12, v16

    move-object/from16 v0, p8

    if-nez v16, :cond_17

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v6, v6, v17

    :cond_17
    :goto_f
    and-int/lit16 v0, v13, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_19

    or-int v6, v6, v17

    :cond_18
    move/from16 v17, v0

    move/from16 v0, p9

    goto :goto_11

    :cond_19
    and-int v17, v12, v17

    if-nez v17, :cond_18

    move/from16 v17, v0

    move/from16 v0, p9

    invoke-interface {v5, v0}, LY/m;->a(Z)Z

    move-result v18

    if-eqz v18, :cond_1a

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_1a
    const/high16 v18, 0x2000000

    :goto_10
    or-int v6, v6, v18

    :goto_11
    and-int/lit16 v0, v13, 0x200

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_1c

    or-int v6, v6, v18

    :cond_1b
    move/from16 v18, v0

    move-object/from16 v0, p10

    goto :goto_13

    :cond_1c
    and-int v18, v12, v18

    if-nez v18, :cond_1b

    move/from16 v18, v0

    move-object/from16 v0, p10

    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1d

    const/high16 v19, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v19, 0x10000000

    :goto_12
    or-int v6, v6, v19

    :goto_13
    const v19, 0x12492493

    and-int v0, v6, v19

    move/from16 p11, v6

    const v6, 0x12492492

    if-ne v0, v6, :cond_1f

    invoke-interface {v5}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_15

    .line 2
    :cond_1e
    invoke-interface {v5}, LY/m;->K()V

    move-object/from16 v11, p10

    move-object v0, v5

    move-wide v5, v8

    move-object v7, v10

    move-object/from16 v9, p8

    move/from16 v10, p9

    :goto_14
    move-object v8, v14

    goto/16 :goto_1d

    .line 3
    :cond_1f
    :goto_15
    invoke-interface {v5}, LY/m;->G()V

    and-int/lit8 v0, v12, 0x1

    const v19, -0x70001

    if-eqz v0, :cond_22

    invoke-interface {v5}, LY/m;->N()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_16

    .line 4
    :cond_20
    invoke-interface {v5}, LY/m;->K()V

    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_21

    and-int v0, p11, v19

    move/from16 v11, p9

    move-object/from16 v15, p10

    move-wide v7, v8

    move v9, v0

    move-object/from16 v0, p8

    goto :goto_1b

    :cond_21
    move-object/from16 v0, p8

    move/from16 v11, p9

    move-object/from16 v15, p10

    move-wide v7, v8

    move/from16 v9, p11

    goto :goto_1b

    :cond_22
    :goto_16
    if-eqz v7, :cond_23

    .line 5
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    invoke-virtual {v0}, Ls0/r0$a;->j()J

    move-result-wide v7

    goto :goto_17

    :cond_23
    move-wide v7, v8

    :goto_17
    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_24

    .line 6
    invoke-static {}, LU/j0;->d()LY/b1;

    move-result-object v0

    .line 7
    invoke-interface {v5, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU0/Y0;

    and-int v9, p11, v19

    move-object v10, v0

    goto :goto_18

    :cond_24
    move/from16 v9, p11

    :goto_18
    const/4 v0, 0x0

    if-eqz v11, :cond_25

    move-object v14, v0

    :cond_25
    if-eqz v15, :cond_26

    goto :goto_19

    :cond_26
    move-object/from16 v0, p8

    :goto_19
    if-eqz v17, :cond_27

    const/4 v11, 0x1

    goto :goto_1a

    :cond_27
    move/from16 v11, p9

    :goto_1a
    if-eqz v18, :cond_28

    .line 8
    sget-object v15, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    goto :goto_1b

    :cond_28
    move-object/from16 v15, p10

    :goto_1b
    invoke-interface {v5}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v17

    if-eqz v17, :cond_29

    const/4 v6, -0x1

    move-object/from16 p10, v0

    const-string v0, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateView (IntroEligibilityStateView.kt:29)"

    move-wide/from16 p6, v7

    const v7, -0x1bb8a59a

    .line 9
    invoke-static {v7, v9, v6, v0}, LY/w;->U(IIILjava/lang/String;)V

    goto :goto_1c

    :cond_29
    move-object/from16 p10, v0

    move-wide/from16 p6, v7

    .line 10
    :goto_1c
    invoke-static {v4, v2, v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->introEligibilityText(Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->defaultAnimation()Lw/r0;

    move-result-object v6

    .line 12
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$1;

    move-object/from16 p4, v7

    move-object/from16 p8, v10

    move/from16 p11, v11

    move-object/from16 p9, v14

    move-object/from16 p5, v15

    invoke-direct/range {p4 .. p11}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$1;-><init>(Landroidx/compose/ui/e;JLU0/Y0;LY0/L;Lg1/j;Z)V

    move-object v7, v0

    move-object/from16 v0, p4

    move-object/from16 p4, v7

    move-wide/from16 v7, p6

    move-object/from16 v9, p10

    const/16 v1, 0x36

    const v2, -0x5455c5c

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v5, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    const/16 v1, 0x6c00

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 13
    const-string v16, "IntroEligibilityStateView"

    move-object/from16 p8, v0

    move/from16 p10, v1

    move/from16 p11, v2

    move-object/from16 p5, v3

    move-object/from16 p9, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v16

    invoke-static/range {p4 .. p11}, Lv/k;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lw/G;Ljava/lang/String;Lie/o;LY/m;II)V

    move-object/from16 v0, p9

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-static {}, LY/w;->T()V

    :cond_2a
    move-wide v5, v7

    move-object v7, v10

    move v10, v11

    move-object v11, v15

    goto/16 :goto_14

    .line 14
    :goto_1d
    invoke-interface {v0}, LY/m;->k()LY/B1;

    move-result-object v14

    if-eqz v14, :cond_2b

    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v13}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt$IntroEligibilityStateView$2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;JLU0/Y0;LY0/L;Lg1/j;ZLandroidx/compose/ui/e;II)V

    invoke-interface {v14, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_2b
    return-void
.end method

.method public static final synthetic access$IntroEligibilityPreviewBothTextsEligibleMultipleOffers(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityPreviewBothTextsEligibleMultipleOffers(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$IntroEligibilityPreviewBothTextsEligibleSingleOffer(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityPreviewBothTextsEligibleSingleOffer(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$IntroEligibilityPreviewBothTextsIneligible(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityPreviewBothTextsIneligible(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$IntroEligibilityPreviewNoOffer(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IntroEligibilityStateViewKt;->IntroEligibilityPreviewNoOffer(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final introEligibilityText(Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "eligibility"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferSingle;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferSingle;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferSingle;

    .line 18
    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    move-object p2, p1

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferMultiple;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$IntroOfferMultiple;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    move v0, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferMultiple;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferMultiple;

    .line 38
    .line 39
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :goto_1
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$Ineligible;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$Ineligible;

    .line 47
    .line 48
    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferIneligible;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility$PromoOfferIneligible;

    .line 56
    .line 57
    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    :goto_2
    if-eqz v1, :cond_8

    .line 62
    .line 63
    move-object p2, p3

    .line 64
    :goto_3
    if-nez p2, :cond_7

    .line 65
    .line 66
    if-nez p3, :cond_6

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    const-string p0, ""

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_5
    return-object p1

    .line 74
    :cond_6
    return-object p3

    .line 75
    :cond_7
    return-object p2

    .line 76
    :cond_8
    new-instance p0, LTd/r;

    .line 77
    .line 78
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p0
.end method
