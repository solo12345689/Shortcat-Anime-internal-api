.class Landroidx/media3/exoplayer/M0$a;
.super LM2/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/M0;->J(LM2/e0;)Landroidx/media3/exoplayer/M0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final f:Lq2/Y$d;

.field final synthetic g:Landroidx/media3/exoplayer/M0;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/M0;Lq2/Y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/M0$a;->g:Landroidx/media3/exoplayer/M0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM2/w;-><init>(Lq2/Y;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lq2/Y$d;

    .line 7
    .line 8
    invoke-direct {p1}, Lq2/Y$d;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/M0$a;->f:Lq2/Y$d;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public k(ILq2/Y$b;Z)Lq2/Y$b;
    .locals 10

    .line 1
    invoke-super {p0, p1, p2, p3}, LM2/w;->k(ILq2/Y$b;Z)Lq2/Y$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget p1, v0, Lq2/Y$b;->c:I

    .line 6
    .line 7
    iget-object p3, p0, Landroidx/media3/exoplayer/M0$a;->f:Lq2/Y$d;

    .line 8
    .line 9
    invoke-super {p0, p1, p3}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lq2/Y$d;->g()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object v1, p2, Lq2/Y$b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, p2, Lq2/Y$b;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget v3, p2, Lq2/Y$b;->c:I

    .line 24
    .line 25
    iget-wide v4, p2, Lq2/Y$b;->d:J

    .line 26
    .line 27
    iget-wide v6, p2, Lq2/Y$b;->e:J

    .line 28
    .line 29
    sget-object v8, Lq2/b;->g:Lq2/b;

    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    invoke-virtual/range {v0 .. v9}, Lq2/Y$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJLq2/b;Z)Lq2/Y$b;

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, v0, Lq2/Y$b;->f:Z

    .line 38
    .line 39
    return-object v0
.end method
