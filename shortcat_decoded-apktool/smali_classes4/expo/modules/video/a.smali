.class public final Lexpo/modules/video/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J9\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/video/a;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lexpo/modules/video/player/VideoPlayer;",
        "ref",
        "Lexpo/modules/kotlin/types/Either;",
        "Landroid/net/Uri;",
        "Lexpo/modules/video/records/VideoSource;",
        "source",
        "LUb/u;",
        "promise",
        "LTd/L;",
        "y",
        "(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(Lexpo/modules/video/a;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/video/a;->y(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final y(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    const-class v1, Lexpo/modules/video/records/VideoSource;

    .line 5
    .line 6
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p2, v2}, Lexpo/modules/kotlin/types/Either;->f(Lpe/d;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p2, v1}, Lexpo/modules/kotlin/types/Either;->c(Lpe/d;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Lexpo/modules/video/records/VideoSource;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Lexpo/modules/video/records/VideoSource;

    .line 28
    .line 29
    const-class v2, Landroid/net/Uri;

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p2, v2}, Lexpo/modules/kotlin/types/Either;->b(Lpe/d;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    move-object v2, p2

    .line 40
    check-cast v2, Landroid/net/Uri;

    .line 41
    .line 42
    const/16 v8, 0x3e

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-direct/range {v1 .. v9}, Lexpo/modules/video/records/VideoSource;-><init>(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    move-object p2, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object p2, v0

    .line 56
    :goto_0
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, LUb/d;->x()LGf/O;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v5, Lexpo/modules/video/a$O1;

    .line 65
    .line 66
    invoke-direct {v5, p1, p2, p3, v0}, Lexpo/modules/video/a$O1;-><init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;LUb/u;LZd/e;)V

    .line 67
    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method static synthetic z(Lexpo/modules/video/a;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/video/a;->y(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 39

    move-object/from16 v1, p0

    .line 1
    const-class v0, LEf/a;

    const-class v2, Ljava/lang/Integer;

    const-class v3, Ljava/util/ArrayList;

    const-class v4, Lexpo/modules/video/TextureVideoView;

    const-class v5, Lexpo/modules/video/SurfaceVideoView;

    const-class v6, Ljava/lang/Long;

    const-class v7, Ljava/lang/Object;

    const-class v8, Ljava/lang/Double;

    const-class v9, LGf/C0;

    const-string v10, "set"

    const-class v11, Ljava/lang/Float;

    const-class v12, Lexpo/modules/video/player/VideoPlayer;

    const-string v13, "get"

    const-class v14, Ljava/lang/Boolean;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v16, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, ".ModuleDefinition"

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v3

    const-string v3, "["

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ExpoModulesCore"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v2, Lgc/d;

    invoke-direct {v2, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 6
    const-string v3, "ExpoVideo"

    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Lgc/a;->w()Ljava/util/Map;

    move-result-object v3

    sget-object v15, Lbc/e;->a:Lbc/e;

    move-object/from16 v18, v4

    new-instance v4, Lbc/a;

    move-object/from16 v19, v5

    new-instance v5, Lexpo/modules/video/a$y;

    invoke-direct {v5, v1}, Lexpo/modules/video/a$y;-><init>(Lexpo/modules/video/a;)V

    invoke-direct {v4, v15, v5}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    invoke-interface {v3, v15, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {v2}, Lgc/a;->w()Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lbc/e;->b:Lbc/e;

    new-instance v5, Lbc/a;

    new-instance v15, Lexpo/modules/video/a$z;

    invoke-direct {v15, v1}, Lexpo/modules/video/a$z;-><init>(Lexpo/modules/video/a;)V

    invoke-direct {v5, v4, v15}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    const-string v3, "isPictureInPictureSupported"

    .line 10
    new-instance v4, Ldc/r;

    const/4 v5, 0x0

    new-array v15, v5, [Lpc/b;

    .line 11
    sget-object v20, Lpc/V;->a:Lpc/V;

    .line 12
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    move-object/from16 v21, v7

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_0

    new-instance v5, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 13
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    move-object/from16 v22, v8

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v8

    invoke-interface {v7, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v8, v1

    goto/16 :goto_10

    :cond_0
    move-object/from16 v22, v8

    .line 14
    :goto_0
    new-instance v7, Lexpo/modules/video/a$u;

    invoke-direct {v7, v1}, Lexpo/modules/video/a$u;-><init>(Lexpo/modules/video/a;)V

    invoke-direct {v4, v3, v15, v5, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 15
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    const-string v3, "getCurrentVideoCacheSize"

    .line 17
    new-instance v4, Ldc/r;

    const/4 v5, 0x0

    new-array v7, v5, [Lpc/b;

    .line 18
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_1

    new-instance v5, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v8

    invoke-direct {v5, v8}, Lpc/U;-><init>(Lpe/d;)V

    .line 19
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v8

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    invoke-interface {v8, v15, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_1
    new-instance v8, Lexpo/modules/video/a$v;

    invoke-direct {v8}, Lexpo/modules/video/a$v;-><init>()V

    invoke-direct {v4, v3, v7, v5, v8}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 21
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    const-string v3, "setVideoCacheSizeAsync"

    .line 23
    const-class v4, LUb/u;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v15, LTd/L;

    if-eqz v4, :cond_2

    .line 24
    :try_start_1
    new-instance v4, Ldc/f;

    move-object/from16 v23, v6

    move-object/from16 v24, v9

    const/4 v6, 0x0

    new-array v9, v6, [Lpc/b;

    .line 25
    new-instance v6, Lexpo/modules/video/a$p;

    invoke-direct {v6}, Lexpo/modules/video/a$p;-><init>()V

    .line 26
    invoke-direct {v4, v3, v9, v6}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v26, v11

    move-object/from16 v25, v12

    move-object/from16 v27, v14

    goto/16 :goto_3

    :cond_2
    move-object/from16 v23, v6

    move-object/from16 v24, v9

    .line 27
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    move-result-object v4

    .line 28
    sget-object v6, Lpc/d;->a:Lpc/d;

    .line 29
    new-instance v9, Lkotlin/Pair;

    move-object/from16 v25, v6

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    move-object/from16 v26, v11

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v6, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    invoke-virtual/range {v25 .. v25}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_3

    .line 31
    sget-object v6, Lexpo/modules/video/a$q;->a:Lexpo/modules/video/a$q;

    .line 32
    new-instance v9, Lpc/b;

    .line 33
    new-instance v11, Lpc/M;

    move-object/from16 v25, v12

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    move-object/from16 v27, v14

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 34
    invoke-direct {v9, v11, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    goto :goto_1

    :cond_3
    move-object/from16 v25, v12

    move-object/from16 v27, v14

    .line 35
    :goto_1
    filled-new-array {v6}, [Lpc/b;

    move-result-object v4

    .line 36
    new-instance v6, Lexpo/modules/video/a$r;

    invoke-direct {v6}, Lexpo/modules/video/a$r;-><init>()V

    .line 37
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v15, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 38
    new-instance v9, Ldc/l;

    invoke-direct {v9, v3, v4, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    :goto_2
    move-object v4, v9

    goto :goto_3

    .line 39
    :cond_4
    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 40
    new-instance v9, Ldc/h;

    invoke-direct {v9, v3, v4, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 41
    :cond_5
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 42
    new-instance v9, Ldc/i;

    invoke-direct {v9, v3, v4, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 43
    :cond_6
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 44
    new-instance v9, Ldc/j;

    invoke-direct {v9, v3, v4, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 45
    :cond_7
    const-class v9, Ljava/lang/String;

    invoke-static {v15, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 46
    new-instance v9, Ldc/n;

    invoke-direct {v9, v3, v4, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 47
    :cond_8
    new-instance v9, Ldc/s;

    invoke-direct {v9, v3, v4, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 48
    :goto_3
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    const-string v3, "clearVideoCacheAsync"

    const/4 v6, 0x0

    .line 50
    new-array v4, v6, [Lpc/b;

    new-instance v6, Lexpo/modules/video/a$s;

    invoke-direct {v6}, Lexpo/modules/video/a$s;-><init>()V

    .line 51
    new-instance v9, Ldc/s;

    invoke-direct {v9, v3, v4, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 52
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    .line 54
    new-instance v4, Lexpo/modules/kotlin/views/p;

    .line 55
    new-instance v28, Lpc/M;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v29

    .line 56
    sget-object v31, Lexpo/modules/video/a$A;->a:Lexpo/modules/video/a$A;

    const/16 v32, 0x2

    const/16 v33, 0x0

    const/16 v30, 0x0

    .line 57
    invoke-direct/range {v28 .. v33}, Lpc/M;-><init>(Lpe/d;ZLie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v28

    .line 58
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 59
    invoke-direct {v4, v3, v6, v9}, Lexpo/modules/kotlin/views/p;-><init>(Lpe/d;Lpe/q;Lpc/X;)V

    .line 60
    invoke-static {v4}, Lwc/b;->g(Lexpo/modules/kotlin/views/p;)V

    .line 61
    const-string v3, "onPictureInPictureStart"

    .line 62
    const-string v6, "onPictureInPictureStop"

    .line 63
    const-string v9, "onFullscreenEnter"

    .line 64
    const-string v11, "onFullscreenExit"

    .line 65
    const-string v12, "onFirstFrameRender"

    filled-new-array {v3, v6, v9, v11, v12}, [Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {v4, v3}, Lexpo/modules/kotlin/views/p;->b([Ljava/lang/String;)V

    .line 67
    const-string v3, "player"

    sget-object v6, Lexpo/modules/video/a$I;->a:Lexpo/modules/video/a$I;

    .line 68
    invoke-virtual {v4}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v9

    new-instance v11, Lexpo/modules/kotlin/views/c;

    .line 69
    sget-object v12, Lpc/d;->a:Lpc/d;

    .line 70
    new-instance v14, Lkotlin/Pair;

    move-object/from16 v28, v12

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    move-object/from16 v29, v10

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v14, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpc/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v12, :cond_9

    .line 72
    :try_start_2
    sget-object v12, LFd/J;->a:LFd/J;

    .line 73
    new-instance v14, Lpc/b;

    move-object/from16 v32, v13

    .line 74
    new-instance v13, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v1

    move-object/from16 v33, v2

    const/4 v2, 0x1

    invoke-direct {v13, v1, v2, v12}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v1, 0x0

    .line 75
    invoke-direct {v14, v13, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v12, v14

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object/from16 v8, p0

    goto/16 :goto_10

    :cond_9
    move-object/from16 v33, v2

    move-object/from16 v32, v13

    .line 76
    :goto_4
    invoke-direct {v11, v3, v12, v6}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v9, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    const-string v1, "nativeControls"

    sget-object v2, Lexpo/modules/video/a$J;->a:Lexpo/modules/video/a$J;

    .line 78
    invoke-virtual {v4}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v6, Lexpo/modules/kotlin/views/c;

    .line 79
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v11, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_a

    .line 81
    sget-object v9, LFd/K;->a:LFd/K;

    .line 82
    new-instance v11, Lpc/b;

    .line 83
    new-instance v13, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    move-object/from16 v34, v4

    const/4 v4, 0x0

    invoke-direct {v13, v14, v4, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v4, 0x0

    .line 84
    invoke-direct {v11, v13, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    goto :goto_5

    :cond_a
    move-object/from16 v34, v4

    .line 85
    :goto_5
    invoke-direct {v6, v1, v9, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    const-string v1, "contentFit"

    sget-object v2, Lexpo/modules/video/a$K;->a:Lexpo/modules/video/a$K;

    .line 87
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 88
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/enums/ContentFit;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_b

    .line 90
    sget-object v6, LFd/L;->a:LFd/L;

    .line 91
    new-instance v9, Lpc/b;

    .line 92
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/enums/ContentFit;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 93
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 94
    :cond_b
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    const-string v1, "startsPictureInPictureAutomatically"

    sget-object v2, Lexpo/modules/video/a$L;->a:Lexpo/modules/video/a$L;

    .line 96
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 97
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_c

    .line 99
    sget-object v6, LFd/M;->a:LFd/M;

    .line 100
    new-instance v9, Lpc/b;

    .line 101
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 102
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 103
    :cond_c
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    const-string v1, "fullscreenOptions"

    sget-object v2, Lexpo/modules/video/a$M;->a:Lexpo/modules/video/a$M;

    .line 105
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 106
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/records/FullscreenOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_d

    .line 108
    sget-object v6, LFd/N;->a:LFd/N;

    .line 109
    new-instance v9, Lpc/b;

    .line 110
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/records/FullscreenOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 111
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 112
    :cond_d
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    const-string v1, "requiresLinearPlayback"

    sget-object v2, Lexpo/modules/video/a$N;->a:Lexpo/modules/video/a$N;

    .line 114
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 115
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_e

    .line 117
    sget-object v6, LFd/O;->a:LFd/O;

    .line 118
    new-instance v9, Lpc/b;

    .line 119
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 120
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 121
    :cond_e
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    const-string v1, "buttonOptions"

    sget-object v2, Lexpo/modules/video/a$O;->a:Lexpo/modules/video/a$O;

    .line 123
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 124
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/records/ButtonOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_f

    .line 126
    sget-object v6, LFd/P;->a:LFd/P;

    .line 127
    new-instance v9, Lpc/b;

    .line 128
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/records/ButtonOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 129
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 130
    :cond_f
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v1, "useExoShutter"

    sget-object v2, Lexpo/modules/video/a$P;->a:Lexpo/modules/video/a$P;

    .line 132
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v4, Lexpo/modules/kotlin/views/c;

    .line 133
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_10

    .line 135
    sget-object v6, LFd/Q;->a:LFd/Q;

    .line 136
    new-instance v9, Lpc/b;

    .line 137
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 138
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 139
    :cond_10
    invoke-direct {v4, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    const-string v1, "enterFullscreen"

    .line 141
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpc/b;

    if-nez v2, :cond_11

    .line 143
    sget-object v2, Lexpo/modules/video/a$C;->a:Lexpo/modules/video/a$C;

    .line 144
    new-instance v3, Lpc/b;

    .line 145
    new-instance v4, Lpc/M;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    const/4 v14, 0x0

    invoke-direct {v4, v6, v14, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 146
    invoke-direct {v3, v4, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v2, v3

    .line 147
    :cond_11
    filled-new-array {v2}, [Lpc/b;

    move-result-object v2

    .line 148
    new-instance v3, Lexpo/modules/video/a$D;

    invoke-direct {v3}, Lexpo/modules/video/a$D;-><init>()V

    .line 149
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 150
    new-instance v6, Ldc/l;

    invoke-direct {v6, v1, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 151
    :cond_12
    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 152
    new-instance v6, Ldc/h;

    invoke-direct {v6, v1, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 153
    :cond_13
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 154
    new-instance v6, Ldc/i;

    invoke-direct {v6, v1, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 155
    :cond_14
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 156
    new-instance v6, Ldc/j;

    invoke-direct {v6, v1, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 157
    :cond_15
    const-class v6, Ljava/lang/String;

    invoke-static {v15, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 158
    new-instance v6, Ldc/n;

    invoke-direct {v6, v1, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 159
    :cond_16
    new-instance v6, Ldc/s;

    invoke-direct {v6, v1, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 160
    :goto_6
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    sget-object v1, Ldc/m;->a:Ldc/m;

    invoke-virtual {v6, v1}, Ldc/g;->n(Ldc/m;)Ldc/g;

    .line 162
    const-string v2, "exitFullscreen"

    const/4 v14, 0x0

    .line 163
    new-array v3, v14, [Lpc/b;

    new-instance v6, LFd/H;

    invoke-direct {v6}, LFd/H;-><init>()V

    .line 164
    new-instance v9, Ldc/s;

    invoke-direct {v9, v2, v3, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 165
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v2, "startPictureInPicture"

    .line 167
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v3, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/b;

    if-nez v3, :cond_17

    .line 169
    sget-object v3, Lexpo/modules/video/a$E;->a:Lexpo/modules/video/a$E;

    .line 170
    new-instance v6, Lpc/b;

    .line 171
    new-instance v9, Lpc/M;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v3, 0x0

    .line 172
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v3, v6

    .line 173
    :cond_17
    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 174
    new-instance v6, Lexpo/modules/video/a$F;

    invoke-direct {v6}, Lexpo/modules/video/a$F;-><init>()V

    .line 175
    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_18

    .line 176
    new-instance v9, Ldc/l;

    invoke-direct {v9, v2, v3, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 177
    :cond_18
    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    .line 178
    new-instance v9, Ldc/h;

    invoke-direct {v9, v2, v3, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 179
    :cond_19
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    .line 180
    new-instance v9, Ldc/i;

    invoke-direct {v9, v2, v3, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 181
    :cond_1a
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    .line 182
    new-instance v9, Ldc/j;

    invoke-direct {v9, v2, v3, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 183
    :cond_1b
    const-class v9, Ljava/lang/String;

    invoke-static {v15, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    .line 184
    new-instance v9, Ldc/n;

    invoke-direct {v9, v2, v3, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 185
    :cond_1c
    new-instance v9, Ldc/s;

    invoke-direct {v9, v2, v3, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 186
    :goto_7
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    const-string v2, "stopPictureInPicture"

    const/4 v14, 0x0

    .line 188
    new-array v3, v14, [Lpc/b;

    new-instance v6, LFd/I;

    invoke-direct {v6}, LFd/I;-><init>()V

    .line 189
    new-instance v9, Ldc/s;

    invoke-direct {v9, v2, v3, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 190
    invoke-virtual/range {v34 .. v34}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    new-instance v2, Lexpo/modules/video/a$G;

    invoke-direct {v2}, Lexpo/modules/video/a$G;-><init>()V

    move-object/from16 v3, v34

    invoke-virtual {v3, v2}, Lexpo/modules/kotlin/views/p;->j(Lkotlin/jvm/functions/Function1;)V

    .line 192
    new-instance v2, Lexpo/modules/video/a$H;

    invoke-direct {v2}, Lexpo/modules/video/a$H;-><init>()V

    invoke-virtual {v3, v2}, Lexpo/modules/kotlin/views/p;->k(Lkotlin/jvm/functions/Function1;)V

    .line 193
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/p;->c()Lexpo/modules/kotlin/views/r;

    move-result-object v2

    move-object/from16 v3, v33

    invoke-virtual {v3, v2}, Lgc/a;->y(Lexpo/modules/kotlin/views/r;)V

    .line 194
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    .line 195
    new-instance v6, Lexpo/modules/kotlin/views/p;

    .line 196
    new-instance v33, Lpc/M;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v34

    .line 197
    sget-object v36, Lexpo/modules/video/a$B;->a:Lexpo/modules/video/a$B;

    const/16 v37, 0x2

    const/16 v38, 0x0

    const/16 v35, 0x0

    .line 198
    invoke-direct/range {v33 .. v38}, Lpc/M;-><init>(Lpe/d;ZLie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v33

    .line 199
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v11

    .line 200
    invoke-direct {v6, v2, v9, v11}, Lexpo/modules/kotlin/views/p;-><init>(Lpe/d;Lpe/q;Lpc/X;)V

    .line 201
    invoke-static {v6}, Lwc/b;->g(Lexpo/modules/kotlin/views/p;)V

    .line 202
    const-string v2, "onPictureInPictureStart"

    .line 203
    const-string v9, "onPictureInPictureStop"

    .line 204
    const-string v11, "onFullscreenEnter"

    .line 205
    const-string v13, "onFullscreenExit"

    .line 206
    const-string v14, "onFirstFrameRender"

    filled-new-array {v2, v9, v11, v13, v14}, [Ljava/lang/String;

    move-result-object v2

    .line 207
    invoke-virtual {v6, v2}, Lexpo/modules/kotlin/views/p;->b([Ljava/lang/String;)V

    .line 208
    const-string v2, "player"

    sget-object v9, Lexpo/modules/video/a$G1;->a:Lexpo/modules/video/a$G1;

    .line 209
    invoke-virtual {v6}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v11

    new-instance v13, Lexpo/modules/kotlin/views/c;

    .line 210
    new-instance v14, Lkotlin/Pair;

    move-object/from16 v33, v3

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v14, v3, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/b;

    if-nez v3, :cond_1d

    .line 212
    sget-object v3, LFd/J;->a:LFd/J;

    .line 213
    new-instance v14, Lpc/b;

    move-object/from16 v19, v6

    .line 214
    new-instance v6, Lpc/M;

    move-object/from16 v34, v1

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v1

    move-object/from16 v35, v5

    const/4 v5, 0x1

    invoke-direct {v6, v1, v5, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v1, 0x0

    .line 215
    invoke-direct {v14, v6, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v3, v14

    goto :goto_8

    :cond_1d
    move-object/from16 v34, v1

    move-object/from16 v35, v5

    move-object/from16 v19, v6

    .line 216
    :goto_8
    invoke-direct {v13, v2, v3, v9}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v11, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-string v1, "nativeControls"

    sget-object v2, Lexpo/modules/video/a$H1;->a:Lexpo/modules/video/a$H1;

    .line 218
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 219
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_1e

    .line 221
    sget-object v6, LFd/K;->a:LFd/K;

    .line 222
    new-instance v9, Lpc/b;

    .line 223
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 224
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 225
    :cond_1e
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    const-string v1, "contentFit"

    sget-object v2, Lexpo/modules/video/a$I1;->a:Lexpo/modules/video/a$I1;

    .line 227
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 228
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/enums/ContentFit;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_1f

    .line 230
    sget-object v6, LFd/L;->a:LFd/L;

    .line 231
    new-instance v9, Lpc/b;

    .line 232
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/enums/ContentFit;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 233
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 234
    :cond_1f
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    const-string v1, "startsPictureInPictureAutomatically"

    sget-object v2, Lexpo/modules/video/a$J1;->a:Lexpo/modules/video/a$J1;

    .line 236
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 237
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_20

    .line 239
    sget-object v6, LFd/M;->a:LFd/M;

    .line 240
    new-instance v9, Lpc/b;

    .line 241
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 242
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 243
    :cond_20
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    const-string v1, "fullscreenOptions"

    sget-object v2, Lexpo/modules/video/a$K1;->a:Lexpo/modules/video/a$K1;

    .line 245
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 246
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/records/FullscreenOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_21

    .line 248
    sget-object v6, LFd/N;->a:LFd/N;

    .line 249
    new-instance v9, Lpc/b;

    .line 250
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/records/FullscreenOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 251
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 252
    :cond_21
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    const-string v1, "requiresLinearPlayback"

    sget-object v2, Lexpo/modules/video/a$L1;->a:Lexpo/modules/video/a$L1;

    .line 254
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 255
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_22

    .line 257
    sget-object v6, LFd/O;->a:LFd/O;

    .line 258
    new-instance v9, Lpc/b;

    .line 259
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 260
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 261
    :cond_22
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    const-string v1, "buttonOptions"

    sget-object v2, Lexpo/modules/video/a$M1;->a:Lexpo/modules/video/a$M1;

    .line 263
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 264
    new-instance v6, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/records/ButtonOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 265
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_23

    .line 266
    sget-object v6, LFd/P;->a:LFd/P;

    .line 267
    new-instance v9, Lpc/b;

    .line 268
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/records/ButtonOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 269
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 270
    :cond_23
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    const-string v1, "useExoShutter"

    sget-object v2, Lexpo/modules/video/a$N1;->a:Lexpo/modules/video/a$N1;

    .line 272
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/views/c;

    .line 273
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_24

    .line 275
    sget-object v6, LFd/Q;->a:LFd/Q;

    .line 276
    new-instance v9, Lpc/b;

    .line 277
    new-instance v11, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 278
    invoke-direct {v9, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 279
    :cond_24
    invoke-direct {v5, v1, v6, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    const-string v1, "enterFullscreen"

    .line 281
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpc/b;

    if-nez v2, :cond_25

    .line 283
    sget-object v2, Lexpo/modules/video/a$A1;->a:Lexpo/modules/video/a$A1;

    .line 284
    new-instance v3, Lpc/b;

    .line 285
    new-instance v5, Lpc/M;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 286
    invoke-direct {v3, v5, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v2, v3

    .line 287
    :cond_25
    filled-new-array {v2}, [Lpc/b;

    move-result-object v2

    .line 288
    new-instance v3, Lexpo/modules/video/a$B1;

    invoke-direct {v3}, Lexpo/modules/video/a$B1;-><init>()V

    .line 289
    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    .line 290
    new-instance v5, Ldc/l;

    invoke-direct {v5, v1, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    :goto_9
    move-object v6, v5

    move-object/from16 v5, v35

    goto :goto_a

    .line 291
    :cond_26
    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_27

    .line 292
    new-instance v5, Ldc/h;

    invoke-direct {v5, v1, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    .line 293
    :cond_27
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    .line 294
    new-instance v5, Ldc/i;

    invoke-direct {v5, v1, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    :cond_28
    move-object/from16 v5, v35

    .line 295
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_29

    .line 296
    new-instance v6, Ldc/j;

    invoke-direct {v6, v1, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 297
    :cond_29
    const-class v6, Ljava/lang/String;

    invoke-static {v15, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    .line 298
    new-instance v6, Ldc/n;

    invoke-direct {v6, v1, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 299
    :cond_2a
    new-instance v6, Ldc/s;

    invoke-direct {v6, v1, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 300
    :goto_a
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v34

    .line 301
    invoke-virtual {v6, v1}, Ldc/g;->n(Ldc/m;)Ldc/g;

    .line 302
    const-string v1, "exitFullscreen"

    const/4 v14, 0x0

    .line 303
    new-array v2, v14, [Lpc/b;

    new-instance v3, LFd/H;

    invoke-direct {v3}, LFd/H;-><init>()V

    .line 304
    new-instance v6, Ldc/s;

    invoke-direct {v6, v1, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 305
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    const-string v1, "startPictureInPicture"

    .line 307
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpc/b;

    if-nez v2, :cond_2b

    .line 309
    sget-object v2, Lexpo/modules/video/a$C1;->a:Lexpo/modules/video/a$C1;

    .line 310
    new-instance v3, Lpc/b;

    .line 311
    new-instance v6, Lpc/M;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v6, v9, v14, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v2, 0x0

    .line 312
    invoke-direct {v3, v6, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v2, v3

    .line 313
    :cond_2b
    filled-new-array {v2}, [Lpc/b;

    move-result-object v2

    .line 314
    new-instance v3, Lexpo/modules/video/a$D1;

    invoke-direct {v3}, Lexpo/modules/video/a$D1;-><init>()V

    .line 315
    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    .line 316
    new-instance v4, Ldc/l;

    invoke-direct {v4, v1, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 317
    :cond_2c
    invoke-static {v15, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    .line 318
    new-instance v4, Ldc/h;

    invoke-direct {v4, v1, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 319
    :cond_2d
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 320
    new-instance v4, Ldc/i;

    invoke-direct {v4, v1, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 321
    :cond_2e
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    .line 322
    new-instance v4, Ldc/j;

    invoke-direct {v4, v1, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 323
    :cond_2f
    const-class v4, Ljava/lang/String;

    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    .line 324
    new-instance v4, Ldc/n;

    invoke-direct {v4, v1, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_b

    .line 325
    :cond_30
    new-instance v4, Ldc/s;

    invoke-direct {v4, v1, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 326
    :goto_b
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v1, "stopPictureInPicture"

    const/4 v14, 0x0

    .line 328
    new-array v2, v14, [Lpc/b;

    new-instance v3, LFd/I;

    invoke-direct {v3}, LFd/I;-><init>()V

    .line 329
    new-instance v4, Ldc/s;

    invoke-direct {v4, v1, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 330
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/views/p;->f()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    new-instance v1, Lexpo/modules/video/a$E1;

    invoke-direct {v1}, Lexpo/modules/video/a$E1;-><init>()V

    move-object/from16 v2, v19

    invoke-virtual {v2, v1}, Lexpo/modules/kotlin/views/p;->j(Lkotlin/jvm/functions/Function1;)V

    .line 332
    new-instance v1, Lexpo/modules/video/a$F1;

    invoke-direct {v1}, Lexpo/modules/video/a$F1;-><init>()V

    invoke-virtual {v2, v1}, Lexpo/modules/kotlin/views/p;->k(Lkotlin/jvm/functions/Function1;)V

    .line 333
    invoke-virtual {v2}, Lexpo/modules/kotlin/views/p;->c()Lexpo/modules/kotlin/views/r;

    move-result-object v1

    move-object/from16 v3, v33

    invoke-virtual {v3, v1}, Lgc/a;->y(Lexpo/modules/kotlin/views/r;)V

    .line 334
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    .line 335
    new-instance v4, LYb/c;

    .line 336
    invoke-virtual {v3}, Lgc/a;->x()Lgc/c;

    move-result-object v1

    if-eqz v1, :cond_89

    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    move-result-object v5

    .line 337
    invoke-static {v7}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v1, "getSimpleName(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpc/b;

    if-nez v1, :cond_31

    .line 340
    sget-object v1, Lexpo/modules/video/a$t;->a:Lexpo/modules/video/a$t;

    .line 341
    new-instance v2, Lpc/b;

    .line 342
    new-instance v8, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v8, v9, v14, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v1, 0x0

    .line 343
    invoke-direct {v2, v8, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v8, v2

    goto :goto_c

    :cond_31
    move-object v8, v1

    .line 344
    :goto_c
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 345
    invoke-direct/range {v4 .. v9}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    .line 346
    new-instance v1, Ldc/r;

    const-string v2, "constructor"

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v5

    .line 347
    new-instance v6, Lkotlin/Pair;

    const-class v7, Lexpo/modules/video/records/VideoSource;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_32

    .line 349
    sget-object v6, Lexpo/modules/video/a$U;->a:Lexpo/modules/video/a$U;

    .line 350
    new-instance v7, Lpc/b;

    .line 351
    new-instance v8, Lpc/M;

    const-class v9, Lexpo/modules/video/records/VideoSource;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x1

    invoke-direct {v8, v9, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 352
    invoke-direct {v7, v8, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 353
    :cond_32
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v8

    invoke-direct {v7, v8, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 354
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpc/b;

    if-nez v7, :cond_33

    .line 355
    sget-object v7, Lexpo/modules/video/a$V;->a:Lexpo/modules/video/a$V;

    .line 356
    new-instance v8, Lpc/b;

    .line 357
    new-instance v9, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x1

    invoke-direct {v9, v11, v14, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 358
    invoke-direct {v8, v9, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v7, v8

    .line 359
    :cond_33
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/video/records/PlayerBuilderOptions;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 360
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpc/b;

    if-nez v8, :cond_34

    .line 361
    sget-object v8, Lexpo/modules/video/a$W;->a:Lexpo/modules/video/a$W;

    .line 362
    new-instance v9, Lpc/b;

    .line 363
    new-instance v11, Lpc/M;

    const-class v13, Lexpo/modules/video/records/PlayerBuilderOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v11, v13, v14, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 364
    invoke-direct {v9, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v8, v9

    .line 365
    :cond_34
    filled-new-array {v6, v7, v8}, [Lpc/b;

    move-result-object v5

    .line 366
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_35

    new-instance v6, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 367
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v8

    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    :cond_35
    new-instance v7, Lexpo/modules/video/a$X;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v8, p0

    :try_start_3
    invoke-direct {v7, v8}, Lexpo/modules/video/a$X;-><init>(Lexpo/modules/video/a;)V

    .line 369
    invoke-direct {v1, v2, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 370
    invoke-virtual {v4, v1}, LYb/c;->B(Ldc/r;)V

    .line 371
    const-string v1, "playing"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 372
    new-instance v2, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-direct {v5, v6, v9, v7, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 373
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_36

    new-instance v6, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 374
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :catchall_2
    move-exception v0

    goto/16 :goto_10

    .line 375
    :cond_36
    :goto_d
    new-instance v9, Lexpo/modules/video/a$y0;

    invoke-direct {v9}, Lexpo/modules/video/a$y0;-><init>()V

    move-object/from16 v11, v32

    .line 376
    invoke-direct {v2, v11, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 377
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 378
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 379
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 380
    const-string v1, "muted"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 381
    new-instance v2, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v9, 0x0

    invoke-direct {v5, v6, v9, v7, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 382
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_37

    new-instance v6, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 383
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    invoke-interface {v9, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    :cond_37
    new-instance v9, Lexpo/modules/video/a$I0;

    invoke-direct {v9}, Lexpo/modules/video/a$I0;-><init>()V

    .line 385
    invoke-direct {v2, v11, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 386
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 387
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 388
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 389
    new-instance v2, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v9, 0x0

    invoke-direct {v5, v6, v9, v7, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 390
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 391
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_38

    .line 392
    sget-object v6, Lexpo/modules/video/a$a1;->a:Lexpo/modules/video/a$a1;

    .line 393
    new-instance v9, Lpc/b;

    .line 394
    new-instance v13, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v7, 0x0

    invoke-direct {v13, v14, v7, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 395
    invoke-direct {v9, v13, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 396
    :cond_38
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v5

    .line 397
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_39

    new-instance v6, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 398
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    :cond_39
    new-instance v7, Lexpo/modules/video/a$l1;

    invoke-direct {v7}, Lexpo/modules/video/a$l1;-><init>()V

    move-object/from16 v9, v29

    .line 400
    invoke-direct {v2, v9, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 401
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 402
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 403
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 404
    const-string v1, "volume"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 405
    new-instance v2, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 406
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_3a

    new-instance v6, Lpc/U;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 407
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    invoke-interface {v7, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    :cond_3a
    new-instance v7, Lexpo/modules/video/a$J0;

    invoke-direct {v7}, Lexpo/modules/video/a$J0;-><init>()V

    .line 409
    invoke-direct {v2, v11, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 410
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 411
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 412
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 413
    new-instance v2, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 414
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 415
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_3b

    .line 416
    sget-object v6, Lexpo/modules/video/a$p1;->a:Lexpo/modules/video/a$p1;

    .line 417
    new-instance v7, Lpc/b;

    .line 418
    new-instance v13, Lpc/M;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    move-object/from16 v33, v3

    const/4 v3, 0x0

    invoke-direct {v13, v14, v3, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 419
    invoke-direct {v7, v13, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    goto :goto_e

    :cond_3b
    move-object/from16 v33, v3

    .line 420
    :goto_e
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 421
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_3c

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 422
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    :cond_3c
    new-instance v6, Lexpo/modules/video/a$q1;

    invoke-direct {v6}, Lexpo/modules/video/a$q1;-><init>()V

    .line 424
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 425
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 426
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 427
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 428
    const-string v1, "currentTime"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 429
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 430
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_3d

    new-instance v5, Lpc/U;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 431
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    :cond_3d
    new-instance v6, Lexpo/modules/video/a$K0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$K0;-><init>(Lexpo/modules/video/a;)V

    .line 433
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 434
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 435
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 436
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 437
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 438
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 439
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_3e

    .line 440
    sget-object v5, Lexpo/modules/video/a$r1;->a:Lexpo/modules/video/a$r1;

    .line 441
    new-instance v6, Lpc/b;

    .line 442
    new-instance v7, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 443
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 444
    :cond_3e
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 445
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_3f

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 446
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    :cond_3f
    new-instance v6, Lexpo/modules/video/a$s1;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$s1;-><init>(Lexpo/modules/video/a;)V

    .line 448
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 449
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 450
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 451
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 452
    const-string v1, "currentLiveTimestamp"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 453
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 454
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_40

    new-instance v5, Lpc/U;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 455
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    :cond_40
    new-instance v6, Lexpo/modules/video/a$L0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$L0;-><init>(Lexpo/modules/video/a;)V

    .line 457
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 458
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 459
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 460
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 461
    const-string v1, "availableVideoTracks"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 462
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 463
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_41

    new-instance v5, Lpc/U;

    const-class v6, Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 464
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Ljava/util/List;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    :cond_41
    new-instance v6, Lexpo/modules/video/a$M0;

    invoke-direct {v6}, Lexpo/modules/video/a$M0;-><init>()V

    .line 466
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 467
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 468
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 469
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 470
    const-string v1, "videoTrack"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 471
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 472
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/VideoTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_42

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/VideoTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 473
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/VideoTrack;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    :cond_42
    new-instance v6, Lexpo/modules/video/a$N0;

    invoke-direct {v6}, Lexpo/modules/video/a$N0;-><init>()V

    .line 475
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 476
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 477
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 478
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 479
    const-string v1, "availableSubtitleTracks"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 480
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 481
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_43

    new-instance v5, Lpc/U;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 482
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    :cond_43
    new-instance v6, Lexpo/modules/video/a$O0;

    invoke-direct {v6}, Lexpo/modules/video/a$O0;-><init>()V

    .line 484
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 485
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 486
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 487
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 488
    const-string v1, "subtitleTrack"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 489
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 490
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/SubtitleTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_44

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/SubtitleTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 491
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/SubtitleTrack;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    :cond_44
    new-instance v6, Lexpo/modules/video/a$P0;

    invoke-direct {v6}, Lexpo/modules/video/a$P0;-><init>()V

    .line 493
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 494
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 495
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 496
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 497
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 498
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/records/SubtitleTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 499
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_45

    .line 500
    sget-object v5, Lexpo/modules/video/a$t1;->a:Lexpo/modules/video/a$t1;

    .line 501
    new-instance v6, Lpc/b;

    .line 502
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/records/SubtitleTrack;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 503
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 504
    :cond_45
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 505
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_46

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 506
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    :cond_46
    new-instance v6, Lexpo/modules/video/a$u1;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$u1;-><init>(Lexpo/modules/video/a;)V

    .line 508
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 509
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 510
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 511
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 512
    const-string v1, "availableAudioTracks"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 513
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 514
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_47

    new-instance v5, Lpc/U;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 515
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    :cond_47
    new-instance v6, Lexpo/modules/video/a$o0;

    invoke-direct {v6}, Lexpo/modules/video/a$o0;-><init>()V

    .line 517
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 518
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 519
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 520
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 521
    const-string v1, "audioTrack"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 522
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 523
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/AudioTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_48

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/AudioTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 524
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/AudioTrack;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    :cond_48
    new-instance v6, Lexpo/modules/video/a$p0;

    invoke-direct {v6}, Lexpo/modules/video/a$p0;-><init>()V

    .line 526
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 527
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 528
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 529
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 530
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 531
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/records/AudioTrack;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_49

    .line 533
    sget-object v5, Lexpo/modules/video/a$v1;->a:Lexpo/modules/video/a$v1;

    .line 534
    new-instance v6, Lpc/b;

    .line 535
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/records/AudioTrack;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 536
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 537
    :cond_49
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 538
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4a

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 539
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    :cond_4a
    new-instance v6, Lexpo/modules/video/a$Q0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$Q0;-><init>(Lexpo/modules/video/a;)V

    .line 541
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 542
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 543
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 544
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 545
    const-string v1, "currentOffsetFromLive"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 546
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 547
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4b

    new-instance v5, Lpc/U;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 548
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    :cond_4b
    new-instance v6, Lexpo/modules/video/a$q0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$q0;-><init>(Lexpo/modules/video/a;)V

    .line 550
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 551
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 552
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 553
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 554
    const-string v1, "duration"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 555
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 556
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4c

    new-instance v5, Lpc/U;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 557
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    :cond_4c
    new-instance v6, Lexpo/modules/video/a$r0;

    invoke-direct {v6}, Lexpo/modules/video/a$r0;-><init>()V

    .line 559
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 560
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 561
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 562
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 563
    const-string v1, "playbackRate"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 564
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 565
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4d

    new-instance v5, Lpc/U;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 566
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    :cond_4d
    new-instance v6, Lexpo/modules/video/a$s0;

    invoke-direct {v6}, Lexpo/modules/video/a$s0;-><init>()V

    .line 568
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 569
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 570
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 571
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 572
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 573
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 574
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_4e

    .line 575
    sget-object v5, Lexpo/modules/video/a$R0;->a:Lexpo/modules/video/a$R0;

    .line 576
    new-instance v6, Lpc/b;

    .line 577
    new-instance v7, Lpc/M;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 578
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 579
    :cond_4e
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 580
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4f

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 581
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    :cond_4f
    new-instance v6, Lexpo/modules/video/a$S0;

    invoke-direct {v6}, Lexpo/modules/video/a$S0;-><init>()V

    .line 583
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 584
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 585
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 586
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 587
    const-string v1, "isLive"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 588
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 589
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_50

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 590
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    :cond_50
    new-instance v6, Lexpo/modules/video/a$t0;

    invoke-direct {v6}, Lexpo/modules/video/a$t0;-><init>()V

    .line 592
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 593
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 594
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 595
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 596
    const-string v1, "preservesPitch"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 597
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 598
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_51

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 599
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    :cond_51
    new-instance v6, Lexpo/modules/video/a$u0;

    invoke-direct {v6}, Lexpo/modules/video/a$u0;-><init>()V

    .line 601
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 602
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 603
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 604
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 605
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 606
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 607
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_52

    .line 608
    sget-object v5, Lexpo/modules/video/a$T0;->a:Lexpo/modules/video/a$T0;

    .line 609
    new-instance v6, Lpc/b;

    .line 610
    new-instance v7, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 611
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 612
    :cond_52
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 613
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_53

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 614
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    :cond_53
    new-instance v6, Lexpo/modules/video/a$U0;

    invoke-direct {v6}, Lexpo/modules/video/a$U0;-><init>()V

    .line 616
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 617
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 618
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 619
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 620
    const-string v1, "showNowPlayingNotification"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 621
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 622
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_54

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 623
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    :cond_54
    new-instance v6, Lexpo/modules/video/a$v0;

    invoke-direct {v6}, Lexpo/modules/video/a$v0;-><init>()V

    .line 625
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 626
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 627
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 628
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 629
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 630
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 631
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_55

    .line 632
    sget-object v5, Lexpo/modules/video/a$V0;->a:Lexpo/modules/video/a$V0;

    .line 633
    new-instance v6, Lpc/b;

    .line 634
    new-instance v7, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 635
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 636
    :cond_55
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 637
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_56

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 638
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    :cond_56
    new-instance v6, Lexpo/modules/video/a$W0;

    invoke-direct {v6}, Lexpo/modules/video/a$W0;-><init>()V

    .line 640
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 641
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 642
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 643
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 644
    const-string v1, "status"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 645
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 646
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/enums/PlayerStatus;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_57

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/enums/PlayerStatus;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 647
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/enums/PlayerStatus;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    :cond_57
    new-instance v6, Lexpo/modules/video/a$w0;

    invoke-direct {v6}, Lexpo/modules/video/a$w0;-><init>()V

    .line 649
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 650
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 651
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 652
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 653
    const-string v1, "staysActiveInBackground"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 654
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 655
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_58

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 656
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    :cond_58
    new-instance v6, Lexpo/modules/video/a$x0;

    invoke-direct {v6}, Lexpo/modules/video/a$x0;-><init>()V

    .line 658
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 659
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 660
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 661
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 662
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 663
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 664
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_59

    .line 665
    sget-object v5, Lexpo/modules/video/a$X0;->a:Lexpo/modules/video/a$X0;

    .line 666
    new-instance v6, Lpc/b;

    .line 667
    new-instance v7, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 668
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 669
    :cond_59
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 670
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_5a

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 671
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    :cond_5a
    new-instance v6, Lexpo/modules/video/a$Y0;

    invoke-direct {v6}, Lexpo/modules/video/a$Y0;-><init>()V

    .line 673
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 674
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 675
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 676
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 677
    const-string v1, "loop"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 678
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 679
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_5b

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 680
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    :cond_5b
    new-instance v6, Lexpo/modules/video/a$z0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$z0;-><init>(Lexpo/modules/video/a;)V

    .line 682
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 683
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 684
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 685
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 686
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 687
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 688
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_5c

    .line 689
    sget-object v5, Lexpo/modules/video/a$Z0;->a:Lexpo/modules/video/a$Z0;

    .line 690
    new-instance v6, Lpc/b;

    .line 691
    new-instance v7, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 692
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 693
    :cond_5c
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 694
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_5d

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 695
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    :cond_5d
    new-instance v6, Lexpo/modules/video/a$b1;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$b1;-><init>(Lexpo/modules/video/a;)V

    .line 697
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 698
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 699
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 700
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 701
    const-string v1, "bufferedPosition"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 702
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 703
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_5e

    new-instance v5, Lpc/U;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 704
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    :cond_5e
    new-instance v6, Lexpo/modules/video/a$A0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$A0;-><init>(Lexpo/modules/video/a;)V

    .line 706
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 707
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 708
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 709
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 710
    const-string v1, "bufferOptions"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 711
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 712
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/BufferOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_5f

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/BufferOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 713
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/BufferOptions;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    :cond_5f
    new-instance v6, Lexpo/modules/video/a$B0;

    invoke-direct {v6}, Lexpo/modules/video/a$B0;-><init>()V

    .line 715
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 716
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 717
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 718
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 719
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 720
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/records/BufferOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 721
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_60

    .line 722
    sget-object v5, Lexpo/modules/video/a$c1;->a:Lexpo/modules/video/a$c1;

    .line 723
    new-instance v6, Lpc/b;

    .line 724
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/records/BufferOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 725
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 726
    :cond_60
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 727
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_61

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 728
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    :cond_61
    new-instance v6, Lexpo/modules/video/a$d1;

    invoke-direct {v6}, Lexpo/modules/video/a$d1;-><init>()V

    .line 730
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 731
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 732
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 733
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 734
    const-string v1, "isExternalPlaybackActive"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 735
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 736
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_62

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 737
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    :cond_62
    new-instance v6, Lexpo/modules/video/a$C0;

    invoke-direct {v6}, Lexpo/modules/video/a$C0;-><init>()V

    .line 739
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 740
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 741
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 742
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 743
    const-string v1, "play"

    .line 744
    new-instance v2, Ldc/r;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 745
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 746
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_63

    .line 747
    sget-object v5, Lexpo/modules/video/a$f0;->a:Lexpo/modules/video/a$f0;

    .line 748
    new-instance v6, Lpc/b;

    .line 749
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 750
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 751
    :cond_63
    filled-new-array {v5}, [Lpc/b;

    move-result-object v3

    .line 752
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_64

    new-instance v5, Lpc/U;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 753
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    :cond_64
    new-instance v6, Lexpo/modules/video/a$g0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$g0;-><init>(Lexpo/modules/video/a;)V

    .line 755
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 756
    invoke-virtual {v4}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    const-string v1, "pause"

    .line 758
    new-instance v2, Ldc/r;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 759
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 760
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_65

    .line 761
    sget-object v5, Lexpo/modules/video/a$h0;->a:Lexpo/modules/video/a$h0;

    .line 762
    new-instance v6, Lpc/b;

    .line 763
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 764
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 765
    :cond_65
    filled-new-array {v5}, [Lpc/b;

    move-result-object v3

    .line 766
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_66

    new-instance v5, Lpc/U;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 767
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    :cond_66
    new-instance v6, Lexpo/modules/video/a$i0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$i0;-><init>(Lexpo/modules/video/a;)V

    .line 769
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 770
    invoke-virtual {v4}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    const-string v1, "timeUpdateEventInterval"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 772
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 773
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_67

    new-instance v5, Lpc/U;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 774
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    :cond_67
    new-instance v6, Lexpo/modules/video/a$D0;

    invoke-direct {v6}, Lexpo/modules/video/a$D0;-><init>()V

    .line 776
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 777
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 778
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 779
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 780
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 781
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 782
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_68

    .line 783
    sget-object v5, Lexpo/modules/video/a$e1;->a:Lexpo/modules/video/a$e1;

    .line 784
    new-instance v6, Lpc/b;

    .line 785
    new-instance v7, Lpc/M;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 786
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 787
    :cond_68
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 788
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_69

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 789
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    :cond_69
    new-instance v6, Lexpo/modules/video/a$f1;

    invoke-direct {v6}, Lexpo/modules/video/a$f1;-><init>()V

    .line 791
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 792
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 793
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 794
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 795
    const-string v1, "audioMixingMode"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 796
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 797
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/enums/AudioMixingMode;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_6a

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/enums/AudioMixingMode;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 798
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/enums/AudioMixingMode;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    :cond_6a
    new-instance v6, Lexpo/modules/video/a$E0;

    invoke-direct {v6}, Lexpo/modules/video/a$E0;-><init>()V

    .line 800
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 801
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 802
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 803
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 804
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 805
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/enums/AudioMixingMode;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 806
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_6b

    .line 807
    sget-object v5, Lexpo/modules/video/a$g1;->a:Lexpo/modules/video/a$g1;

    .line 808
    new-instance v6, Lpc/b;

    .line 809
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/enums/AudioMixingMode;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 810
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 811
    :cond_6b
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 812
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_6c

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 813
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    :cond_6c
    new-instance v6, Lexpo/modules/video/a$h1;

    invoke-direct {v6}, Lexpo/modules/video/a$h1;-><init>()V

    .line 815
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 816
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 817
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 818
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 819
    const-string v1, "keepScreenOnWhilePlaying"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 820
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 821
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_6d

    new-instance v5, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 822
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    :cond_6d
    new-instance v6, Lexpo/modules/video/a$F0;

    invoke-direct {v6}, Lexpo/modules/video/a$F0;-><init>()V

    .line 824
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 825
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 826
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 827
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 828
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 829
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 830
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_6e

    .line 831
    sget-object v5, Lexpo/modules/video/a$i1;->a:Lexpo/modules/video/a$i1;

    .line 832
    new-instance v6, Lpc/b;

    .line 833
    new-instance v7, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 834
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 835
    :cond_6e
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 836
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_6f

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 837
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    :cond_6f
    new-instance v6, Lexpo/modules/video/a$j1;

    invoke-direct {v6}, Lexpo/modules/video/a$j1;-><init>()V

    .line 839
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 840
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 841
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 842
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 843
    const-string v1, "seekTolerance"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 844
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 845
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/SeekTolerance;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_70

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/SeekTolerance;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 846
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/SeekTolerance;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    :cond_70
    new-instance v6, Lexpo/modules/video/a$G0;

    invoke-direct {v6}, Lexpo/modules/video/a$G0;-><init>()V

    .line 848
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 849
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 850
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 851
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 852
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 853
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/records/SeekTolerance;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 854
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_71

    .line 855
    sget-object v5, Lexpo/modules/video/a$k1;->a:Lexpo/modules/video/a$k1;

    .line 856
    new-instance v6, Lpc/b;

    .line 857
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/records/SeekTolerance;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 858
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 859
    :cond_71
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 860
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_72

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 861
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    :cond_72
    new-instance v6, Lexpo/modules/video/a$m1;

    invoke-direct {v6}, Lexpo/modules/video/a$m1;-><init>()V

    .line 863
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 864
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 865
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 866
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 867
    const-string v1, "scrubbingModeOptions"

    invoke-virtual {v4, v1}, LYb/c;->u(Ljava/lang/String;)Lhc/m;

    move-result-object v1

    .line 868
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lpc/b;

    move-result-object v3

    .line 869
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lexpo/modules/video/records/ScrubbingModeOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_73

    new-instance v5, Lpc/U;

    const-class v6, Lexpo/modules/video/records/ScrubbingModeOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 870
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lexpo/modules/video/records/ScrubbingModeOptions;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    :cond_73
    new-instance v6, Lexpo/modules/video/a$H0;

    invoke-direct {v6}, Lexpo/modules/video/a$H0;-><init>()V

    .line 872
    invoke-direct {v2, v11, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 873
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 874
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 875
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 876
    new-instance v2, Ldc/r;

    new-instance v3, Lpc/b;

    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 877
    new-instance v5, Lkotlin/Pair;

    const-class v6, Lexpo/modules/video/records/ScrubbingModeOptions;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 878
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_74

    .line 879
    sget-object v5, Lexpo/modules/video/a$n1;->a:Lexpo/modules/video/a$n1;

    .line 880
    new-instance v6, Lpc/b;

    .line 881
    new-instance v7, Lpc/M;

    const-class v13, Lexpo/modules/video/records/ScrubbingModeOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v7, v13, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v13, 0x0

    .line 882
    invoke-direct {v6, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 883
    :cond_74
    filled-new-array {v3, v5}, [Lpc/b;

    move-result-object v3

    .line 884
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_75

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 885
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    :cond_75
    new-instance v6, Lexpo/modules/video/a$o1;

    invoke-direct {v6}, Lexpo/modules/video/a$o1;-><init>()V

    .line 887
    invoke-direct {v2, v9, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 888
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 889
    invoke-virtual {v2, v14}, Ldc/a;->k(Z)V

    .line 890
    invoke-virtual {v1, v2}, Lhc/l;->c(Ldc/r;)V

    .line 891
    const-string v1, "replace"

    .line 892
    new-instance v2, Ldc/r;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 893
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 894
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_76

    .line 895
    sget-object v5, Lexpo/modules/video/a$j0;->a:Lexpo/modules/video/a$j0;

    .line 896
    new-instance v6, Lpc/b;

    .line 897
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 898
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 899
    :cond_76
    new-instance v6, Lkotlin/Pair;

    const-class v7, Lexpo/modules/kotlin/types/Either;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 900
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_77

    .line 901
    sget-object v6, Lexpo/modules/video/a$k0;->a:Lexpo/modules/video/a$k0;

    .line 902
    new-instance v7, Lpc/b;

    .line 903
    new-instance v9, Lpc/M;

    const-class v13, Lexpo/modules/kotlin/types/Either;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v9, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 904
    invoke-direct {v7, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 905
    :cond_77
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 906
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_78

    new-instance v5, Lpc/U;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 907
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    :cond_78
    new-instance v6, Lexpo/modules/video/a$l0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$l0;-><init>(Lexpo/modules/video/a;)V

    .line 909
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 910
    invoke-virtual {v4}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    const-string v1, "replaceAsync"

    .line 912
    new-instance v2, Ldc/f;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 913
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 914
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_79

    .line 915
    sget-object v5, Lexpo/modules/video/a$Q;->a:Lexpo/modules/video/a$Q;

    .line 916
    new-instance v6, Lpc/b;

    .line 917
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 918
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 919
    :cond_79
    new-instance v6, Lkotlin/Pair;

    const-class v7, Lexpo/modules/kotlin/types/Either;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 920
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_7a

    .line 921
    sget-object v6, Lexpo/modules/video/a$R;->a:Lexpo/modules/video/a$R;

    .line 922
    new-instance v7, Lpc/b;

    .line 923
    new-instance v9, Lpc/M;

    const-class v13, Lexpo/modules/kotlin/types/Either;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x1

    invoke-direct {v9, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 924
    invoke-direct {v7, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 925
    :cond_7a
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 926
    new-instance v5, Lexpo/modules/video/a$S;

    invoke-direct {v5, v8}, Lexpo/modules/video/a$S;-><init>(Lexpo/modules/video/a;)V

    .line 927
    invoke-direct {v2, v1, v3, v5}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 928
    invoke-virtual {v4}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 929
    const-string v1, "seekBy"

    .line 930
    new-instance v2, Ldc/r;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 931
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 932
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_7b

    .line 933
    sget-object v5, Lexpo/modules/video/a$m0;->a:Lexpo/modules/video/a$m0;

    .line 934
    new-instance v6, Lpc/b;

    .line 935
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 936
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 937
    :cond_7b
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 938
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_7c

    .line 939
    sget-object v6, Lexpo/modules/video/a$n0;->a:Lexpo/modules/video/a$n0;

    .line 940
    new-instance v7, Lpc/b;

    .line 941
    new-instance v9, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v9, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 942
    invoke-direct {v7, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 943
    :cond_7c
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 944
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_7d

    new-instance v5, Lpc/U;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 945
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    :cond_7d
    new-instance v6, Lexpo/modules/video/a$c0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$c0;-><init>(Lexpo/modules/video/a;)V

    .line 947
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 948
    invoke-virtual {v4}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    const-string v1, "replay"

    .line 950
    new-instance v2, Ldc/r;

    invoke-virtual {v4}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 951
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 952
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_7e

    .line 953
    sget-object v5, Lexpo/modules/video/a$d0;->a:Lexpo/modules/video/a$d0;

    .line 954
    new-instance v6, Lpc/b;

    .line 955
    new-instance v7, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 956
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 957
    :cond_7e
    filled-new-array {v5}, [Lpc/b;

    move-result-object v3

    .line 958
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_7f

    new-instance v5, Lpc/U;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 959
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 960
    :cond_7f
    new-instance v6, Lexpo/modules/video/a$e0;

    invoke-direct {v6, v8}, Lexpo/modules/video/a$e0;-><init>(Lexpo/modules/video/a;)V

    .line 961
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 962
    invoke-virtual {v4}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    const-string v1, "generateThumbnailsAsync"

    invoke-virtual {v4, v1}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    move-result-object v1

    .line 964
    new-instance v2, Ldc/p;

    invoke-virtual {v1}, Ldc/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ldc/b;->b()Lpc/X;

    move-result-object v5

    .line 965
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 966
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_80

    .line 967
    sget-object v6, Lexpo/modules/video/a$Y;->a:Lexpo/modules/video/a$Y;

    .line 968
    new-instance v7, Lpc/b;

    .line 969
    new-instance v9, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v9, v13, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 970
    invoke-direct {v7, v9, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 971
    :cond_80
    new-instance v7, Lkotlin/Pair;

    const-class v9, Ljava/util/List;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v7, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 972
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpc/b;

    if-nez v7, :cond_81

    .line 973
    sget-object v7, Lexpo/modules/video/a$Z;->a:Lexpo/modules/video/a$Z;

    .line 974
    new-instance v9, Lpc/b;

    .line 975
    new-instance v13, Lpc/M;

    const-class v14, Ljava/util/List;

    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 976
    invoke-direct {v9, v13, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v7, v9

    .line 977
    :cond_81
    new-instance v9, Lkotlin/Pair;

    const-class v13, Lexpo/modules/video/records/VideoThumbnailOptions;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    invoke-direct {v9, v13, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 978
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_82

    .line 979
    sget-object v9, Lexpo/modules/video/a$a0;->a:Lexpo/modules/video/a$a0;

    .line 980
    new-instance v10, Lpc/b;

    .line 981
    new-instance v13, Lpc/M;

    const-class v14, Lexpo/modules/video/records/VideoThumbnailOptions;

    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v13, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 982
    invoke-direct {v10, v13, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v10

    .line 983
    :cond_82
    filled-new-array {v6, v7, v9}, [Lpc/b;

    move-result-object v5

    .line 984
    new-instance v6, Lexpo/modules/video/a$b0;

    const/4 v13, 0x0

    invoke-direct {v6, v13, v8}, Lexpo/modules/video/a$b0;-><init>(LZd/e;Lexpo/modules/video/a;)V

    .line 985
    invoke-direct {v2, v3, v5, v6}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 986
    invoke-virtual {v1, v2}, Ldc/b;->d(Ldc/g;)V

    .line 987
    const-class v1, Lexpo/modules/video/VideoThumbnail;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v24

    .line 988
    new-instance v21, LYb/c;

    .line 989
    invoke-virtual/range {v33 .. v33}, Lgc/a;->x()Lgc/c;

    move-result-object v1

    if-eqz v1, :cond_88

    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    move-result-object v22

    .line 990
    invoke-static/range {v24 .. v24}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getSimpleName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 991
    new-instance v2, Lkotlin/Pair;

    const-class v3, Lexpo/modules/video/VideoThumbnail;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 992
    invoke-virtual/range {v28 .. v28}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpc/b;

    if-nez v2, :cond_83

    .line 993
    sget-object v2, Lexpo/modules/video/a$T;->a:Lexpo/modules/video/a$T;

    .line 994
    new-instance v3, Lpc/b;

    .line 995
    new-instance v5, Lpc/M;

    const-class v6, Lexpo/modules/video/VideoThumbnail;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v6, 0x0

    .line 996
    invoke-direct {v3, v5, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object/from16 v25, v3

    goto :goto_f

    :cond_83
    move-object/from16 v25, v2

    .line 997
    :goto_f
    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v26

    move-object/from16 v23, v1

    .line 998
    invoke-direct/range {v21 .. v26}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    .line 999
    const-string v1, "width"

    .line 1000
    new-instance v2, Lhc/m;

    invoke-virtual/range {v21 .. v21}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 1001
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 1002
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_84

    new-instance v6, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 1003
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    :cond_84
    new-instance v7, Lexpo/modules/video/a$w1;

    invoke-direct {v7}, Lexpo/modules/video/a$w1;-><init>()V

    .line 1005
    invoke-direct {v3, v11, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1006
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 1007
    invoke-virtual {v3, v14}, Ldc/a;->k(Z)V

    .line 1008
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 1009
    invoke-virtual/range {v21 .. v21}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    const-string v1, "height"

    .line 1011
    new-instance v2, Lhc/m;

    invoke-virtual/range {v21 .. v21}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 1012
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 1013
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_85

    new-instance v6, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 1014
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    :cond_85
    new-instance v7, Lexpo/modules/video/a$x1;

    invoke-direct {v7}, Lexpo/modules/video/a$x1;-><init>()V

    .line 1016
    invoke-direct {v3, v11, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1017
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 1018
    invoke-virtual {v3, v14}, Ldc/a;->k(Z)V

    .line 1019
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 1020
    invoke-virtual/range {v21 .. v21}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1021
    const-string v1, "requestedTime"

    .line 1022
    new-instance v2, Lhc/m;

    invoke-virtual/range {v21 .. v21}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 1023
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 1024
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_86

    new-instance v6, Lpc/U;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 1025
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    :cond_86
    new-instance v7, Lexpo/modules/video/a$y1;

    invoke-direct {v7}, Lexpo/modules/video/a$y1;-><init>()V

    .line 1027
    invoke-direct {v3, v11, v5, v6, v7}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1028
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 1029
    invoke-virtual {v3, v14}, Ldc/a;->k(Z)V

    .line 1030
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 1031
    invoke-virtual/range {v21 .. v21}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1032
    const-string v1, "actualTime"

    .line 1033
    new-instance v2, Lhc/m;

    invoke-virtual/range {v21 .. v21}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 1034
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7, v13}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 1035
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_87

    new-instance v6, Lpc/U;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7}, Lpc/U;-><init>(Lpe/d;)V

    .line 1036
    invoke-virtual/range {v20 .. v20}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v0

    invoke-interface {v7, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1037
    :cond_87
    new-instance v0, Lexpo/modules/video/a$z1;

    invoke-direct {v0}, Lexpo/modules/video/a$z1;-><init>()V

    .line 1038
    invoke-direct {v3, v11, v5, v6, v0}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1039
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldc/a;->l(Lpe/q;)V

    const/4 v14, 0x1

    .line 1040
    invoke-virtual {v3, v14}, Ldc/a;->k(Z)V

    .line 1041
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 1042
    invoke-virtual/range {v21 .. v21}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    invoke-virtual/range {v33 .. v33}, Lgc/a;->v()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {v21 .. v21}, LYb/c;->v()LYb/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1044
    invoke-virtual/range {v33 .. v33}, Lgc/a;->v()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4}, LYb/c;->v()LYb/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1045
    invoke-virtual/range {v33 .. v33}, Lgc/a;->w()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lbc/e;->c:Lbc/e;

    new-instance v2, Lbc/a;

    new-instance v3, Lexpo/modules/video/a$x;

    invoke-direct {v3}, Lexpo/modules/video/a$x;-><init>()V

    invoke-direct {v2, v1, v3}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1046
    invoke-virtual/range {v33 .. v33}, Lgc/a;->w()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lbc/e;->d:Lbc/e;

    new-instance v2, Lbc/a;

    new-instance v3, Lexpo/modules/video/a$w;

    invoke-direct {v3}, Lexpo/modules/video/a$w;-><init>()V

    invoke-direct {v2, v1, v3}, Lbc/a;-><init>(Lbc/e;Lie/a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1047
    invoke-virtual/range {v33 .. v33}, Lgc/a;->u()Lgc/e;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1048
    invoke-static {}, LX3/a;->f()V

    return-object v0

    .line 1049
    :cond_88
    :try_start_4
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_89
    move-object/from16 v8, p0

    .line 1050
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1051
    :goto_10
    invoke-static {}, LX3/a;->f()V

    throw v0
.end method
