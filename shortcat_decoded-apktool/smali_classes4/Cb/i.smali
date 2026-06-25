.class public final LCb/i;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "LCb/i;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Ljava/io/File;",
        "A",
        "()Ljava/io/File;",
        "filesDirectory",
        "z",
        "cacheDirectory",
        "expo-file-system_release"
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

.method private final A()Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->A()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final synthetic x(LCb/i;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0}, LCb/i;->z()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(LCb/i;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0}, LCb/i;->A()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final z()Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->p()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 39

    move-object/from16 v1, p0

    .line 1
    const-string v0, "getSimpleName(...)"

    const-class v2, Lexpo/modules/filesystem/PathInfo;

    const-string v3, "info"

    const-class v4, Lexpo/modules/filesystem/CreateOptions;

    const-class v5, Ljava/net/URI;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Ljava/lang/Object;

    const-class v8, Lexpo/modules/filesystem/FileSystemPath;

    const-class v9, Landroid/net/Uri;

    const-class v10, Lexpo/modules/filesystem/FileSystemFileHandle;

    const-string v11, "get"

    const-class v12, Lexpo/modules/filesystem/FileSystemDirectory;

    const-class v13, Ljava/lang/Long;

    const-class v14, Ljava/lang/String;

    const-class v15, Lexpo/modules/filesystem/FileSystemFile;

    const-class v16, LTd/L;

    move-object/from16 v17, v2

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    move-object/from16 v18, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".ModuleDefinition"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v5

    const-string v5, "["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "ExpoModulesCore"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v2, Lgc/d;

    invoke-direct {v2, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 6
    const-string v4, "FileSystem"

    invoke-virtual {v2, v4}, Lgc/a;->s(Ljava/lang/String;)V

    .line 7
    const-string v4, "documentDirectory"

    .line 8
    new-instance v5, Lhc/c;

    invoke-direct {v5, v4}, Lhc/c;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v6

    .line 9
    new-instance v6, LCb/i$e;

    invoke-direct {v6, v1}, LCb/i$e;-><init>(LCb/i;)V

    invoke-virtual {v5, v6}, Lhc/c;->b(Lie/a;)V

    .line 10
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    const-string v4, "cacheDirectory"

    .line 12
    new-instance v5, Lhc/c;

    invoke-direct {v5, v4}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 13
    new-instance v6, LCb/i$f;

    invoke-direct {v6, v1}, LCb/i$f;-><init>(LCb/i;)V

    invoke-virtual {v5, v6}, Lhc/c;->b(Lie/a;)V

    .line 14
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    const-string v4, "bundleDirectory"

    .line 16
    new-instance v5, Lhc/c;

    invoke-direct {v5, v4}, Lhc/c;-><init>(Ljava/lang/String;)V

    .line 17
    new-instance v6, LCb/i$g;

    invoke-direct {v6}, LCb/i$g;-><init>()V

    invoke-virtual {v5, v6}, Lhc/c;->b(Lie/a;)V

    .line 18
    invoke-virtual {v2}, Lhc/f;->l()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    const-string v4, "totalDiskSpace"

    .line 20
    new-instance v5, Lhc/l;

    invoke-direct {v5, v4}, Lhc/l;-><init>(Ljava/lang/String;)V

    .line 21
    new-instance v6, Ldc/r;

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    new-array v8, v7, [Lpc/b;

    .line 22
    sget-object v23, Lpc/V;->a:Lpc/V;

    .line 23
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    move-object/from16 v24, v9

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpc/U;

    if-nez v7, :cond_0

    new-instance v7, Lpc/U;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v7, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 24
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    move-object/from16 v25, v10

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-interface {v9, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_12

    :cond_0
    move-object/from16 v25, v10

    .line 25
    :goto_0
    new-instance v9, LCb/i$s;

    invoke-direct {v9, v1}, LCb/i$s;-><init>(LCb/i;)V

    invoke-direct {v6, v11, v8, v7, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v6}, Lhc/l;->b(Ldc/r;)V

    .line 26
    invoke-virtual {v2}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    const-string v4, "availableDiskSpace"

    .line 28
    new-instance v5, Lhc/l;

    invoke-direct {v5, v4}, Lhc/l;-><init>(Ljava/lang/String;)V

    .line 29
    new-instance v6, Ldc/r;

    const/4 v7, 0x0

    new-array v8, v7, [Lpc/b;

    .line 30
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v7

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpc/U;

    if-nez v7, :cond_1

    new-instance v7, Lpc/U;

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v7, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 31
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v13}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-interface {v9, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_1
    new-instance v9, LCb/i$t;

    invoke-direct {v9, v1}, LCb/i$t;-><init>(LCb/i;)V

    invoke-direct {v6, v11, v8, v7, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v6}, Lhc/l;->b(Ldc/r;)V

    .line 33
    invoke-virtual {v2}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    const-string v4, "downloadFileAsync"

    invoke-virtual {v2, v4}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    move-result-object v4

    .line 35
    new-instance v5, Ldc/p;

    invoke-virtual {v4}, Ldc/b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ldc/b;->b()Lpc/X;

    move-result-object v7

    .line 36
    sget-object v8, Lpc/d;->a:Lpc/d;

    .line 37
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    move-object/from16 v26, v8

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_2

    .line 39
    sget-object v9, LCb/i$h;->a:LCb/i$h;

    .line 40
    new-instance v10, Lpc/b;

    move-object/from16 v27, v12

    .line 41
    new-instance v12, Lpc/M;

    move-object/from16 v28, v13

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    move-object/from16 v29, v11

    const/4 v11, 0x0

    invoke-direct {v12, v13, v11, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 42
    invoke-direct {v10, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v10

    goto :goto_1

    :cond_2
    move-object/from16 v29, v11

    move-object/from16 v27, v12

    move-object/from16 v28, v13

    .line 43
    :goto_1
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_3

    .line 45
    sget-object v10, LCb/i$i;->a:LCb/i$i;

    .line 46
    new-instance v11, Lpc/b;

    .line 47
    new-instance v12, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    move-object/from16 v30, v14

    const/4 v14, 0x0

    invoke-direct {v12, v13, v14, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 48
    invoke-direct {v11, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    goto :goto_2

    :cond_3
    move-object/from16 v30, v14

    .line 49
    :goto_2
    new-instance v11, Lkotlin/Pair;

    const-class v12, Lexpo/modules/filesystem/DownloadOptions;

    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v11, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/b;

    if-nez v11, :cond_4

    .line 51
    sget-object v11, LCb/i$j;->a:LCb/i$j;

    .line 52
    new-instance v14, Lpc/b;

    .line 53
    new-instance v12, Lpc/M;

    const-class v31, Lexpo/modules/filesystem/DownloadOptions;

    move-object/from16 v32, v15

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    move-object/from16 v31, v3

    const/4 v3, 0x1

    invoke-direct {v12, v15, v3, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 54
    invoke-direct {v14, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v11, v14

    goto :goto_3

    :cond_4
    move-object/from16 v31, v3

    move-object/from16 v32, v15

    .line 55
    :goto_3
    filled-new-array {v9, v10, v11}, [Lpc/b;

    move-result-object v3

    .line 56
    new-instance v7, LCb/i$k;

    const/4 v9, 0x0

    invoke-direct {v7, v9}, LCb/i$k;-><init>(LZd/e;)V

    .line 57
    invoke-direct {v5, v6, v3, v7}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 58
    invoke-virtual {v4, v5}, Ldc/b;->d(Ldc/g;)V

    .line 59
    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    .line 60
    new-instance v4, LCb/i$a;

    invoke-direct {v4, v3, v1, v9}, LCb/i$a;-><init>(Lkotlin/jvm/internal/N;LCb/i;LZd/e;)V

    invoke-virtual {v2, v4}, Lgc/a;->t(Lkotlin/jvm/functions/Function2;)V

    .line 61
    const-string v4, "pickDirectoryAsync"

    invoke-virtual {v2, v4}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    move-result-object v4

    .line 62
    new-instance v5, Ldc/p;

    invoke-virtual {v4}, Ldc/b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ldc/b;->b()Lpc/X;

    move-result-object v7

    .line 63
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_5

    .line 65
    sget-object v10, LCb/i$l;->a:LCb/i$l;

    .line 66
    new-instance v11, Lpc/b;

    .line 67
    new-instance v12, Lpc/M;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 68
    invoke-direct {v11, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 69
    :cond_5
    filled-new-array {v10}, [Lpc/b;

    move-result-object v7

    .line 70
    new-instance v10, LCb/i$m;

    invoke-direct {v10, v9, v3}, LCb/i$m;-><init>(LZd/e;Lkotlin/jvm/internal/N;)V

    .line 71
    invoke-direct {v5, v6, v7, v10}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 72
    invoke-virtual {v4, v5}, Ldc/b;->d(Ldc/g;)V

    .line 73
    const-string v4, "pickFileAsync"

    invoke-virtual {v2, v4}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    move-result-object v4

    .line 74
    new-instance v5, Ldc/p;

    invoke-virtual {v4}, Ldc/b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ldc/b;->b()Lpc/X;

    move-result-object v7

    .line 75
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_6

    .line 77
    sget-object v10, LCb/i$n;->a:LCb/i$n;

    .line 78
    new-instance v11, Lpc/b;

    .line 79
    new-instance v12, Lpc/M;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 80
    invoke-direct {v11, v12, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 81
    :cond_6
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-direct {v11, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/b;

    if-nez v11, :cond_7

    .line 83
    sget-object v11, LCb/i$o;->a:LCb/i$o;

    .line 84
    new-instance v12, Lpc/b;

    .line 85
    new-instance v14, Lpc/M;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    const/4 v9, 0x1

    invoke-direct {v14, v15, v9, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 86
    invoke-direct {v12, v14, v7}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v11, v12

    .line 87
    :cond_7
    filled-new-array {v10, v11}, [Lpc/b;

    move-result-object v7

    .line 88
    new-instance v9, LCb/i$p;

    const/4 v10, 0x0

    invoke-direct {v9, v10, v3}, LCb/i$p;-><init>(LZd/e;Lkotlin/jvm/internal/N;)V

    .line 89
    invoke-direct {v5, v6, v7, v9}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 90
    invoke-virtual {v4, v5}, Ldc/b;->d(Ldc/g;)V

    .line 91
    new-instance v3, Ldc/r;

    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    move-result-object v4

    .line 92
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_8

    .line 94
    sget-object v5, LCb/i$q;->a:LCb/i$q;

    .line 95
    new-instance v6, Lpc/b;

    .line 96
    new-instance v7, Lpc/M;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v11, 0x0

    invoke-direct {v7, v9, v11, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 97
    invoke-direct {v6, v7, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 98
    :cond_8
    filled-new-array {v5}, [Lpc/b;

    move-result-object v4

    .line 99
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_9

    new-instance v5, Lpc/U;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 100
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_9
    new-instance v6, LCb/i$r;

    invoke-direct {v6, v1}, LCb/i$r;-><init>(LCb/i;)V

    move-object/from16 v7, v31

    .line 102
    invoke-direct {v3, v7, v4, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 103
    invoke-virtual {v2}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v36

    .line 105
    new-instance v33, LYb/c;

    .line 106
    invoke-virtual {v2}, Lgc/a;->x()Lgc/c;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "Required value was null."

    if-eqz v3, :cond_7b

    :try_start_1
    invoke-virtual {v3}, Lgc/c;->i()LUb/d;

    move-result-object v34

    .line 107
    invoke-static/range {v36 .. v36}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_a

    .line 110
    sget-object v5, LCb/i$b;->a:LCb/i$b;

    .line 111
    new-instance v6, Lpc/b;

    .line 112
    new-instance v9, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v10, 0x0

    .line 113
    invoke-direct {v6, v9, v10}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object/from16 v37, v6

    goto :goto_4

    :cond_a
    move-object/from16 v37, v5

    .line 114
    :goto_4
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    move-result-object v38

    move-object/from16 v35, v3

    .line 115
    invoke-direct/range {v33 .. v38}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    move-object/from16 v3, v33

    .line 116
    new-instance v5, Ldc/r;

    const-string v6, "constructor"

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 117
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_b

    .line 119
    sget-object v10, LCb/i$D;->a:LCb/i$D;

    .line 120
    new-instance v11, Lpc/b;

    .line 121
    new-instance v12, Lpc/M;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 122
    invoke-direct {v11, v12, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 123
    :cond_b
    filled-new-array {v10}, [Lpc/b;

    move-result-object v9

    .line 124
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/U;

    if-nez v10, :cond_c

    new-instance v10, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 125
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    :cond_c
    new-instance v11, LCb/i$E;

    invoke-direct {v11}, LCb/i$E;-><init>()V

    .line 127
    invoke-direct {v5, v6, v9, v10, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 128
    invoke-virtual {v3, v5}, LYb/c;->B(Ldc/r;)V

    .line 129
    const-string v5, "delete"

    .line 130
    new-instance v6, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 131
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_d

    .line 133
    sget-object v10, LCb/i$P;->a:LCb/i$P;

    .line 134
    new-instance v11, Lpc/b;

    .line 135
    new-instance v12, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 136
    invoke-direct {v11, v12, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 137
    :cond_d
    filled-new-array {v10}, [Lpc/b;

    move-result-object v9

    .line 138
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/U;

    if-nez v10, :cond_e

    new-instance v10, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 139
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    :cond_e
    new-instance v11, LCb/i$a0;

    invoke-direct {v11}, LCb/i$a0;-><init>()V

    .line 141
    invoke-direct {v6, v5, v9, v10, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 142
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v5, "validatePath"

    .line 144
    new-instance v6, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 145
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_f

    .line 147
    sget-object v10, LCb/i$d0;->a:LCb/i$d0;

    .line 148
    new-instance v11, Lpc/b;

    .line 149
    new-instance v12, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 150
    invoke-direct {v11, v12, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 151
    :cond_f
    filled-new-array {v10}, [Lpc/b;

    move-result-object v9

    .line 152
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/U;

    if-nez v10, :cond_10

    new-instance v10, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 153
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    :cond_10
    new-instance v11, LCb/i$e0;

    invoke-direct {v11}, LCb/i$e0;-><init>()V

    .line 155
    invoke-direct {v6, v5, v9, v10, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 156
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    const-string v5, "create"

    .line 158
    new-instance v6, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 159
    new-instance v10, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_11

    .line 161
    sget-object v10, LCb/i$f0;->a:LCb/i$f0;

    .line 162
    new-instance v11, Lpc/b;

    .line 163
    new-instance v12, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 164
    invoke-direct {v11, v12, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 165
    :cond_11
    new-instance v11, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-direct {v11, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/b;

    if-nez v11, :cond_12

    .line 167
    sget-object v11, LCb/i$g0;->a:LCb/i$g0;

    .line 168
    new-instance v12, Lpc/b;

    .line 169
    new-instance v14, Lpc/M;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    const/4 v1, 0x1

    invoke-direct {v14, v15, v1, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 170
    invoke-direct {v12, v14, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v11, v12

    .line 171
    :cond_12
    filled-new-array {v10, v11}, [Lpc/b;

    move-result-object v1

    .line 172
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/U;

    if-nez v9, :cond_13

    new-instance v9, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-direct {v9, v10}, Lpc/U;-><init>(Lpe/d;)V

    .line 173
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v10, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    :cond_13
    new-instance v10, LCb/i$h0;

    invoke-direct {v10}, LCb/i$h0;-><init>()V

    .line 175
    invoke-direct {v6, v5, v1, v9, v10}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 176
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v1, "write"

    .line 178
    new-instance v5, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v6

    .line 179
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_14

    .line 181
    sget-object v9, LCb/i$i0;->a:LCb/i$i0;

    .line 182
    new-instance v10, Lpc/b;

    .line 183
    new-instance v11, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 184
    invoke-direct {v10, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v10

    .line 185
    :cond_14
    new-instance v10, Lkotlin/Pair;

    const-class v11, Lexpo/modules/kotlin/types/Either;

    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpc/b;

    if-nez v10, :cond_15

    .line 187
    sget-object v10, LCb/i$j0;->a:LCb/i$j0;

    .line 188
    new-instance v11, Lpc/b;

    .line 189
    new-instance v12, Lpc/M;

    const-class v14, Lexpo/modules/kotlin/types/Either;

    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 190
    invoke-direct {v11, v12, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v10, v11

    .line 191
    :cond_15
    new-instance v11, Lkotlin/Pair;

    const-class v12, Lexpo/modules/filesystem/WriteOptions;

    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-direct {v11, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/b;

    if-nez v11, :cond_16

    .line 193
    sget-object v11, LCb/i$F;->a:LCb/i$F;

    .line 194
    new-instance v12, Lpc/b;

    .line 195
    new-instance v14, Lpc/M;

    const-class v15, Lexpo/modules/filesystem/WriteOptions;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    move-object/from16 v17, v2

    const/4 v2, 0x1

    invoke-direct {v14, v15, v2, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 196
    invoke-direct {v12, v14, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v11, v12

    goto :goto_5

    :cond_16
    move-object/from16 v17, v2

    .line 197
    :goto_5
    filled-new-array {v9, v10, v11}, [Lpc/b;

    move-result-object v2

    .line 198
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_17

    new-instance v6, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 199
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v10

    invoke-interface {v9, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    :cond_17
    new-instance v9, LCb/i$G;

    invoke-direct {v9}, LCb/i$G;-><init>()V

    .line 201
    invoke-direct {v5, v1, v2, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 202
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    const-string v1, "text"

    .line 204
    const-class v2, LUb/u;

    move-object/from16 v5, v32

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 205
    new-instance v2, Ldc/f;

    const/4 v15, 0x0

    new-array v6, v15, [Lpc/b;

    .line 206
    new-instance v9, LCb/i$u;

    invoke-direct {v9}, LCb/i$u;-><init>()V

    .line 207
    invoke-direct {v2, v1, v6, v9}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v10, v30

    goto/16 :goto_7

    .line 208
    :cond_18
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v2

    .line 209
    new-instance v6, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_19

    .line 211
    sget-object v6, LCb/i$v;->a:LCb/i$v;

    .line 212
    new-instance v9, Lpc/b;

    .line 213
    new-instance v10, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v15, 0x0

    invoke-direct {v10, v11, v15, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 214
    invoke-direct {v9, v10, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 215
    :cond_19
    filled-new-array {v6}, [Lpc/b;

    move-result-object v2

    .line 216
    new-instance v6, LCb/i$w;

    invoke-direct {v6}, LCb/i$w;-><init>()V

    .line 217
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v10, v30

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    .line 218
    new-instance v9, Ldc/l;

    invoke-direct {v9, v1, v2, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    :goto_6
    move-object v2, v9

    goto :goto_7

    .line 219
    :cond_1a
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    .line 220
    new-instance v9, Ldc/h;

    invoke-direct {v9, v1, v2, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 221
    :cond_1b
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    .line 222
    new-instance v9, Ldc/i;

    invoke-direct {v9, v1, v2, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 223
    :cond_1c
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1d

    .line 224
    new-instance v9, Ldc/j;

    invoke-direct {v9, v1, v2, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 225
    :cond_1d
    invoke-static {v10, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1e

    .line 226
    new-instance v9, Ldc/n;

    invoke-direct {v9, v1, v2, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 227
    :cond_1e
    new-instance v9, Ldc/s;

    invoke-direct {v9, v1, v2, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 228
    :goto_7
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    const-string v1, "textSync"

    .line 230
    new-instance v2, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v6

    .line 231
    new-instance v9, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_1f

    .line 233
    sget-object v9, LCb/i$H;->a:LCb/i$H;

    .line 234
    new-instance v11, Lpc/b;

    .line 235
    new-instance v12, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 236
    invoke-direct {v11, v12, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    .line 237
    :cond_1f
    filled-new-array {v9}, [Lpc/b;

    move-result-object v6

    .line 238
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/U;

    if-nez v9, :cond_20

    new-instance v9, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 239
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    :cond_20
    new-instance v11, LCb/i$I;

    invoke-direct {v11}, LCb/i$I;-><init>()V

    .line 241
    invoke-direct {v2, v1, v6, v9, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 242
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    const-string v1, "base64"

    .line 244
    const-class v2, LUb/u;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 245
    new-instance v2, Ldc/f;

    const/4 v15, 0x0

    new-array v6, v15, [Lpc/b;

    .line 246
    new-instance v9, LCb/i$x;

    invoke-direct {v9}, LCb/i$x;-><init>()V

    .line 247
    invoke-direct {v2, v1, v6, v9}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_9

    .line 248
    :cond_21
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v2

    .line 249
    new-instance v6, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_22

    .line 251
    sget-object v6, LCb/i$y;->a:LCb/i$y;

    .line 252
    new-instance v9, Lpc/b;

    .line 253
    new-instance v11, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 254
    invoke-direct {v9, v11, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 255
    :cond_22
    filled-new-array {v6}, [Lpc/b;

    move-result-object v2

    .line 256
    new-instance v6, LCb/i$z;

    invoke-direct {v6}, LCb/i$z;-><init>()V

    .line 257
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    .line 258
    new-instance v9, Ldc/l;

    invoke-direct {v9, v1, v2, v6}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    :goto_8
    move-object v2, v9

    goto :goto_9

    .line 259
    :cond_23
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    .line 260
    new-instance v9, Ldc/h;

    invoke-direct {v9, v1, v2, v6}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 261
    :cond_24
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    .line 262
    new-instance v9, Ldc/i;

    invoke-direct {v9, v1, v2, v6}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 263
    :cond_25
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_26

    .line 264
    new-instance v9, Ldc/j;

    invoke-direct {v9, v1, v2, v6}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 265
    :cond_26
    invoke-static {v10, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_27

    .line 266
    new-instance v9, Ldc/n;

    invoke-direct {v9, v1, v2, v6}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 267
    :cond_27
    new-instance v9, Ldc/s;

    invoke-direct {v9, v1, v2, v6}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 268
    :goto_9
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    const-string v1, "base64Sync"

    .line 270
    new-instance v2, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v6

    .line 271
    new-instance v9, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_28

    .line 273
    sget-object v9, LCb/i$J;->a:LCb/i$J;

    .line 274
    new-instance v11, Lpc/b;

    .line 275
    new-instance v12, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 276
    invoke-direct {v11, v12, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    .line 277
    :cond_28
    filled-new-array {v9}, [Lpc/b;

    move-result-object v6

    .line 278
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/U;

    if-nez v9, :cond_29

    new-instance v9, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 279
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    :cond_29
    new-instance v11, LCb/i$K;

    invoke-direct {v11}, LCb/i$K;-><init>()V

    .line 281
    invoke-direct {v2, v1, v6, v9, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 282
    invoke-virtual {v3}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const-string v1, "bytes"

    .line 284
    const-class v2, LUb/u;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-class v6, [B

    if-eqz v2, :cond_2a

    .line 285
    :try_start_2
    new-instance v2, Ldc/f;

    const/4 v15, 0x0

    new-array v9, v15, [Lpc/b;

    .line 286
    new-instance v11, LCb/i$A;

    invoke-direct {v11}, LCb/i$A;-><init>()V

    .line 287
    invoke-direct {v2, v1, v9, v11}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_b

    .line 288
    :cond_2a
    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v2

    .line 289
    new-instance v9, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_2b

    .line 291
    sget-object v9, LCb/i$B;->a:LCb/i$B;

    .line 292
    new-instance v11, Lpc/b;

    .line 293
    new-instance v12, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 294
    invoke-direct {v11, v12, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    .line 295
    :cond_2b
    filled-new-array {v9}, [Lpc/b;

    move-result-object v2

    .line 296
    new-instance v9, LCb/i$C;

    invoke-direct {v9}, LCb/i$C;-><init>()V

    .line 297
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2c

    .line 298
    new-instance v11, Ldc/l;

    invoke-direct {v11, v1, v2, v9}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    :goto_a
    move-object v2, v11

    goto :goto_b

    .line 299
    :cond_2c
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2d

    .line 300
    new-instance v11, Ldc/h;

    invoke-direct {v11, v1, v2, v9}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 301
    :cond_2d
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2e

    .line 302
    new-instance v11, Ldc/i;

    invoke-direct {v11, v1, v2, v9}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 303
    :cond_2e
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2f

    .line 304
    new-instance v11, Ldc/j;

    invoke-direct {v11, v1, v2, v9}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 305
    :cond_2f
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_30

    .line 306
    new-instance v11, Ldc/n;

    invoke-direct {v11, v1, v2, v9}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 307
    :cond_30
    new-instance v11, Ldc/s;

    invoke-direct {v11, v1, v2, v9}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    goto :goto_a

    .line 308
    :goto_b
    invoke-virtual {v3}, Lhc/f;->k()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    const-string v1, "bytesSync"

    .line 310
    new-instance v2, Ldc/r;

    invoke-virtual {v3}, Lhc/f;->m()Lpc/X;

    move-result-object v9

    .line 311
    new-instance v11, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-direct {v11, v12, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 312
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/b;

    if-nez v11, :cond_31

    .line 313
    sget-object v11, LCb/i$L;->a:LCb/i$L;

    .line 314
    new-instance v12, Lpc/b;

    .line 315
    new-instance v14, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    move-object/from16 v33, v3

    const/4 v3, 0x0

    invoke-direct {v14, v15, v3, v11}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 316
    invoke-direct {v12, v14, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v11, v12

    goto :goto_c

    :cond_31
    move-object/from16 v33, v3

    .line 317
    :goto_c
    filled-new-array {v11}, [Lpc/b;

    move-result-object v3

    .line 318
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/U;

    if-nez v9, :cond_32

    new-instance v9, Lpc/U;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11}, Lpc/U;-><init>(Lpe/d;)V

    .line 319
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    :cond_32
    new-instance v11, LCb/i$M;

    invoke-direct {v11}, LCb/i$M;-><init>()V

    .line 321
    invoke-direct {v2, v1, v3, v9, v11}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 322
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    new-instance v1, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v2

    .line 324
    new-instance v3, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v3, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 325
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/b;

    if-nez v3, :cond_33

    .line 326
    sget-object v3, LCb/i$N;->a:LCb/i$N;

    .line 327
    new-instance v9, Lpc/b;

    .line 328
    new-instance v11, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v15, 0x0

    invoke-direct {v11, v12, v15, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 329
    invoke-direct {v9, v11, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v3, v9

    .line 330
    :cond_33
    new-instance v9, Lkotlin/Pair;

    const-class v11, Lexpo/modules/filesystem/InfoOptions;

    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 331
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_34

    .line 332
    sget-object v9, LCb/i$O;->a:LCb/i$O;

    .line 333
    new-instance v11, Lpc/b;

    .line 334
    new-instance v12, Lpc/M;

    const-class v14, Lexpo/modules/filesystem/InfoOptions;

    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v12, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 335
    invoke-direct {v11, v12, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    .line 336
    :cond_34
    filled-new-array {v3, v9}, [Lpc/b;

    move-result-object v2

    .line 337
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v3

    const-class v9, Lexpo/modules/filesystem/FileInfo;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/U;

    if-nez v3, :cond_35

    new-instance v3, Lpc/U;

    const-class v9, Lexpo/modules/filesystem/FileInfo;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v3, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 338
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    const-class v11, Lexpo/modules/filesystem/FileInfo;

    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    :cond_35
    new-instance v9, LCb/i$Q;

    invoke-direct {v9}, LCb/i$Q;-><init>()V

    .line 340
    invoke-direct {v1, v7, v2, v3, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 341
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    const-string v1, "exists"

    .line 343
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 344
    new-instance v3, Ldc/r;

    new-instance v9, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v11

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9}, [Lpc/b;

    move-result-object v9

    .line 345
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-interface {v11, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/U;

    if-nez v11, :cond_36

    new-instance v11, Lpc/U;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-direct {v11, v14}, Lpc/U;-><init>(Lpe/d;)V

    .line 346
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v14

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    invoke-interface {v14, v15, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    :cond_36
    new-instance v14, LCb/i$k0;

    invoke-direct {v14}, LCb/i$k0;-><init>()V

    move-object/from16 v15, v29

    .line 348
    invoke-direct {v3, v15, v9, v11, v14}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 349
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v9

    invoke-virtual {v3, v9}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 350
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 351
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 352
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    const-string v1, "modificationTime"

    .line 354
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 355
    new-instance v3, Ldc/r;

    new-instance v9, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9}, [Lpc/b;

    move-result-object v9

    .line 356
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-interface {v11, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/U;

    if-nez v11, :cond_37

    new-instance v11, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-direct {v11, v14}, Lpc/U;-><init>(Lpe/d;)V

    .line 357
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v14

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v14, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    :cond_37
    new-instance v12, LCb/i$l0;

    invoke-direct {v12}, LCb/i$l0;-><init>()V

    .line 359
    invoke-direct {v3, v15, v9, v11, v12}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 360
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v9

    invoke-virtual {v3, v9}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 361
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 362
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 363
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    const-string v1, "creationTime"

    .line 365
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 366
    new-instance v3, Ldc/r;

    new-instance v9, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v11

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9}, [Lpc/b;

    move-result-object v9

    .line 367
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpc/U;

    if-nez v11, :cond_38

    new-instance v11, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    invoke-direct {v11, v12}, Lpc/U;-><init>(Lpe/d;)V

    .line 368
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v12

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-interface {v12, v14, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    :cond_38
    new-instance v12, LCb/i$m0;

    invoke-direct {v12}, LCb/i$m0;-><init>()V

    .line 370
    invoke-direct {v3, v15, v9, v11, v12}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 371
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v9

    invoke-virtual {v3, v9}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 372
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 373
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 374
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    const-string v1, "copy"

    .line 376
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 377
    new-instance v9, Lkotlin/Pair;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 378
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_39

    .line 379
    sget-object v9, LCb/i$R;->a:LCb/i$R;

    .line 380
    new-instance v11, Lpc/b;

    .line 381
    new-instance v12, Lpc/M;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    move-object/from16 v32, v5

    const/4 v5, 0x0

    invoke-direct {v12, v14, v5, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 382
    invoke-direct {v11, v12, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    goto :goto_d

    :cond_39
    move-object/from16 v32, v5

    .line 383
    :goto_d
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v5, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 384
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_3a

    .line 385
    sget-object v5, LCb/i$S;->a:LCb/i$S;

    .line 386
    new-instance v11, Lpc/b;

    .line 387
    new-instance v12, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    move-object/from16 v29, v6

    const/4 v6, 0x0

    invoke-direct {v12, v14, v6, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 388
    invoke-direct {v11, v12, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v11

    goto :goto_e

    :cond_3a
    move-object/from16 v29, v6

    .line 389
    :goto_e
    filled-new-array {v9, v5}, [Lpc/b;

    move-result-object v3

    .line 390
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_3b

    new-instance v5, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 391
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    :cond_3b
    new-instance v6, LCb/i$T;

    invoke-direct {v6}, LCb/i$T;-><init>()V

    .line 393
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 394
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    const-string v1, "move"

    .line 396
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 397
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 398
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_3c

    .line 399
    sget-object v5, LCb/i$U;->a:LCb/i$U;

    .line 400
    new-instance v6, Lpc/b;

    .line 401
    new-instance v9, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 402
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 403
    :cond_3c
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 404
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_3d

    .line 405
    sget-object v6, LCb/i$V;->a:LCb/i$V;

    .line 406
    new-instance v9, Lpc/b;

    .line 407
    new-instance v11, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 408
    invoke-direct {v9, v11, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 409
    :cond_3d
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 410
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_3e

    new-instance v5, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 411
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    :cond_3e
    new-instance v6, LCb/i$W;

    invoke-direct {v6}, LCb/i$W;-><init>()V

    .line 413
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 414
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    const-string v1, "rename"

    .line 416
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 417
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 418
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_3f

    .line 419
    sget-object v5, LCb/i$X;->a:LCb/i$X;

    .line 420
    new-instance v6, Lpc/b;

    .line 421
    new-instance v9, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 422
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 423
    :cond_3f
    new-instance v6, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 424
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_40

    .line 425
    sget-object v6, LCb/i$Y;->a:LCb/i$Y;

    .line 426
    new-instance v9, Lpc/b;

    .line 427
    new-instance v11, Lpc/M;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 428
    invoke-direct {v9, v11, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 429
    :cond_40
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 430
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_41

    new-instance v5, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 431
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    :cond_41
    new-instance v6, LCb/i$Z;

    invoke-direct {v6}, LCb/i$Z;-><init>()V

    .line 433
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 434
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    const-string v1, "uri"

    .line 436
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 437
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 438
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_42

    new-instance v6, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 439
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    :cond_42
    new-instance v9, LCb/i$n0;

    invoke-direct {v9}, LCb/i$n0;-><init>()V

    .line 441
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 442
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 443
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 444
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 445
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    const-string v1, "contentUri"

    .line 447
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 448
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 449
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_43

    new-instance v6, Lpc/U;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 450
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    :cond_43
    new-instance v9, LCb/i$o0;

    invoke-direct {v9}, LCb/i$o0;-><init>()V

    .line 452
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 453
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 454
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 455
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 456
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    const-string v1, "md5"

    .line 458
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 459
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 460
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_44

    new-instance v6, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 461
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    :cond_44
    new-instance v9, LCb/i$p0;

    invoke-direct {v9}, LCb/i$p0;-><init>()V

    .line 463
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 464
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 465
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 466
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 467
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    const-string v1, "size"

    .line 469
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 470
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 471
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_45

    new-instance v6, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 472
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    :cond_45
    new-instance v9, LCb/i$q0;

    invoke-direct {v9}, LCb/i$q0;-><init>()V

    .line 474
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 475
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 476
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 477
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 478
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    const-string v1, "type"

    .line 480
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 481
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 482
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_46

    new-instance v6, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 483
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    :cond_46
    new-instance v9, LCb/i$r0;

    invoke-direct {v9}, LCb/i$r0;-><init>()V

    .line 485
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 486
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 487
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 488
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 489
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    const-string v1, "open"

    .line 491
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 492
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 493
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_47

    .line 494
    sget-object v5, LCb/i$b0;->a:LCb/i$b0;

    .line 495
    new-instance v6, Lpc/b;

    .line 496
    new-instance v9, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 497
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 498
    :cond_47
    filled-new-array {v5}, [Lpc/b;

    move-result-object v3

    .line 499
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_48

    new-instance v5, Lpc/U;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 500
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    :cond_48
    new-instance v6, LCb/i$c0;

    invoke-direct {v6}, LCb/i$c0;-><init>()V

    .line 502
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 503
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    invoke-virtual/range {v17 .. v17}, Lgc/a;->v()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {v33 .. v33}, LYb/c;->v()LYb/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v36

    .line 506
    new-instance v33, LYb/c;

    .line 507
    invoke-virtual/range {v17 .. v17}, Lgc/a;->x()Lgc/c;

    move-result-object v1

    if-eqz v1, :cond_7a

    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    move-result-object v34

    .line 508
    invoke-static/range {v36 .. v36}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-direct {v2, v3, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 510
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpc/b;

    if-nez v2, :cond_49

    .line 511
    sget-object v2, LCb/i$c;->a:LCb/i$c;

    .line 512
    new-instance v3, Lpc/b;

    .line 513
    new-instance v5, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v14, 0x0

    .line 514
    invoke-direct {v3, v5, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object/from16 v37, v3

    goto :goto_f

    :cond_49
    move-object/from16 v37, v2

    .line 515
    :goto_f
    invoke-virtual/range {v17 .. v17}, Lhc/f;->m()Lpc/X;

    move-result-object v38

    move-object/from16 v35, v1

    .line 516
    invoke-direct/range {v33 .. v38}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    move-object/from16 v1, v33

    .line 517
    new-instance v2, Ldc/r;

    const-string v3, "constructor"

    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    move-result-object v5

    .line 518
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 519
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_4a

    .line 520
    sget-object v6, LCb/i$s0;->a:LCb/i$s0;

    .line 521
    new-instance v9, Lpc/b;

    .line 522
    new-instance v11, Lpc/M;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 523
    invoke-direct {v9, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 524
    :cond_4a
    filled-new-array {v6}, [Lpc/b;

    move-result-object v5

    .line 525
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_4b

    new-instance v6, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 526
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    :cond_4b
    new-instance v9, LCb/i$t0;

    invoke-direct {v9}, LCb/i$t0;-><init>()V

    .line 528
    invoke-direct {v2, v3, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 529
    invoke-virtual {v1, v2}, LYb/c;->B(Ldc/r;)V

    .line 530
    const-string v2, "readBytes"

    .line 531
    new-instance v3, Ldc/r;

    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    move-result-object v5

    .line 532
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 533
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_4c

    .line 534
    sget-object v6, LCb/i$u0;->a:LCb/i$u0;

    .line 535
    new-instance v9, Lpc/b;

    .line 536
    new-instance v11, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 537
    invoke-direct {v9, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 538
    :cond_4c
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-direct {v9, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 539
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpc/b;

    if-nez v9, :cond_4d

    .line 540
    sget-object v9, LCb/i$v0;->a:LCb/i$v0;

    .line 541
    new-instance v11, Lpc/b;

    .line 542
    new-instance v12, Lpc/M;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    move-object/from16 v33, v1

    const/4 v1, 0x0

    invoke-direct {v12, v14, v1, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 543
    invoke-direct {v11, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v9, v11

    goto :goto_10

    :cond_4d
    move-object/from16 v33, v1

    .line 544
    :goto_10
    filled-new-array {v6, v9}, [Lpc/b;

    move-result-object v1

    .line 545
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_4e

    new-instance v5, Lpc/U;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 546
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    :cond_4e
    new-instance v6, LCb/i$w0;

    invoke-direct {v6}, LCb/i$w0;-><init>()V

    .line 548
    invoke-direct {v3, v2, v1, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 549
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    const-string v1, "writeBytes"

    .line 551
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 552
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 553
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_4f

    .line 554
    sget-object v5, LCb/i$x0;->a:LCb/i$x0;

    .line 555
    new-instance v6, Lpc/b;

    .line 556
    new-instance v9, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 557
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 558
    :cond_4f
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 559
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_50

    .line 560
    sget-object v6, LCb/i$y0;->a:LCb/i$y0;

    .line 561
    new-instance v9, Lpc/b;

    .line 562
    new-instance v11, Lpc/M;

    invoke-static/range {v29 .. v29}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 563
    invoke-direct {v9, v11, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 564
    :cond_50
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v3

    .line 565
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_51

    new-instance v5, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 566
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    :cond_51
    new-instance v6, LCb/i$z0;

    invoke-direct {v6}, LCb/i$z0;-><init>()V

    .line 568
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 569
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    const-string v1, "close"

    .line 571
    new-instance v2, Ldc/r;

    invoke-virtual/range {v33 .. v33}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 572
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 573
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_52

    .line 574
    sget-object v5, LCb/i$A0;->a:LCb/i$A0;

    .line 575
    new-instance v6, Lpc/b;

    .line 576
    new-instance v9, Lpc/M;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v14, 0x0

    invoke-direct {v9, v11, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 577
    invoke-direct {v6, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 578
    :cond_52
    filled-new-array {v5}, [Lpc/b;

    move-result-object v3

    .line 579
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_53

    new-instance v5, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 580
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    :cond_53
    new-instance v6, LCb/i$B0;

    invoke-direct {v6}, LCb/i$B0;-><init>()V

    .line 582
    invoke-direct {v2, v1, v3, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 583
    invoke-virtual/range {v33 .. v33}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    const-string v1, "offset"

    .line 585
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 586
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 587
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_54

    new-instance v6, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 588
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    :cond_54
    new-instance v9, LCb/i$C0;

    invoke-direct {v9}, LCb/i$C0;-><init>()V

    .line 590
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 591
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 592
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 593
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 594
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    new-instance v1, Ldc/r;

    const-string v3, "set"

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 596
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 597
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_55

    .line 598
    sget-object v6, LCb/i$E0;->a:LCb/i$E0;

    .line 599
    new-instance v9, Lpc/b;

    .line 600
    new-instance v11, Lpc/M;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v14, 0x0

    .line 601
    invoke-direct {v9, v11, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v9

    .line 602
    :cond_55
    filled-new-array {v5, v6}, [Lpc/b;

    move-result-object v5

    .line 603
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_56

    new-instance v6, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 604
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    :cond_56
    new-instance v9, LCb/i$F0;

    invoke-direct {v9}, LCb/i$F0;-><init>()V

    .line 606
    invoke-direct {v1, v3, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 607
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 608
    invoke-virtual {v1, v9}, Ldc/a;->k(Z)V

    .line 609
    invoke-virtual {v2, v1}, Lhc/l;->c(Ldc/r;)V

    .line 610
    const-string v1, "size"

    .line 611
    new-instance v2, Lhc/m;

    invoke-virtual/range {v33 .. v33}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 612
    new-instance v3, Ldc/r;

    new-instance v5, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v6

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5}, [Lpc/b;

    move-result-object v5

    .line 613
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/U;

    if-nez v6, :cond_57

    new-instance v6, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lpc/U;-><init>(Lpe/d;)V

    .line 614
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    invoke-interface {v9, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    :cond_57
    new-instance v9, LCb/i$D0;

    invoke-direct {v9}, LCb/i$D0;-><init>()V

    .line 616
    invoke-direct {v3, v15, v5, v6, v9}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 617
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 618
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 619
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 620
    invoke-virtual/range {v33 .. v33}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    invoke-virtual/range {v17 .. v17}, Lgc/a;->v()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {v33 .. v33}, LYb/c;->v()LYb/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 622
    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v36

    .line 623
    new-instance v33, LYb/c;

    .line 624
    invoke-virtual/range {v17 .. v17}, Lgc/a;->x()Lgc/c;

    move-result-object v1

    if-eqz v1, :cond_79

    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    move-result-object v34

    .line 625
    invoke-static/range {v36 .. v36}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 626
    new-instance v0, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    invoke-direct {v0, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 627
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpc/b;

    if-nez v0, :cond_58

    .line 628
    sget-object v0, LCb/i$d;->a:LCb/i$d;

    .line 629
    new-instance v2, Lpc/b;

    .line 630
    new-instance v3, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    const/4 v14, 0x0

    invoke-direct {v3, v4, v14, v0}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    const/4 v14, 0x0

    .line 631
    invoke-direct {v2, v3, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object/from16 v37, v2

    goto :goto_11

    :cond_58
    move-object/from16 v37, v0

    .line 632
    :goto_11
    invoke-virtual/range {v17 .. v17}, Lhc/f;->m()Lpc/X;

    move-result-object v38

    move-object/from16 v35, v1

    .line 633
    invoke-direct/range {v33 .. v38}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    move-object/from16 v0, v33

    .line 634
    new-instance v1, Ldc/r;

    const-string v2, "constructor"

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 635
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 636
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_59

    .line 637
    sget-object v4, LCb/i$G0;->a:LCb/i$G0;

    .line 638
    new-instance v5, Lpc/b;

    .line 639
    new-instance v6, Lpc/M;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v6, v9, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 640
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 641
    :cond_59
    filled-new-array {v4}, [Lpc/b;

    move-result-object v3

    .line 642
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_5a

    new-instance v4, Lpc/U;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 643
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    :cond_5a
    new-instance v5, LCb/i$H0;

    invoke-direct {v5}, LCb/i$H0;-><init>()V

    .line 645
    invoke-direct {v1, v2, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 646
    invoke-virtual {v0, v1}, LYb/c;->B(Ldc/r;)V

    .line 647
    new-instance v1, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v2

    .line 648
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-direct {v3, v4, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 649
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/b;

    if-nez v3, :cond_5b

    .line 650
    sget-object v3, LCb/i$S0;->a:LCb/i$S0;

    .line 651
    new-instance v4, Lpc/b;

    .line 652
    new-instance v5, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    const/4 v14, 0x0

    invoke-direct {v5, v6, v14, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 653
    invoke-direct {v4, v5, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v3, v4

    .line 654
    :cond_5b
    filled-new-array {v3}, [Lpc/b;

    move-result-object v2

    .line 655
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v3

    const-class v4, Lexpo/modules/filesystem/DirectoryInfo;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpc/U;

    if-nez v3, :cond_5c

    new-instance v3, Lpc/U;

    const-class v4, Lexpo/modules/filesystem/DirectoryInfo;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-direct {v3, v4}, Lpc/U;-><init>(Lpe/d;)V

    .line 656
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    const-class v5, Lexpo/modules/filesystem/DirectoryInfo;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    :cond_5c
    new-instance v4, LCb/i$b1;

    invoke-direct {v4}, LCb/i$b1;-><init>()V

    .line 658
    invoke-direct {v1, v7, v2, v3, v4}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 659
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    const-string v1, "delete"

    .line 661
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 662
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 663
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_5d

    .line 664
    sget-object v4, LCb/i$c1;->a:LCb/i$c1;

    .line 665
    new-instance v5, Lpc/b;

    .line 666
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 667
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 668
    :cond_5d
    filled-new-array {v4}, [Lpc/b;

    move-result-object v3

    .line 669
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_5e

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 670
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    :cond_5e
    new-instance v5, LCb/i$d1;

    invoke-direct {v5}, LCb/i$d1;-><init>()V

    .line 672
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 673
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    const-string v1, "create"

    .line 675
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 676
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 677
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_5f

    .line 678
    sget-object v4, LCb/i$e1;->a:LCb/i$e1;

    .line 679
    new-instance v5, Lpc/b;

    .line 680
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 681
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 682
    :cond_5f
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 683
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_60

    .line 684
    sget-object v5, LCb/i$f1;->a:LCb/i$f1;

    .line 685
    new-instance v6, Lpc/b;

    .line 686
    new-instance v7, Lpc/M;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v11, 0x1

    invoke-direct {v7, v9, v11, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 687
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 688
    :cond_60
    filled-new-array {v4, v5}, [Lpc/b;

    move-result-object v3

    .line 689
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_61

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 690
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    :cond_61
    new-instance v5, LCb/i$g1;

    invoke-direct {v5}, LCb/i$g1;-><init>()V

    .line 692
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 693
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    const-string v1, "createDirectory"

    .line 695
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 696
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 697
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_62

    .line 698
    sget-object v4, LCb/i$h1;->a:LCb/i$h1;

    .line 699
    new-instance v5, Lpc/b;

    .line 700
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 701
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 702
    :cond_62
    new-instance v5, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 703
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_63

    .line 704
    sget-object v5, LCb/i$i1;->a:LCb/i$i1;

    .line 705
    new-instance v6, Lpc/b;

    .line 706
    new-instance v7, Lpc/M;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 707
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 708
    :cond_63
    filled-new-array {v4, v5}, [Lpc/b;

    move-result-object v3

    .line 709
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_64

    new-instance v4, Lpc/U;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 710
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    :cond_64
    new-instance v5, LCb/i$I0;

    invoke-direct {v5}, LCb/i$I0;-><init>()V

    .line 712
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 713
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    const-string v1, "createFile"

    .line 715
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 716
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 717
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_65

    .line 718
    sget-object v4, LCb/i$J0;->a:LCb/i$J0;

    .line 719
    new-instance v5, Lpc/b;

    .line 720
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 721
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 722
    :cond_65
    new-instance v5, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 723
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_66

    .line 724
    sget-object v5, LCb/i$K0;->a:LCb/i$K0;

    .line 725
    new-instance v6, Lpc/b;

    .line 726
    new-instance v7, Lpc/M;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 727
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 728
    :cond_66
    new-instance v6, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-direct {v6, v7, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 729
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpc/b;

    if-nez v6, :cond_67

    .line 730
    sget-object v6, LCb/i$L0;->a:LCb/i$L0;

    .line 731
    new-instance v7, Lpc/b;

    .line 732
    new-instance v9, Lpc/M;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v11

    const/4 v12, 0x1

    invoke-direct {v9, v11, v12, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 733
    invoke-direct {v7, v9, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v6, v7

    .line 734
    :cond_67
    filled-new-array {v4, v5, v6}, [Lpc/b;

    move-result-object v3

    .line 735
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_68

    new-instance v4, Lpc/U;

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 736
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    :cond_68
    new-instance v5, LCb/i$M0;

    invoke-direct {v5}, LCb/i$M0;-><init>()V

    .line 738
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 739
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    const-string v1, "exists"

    .line 741
    new-instance v2, Lhc/m;

    invoke-virtual {v0}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 742
    new-instance v3, Ldc/r;

    new-instance v4, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v4, v5, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v4}, [Lpc/b;

    move-result-object v4

    .line 743
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_69

    new-instance v5, Lpc/U;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 744
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    :cond_69
    new-instance v6, LCb/i$j1;

    invoke-direct {v6}, LCb/i$j1;-><init>()V

    .line 746
    invoke-direct {v3, v15, v4, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 747
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 748
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 749
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 750
    invoke-virtual {v0}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 751
    const-string v1, "validatePath"

    .line 752
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 753
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 754
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_6a

    .line 755
    sget-object v4, LCb/i$N0;->a:LCb/i$N0;

    .line 756
    new-instance v5, Lpc/b;

    .line 757
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 758
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 759
    :cond_6a
    filled-new-array {v4}, [Lpc/b;

    move-result-object v3

    .line 760
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_6b

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 761
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    :cond_6b
    new-instance v5, LCb/i$O0;

    invoke-direct {v5}, LCb/i$O0;-><init>()V

    .line 763
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 764
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    const-string v1, "copy"

    .line 766
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 767
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 768
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_6c

    .line 769
    sget-object v4, LCb/i$P0;->a:LCb/i$P0;

    .line 770
    new-instance v5, Lpc/b;

    .line 771
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 772
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 773
    :cond_6c
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 774
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_6d

    .line 775
    sget-object v5, LCb/i$Q0;->a:LCb/i$Q0;

    .line 776
    new-instance v6, Lpc/b;

    .line 777
    new-instance v7, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 778
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 779
    :cond_6d
    filled-new-array {v4, v5}, [Lpc/b;

    move-result-object v3

    .line 780
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_6e

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 781
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    :cond_6e
    new-instance v5, LCb/i$R0;

    invoke-direct {v5}, LCb/i$R0;-><init>()V

    .line 783
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 784
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    const-string v1, "move"

    .line 786
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 787
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 788
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_6f

    .line 789
    sget-object v4, LCb/i$T0;->a:LCb/i$T0;

    .line 790
    new-instance v5, Lpc/b;

    .line 791
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 792
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 793
    :cond_6f
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 794
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_70

    .line 795
    sget-object v5, LCb/i$U0;->a:LCb/i$U0;

    .line 796
    new-instance v6, Lpc/b;

    .line 797
    new-instance v7, Lpc/M;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 798
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 799
    :cond_70
    filled-new-array {v4, v5}, [Lpc/b;

    move-result-object v3

    .line 800
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_71

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 801
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    :cond_71
    new-instance v5, LCb/i$V0;

    invoke-direct {v5}, LCb/i$V0;-><init>()V

    .line 803
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 804
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    const-string v1, "rename"

    .line 806
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 807
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 808
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_72

    .line 809
    sget-object v4, LCb/i$W0;->a:LCb/i$W0;

    .line 810
    new-instance v5, Lpc/b;

    .line 811
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 812
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 813
    :cond_72
    new-instance v5, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 814
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/b;

    if-nez v5, :cond_73

    .line 815
    sget-object v5, LCb/i$X0;->a:LCb/i$X0;

    .line 816
    new-instance v6, Lpc/b;

    .line 817
    new-instance v7, Lpc/M;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v9

    const/4 v14, 0x0

    invoke-direct {v7, v9, v14, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 818
    invoke-direct {v6, v7, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v5, v6

    .line 819
    :cond_73
    filled-new-array {v4, v5}, [Lpc/b;

    move-result-object v3

    .line 820
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_74

    new-instance v4, Lpc/U;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 821
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    :cond_74
    new-instance v5, LCb/i$Y0;

    invoke-direct {v5}, LCb/i$Y0;-><init>()V

    .line 823
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 824
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    const-string v1, "uri"

    .line 826
    new-instance v2, Lhc/m;

    invoke-virtual {v0}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 827
    new-instance v3, Ldc/r;

    new-instance v4, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v4, v5, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v4}, [Lpc/b;

    move-result-object v4

    .line 828
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_75

    new-instance v5, Lpc/U;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 829
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    :cond_75
    new-instance v6, LCb/i$k1;

    invoke-direct {v6}, LCb/i$k1;-><init>()V

    .line 831
    invoke-direct {v3, v15, v4, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 832
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 833
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 834
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 835
    invoke-virtual {v0}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    const-string v1, "size"

    .line 837
    new-instance v2, Lhc/m;

    invoke-virtual {v0}, LYb/c;->y()Lpc/b;

    move-result-object v3

    invoke-virtual {v3}, Lpc/b;->g()Lpe/q;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 838
    new-instance v3, Ldc/r;

    new-instance v4, Lpc/b;

    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v5

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v4, v5, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v4}, [Lpc/b;

    move-result-object v4

    .line 839
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpc/U;

    if-nez v5, :cond_76

    new-instance v5, Lpc/U;

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-direct {v5, v6}, Lpc/U;-><init>(Lpe/d;)V

    .line 840
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    :cond_76
    new-instance v6, LCb/i$l1;

    invoke-direct {v6}, LCb/i$l1;-><init>()V

    .line 842
    invoke-direct {v3, v15, v4, v5, v6}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 843
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldc/a;->l(Lpe/q;)V

    const/4 v9, 0x1

    .line 844
    invoke-virtual {v3, v9}, Ldc/a;->k(Z)V

    .line 845
    invoke-virtual {v2, v3}, Lhc/l;->b(Ldc/r;)V

    .line 846
    invoke-virtual {v0}, Lhc/f;->o()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    const-string v1, "listAsRecords"

    .line 848
    new-instance v2, Ldc/r;

    invoke-virtual {v0}, Lhc/f;->m()Lpc/X;

    move-result-object v3

    .line 849
    new-instance v4, Lkotlin/Pair;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 850
    invoke-virtual/range {v26 .. v26}, Lpc/d;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/b;

    if-nez v4, :cond_77

    .line 851
    sget-object v4, LCb/i$Z0;->a:LCb/i$Z0;

    .line 852
    new-instance v5, Lpc/b;

    .line 853
    new-instance v6, Lpc/M;

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    const/4 v14, 0x0

    invoke-direct {v6, v7, v14, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 854
    invoke-direct {v5, v6, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    move-object v4, v5

    .line 855
    :cond_77
    filled-new-array {v4}, [Lpc/b;

    move-result-object v3

    .line 856
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v4

    const-class v5, Ljava/util/List;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpc/U;

    if-nez v4, :cond_78

    new-instance v4, Lpc/U;

    const-class v5, Ljava/util/List;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 857
    invoke-virtual/range {v23 .. v23}, Lpc/V;->a()Ljava/util/Map;

    move-result-object v5

    const-class v6, Ljava/util/List;

    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    :cond_78
    new-instance v5, LCb/i$a1;

    invoke-direct {v5}, LCb/i$a1;-><init>()V

    .line 859
    invoke-direct {v2, v1, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 860
    invoke-virtual {v0}, Lhc/f;->p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 861
    invoke-virtual/range {v17 .. v17}, Lgc/a;->v()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, LYb/c;->v()LYb/d;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 862
    invoke-virtual/range {v17 .. v17}, Lgc/a;->u()Lgc/e;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 863
    invoke-static {}, LX3/a;->f()V

    return-object v0

    .line 864
    :cond_79
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 865
    :cond_7a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 866
    :cond_7b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 867
    :goto_12
    invoke-static {}, LX3/a;->f()V

    throw v0
.end method
