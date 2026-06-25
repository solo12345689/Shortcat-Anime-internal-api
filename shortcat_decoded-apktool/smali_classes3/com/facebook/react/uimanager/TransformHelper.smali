.class public final Lcom/facebook/react/uimanager/TransformHelper;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/TransformHelper$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJA\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ3\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ:\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u001eH\u0083 \u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\r0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/TransformHelper;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "transformMap",
        "",
        "key",
        "",
        "a",
        "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "transforms",
        "",
        "result",
        "",
        "viewWidth",
        "viewHeight",
        "transformOrigin",
        "",
        "allowPercentageResolution",
        "LTd/L;",
        "d",
        "(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V",
        "stringValue",
        "dimension",
        "c",
        "(Ljava/lang/String;D)D",
        "b",
        "(FFLcom/facebook/react/bridge/ReadableArray;Z)[D",
        "Lcom/facebook/react/bridge/NativeArray;",
        "nativeProcessTransform",
        "(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V",
        "Ljava/lang/ThreadLocal;",
        "Ljava/lang/ThreadLocal;",
        "helperMatrix",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/uimanager/TransformHelper;

.field private static final b:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/TransformHelper;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/TransformHelper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 7
    .line 8
    new-instance v0, Lcom/facebook/react/uimanager/TransformHelper$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/facebook/react/uimanager/TransformHelper$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/facebook/react/uimanager/TransformHelper;->b:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D
    .locals 5

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string p2, "rad"

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p1, p2, v0, v1, v3}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/4 v4, 0x3

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-static {p1, v4}, LDf/r;->o1(Ljava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p2, "deg"

    .line 35
    .line 36
    invoke-static {p1, p2, v0, v1, v3}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-static {p1, v4}, LDf/r;->o1(Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    move v2, v0

    .line 47
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    :goto_1
    if-eqz v2, :cond_3

    .line 57
    .line 58
    return-wide p1

    .line 59
    :cond_3
    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/v;->l(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    return-wide p1
.end method

.method private final b(FFLcom/facebook/react/bridge/ReadableArray;Z)[D
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_6

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    cmpg-float v5, v1, v4

    .line 12
    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    cmpg-float v4, v0, v4

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    float-to-double v4, v0

    .line 22
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 23
    .line 24
    div-double/2addr v4, v6

    .line 25
    float-to-double v8, v1

    .line 26
    div-double/2addr v8, v6

    .line 27
    const/4 v6, 0x3

    .line 28
    new-array v7, v6, [D

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    aput-wide v4, v7, v10

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    aput-wide v8, v7, v11

    .line 35
    .line 36
    const-wide/16 v12, 0x0

    .line 37
    .line 38
    const/4 v14, 0x2

    .line 39
    aput-wide v12, v7, v14

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    move v13, v10

    .line 50
    :goto_0
    if-ge v13, v12, :cond_5

    .line 51
    .line 52
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 53
    .line 54
    .line 55
    move-result-object v15

    .line 56
    sget-object v16, Lcom/facebook/react/uimanager/TransformHelper$a;->a:[I

    .line 57
    .line 58
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    aget v15, v16, v15

    .line 63
    .line 64
    if-eq v15, v11, :cond_4

    .line 65
    .line 66
    if-eq v15, v14, :cond_2

    .line 67
    .line 68
    :cond_1
    move v15, v10

    .line 69
    move/from16 v19, v11

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    if-eqz p4, :cond_1

    .line 73
    .line 74
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    invoke-static {v15}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v6, "%"

    .line 82
    .line 83
    invoke-static {v15, v6, v10, v14, v3}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_1

    .line 88
    .line 89
    invoke-static {v15, v11}, LDf/r;->o1(Ljava/lang/String;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 94
    .line 95
    .line 96
    move-result-wide v17

    .line 97
    if-nez v13, :cond_3

    .line 98
    .line 99
    move v6, v0

    .line 100
    :goto_1
    move v15, v10

    .line 101
    move/from16 v19, v11

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move v6, v1

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    float-to-double v10, v6

    .line 107
    mul-double v10, v10, v17

    .line 108
    .line 109
    const-wide/high16 v17, 0x4059000000000000L    # 100.0

    .line 110
    .line 111
    div-double v10, v10, v17

    .line 112
    .line 113
    aput-wide v10, v7, v13

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move v15, v10

    .line 117
    move/from16 v19, v11

    .line 118
    .line 119
    invoke-interface {v2, v13}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 120
    .line 121
    .line 122
    move-result-wide v10

    .line 123
    aput-wide v10, v7, v13

    .line 124
    .line 125
    :goto_3
    add-int/lit8 v13, v13, 0x1

    .line 126
    .line 127
    move v10, v15

    .line 128
    move/from16 v11, v19

    .line 129
    .line 130
    const/4 v6, 0x3

    .line 131
    goto :goto_0

    .line 132
    :cond_5
    move v15, v10

    .line 133
    move/from16 v19, v11

    .line 134
    .line 135
    neg-double v0, v4

    .line 136
    aget-wide v2, v7, v15

    .line 137
    .line 138
    add-double/2addr v0, v2

    .line 139
    neg-double v2, v8

    .line 140
    aget-wide v4, v7, v19

    .line 141
    .line 142
    add-double/2addr v2, v4

    .line 143
    aget-wide v4, v7, v14

    .line 144
    .line 145
    const/4 v6, 0x3

    .line 146
    new-array v6, v6, [D

    .line 147
    .line 148
    aput-wide v0, v6, v15

    .line 149
    .line 150
    aput-wide v2, v6, v19

    .line 151
    .line 152
    aput-wide v4, v6, v14

    .line 153
    .line 154
    return-object v6

    .line 155
    :cond_6
    :goto_4
    return-object v3
.end method

.method private final c(Ljava/lang/String;D)D
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "%"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v0, v3, v1, v2}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {p1, v0}, LDf/r;->o1(Ljava/lang/String;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    mul-double/2addr v0, p2

    .line 22
    const-wide/high16 p1, 0x4059000000000000L    # 100.0

    .line 23
    .line 24
    div-double/2addr v0, p1

    .line 25
    return-wide v0

    .line 26
    :cond_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-wide p1

    .line 31
    :catch_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string p3, "Invalid translate value: "

    .line 37
    .line 38
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "ReactNative"

    .line 49
    .line 50
    invoke-static {p2, p1}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 p1, 0x0

    .line 54
    .line 55
    return-wide p1
.end method

.method public static final d(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    const-string v6, "transforms"

    .line 14
    .line 15
    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v6, "result"

    .line 19
    .line 20
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lh7/b;->M()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    instance-of v7, v0, Lcom/facebook/react/bridge/NativeArray;

    .line 33
    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    move v7, v6

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    instance-of v7, v4, Lcom/facebook/react/bridge/NativeArray;

    .line 41
    .line 42
    :goto_0
    if-eqz v7, :cond_1

    .line 43
    .line 44
    check-cast v0, Lcom/facebook/react/bridge/NativeArray;

    .line 45
    .line 46
    check-cast v4, Lcom/facebook/react/bridge/NativeArray;

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/uimanager/TransformHelper;->nativeProcessTransform(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    sget-object v7, Lcom/facebook/react/uimanager/TransformHelper;->b:Ljava/lang/ThreadLocal;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-static {v7}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object v8, v7

    .line 62
    check-cast v8, [D

    .line 63
    .line 64
    invoke-static {v1}, Lcom/facebook/react/uimanager/v;->r([D)V

    .line 65
    .line 66
    .line 67
    sget-object v7, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 68
    .line 69
    invoke-direct {v7, v2, v3, v4, v5}, Lcom/facebook/react/uimanager/TransformHelper;->b(FFLcom/facebook/react/bridge/ReadableArray;Z)[D

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v7, 0x2

    .line 74
    const/4 v15, 0x0

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    invoke-static {v8}, Lcom/facebook/react/uimanager/v;->r([D)V

    .line 78
    .line 79
    .line 80
    aget-wide v9, v4, v15

    .line 81
    .line 82
    aget-wide v11, v4, v6

    .line 83
    .line 84
    aget-wide v13, v4, v7

    .line 85
    .line 86
    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/v;->j([DDDD)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/v;->p([D[D[D)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/16 v10, 0x10

    .line 97
    .line 98
    if-ne v9, v10, :cond_4

    .line 99
    .line 100
    invoke-interface {v0, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    sget-object v11, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 105
    .line 106
    if-ne v9, v11, :cond_4

    .line 107
    .line 108
    invoke-static {v8}, Lcom/facebook/react/uimanager/v;->r([D)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    move v3, v15

    .line 116
    :goto_1
    if-ge v3, v2, :cond_3

    .line 117
    .line 118
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 119
    .line 120
    .line 121
    move-result-wide v9

    .line 122
    aput-wide v9, v8, v3

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/v;->p([D[D[D)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_11

    .line 131
    .line 132
    :cond_4
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    move v11, v15

    .line 137
    :goto_2
    if-ge v11, v9, :cond_19

    .line 138
    .line 139
    invoke-interface {v0, v11}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-static {v12}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v12}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-interface {v13}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-static {v8}, Lcom/facebook/react/uimanager/v;->r([D)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    move/from16 v16, v11

    .line 162
    .line 163
    sparse-switch v14, :sswitch_data_0

    .line 164
    .line 165
    .line 166
    :goto_3
    move v6, v9

    .line 167
    const/16 v7, 0x10

    .line 168
    .line 169
    goto/16 :goto_d

    .line 170
    .line 171
    :sswitch_0
    const-string v10, "rotateZ"

    .line 172
    .line 173
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    if-nez v10, :cond_5

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    move v6, v9

    .line 181
    const/16 v7, 0x10

    .line 182
    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :sswitch_1
    const-string v10, "rotateY"

    .line 186
    .line 187
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-nez v10, :cond_6

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_6
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 195
    .line 196
    invoke-direct {v10, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    invoke-static {v8, v10, v11}, Lcom/facebook/react/uimanager/v;->c([DD)V

    .line 201
    .line 202
    .line 203
    :goto_4
    move v6, v9

    .line 204
    const/16 v7, 0x10

    .line 205
    .line 206
    goto/16 :goto_10

    .line 207
    .line 208
    :sswitch_2
    const-string v10, "rotateX"

    .line 209
    .line 210
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-nez v10, :cond_7

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_7
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 218
    .line 219
    invoke-direct {v10, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    .line 220
    .line 221
    .line 222
    move-result-wide v10

    .line 223
    invoke-static {v8, v10, v11}, Lcom/facebook/react/uimanager/v;->b([DD)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :sswitch_3
    const-string v14, "translate"

    .line 228
    .line 229
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    if-nez v14, :cond_8

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    invoke-static {v12}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    sget-object v14, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 248
    .line 249
    if-ne v13, v14, :cond_9

    .line 250
    .line 251
    if-eqz v5, :cond_9

    .line 252
    .line 253
    sget-object v13, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 254
    .line 255
    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    move-object v11, v8

    .line 263
    float-to-double v7, v2

    .line 264
    invoke-direct {v13, v10, v7, v8}, Lcom/facebook/react/uimanager/TransformHelper;->c(Ljava/lang/String;D)D

    .line 265
    .line 266
    .line 267
    move-result-wide v7

    .line 268
    goto :goto_5

    .line 269
    :cond_9
    move-object v11, v8

    .line 270
    invoke-interface {v12, v15}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 271
    .line 272
    .line 273
    move-result-wide v7

    .line 274
    :goto_5
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    if-ne v10, v14, :cond_a

    .line 279
    .line 280
    if-eqz v5, :cond_a

    .line 281
    .line 282
    sget-object v10, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 283
    .line 284
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-static {v13}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    move-wide/from16 v19, v7

    .line 292
    .line 293
    float-to-double v6, v3

    .line 294
    invoke-direct {v10, v13, v6, v7}, Lcom/facebook/react/uimanager/TransformHelper;->c(Ljava/lang/String;D)D

    .line 295
    .line 296
    .line 297
    move-result-wide v6

    .line 298
    goto :goto_6

    .line 299
    :cond_a
    move-wide/from16 v19, v7

    .line 300
    .line 301
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 302
    .line 303
    .line 304
    move-result-wide v7

    .line 305
    move-wide v6, v7

    .line 306
    :goto_6
    invoke-interface {v12}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    const/4 v10, 0x2

    .line 311
    if-le v8, v10, :cond_b

    .line 312
    .line 313
    invoke-interface {v12, v10}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 314
    .line 315
    .line 316
    move-result-wide v12

    .line 317
    move-wide v13, v12

    .line 318
    :goto_7
    move-object v8, v11

    .line 319
    move-wide v11, v6

    .line 320
    move v6, v9

    .line 321
    move-wide/from16 v9, v19

    .line 322
    .line 323
    const/16 v7, 0x10

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_b
    const-wide/16 v13, 0x0

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :goto_8
    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/v;->j([DDDD)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_10

    .line 333
    .line 334
    :sswitch_4
    move v6, v9

    .line 335
    const/16 v7, 0x10

    .line 336
    .line 337
    const-string v9, "perspective"

    .line 338
    .line 339
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    if-nez v9, :cond_c

    .line 344
    .line 345
    goto/16 :goto_d

    .line 346
    .line 347
    :cond_c
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 348
    .line 349
    .line 350
    move-result-wide v9

    .line 351
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->a([DD)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_10

    .line 355
    .line 356
    :sswitch_5
    move v6, v9

    .line 357
    const/16 v7, 0x10

    .line 358
    .line 359
    const-string v9, "skewY"

    .line 360
    .line 361
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    if-nez v9, :cond_d

    .line 366
    .line 367
    goto/16 :goto_d

    .line 368
    .line 369
    :cond_d
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 370
    .line 371
    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    .line 372
    .line 373
    .line 374
    move-result-wide v9

    .line 375
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->h([DD)V

    .line 376
    .line 377
    .line 378
    goto/16 :goto_10

    .line 379
    .line 380
    :sswitch_6
    move v6, v9

    .line 381
    const/16 v7, 0x10

    .line 382
    .line 383
    const-string v9, "skewX"

    .line 384
    .line 385
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    if-nez v9, :cond_e

    .line 390
    .line 391
    goto/16 :goto_d

    .line 392
    .line 393
    :cond_e
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 394
    .line 395
    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    .line 396
    .line 397
    .line 398
    move-result-wide v9

    .line 399
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->g([DD)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_10

    .line 403
    .line 404
    :sswitch_7
    move v6, v9

    .line 405
    const/16 v7, 0x10

    .line 406
    .line 407
    const-string v9, "scale"

    .line 408
    .line 409
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    if-nez v9, :cond_f

    .line 414
    .line 415
    goto/16 :goto_d

    .line 416
    .line 417
    :cond_f
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 418
    .line 419
    .line 420
    move-result-wide v9

    .line 421
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->e([DD)V

    .line 422
    .line 423
    .line 424
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->f([DD)V

    .line 425
    .line 426
    .line 427
    goto/16 :goto_10

    .line 428
    .line 429
    :sswitch_8
    move v6, v9

    .line 430
    const/16 v7, 0x10

    .line 431
    .line 432
    const-string v9, "scaleY"

    .line 433
    .line 434
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-nez v9, :cond_10

    .line 439
    .line 440
    goto/16 :goto_d

    .line 441
    .line 442
    :cond_10
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 443
    .line 444
    .line 445
    move-result-wide v9

    .line 446
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->f([DD)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_10

    .line 450
    .line 451
    :sswitch_9
    move v6, v9

    .line 452
    const/16 v7, 0x10

    .line 453
    .line 454
    const-string v9, "scaleX"

    .line 455
    .line 456
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    if-nez v9, :cond_11

    .line 461
    .line 462
    goto/16 :goto_d

    .line 463
    .line 464
    :cond_11
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 465
    .line 466
    .line 467
    move-result-wide v9

    .line 468
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->e([DD)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_10

    .line 472
    .line 473
    :sswitch_a
    move v6, v9

    .line 474
    const/16 v7, 0x10

    .line 475
    .line 476
    const-string v9, "rotate"

    .line 477
    .line 478
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    if-nez v9, :cond_12

    .line 483
    .line 484
    goto/16 :goto_d

    .line 485
    .line 486
    :cond_12
    :goto_9
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 487
    .line 488
    invoke-direct {v9, v12, v13}, Lcom/facebook/react/uimanager/TransformHelper;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    .line 489
    .line 490
    .line 491
    move-result-wide v9

    .line 492
    invoke-static {v8, v9, v10}, Lcom/facebook/react/uimanager/v;->d([DD)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_10

    .line 496
    .line 497
    :sswitch_b
    move v6, v9

    .line 498
    const/16 v7, 0x10

    .line 499
    .line 500
    const-string v9, "matrix"

    .line 501
    .line 502
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    if-nez v9, :cond_13

    .line 507
    .line 508
    goto :goto_d

    .line 509
    :cond_13
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    move v10, v15

    .line 517
    :goto_a
    if-ge v10, v7, :cond_18

    .line 518
    .line 519
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 520
    .line 521
    .line 522
    move-result-wide v11

    .line 523
    aput-wide v11, v8, v10

    .line 524
    .line 525
    add-int/lit8 v10, v10, 0x1

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :sswitch_c
    move v6, v9

    .line 529
    const/16 v7, 0x10

    .line 530
    .line 531
    const-string v9, "translateY"

    .line 532
    .line 533
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    if-nez v9, :cond_14

    .line 538
    .line 539
    goto :goto_d

    .line 540
    :cond_14
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 545
    .line 546
    if-ne v9, v10, :cond_15

    .line 547
    .line 548
    if-eqz v5, :cond_15

    .line 549
    .line 550
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 551
    .line 552
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    float-to-double v11, v3

    .line 560
    invoke-direct {v9, v10, v11, v12}, Lcom/facebook/react/uimanager/TransformHelper;->c(Ljava/lang/String;D)D

    .line 561
    .line 562
    .line 563
    move-result-wide v9

    .line 564
    :goto_b
    const-wide/16 v11, 0x0

    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_15
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 568
    .line 569
    .line 570
    move-result-wide v9

    .line 571
    goto :goto_b

    .line 572
    :goto_c
    invoke-static {v8, v11, v12, v9, v10}, Lcom/facebook/react/uimanager/v;->i([DDD)V

    .line 573
    .line 574
    .line 575
    goto :goto_10

    .line 576
    :sswitch_d
    move v6, v9

    .line 577
    const/16 v7, 0x10

    .line 578
    .line 579
    const-string v9, "translateX"

    .line 580
    .line 581
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-nez v9, :cond_16

    .line 586
    .line 587
    :goto_d
    new-instance v9, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 590
    .line 591
    .line 592
    const-string v10, "Unsupported transform type: "

    .line 593
    .line 594
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v9

    .line 604
    const-string v10, "ReactNative"

    .line 605
    .line 606
    invoke-static {v10, v9}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    goto :goto_10

    .line 610
    :cond_16
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 611
    .line 612
    .line 613
    move-result-object v9

    .line 614
    sget-object v10, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 615
    .line 616
    if-ne v9, v10, :cond_17

    .line 617
    .line 618
    if-eqz v5, :cond_17

    .line 619
    .line 620
    sget-object v9, Lcom/facebook/react/uimanager/TransformHelper;->a:Lcom/facebook/react/uimanager/TransformHelper;

    .line 621
    .line 622
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    float-to-double v11, v2

    .line 630
    invoke-direct {v9, v10, v11, v12}, Lcom/facebook/react/uimanager/TransformHelper;->c(Ljava/lang/String;D)D

    .line 631
    .line 632
    .line 633
    move-result-wide v9

    .line 634
    :goto_e
    const-wide/16 v11, 0x0

    .line 635
    .line 636
    goto :goto_f

    .line 637
    :cond_17
    invoke-interface {v12, v13}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 638
    .line 639
    .line 640
    move-result-wide v9

    .line 641
    goto :goto_e

    .line 642
    :goto_f
    invoke-static {v8, v9, v10, v11, v12}, Lcom/facebook/react/uimanager/v;->i([DDD)V

    .line 643
    .line 644
    .line 645
    :cond_18
    :goto_10
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/v;->p([D[D[D)V

    .line 646
    .line 647
    .line 648
    add-int/lit8 v11, v16, 0x1

    .line 649
    .line 650
    move v9, v6

    .line 651
    move v10, v7

    .line 652
    const/4 v6, 0x1

    .line 653
    const/4 v7, 0x2

    .line 654
    goto/16 :goto_2

    .line 655
    .line 656
    :cond_19
    :goto_11
    if-eqz v4, :cond_1a

    .line 657
    .line 658
    invoke-static {v8}, Lcom/facebook/react/uimanager/v;->r([D)V

    .line 659
    .line 660
    .line 661
    aget-wide v2, v4, v15

    .line 662
    .line 663
    neg-double v9, v2

    .line 664
    const/16 v18, 0x1

    .line 665
    .line 666
    aget-wide v2, v4, v18

    .line 667
    .line 668
    neg-double v11, v2

    .line 669
    const/16 v17, 0x2

    .line 670
    .line 671
    aget-wide v2, v4, v17

    .line 672
    .line 673
    neg-double v13, v2

    .line 674
    invoke-static/range {v8 .. v14}, Lcom/facebook/react/uimanager/v;->j([DDDD)V

    .line 675
    .line 676
    .line 677
    invoke-static {v1, v1, v8}, Lcom/facebook/react/uimanager/v;->p([D[D[D)V

    .line 678
    .line 679
    .line 680
    :cond_1a
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x66a2c736 -> :sswitch_d
        -0x66a2c735 -> :sswitch_c
        -0x4072683f -> :sswitch_b
        -0x372522a5 -> :sswitch_a
        -0x3621dfb2 -> :sswitch_9
        -0x3621dfb1 -> :sswitch_8
        0x683094a -> :sswitch_7
        0x686bc8e -> :sswitch_6
        0x686bc8f -> :sswitch_5
        0xc653a3c -> :sswitch_4
        0x3ec0f14e -> :sswitch_3
        0x5280ce5d -> :sswitch_2
        0x5280ce5e -> :sswitch_1
        0x5280ce5f -> :sswitch_0
    .end sparse-switch
.end method

.method private static final native nativeProcessTransform(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V
.end method
