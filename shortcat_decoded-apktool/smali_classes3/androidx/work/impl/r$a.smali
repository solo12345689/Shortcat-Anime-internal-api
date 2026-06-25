.class Landroidx/work/impl/r$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/work/impl/e;

.field private final b:Ln4/m;

.field private c:Lcom/google/common/util/concurrent/p;


# direct methods
.method constructor <init>(Landroidx/work/impl/e;Ln4/m;Lcom/google/common/util/concurrent/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/work/impl/r$a;->a:Landroidx/work/impl/e;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/work/impl/r$a;->b:Ln4/m;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/work/impl/r$a;->c:Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/r$a;->c:Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const/4 v0, 0x1

    .line 15
    :goto_0
    iget-object v1, p0, Landroidx/work/impl/r$a;->a:Landroidx/work/impl/e;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/work/impl/r$a;->b:Ln4/m;

    .line 18
    .line 19
    invoke-interface {v1, v2, v0}, Landroidx/work/impl/e;->f(Ln4/m;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
