.class public final LFd/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final synthetic e:[Lpe/m;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private b:Landroid/os/Handler;

.field private final c:LGd/b;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 2
    .line 3
    const-class v1, LFd/o;

    .line 4
    .line 5
    const-string v2, "interval"

    .line 6
    .line 7
    const-string v3, "getInterval()J"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Lpe/m;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, LFd/o;->e:[Lpe/m;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(LFd/p;)V
    .locals 7

    .line 1
    const-string v0, "emitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LFd/o;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    new-instance p1, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LFd/o;->b:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v1, LGd/b;

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, LFd/l;

    .line 36
    .line 37
    invoke-direct {v4, p0}, LFd/l;-><init>(LFd/o;)V

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-direct/range {v1 .. v6}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, LFd/o;->c:LGd/b;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Lie/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, LFd/o;->h(Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LFd/o;JLjava/lang/Long;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LFd/o;->e(LFd/o;JLjava/lang/Long;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(LFd/o;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, LFd/o;->g(LFd/o;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(LFd/o;JLjava/lang/Long;)LTd/L;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-gtz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LFd/o;->k()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0}, LFd/o;->j()V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p0
.end method

.method private final f()V
    .locals 5

    .line 1
    invoke-virtual {p0}, LFd/o;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, LFd/m;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LFd/m;-><init>(LFd/o;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LFd/o;->b:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v2, LFd/n;

    .line 20
    .line 21
    invoke-direct {v2, v0}, LFd/n;-><init>(Lie/a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, LFd/o;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private static final g(LFd/o;)LTd/L;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/o;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LFd/p;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, LFd/p;->a()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, LFd/o;->f()V

    .line 15
    .line 16
    .line 17
    sget-object p0, LTd/L;->a:LTd/L;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final h(Lie/a;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LFd/o;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LFd/o;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LFd/p;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, LFd/p;->a()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, LFd/o;->b:Landroid/os/Handler;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LFd/o;->d:Z

    .line 27
    .line 28
    invoke-direct {p0}, LFd/o;->f()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final k()V
    .locals 2

    .line 1
    iget-object v0, p0, LFd/o;->b:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, LFd/o;->d:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()J
    .locals 3

    .line 1
    iget-object v0, p0, LFd/o;->c:LGd/b;

    .line 2
    .line 3
    sget-object v1, LFd/o;->e:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final i(J)V
    .locals 3

    .line 1
    iget-object v0, p0, LFd/o;->c:LGd/b;

    .line 2
    .line 3
    sget-object v1, LFd/o;->e:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
