.class public final Lmb/b;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lmb/b;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Ljava/net/URI;",
        "uri",
        "",
        "D",
        "(Ljava/net/URI;)Ljava/lang/String;",
        "LUb/d;",
        "appContext",
        "Ljava/io/File;",
        "localUrl",
        "Landroid/net/Uri;",
        "B",
        "(LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Landroid/content/Context;",
        "C",
        "()Landroid/content/Context;",
        "context",
        "expo-asset_release"
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

.method public static final synthetic A(Lmb/b;Ljava/net/URI;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmb/b;->D(Ljava/net/URI;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final B(LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lmb/b$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lmb/b$e;

    .line 7
    .line 8
    iget v1, v0, Lmb/b$e;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmb/b$e;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmb/b$e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lmb/b$e;-><init>(Lmb/b;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lmb/b$e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lmb/b$e;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    if-eqz p4, :cond_3

    .line 58
    .line 59
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 60
    .line 61
    .line 62
    move-result p4

    .line 63
    if-ne p4, v3, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p3}, Ljava/io/File;->mkdirs()Z

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p1}, LUb/d;->s()Lexpo/modules/kotlin/services/FilePermissionService;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    invoke-direct {p0}, Lmb/b;->C()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p3}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    invoke-virtual {p4, v2, v4}, Lexpo/modules/kotlin/services/FilePermissionService;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/util/EnumSet;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    sget-object v2, Lexpo/modules/kotlin/services/FilePermissionService$a;->b:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 88
    .line 89
    invoke-virtual {p4, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    if-eqz p4, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, LUb/d;->o()LGf/O;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance p4, Lmb/b$f;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-direct {p4, p2, p0, p3, v2}, Lmb/b$f;-><init>(Ljava/net/URI;Lmb/b;Ljava/io/File;LZd/e;)V

    .line 107
    .line 108
    .line 109
    iput v3, v0, Lmb/b$e;->c:I

    .line 110
    .line 111
    invoke-static {p1, p4, v0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    if-ne p4, v1, :cond_4

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_4
    :goto_2
    const-string p1, "withContext(...)"

    .line 119
    .line 120
    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object p4

    .line 124
    :cond_5
    new-instance p1, Lmb/f;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    const-string p3, "toString(...)"

    .line 131
    .line 132
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p1, p2}, Lmb/f;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    const-string p2, "Required value was null."

    .line 142
    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1
.end method

.method private final C()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/e;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/e;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final D(Ljava/net/URI;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "toString(...)"

    .line 12
    .line 13
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, LDf/d;->b:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "getBytes(...)"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string p1, "digest(...)"

    .line 32
    .line 33
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v8, Lmb/a;

    .line 37
    .line 38
    invoke-direct {v8}, Lmb/a;-><init>()V

    .line 39
    .line 40
    .line 41
    const/16 v9, 0x1e

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    const-string v3, ""

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-static/range {v2 .. v10}, LUd/n;->w0([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method private static final E(B)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "%02x"

    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "format(...)"

    .line 21
    .line 22
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static synthetic x(B)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lmb/b;->E(B)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic y(Lmb/b;LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lmb/b;->B(LUb/d;Ljava/net/URI;Ljava/io/File;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lmb/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lmb/b;->C()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 15

    .line 1
    const-class v0, Ljava/net/URI;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoAsset"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "downloadAsync"

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lhc/f;->b(Ljava/lang/String;)Ldc/b;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, Ldc/p;

    .line 73
    .line 74
    invoke-virtual {v3}, Ldc/b;->c()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v3}, Ldc/b;->b()Lpc/X;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    sget-object v7, Lpc/d;->a:Lpc/d;

    .line 83
    .line 84
    new-instance v8, Lkotlin/Pair;

    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, Lpc/b;

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    if-nez v8, :cond_0

    .line 107
    .line 108
    sget-object v8, Lmb/b$a;->a:Lmb/b$a;

    .line 109
    .line 110
    new-instance v11, Lpc/b;

    .line 111
    .line 112
    new-instance v12, Lpc/M;

    .line 113
    .line 114
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-direct {v12, v0, v9, v8}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v11, v12, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 122
    .line 123
    .line 124
    move-object v8, v11

    .line 125
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto :goto_1

    .line 128
    :cond_0
    :goto_0
    new-instance v0, Lkotlin/Pair;

    .line 129
    .line 130
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-direct {v0, v11, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lpc/b;

    .line 148
    .line 149
    if-nez v0, :cond_1

    .line 150
    .line 151
    sget-object v0, Lmb/b$b;->a:Lmb/b$b;

    .line 152
    .line 153
    new-instance v11, Lpc/b;

    .line 154
    .line 155
    new-instance v12, Lpc/M;

    .line 156
    .line 157
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    const/4 v14, 0x1

    .line 162
    invoke-direct {v12, v13, v14, v0}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v11, v12, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v11

    .line 169
    :cond_1
    new-instance v11, Lkotlin/Pair;

    .line 170
    .line 171
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7}, Lpc/d;->a()Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-interface {v7, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    check-cast v7, Lpc/b;

    .line 187
    .line 188
    if-nez v7, :cond_2

    .line 189
    .line 190
    sget-object v7, Lmb/b$c;->a:Lmb/b$c;

    .line 191
    .line 192
    new-instance v10, Lpc/b;

    .line 193
    .line 194
    new-instance v11, Lpc/M;

    .line 195
    .line 196
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v11, v1, v9, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {v10, v11, v6}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 204
    .line 205
    .line 206
    move-object v7, v10

    .line 207
    :cond_2
    filled-new-array {v8, v0, v7}, [Lpc/b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v1, Lmb/b$d;

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    invoke-direct {v1, v6, p0}, Lmb/b$d;-><init>(LZd/e;Lmb/b;)V

    .line 215
    .line 216
    .line 217
    invoke-direct {v4, v5, v0, v1}, Ldc/p;-><init>(Ljava/lang/String;[Lpc/b;Lie/o;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v4}, Ldc/b;->d(Ldc/g;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 224
    .line 225
    .line 226
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    invoke-static {}, LX3/a;->f()V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 232
    .line 233
    .line 234
    throw v0
.end method
