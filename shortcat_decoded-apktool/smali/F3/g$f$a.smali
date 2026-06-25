.class LF3/g$f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g$f;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LF3/g$f;


# direct methods
.method constructor <init>(LF3/g$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$f$a;->a:LF3/g$f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LF3/g$f$a;->a:LF3/g$f;

    .line 2
    .line 3
    iget-object v1, v0, LF3/g$f;->h:LF3/g;

    .line 4
    .line 5
    iget-object v1, v1, LF3/g;->e:Lt/a;

    .line 6
    .line 7
    iget-object v0, v0, LF3/g$f;->f:LF3/g$o;

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LF3/g$o;

    .line 14
    .line 15
    invoke-interface {v0}, LF3/g$o;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lt/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method
