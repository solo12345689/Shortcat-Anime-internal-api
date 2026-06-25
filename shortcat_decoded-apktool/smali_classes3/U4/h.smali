.class LU4/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU4/f$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lp5/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU4/h$d;,
        LU4/h$f;,
        LU4/h$e;,
        LU4/h$b;,
        LU4/h$g;,
        LU4/h$h;,
        LU4/h$c;
    }
.end annotation


# static fields
.field public static final I:LS4/g;


# instance fields
.field private A:LS4/f;

.field private B:Ljava/lang/Object;

.field private C:LS4/a;

.field private D:Lcom/bumptech/glide/load/data/d;

.field private volatile E:LU4/f;

.field private volatile F:Z

.field private volatile G:Z

.field private H:Z

.field private final a:LU4/g;

.field private final b:Ljava/util/List;

.field private final c:Lp5/c;

.field private final d:LU4/h$e;

.field private final e:LK1/d;

.field private final f:LU4/h$d;

.field private final g:LU4/h$f;

.field private h:Lcom/bumptech/glide/d;

.field private i:LS4/f;

.field private j:Lcom/bumptech/glide/g;

.field private k:LU4/n;

.field private l:I

.field private m:I

.field private n:LU4/j;

.field private o:LS4/h;

.field private p:LU4/h$b;

.field private q:I

.field private r:LU4/h$h;

.field private s:LU4/h$g;

.field private t:J

.field private u:Z

.field private v:Ljava/lang/Object;

.field private w:Lcom/bumptech/glide/e;

.field private x:Ljava/util/function/Supplier;

.field private y:Ljava/lang/Thread;

.field private z:LS4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "glide_thread_priority_override"

    .line 2
    .line 3
    invoke-static {v0}, LS4/g;->e(Ljava/lang/String;)LS4/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LU4/h;->I:LS4/g;

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>(LU4/h$e;LK1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LU4/g;

    .line 5
    .line 6
    invoke-direct {v0}, LU4/g;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LU4/h;->a:LU4/g;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LU4/h;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, Lp5/c;->a()Lp5/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, LU4/h;->c:Lp5/c;

    .line 23
    .line 24
    new-instance v0, LU4/h$d;

    .line 25
    .line 26
    invoke-direct {v0}, LU4/h$d;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LU4/h;->f:LU4/h$d;

    .line 30
    .line 31
    new-instance v0, LU4/h$f;

    .line 32
    .line 33
    invoke-direct {v0}, LU4/h$f;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, LU4/h;->g:LU4/h$f;

    .line 37
    .line 38
    iput-object p1, p0, LU4/h;->d:LU4/h$e;

    .line 39
    .line 40
    iput-object p2, p0, LU4/h;->e:LK1/d;

    .line 41
    .line 42
    return-void
.end method

.method private A()V
    .locals 3

    .line 1
    iget-object v0, p0, LU4/h;->w:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LU4/h;->H()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, LU4/h;->L()V

    .line 15
    .line 16
    .line 17
    new-instance v0, LU4/q;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, LU4/h;->b:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "Failed to load resource"

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, LU4/q;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LU4/h;->p:LU4/h$b;

    .line 32
    .line 33
    invoke-interface {v1, v0}, LU4/h$b;->a(LU4/q;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, LU4/h;->C()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private B()V
    .locals 1

    .line 1
    iget-object v0, p0, LU4/h;->g:LU4/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, LU4/h$f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LU4/h;->F()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private C()V
    .locals 1

    .line 1
    iget-object v0, p0, LU4/h;->g:LU4/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, LU4/h$f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LU4/h;->F()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private F()V
    .locals 4

    .line 1
    iget-object v0, p0, LU4/h;->g:LU4/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, LU4/h$f;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/h;->f:LU4/h$d;

    .line 7
    .line 8
    invoke-virtual {v0}, LU4/h$d;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LU4/h;->a:LU4/g;

    .line 12
    .line 13
    invoke-virtual {v0}, LU4/g;->a()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, LU4/h;->F:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, LU4/h;->h:Lcom/bumptech/glide/d;

    .line 21
    .line 22
    iput-object v1, p0, LU4/h;->i:LS4/f;

    .line 23
    .line 24
    iput-object v1, p0, LU4/h;->o:LS4/h;

    .line 25
    .line 26
    iput-object v1, p0, LU4/h;->j:Lcom/bumptech/glide/g;

    .line 27
    .line 28
    iput-object v1, p0, LU4/h;->k:LU4/n;

    .line 29
    .line 30
    iput-object v1, p0, LU4/h;->p:LU4/h$b;

    .line 31
    .line 32
    iput-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 33
    .line 34
    iput-object v1, p0, LU4/h;->E:LU4/f;

    .line 35
    .line 36
    iput-object v1, p0, LU4/h;->y:Ljava/lang/Thread;

    .line 37
    .line 38
    iput-object v1, p0, LU4/h;->z:LS4/f;

    .line 39
    .line 40
    iput-object v1, p0, LU4/h;->B:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, p0, LU4/h;->C:LS4/a;

    .line 43
    .line 44
    iput-object v1, p0, LU4/h;->D:Lcom/bumptech/glide/load/data/d;

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    iput-wide v2, p0, LU4/h;->t:J

    .line 49
    .line 50
    iput-boolean v0, p0, LU4/h;->G:Z

    .line 51
    .line 52
    iput-object v1, p0, LU4/h;->v:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v0, p0, LU4/h;->b:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LU4/h;->e:LK1/d;

    .line 60
    .line 61
    invoke-interface {v0, p0}, LK1/d;->a(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private G(LU4/h$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/h;->s:LU4/h$g;

    .line 2
    .line 3
    iget-object p1, p0, LU4/h;->p:LU4/h$b;

    .line 4
    .line 5
    invoke-interface {p1, p0}, LU4/h$b;->c(LU4/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private H()V
    .locals 3

    .line 1
    iget-object v0, p0, LU4/h;->w:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LU4/h;->x:Ljava/util/function/Supplier;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception v0

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception v0

    .line 34
    :goto_0
    const/4 v1, 0x0

    .line 35
    iput-object v1, p0, LU4/h;->x:Ljava/util/function/Supplier;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    const-string v2, "DecodeJob"

    .line 39
    .line 40
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const-string v1, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 47
    .line 48
    invoke-static {v2, v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "OverrideGlideThreadPriority experiment is not enabled."

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method private I()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LU4/h;->y:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {}, Lo5/g;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, LU4/h;->t:J

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    iget-boolean v1, p0, LU4/h;->G:Z

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, LU4/h;->E:LU4/f;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, LU4/h;->E:LU4/f;

    .line 23
    .line 24
    invoke-interface {v0}, LU4/f;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 31
    .line 32
    invoke-direct {p0, v1}, LU4/h;->s(LU4/h$h;)LU4/h$h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 37
    .line 38
    invoke-direct {p0}, LU4/h;->r()LU4/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, LU4/h;->E:LU4/f;

    .line 43
    .line 44
    iget-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 45
    .line 46
    sget-object v2, LU4/h$h;->d:LU4/h$h;

    .line 47
    .line 48
    if-ne v1, v2, :cond_0

    .line 49
    .line 50
    sget-object v0, LU4/h$g;->b:LU4/h$g;

    .line 51
    .line 52
    invoke-direct {p0, v0}, LU4/h;->G(LU4/h$g;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 57
    .line 58
    sget-object v2, LU4/h$h;->f:LU4/h$h;

    .line 59
    .line 60
    if-eq v1, v2, :cond_2

    .line 61
    .line 62
    iget-boolean v1, p0, LU4/h;->G:Z

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    :cond_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-direct {p0}, LU4/h;->A()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method private J(Ljava/lang/Object;LS4/a;LU4/t;)LU4/v;
    .locals 6

    .line 1
    invoke-direct {p0, p2}, LU4/h;->t(LS4/a;)LS4/h;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v0, p0, LU4/h;->h:Lcom/bumptech/glide/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/bumptech/glide/d;->h()Lcom/bumptech/glide/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_0
    iget v3, p0, LU4/h;->l:I

    .line 16
    .line 17
    iget v4, p0, LU4/h;->m:I

    .line 18
    .line 19
    new-instance v5, LU4/h$c;

    .line 20
    .line 21
    invoke-direct {v5, p0, p2}, LU4/h$c;-><init>(LU4/h;LS4/a;)V

    .line 22
    .line 23
    .line 24
    move-object v0, p3

    .line 25
    invoke-virtual/range {v0 .. v5}, LU4/t;->a(Lcom/bumptech/glide/load/data/e;LS4/h;IILU4/i$a;)LU4/v;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->b()V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->b()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method private K()V
    .locals 3

    .line 1
    sget-object v0, LU4/h$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, LU4/h;->s:LU4/h$g;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, LU4/h;->q()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Unrecognized run reason: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, LU4/h;->s:LU4/h$g;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    invoke-direct {p0}, LU4/h;->I()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    sget-object v0, LU4/h$h;->a:LU4/h$h;

    .line 54
    .line 55
    invoke-direct {p0, v0}, LU4/h;->s(LU4/h$h;)LU4/h$h;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, LU4/h;->r:LU4/h$h;

    .line 60
    .line 61
    invoke-direct {p0}, LU4/h;->r()LU4/f;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, LU4/h;->E:LU4/f;

    .line 66
    .line 67
    invoke-direct {p0}, LU4/h;->I()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private L()V
    .locals 3

    .line 1
    iget-object v0, p0, LU4/h;->c:Lp5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp5/c;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LU4/h;->F:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LU4/h;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, LU4/h;->b:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-int/2addr v2, v1

    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v2, "Already notified"

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_1
    iput-boolean v1, p0, LU4/h;->F:Z

    .line 43
    .line 44
    return-void
.end method

.method private n(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;LS4/a;)LU4/v;
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Lo5/g;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-direct {p0, p2, p3}, LU4/h;->p(Ljava/lang/Object;LS4/a;)LU4/v;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string p3, "DecodeJob"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    new-instance p3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Decoded result "

    .line 31
    .line 32
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-direct {p0, p3, v0, v1}, LU4/h;->w(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :goto_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 53
    .line 54
    .line 55
    throw p2
.end method

.method private p(Ljava/lang/Object;LS4/a;)LU4/v;
    .locals 2

    .line 1
    iget-object v0, p0, LU4/h;->a:LU4/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LU4/g;->h(Ljava/lang/Class;)LU4/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, p1, p2, v0}, LU4/h;->J(Ljava/lang/Object;LS4/a;LU4/t;)LU4/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private q()V
    .locals 6

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-wide v2, p0, LU4/h;->t:J

    .line 11
    .line 12
    new-instance v4, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v5, "data: "

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v5, p0, LU4/h;->B:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v5, ", cache key: "

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, LU4/h;->z:LS4/f;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v5, ", fetcher: "

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, LU4/h;->D:Lcom/bumptech/glide/load/data/d;

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v5, "Retrieved data"

    .line 52
    .line 53
    invoke-direct {p0, v5, v2, v3, v4}, LU4/h;->x(Ljava/lang/String;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v2, p0, LU4/h;->w:Lcom/bumptech/glide/e;

    .line 57
    .line 58
    const-class v3, Lcom/bumptech/glide/c$d;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v3, 0x0

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iget-object v2, p0, LU4/h;->x:Ljava/util/function/Supplier;

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget-object v4, p0, LU4/h;->x:Ljava/util/function/Supplier;

    .line 82
    .line 83
    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-static {v2, v4}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception v2

    .line 98
    goto :goto_0

    .line 99
    :catch_1
    move-exception v2

    .line 100
    :goto_0
    iput-object v3, p0, LU4/h;->x:Ljava/util/function/Supplier;

    .line 101
    .line 102
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    const-string v1, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 109
    .line 110
    invoke-static {v0, v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 111
    .line 112
    .line 113
    :cond_1
    :goto_1
    :try_start_1
    iget-object v0, p0, LU4/h;->D:Lcom/bumptech/glide/load/data/d;

    .line 114
    .line 115
    iget-object v1, p0, LU4/h;->B:Ljava/lang/Object;

    .line 116
    .line 117
    iget-object v2, p0, LU4/h;->C:LS4/a;

    .line 118
    .line 119
    invoke-direct {p0, v0, v1, v2}, LU4/h;->n(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;LS4/a;)LU4/v;

    .line 120
    .line 121
    .line 122
    move-result-object v3
    :try_end_1
    .catch LU4/q; {:try_start_1 .. :try_end_1} :catch_2

    .line 123
    goto :goto_2

    .line 124
    :catch_2
    move-exception v0

    .line 125
    iget-object v1, p0, LU4/h;->A:LS4/f;

    .line 126
    .line 127
    iget-object v2, p0, LU4/h;->C:LS4/a;

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, LU4/q;->i(LS4/f;LS4/a;)V

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, LU4/h;->b:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_2
    if-eqz v3, :cond_2

    .line 138
    .line 139
    iget-object v0, p0, LU4/h;->C:LS4/a;

    .line 140
    .line 141
    iget-boolean v1, p0, LU4/h;->H:Z

    .line 142
    .line 143
    invoke-direct {p0, v3, v0, v1}, LU4/h;->z(LU4/v;LS4/a;Z)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_2
    invoke-direct {p0}, LU4/h;->I()V

    .line 148
    .line 149
    .line 150
    :goto_3
    return-void
.end method

.method private r()LU4/f;
    .locals 3

    .line 1
    sget-object v0, LU4/h$a;->b:[I

    .line 2
    .line 3
    iget-object v1, p0, LU4/h;->r:LU4/h$h;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "Unrecognized stage: "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, LU4/h;->r:LU4/h$h;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    new-instance v0, LU4/z;

    .line 51
    .line 52
    iget-object v1, p0, LU4/h;->a:LU4/g;

    .line 53
    .line 54
    invoke-direct {v0, v1, p0}, LU4/z;-><init>(LU4/g;LU4/f$a;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    new-instance v0, LU4/c;

    .line 59
    .line 60
    iget-object v1, p0, LU4/h;->a:LU4/g;

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, LU4/c;-><init>(LU4/g;LU4/f$a;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    new-instance v0, LU4/w;

    .line 67
    .line 68
    iget-object v1, p0, LU4/h;->a:LU4/g;

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, LU4/w;-><init>(LU4/g;LU4/f$a;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private s(LU4/h$h;)LU4/h$h;
    .locals 3

    .line 1
    sget-object v0, LU4/h$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_5

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, LU4/h;->n:LU4/j;

    .line 25
    .line 26
    invoke-virtual {p1}, LU4/j;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object p1, LU4/h$h;->b:LU4/h$h;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, LU4/h$h;->b:LU4/h$h;

    .line 36
    .line 37
    invoke-direct {p0, p1}, LU4/h;->s(LU4/h$h;)LU4/h$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "Unrecognized stage: "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    sget-object p1, LU4/h$h;->f:LU4/h$h;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    iget-boolean p1, p0, LU4/h;->u:Z

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    sget-object p1, LU4/h$h;->f:LU4/h$h;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_4
    sget-object p1, LU4/h$h;->d:LU4/h$h;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_5
    iget-object p1, p0, LU4/h;->n:LU4/j;

    .line 79
    .line 80
    invoke-virtual {p1}, LU4/j;->a()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    sget-object p1, LU4/h$h;->c:LU4/h$h;

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_6
    sget-object p1, LU4/h$h;->c:LU4/h$h;

    .line 90
    .line 91
    invoke-direct {p0, p1}, LU4/h;->s(LU4/h$h;)LU4/h$h;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
.end method

.method private t(LS4/a;)LS4/h;
    .locals 3

    .line 1
    iget-object v0, p0, LU4/h;->o:LS4/h;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v1, LS4/a;->d:LS4/a;

    .line 11
    .line 12
    if-eq p1, v1, :cond_2

    .line 13
    .line 14
    iget-object p1, p0, LU4/h;->a:LU4/g;

    .line 15
    .line 16
    invoke-virtual {p1}, LU4/g;->x()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 26
    :goto_1
    sget-object v1, Lb5/r;->j:LS4/g;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, LS4/h;->c(LS4/g;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    :cond_3
    return-object v0

    .line 45
    :cond_4
    new-instance v0, LS4/h;

    .line 46
    .line 47
    invoke-direct {v0}, LS4/h;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, LU4/h;->o:LS4/h;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, LS4/h;->d(LS4/h;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, v1, p1}, LS4/h;->e(LS4/g;Ljava/lang/Object;)LS4/h;

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method private u()I
    .locals 1

    .line 1
    iget-object v0, p0, LU4/h;->j:Lcom/bumptech/glide/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private w(Ljava/lang/String;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, LU4/h;->x(Ljava/lang/String;JLjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private x(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p3}, Lo5/g;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ", load key: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LU4/h;->k:LU4/n;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    if-eqz p4, :cond_0

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, ", "

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string p1, ""

    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, ", thread: "

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string p2, "DecodeJob"

    .line 77
    .line 78
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private y(LU4/v;LS4/a;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LU4/h;->w:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LU4/h;->H()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, LU4/h;->L()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LU4/h;->p:LU4/h$b;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2, p3}, LU4/h$b;->b(LU4/v;LS4/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private z(LU4/v;LS4/a;Z)V
    .locals 1

    .line 1
    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    .line 2
    .line 3
    invoke-static {v0}, Lp5/b;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    instance-of v0, p1, LU4/r;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, LU4/r;

    .line 12
    .line 13
    invoke-interface {v0}, LU4/r;->initialize()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_4

    .line 19
    :cond_0
    :goto_0
    iget-object v0, p0, LU4/h;->f:LU4/h$d;

    .line 20
    .line 21
    invoke-virtual {v0}, LU4/h$d;->c()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, LU4/u;->c(LU4/v;)LU4/u;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    move-object v0, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_1
    invoke-direct {p0, p1, p2, p3}, LU4/h;->y(LU4/v;LS4/a;Z)V

    .line 35
    .line 36
    .line 37
    sget-object p1, LU4/h$h;->e:LU4/h$h;

    .line 38
    .line 39
    iput-object p1, p0, LU4/h;->r:LU4/h$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    :try_start_1
    iget-object p1, p0, LU4/h;->f:LU4/h$d;

    .line 42
    .line 43
    invoke-virtual {p1}, LU4/h$d;->c()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, LU4/h;->f:LU4/h$d;

    .line 50
    .line 51
    iget-object p2, p0, LU4/h;->d:LU4/h$e;

    .line 52
    .line 53
    iget-object p3, p0, LU4/h;->o:LS4/h;

    .line 54
    .line 55
    invoke-virtual {p1, p2, p3}, LU4/h$d;->b(LU4/h$e;LS4/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_2
    if-eqz v0, :cond_3

    .line 62
    .line 63
    :try_start_2
    invoke-virtual {v0}, LU4/u;->e()V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-direct {p0}, LU4/h;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lp5/b;->e()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_3
    if-eqz v0, :cond_4

    .line 74
    .line 75
    :try_start_3
    invoke-virtual {v0}, LU4/u;->e()V

    .line 76
    .line 77
    .line 78
    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :goto_4
    invoke-static {}, Lp5/b;->e()V

    .line 80
    .line 81
    .line 82
    throw p1
.end method


# virtual methods
.method D(LS4/a;LU4/v;)LU4/v;
    .locals 11

    .line 1
    invoke-interface {p2}, LU4/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    sget-object v0, LS4/a;->d:LS4/a;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LU4/h;->a:LU4/g;

    .line 15
    .line 16
    invoke-virtual {v0, v8}, LU4/g;->s(Ljava/lang/Class;)LS4/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, p0, LU4/h;->h:Lcom/bumptech/glide/d;

    .line 21
    .line 22
    iget v3, p0, LU4/h;->l:I

    .line 23
    .line 24
    iget v4, p0, LU4/h;->m:I

    .line 25
    .line 26
    invoke-interface {v0, v2, p2, v3, v4}, LS4/l;->a(Landroid/content/Context;LU4/v;II)LU4/v;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v7, v0

    .line 31
    move-object v0, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, p2

    .line 34
    move-object v7, v1

    .line 35
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-interface {p2}, LU4/v;->recycle()V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p2, p0, LU4/h;->a:LU4/g;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, LU4/g;->w(LU4/v;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p0, LU4/h;->a:LU4/g;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, LU4/g;->n(LU4/v;)LS4/k;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p2, p0, LU4/h;->o:LS4/h;

    .line 59
    .line 60
    invoke-interface {v1, p2}, LS4/k;->a(LS4/h;)LS4/c;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :goto_1
    move-object v10, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    sget-object p2, LS4/c;->c:LS4/c;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_2
    iget-object v1, p0, LU4/h;->a:LU4/g;

    .line 70
    .line 71
    iget-object v2, p0, LU4/h;->z:LS4/f;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, LU4/g;->y(LS4/f;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/4 v2, 0x1

    .line 78
    xor-int/2addr v1, v2

    .line 79
    iget-object v3, p0, LU4/h;->n:LU4/j;

    .line 80
    .line 81
    invoke-virtual {v3, v1, p1, p2}, LU4/j;->d(ZLS4/a;LS4/c;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    if-eqz v10, :cond_5

    .line 88
    .line 89
    sget-object p1, LU4/h$a;->c:[I

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    aget p1, p1, v1

    .line 96
    .line 97
    if-eq p1, v2, :cond_4

    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    if-ne p1, v1, :cond_3

    .line 101
    .line 102
    new-instance v1, LU4/x;

    .line 103
    .line 104
    iget-object p1, p0, LU4/h;->a:LU4/g;

    .line 105
    .line 106
    invoke-virtual {p1}, LU4/g;->b()LV4/b;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v3, p0, LU4/h;->z:LS4/f;

    .line 111
    .line 112
    iget-object v4, p0, LU4/h;->i:LS4/f;

    .line 113
    .line 114
    iget v5, p0, LU4/h;->l:I

    .line 115
    .line 116
    iget v6, p0, LU4/h;->m:I

    .line 117
    .line 118
    iget-object v9, p0, LU4/h;->o:LS4/h;

    .line 119
    .line 120
    invoke-direct/range {v1 .. v9}, LU4/x;-><init>(LV4/b;LS4/f;LS4/f;IILS4/l;Ljava/lang/Class;LS4/h;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "Unknown strategy: "

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_4
    new-instance v1, LU4/d;

    .line 148
    .line 149
    iget-object p1, p0, LU4/h;->z:LS4/f;

    .line 150
    .line 151
    iget-object p2, p0, LU4/h;->i:LS4/f;

    .line 152
    .line 153
    invoke-direct {v1, p1, p2}, LU4/d;-><init>(LS4/f;LS4/f;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-static {v0}, LU4/u;->c(LU4/v;)LU4/u;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p2, p0, LU4/h;->f:LU4/h$d;

    .line 161
    .line 162
    invoke-virtual {p2, v1, v10, p1}, LU4/h$d;->d(LS4/f;LS4/k;LU4/u;)V

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :cond_5
    new-instance p1, Lcom/bumptech/glide/h$d;

    .line 167
    .line 168
    invoke-interface {v0}, LU4/v;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-direct {p1, p2}, Lcom/bumptech/glide/h$d;-><init>(Ljava/lang/Class;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_6
    return-object v0
.end method

.method E(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LU4/h;->g:LU4/h$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU4/h$f;->d(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LU4/h;->F()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method M()Z
    .locals 2

    .line 1
    sget-object v0, LU4/h$h;->a:LU4/h$h;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LU4/h;->s(LU4/h$h;)LU4/h$h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LU4/h$h;->b:LU4/h$h;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, LU4/h$h;->c:LU4/h$h;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public a(LS4/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;LS4/a;LS4/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/h;->z:LS4/f;

    .line 2
    .line 3
    iput-object p2, p0, LU4/h;->B:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LU4/h;->D:Lcom/bumptech/glide/load/data/d;

    .line 6
    .line 7
    iput-object p4, p0, LU4/h;->C:LS4/a;

    .line 8
    .line 9
    iput-object p5, p0, LU4/h;->A:LS4/f;

    .line 10
    .line 11
    iget-object p2, p0, LU4/h;->a:LU4/g;

    .line 12
    .line 13
    invoke-virtual {p2}, LU4/g;->c()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    :cond_0
    iput-boolean p3, p0, LU4/h;->H:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, LU4/h;->y:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eq p1, p2, :cond_1

    .line 34
    .line 35
    sget-object p1, LU4/h$g;->c:LU4/h$g;

    .line 36
    .line 37
    invoke-direct {p0, p1}, LU4/h;->G(LU4/h$g;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    .line 42
    .line 43
    invoke-static {p1}, Lp5/b;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-direct {p0}, LU4/h;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lp5/b;->e()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    invoke-static {}, Lp5/b;->e()V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LU4/h;->G:Z

    .line 3
    .line 4
    iget-object v0, p0, LU4/h;->E:LU4/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, LU4/f;->cancel()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public c(LS4/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;LS4/a;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LU4/q;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, LU4/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p1, p4, p2}, LU4/q;->j(LS4/f;LS4/a;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LU4/h;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, LU4/h;->y:Ljava/lang/Thread;

    .line 28
    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    sget-object p1, LU4/h$g;->b:LU4/h$g;

    .line 32
    .line 33
    invoke-direct {p0, p1}, LU4/h;->G(LU4/h$g;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-direct {p0}, LU4/h;->I()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LU4/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LU4/h;->m(LU4/h;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h()Lp5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LU4/h;->c:Lp5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()V
    .locals 1

    .line 1
    sget-object v0, LU4/h$g;->b:LU4/h$g;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LU4/h;->G(LU4/h$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(LU4/h;)I
    .locals 2

    .line 1
    invoke-direct {p0}, LU4/h;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p1}, LU4/h;->u()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, LU4/h;->q:I

    .line 13
    .line 14
    iget p1, p1, LU4/h;->q:I

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    :cond_0
    return v0
.end method

.method public run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    iget-object v1, p0, LU4/h;->s:LU4/h$g;

    .line 4
    .line 5
    iget-object v2, p0, LU4/h;->v:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "DecodeJob#run(reason=%s, model=%s)"

    .line 8
    .line 9
    invoke-static {v3, v1, v2}, Lp5/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LU4/h;->D:Lcom/bumptech/glide/load/data/d;

    .line 13
    .line 14
    :try_start_0
    iget-boolean v2, p0, LU4/h;->G:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, LU4/h;->A()V
    :try_end_0
    .catch LU4/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {}, Lp5/b;->e()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :try_start_1
    invoke-direct {p0}, LU4/h;->K()V
    :try_end_1
    .catch LU4/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-static {}, Lp5/b;->e()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_0
    const/4 v3, 0x3

    .line 47
    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-boolean v4, p0, LU4/h;->G:Z

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v4, ", stage: "

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, LU4/h;->r:LU4/h$h;

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    :goto_1
    iget-object v0, p0, LU4/h;->r:LU4/h$h;

    .line 89
    .line 90
    sget-object v3, LU4/h$h;->e:LU4/h$h;

    .line 91
    .line 92
    if-eq v0, v3, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, LU4/h;->b:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, LU4/h;->A()V

    .line 100
    .line 101
    .line 102
    :cond_4
    iget-boolean v0, p0, LU4/h;->G:Z

    .line 103
    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    throw v2

    .line 107
    :cond_5
    throw v2

    .line 108
    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 109
    :goto_3
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-static {}, Lp5/b;->e()V

    .line 115
    .line 116
    .line 117
    throw v0
.end method

.method v(Lcom/bumptech/glide/d;Ljava/lang/Object;LU4/n;LS4/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LU4/j;Ljava/util/Map;ZZZLS4/h;LU4/h$b;I)LU4/h;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, LU4/h;->a:LU4/g;

    iget-object v15, v0, LU4/h;->d:LU4/h$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v7, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v11, p15

    invoke-virtual/range {v1 .. v15}, LU4/g;->v(Lcom/bumptech/glide/d;Ljava/lang/Object;LS4/f;IILU4/j;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LS4/h;Ljava/util/Map;ZZLU4/h$e;)V

    .line 2
    iput-object v2, v0, LU4/h;->h:Lcom/bumptech/glide/d;

    .line 3
    iput-object v4, v0, LU4/h;->i:LS4/f;

    .line 4
    iput-object v10, v0, LU4/h;->j:Lcom/bumptech/glide/g;

    move-object/from16 v1, p3

    .line 5
    iput-object v1, v0, LU4/h;->k:LU4/n;

    .line 6
    iput v5, v0, LU4/h;->l:I

    .line 7
    iput v6, v0, LU4/h;->m:I

    .line 8
    iput-object v7, v0, LU4/h;->n:LU4/j;

    move/from16 v1, p14

    .line 9
    iput-boolean v1, v0, LU4/h;->u:Z

    .line 10
    iput-object v11, v0, LU4/h;->o:LS4/h;

    move-object/from16 v1, p16

    .line 11
    iput-object v1, v0, LU4/h;->p:LU4/h$b;

    move/from16 v1, p17

    .line 12
    iput v1, v0, LU4/h;->q:I

    .line 13
    sget-object v1, LU4/h$g;->a:LU4/h$g;

    iput-object v1, v0, LU4/h;->s:LU4/h$g;

    .line 14
    iput-object v3, v0, LU4/h;->v:Ljava/lang/Object;

    .line 15
    invoke-virtual {v2}, Lcom/bumptech/glide/d;->f()Lcom/bumptech/glide/e;

    move-result-object v1

    iput-object v1, v0, LU4/h;->w:Lcom/bumptech/glide/e;

    .line 16
    sget-object v1, LU4/h;->I:LS4/g;

    invoke-virtual {v11, v1}, LS4/h;->c(LS4/g;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/function/Supplier;

    iput-object v1, v0, LU4/h;->x:Ljava/util/function/Supplier;

    return-object v0
.end method
