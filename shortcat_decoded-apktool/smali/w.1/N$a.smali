.class public final Lw/N$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/h2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Ljava/lang/Object;

.field private final c:Lw/s0;

.field private final d:Ljava/lang/String;

.field private final e:LY/C0;

.field private f:Lw/i;

.field private g:Lw/n0;

.field private h:Z

.field private i:Z

.field private j:J

.field final synthetic k:Lw/N;


# direct methods
.method public constructor <init>(Lw/N;Ljava/lang/Object;Ljava/lang/Object;Lw/s0;Lw/i;Ljava/lang/String;)V
    .locals 8

    .line 1
    iput-object p1, p0, Lw/N$a;->k:Lw/N;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lw/N$a;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lw/N$a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lw/N$a;->c:Lw/s0;

    .line 11
    .line 12
    iput-object p6, p0, Lw/N$a;->d:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p3, 0x2

    .line 16
    invoke-static {p2, p1, p3, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lw/N$a;->e:LY/C0;

    .line 21
    .line 22
    iput-object p5, p0, Lw/N$a;->f:Lw/i;

    .line 23
    .line 24
    new-instance v0, Lw/n0;

    .line 25
    .line 26
    iget-object v1, p0, Lw/N$a;->f:Lw/i;

    .line 27
    .line 28
    iget-object v3, p0, Lw/N$a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v4, p0, Lw/N$a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    const/16 v6, 0x10

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v2, p4

    .line 37
    invoke-direct/range {v0 .. v7}, Lw/n0;-><init>(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Lw/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lw/N$a;->g:Lw/n0;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/N$a;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/N$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/N$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw/N$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/N$a;->k:Lw/N;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lw/N;->d(Lw/N;Z)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lw/N$a;->i:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-boolean v1, p0, Lw/N$a;->i:Z

    .line 12
    .line 13
    iput-wide p1, p0, Lw/N$a;->j:J

    .line 14
    .line 15
    :cond_0
    iget-wide v0, p0, Lw/N$a;->j:J

    .line 16
    .line 17
    sub-long/2addr p1, v0

    .line 18
    iget-object v0, p0, Lw/N$a;->g:Lw/n0;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Lw/n0;->f(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Lw/N$a;->r(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lw/N$a;->g:Lw/n0;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2}, Lw/d;->c(J)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput-boolean p1, p0, Lw/N$a;->h:Z

    .line 34
    .line 35
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lw/N$a;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/N$a;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/N$a;->g:Lw/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw/n0;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lw/N$a;->r(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lw/N$a;->i:Z

    .line 12
    .line 13
    return-void
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/Object;Lw/i;)V
    .locals 8

    .line 1
    iput-object p1, p0, Lw/N$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lw/N$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lw/N$a;->f:Lw/i;

    .line 6
    .line 7
    new-instance v0, Lw/n0;

    .line 8
    .line 9
    iget-object v2, p0, Lw/N$a;->c:Lw/s0;

    .line 10
    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v1, p3

    .line 18
    invoke-direct/range {v0 .. v7}, Lw/n0;-><init>(Lw/i;Lw/s0;Ljava/lang/Object;Ljava/lang/Object;Lw/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lw/N$a;->g:Lw/n0;

    .line 22
    .line 23
    iget-object p1, p0, Lw/N$a;->k:Lw/N;

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-static {p1, p2}, Lw/N;->d(Lw/N;Z)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p0, Lw/N$a;->h:Z

    .line 31
    .line 32
    iput-boolean p2, p0, Lw/N$a;->i:Z

    .line 33
    .line 34
    return-void
.end method
