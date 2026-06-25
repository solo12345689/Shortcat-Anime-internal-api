.class public final La1/c0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:La1/W;

.field private final b:La1/M;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(La1/W;La1/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La1/c0;->a:La1/W;

    .line 5
    .line 6
    iput-object p2, p0, La1/c0;->b:La1/M;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, La1/c0;->a:La1/W;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La1/W;->g(La1/c0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, La1/c0;->a:La1/W;

    .line 2
    .line 3
    invoke-virtual {v0}, La1/W;->a()La1/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final c(Lr0/h;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La1/c0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La1/c0;->b:La1/M;

    .line 8
    .line 9
    invoke-interface {v1, p1}, La1/M;->d(Lr0/h;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return v0
.end method

.method public final d(La1/U;La1/U;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La1/c0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La1/c0;->b:La1/M;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2}, La1/M;->f(La1/U;La1/U;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return v0
.end method

.method public final e(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, La1/c0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La1/c0;->b:La1/M;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    move-object v5, p4

    .line 13
    move-object v6, p5

    .line 14
    move-object v7, p6

    .line 15
    invoke-interface/range {v1 .. v7}, La1/M;->c(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return v0
.end method
