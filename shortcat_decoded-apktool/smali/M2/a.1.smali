.class public abstract LM2/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/D;


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:Ljava/util/HashSet;

.field private final c:LM2/L$a;

.field private final d:LF2/t$a;

.field private e:Landroid/os/Looper;

.field private f:Lq2/Y;

.field private g:LB2/K1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LM2/a;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 18
    .line 19
    new-instance v0, LM2/L$a;

    .line 20
    .line 21
    invoke-direct {v0}, LM2/L$a;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LM2/a;->c:LM2/L$a;

    .line 25
    .line 26
    new-instance v0, LF2/t$a;

    .line 27
    .line 28
    invoke-direct {v0}, LF2/t$a;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LM2/a;->d:LF2/t$a;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method protected abstract A(Lw2/F;)V
.end method

.method protected final B(Lq2/Y;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM2/a;->f:Lq2/Y;

    .line 2
    .line 3
    iget-object v0, p0, LM2/a;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LM2/D$c;

    .line 20
    .line 21
    invoke-interface {v1, p0, p1}, LM2/D$c;->a(LM2/D;Lq2/Y;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method protected abstract C()V
.end method

.method public final b(Landroid/os/Handler;LF2/t;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LM2/a;->d:LF2/t$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LF2/t$a;->g(Landroid/os/Handler;LF2/t;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c(LF2/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->d:LF2/t$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF2/t$a;->n(LF2/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(LM2/D$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/a;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, LM2/a;->e:Landroid/os/Looper;

    .line 16
    .line 17
    iput-object p1, p0, LM2/a;->f:Lq2/Y;

    .line 18
    .line 19
    iput-object p1, p0, LM2/a;->g:LB2/K1;

    .line 20
    .line 21
    iget-object p1, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LM2/a;->C()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, LM2/a;->p(LM2/D$c;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final h(LM2/D$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/a;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LM2/a;->x()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final k(LM2/L;)V
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->c:LM2/L$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM2/L$a;->x(LM2/L;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p(LM2/D$c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, LM2/a;->w()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final q(Landroid/os/Handler;LM2/L;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LM2/a;->c:LM2/L$a;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LM2/L$a;->h(Landroid/os/Handler;LM2/L;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(LM2/D$c;Lw2/F;LB2/K1;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LM2/a;->e:Landroid/os/Looper;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 15
    :goto_1
    invoke-static {v1}, Lt2/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, LM2/a;->g:LB2/K1;

    .line 19
    .line 20
    iget-object p3, p0, LM2/a;->f:Lq2/Y;

    .line 21
    .line 22
    iget-object v1, p0, LM2/a;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LM2/a;->e:Landroid/os/Looper;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    iput-object v0, p0, LM2/a;->e:Landroid/os/Looper;

    .line 32
    .line 33
    iget-object p3, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, LM2/a;->A(Lw2/F;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    if-eqz p3, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, p1}, LM2/a;->h(LM2/D$c;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, p0, p3}, LM2/D$c;->a(LM2/D;Lq2/Y;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method protected final s(ILM2/D$b;)LF2/t$a;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->d:LF2/t$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LF2/t$a;->o(ILM2/D$b;)LF2/t$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected final t(LM2/D$b;)LF2/t$a;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/a;->d:LF2/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, LF2/t$a;->o(ILM2/D$b;)LF2/t$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method protected final u(ILM2/D$b;)LM2/L$a;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->c:LM2/L$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LM2/L$a;->A(ILM2/D$b;)LM2/L$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected final v(LM2/D$b;)LM2/L$a;
    .locals 2

    .line 1
    iget-object v0, p0, LM2/a;->c:LM2/L$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p1}, LM2/L$a;->A(ILM2/D$b;)LM2/L$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method protected w()V
    .locals 0

    .line 1
    return-void
.end method

.method protected x()V
    .locals 0

    .line 1
    return-void
.end method

.method protected final y()LB2/K1;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->g:LB2/K1;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB2/K1;

    .line 8
    .line 9
    return-object v0
.end method

.method protected final z()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM2/a;->b:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method
