.class public final Lc3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# instance fields
.field private final a:LU2/p;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, LU2/L;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    const-string v1, "image/jpeg"

    .line 12
    .line 13
    const v2, 0xffd8

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v2, v0, v1}, LU2/L;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lc3/a;->a:LU2/p;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Lc3/b;

    .line 23
    .line 24
    invoke-direct {p1}, Lc3/b;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lc3/a;->a:LU2/p;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:LU2/p;

    .line 2
    .line 3
    invoke-interface {v0}, LU2/p;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:LU2/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LU2/p;->b(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LU2/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:LU2/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LU2/p;->c(LU2/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:LU2/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LU2/p;->f(LU2/q;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:LU2/p;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LU2/p;->h(LU2/q;LU2/I;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
