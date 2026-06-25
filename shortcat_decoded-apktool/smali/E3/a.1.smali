.class public final LE3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/a$a;
    }
.end annotation


# instance fields
.field private final a:Lt2/h;

.field private b:LE3/a$a;


# direct methods
.method public constructor <init>(Lt2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/a;->a:Lt2/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/a;->b:LE3/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LE3/a$a;->b(Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LE3/a;->b:LE3/a$a;

    .line 12
    .line 13
    invoke-virtual {p1}, LE3/a$a;->a()Lcom/google/common/util/concurrent/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, LE3/a;->a:Lt2/h;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lt2/h;->b(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, LE3/a$a;

    .line 25
    .line 26
    invoke-direct {v1, p1, v0}, LE3/a$a;-><init>(Landroid/net/Uri;Lcom/google/common/util/concurrent/p;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LE3/a;->b:LE3/a$a;

    .line 30
    .line 31
    return-object v0
.end method

.method public c([B)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/a;->b:LE3/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LE3/a$a;->c([B)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LE3/a;->b:LE3/a$a;

    .line 12
    .line 13
    invoke-virtual {p1}, LE3/a$a;->a()Lcom/google/common/util/concurrent/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, LE3/a;->a:Lt2/h;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Lt2/h;->c([B)Lcom/google/common/util/concurrent/p;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, LE3/a$a;

    .line 25
    .line 26
    invoke-direct {v1, p1, v0}, LE3/a$a;-><init>([BLcom/google/common/util/concurrent/p;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LE3/a;->b:LE3/a$a;

    .line 30
    .line 31
    return-object v0
.end method
