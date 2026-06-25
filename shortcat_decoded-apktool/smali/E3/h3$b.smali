.class public final LE3/h3$b;
.super LE3/h3$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq2/P;)V
    .locals 1

    .line 1
    new-instance v0, LE3/h3$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/h3$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, LE3/h3$c;-><init>(Landroid/content/Context;Lq2/P;LE3/h3$d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public d()LE3/h3;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE3/h3$c;->h:Lt2/h;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, LE3/a;

    .line 8
    .line 9
    new-instance v2, Lw2/k;

    .line 10
    .line 11
    iget-object v3, v0, LE3/h3$c;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-direct {v2, v3}, Lw2/k;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, LE3/a;-><init>(Lt2/h;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, LE3/h3$c;->h:Lt2/h;

    .line 20
    .line 21
    :cond_0
    new-instance v4, LE3/h3;

    .line 22
    .line 23
    iget-object v5, v0, LE3/h3$c;->a:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v6, v0, LE3/h3$c;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, v0, LE3/h3$c;->b:Lq2/P;

    .line 28
    .line 29
    iget-object v8, v0, LE3/h3$c;->e:Landroid/app/PendingIntent;

    .line 30
    .line 31
    iget-object v9, v0, LE3/h3$c;->j:LP9/u;

    .line 32
    .line 33
    iget-object v10, v0, LE3/h3$c;->k:LP9/u;

    .line 34
    .line 35
    iget-object v11, v0, LE3/h3$c;->l:LP9/u;

    .line 36
    .line 37
    iget-object v12, v0, LE3/h3$c;->d:LE3/h3$d;

    .line 38
    .line 39
    iget-object v13, v0, LE3/h3$c;->f:Landroid/os/Bundle;

    .line 40
    .line 41
    iget-object v14, v0, LE3/h3$c;->g:Landroid/os/Bundle;

    .line 42
    .line 43
    iget-object v1, v0, LE3/h3$c;->h:Lt2/h;

    .line 44
    .line 45
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v15, v1

    .line 50
    check-cast v15, Lt2/h;

    .line 51
    .line 52
    iget-boolean v1, v0, LE3/h3$c;->i:Z

    .line 53
    .line 54
    iget-boolean v2, v0, LE3/h3$c;->m:Z

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    move/from16 v16, v1

    .line 59
    .line 60
    move/from16 v17, v2

    .line 61
    .line 62
    invoke-direct/range {v4 .. v18}, LE3/h3;-><init>(Landroid/content/Context;Ljava/lang/String;Lq2/P;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/h3$d;Landroid/os/Bundle;Landroid/os/Bundle;Lt2/h;ZZI)V

    .line 63
    .line 64
    .line 65
    return-object v4
.end method

.method public e(LE3/h3$d;)LE3/h3$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LE3/h3$c;->a(LE3/h3$d;)LE3/h3$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/h3$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public f(Ljava/util/List;)LE3/h3$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LE3/h3$c;->b(Ljava/util/List;)LE3/h3$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/h3$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public g(Ljava/lang/String;)LE3/h3$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, LE3/h3$c;->c(Ljava/lang/String;)LE3/h3$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LE3/h3$b;

    .line 6
    .line 7
    return-object p1
.end method
