.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/DistributionKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/DistributionKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;",
        "Li1/h;",
        "spacing",
        "LC/b$e;",
        "toHorizontalArrangement-3ABfNKs",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$e;",
        "toHorizontalArrangement",
        "LC/b$m;",
        "toVerticalArrangement-3ABfNKs",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$m;",
        "toVerticalArrangement",
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
.method public static final synthetic toHorizontalArrangement-3ABfNKs(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$e;
    .locals 1

    .line 1
    const-string v0, "$this$toHorizontalArrangement"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/DistributionKt$WhenMappings;->$EnumSwitchMapping$0:[I

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
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, LTd/r;

    .line 18
    .line 19
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :pswitch_0
    sget-object p0, LC/b;->a:LC/b;

    .line 24
    .line 25
    invoke-virtual {p0}, LC/b;->g()LC/b$e;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    sget-object p0, LC/b;->a:LC/b;

    .line 31
    .line 32
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 33
    .line 34
    invoke-virtual {v0}, Ll0/e$a;->g()Ll0/e$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, p1, v0}, LC/b;->p(FLl0/e$b;)LC/b$e;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    sget-object p0, LC/b;->a:LC/b;

    .line 44
    .line 45
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 46
    .line 47
    invoke-virtual {v0}, Ll0/e$a;->j()Ll0/e$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, p1, v0}, LC/b;->p(FLl0/e$b;)LC/b$e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_3
    sget-object p0, LC/b;->a:LC/b;

    .line 57
    .line 58
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 59
    .line 60
    invoke-virtual {v0}, Ll0/e$a;->k()Ll0/e$b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, p1, v0}, LC/b;->p(FLl0/e$b;)LC/b$e;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic toVerticalArrangement-3ABfNKs(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$m;
    .locals 1

    .line 1
    const-string v0, "$this$toVerticalArrangement"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/DistributionKt$WhenMappings;->$EnumSwitchMapping$0:[I

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
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, LTd/r;

    .line 18
    .line 19
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :pswitch_0
    sget-object p0, LC/b;->a:LC/b;

    .line 24
    .line 25
    invoke-virtual {p0}, LC/b;->h()LC/b$m;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    sget-object p0, LC/b;->a:LC/b;

    .line 31
    .line 32
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 33
    .line 34
    invoke-virtual {v0}, Ll0/e$a;->i()Ll0/e$c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, p1, v0}, LC/b;->q(FLl0/e$c;)LC/b$m;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    sget-object p0, LC/b;->a:LC/b;

    .line 44
    .line 45
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 46
    .line 47
    invoke-virtual {v0}, Ll0/e$a;->a()Ll0/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, p1, v0}, LC/b;->q(FLl0/e$c;)LC/b$m;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_3
    sget-object p0, LC/b;->a:LC/b;

    .line 57
    .line 58
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 59
    .line 60
    invoke-virtual {v0}, Ll0/e$a;->l()Ll0/e$c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, p1, v0}, LC/b;->q(FLl0/e$c;)LC/b$m;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
