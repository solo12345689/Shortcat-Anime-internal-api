.class public LQ5/b;
.super Ll6/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;
.implements LV5/F;


# instance fields
.field private final c:LF5/b;

.field private final d:Ll6/j;

.field private final e:Ll6/i;

.field private f:Ll6/i;

.field private final g:Z


# direct methods
.method public constructor <init>(LF5/b;Ll6/j;Ll6/i;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, LQ5/b;-><init>(LF5/b;Ll6/j;Ll6/i;Z)V

    return-void
.end method

.method public constructor <init>(LF5/b;Ll6/j;Ll6/i;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ll6/a;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, LQ5/b;->f:Ll6/i;

    .line 4
    iput-object p1, p0, LQ5/b;->c:LF5/b;

    .line 5
    iput-object p2, p0, LQ5/b;->d:Ll6/j;

    .line 6
    iput-object p3, p0, LQ5/b;->e:Ll6/i;

    .line 7
    iput-boolean p4, p0, LQ5/b;->g:Z

    return-void
.end method

.method private C(Ll6/j;Ll6/e;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ll6/j;->H(Ll6/e;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ5/b;->e:Ll6/i;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Ll6/i;->a(Ll6/j;Ll6/e;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LQ5/b;->f:Ll6/i;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Ll6/i;->a(Ll6/j;Ll6/e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private D(Ll6/j;Ll6/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b;->e:Ll6/i;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ll6/i;->b(Ll6/j;Ll6/n;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ5/b;->f:Ll6/i;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Ll6/i;->b(Ll6/j;Ll6/n;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private q(Ll6/j;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ll6/j;->R(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Ll6/j;->L(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, Ll6/n;->f:Ll6/n;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, LQ5/b;->D(Ll6/j;Ll6/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LE6/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQ5/b;->o(Ljava/lang/String;LE6/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;Ll6/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 2
    .line 3
    invoke-interface {v0}, LF5/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LQ5/b;->d:Ll6/j;

    .line 8
    .line 9
    invoke-virtual {v2, p2}, Ll6/j;->F(Ll6/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ll6/j;->B(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Ll6/e;->j:Ll6/e;

    .line 16
    .line 17
    invoke-direct {p0, v2, p1}, LQ5/b;->C(Ll6/j;Ll6/e;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, LQ5/b;->g:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-direct {p0, v2, v0, v1}, LQ5/b;->q(Ll6/j;J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LQ5/b;->z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;Ll6/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 2
    .line 3
    invoke-interface {v0}, LF5/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LQ5/b;->d:Ll6/j;

    .line 8
    .line 9
    invoke-virtual {v2}, Ll6/j;->x()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ll6/j;->D(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Ll6/j;->B(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, Ll6/j;->y(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p3}, Ll6/j;->F(Ll6/b$a;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Ll6/e;->e:Ll6/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, LQ5/b;->C(Ll6/j;Ll6/e;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, LQ5/b;->g:Z

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v2, v0, v1}, LQ5/b;->w(Ll6/j;J)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public h(Ljava/lang/String;Ljava/lang/Throwable;Ll6/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 2
    .line 3
    invoke-interface {v0}, LF5/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LQ5/b;->d:Ll6/j;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, Ll6/j;->F(Ll6/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ll6/j;->z(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Ll6/j;->B(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, Ll6/j;->E(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Ll6/e;->h:Ll6/e;

    .line 22
    .line 23
    invoke-direct {p0, v2, p1}, LQ5/b;->C(Ll6/j;Ll6/e;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v2, v0, v1}, LQ5/b;->q(Ll6/j;J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/String;Ljava/lang/Object;Ll6/b$a;)V
    .locals 0

    .line 1
    check-cast p2, LE6/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LQ5/b;->m(Ljava/lang/String;LE6/m;Ll6/b$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public l(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LQ5/b;->d:Ll6/j;

    .line 4
    .line 5
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 6
    .line 7
    invoke-interface {v0}, LF5/b;->now()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, p1, v0, v1}, LQ5/b;->w(Ll6/j;J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, LQ5/b;->d:Ll6/j;

    .line 16
    .line 17
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 18
    .line 19
    invoke-interface {v0}, LF5/b;->now()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-direct {p0, p1, v0, v1}, LQ5/b;->q(Ll6/j;J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public m(Ljava/lang/String;LE6/m;Ll6/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 2
    .line 3
    invoke-interface {v0}, LF5/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LQ5/b;->d:Ll6/j;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, Ll6/j;->F(Ll6/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ll6/j;->A(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Ll6/j;->J(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ll6/j;->B(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ll6/j;->G(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Ll6/e;->g:Ll6/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, LQ5/b;->C(Ll6/j;Ll6/e;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public o(Ljava/lang/String;LE6/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ5/b;->c:LF5/b;

    .line 2
    .line 3
    invoke-interface {v0}, LF5/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LQ5/b;->d:Ll6/j;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Ll6/j;->C(J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ll6/j;->B(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p2}, Ll6/j;->G(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Ll6/e;->f:Ll6/e;

    .line 19
    .line 20
    invoke-direct {p0, v2, p1}, LQ5/b;->C(Ll6/j;Ll6/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onDraw()V
    .locals 0

    .line 1
    return-void
.end method

.method public w(Ll6/j;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Ll6/j;->R(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Ll6/j;->Q(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, Ll6/n;->e:Ll6/n;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, LQ5/b;->D(Ll6/j;Ll6/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public z()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/b;->d:Ll6/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll6/j;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
