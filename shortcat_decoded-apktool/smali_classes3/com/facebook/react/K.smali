.class public final Lcom/facebook/react/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/K$a;
    }
.end annotation


# static fields
.field private static final A:Lcom/facebook/react/K$a;

.field private static final B:Ljava/lang/String;


# instance fields
.field private final a:Ljava/util/List;

.field private b:Ljava/lang/String;

.field private c:Lcom/facebook/react/bridge/JSBundleLoader;

.field private d:Ljava/lang/String;

.field private e:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

.field private f:Landroid/app/Application;

.field private g:Z

.field private h:Lcom/facebook/react/devsupport/b0;

.field private i:Z

.field private j:Z

.field private k:Lcom/facebook/react/common/LifecycleState;

.field private l:Lcom/facebook/react/bridge/JSExceptionHandler;

.field private m:Landroid/app/Activity;

.field private n:Lq7/a;

.field private o:Z

.field private p:Lc7/c;

.field private q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

.field private r:I

.field private s:I

.field private t:Lcom/facebook/react/bridge/UIManagerProvider;

.field private u:Ljava/util/Map;

.field private v:Lcom/facebook/react/T$a;

.field private w:LU6/h;

.field private x:Lc7/d;

.field private y:Lg7/b;

.field private z:Lc7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/K$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/K$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/K;->A:Lcom/facebook/react/K$a;

    .line 8
    .line 9
    const-string v0, "ReactInstanceManagerBuilder"

    .line 10
    .line 11
    sget-object v1, LW6/a;->b:LW6/a;

    .line 12
    .line 13
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 14
    .line 15
    .line 16
    const-class v0, Lcom/facebook/react/K;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getSimpleName(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/facebook/react/K;->B:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/K;->a:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput v0, p0, Lcom/facebook/react/K;->r:I

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Lcom/facebook/react/K;->s:I

    .line 16
    .line 17
    return-void
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 0

    .line 1
    invoke-static {p3}, Lcom/facebook/react/H;->H(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object p1, Lcom/facebook/hermes/reactexecutor/HermesExecutor;->a:Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/hermes/reactexecutor/HermesExecutor$a;->b()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lp6/a;

    .line 10
    .line 11
    invoke-direct {p1}, Lp6/a;-><init>()V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :catch_0
    sget-object p1, Lcom/facebook/react/K;->B:Ljava/lang/String;

    .line 16
    .line 17
    const-string p2, "Unable to load Hermes. Your application is not built correctly and will fail to execute"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method


# virtual methods
.method public final a(Lcom/facebook/react/O;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "reactPackage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/K;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b()Lcom/facebook/react/H;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    .line 4
    .line 5
    if-eqz v2, :cond_a

    .line 6
    .line 7
    iget-object v1, v0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    .line 8
    .line 9
    sget-object v3, Lcom/facebook/react/common/LifecycleState;->c:Lcom/facebook/react/common/LifecycleState;

    .line 10
    .line 11
    if-ne v1, v3, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Lcom/facebook/react/K;->m:Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "Activity needs to be set if initial lifecycle state is resumed"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_0
    iget-boolean v1, v0, Lcom/facebook/react/K;->g:Z

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    iget-object v1, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v2, "JS Bundle File or Asset URL has to be provided when dev support is disabled"

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_3
    :goto_1
    iget-object v1, v0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    iget-object v1, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v1, :cond_5

    .line 54
    .line 55
    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "Either MainModulePath or JS Bundle File needs to be provided"

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_5
    :goto_2
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {}, Lcom/facebook/react/modules/systeminfo/a;->e()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-object v4, v0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v5, v0, Lcom/facebook/react/K;->m:Landroid/app/Activity;

    .line 79
    .line 80
    iget-object v6, v0, Lcom/facebook/react/K;->n:Lq7/a;

    .line 81
    .line 82
    iget-object v7, v0, Lcom/facebook/react/K;->q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 83
    .line 84
    if-nez v7, :cond_6

    .line 85
    .line 86
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v8, "getApplicationContext(...)"

    .line 94
    .line 95
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v1, v3, v7}, Lcom/facebook/react/K;->c(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    :cond_6
    iget-object v1, v0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 103
    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    if-eqz v4, :cond_7

    .line 107
    .line 108
    sget-object v1, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    invoke-virtual {v1, v2, v4, v3}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createAssetLoader(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_7
    move-object v3, v5

    .line 116
    move-object v5, v7

    .line 117
    iget-object v7, v0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v8, v0, Lcom/facebook/react/K;->a:Ljava/util/List;

    .line 120
    .line 121
    iget-boolean v9, v0, Lcom/facebook/react/K;->g:Z

    .line 122
    .line 123
    iget-object v4, v0, Lcom/facebook/react/K;->h:Lcom/facebook/react/devsupport/b0;

    .line 124
    .line 125
    if-nez v4, :cond_8

    .line 126
    .line 127
    new-instance v4, Lcom/facebook/react/devsupport/s;

    .line 128
    .line 129
    invoke-direct {v4}, Lcom/facebook/react/devsupport/s;-><init>()V

    .line 130
    .line 131
    .line 132
    :cond_8
    move-object v10, v4

    .line 133
    iget-boolean v11, v0, Lcom/facebook/react/K;->i:Z

    .line 134
    .line 135
    iget-boolean v12, v0, Lcom/facebook/react/K;->j:Z

    .line 136
    .line 137
    iget-object v13, v0, Lcom/facebook/react/K;->e:Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;

    .line 138
    .line 139
    iget-object v14, v0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    .line 140
    .line 141
    if-eqz v14, :cond_9

    .line 142
    .line 143
    iget-object v15, v0, Lcom/facebook/react/K;->l:Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 144
    .line 145
    iget-boolean v4, v0, Lcom/facebook/react/K;->o:Z

    .line 146
    .line 147
    move-object/from16 v16, v1

    .line 148
    .line 149
    iget-object v1, v0, Lcom/facebook/react/K;->p:Lc7/c;

    .line 150
    .line 151
    move-object/from16 v18, v1

    .line 152
    .line 153
    iget v1, v0, Lcom/facebook/react/K;->r:I

    .line 154
    .line 155
    move/from16 v19, v1

    .line 156
    .line 157
    iget v1, v0, Lcom/facebook/react/K;->s:I

    .line 158
    .line 159
    move/from16 v20, v1

    .line 160
    .line 161
    iget-object v1, v0, Lcom/facebook/react/K;->t:Lcom/facebook/react/bridge/UIManagerProvider;

    .line 162
    .line 163
    move-object/from16 v21, v1

    .line 164
    .line 165
    iget-object v1, v0, Lcom/facebook/react/K;->u:Ljava/util/Map;

    .line 166
    .line 167
    move-object/from16 v22, v1

    .line 168
    .line 169
    iget-object v1, v0, Lcom/facebook/react/K;->v:Lcom/facebook/react/T$a;

    .line 170
    .line 171
    move-object/from16 v23, v1

    .line 172
    .line 173
    iget-object v1, v0, Lcom/facebook/react/K;->w:LU6/h;

    .line 174
    .line 175
    move-object/from16 v24, v1

    .line 176
    .line 177
    iget-object v1, v0, Lcom/facebook/react/K;->x:Lc7/d;

    .line 178
    .line 179
    move-object/from16 v25, v1

    .line 180
    .line 181
    iget-object v1, v0, Lcom/facebook/react/K;->y:Lg7/b;

    .line 182
    .line 183
    move-object/from16 v26, v1

    .line 184
    .line 185
    iget-object v1, v0, Lcom/facebook/react/K;->z:Lc7/i;

    .line 186
    .line 187
    move-object/from16 v27, v1

    .line 188
    .line 189
    new-instance v1, Lcom/facebook/react/H;

    .line 190
    .line 191
    move/from16 v17, v4

    .line 192
    .line 193
    move-object v4, v6

    .line 194
    move-object/from16 v6, v16

    .line 195
    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    invoke-direct/range {v1 .. v27}, Lcom/facebook/react/H;-><init>(Landroid/content/Context;Landroid/app/Activity;Lq7/a;Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/lang/String;Ljava/util/List;ZLcom/facebook/react/devsupport/b0;ZZLcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;Lcom/facebook/react/common/LifecycleState;Lcom/facebook/react/bridge/JSExceptionHandler;Lc7/j;ZLc7/c;IILcom/facebook/react/bridge/UIManagerProvider;Ljava/util/Map;Lcom/facebook/react/T$a;LU6/h;Lc7/d;Lg7/b;Lc7/i;)V

    .line 199
    .line 200
    .line 201
    return-object v1

    .line 202
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    const-string v2, "Initial lifecycle state was not set"

    .line 205
    .line 206
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v1

    .line 210
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    const-string v2, "Application property has not been set with this builder"

    .line 213
    .line 214
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v1
.end method

.method public final d(Landroid/app/Application;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/K;->f:Landroid/app/Application;

    .line 7
    .line 8
    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    move-object p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "assets://"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 26
    .line 27
    return-object p0
.end method

.method public final f(Lg7/b;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->y:Lg7/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lc7/d;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->x:Lc7/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lcom/facebook/react/devsupport/b0;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->h:Lcom/facebook/react/devsupport/b0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Lcom/facebook/react/common/LifecycleState;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "initialLifecycleState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/K;->k:Lcom/facebook/react/common/LifecycleState;

    .line 7
    .line 8
    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 4

    .line 1
    const-string v0, "jsBundleFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "assets://"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2, v3}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v3, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object v0, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createFileLoader(Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/facebook/react/K;->k(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/K;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final k(Lcom/facebook/react/bridge/JSBundleLoader;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "jsBundleLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/K;->c:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/facebook/react/K;->b:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public final l(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->l:Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(Ljava/lang/String;)Lcom/facebook/react/K;
    .locals 1

    .line 1
    const-string v0, "jsMainModulePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/K;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public final n(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->q:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->o:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Lc7/i;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->z:Lc7/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public final q(Lcom/facebook/react/T$a;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->v:Lcom/facebook/react/T$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r(Lc7/j;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final s(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final t(LU6/h;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->w:LU6/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u(Lcom/facebook/react/bridge/UIManagerProvider;)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/K;->t:Lcom/facebook/react/bridge/UIManagerProvider;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v(Z)Lcom/facebook/react/K;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/K;->g:Z

    .line 2
    .line 3
    return-object p0
.end method
