.class public abstract LUb/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUb/y$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/facebook/react/bridge/ReadableType;)Lpe/d;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LUb/y$a;->a:[I

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
    const-class p0, Lcom/facebook/react/bridge/ReadableArray;

    .line 24
    .line 25
    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    const-class p0, Lcom/facebook/react/bridge/ReadableMap;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_2
    const-class p0, Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_3
    const-class p0, Ljava/lang/Number;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_4
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_5
    const-class p0, Ljava/lang/Object;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
