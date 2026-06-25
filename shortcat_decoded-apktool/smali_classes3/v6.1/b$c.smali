.class public final Lv6/b$c;
.super Lcom/facebook/imagepipeline/producers/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv6/b;->k(Lv6/b$b;Lcom/facebook/imagepipeline/producers/X$a;Ldg/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldg/e;

.field final synthetic b:Lv6/b;


# direct methods
.method constructor <init>(Ldg/e;Lv6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv6/b$c;->a:Ldg/e;

    .line 2
    .line 3
    iput-object p2, p0, Lv6/b$c;->b:Lv6/b;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic e(Ldg/e;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/b$c;->f(Ldg/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(Ldg/e;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ldg/e;->cancel()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lv6/b$c;->a:Ldg/e;

    .line 16
    .line 17
    invoke-interface {v0}, Ldg/e;->cancel()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lv6/b$c;->b:Lv6/b;

    .line 22
    .line 23
    invoke-static {v0}, Lv6/b;->f(Lv6/b;)Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lv6/b$c;->a:Ldg/e;

    .line 28
    .line 29
    new-instance v2, Lv6/c;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lv6/c;-><init>(Ldg/e;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
