.class final LE3/g3$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/A$c;
.implements Lq2/P$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/g3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:LE3/W4;

.field private final b:LE3/h3;

.field final synthetic c:LE3/g3;


# direct methods
.method public constructor <init>(LE3/g3;LE3/W4;LE3/h3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/g3$c;->c:LE3/g3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LE3/g3$c;->a:LE3/W4;

    .line 7
    .line 8
    iput-object p3, p0, LE3/g3$c;->b:LE3/h3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public G(LE3/A;Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 2
    .line 3
    iget-object p2, p0, LE3/g3$c;->b:LE3/h3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, p2, v0}, LE3/W4;->r(LE3/h3;Z)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public X(Lq2/P;Lq2/P$c;)V
    .locals 3

    .line 1
    const/4 p1, 0x4

    .line 2
    const/4 v0, 0x5

    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    filled-new-array {p1, v0, v1, v2}, [I

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p2, p1}, Lq2/P$c;->a([I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 17
    .line 18
    iget-object p2, p0, LE3/g3$c;->b:LE3/h3;

    .line 19
    .line 20
    invoke-virtual {p1, p2, v2}, LE3/W4;->r(LE3/h3;Z)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public i0(LE3/A;LE3/U6;)V
    .locals 1

    .line 1
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 2
    .line 3
    iget-object p2, p0, LE3/g3$c;->b:LE3/h3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, p2, v0}, LE3/W4;->r(LE3/h3;Z)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public o0(LE3/A;)V
    .locals 2

    .line 1
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 2
    .line 3
    iget-object v0, p0, LE3/g3$c;->b:LE3/h3;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, LE3/W4;->n(LE3/h3;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 12
    .line 13
    iget-object v0, p0, LE3/g3$c;->b:LE3/h3;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LE3/W4;->s(LE3/h3;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 19
    .line 20
    iget-object v0, p0, LE3/g3$c;->b:LE3/h3;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {p1, v0, v1}, LE3/W4;->r(LE3/h3;Z)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public q0(LE3/A;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    iget-object p1, p2, LE3/T6;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string p2, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LE3/g3$c;->c:LE3/g3;

    .line 12
    .line 13
    iget-object p2, p0, LE3/g3$c;->b:LE3/h3;

    .line 14
    .line 15
    invoke-static {p1, p2}, LE3/g3;->e(LE3/g3;LE3/h3;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, -0x6

    .line 21
    :goto_0
    new-instance p2, LE3/X6;

    .line 22
    .line 23
    invoke-direct {p2, p1}, LE3/X6;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public u0(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LE3/g3$c;->a:LE3/W4;

    .line 4
    .line 5
    iget-object v0, p0, LE3/g3$c;->b:LE3/h3;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, LE3/W4;->r(LE3/h3;Z)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
