.class final Lt2/v$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field private b:Lq2/t$b;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Lq2/t$b;

    .line 7
    .line 8
    invoke-direct {p1}, Lq2/t$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lt2/v$c;->b:Lq2/t$b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(ILt2/v$a;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt2/v$c;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lt2/v$c;->b:Lq2/t$b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lq2/t$b;->a(I)Lq2/t$b;

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lt2/v$c;->c:Z

    .line 15
    .line 16
    iget-object p1, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {p2, p1}, Lt2/v$a;->invoke(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public b(Lt2/v$b;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt2/v$c;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lt2/v$c;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lt2/v$c;->b:Lq2/t$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lq2/t$b;->e()Lq2/t;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lq2/t$b;

    .line 16
    .line 17
    invoke-direct {v1}, Lq2/t$b;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lt2/v$c;->b:Lq2/t$b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Lt2/v$c;->c:Z

    .line 24
    .line 25
    iget-object v1, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {p1, v1, v0}, Lt2/v$b;->a(Ljava/lang/Object;Lq2/t;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public c(Lt2/v$b;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lt2/v$c;->d:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lt2/v$c;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lt2/v$c;->c:Z

    .line 10
    .line 11
    iget-object v0, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lt2/v$c;->b:Lq2/t$b;

    .line 14
    .line 15
    invoke-virtual {v1}, Lq2/t$b;->e()Lq2/t;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v0, v1}, Lt2/v$b;->a(Ljava/lang/Object;Lq2/t;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Lt2/v$c;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lt2/v$c;

    .line 19
    .line 20
    iget-object p1, p1, Lt2/v$c;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/v$c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
