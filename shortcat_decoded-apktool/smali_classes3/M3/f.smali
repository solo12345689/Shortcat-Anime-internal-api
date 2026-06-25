.class public LM3/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LS3/h$c;

.field public final d:LM3/q$e;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:LM3/q$d;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Landroid/content/Intent;

.field public final k:Z

.field public final l:Z

.field private final m:Ljava/util/Set;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/io/File;

.field public final p:Ljava/util/concurrent/Callable;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LS3/h$c;LM3/q$e;Ljava/util/List;ZLM3/q$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LM3/q$f;Ljava/util/List;Ljava/util/List;)V
    .locals 4

    move-object v0, p10

    move-object/from16 v1, p18

    move-object/from16 v2, p19

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sqliteOpenHelperFactory"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "migrationContainer"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "journalMode"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "queryExecutor"

    invoke-static {p8, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "transactionExecutor"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "typeConverters"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "autoMigrationSpecs"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LM3/f;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, LM3/f;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LM3/f;->c:LS3/h$c;

    .line 5
    iput-object p4, p0, LM3/f;->d:LM3/q$e;

    .line 6
    iput-object p5, p0, LM3/f;->e:Ljava/util/List;

    .line 7
    iput-boolean p6, p0, LM3/f;->f:Z

    .line 8
    iput-object p7, p0, LM3/f;->g:LM3/q$d;

    .line 9
    iput-object p8, p0, LM3/f;->h:Ljava/util/concurrent/Executor;

    .line 10
    iput-object p9, p0, LM3/f;->i:Ljava/util/concurrent/Executor;

    .line 11
    iput-object v0, p0, LM3/f;->j:Landroid/content/Intent;

    move p1, p11

    .line 12
    iput-boolean p1, p0, LM3/f;->k:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, LM3/f;->l:Z

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, LM3/f;->m:Ljava/util/Set;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, LM3/f;->n:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, LM3/f;->o:Ljava/io/File;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, LM3/f;->p:Ljava/util/concurrent/Callable;

    .line 18
    iput-object v1, p0, LM3/f;->q:Ljava/util/List;

    .line 19
    iput-object v2, p0, LM3/f;->r:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, p0, LM3/f;->s:Z

    return-void
.end method


# virtual methods
.method public a(II)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-le p1, p2, :cond_0

    .line 3
    .line 4
    iget-boolean p2, p0, LM3/f;->l:Z

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-boolean p2, p0, LM3/f;->k:Z

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    iget-object p2, p0, LM3/f;->m:Ljava/util/Set;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    :cond_1
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_2
    return v0
.end method
