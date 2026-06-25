.class public final Lg6/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements La6/d;


# instance fields
.field private final a:Lr6/a;


# direct methods
.method public constructor <init>(Lr6/a;)V
    .locals 1

    .line 1
    const-string v0, "animatedDrawableBackend"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg6/a;->a:Lr6/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr6/a;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/a;->a:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
