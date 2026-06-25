.class LU4/k$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:LX4/a;

.field final b:LX4/a;

.field final c:LX4/a;

.field final d:LX4/a;

.field final e:LU4/m;

.field final f:LU4/p$a;

.field final g:LK1/d;


# direct methods
.method constructor <init>(LX4/a;LX4/a;LX4/a;LX4/a;LU4/m;LU4/p$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LU4/k$b$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LU4/k$b$a;-><init>(LU4/k$b;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x96

    .line 10
    .line 11
    invoke-static {v1, v0}, Lp5/a;->d(ILp5/a$d;)LK1/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LU4/k$b;->g:LK1/d;

    .line 16
    .line 17
    iput-object p1, p0, LU4/k$b;->a:LX4/a;

    .line 18
    .line 19
    iput-object p2, p0, LU4/k$b;->b:LX4/a;

    .line 20
    .line 21
    iput-object p3, p0, LU4/k$b;->c:LX4/a;

    .line 22
    .line 23
    iput-object p4, p0, LU4/k$b;->d:LX4/a;

    .line 24
    .line 25
    iput-object p5, p0, LU4/k$b;->e:LU4/m;

    .line 26
    .line 27
    iput-object p6, p0, LU4/k$b;->f:LU4/p$a;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method a(LS4/f;ZZZZ)LU4/l;
    .locals 7

    .line 1
    iget-object v0, p0, LU4/k$b;->g:LK1/d;

    .line 2
    .line 3
    invoke-interface {v0}, LK1/d;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU4/l;

    .line 8
    .line 9
    invoke-static {v0}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, LU4/l;

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    move v3, p2

    .line 18
    move v4, p3

    .line 19
    move v5, p4

    .line 20
    move v6, p5

    .line 21
    invoke-virtual/range {v1 .. v6}, LU4/l;->l(LS4/f;ZZZZ)LU4/l;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
