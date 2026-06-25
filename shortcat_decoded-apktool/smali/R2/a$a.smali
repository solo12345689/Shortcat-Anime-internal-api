.class LR2/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LR2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/a;->p0(Ljava/util/concurrent/Executor;Lt2/n;)LR2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Executor;

.field final synthetic b:Lt2/n;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lt2/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/a$a;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iput-object p2, p0, LR2/a$a;->b:Lt2/n;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/a$a;->b:Lt2/n;

    .line 2
    .line 3
    iget-object v1, p0, LR2/a$a;->a:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lt2/n;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/a$a;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
