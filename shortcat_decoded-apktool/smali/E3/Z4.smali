.class public final synthetic LE3/Z4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/a5;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:LE3/h3$g;

.field public final synthetic d:Lt2/m;


# direct methods
.method public synthetic constructor <init>(LE3/a5;Ljava/util/concurrent/atomic/AtomicReference;LE3/h3$g;Lt2/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/Z4;->a:LE3/a5;

    .line 5
    .line 6
    iput-object p2, p0, LE3/Z4;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    iput-object p3, p0, LE3/Z4;->c:LE3/h3$g;

    .line 9
    .line 10
    iput-object p4, p0, LE3/Z4;->d:Lt2/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/Z4;->a:LE3/a5;

    .line 2
    .line 3
    iget-object v1, p0, LE3/Z4;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    iget-object v2, p0, LE3/Z4;->c:LE3/h3$g;

    .line 6
    .line 7
    iget-object v3, p0, LE3/Z4;->d:Lt2/m;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LE3/a5;->t(LE3/a5;Ljava/util/concurrent/atomic/AtomicReference;LE3/h3$g;Lt2/m;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
