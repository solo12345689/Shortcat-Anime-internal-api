.class public abstract LZb/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZb/c$a;
    }
.end annotation


# direct methods
.method public static final synthetic a(Lub/c;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LZb/c;->b(Lub/c;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Lub/c;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, LZb/c$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const-string v0, "ExpoModulesCoreJSLogger.onNewTrace"

    .line 10
    .line 11
    const-string v1, "ExpoModulesCoreJSLogger.onNewDebug"

    .line 12
    .line 13
    const-string v2, "ExpoModulesCoreJSLogger.onNewError"

    .line 14
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
    return-object v2

    .line 25
    :pswitch_1
    const-string p0, "ExpoModulesCoreJSLogger.onNewWarning"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_2
    const-string p0, "ExpoModulesCoreJSLogger.onNewInfo"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_3
    return-object v1

    .line 32
    :pswitch_4
    return-object v0

    .line 33
    :pswitch_5
    return-object v1

    .line 34
    :pswitch_6
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
