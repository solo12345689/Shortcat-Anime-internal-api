.class public final Lexpo/modules/updates/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/f$a;
    }
.end annotation


# static fields
.field public static final a:Lexpo/modules/updates/f;

.field private static volatile b:Lexpo/modules/updates/c;

.field private static volatile c:Lexpo/modules/updates/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/updates/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/updates/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/updates/f;->a:Lexpo/modules/updates/f;

    .line 7
    .line 8
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

.method public static final a()Lexpo/modules/updates/c;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "UpdatesController.instance was called before the module was initialized"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public static final declared-synchronized b(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    const-class v0, Lexpo/modules/updates/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "context"

    .line 5
    .line 6
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, Lexpo/modules/updates/f;->d(Landroid/content/Context;Z)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Lexpo/modules/updates/c;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p0
.end method

.method public static synthetic c(Landroid/content/Context;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1}, Lexpo/modules/updates/f;->b(Landroid/content/Context;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final d(Landroid/content/Context;Z)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    sget-object p1, Lexpo/modules/updates/UpdatesPackage;->a:Lexpo/modules/updates/UpdatesPackage$a;

    .line 15
    .line 16
    invoke-virtual {p1}, Lexpo/modules/updates/UpdatesPackage$a;->b()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    new-instance p1, Lexpo/modules/updates/a;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0}, Lexpo/modules/updates/a;-><init>(Landroid/content/Context;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    sput-object p1, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p1, Lxd/g;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "getFilesDir(...)"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v1}, Lxd/g;-><init>(Ljava/io/File;)V

    .line 42
    .line 43
    .line 44
    :try_start_0
    sget-object v1, Lexpo/modules/updates/g;->a:Lexpo/modules/updates/g;

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Lexpo/modules/updates/g;->e(Landroid/content/Context;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    sget-object v2, Lexpo/modules/updates/f;->c:Lexpo/modules/updates/d;

    .line 51
    .line 52
    if-nez v2, :cond_6

    .line 53
    .line 54
    sget-object v2, Lexpo/modules/updates/d;->u:Lexpo/modules/updates/d$b;

    .line 55
    .line 56
    invoke-virtual {v2, p0, v0}, Lexpo/modules/updates/d$b;->s(Landroid/content/Context;Ljava/util/Map;)Lnd/f;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Lexpo/modules/updates/f$a;->a:[I

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aget v2, v3, v2

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    if-eq v2, v3, :cond_5

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    if-eq v2, v3, :cond_4

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    if-eq v2, v3, :cond_3

    .line 76
    .line 77
    const/4 v3, 0x4

    .line 78
    if-ne v2, v3, :cond_2

    .line 79
    .line 80
    const-string v2, "The expo-updates system is disabled due to an invalid configuration. Ensure a runtime version is supplied."

    .line 81
    .line 82
    sget-object v3, Lxd/b;->k:Lxd/b;

    .line 83
    .line 84
    invoke-virtual {p1, v2, v3}, Lxd/g;->o(Ljava/lang/String;Lxd/b;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    new-instance p0, LTd/r;

    .line 89
    .line 90
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p0

    .line 94
    :cond_3
    const-string v2, "The expo-updates system is disabled due to an invalid configuration. Ensure a valid URL is supplied."

    .line 95
    .line 96
    sget-object v3, Lxd/b;->k:Lxd/b;

    .line 97
    .line 98
    invoke-virtual {p1, v2, v3}, Lxd/g;->o(Ljava/lang/String;Lxd/b;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    const-string v2, "The expo-updates system is explicitly disabled. To enable it, set the enabled setting to true."

    .line 103
    .line 104
    sget-object v3, Lxd/b;->k:Lxd/b;

    .line 105
    .line 106
    invoke-virtual {p1, v2, v3}, Lxd/g;->o(Ljava/lang/String;Lxd/b;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    move-object v2, v0

    .line 110
    goto :goto_1

    .line 111
    :cond_5
    new-instance p1, Lexpo/modules/updates/d;

    .line 112
    .line 113
    invoke-direct {p1, p0, v0}, Lexpo/modules/updates/d;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    .line 114
    .line 115
    .line 116
    move-object v2, p1

    .line 117
    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    .line 118
    .line 119
    new-instance p1, Lexpo/modules/updates/b;

    .line 120
    .line 121
    invoke-direct {p1, p0, v2, v1}, Lexpo/modules/updates/b;-><init>(Landroid/content/Context;Lexpo/modules/updates/d;Ljava/io/File;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, LEd/a;->a:LEd/a;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 127
    .line 128
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, LEd/a;->b(Ljava/lang/ref/WeakReference;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    new-instance p1, Lexpo/modules/updates/a;

    .line 136
    .line 137
    invoke-direct {p1, p0, v0}, Lexpo/modules/updates/a;-><init>(Landroid/content/Context;Ljava/lang/Exception;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, LEd/a;->a:LEd/a;

    .line 141
    .line 142
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 143
    .line 144
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, LEd/a;->b(Ljava/lang/ref/WeakReference;)V

    .line 148
    .line 149
    .line 150
    :goto_2
    sput-object p1, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 151
    .line 152
    return-void

    .line 153
    :catch_0
    move-exception v0

    .line 154
    const-string v1, "The expo-updates system is disabled due to a storage access error"

    .line 155
    .line 156
    sget-object v2, Lxd/b;->k:Lxd/b;

    .line 157
    .line 158
    invoke-virtual {p1, v1, v0, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 159
    .line 160
    .line 161
    new-instance p1, Lexpo/modules/updates/a;

    .line 162
    .line 163
    invoke-direct {p1, p0, v0}, Lexpo/modules/updates/a;-><init>(Landroid/content/Context;Ljava/lang/Exception;)V

    .line 164
    .line 165
    .line 166
    sput-object p1, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 167
    .line 168
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lexpo/modules/updates/c;->d()Lud/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, v1}, Lud/a;->a(Ljava/lang/ref/WeakReference;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/ref/WeakReference;)V
    .locals 1

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lexpo/modules/updates/c;->d()Lud/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lud/a;->a(Ljava/lang/ref/WeakReference;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p1, Lexpo/modules/updates/f;->b:Lexpo/modules/updates/c;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Lexpo/modules/updates/c;->n()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method
