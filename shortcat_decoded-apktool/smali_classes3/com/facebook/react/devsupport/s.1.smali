.class public final Lcom/facebook/react/devsupport/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/devsupport/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/s$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/react/devsupport/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/s$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/s;->a:Lcom/facebook/react/devsupport/s$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/facebook/react/devsupport/u0;Ljava/lang/String;ZLc7/j;Lc7/c;ILjava/util/Map;LU6/h;Lc7/d;Lc7/i;Z)Lc7/f;
    .locals 12

    .line 1
    const-string v0, "applicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactInstanceManagerHelper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-boolean v0, LY6/a;->e:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p2, Lcom/facebook/react/devsupport/t0;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lcom/facebook/react/devsupport/t0;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    return-object p2

    .line 21
    :cond_0
    if-eqz p12, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/facebook/react/devsupport/a;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move/from16 v4, p4

    .line 29
    .line 30
    move-object/from16 v5, p5

    .line 31
    .line 32
    move-object/from16 v6, p6

    .line 33
    .line 34
    move/from16 v7, p7

    .line 35
    .line 36
    move-object/from16 v8, p8

    .line 37
    .line 38
    move-object/from16 v9, p9

    .line 39
    .line 40
    move-object/from16 v10, p10

    .line 41
    .line 42
    move-object/from16 v11, p11

    .line 43
    .line 44
    invoke-direct/range {v0 .. v11}, Lcom/facebook/react/devsupport/a;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/u0;Ljava/lang/String;ZLc7/j;Lc7/c;ILjava/util/Map;LU6/h;Lc7/d;Lc7/i;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    new-instance p1, Lcom/facebook/react/devsupport/C0;

    .line 49
    .line 50
    invoke-direct {p1}, Lcom/facebook/react/devsupport/C0;-><init>()V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method public b(Landroid/content/Context;Lcom/facebook/react/devsupport/u0;Ljava/lang/String;ZLc7/j;Lc7/c;ILjava/util/Map;LU6/h;Lc7/d;Lc7/i;)Lc7/f;
    .locals 14

    .line 1
    const-string v0, "applicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactInstanceManagerHelper"

    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    if-nez p4, :cond_0

    .line 14
    .line 15
    new-instance p1, Lcom/facebook/react/devsupport/C0;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/facebook/react/devsupport/C0;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "com.facebook.react.devsupport"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "."

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "BridgeDevSupportManager"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "toString(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-class v3, Landroid/content/Context;

    .line 52
    .line 53
    const-class v4, Lcom/facebook/react/devsupport/u0;

    .line 54
    .line 55
    const-class v5, Ljava/lang/String;

    .line 56
    .line 57
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    const-class v7, Lc7/j;

    .line 60
    .line 61
    const-class v8, Lc7/c;

    .line 62
    .line 63
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    const-class v10, Ljava/util/Map;

    .line 66
    .line 67
    const-class v11, LU6/h;

    .line 68
    .line 69
    const-class v12, Lc7/d;

    .line 70
    .line 71
    const-class v13, Lc7/i;

    .line 72
    .line 73
    filled-new-array/range {v3 .. v13}, [Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    move-object v1, p1

    .line 88
    move-object/from16 v3, p3

    .line 89
    .line 90
    move-object/from16 v5, p5

    .line 91
    .line 92
    move-object/from16 v6, p6

    .line 93
    .line 94
    move-object/from16 v8, p8

    .line 95
    .line 96
    move-object/from16 v9, p9

    .line 97
    .line 98
    move-object/from16 v10, p10

    .line 99
    .line 100
    move-object/from16 v11, p11

    .line 101
    .line 102
    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager"

    .line 111
    .line 112
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast v0, Lc7/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catch_0
    new-instance v0, Lcom/facebook/react/devsupport/t0;

    .line 119
    .line 120
    invoke-direct {v0, p1}, Lcom/facebook/react/devsupport/t0;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    :goto_0
    return-object v0
.end method
