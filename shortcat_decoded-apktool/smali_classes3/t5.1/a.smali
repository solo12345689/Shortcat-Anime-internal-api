.class public Lt5/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt5/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/a$e;,
        Lt5/a$c;,
        Lt5/a$b;,
        Lt5/a$f;,
        Lt5/a$a;,
        Lt5/a$d;
    }
.end annotation


# static fields
.field private static final f:Ljava/lang/Class;

.field static final g:J


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Z

.field private final c:Ljava/io/File;

.field private final d:Ls5/a;

.field private final e:LF5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lt5/a;

    .line 2
    .line 3
    sput-object v0, Lt5/a;->f:Ljava/lang/Class;

    .line 4
    .line 5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    const-wide/16 v1, 0x1e

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sput-wide v0, Lt5/a;->g:J

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/io/File;ILs5/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ly5/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lt5/a;->a:Ljava/io/File;

    .line 8
    .line 9
    invoke-static {p1, p3}, Lt5/a;->y(Ljava/io/File;Ls5/a;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-boolean v0, p0, Lt5/a;->b:Z

    .line 14
    .line 15
    new-instance v0, Ljava/io/File;

    .line 16
    .line 17
    invoke-static {p2}, Lt5/a;->x(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lt5/a;->c:Ljava/io/File;

    .line 25
    .line 26
    iput-object p3, p0, Lt5/a;->d:Ls5/a;

    .line 27
    .line 28
    invoke-direct {p0}, Lt5/a;->B()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, LF5/d;->a()LF5/d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lt5/a;->e:LF5/a;

    .line 36
    .line 37
    return-void
.end method

.method private A(Ljava/lang/String;Z)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lt5/a;->q(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p2, p0, Lt5/a;->e:LF5/a;

    .line 14
    .line 15
    invoke-interface {p2}, LF5/a;->now()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return v0
.end method

.method private B()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt5/a;->a:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lt5/a;->c:Ljava/io/File;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lt5/a;->a:Ljava/io/File;

    .line 19
    .line 20
    invoke-static {v0}, Lx5/a;->b(Ljava/io/File;)Z

    .line 21
    .line 22
    .line 23
    :goto_0
    :try_start_0
    iget-object v0, p0, Lt5/a;->c:Ljava/io/File;

    .line 24
    .line 25
    invoke-static {v0}, Lx5/c;->a(Ljava/io/File;)V
    :try_end_0
    .catch Lx5/c$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    iget-object v0, p0, Lt5/a;->d:Ls5/a;

    .line 30
    .line 31
    sget-object v1, Ls5/a$a;->k:Ls5/a$a;

    .line 32
    .line 33
    sget-object v2, Lt5/a;->f:Ljava/lang/Class;

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v4, "version directory could not be created: "

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lt5/a;->c:Ljava/io/File;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-interface {v0, v1, v2, v3, v4}, Ls5/a;->a(Ls5/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method static bridge synthetic i(Lt5/a;)Ls5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/a;->d:Ls5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic j(Lt5/a;)LF5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/a;->e:LF5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic k(Lt5/a;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/a;->a:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic l(Lt5/a;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lt5/a;->c:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic m(Lt5/a;Ljava/io/File;)Lt5/a$c;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lt5/a;->u(Ljava/io/File;)Lt5/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static bridge synthetic n()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lt5/a;->f:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method static bridge synthetic o(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lt5/a;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private p(Ljava/io/File;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    return-wide v0

    .line 21
    :cond_1
    const-wide/16 v0, -0x1

    .line 22
    .line 23
    return-wide v0
.end method

.method private static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ".cnt"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, ".tmp"

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method private t(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lt5/a$c;

    .line 2
    .line 3
    const-string v1, ".cnt"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, p1, v2}, Lt5/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lt5/b;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, Lt5/a$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lt5/a;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lt5/a$c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method private u(Ljava/io/File;)Lt5/a$c;
    .locals 3

    .line 1
    invoke-static {p1}, Lt5/a$c;->b(Ljava/io/File;)Lt5/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v2, v0, Lt5/a$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, v2}, Lt5/a;->v(Ljava/lang/String;)Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v2, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    return-object v1
.end method

.method private v(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt5/a;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private w(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    rem-int/lit8 p1, p1, 0x64

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lt5/a;->c:Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method static x(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "v2"

    .line 12
    .line 13
    filled-new-array {v1, v0, p0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x0

    .line 18
    const-string v1, "%s.ols%d.%d"

    .line 19
    .line 20
    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private static y(Ljava/io/File;Ls5/a;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    :try_start_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :catch_1
    move-exception v1

    .line 24
    goto :goto_0

    .line 25
    :catch_2
    move-exception v1

    .line 26
    const/4 p0, 0x0

    .line 27
    :goto_0
    :try_start_3
    sget-object v2, Ls5/a$a;->q:Ls5/a$a;

    .line 28
    .line 29
    sget-object v3, Lt5/a;->f:Ljava/lang/Class;

    .line 30
    .line 31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v5, "failed to read folder to check if external: "

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p1, v2, v3, p0, v1}, Ls5/a;->a(Ls5/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    sget-object v1, Ls5/a$a;->q:Ls5/a$a;

    .line 53
    .line 54
    sget-object v2, Lt5/a;->f:Ljava/lang/Class;

    .line 55
    .line 56
    const-string v3, "failed to get the external storage directory!"

    .line 57
    .line 58
    invoke-interface {p1, v1, v2, v3, p0}, Ls5/a;->a(Ls5/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    :goto_2
    return v0
.end method

.method private z(Ljava/io/File;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p1}, Lx5/c;->a(Ljava/io/File;)V
    :try_end_0
    .catch Lx5/c$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    iget-object v0, p0, Lt5/a;->d:Ls5/a;

    .line 7
    .line 8
    sget-object v1, Ls5/a$a;->k:Ls5/a$a;

    .line 9
    .line 10
    sget-object v2, Lt5/a;->f:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2, p2, p1}, Ls5/a;->a(Ls5/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/a;->a:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {v0}, Lx5/a;->a(Ljava/io/File;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt5/a;->a:Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Lt5/a$f;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lt5/a$f;-><init>(Lt5/a;Lt5/b;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lx5/a;->c(Ljava/io/File;Lx5/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Lt5/a;->A(Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)Lt5/f$b;
    .locals 3

    .line 1
    new-instance p2, Lt5/a$c;

    .line 2
    .line 3
    const-string v0, ".tmp"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p2, v0, p1, v1}, Lt5/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Lt5/b;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p2, Lt5/a$c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lt5/a;->v(Ljava/lang/String;)Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "insert"

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-direct {p0, v0, v2}, Lt5/a;->z(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {p2, v0}, Lt5/a$c;->a(Ljava/io/File;)Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Lt5/a$e;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1, p2}, Lt5/a$e;-><init>(Lt5/a;Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :catch_0
    move-exception p1

    .line 37
    iget-object p2, p0, Lt5/a;->d:Ls5/a;

    .line 38
    .line 39
    sget-object v0, Ls5/a$a;->f:Ls5/a$a;

    .line 40
    .line 41
    sget-object v1, Lt5/a;->f:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-interface {p2, v0, v1, v2, p1}, Ls5/a;->a(Ls5/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lt5/a;->A(Ljava/lang/String;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/Object;)Lr5/a;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lt5/a;->q(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lt5/a;->e:LF5/a;

    .line 12
    .line 13
    invoke-interface {p2}, LF5/a;->now()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/io/File;->setLastModified(J)Z

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lr5/b;->c(Ljava/io/File;)Lr5/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public bridge synthetic g()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt5/a;->r()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lt5/f$a;)J
    .locals 2

    .line 1
    check-cast p1, Lt5/a$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lt5/a$b;->a()Lr5/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lr5/b;->d()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lt5/a;->p(Ljava/io/File;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt5/a;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method q(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lt5/a;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public r()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lt5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lt5/a$a;-><init>(Lt5/a;Lt5/b;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lt5/a;->c:Ljava/io/File;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lx5/a;->c(Ljava/io/File;Lx5/b;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lt5/a$a;->d()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public remove(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lt5/a;->q(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lt5/a;->p(Ljava/io/File;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
