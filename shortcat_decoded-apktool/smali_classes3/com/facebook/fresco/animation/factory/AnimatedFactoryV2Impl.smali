.class public Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls6/a;


# instance fields
.field private final a:Lw6/d;

.field private final b:Lz6/p;

.field private final c:Lx6/n;

.field private final d:Z

.field private e:Ls6/d;

.field private f:Lt6/b;

.field private g:Lu6/a;

.field private h:LD6/a;

.field private i:Lw5/g;

.field private j:I

.field private final k:Z

.field private l:I


# direct methods
.method public constructor <init>(Lw6/d;Lz6/p;Lx6/n;ZZIILw5/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw6/d;",
            "Lz6/p;",
            "Lx6/n;",
            "ZZII",
            "Lw5/g;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->a:Lw6/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->b:Lz6/p;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->c:Lx6/n;

    .line 9
    .line 10
    iput p6, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->j:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->k:Z

    .line 13
    .line 14
    iput-boolean p4, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->d:Z

    .line 15
    .line 16
    iput-object p8, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->i:Lw5/g;

    .line 17
    .line 18
    iput p7, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->l:I

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic d(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;LE6/k;ILE6/p;Ly6/d;)LE6/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->n()Ls6/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p2, p4, Ly6/d;->i:Landroid/graphics/Bitmap$Config;

    .line 6
    .line 7
    invoke-interface {p0, p1, p4, p2}, Ls6/d;->a(LE6/k;Ly6/d;Landroid/graphics/Bitmap$Config;)LE6/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic e()Ljava/lang/Integer;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static synthetic f()Ljava/lang/Integer;
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method static bridge synthetic g(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic h(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)Lu6/a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->m()Lu6/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static bridge synthetic i(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)Ls6/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->n()Ls6/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private j()Ls6/d;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$c;-><init>(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ls6/e;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->a:Lw6/d;

    .line 9
    .line 10
    iget-boolean v3, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->k:Z

    .line 11
    .line 12
    invoke-direct {v1, v0, v2, v3}, Ls6/e;-><init>(Lt6/b;Lw6/d;Z)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method private k()Li6/d;
    .locals 14

    .line 1
    new-instance v7, Li6/b;

    .line 2
    .line 3
    invoke-direct {v7}, Li6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->i:Lw5/g;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lw5/d;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->b:Lz6/p;

    .line 13
    .line 14
    invoke-interface {v1}, Lz6/p;->d()Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Lw5/d;-><init>(Ljava/util/concurrent/Executor;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    move-object v3, v0

    .line 22
    new-instance v8, Li6/c;

    .line 23
    .line 24
    invoke-direct {v8}, Li6/c;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v9, Ly5/o;->b:Ly5/n;

    .line 28
    .line 29
    new-instance v0, Li6/d;

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->l()Lt6/b;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Lw5/i;->o()Lw5/i;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {}, Lcom/facebook/common/time/RealtimeSinceBootClock;->get()Lcom/facebook/common/time/RealtimeSinceBootClock;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->a:Lw6/d;

    .line 44
    .line 45
    iget-object v6, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->c:Lx6/n;

    .line 46
    .line 47
    iget-boolean v10, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->k:Z

    .line 48
    .line 49
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-static {v10}, Ly5/o;->a(Ljava/lang/Object;)Ly5/n;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    iget-boolean v11, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->d:Z

    .line 58
    .line 59
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-static {v11}, Ly5/o;->a(Ljava/lang/Object;)Ly5/n;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    iget v12, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->j:I

    .line 68
    .line 69
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-static {v12}, Ly5/o;->a(Ljava/lang/Object;)Ly5/n;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    iget v13, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->l:I

    .line 78
    .line 79
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    invoke-static {v13}, Ly5/o;->a(Ljava/lang/Object;)Ly5/n;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-direct/range {v0 .. v13}, Li6/d;-><init>(Lt6/b;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;LF5/b;Lw6/d;Lx6/n;Ly5/n;Ly5/n;Ly5/n;Ly5/n;Ly5/n;Ly5/n;Ly5/n;)V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method

.method private l()Lt6/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->f:Lt6/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$b;-><init>(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->f:Lt6/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->f:Lt6/b;

    .line 13
    .line 14
    return-object v0
.end method

.method private m()Lu6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->g:Lu6/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lu6/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lu6/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->g:Lu6/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->g:Lu6/a;

    .line 13
    .line 14
    return-object v0
.end method

.method private n()Ls6/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->e:Ls6/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->j()Ls6/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->e:Ls6/d;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->e:Ls6/d;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)LD6/a;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->h:LD6/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->k()Li6/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->h:LD6/a;

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;->h:LD6/a;

    .line 12
    .line 13
    return-object p1
.end method

.method public b()LC6/c;
    .locals 1

    .line 1
    new-instance v0, Li6/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li6/a;-><init>(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public c()LC6/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl$a;-><init>(Lcom/facebook/fresco/animation/factory/AnimatedFactoryV2Impl;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
