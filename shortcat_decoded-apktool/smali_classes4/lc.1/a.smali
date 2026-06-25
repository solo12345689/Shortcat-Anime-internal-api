.class public final Llc/a;
.super Llc/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Ljava/lang/ref/WeakReference;

.field public c:Lexpo/modules/kotlin/jni/JSIContext;

.field private final d:LUb/r;

.field private final e:Lexpo/modules/kotlin/jni/JNIDeallocator;

.field private final f:Lnc/e;

.field private final g:Lnc/b;


# direct methods
.method public constructor <init>(LUb/d;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContextHolder"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Llc/b;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Llc/a;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-static {p1}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Llc/a;->b:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    new-instance p2, LZb/a;

    .line 23
    .line 24
    invoke-direct {p2}, LZb/a;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lgc/c;->w(Ljava/lang/ref/WeakReference;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, LUb/r;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p2, v0}, LUb/r;-><init>(Lgc/c;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Llc/a;->d:LUb/r;

    .line 37
    .line 38
    new-instance p1, Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {p1, p2, v1, v0}, Lexpo/modules/kotlin/jni/JNIDeallocator;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Llc/a;->e:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 46
    .line 47
    new-instance p1, Lnc/e;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Lnc/e;-><init>(Llc/b;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Llc/a;->f:Lnc/e;

    .line 53
    .line 54
    new-instance p1, Lnc/b;

    .line 55
    .line 56
    invoke-direct {p1}, Lnc/b;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Llc/a;->g:Lnc/b;

    .line 60
    .line 61
    return-void
.end method

.method private final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->c:Lexpo/modules/kotlin/jni/JSIContext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method


# virtual methods
.method public a()LUb/d;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LUb/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public b()Lnc/b;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->g:Lnc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic c()Lexpo/modules/kotlin/jni/JNIDeallocator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llc/a;->i()Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Lexpo/modules/kotlin/jni/JSIContext;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->c:Lexpo/modules/kotlin/jni/JSIContext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "jsiContext"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public e()Lnc/e;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->f:Lnc/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Llc/a;->i()Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JNIDeallocator;->b()LTd/L;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Llc/a;->d()Lexpo/modules/kotlin/jni/JSIContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JSIContext;->evaluateScript(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final h()LUb/r;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->d:LUb/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lexpo/modules/kotlin/jni/JNIDeallocator;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->e:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/a;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Llc/a;->m()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v3, "\u26a0\ufe0f JSI interop was already installed"

    .line 15
    .line 16
    invoke-static {v0, v3, v2, v1, v2}, Lub/d;->i(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, ".install"

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v3, "ExpoModulesCore"

    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "["

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v3, "] "

    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_2
    invoke-virtual {p0}, Llc/a;->k()Ljava/lang/ref/WeakReference;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 80
    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    const-wide/16 v6, 0x0

    .line 103
    .line 104
    cmp-long v4, v4, v6

    .line 105
    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    move-object v3, v2

    .line 110
    :goto_0
    if-nez v3, :cond_3

    .line 111
    .line 112
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-string v3, "\u274c Cannot install JSI interop - JS runtime pointer is null"

    .line 117
    .line 118
    invoke-static {v0, v3, v2, v1, v2}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    goto :goto_1

    .line 124
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    new-instance v3, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;

    .line 129
    .line 130
    invoke-direct {v3, p0}, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;-><init>(Llc/a;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v0}, Lcom/facebook/react/bridge/CatalystInstance;->getRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v1, v2, v0}, Lexpo/modules/kotlin/jni/MainRuntimeInstaller;->a(JLcom/facebook/react/bridge/RuntimeExecutor;)Lexpo/modules/kotlin/jni/JSIContext;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p0, v0}, Llc/a;->n(Lexpo/modules/kotlin/jni/JSIContext;)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-string v1, "\u2705 JSI interop was installed"

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lub/d;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :goto_1
    :try_start_3
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v3, "\u274c Cannot install JSI interop: "

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v1, v2, v0}, Lub/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    :cond_4
    :goto_2
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    .line 187
    :try_start_4
    invoke-static {}, LX3/a;->f()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 188
    .line 189
    .line 190
    monitor-exit p0

    .line 191
    return-void

    .line 192
    :catchall_2
    move-exception v0

    .line 193
    :try_start_5
    invoke-static {}, LX3/a;->f()V

    .line 194
    .line 195
    .line 196
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 197
    :goto_3
    monitor-exit p0

    .line 198
    throw v0
.end method

.method public n(Lexpo/modules/kotlin/jni/JSIContext;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Llc/a;->c:Lexpo/modules/kotlin/jni/JSIContext;

    .line 7
    .line 8
    return-void
.end method
