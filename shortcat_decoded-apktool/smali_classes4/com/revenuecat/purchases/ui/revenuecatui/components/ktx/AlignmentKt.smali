.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\u0008*\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u000c\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0008*\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;",
        "Lg1/j;",
        "toTextAlign",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)I",
        "Ll0/e$b;",
        "toAlignment",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)Ll0/e$b;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;",
        "Ll0/e$c;",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;)Ll0/e$c;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;",
        "Ll0/e;",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e;",
        "toVerticalAlignmentOrNull",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$c;",
        "toHorizontalAlignmentOrNull",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$b;",
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
.method public static final synthetic toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)Ll0/e$b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->j()Ll0/e$b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0

    .line 3
    :cond_1
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->g()Ll0/e$b;

    move-result-object p0

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->k()Ll0/e$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;)Ll0/e$c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 6
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->a()Ll0/e$c;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0

    .line 7
    :cond_1
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->i()Ll0/e$c;

    move-result-object p0

    return-object p0

    .line 8
    :cond_2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->l()Ll0/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    .line 10
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->c()Ll0/e;

    move-result-object p0

    return-object p0

    .line 11
    :pswitch_1
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->d()Ll0/e;

    move-result-object p0

    return-object p0

    .line 12
    :pswitch_2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->n()Ll0/e;

    move-result-object p0

    return-object p0

    .line 13
    :pswitch_3
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->o()Ll0/e;

    move-result-object p0

    return-object p0

    .line 14
    :pswitch_4
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->b()Ll0/e;

    move-result-object p0

    return-object p0

    .line 15
    :pswitch_5
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->m()Ll0/e;

    move-result-object p0

    return-object p0

    .line 16
    :pswitch_6
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->f()Ll0/e;

    move-result-object p0

    return-object p0

    .line 17
    :pswitch_7
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->h()Ll0/e;

    move-result-object p0

    return-object p0

    .line 18
    :pswitch_8
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {p0}, Ll0/e$a;->e()Ll0/e;

    move-result-object p0

    return-object p0

    nop

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

.method public static final synthetic toHorizontalAlignmentOrNull(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$b;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$2:[I

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
    const/4 v0, 0x0

    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p0, LTd/r;

    .line 19
    .line 20
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :pswitch_0
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 25
    .line 26
    invoke-virtual {p0}, Ll0/e$a;->j()Ll0/e$b;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 32
    .line 33
    invoke-virtual {p0}, Ll0/e$a;->k()Ll0/e$b;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 39
    .line 40
    invoke-virtual {p0}, Ll0/e$a;->j()Ll0/e$b;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_3
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 46
    .line 47
    invoke-virtual {p0}, Ll0/e$a;->k()Ll0/e$b;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_4
    return-object v0

    .line 53
    :pswitch_5
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 54
    .line 55
    invoke-virtual {p0}, Ll0/e$a;->j()Ll0/e$b;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_6
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 61
    .line 62
    invoke-virtual {p0}, Ll0/e$a;->k()Ll0/e$b;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_7
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 68
    .line 69
    invoke-virtual {p0}, Ll0/e$a;->g()Ll0/e$b;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic toTextAlign(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$0:[I

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
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lg1/j;->b:Lg1/j$a;

    .line 24
    .line 25
    invoke-virtual {p0}, Lg1/j$a;->b()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    new-instance p0, LTd/r;

    .line 31
    .line 32
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    sget-object p0, Lg1/j;->b:Lg1/j$a;

    .line 37
    .line 38
    invoke-virtual {p0}, Lg1/j$a;->a()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_2
    sget-object p0, Lg1/j;->b:Lg1/j$a;

    .line 44
    .line 45
    invoke-virtual {p0}, Lg1/j$a;->f()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public static final synthetic toVerticalAlignmentOrNull(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Ll0/e$c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt$WhenMappings;->$EnumSwitchMapping$2:[I

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
    const/4 v0, 0x0

    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p0, LTd/r;

    .line 19
    .line 20
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :pswitch_0
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 25
    .line 26
    invoke-virtual {p0}, Ll0/e$a;->a()Ll0/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_1
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 32
    .line 33
    invoke-virtual {p0}, Ll0/e$a;->a()Ll0/e$c;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_2
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 39
    .line 40
    invoke-virtual {p0}, Ll0/e$a;->l()Ll0/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_3
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 46
    .line 47
    invoke-virtual {p0}, Ll0/e$a;->l()Ll0/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_4
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 53
    .line 54
    invoke-virtual {p0}, Ll0/e$a;->a()Ll0/e$c;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_5
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 60
    .line 61
    invoke-virtual {p0}, Ll0/e$a;->l()Ll0/e$c;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_6
    return-object v0

    .line 67
    :pswitch_7
    sget-object p0, Ll0/e;->a:Ll0/e$a;

    .line 68
    .line 69
    invoke-virtual {p0}, Ll0/e$a;->i()Ll0/e$c;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
