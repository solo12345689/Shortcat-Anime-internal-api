.class public final Ltd/f;
.super Landroid/os/Handler;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltd/f$a;,
        Ltd/f$b;,
        Ltd/f$c;
    }
.end annotation


# static fields
.field public static final h:Ltd/f$a;


# instance fields
.field private final a:Ltd/d;

.field private final b:Lxd/g;

.field private final c:Ljava/util/ArrayList;

.field private d:Z

.field private e:Z

.field private f:Z

.field private final g:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltd/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltd/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltd/f;->h:Ltd/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;Ltd/d;Lxd/g;)V
    .locals 1

    .line 1
    const-string v0, "looper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "delegate"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Ltd/f;->a:Ltd/d;

    .line 20
    .line 21
    iput-object p3, p0, Ltd/f;->b:Lxd/g;

    .line 22
    .line 23
    sget-object p1, Ltd/f$b;->a:Ltd/f$b;

    .line 24
    .line 25
    sget-object p2, Ltd/f$b;->b:Ltd/f$b;

    .line 26
    .line 27
    sget-object p3, Ltd/f$b;->c:Ltd/f$b;

    .line 28
    .line 29
    sget-object v0, Ltd/f$b;->d:Ltd/f$b;

    .line 30
    .line 31
    filled-new-array {p1, p2, p3, v0}, [Ltd/f$b;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, LUd/u;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance p1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ltd/f;->g:Ljava/util/ArrayList;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Ltd/f;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ltd/f;->m(Ltd/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Ltd/f;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltd/f;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Ltd/f;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Ltd/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltd/f;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic e(Ltd/f;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ltd/f;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 2
    .line 3
    iget-object v1, p0, Ltd/f;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "get(...)"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Ljava/lang/Exception;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ltd/d;->d(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final g()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ltd/f;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    sget-object v1, Ltd/f$b;->a:Ltd/f$b;

    .line 7
    .line 8
    sget-object v2, Ltd/f$b;->d:Ltd/f$b;

    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ltd/f$b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/util/Collection;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->retainAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 24
    .line 25
    invoke-interface {v0}, Ltd/d;->b()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final h(Ltd/d$a;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltd/f;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Ltd/f;->e:Z

    .line 8
    .line 9
    sget-object v0, Ltd/d$a;->c:Ltd/d$a;

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v0, Ltd/f$b;->b:Ltd/f$b;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-direct {p0}, Ltd/f;->j()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final i(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltd/f;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ltd/f;->a:Ltd/d;

    .line 7
    .line 8
    invoke-interface {p1}, Ltd/d;->e()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    sget-object v0, Ltd/f$b;->c:Ltd/f$b;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-boolean p1, p0, Ltd/f;->f:Z

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Ltd/f;->a:Ltd/d;

    .line 27
    .line 28
    invoke-interface {p1}, Ltd/d;->f()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-boolean p1, p0, Ltd/f;->d:Z

    .line 32
    .line 33
    if-nez p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Ltd/f;->d:Z

    .line 37
    .line 38
    invoke-direct {p0}, Ltd/f;->j()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method private final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ltd/f$b;

    .line 9
    .line 10
    sget-object v2, Ltd/f$c;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v2, v0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eq v0, v2, :cond_3

    .line 22
    .line 23
    if-eq v0, v3, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-eq v0, v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    if-ne v0, v2, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Ltd/f;->b:Lxd/g;

    .line 32
    .line 33
    iget-object v2, p0, Ltd/f;->g:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "get(...)"

    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v1, Ljava/lang/Exception;

    .line 45
    .line 46
    sget-object v2, Lxd/b;->l:Lxd/b;

    .line 47
    .line 48
    const-string v3, "UpdatesErrorRecovery: could not recover from error, crashing"

    .line 49
    .line 50
    invoke-virtual {v0, v3, v1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Ltd/f;->f()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance v0, LTd/r;

    .line 58
    .line 59
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    iget-object v0, p0, Ltd/f;->b:Lxd/g;

    .line 64
    .line 65
    const-string v1, "UpdatesErrorRecovery: falling back to older update"

    .line 66
    .line 67
    invoke-static {v0, v1, v4, v3, v4}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Ltd/f;->k()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    iget-object v0, p0, Ltd/f;->b:Lxd/g;

    .line 75
    .line 76
    const-string v1, "UpdatesErrorRecovery: launching new update"

    .line 77
    .line 78
    invoke-static {v0, v1, v4, v3, v4}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Ltd/f;->k()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    iget-object v0, p0, Ltd/f;->b:Lxd/g;

    .line 86
    .line 87
    const-string v1, "UpdatesErrorRecovery: attempting to fetch a new update, waiting"

    .line 88
    .line 89
    invoke-static {v0, v1, v4, v3, v4}, Lxd/g;->k(Lxd/g;Ljava/lang/String;Lxd/b;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Ltd/f;->l()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 2
    .line 3
    new-instance v1, Ltd/f$d;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ltd/f$d;-><init>(Ltd/f;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ltd/d;->c(Lvd/b$a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 2
    .line 3
    invoke-interface {v0}, Ltd/d;->g()Ltd/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ltd/d$a;->c:Ltd/d$a;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Ltd/f;->j()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v1, Ltd/d$a;->b:Ltd/d$a;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 20
    .line 21
    invoke-interface {v0}, Ltd/d;->h()Lexpo/modules/updates/d$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v2, Lexpo/modules/updates/d$a;->a:Lexpo/modules/updates/d$a;

    .line 26
    .line 27
    if-eq v0, v2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Ltd/f;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    sget-object v1, Ltd/f$b;->b:Ltd/f$b;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ltd/f;->j()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Ltd/f;->e:Z

    .line 43
    .line 44
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 45
    .line 46
    invoke-interface {v0}, Ltd/d;->g()Ltd/d$a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eq v0, v1, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Ltd/f;->a:Ltd/d;

    .line 53
    .line 54
    invoke-interface {v0}, Ltd/d;->a()V

    .line 55
    .line 56
    .line 57
    :cond_3
    new-instance v0, Ltd/e;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Ltd/e;-><init>(Ltd/f;)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v1, 0x1388

    .line 63
    .line 64
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private static final m(Ltd/f;)V
    .locals 1

    .line 1
    sget-object v0, Ltd/d$a;->a:Ltd/d$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ltd/f;->h(Ltd/d$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v0, "null cannot be cast to non-null type expo.modules.updates.errorrecovery.ErrorRecoveryDelegate.RemoteLoadStatus"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Ltd/d$a;

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ltd/f;->h(Ltd/d$a;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    iget p1, p1, Landroid/os/Message;->what:I

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "ErrorRecoveryHandler cannot handle message "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    invoke-direct {p0}, Ltd/f;->g()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 59
    .line 60
    const-string v0, "null cannot be cast to non-null type java.lang.Exception"

    .line 61
    .line 62
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Ljava/lang/Exception;

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ltd/f;->i(Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
