.class public final Ldg/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/c$a;,
        Ldg/c$b;,
        Ldg/c$c;,
        Ldg/c$d;
    }
.end annotation


# static fields
.field public static final g:Ldg/c$b;


# instance fields
.field private final a:Lhg/d;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldg/c$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldg/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldg/c;->g:Ldg/c$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;J)V
    .locals 1

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lng/a;->b:Lng/a;

    invoke-direct {p0, p1, p2, p3, v0}, Ldg/c;-><init>(Ljava/io/File;JLng/a;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;JLng/a;)V
    .locals 9

    const-string v0, "directory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileSystem"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Lhg/d;

    const/4 v5, 0x2

    .line 3
    sget-object v8, Lig/e;->i:Lig/e;

    const v4, 0x31191

    move-object v3, p1

    move-wide v6, p2

    move-object v2, p4

    .line 4
    invoke-direct/range {v1 .. v8}, Lhg/d;-><init>(Lng/a;Ljava/io/File;IIJLig/e;)V

    iput-object v1, p0, Ldg/c;->a:Lhg/d;

    return-void
.end method

.method private final a(Lhg/d$b;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Lhg/d$b;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ldg/C;)Ldg/E;
    .locals 4

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldg/c;->g:Ldg/c$b;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldg/C;->p()Ldg/u;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ldg/c$b;->b(Ldg/u;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :try_start_0
    iget-object v2, p0, Ldg/c;->a:Lhg/d;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lhg/d;->D(Ljava/lang/String;)Lhg/d$d;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    :try_start_1
    new-instance v2, Ldg/c$c;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v0, v3}, Lhg/d$d;->b(I)Ltg/Z;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v2, v3}, Ldg/c$c;-><init>(Ltg/Z;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ldg/c$c;->d(Lhg/d$d;)Ldg/E;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, p1, v0}, Ldg/c$c;->b(Ldg/C;Ldg/E;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ldg/E;->j()Ldg/F;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-static {p1}, Lfg/e;->m(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-object v1

    .line 56
    :cond_2
    return-object v0

    .line 57
    :catch_0
    invoke-static {v0}, Lfg/e;->m(Ljava/io/Closeable;)V

    .line 58
    .line 59
    .line 60
    :catch_1
    return-object v1
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c;->a:Lhg/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhg/d;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c;->a:Lhg/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhg/d;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Ldg/c;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final j(Ldg/E;)Lhg/b;
    .locals 9

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ldg/C;->l()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lkg/f;->a:Lkg/f;

    .line 15
    .line 16
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ldg/C;->l()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lkg/f;->a(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ldg/c;->k(Ldg/C;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    :catch_0
    return-object v2

    .line 39
    :cond_0
    const-string v1, "GET"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    sget-object v0, Ldg/c;->g:Ldg/c$b;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ldg/c$b;->a(Ldg/E;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_2
    new-instance v1, Ldg/c$c;

    .line 58
    .line 59
    invoke-direct {v1, p1}, Ldg/c$c;-><init>(Ldg/E;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    iget-object v3, p0, Ldg/c;->a:Lhg/d;

    .line 63
    .line 64
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ldg/C;->p()Ldg/u;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Ldg/c$b;->b(Ldg/u;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v7, 0x2

    .line 77
    const/4 v8, 0x0

    .line 78
    const-wide/16 v5, 0x0

    .line 79
    .line 80
    invoke-static/range {v3 .. v8}, Lhg/d;->C(Lhg/d;Ljava/lang/String;JILjava/lang/Object;)Lhg/d$b;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    if-nez p1, :cond_3

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_3
    :try_start_2
    invoke-virtual {v1, p1}, Ldg/c$c;->f(Lhg/d$b;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Ldg/c$d;

    .line 91
    .line 92
    invoke-direct {v0, p0, p1}, Ldg/c$d;-><init>(Ldg/c;Lhg/d$b;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :catch_1
    move-object p1, v2

    .line 97
    :catch_2
    invoke-direct {p0, p1}, Ldg/c;->a(Lhg/d$b;)V

    .line 98
    .line 99
    .line 100
    return-object v2
.end method

.method public final k(Ldg/C;)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/c;->a:Lhg/d;

    .line 7
    .line 8
    sget-object v1, Ldg/c;->g:Ldg/c$b;

    .line 9
    .line 10
    invoke-virtual {p1}, Ldg/C;->p()Ldg/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ldg/c$b;->b(Ldg/u;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lhg/d;->G0(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final l(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldg/c;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final m(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldg/c;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public final declared-synchronized o()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldg/c;->e:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Ldg/c;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final declared-synchronized q(Lhg/c;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "cacheStrategy"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Ldg/c;->f:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Ldg/c;->f:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lhg/c;->b()Ldg/C;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget p1, p0, Ldg/c;->d:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    iput p1, p0, Ldg/c;->d:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p1}, Lhg/c;->a()Ldg/E;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget p1, p0, Ldg/c;->e:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    iput p1, p0, Ldg/c;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    :cond_1
    :goto_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p1
.end method

.method public final w(Ldg/E;Ldg/E;)V
    .locals 1

    .line 1
    const-string v0, "cached"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "network"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ldg/c$c;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Ldg/c$c;-><init>(Ldg/E;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ldg/E;->j()Ldg/F;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"

    .line 21
    .line 22
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Ldg/c$a;

    .line 26
    .line 27
    invoke-virtual {p1}, Ldg/c$a;->m()Lhg/d$d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :try_start_0
    invoke-virtual {p1}, Lhg/d$d;->a()Lhg/d$b;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Ldg/c$c;->f(Lhg/d$b;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lhg/d$b;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    const/4 p1, 0x0

    .line 46
    :catch_1
    invoke-direct {p0, p1}, Ldg/c;->a(Lhg/d$b;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
