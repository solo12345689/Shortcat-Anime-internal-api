.class public abstract LZe/i$d;
.super LZe/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZe/i$d$a;
    }
.end annotation


# instance fields
.field private final b:LZe/h;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i;-><init>()V

    .line 2
    invoke-static {}, LZe/h;->t()LZe/h;

    move-result-object v0

    iput-object v0, p0, LZe/i$d;->b:LZe/h;

    return-void
.end method

.method protected constructor <init>(LZe/i$c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, LZe/i;-><init>()V

    .line 4
    invoke-static {p1}, LZe/i$c;->m(LZe/i$c;)LZe/h;

    move-result-object p1

    iput-object p1, p0, LZe/i$d;->b:LZe/h;

    return-void
.end method

.method private A(LZe/i$f;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LZe/i$f;->b()LZe/p;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0}, LZe/q;->c()LZe/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method static synthetic s(LZe/i$d;)LZe/h;
    .locals 0

    .line 1
    iget-object p0, p0, LZe/i$d;->b:LZe/h;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method protected l()V
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LZe/h;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected p(LZe/e;LZe/f;LZe/g;I)Z
    .locals 6

    .line 1
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 2
    .line 3
    invoke-interface {p0}, LZe/q;->c()LZe/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move v5, p4

    .line 11
    invoke-static/range {v0 .. v5}, LZe/i;->i(LZe/h;LZe/p;LZe/e;LZe/f;LZe/g;I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method protected t()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LZe/h;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected u()I
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LZe/h;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final v(LZe/i$f;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LZe/i$d;->A(LZe/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 5
    .line 6
    iget-object v1, p1, LZe/i$f;->d:LZe/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LZe/h;->h(LZe/h$b;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, LZe/i$f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p1, v0}, LZe/i$f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final w(LZe/i$f;I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LZe/i$d;->A(LZe/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 5
    .line 6
    iget-object v1, p1, LZe/i$f;->d:LZe/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, LZe/h;->i(LZe/h$b;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p1, p2}, LZe/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final x(LZe/i$f;)I
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LZe/i$d;->A(LZe/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 5
    .line 6
    iget-object p1, p1, LZe/i$f;->d:LZe/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LZe/h;->j(LZe/h$b;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final y(LZe/i$f;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LZe/i$d;->A(LZe/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZe/i$d;->b:LZe/h;

    .line 5
    .line 6
    iget-object p1, p1, LZe/i$f;->d:LZe/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LZe/h;->m(LZe/h$b;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method protected z()LZe/i$d$a;
    .locals 3

    .line 1
    new-instance v0, LZe/i$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v1, v2}, LZe/i$d$a;-><init>(LZe/i$d;ZLZe/i$a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
