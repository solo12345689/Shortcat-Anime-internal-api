.class public abstract LM2/h;
.super LM2/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM2/h$b;,
        LM2/h$a;
    }
.end annotation


# instance fields
.field private final h:Ljava/util/HashMap;

.field private i:Landroid/os/Handler;

.field private j:Lw2/F;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LM2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic D(LM2/h;Ljava/lang/Object;LM2/D;Lq2/Y;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LM2/h;->H(Ljava/lang/Object;LM2/D;Lq2/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected A(Lw2/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/h;->j:Lw2/F;

    .line 2
    .line 3
    invoke-static {}, Lt2/a0;->C()Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, LM2/h;->i:Landroid/os/Handler;

    .line 8
    .line 9
    return-void
.end method

.method protected C()V
    .locals 4

    .line 1
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LM2/h$b;

    .line 22
    .line 23
    iget-object v2, v1, LM2/h$b;->a:LM2/D;

    .line 24
    .line 25
    iget-object v3, v1, LM2/h$b;->b:LM2/D$c;

    .line 26
    .line 27
    invoke-interface {v2, v3}, LM2/D;->d(LM2/D$c;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, LM2/h$b;->a:LM2/D;

    .line 31
    .line 32
    iget-object v3, v1, LM2/h$b;->c:LM2/h$a;

    .line 33
    .line 34
    invoke-interface {v2, v3}, LM2/D;->k(LM2/L;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v1, LM2/h$b;->a:LM2/D;

    .line 38
    .line 39
    iget-object v1, v1, LM2/h$b;->c:LM2/h$a;

    .line 40
    .line 41
    invoke-interface {v2, v1}, LM2/D;->c(LF2/t;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method protected abstract E(Ljava/lang/Object;LM2/D$b;)LM2/D$b;
.end method

.method protected F(Ljava/lang/Object;JLM2/D$b;)J
    .locals 0

    .line 1
    return-wide p2
.end method

.method protected G(Ljava/lang/Object;I)I
    .locals 0

    .line 1
    return p2
.end method

.method protected abstract H(Ljava/lang/Object;LM2/D;Lq2/Y;)V
.end method

.method protected final I(Ljava/lang/Object;LM2/D;)V
    .locals 4

    .line 1
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LM2/g;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, LM2/g;-><init>(LM2/h;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, LM2/h$a;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, LM2/h$a;-><init>(LM2/h;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance v3, LM2/h$b;

    .line 25
    .line 26
    invoke-direct {v3, p2, v0, v1}, LM2/h$b;-><init>(LM2/D;LM2/D$c;LM2/h$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, LM2/h;->i:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-interface {p2, p1, v1}, LM2/D;->q(Landroid/os/Handler;LM2/L;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, LM2/h;->i:Landroid/os/Handler;

    .line 44
    .line 45
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/os/Handler;

    .line 50
    .line 51
    invoke-interface {p2, p1, v1}, LM2/D;->b(Landroid/os/Handler;LF2/t;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LM2/h;->j:Lw2/F;

    .line 55
    .line 56
    invoke-virtual {p0}, LM2/a;->y()LB2/K1;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {p2, v0, p1, v1}, LM2/D;->r(LM2/D$c;Lw2/F;LB2/K1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, LM2/a;->z()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_0

    .line 68
    .line 69
    invoke-interface {p2, v0}, LM2/D;->p(LM2/D$c;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LM2/h$b;

    .line 22
    .line 23
    iget-object v1, v1, LM2/h$b;->a:LM2/D;

    .line 24
    .line 25
    invoke-interface {v1}, LM2/D;->l()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method protected w()V
    .locals 3

    .line 1
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LM2/h$b;

    .line 22
    .line 23
    iget-object v2, v1, LM2/h$b;->a:LM2/D;

    .line 24
    .line 25
    iget-object v1, v1, LM2/h$b;->b:LM2/D$c;

    .line 26
    .line 27
    invoke-interface {v2, v1}, LM2/D;->p(LM2/D$c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method protected x()V
    .locals 3

    .line 1
    iget-object v0, p0, LM2/h;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LM2/h$b;

    .line 22
    .line 23
    iget-object v2, v1, LM2/h$b;->a:LM2/D;

    .line 24
    .line 25
    iget-object v1, v1, LM2/h$b;->b:LM2/D$c;

    .line 26
    .line 27
    invoke-interface {v2, v1}, LM2/D;->h(LM2/D$c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method
