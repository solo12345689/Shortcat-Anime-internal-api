.class public final Lyd/i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyd/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyd/i$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LAc/b;Lorg/json/JSONObject;Lexpo/modules/updates/d;)Lyd/i;
    .locals 13

    .line 1
    const-string v0, "manifest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuration"

    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, LAc/b;->p()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v0, "fromString(...)"

    .line 22
    .line 23
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lexpo/modules/updates/d;->s()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :try_start_0
    sget-object v0, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 31
    .line 32
    invoke-virtual {p1}, LAc/b;->n()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lexpo/modules/updates/g;->h(Ljava/lang/String;)Ljava/util/Date;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :goto_0
    move-object v5, v0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    invoke-static {}, Lyd/i;->i()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v5, "Could not parse manifest createdAt string; falling back to current time"

    .line 48
    .line 49
    invoke-static {v2, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/util/Date;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    invoke-virtual {p1}, LAc/b;->r()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {p1}, LAc/b;->q()Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {p1}, LAc/b;->m()Lorg/json/JSONArray;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v1}, Lexpo/modules/updates/d;->t()Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v1}, Lexpo/modules/updates/d;->p()Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    new-instance v1, Lyd/i;

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    move-object v2, p1

    .line 82
    move-object v9, p2

    .line 83
    invoke-direct/range {v1 .. v12}, Lyd/i;-><init>(LAc/b;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONObject;Landroid/net/Uri;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    return-object v1
.end method
