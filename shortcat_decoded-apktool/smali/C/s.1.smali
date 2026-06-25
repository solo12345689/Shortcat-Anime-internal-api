.class final LC/s;
.super Landroidx/core/view/p0$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroidx/core/view/I;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final a:LC/Q;

.field private b:Z

.field private c:Z

.field private d:Landroidx/core/view/L0;


# direct methods
.method public constructor <init>(LC/Q;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LC/Q;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroidx/core/view/p0$b;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LC/s;->a:LC/Q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 3

    .line 1
    iput-object p2, p0, LC/s;->d:Landroidx/core/view/L0;

    .line 2
    .line 3
    iget-object v0, p0, LC/s;->a:LC/Q;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, LC/Q;->l(Landroidx/core/view/L0;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LC/s;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-boolean p1, p0, LC/s;->c:Z

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, LC/s;->a:LC/Q;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, LC/Q;->k(Landroidx/core/view/L0;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LC/s;->a:LC/Q;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {p1, p2, v2, v0, v1}, LC/Q;->j(LC/Q;Landroidx/core/view/L0;IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object p1, p0, LC/s;->a:LC/Q;

    .line 40
    .line 41
    invoke-virtual {p1}, LC/Q;->c()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    sget-object p1, Landroidx/core/view/L0;->b:Landroidx/core/view/L0;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    return-object p2
.end method

.method public onEnd(Landroidx/core/view/p0;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LC/s;->b:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LC/s;->c:Z

    .line 5
    .line 6
    iget-object v1, p0, LC/s;->d:Landroidx/core/view/L0;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/core/view/p0;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, LC/s;->a:LC/Q;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, LC/Q;->k(Landroidx/core/view/L0;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LC/s;->a:LC/Q;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, LC/Q;->l(Landroidx/core/view/L0;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, LC/s;->a:LC/Q;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    invoke-static {v2, v1, v0, v4, v3}, LC/Q;->j(LC/Q;Landroidx/core/view/L0;IILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput-object v3, p0, LC/s;->d:Landroidx/core/view/L0;

    .line 38
    .line 39
    invoke-super {p0, p1}, Landroidx/core/view/p0$b;->onEnd(Landroidx/core/view/p0;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public onPrepare(Landroidx/core/view/p0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC/s;->b:Z

    .line 3
    .line 4
    iput-boolean v0, p0, LC/s;->c:Z

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/core/view/p0$b;->onPrepare(Landroidx/core/view/p0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onProgress(Landroidx/core/view/L0;Ljava/util/List;)Landroidx/core/view/L0;
    .locals 3

    .line 1
    iget-object p2, p0, LC/s;->a:LC/Q;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p2, p1, v2, v0, v1}, LC/Q;->j(LC/Q;Landroidx/core/view/L0;IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, LC/s;->a:LC/Q;

    .line 10
    .line 11
    invoke-virtual {p2}, LC/Q;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    sget-object p1, Landroidx/core/view/L0;->b:Landroidx/core/view/L0;

    .line 18
    .line 19
    :cond_0
    return-object p1
.end method

.method public onStart(Landroidx/core/view/p0;Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LC/s;->b:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroidx/core/view/p0$b;->onStart(Landroidx/core/view/p0;Landroidx/core/view/p0$a;)Landroidx/core/view/p0$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LC/s;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LC/s;->b:Z

    .line 7
    .line 8
    iput-boolean v0, p0, LC/s;->c:Z

    .line 9
    .line 10
    iget-object v1, p0, LC/s;->d:Landroidx/core/view/L0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, LC/s;->a:LC/Q;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, LC/Q;->k(Landroidx/core/view/L0;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, LC/s;->a:LC/Q;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v1, v0, v3, v4}, LC/Q;->j(LC/Q;Landroidx/core/view/L0;IILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, p0, LC/s;->d:Landroidx/core/view/L0;

    .line 27
    .line 28
    :cond_0
    return-void
.end method
