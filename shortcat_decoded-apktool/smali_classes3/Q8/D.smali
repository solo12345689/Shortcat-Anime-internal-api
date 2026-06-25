.class final LQ8/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LR8/c$e;


# instance fields
.field final synthetic a:LQ8/E;


# direct methods
.method constructor <init>(LQ8/E;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ8/D;->a:LQ8/E;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/D;->a:LQ8/E;

    .line 2
    .line 3
    iget-object v0, v0, LQ8/E;->s:LQ8/e;

    .line 4
    .line 5
    invoke-static {v0}, LQ8/e;->o(LQ8/e;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LQ8/C;

    .line 10
    .line 11
    invoke-direct {v1, p0}, LQ8/C;-><init>(LQ8/D;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
