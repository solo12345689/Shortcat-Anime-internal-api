.class public final Llc/c;
.super Llc/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field public b:Lexpo/modules/kotlin/jni/JSIContext;

.field private c:Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

.field private final d:Ljava/lang/ref/WeakReference;

.field private final e:Lnc/e;

.field private final f:Lnc/b;

.field private final g:Lexpo/modules/kotlin/jni/JNIDeallocator;


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
    iput-object p2, p0, Llc/c;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-static {p1}, LUb/A;->a(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Llc/c;->d:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    new-instance p1, Lnc/e;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lnc/e;-><init>(Llc/b;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Llc/c;->e:Lnc/e;

    .line 28
    .line 29
    new-instance p1, Lnc/b;

    .line 30
    .line 31
    invoke-direct {p1}, Lnc/b;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Llc/c;->f:Lnc/b;

    .line 35
    .line 36
    new-instance p1, Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    const/4 v0, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, v1, p2, v0}, Lexpo/modules/kotlin/jni/JNIDeallocator;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Llc/c;->g:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 45
    .line 46
    return-void
.end method

.method private final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Llc/c;->b:Lexpo/modules/kotlin/jni/JSIContext;

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
    iget-object v0, p0, Llc/c;->d:Ljava/lang/ref/WeakReference;

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
    iget-object v0, p0, Llc/c;->f:Lnc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic c()Lexpo/modules/kotlin/jni/JNIDeallocator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llc/c;->g()Lexpo/modules/kotlin/jni/JNIDeallocator;

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
    iget-object v0, p0, Llc/c;->b:Lexpo/modules/kotlin/jni/JSIContext;

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
    iget-object v0, p0, Llc/c;->e:Lnc/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Llc/c;->g()Lexpo/modules/kotlin/jni/JNIDeallocator;

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

.method public g()Lexpo/modules/kotlin/jni/JNIDeallocator;
    .locals 1

    .line 1
    iget-object v0, p0, Llc/c;->g:Lexpo/modules/kotlin/jni/JNIDeallocator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(J)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Llc/c;->i()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "\u26a0\ufe0f JSI interop was already installed"

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p1, p2, v1, v0, v1}, Lub/d;->i(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
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
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ".install on runtime "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "ExpoModulesCore"

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v3, "["

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, "] "

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_2
    new-instance v0, Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    .line 74
    .line 75
    invoke-direct {v0, p1, p2}, Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Llc/c;->k(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lexpo/modules/kotlin/jni/WorkletRuntimeInstaller;

    .line 82
    .line 83
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/jni/WorkletRuntimeInstaller;-><init>(Llc/b;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/WorkletRuntimeInstaller;->a(J)Lexpo/modules/kotlin/jni/JSIContext;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Llc/c;->j(Lexpo/modules/kotlin/jni/JSIContext;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string p2, "\u2705 JSI interop was installed"

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lub/d;->d(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    :try_start_3
    invoke-static {}, LX3/a;->f()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 105
    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return-void

    .line 109
    :catchall_1
    move-exception p1

    .line 110
    :try_start_4
    invoke-static {}, LX3/a;->f()V

    .line 111
    .line 112
    .line 113
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 114
    :goto_0
    monitor-exit p0

    .line 115
    throw p1
.end method

.method public j(Lexpo/modules/kotlin/jni/JSIContext;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Llc/c;->b:Lexpo/modules/kotlin/jni/JSIContext;

    .line 7
    .line 8
    return-void
.end method

.method public final k(Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llc/c;->c:Lexpo/modules/kotlin/jni/worklets/WorkletNativeRuntime;

    .line 2
    .line 3
    return-void
.end method
