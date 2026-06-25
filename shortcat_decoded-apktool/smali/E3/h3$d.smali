.class public interface abstract LE3/h3$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation


# direct methods
.method public static synthetic i(IJLjava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    new-instance v0, LE3/h3$i;

    .line 2
    .line 3
    invoke-direct {v0, p3, p0, p1, p2}, LE3/h3$i;-><init>(Ljava/util/List;IJ)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a(LE3/h3;LE3/h3$g;Landroid/content/Intent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public b(LE3/h3;LE3/h3$g;Lq2/P$b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(LE3/h3;LE3/h3$g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(LE3/h3;LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lq2/C;

    .line 16
    .line 17
    iget-object p2, p2, Lq2/C;->b:Lq2/C$h;

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->c(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/p;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    invoke-static {p3}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public e(LE3/h3;LE3/h3$g;I)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public f(LE3/h3;LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    new-instance p1, LE3/X6;

    .line 2
    .line 3
    const/4 p2, -0x6

    .line 4
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public g(LE3/h3;LE3/h3$g;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->c(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public h(LE3/h3;LE3/h3$g;Lq2/S;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    new-instance p1, LE3/X6;

    .line 2
    .line 3
    const/4 p2, -0x6

    .line 4
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public j(LE3/h3;LE3/h3$g;)LE3/h3$e;
    .locals 0

    .line 1
    new-instance p2, LE3/h3$e$a;

    .line 2
    .line 3
    invoke-direct {p2, p1}, LE3/h3$e$a;-><init>(LE3/h3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, LE3/h3$e$a;->a()LE3/h3$e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public k(LE3/h3;LE3/h3$g;Ljava/lang/String;Lq2/S;)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    new-instance p1, LE3/X6;

    .line 2
    .line 3
    const/4 p2, -0x6

    .line 4
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public l(LE3/h3;LE3/h3$g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(LE3/h3;LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2, p3}, LE3/h3$d;->d(LE3/h3;LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LE3/i3;

    .line 6
    .line 7
    invoke-direct {p2, p4, p5, p6}, LE3/i3;-><init>(IJ)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lt2/a0;->D1(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/d;)Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
