.class public Lw5/a;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field private static final a:Lw5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lw5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw5/a;->a:Lw5/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()Lw5/a;
    .locals 1

    .line 1
    sget-object v0, Lw5/a;->a:Lw5/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public synthetic close()V
    .locals 0

    .line 1
    invoke-static {p0}, Lz1/f;->a(Ljava/util/concurrent/ExecutorService;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public isShutdown()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isTerminated()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public shutdown()V
    .locals 0

    .line 1
    return-void
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw5/a;->shutdown()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    return-object v0
.end method
