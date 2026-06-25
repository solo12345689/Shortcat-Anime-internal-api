.class final LU/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU/m0;


# instance fields
.field private final a:LU/n0;

.field private final b:Lw/i;

.field private final c:Lw/z;

.field private final d:Lie/a;

.field private final e:Z

.field private f:LD0/a;


# direct methods
.method public constructor <init>(LU/n0;Lw/i;Lw/z;Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU/t;->a:LU/n0;

    .line 5
    .line 6
    iput-object p2, p0, LU/t;->b:Lw/i;

    .line 7
    .line 8
    iput-object p3, p0, LU/t;->c:Lw/z;

    .line 9
    .line 10
    iput-object p4, p0, LU/t;->d:Lie/a;

    .line 11
    .line 12
    new-instance p1, LU/t$a;

    .line 13
    .line 14
    invoke-direct {p1, p0}, LU/t$a;-><init>(LU/t;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LU/t;->f:LD0/a;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a()LD0/a;
    .locals 1

    .line 1
    iget-object v0, p0, LU/t;->f:LD0/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LU/t;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Lw/z;
    .locals 1

    .line 1
    iget-object v0, p0, LU/t;->c:Lw/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lw/i;
    .locals 1

    .line 1
    iget-object v0, p0, LU/t;->b:Lw/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lie/a;
    .locals 1

    .line 1
    iget-object v0, p0, LU/t;->d:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getState()LU/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LU/t;->a:LU/n0;

    .line 2
    .line 3
    return-object v0
.end method
