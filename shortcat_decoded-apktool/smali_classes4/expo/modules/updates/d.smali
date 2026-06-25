.class public final Lexpo/modules/updates/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/d$a;,
        Lexpo/modules/updates/d$b;
    }
.end annotation


# static fields
.field public static final u:Lexpo/modules/updates/d$b;

.field private static final v:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/net/Uri;

.field private final c:Landroid/net/Uri;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Lexpo/modules/updates/d$a;

.field private final g:Z

.field private final h:Z

.field private final i:Ljava/util/Map;

.field private final j:Ljava/util/Map;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/util/Map;

.field private final m:Z

.field private final n:Z

.field private final o:Z

.field private final p:Z

.field private final q:Z

.field private final r:Z

.field private final s:Ljava/util/Map;

.field private final t:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/updates/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/updates/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/updates/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/updates/d;->v:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 2

    .line 22
    sget-object v0, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    invoke-static {v0, p1, p2}, Lexpo/modules/updates/d$b;->a(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Z

    move-result v0

    if-eqz p1, :cond_0

    .line 23
    sget-object v1, Lexpo/modules/updates/e;->c:Lexpo/modules/updates/e$a;

    invoke-virtual {v1, p1}, Lexpo/modules/updates/e$a;->b(Landroid/content/Context;)Lexpo/modules/updates/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-direct {p0, p1, p2, v0, v1}, Lexpo/modules/updates/d;-><init>(Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)V
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    .line 25
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/16 v6, 0x80

    const-string v7, " provided for key "

    const-string v8, "UpdatesConfiguration failed to initialize: bad value of type "

    const-class v9, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 26
    const-string v11, "scopeKey"

    invoke-interface {v1, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    const/4 v12, 0x0

    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 28
    instance-of v13, v12, Ljava/lang/String;

    if-eqz v13, :cond_1

    .line 29
    :goto_0
    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_8

    goto :goto_1

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v11

    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 32
    const-string v12, "expo.modules.updates.EXPO_SCOPE_KEY"

    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_4

    :cond_3
    const/4 v12, 0x0

    goto :goto_3

    .line 33
    :cond_4
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v13

    .line 34
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :goto_2
    move-object v12, v11

    goto :goto_3

    .line 35
    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_2

    .line 36
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_2

    .line 37
    :cond_7
    invoke-virtual {v11, v12}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_2

    .line 38
    :cond_8
    :goto_3
    sget-object v11, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    invoke-static {v11, v0, v1, v2, v3}, Lexpo/modules/updates/d$b;->h(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)Landroid/net/Uri;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 39
    invoke-static {v12, v13}, Lnd/e;->a(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v12

    .line 40
    invoke-static {v11, v0, v1, v2, v3}, Lexpo/modules/updates/d$b;->h(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)Landroid/net/Uri;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 41
    invoke-static {v11, v0, v1}, Lexpo/modules/updates/d$b;->d(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 42
    invoke-static {v11, v0, v1}, Lexpo/modules/updates/d$b;->g(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    if-eqz v1, :cond_b

    .line 43
    const-string v10, "launchWaitMs"

    invoke-interface {v1, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_9

    const/4 v15, 0x0

    goto :goto_4

    .line 44
    :cond_9
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 45
    instance-of v6, v15, Ljava/lang/Integer;

    if-eqz v6, :cond_a

    .line 46
    :goto_4
    check-cast v15, Ljava/lang/Integer;

    if-eqz v15, :cond_b

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object/from16 v19, v4

    goto/16 :goto_7

    .line 47
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v15}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_b
    if-eqz v0, :cond_10

    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/16 v15, 0x80

    invoke-virtual {v6, v10, v15}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 49
    const-string v10, "expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS"

    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_c

    goto :goto_5

    .line 50
    :cond_c
    const-class v15, Ljava/lang/Integer;

    invoke-static {v15}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    move-object/from16 v19, v4

    .line 51
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_6

    .line 52
    :cond_d
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_6

    .line 53
    :cond_e
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_6

    .line 54
    :cond_f
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_6

    :cond_10
    :goto_5
    move-object/from16 v19, v4

    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_11

    .line 55
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_7

    :cond_11
    const/4 v6, 0x0

    :goto_7
    if-eqz v1, :cond_15

    .line 56
    const-string v4, "checkOnLaunch"

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    const/4 v10, 0x0

    goto :goto_8

    .line 57
    :cond_12
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 58
    instance-of v15, v10, Ljava/lang/String;

    if-eqz v15, :cond_14

    .line 59
    :goto_8
    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_15

    .line 60
    :try_start_0
    invoke-static {v10}, Lexpo/modules/updates/d$a;->valueOf(Ljava/lang/String;)Lexpo/modules/updates/d$a;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_13

    goto :goto_9

    :cond_13
    move-object/from16 v20, v5

    goto/16 :goto_c

    .line 61
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UpdatesConfiguration failed to initialize: invalid value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " provided for checkOnLaunch"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 62
    :cond_14
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_15
    :goto_9
    if-eqz v0, :cond_1a

    .line 63
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/16 v15, 0x80

    invoke-virtual {v4, v10, v15}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 64
    const-string v10, "expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"

    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_16

    move-object/from16 v20, v5

    const/4 v4, 0x0

    goto :goto_a

    .line 65
    :cond_16
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v15

    move-object/from16 v20, v5

    .line 66
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_a

    .line 67
    :cond_17
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_a

    .line 68
    :cond_18
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_a

    .line 69
    :cond_19
    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    :goto_a
    if-nez v4, :cond_1b

    goto :goto_b

    :cond_1a
    move-object/from16 v20, v5

    .line 70
    :goto_b
    const-string v4, "ALWAYS"

    .line 71
    :cond_1b
    :try_start_1
    invoke-static {v4}, Lexpo/modules/updates/d$a;->valueOf(Ljava/lang/String;)Lexpo/modules/updates/d$a;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_c

    .line 72
    :catch_1
    sget-object v5, Lexpo/modules/updates/d;->v:Ljava/lang/String;

    .line 73
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Invalid value "

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH in AndroidManifest; defaulting to ALWAYS"

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    sget-object v4, Lexpo/modules/updates/d$a;->d:Lexpo/modules/updates/d$a;

    .line 76
    :goto_c
    sget-object v5, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    invoke-static {v5, v0, v1, v2, v3}, Lexpo/modules/updates/d$b;->b(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)Z

    move-result v10

    .line 77
    invoke-static {v5, v0, v1}, Lexpo/modules/updates/d$b;->e(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Z

    move-result v15

    .line 78
    invoke-static {v5, v0, v1, v2, v3}, Lexpo/modules/updates/d$b;->f(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;ZLexpo/modules/updates/e;)Ljava/util/Map;

    move-result-object v2

    move/from16 v21, v10

    .line 79
    invoke-static {v5, v0, v1}, Lexpo/modules/updates/d$b;->c(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    move-object/from16 p3, v2

    if-eqz v1, :cond_1f

    .line 80
    const-string v2, "codeSigningCertificate"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_1c

    move-object/from16 v22, v4

    const/4 v3, 0x0

    goto :goto_d

    .line 81
    :cond_1c
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v4

    .line 82
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1e

    .line 83
    :goto_d
    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1d

    goto :goto_e

    :cond_1d
    move/from16 v23, v6

    goto/16 :goto_10

    .line 84
    :cond_1e
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1f
    move-object/from16 v22, v4

    :goto_e
    if-eqz v0, :cond_20

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x80

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 86
    const-string v3, "expo.modules.updates.CODE_SIGNING_CERTIFICATE"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_21

    :cond_20
    move/from16 v23, v6

    const/4 v3, 0x0

    goto :goto_10

    .line 87
    :cond_21
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    move/from16 v23, v6

    .line 88
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_f
    move-object v3, v2

    goto :goto_10

    .line 89
    :cond_22
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_f

    .line 90
    :cond_23
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_f

    .line 91
    :cond_24
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_f

    :goto_10
    if-eqz v1, :cond_28

    .line 92
    const-string v2, "codeSigningMetadata"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    const/4 v4, 0x0

    goto :goto_11

    .line 93
    :cond_25
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 94
    instance-of v6, v4, Ljava/util/Map;

    if-eqz v6, :cond_27

    .line 95
    :goto_11
    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_26

    goto :goto_12

    :cond_26
    move-object/from16 v24, v3

    goto/16 :goto_15

    .line 96
    :cond_27
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_28
    :goto_12
    if-eqz v0, :cond_2d

    .line 97
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x80

    invoke-virtual {v2, v4, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 98
    const-string v4, "expo.modules.updates.CODE_SIGNING_METADATA"

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_29

    move-object/from16 v24, v3

    const/4 v2, 0x0

    goto :goto_13

    .line 99
    :cond_29
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    move-object/from16 v24, v3

    .line 100
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    .line 101
    :cond_2a
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2b

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_13

    .line 102
    :cond_2b
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_13

    .line 103
    :cond_2c
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :goto_13
    if-nez v2, :cond_2e

    goto :goto_14

    :cond_2d
    move-object/from16 v24, v3

    .line 104
    :goto_14
    const-string v2, "{}"

    .line 105
    :cond_2e
    sget-object v3, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    invoke-virtual {v3, v2}, Lexpo/modules/updates/g;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 106
    :goto_15
    const-class v2, Ljava/lang/Boolean;

    if-eqz v1, :cond_31

    .line 107
    const-string v3, "codeSigningIncludeManifestResponseCertificateChain"

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2f

    move-object/from16 v25, v2

    const/4 v6, 0x0

    goto :goto_16

    .line 108
    :cond_2f
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v25, v2

    .line 109
    instance-of v2, v6, Ljava/lang/Boolean;

    if-eqz v2, :cond_30

    .line 110
    :goto_16
    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_32

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object/from16 v26, v4

    goto/16 :goto_19

    .line 111
    :cond_30
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_31
    move-object/from16 v25, v2

    :cond_32
    if-eqz v0, :cond_37

    .line 112
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x80

    invoke-virtual {v2, v3, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 113
    const-string v3, "expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_33

    goto :goto_17

    .line 114
    :cond_33
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    move-object/from16 v26, v4

    .line 115
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_18

    .line 116
    :cond_34
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_35

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_18

    .line 117
    :cond_35
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_36

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_18

    .line 118
    :cond_36
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_18

    :cond_37
    :goto_17
    move-object/from16 v26, v4

    const/4 v2, 0x0

    :goto_18
    if-eqz v2, :cond_38

    .line 119
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_19

    :cond_38
    const/4 v2, 0x0

    :goto_19
    if-eqz v1, :cond_3b

    .line 120
    const-string v3, "codeSigningAllowUnsignedManifests"

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_39

    const/4 v4, 0x0

    goto :goto_1a

    .line 121
    :cond_39
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 122
    instance-of v6, v4, Ljava/lang/Boolean;

    if-eqz v6, :cond_3a

    .line 123
    :goto_1a
    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_3b

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move/from16 v27, v2

    goto/16 :goto_1d

    .line 124
    :cond_3a
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3b
    if-eqz v0, :cond_40

    .line 125
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x80

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 126
    const-string v4, "expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3c

    goto :goto_1b

    .line 127
    :cond_3c
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    move/from16 v27, v2

    .line 128
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_1c

    .line 129
    :cond_3d
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_1c

    .line 130
    :cond_3e
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_1c

    .line 131
    :cond_3f
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_1c

    :cond_40
    :goto_1b
    move/from16 v27, v2

    const/4 v2, 0x0

    :goto_1c
    if-eqz v2, :cond_41

    .line 132
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_1d

    :cond_41
    const/4 v3, 0x0

    :goto_1d
    if-eqz v1, :cond_44

    .line 133
    const-string v2, "enableExpoUpdatesProtocolCompatibilityMode"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_42

    const/4 v4, 0x0

    goto :goto_1e

    .line 134
    :cond_42
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 135
    instance-of v6, v4, Ljava/lang/Boolean;

    if-eqz v6, :cond_43

    .line 136
    :goto_1e
    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_44

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v28, v3

    goto/16 :goto_21

    .line 137
    :cond_43
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_44
    if-eqz v0, :cond_49

    .line 138
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x80

    invoke-virtual {v2, v4, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 139
    const-string v4, "expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_45

    goto :goto_1f

    .line 140
    :cond_45
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    move/from16 v28, v3

    .line 141
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_46

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_20

    .line 142
    :cond_46
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_47

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_20

    .line 143
    :cond_47
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_48

    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_20

    .line 144
    :cond_48
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_20

    :cond_49
    :goto_1f
    move/from16 v28, v3

    const/4 v2, 0x0

    :goto_20
    if-eqz v2, :cond_4a

    .line 145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_21

    :cond_4a
    const/4 v2, 0x0

    :goto_21
    if-eqz v1, :cond_4d

    .line 146
    const-string v3, "enableBsdiffPatchSupport"

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4b

    const/4 v4, 0x0

    goto :goto_22

    .line 147
    :cond_4b
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 148
    instance-of v6, v4, Ljava/lang/Boolean;

    if-eqz v6, :cond_4c

    .line 149
    :goto_22
    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_4d

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_23
    move/from16 v16, v3

    goto/16 :goto_27

    .line 150
    :cond_4c
    new-instance v0, Ljava/lang/AssertionError;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4d
    if-eqz v0, :cond_52

    .line 151
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x80

    invoke-virtual {v3, v4, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 152
    const-string v4, "expo.modules.updates.ENABLE_BSDIFF_PATCH_SUPPORT"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4e

    goto :goto_25

    .line 153
    :cond_4e
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v6

    .line 154
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4f

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_24

    .line 155
    :cond_4f
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_50

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_24

    .line 156
    :cond_50
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_51

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_24

    .line 157
    :cond_51
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    :goto_24
    move-object/from16 v16, v3

    goto :goto_26

    :cond_52
    :goto_25
    const/16 v16, 0x0

    :goto_26
    if-eqz v16, :cond_53

    .line 158
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto/16 :goto_23

    :cond_53
    const/16 v16, 0x0

    .line 159
    :goto_27
    invoke-static {v5, v0, v1}, Lexpo/modules/updates/d$b;->a(Lexpo/modules/updates/d$b;Landroid/content/Context;Ljava/util/Map;)Z

    move-result v0

    if-eqz p4, :cond_54

    const/4 v3, 0x1

    move/from16 v18, v3

    :goto_28
    move-object/from16 v9, p3

    move/from16 v17, v0

    move-object/from16 v19, v1

    move-object v4, v11

    move-object v1, v12

    move-object v3, v14

    move v8, v15

    move/from16 v7, v21

    move-object/from16 v6, v22

    move/from16 v5, v23

    move-object/from16 v11, v24

    move-object/from16 v12, v26

    move/from16 v14, v28

    move-object/from16 v0, p0

    move v15, v2

    move-object v2, v13

    move/from16 v13, v27

    goto :goto_29

    :cond_54
    const/16 v18, 0x0

    goto :goto_28

    .line 160
    :goto_29
    invoke-direct/range {v0 .. v19}, Lexpo/modules/updates/d;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;ILexpo/modules/updates/d$a;ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ZZZZZZLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;ILexpo/modules/updates/d$a;ZZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;ZZZZZZLjava/util/Map;)V
    .locals 1

    const-string v0, "scopeKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalEmbeddedUpdateUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkOnLaunch"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestHeaders"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalEmbeddedRequestHeaders"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 4
    iput-object p3, p0, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 5
    iput-object p4, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 6
    iput p5, p0, Lexpo/modules/updates/d;->e:I

    .line 7
    iput-object p6, p0, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 8
    iput-boolean p7, p0, Lexpo/modules/updates/d;->g:Z

    .line 9
    iput-boolean p8, p0, Lexpo/modules/updates/d;->h:Z

    .line 10
    iput-object p9, p0, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 11
    iput-object p10, p0, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 12
    iput-object p11, p0, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 14
    iput-boolean p13, p0, Lexpo/modules/updates/d;->m:Z

    .line 15
    iput-boolean p14, p0, Lexpo/modules/updates/d;->n:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lexpo/modules/updates/d;->o:Z

    move/from16 p1, p16

    .line 17
    iput-boolean p1, p0, Lexpo/modules/updates/d;->p:Z

    move/from16 p1, p17

    .line 18
    iput-boolean p1, p0, Lexpo/modules/updates/d;->q:Z

    move/from16 p1, p18

    .line 19
    iput-boolean p1, p0, Lexpo/modules/updates/d;->r:Z

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 21
    new-instance p1, Lnd/d;

    invoke-direct {p1, p0}, Lnd/d;-><init>(Lexpo/modules/updates/d;)V

    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/updates/d;->t:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic a(Lexpo/modules/updates/d;)Lod/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/d;->d(Lexpo/modules/updates/d;)Lod/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lexpo/modules/updates/d;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/updates/d;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final d(Lexpo/modules/updates/d;)Lod/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lod/f;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 8
    .line 9
    iget-boolean v3, p0, Lexpo/modules/updates/d;->m:Z

    .line 10
    .line 11
    iget-boolean p0, p0, Lexpo/modules/updates/d;->n:Z

    .line 12
    .line 13
    invoke-direct {v1, v0, v2, v3, p0}, Lod/f;-><init>(Ljava/lang/String;Ljava/util/Map;ZZ)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final e()Lexpo/modules/updates/d$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/updates/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/updates/d;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 25
    .line 26
    iget-object v3, p1, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 36
    .line 37
    iget-object v3, p1, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget v1, p0, Lexpo/modules/updates/d;->e:I

    .line 58
    .line 59
    iget v3, p1, Lexpo/modules/updates/d;->e:I

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 65
    .line 66
    iget-object v3, p1, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-boolean v1, p0, Lexpo/modules/updates/d;->g:Z

    .line 72
    .line 73
    iget-boolean v3, p1, Lexpo/modules/updates/d;->g:Z

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-boolean v1, p0, Lexpo/modules/updates/d;->h:Z

    .line 79
    .line 80
    iget-boolean v3, p1, Lexpo/modules/updates/d;->h:Z

    .line 81
    .line 82
    if-eq v1, v3, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-object v1, p0, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 86
    .line 87
    iget-object v3, p1, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 88
    .line 89
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget-object v1, p0, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 97
    .line 98
    iget-object v3, p1, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 99
    .line 100
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-object v1, p0, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v3, p1, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    iget-object v1, p0, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 119
    .line 120
    iget-object v3, p1, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 121
    .line 122
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    iget-boolean v1, p0, Lexpo/modules/updates/d;->m:Z

    .line 130
    .line 131
    iget-boolean v3, p1, Lexpo/modules/updates/d;->m:Z

    .line 132
    .line 133
    if-eq v1, v3, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-boolean v1, p0, Lexpo/modules/updates/d;->n:Z

    .line 137
    .line 138
    iget-boolean v3, p1, Lexpo/modules/updates/d;->n:Z

    .line 139
    .line 140
    if-eq v1, v3, :cond_f

    .line 141
    .line 142
    return v2

    .line 143
    :cond_f
    iget-boolean v1, p0, Lexpo/modules/updates/d;->o:Z

    .line 144
    .line 145
    iget-boolean v3, p1, Lexpo/modules/updates/d;->o:Z

    .line 146
    .line 147
    if-eq v1, v3, :cond_10

    .line 148
    .line 149
    return v2

    .line 150
    :cond_10
    iget-boolean v1, p0, Lexpo/modules/updates/d;->p:Z

    .line 151
    .line 152
    iget-boolean v3, p1, Lexpo/modules/updates/d;->p:Z

    .line 153
    .line 154
    if-eq v1, v3, :cond_11

    .line 155
    .line 156
    return v2

    .line 157
    :cond_11
    iget-boolean v1, p0, Lexpo/modules/updates/d;->q:Z

    .line 158
    .line 159
    iget-boolean v3, p1, Lexpo/modules/updates/d;->q:Z

    .line 160
    .line 161
    if-eq v1, v3, :cond_12

    .line 162
    .line 163
    return v2

    .line 164
    :cond_12
    iget-boolean v1, p0, Lexpo/modules/updates/d;->r:Z

    .line 165
    .line 166
    iget-boolean v3, p1, Lexpo/modules/updates/d;->r:Z

    .line 167
    .line 168
    if-eq v1, v3, :cond_13

    .line 169
    .line 170
    return v2

    .line 171
    :cond_13
    iget-object v1, p0, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 172
    .line 173
    iget-object p1, p1, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 174
    .line 175
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-nez p1, :cond_14

    .line 180
    .line 181
    return v2

    .line 182
    :cond_14
    return v0
.end method

.method public final f()Lod/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->t:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lod/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_0
    add-int/2addr v0, v1

    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget v1, p0, Lexpo/modules/updates/d;->e:I

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-object v1, p0, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v0, v1

    .line 57
    mul-int/lit8 v0, v0, 0x1f

    .line 58
    .line 59
    iget-boolean v1, p0, Lexpo/modules/updates/d;->g:Z

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/2addr v0, v1

    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    iget-boolean v1, p0, Lexpo/modules/updates/d;->h:Z

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/2addr v0, v1

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    .line 77
    iget-object v1, p0, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v0, v1

    .line 84
    mul-int/lit8 v0, v0, 0x1f

    .line 85
    .line 86
    iget-object v1, p0, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v0, v1

    .line 93
    mul-int/lit8 v0, v0, 0x1f

    .line 94
    .line 95
    iget-object v1, p0, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v1, :cond_1

    .line 98
    .line 99
    move v1, v2

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    :goto_1
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    .line 107
    .line 108
    iget-object v1, p0, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 109
    .line 110
    if-nez v1, :cond_2

    .line 111
    .line 112
    move v1, v2

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    :goto_2
    add-int/2addr v0, v1

    .line 119
    mul-int/lit8 v0, v0, 0x1f

    .line 120
    .line 121
    iget-boolean v1, p0, Lexpo/modules/updates/d;->m:Z

    .line 122
    .line 123
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/2addr v0, v1

    .line 128
    mul-int/lit8 v0, v0, 0x1f

    .line 129
    .line 130
    iget-boolean v1, p0, Lexpo/modules/updates/d;->n:Z

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    add-int/2addr v0, v1

    .line 137
    mul-int/lit8 v0, v0, 0x1f

    .line 138
    .line 139
    iget-boolean v1, p0, Lexpo/modules/updates/d;->o:Z

    .line 140
    .line 141
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    add-int/2addr v0, v1

    .line 146
    mul-int/lit8 v0, v0, 0x1f

    .line 147
    .line 148
    iget-boolean v1, p0, Lexpo/modules/updates/d;->p:Z

    .line 149
    .line 150
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/2addr v0, v1

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    .line 156
    .line 157
    iget-boolean v1, p0, Lexpo/modules/updates/d;->q:Z

    .line 158
    .line 159
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    add-int/2addr v0, v1

    .line 164
    mul-int/lit8 v0, v0, 0x1f

    .line 165
    .line 166
    iget-boolean v1, p0, Lexpo/modules/updates/d;->r:Z

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    add-int/2addr v0, v1

    .line 173
    mul-int/lit8 v0, v0, 0x1f

    .line 174
    .line 175
    iget-object v1, p0, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 176
    .line 177
    if-nez v1, :cond_3

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    :goto_3
    add-int/2addr v0, v2

    .line 185
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/updates/d;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/updates/d;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 15
    .line 16
    const-string v1, "No runtime version provided in configuration"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lexpo/modules/updates/d;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lexpo/modules/updates/d;->b:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, v0, Lexpo/modules/updates/d;->c:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v4, v0, Lexpo/modules/updates/d;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget v5, v0, Lexpo/modules/updates/d;->e:I

    .line 12
    .line 13
    iget-object v6, v0, Lexpo/modules/updates/d;->f:Lexpo/modules/updates/d$a;

    .line 14
    .line 15
    iget-boolean v7, v0, Lexpo/modules/updates/d;->g:Z

    .line 16
    .line 17
    iget-boolean v8, v0, Lexpo/modules/updates/d;->h:Z

    .line 18
    .line 19
    iget-object v9, v0, Lexpo/modules/updates/d;->i:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v10, v0, Lexpo/modules/updates/d;->j:Ljava/util/Map;

    .line 22
    .line 23
    iget-object v11, v0, Lexpo/modules/updates/d;->k:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v12, v0, Lexpo/modules/updates/d;->l:Ljava/util/Map;

    .line 26
    .line 27
    iget-boolean v13, v0, Lexpo/modules/updates/d;->m:Z

    .line 28
    .line 29
    iget-boolean v14, v0, Lexpo/modules/updates/d;->n:Z

    .line 30
    .line 31
    iget-boolean v15, v0, Lexpo/modules/updates/d;->o:Z

    .line 32
    .line 33
    move/from16 v16, v15

    .line 34
    .line 35
    iget-boolean v15, v0, Lexpo/modules/updates/d;->p:Z

    .line 36
    .line 37
    move/from16 v17, v15

    .line 38
    .line 39
    iget-boolean v15, v0, Lexpo/modules/updates/d;->q:Z

    .line 40
    .line 41
    move/from16 v18, v15

    .line 42
    .line 43
    iget-boolean v15, v0, Lexpo/modules/updates/d;->r:Z

    .line 44
    .line 45
    move/from16 v19, v15

    .line 46
    .line 47
    iget-object v15, v0, Lexpo/modules/updates/d;->s:Ljava/util/Map;

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    move-object/from16 v20, v15

    .line 55
    .line 56
    const-string v15, "UpdatesConfiguration(scopeKey="

    .line 57
    .line 58
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", updateUrl="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", originalEmbeddedUpdateUrl="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", runtimeVersionRaw="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", launchWaitMs="

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", checkOnLaunch="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", hasEmbeddedUpdate="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", originalHasEmbeddedUpdate="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", requestHeaders="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", originalEmbeddedRequestHeaders="

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ", codeSigningCertificate="

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", codeSigningMetadata="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v1, ", codeSigningIncludeManifestResponseCertificateChain="

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, ", codeSigningAllowUnsignedManifests="

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v1, ", enableExpoUpdatesProtocolV0CompatibilityMode="

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    move/from16 v1, v16

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, ", enableBsdiffPatchSupport="

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    move/from16 v1, v17

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v1, ", disableAntiBrickingMeasures="

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    move/from16 v1, v18

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v1, ", hasUpdatesOverride="

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    move/from16 v1, v19

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v1, ", cachedOverrideMap="

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    move-object/from16 v1, v20

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v1, ")"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0
.end method
