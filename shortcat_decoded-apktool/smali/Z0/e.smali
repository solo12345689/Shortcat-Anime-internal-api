.class public abstract LZ0/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LZ0/c;LZ0/c$a;LY0/L;I)LY0/t;
    .locals 7

    .line 1
    new-instance v0, LZ0/d;

    .line 2
    .line 3
    invoke-virtual {p0}, LZ0/c;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, LZ0/c;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move v4, p3

    .line 15
    invoke-direct/range {v0 .. v6}, LZ0/d;-><init>(Ljava/lang/String;LZ0/c$a;LY0/L;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static final synthetic b(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, LZ0/e;->c(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, -0x4

    .line 2
    if-eq p0, v0, :cond_6

    .line 3
    .line 4
    const/4 v0, -0x3

    .line 5
    if-eq p0, v0, :cond_5

    .line 6
    .line 7
    const/4 v0, -0x2

    .line 8
    if-eq p0, v0, :cond_4

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    if-eq p0, v0, :cond_3

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    const-string p0, "Unknown error code"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string p0, "The given query was not supported by this provider."

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    const-string p0, "The provider found the queried font, but it is currently unavailable."

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    const-string p0, "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_3
    const-string p0, "The requested provider was not found on this device."

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_4
    const-string p0, "The given provider cannot be authenticated with the certificates given."

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_5
    const-string p0, "Generic error loading font, for example variation settings were not parsable"

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_6
    const-string p0, "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context"

    .line 44
    .line 45
    return-object p0
.end method
