.class public final LW/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LC/P;


# instance fields
.field private final b:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LC/P;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LW/e;->b:LY/C0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Li1/d;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LW/e;->e()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LC/P;->a(Li1/d;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(Li1/d;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LW/e;->e()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LC/P;->b(Li1/d;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public c(Li1/d;Li1/t;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LW/e;->e()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, LC/P;->c(Li1/d;Li1/t;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public d(Li1/d;Li1/t;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LW/e;->e()LC/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, LC/P;->d(Li1/d;Li1/t;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final e()LC/P;
    .locals 1

    .line 1
    iget-object v0, p0, LW/e;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC/P;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f(LC/P;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW/e;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
