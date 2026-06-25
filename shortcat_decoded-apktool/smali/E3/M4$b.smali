.class LE3/M4$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE3/M4;->N0(LF3/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE3/h3$g;

.field final synthetic b:I

.field final synthetic c:LE3/M4;


# direct methods
.method constructor <init>(LE3/M4;LE3/h3$g;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/M4$b;->c:LE3/M4;

    .line 2
    .line 3
    iput-object p2, p0, LE3/M4$b;->a:LE3/h3$g;

    .line 4
    .line 5
    iput p3, p0, LE3/M4$b;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic b(LE3/M4$b;ILjava/util/List;LE3/h3$g;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, LE3/M4$b;->c:LE3/M4;

    .line 5
    .line 6
    invoke-static {p1}, LE3/M4;->r0(LE3/M4;)LE3/I3;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, LE3/I3;->j0()LE3/N6;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p2}, LE3/N6;->O0(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LE3/M4$b;->c:LE3/M4;

    .line 19
    .line 20
    invoke-static {v0}, LE3/M4;->r0(LE3/M4;)LE3/I3;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1, p2}, LE3/N6;->H0(ILjava/util/List;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p0, p0, LE3/M4$b;->c:LE3/M4;

    .line 32
    .line 33
    invoke-static {p0}, LE3/M4;->r0(LE3/M4;)LE3/I3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance p1, Lq2/P$b$a;

    .line 38
    .line 39
    invoke-direct {p1}, Lq2/P$b$a;-><init>()V

    .line 40
    .line 41
    .line 42
    const/16 p2, 0x14

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p3, p1}, LE3/I3;->F0(LE3/h3$g;Lq2/P$b;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/M4$b;->c:LE3/M4;

    .line 2
    .line 3
    invoke-static {v0}, LE3/M4;->r0(LE3/M4;)LE3/I3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LE3/M4$b;->c:LE3/M4;

    .line 12
    .line 13
    invoke-static {v1}, LE3/M4;->r0(LE3/M4;)LE3/I3;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, LE3/M4$b;->a:LE3/h3$g;

    .line 18
    .line 19
    iget v3, p0, LE3/M4$b;->b:I

    .line 20
    .line 21
    new-instance v4, LE3/N4;

    .line 22
    .line 23
    invoke-direct {v4, p0, v3, p1, v2}, LE3/N4;-><init>(LE3/M4$b;ILjava/util/List;LE3/h3$g;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, v4}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v0, p1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE3/M4$b;->c(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
