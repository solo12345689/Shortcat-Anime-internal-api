.class public Lx6/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx6/x;


# instance fields
.field private final a:Lx6/x;

.field private final b:Lx6/z;


# direct methods
.method public constructor <init>(Lx6/x;Lx6/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx6/u;->a:Lx6/x;

    .line 5
    .line 6
    iput-object p2, p0, Lx6/u;->b:Lx6/z;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/u;->a:Lx6/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx6/x;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/Object;LC5/a;)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/u;->b:Lx6/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx6/z;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx6/u;->a:Lx6/x;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lx6/x;->c(Ljava/lang/Object;LC5/a;)LC5/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public f(Ly5/l;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/u;->a:Lx6/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx6/x;->f(Ly5/l;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(Ly5/l;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/u;->a:Lx6/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx6/x;->g(Ly5/l;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public get(Ljava/lang/Object;)LC5/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lx6/u;->a:Lx6/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx6/x;->get(Ljava/lang/Object;)LC5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lx6/u;->b:Lx6/z;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Lx6/z;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lx6/u;->b:Lx6/z;

    .line 16
    .line 17
    invoke-interface {v1, p1}, Lx6/z;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
