.class public Lo4/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Landroidx/work/impl/E;

.field private final b:Landroidx/work/impl/o;


# direct methods
.method public constructor <init>(Landroidx/work/impl/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo4/s;->a:Landroidx/work/impl/E;

    .line 5
    .line 6
    new-instance p1, Landroidx/work/impl/o;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/work/impl/o;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lo4/s;->b:Landroidx/work/impl/o;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()Li4/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/s;->b:Landroidx/work/impl/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lo4/s;->a:Landroidx/work/impl/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ln4/v;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lo4/s;->b:Landroidx/work/impl/o;

    .line 15
    .line 16
    sget-object v1, Li4/l;->a:Li4/l$b$c;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/work/impl/o;->a(Li4/l$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object v1, p0, Lo4/s;->b:Landroidx/work/impl/o;

    .line 24
    .line 25
    new-instance v2, Li4/l$b$a;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Li4/l$b$a;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
