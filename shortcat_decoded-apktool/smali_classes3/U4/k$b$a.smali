.class LU4/k$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lp5/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU4/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LU4/k$b;


# direct methods
.method constructor <init>(LU4/k$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/k$b$a;->a:LU4/k$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LU4/l;
    .locals 8

    .line 1
    new-instance v0, LU4/l;

    .line 2
    .line 3
    iget-object v1, p0, LU4/k$b$a;->a:LU4/k$b;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v2, LU4/k$b;->a:LX4/a;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v3, LU4/k$b;->b:LX4/a;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v4, LU4/k$b;->c:LX4/a;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v5, LU4/k$b;->d:LX4/a;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v6, LU4/k$b;->e:LU4/m;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v7, LU4/k$b;->f:LU4/p$a;

    .line 22
    .line 23
    iget-object v7, v7, LU4/k$b;->g:LK1/d;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, LU4/l;-><init>(LX4/a;LX4/a;LX4/a;LX4/a;LU4/m;LU4/p$a;LK1/d;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU4/k$b$a;->a()LU4/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
