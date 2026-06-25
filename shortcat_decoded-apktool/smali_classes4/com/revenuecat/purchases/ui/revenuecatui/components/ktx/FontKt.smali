.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/FontKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/FontKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;",
        "LY0/L;",
        "toFontWeight",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;)LY0/L;",
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
.method public static final synthetic toFontWeight(Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;)LY0/L;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/FontKt$WhenMappings;->$EnumSwitchMapping$0:[I

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
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 24
    .line 25
    invoke-virtual {p0}, LY0/L$a;->a()LY0/L;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 31
    .line 32
    invoke-virtual {p0}, LY0/L$a;->c()LY0/L;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_2
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 38
    .line 39
    invoke-virtual {p0}, LY0/L$a;->b()LY0/L;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_3
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 45
    .line 46
    invoke-virtual {p0}, LY0/L$a;->h()LY0/L;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_4
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 52
    .line 53
    invoke-virtual {p0}, LY0/L$a;->f()LY0/L;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_5
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 59
    .line 60
    invoke-virtual {p0}, LY0/L$a;->g()LY0/L;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_6
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 66
    .line 67
    invoke-virtual {p0}, LY0/L$a;->e()LY0/L;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_7
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 73
    .line 74
    invoke-virtual {p0}, LY0/L$a;->i()LY0/L;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_8
    sget-object p0, LY0/L;->b:LY0/L$a;

    .line 80
    .line 81
    invoke-virtual {p0}, LY0/L$a;->d()LY0/L;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
