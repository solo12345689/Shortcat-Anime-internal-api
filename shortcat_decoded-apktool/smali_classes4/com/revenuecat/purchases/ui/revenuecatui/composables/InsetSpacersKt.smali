.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "LTd/L;",
        "StatusBarSpacer",
        "(LY/m;I)V",
        "SystemBarsSpacer",
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
.method public static final StatusBarSpacer(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x22e6c7be

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.composables.StatusBarSpacer (InsetSpacers.kt:12)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    sget-object v1, LC/P;->a:LC/P$a;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-static {v1, p0, v2}, LC/X;->d(LC/P$a;LY/m;I)LC/P;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, LC/W;->b(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v0, p0, v1}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, LY/w;->T()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt$StatusBarSpacer$1;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt$StatusBarSpacer$1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public static final SystemBarsSpacer(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x4ab8c6ac    # 6054742.0f

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.composables.SystemBarsSpacer (InsetSpacers.kt:21)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    .line 35
    sget-object v1, LC/P;->a:LC/P$a;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-static {v1, p0, v2}, LC/X;->e(LC/P$a;LY/m;I)LC/P;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, LC/W;->a(Landroidx/compose/ui/e;LC/P;)Landroidx/compose/ui/e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v0, p0, v1}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, LY/w;->T()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt$SystemBarsSpacer$1;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/InsetSpacersKt$SystemBarsSpacer$1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method
